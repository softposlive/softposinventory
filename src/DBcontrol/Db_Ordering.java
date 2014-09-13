package DBcontrol;

import Bean.CheckReceive;
import Bean.CheckReceiveDetail;
import program.PUtility;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Db_Ordering {
    private Statement stmt = null;

    public Db_Ordering() {
        try {
            stmt = MySQLConnect.con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Db_Ordering.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void enableFlag(String order_no, String flag, String ref){
        try {
            String sql = "update fgorderingbranch.order_topic set "
                    + "inv_receive='"+flag+"',r_no='"+ref+"' "
                    + "where order_no='"+order_no+"'";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            PUtility.ShowError(e.getMessage());
        }
    }
    public void enableFlag(String r_no){
        try {
            String sql = "update fgorderingbranch.order_topic set "
                    + "inv_receive='Y' "
                    + "where r_no='"+r_no+"'";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            PUtility.ShowError(e.getMessage());
        }
    }
    public void enableFlag(String ref, String flag){
        try {
            String sql = "update fgorderingbranch.order_topic set "
                    + "inv_receive='"+flag+"', r_no='' "
                    + "where r_no='"+ref+"' and inv_receive='L'";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            PUtility.ShowError(e.getMessage());
        }
    }
    public void stockFlag(String ref){
        try {
            String sql = "update fgorderingbranch.order_topic set "
                    + "inv_receive='Y' "
                    + "where r_no='"+ref+"' and inv_receive='L'";
            System.out.println("sql (stock): "+sql);
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            PUtility.ShowError(e.getMessage());
        }
    }
    public void saveTemp(String order_no, String product_id, String flag){
        try {
            String sql = "select * from temp_receive where " +
                    "order_no='"+order_no+"' and product_id='"+product_id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            sql = "insert into temp_receive values('"+order_no+"','"+product_id+"','"+flag+"')";
            if(rs.next()){
                sql = "update temp_receive set flag='"+flag+"' where " +
                        "order_no='"+order_no+"' and product_id='"+product_id+"'";
            }
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            PUtility.ShowError(e.getMessage());
        }
    }    
    public boolean loadTemp(String order_no, String product_id){
        boolean check = false;
        try {
            String sql = "select flag from temp_receive where " +
                    "order_no='"+order_no+"' and product_id='"+product_id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                if(rs.getString(1).equals("N")){
                    check = false;
                }else{
                    check = true;
                }
            }
        } catch (Exception e) {
            PUtility.ShowError(e.getMessage());
        }
        return check;
    }
    
    public ArrayList<CheckReceive> getDataReceive(String fcode, String date1, String date2){
        ArrayList<CheckReceive> arr = new ArrayList<CheckReceive>();
        try {
            String sql = "select * from fgorderingbranch.order_topic o "
                    + "inner join fgorderingbranch.doctype d on " +
                    "o.doctype_id=d.doctype_id "
                    + "where factory_code='"+fcode+"' "
                    + "and o.order_receivedate between '"+date1+"' and '"+date2+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                CheckReceive bean = new CheckReceive();
                bean.setOrder_no(rs.getString("order_no"));
                bean.setDotype_id(rs.getString("o.doctype_id"));
                bean.setOrder_round(rs.getString("order_round"));
                bean.setOrder_user(rs.getString("order_user"));
                bean.setOrder_date(rs.getString("order_date"));
                bean.setBranch_code(rs.getString("branch_code"));
                bean.setOrder_receivedate(rs.getString("order_receivedate"));
                bean.setOrder_status(rs.getString("order_status"));
                bean.setOrder_send(rs.getString("inv_receive"));
                bean.setDt_receive(rs.getString("inv_receive"));
                bean.setRno(rs.getString("r_no"));
                bean.setDoctype_desc(rs.getString("d.doctype_name"));
                
                arr.add(bean);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return arr;
    }
    public CheckReceive getDataReceiveBy(String order_no){
        CheckReceive bean = new CheckReceive();        
        try {
            String sql = "select * from fgorderingbranch.order_topic " +
                    "where order_no='"+order_no+"'";
            ResultSet rs = stmt.executeQuery(sql);            
            if(rs.next()){                
                bean.setOrder_no(rs.getString("order_no"));
                bean.setDotype_id(rs.getString("doctype_id"));
                bean.setOrder_round(rs.getString("order_round"));
                bean.setOrder_user(rs.getString("order_user"));
                bean.setOrder_date(rs.getString("order_date"));
                bean.setBranch_code(rs.getString("branch_code"));
                bean.setOrder_receivedate(rs.getString("order_receivedate"));
                bean.setOrder_status(rs.getString("order_status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return bean;
    }
    public ArrayList<CheckReceiveDetail> getDataReceiveBy(String []order_no){
        ArrayList<CheckReceiveDetail> arr = new ArrayList<CheckReceiveDetail>();        
        try {
            String sql = "select od.order_no, od.product_id, orderdetail_qty, product_description, " +
                    "m.pcode, unit_description, reserve, m.pdesc " +
                    "from fgorderingbranch.orderdetail od inner join fgorderingbranch.productfile p on " +
                    "od.product_id=p.product_id inner join fgorderingbranch.unitfile u " +
                    "on p.product_pluunit=u.unit_code inner join "+MySQLConnect.DATABASE+".product m on "
                    + "p.product_plucode=m.pcode ";
            if(order_no.length>0){
                sql+="where m.pstock='y' and m.pactive='y' and order_no='"+order_no[0]+"' ";
            }
            for(int i=1;i<order_no.length;i++){
                sql+="or order_no='"+order_no[i]+"' ";
            }
            System.out.println("SQL: "+sql);
            ResultSet rs = stmt.executeQuery(sql);            
            while(rs.next()){         
                CheckReceiveDetail bean = new CheckReceiveDetail();
                bean.setDoctype(rs.getString("od.order_no"));
                bean.setProduct_id(rs.getString("m.pcode"));
                bean.setOrderdetail_qty(rs.getInt("orderdetail_qty"));
                bean.setProduct_desc(rs.getString("m.pdesc"));
                bean.setUnit(rs.getString("unit_description"));
                bean.setPrice("");
                bean.setReserve(rs.getString("reserve"));
                
                arr.add(bean);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return arr;
    }    
    
    public ArrayList<CheckReceiveDetail> getDataReceiveDetail(String order_no){
        ArrayList<CheckReceiveDetail> arr = new ArrayList<CheckReceiveDetail>();
        try {
            String sql = "select od.product_id, orderdetail_qty, product_description, " +
                    "product_plucode, unit_description, reserve " +
                    "from fgorderingbranch.orderdetail od inner join fgorderingbranch.productfile p on " +
                    "od.product_id=p.product_id inner join fgorderingbranch.unitfile u " +
                    "on p.product_pluunit=u.unit_code inner join "+MySQLConnect.DATABASE+".product m on "
                    + "p.product_plucode=m.pcode " +
                    "where order_no='"+order_no+"' and m.pstock='y' and m.pactive='y'";
//            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                CheckReceiveDetail bean = new CheckReceiveDetail();
                bean.setProduct_id(rs.getString("product_plucode"));
                bean.setOrderdetail_qty(rs.getInt("orderdetail_qty"));
                bean.setProduct_desc(rs.getString("product_description"));
                bean.setUnit(rs.getString("unit_description"));
                bean.setReserve(rs.getString("reserve"));
                
                arr.add(bean);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return arr;
    }

    public boolean updateRno(String r_no, String []order_no) {
        boolean hasFG = false;
        try {
            String sql = "update fgorderingbranch.order_topic " +
                    "set r_no = '"+r_no+"' "
                    + "where 1 and order_no='"+order_no[0]+"' ";
            for(int i=1;i<order_no.length;i++){
                sql+="or order_no = '"+order_no[i]+"' ";
            }
            stmt.executeUpdate(sql);
            hasFG = true;
        } catch (Exception e) {
            System.out.println("FG-Ordering database not found!");
            hasFG = false;
        }

        return hasFG;
    }
    public boolean seek_FGDatabase() {
        boolean hasFG = false;
        try {
            String sql = "select * from fgorderingbranch.order_topic";
            stmt.executeQuery(sql);
            hasFG = true;
        } catch (Exception e) {
            System.out.println("FG-Ordering database not found!");
            hasFG = false;
        }

        return hasFG;
    }
}














