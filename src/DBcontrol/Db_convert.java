
package DBcontrol;

import Bean.Convert;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Db_convert {
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("yyyy-MM-dd" ,Locale.ENGLISH);
    private Statement stmt;

    public Statement getStmt() {
        return stmt;
    }
    public Db_convert() throws SQLException{        
        stmt = MySQLConnect.con.createStatement();
    }
    public String getRunningNumber(){
        try {
//            String sql = "select max(substring(R_No,4,6)) as xxx from htranout";
            String sql = "select T_NO as xxx from branch";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                int rrr = 0;
                try {
                    rrr = Integer.parseInt(rs.getString(1));
                } catch (Exception e) {
                    rrr = 0;
                }
                rrr+=1;
                if(rrr<10){
                    return "00000"+rrr;
                }else if(rrr<100){
                    return "0000"+rrr;
                }else if(rrr<1000){
                    return "000"+rrr;
                }else if(rrr<10000){
                    return "00"+rrr;
                }else if(rrr<100000){
                    return "0"+rrr;
                }else{
                    return ""+rrr;
                }
            }else{
                return "000001";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "000001";
        }
    }
    public ArrayList<Convert> getDetailConvert(String r_no){
        ArrayList<Convert> arr = new ArrayList<Convert>();
        try {
            String sql = "select * from `convert` where r_no='"+r_no+"' order by r_que";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);            
            while(rs.next()){
                Convert c = new Convert();
                c.setR_no(rs.getString("r_no"));
                c.setR_que(rs.getString("r_que"));
                c.setR_pcode(rs.getString("r_pcode"));
                c.setR_type(rs.getString("r_type"));
                c.setR_qty(rs.getFloat("r_qty"));
                c.setR_post(rs.getString("r_post"));
                c.setR_price(rs.getFloat("r_price"));
                c.setR_amount(rs.getFloat("r_amount"));
                c.setR_user(rs.getString("r_user"));
                c.setR_time(rs.getString("r_time"));
                c.setR_entrydate(rs.getDate("r_entrydate"));
                arr.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

    public int maxRque(String rno){
        int maxrque=0;
        try {
            String sql = "select max(r_que)+1 as max from `convert` "
                    + "where r_no='"+rno+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                maxrque = Integer.parseInt(rs.getString("max"));
            }
        } catch (Exception e) {
            maxrque = 1;
        }
        return maxrque;
    }
    public int maxRqueNew(String rno){
        int maxrque=0;
        try {
            String sql = "select max(r_que)+1 as max from `convert` "
                    + "where r_no='"+rno+"' and r_type='CON+'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                maxrque = Integer.parseInt(rs.getString("max"));
            }
        } catch (Exception e) {
            maxrque = 1;
        }
        return maxrque;
    }
    
    public boolean insert(Convert row){
        String sql = "INSERT INTO `convert` " +
                "VALUES ("+
                "'"+row.getR_no()+"'"+ ","+
                ""+row.getR_que()+","+
                "'"+row.getR_pcode()+"'"+","+
                "'"+row.getR_type()+"'"+ ","+
                "'"+row.getR_stock()+"'"+ ","+
                row.getR_qty()+ ","+
                "'"+row.getR_post()+"'"+ ","+
                row.getR_price()+ ","+
                row.getR_amount()+ ","+
                "'"+row.getR_user()+"'"+ ","+
                "'"+row.getR_time()+"'"+ ","+
                "'"+dateFmtShow.format(row.getR_entrydate())+"'"+ ")";

        System.out.println(sql);
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
            System.out.println(result);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "SQL: "+ex.getMessage());
        }
                        
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean update(Convert row){
        String sql = "UPDATE `convert` " +
                "SET " +
                "r_pcode=" +"'"+row.getR_pcode()+"'"+ " , " +
                "r_type='"+row.getR_type()+"',"+
                "r_qty=" +row.getR_qty()+ " , " +
                "r_post=" +"'"+row.getR_post()+"'"+ " , " +
                "r_price=" +row.getR_price()+ " , " +
                "r_amount=" +row.getR_amount()+ " , " +
                "r_user=" +"'"+row.getR_user()+"'"+ " , " +
                "r_time=" +"'"+row.getR_time()+"'"+ " , " +
                "r_entrydate=" +"'"+dateFmtShow.format(row.getR_entrydate())+"' "+
                "WHERE r_no="+"'"+row.getR_no()+"' and r_pcode='"+row.getR_pcode()+"' "
                + "and r_que="+row.getR_que();
        System.out.println(sql);
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
            System.out.println("Result = " + result);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                        
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean delete(String r_no, int que){
        String sql = "DELETE FROM `convert`" +
                "  WHERE r_no = '"+r_no+"'"+" AND "+"r_que = "+que;
        System.out.println(sql);
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
            System.out.println("Result = " + result);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                        
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean delete2(String r_no, String pcode){
        String sql = "DELETE FROM `convert`" +
                "  WHERE r_no = '"+r_no+"'"+" AND "+"r_pcode = '"+pcode+"'";
        System.out.println(sql);
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
            System.out.println("Result = " + result);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean seek(String r_no){
        String sql = "SELECT r_no FROM `convert` WHERE r_no='"+r_no+"'";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs != null) {
                if (rs.next()) {
                    System.out.println("SEEK = true");
                    return true;
                } else {
                    return false;
                }
            } else
                return false;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean seek(String r_no, String pcode, String que){
        String sql = "SELECT r_no FROM `convert` "
                + "WHERE r_no='"+r_no+"' and r_pcode='"+pcode+"' and r_que="+que;
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs != null) {
                if (rs.next()) {
                    System.out.println("SEEK = true");
                    return true;
                } else {
                    return false;
                }
            } else
                return false;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    private Convert getRecordAt(String r_no , int que){
        ResultSet rs;
        String sql;
        Convert hrb = new Convert();
        try {
            sql = "SELECT * FROM `convert` WHERE r_no='"+r_no+"' AND r_que="+que;
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                
                while(rs.next()){
   
                }
                return hrb;
                
            } else
                return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public int getQueMax() {
        return 0;
    }
    
    
}
