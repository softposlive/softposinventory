/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBcontrol;

import Bean.Product;
import program.PUtility;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import utilities.ThaiUtil;

/**
 *
 * @author root
 */
public class Db_product {
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("yyyy-MM-dd" ,Locale.ENGLISH);
    private Statement stmt;

    public Statement getStmt() {
        return stmt;
    }
    public Db_product(){
        try {
            stmt = MySQLConnect.con.createStatement();
        } catch (Exception e) {
        }
    }
    
    public boolean insert(Product row){
        String sql = "INSERT INTO product " +
                "VALUES ("+
                "'"+row.getPcode()+"'"+ ","+
                "'"+row.getPreferent()+"'"+ ","+
                "'"+row.getPaccno()+"'"+ ","+
                "'"+row.getPgroup()+"'"+ ","+
                "'"+row.getPvender()+"'"+ ","+
                "'"+row.getPtype()+"'"+ ","+
                "'"+row.getPnormal()+"'"+ ","+
                "'"+row.getPremark()+"'"+ ","+
                "'"+row.getPdiscount()+"'"+ ","+
                "'"+row.getPservice()+"'"+ ","+
                "'"+row.getPstatus()+"'"+ ","+
                "'"+row.getPstock()+"'"+ ","+
                "'"+row.getPset()+"'"+ ","+
                "'"+row.getPvat()+"'"+ ","+
                "'"+row.getPdesc()+"'"+ ","+
                "'"+row.getPunit1()+"'"+ ","+
                row.getPpack1()+ ","+
                "'"+row.getParea()+"'"+ ","+
                "'"+row.getPkic()+"'"+ ","+
                row.getPprice11()+ ","+
                row.getPprice12()+ ","+
                row.getPprice13()+ ","+
                row.getPprice14()+ ","+
                row.getPprice15()+ ","+
                "'"+row.getPpromotion1()+"'"+ ","+
                "'"+row.getPpromotion2()+"'"+ ","+
                "'"+row.getPpromotion3()+"'"+ ","+
                row.getPmax()+ ","+
                row.getPmin()+ ","+
                "'"+row.getPbunit()+"'"+ ","+
                row.getPbpack()+ ","+
                row.getPlcost()+ ","+
                row.getPscost()+ ","+
                row.getPacost()+ ","+
                "'"+row.getPlink1()+"'"+ ","+
                "'"+row.getPlink2()+"'"+ ","+
                "'"+dateFmtShow.format(row.getPlastupdate())+"'"+ ","+
                "'"+row.getPlasttime()+"'"+ ","+
                "'"+row.getPuserupdate()+"'"+ ","+
                "'"+row.getPactive()+"'"+ ","+
                "'"+row.getPbarcode()+"'"+ ","+
                "'"+row.getPfoodtype()+"'"+ ")";
        
                System.out.println(sql);
                
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            PUtility.ShowError(ex.getMessage());
        }
                        
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isExistConvert(String pcode){
        boolean isExist = false;
        try {
            String sql = "select * from pingedent where pcode='"+pcode+"'";
            Statement s = MySQLConnect.con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                isExist = true;
            }
            rs.close();
            s.close();
        } catch (Exception e) {
        }

        return isExist;
    }
    public boolean update(Product row){
        String sql = "UPDATE product " +
                "SET " +
                "preferent ="+"'"+row.getPreferent()+"'"+ ","+
                "paccno ="+"'"+row.getPaccno()+"'"+ ","+
                "pgroup ="+"'"+row.getPgroup()+"'"+ ","+
                "pvender ="+"'"+row.getPvender()+"'"+ ","+
                "ptype ="+"'"+row.getPtype()+"'"+ ","+
                "pnormal ="+"'"+row.getPnormal()+"'"+ ","+
                "premark ="+"'"+row.getPremark()+"'"+ ","+
                "pdiscount ="+"'"+row.getPdiscount()+"'"+ ","+
                "pservice ="+"'"+row.getPservice()+"'"+ ","+
                "pstatus ="+"'"+row.getPstatus()+"'"+ ","+
                "pstock ="+"'"+row.getPstock()+"'"+ ","+
                "pset ="+"'"+row.getPset()+"'"+ ","+
                "pvat ="+"'"+row.getPvat()+"'"+ ","+
                "pdesc ="+"'"+row.getPdesc()+"'"+ ","+
                "punit1 ="+"'"+row.getPunit1()+"'"+ ","+
                "ppack1 ="+row.getPpack1()+ ","+
                "parea ="+"'"+row.getParea()+"'"+ ","+
                "pkic ="+"'"+row.getPkic()+"'"+ ","+
                "pprice11 ="+row.getPprice11()+ ","+
                "pprice12 ="+row.getPprice12()+ ","+
                "pprice13 ="+row.getPprice13()+ ","+
                "pprice14 ="+row.getPprice14()+ ","+
                "pprice15 ="+row.getPprice15()+ ","+
                "ppromotion1 ="+"'"+row.getPpromotion1()+"'"+ ","+
                "ppromotion2 ="+"'"+row.getPpromotion2()+"'"+ ","+
                "ppromotion3 ="+"'"+row.getPpromotion3()+"'"+ ","+
                "pmax ="+row.getPmax()+ ","+
                "pmin ="+row.getPmin()+ ","+
                "pbunit ="+"'"+row.getPbunit()+"'"+ ","+
                "pbpack ="+row.getPbpack()+ ","+
                "plcost ="+row.getPlcost()+ ","+
                "pscost ="+row.getPscost()+ ","+
                "pacost ="+row.getPacost()+ ","+
                "plink1 ="+"'"+row.getPlink1()+"'"+ ","+
                "plink2 ="+"'"+row.getPlink2()+"'"+ ","+
                "plastupdate ="+"'"+dateFmtShow.format(row.getPlastupdate())+"'"+ ","+
                "plasttime ="+"'"+row.getPlasttime()+"'"+ ","+
                "puserupdate ="+"'"+row.getPuserupdate()+"'"+ ","+
                "pactive ="+"'"+row.getPactive()+"'"+ ","+
                "pbarcode ="+"'"+row.getPbarcode()+"'"+ ","+
                "pfoodtype ="+"'"+row.getPfoodtype()+"'"+ 
                
                "WHERE pcode="+"'"+row.getPcode()+"'";
        
        System.out.println(sql);
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
            System.out.println("Result = " + result);
        } catch (SQLException ex) {
            PUtility.ShowError(ex.getMessage());
        }
                        
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean seek(String pcode){
        String sql = "SELECT * FROM product WHERE pcode='"+pcode+"'";
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
            PUtility.ShowError(ex.getMessage());
            return false;
        }
    }

     public boolean seek(String pcode, char pstock){
        String sql = "SELECT * FROM product WHERE pcode='"+pcode+"'"+" AND pstock = '"+pstock+"'";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs != null) {
                if (rs.next()) {
                    System.out.println("SEEK");
                    return true;
                } else {
                    return false;
                }
            } else
                return false;
        } catch (SQLException ex) {
            PUtility.ShowError(ex.getMessage());
            return false;
        }
    }
    
    public boolean seek(String pcode, char pstock,char pactive){
        String sql = "SELECT * FROM product WHERE pcode='"+pcode+"'"+" AND pstock = '"+pstock+"' "
                + "AND pactive='"+pactive+"'";
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
            PUtility.ShowError(ex.getMessage());
            return false;
        }
    }
    
    public Product getRecordAt(String key){
        ResultSet rs;
        String sql;
        Product  hrb = new Product();
        try {
            sql = "SELECT * FROM product WHERE pcode='"+key+"'";
            //JOptionPane.showMessageDialog(new Frame(), sql);
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                
                while(rs.next()){
                    hrb.setPcode(rs.getString("pcode"));
                    hrb.setPreferent(rs.getString("preferent"));
                    hrb.setPaccno(rs.getString("paccno"));
                    hrb.setPgroup(rs.getString("pgroup"));
                    hrb.setPvender(rs.getString("pvender"));
                    hrb.setPtype(rs.getString("ptype"));
                    hrb.setPnormal(rs.getString("pnormal"));
                    hrb.setPremark(ThaiUtil.ASCII2Unicode(rs.getString("premark")));
                    hrb.setPdiscount(rs.getString("pdiscount"));
                    hrb.setPservice(rs.getString("pservice"));
                    hrb.setPstatus(rs.getString("pstatus"));
                    hrb.setPstock(rs.getString("pstock"));
                    hrb.setPset(rs.getString("pset"));
                    hrb.setPvat(rs.getString("pvat"));
                    hrb.setPdesc(ThaiUtil.ASCII2Unicode(rs.getString("pdesc")));
                    hrb.setPunit1(ThaiUtil.ASCII2Unicode(rs.getString("punit1")));
                    hrb.setPpack1(rs.getInt("ppack1"));
                    hrb.setParea(rs.getString("parea"));
                    hrb.setPkic(rs.getString("pkic"));
                    hrb.setPprice11(rs.getFloat("pprice11"));
                    hrb.setPprice12(rs.getFloat("pprice12"));
                    hrb.setPprice13(rs.getFloat("pprice13"));
                    hrb.setPprice14(rs.getFloat("pprice14"));
                    hrb.setPprice15(rs.getFloat("pprice15"));
                    hrb.setPpromotion1(rs.getString("ppromotion1"));
                    hrb.setPpromotion2(rs.getString("ppromotion2"));
                    hrb.setPpromotion3(rs.getString("ppromotion3"));
                    hrb.setPmax(rs.getFloat("pmax"));
                    hrb.setPmin(rs.getFloat("pmin"));
                    hrb.setPbunit(rs.getString("pbunit"));
                    hrb.setPbpack(rs.getFloat("pbpack"));
                    hrb.setPlcost(rs.getFloat("plcost"));
                    hrb.setPscost(rs.getFloat("pscost"));
                    hrb.setPacost(rs.getFloat("pacost"));
                    hrb.setPlink1(rs.getString("plink1"));
                    hrb.setPlink2(rs.getString("plink2"));
                    //hrb.setPlastupdate(rs.getDate("plastupdate"));
                    //hrb.setPlasttime(rs.getTime("plasttime"));                 
                    hrb.setPactive(rs.getString("pactive"));
                    hrb.setPbarcode(rs.getString("pbarcode"));
                    hrb.setPfoodtype(rs.getString("pfoodtype"));
                    
                }
                return hrb;
                
            } else
                return null;
        } catch (SQLException ex) {
            PUtility.ShowError(ex.getMessage());
            return null;
        }
    }
    
  public boolean insertPSet(String code,String[] subCode,String[] qty) {
        String sql = "";
        int result = -1;
        
        try {   
            for(int i = 0;i<subCode.length;i++){
                 int number = Integer.parseInt(qty[i]);
                 sql = "INSERT INTO pset values('" +code+ "','" +subCode[i]+ "'," +number+ ")";
                System.out.println(sql);
                result = stmt.executeUpdate(sql);
            }      
           
        } catch (SQLException ex) {
            ex.printStackTrace();
            PUtility.ShowError(ex.getMessage());
        }

        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
     public boolean remove(String PCode) {
         
        if(!checkRemoveProduct(PCode)){
            String sql = "Delete From product where PCode = '"+PCode+"'";
                int result = -1;
                try {
                    result = stmt.executeUpdate(sql);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                if (result > 0) {
                    removePset(PCode);
                    return true;
                } else {
                    return false;
                }
        }else{
            return false;
        }                
    }

     public void updateProduct(String pcode, String yORn, int qty){
         try {
             String sql = "update product set " +
                     "psetselect='"+yORn+"'," +
                     "psetselectqty='"+qty+"' " +
                     "where pcode='"+pcode+"'";
             Statement stmt = MySQLConnect.con.createStatement();
             int iSave = stmt.executeUpdate(sql);
             stmt.close();
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     }

     public boolean removePset(String PCode) {
        Statement stmt2 = null;         
        if(!checkRemoveProduct(PCode)){
            String sql = "Delete From pset where PCode = '"+PCode+"'";
            System.out.println(sql);
                int result = -1;
                try {
                    stmt2 = MySQLConnect.con.createStatement();
                    result = stmt2.executeUpdate(sql);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                if (result > 0) {
                    return true;
                } else {
                    return false;
                }
        }else{
            return false;
        }                
    }
     public boolean removePset(String PCode,String subCode) {
        Statement stmt2 = null;
        String sql = "Delete From pset " +
                "where PCode = '"+PCode+"' and PSubCode = '"+subCode+"'";
        System.out.println(sql);
            int result = -1;
            try {
                stmt2 = MySQLConnect.con.createStatement();
                result = stmt2.executeUpdate(sql);
            } catch (SQLException ex) {
                PUtility.ShowError(ex.getMessage());
            }
            if (result > 0) {
                return true;
            } else {
                return false;
            }
    }

 
    public boolean checkRemoveProduct(String PCode) {
        String sql = "SELECT R_PCode FROM adjstock WHERE R_PCode = '"+PCode+"' ";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs != null) {
                if (rs.next()) {                    
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            PUtility.ShowError(ex.getMessage());
            return false;
        }
    }
    public ArrayList<String> searchProduct(String pcode){
        ArrayList<String> arr = new ArrayList<String>();
        String sql = "SELECT pdesc FROM product WHERE pdesc like '"+pcode+"%' " +
                "order by pdesc";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                arr.add(rs.getString(1));
            }
            rs.close();
        } catch (SQLException ex) {
            PUtility.ShowError(ex.getMessage());
        }
        return arr;
    }
}
