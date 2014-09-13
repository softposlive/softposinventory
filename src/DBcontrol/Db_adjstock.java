
package DBcontrol;

import Bean.Adjstock;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Db_adjstock {
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("yyyy-MM-dd" ,Locale.ENGLISH);
    private Statement stmt;

    public Statement getStmt() {
        return stmt;
    }
    public Db_adjstock() throws SQLException{        
        stmt = MySQLConnect.con.createStatement();
    }

    public int maxRque(String rno){
        int maxrque=0;
        try {
            String sql = "select max(r_que)+1 as max from adjstock "
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
    
    public boolean insert(Adjstock row){
        String sql = "INSERT INTO adjstock " +
                "VALUES ("+
                "'"+row.getR_no()+"'"+ ","+
                row.getR_que()+ ","+
                "'"+row.getR_pcode()+"'"+ ","+
                row.getR_onhand()+ ","+
                row.getR_inhand()+ ","+
                "'"+row.getR_post()+"'"+ ","+
                row.getR_adj()+ ","+
                row.getR_price()+ ","+
                row.getR_amount()+ ","+
                "'"+row.getR_remark()+"'"+ ","+
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
        }
                        
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean update(Adjstock row){
        String sql = "UPDATE adjstock " +
                "SET " +
                "r_pcode=" +"'"+row.getR_pcode()+"'"+ " , " +
                "r_onhand=" +row.getR_onhand()+ " , " +
                "r_inhand=" +row.getR_inhand()+ " , " +
                "r_post=" +"'"+row.getR_post()+"'"+ " , " +
                "r_adj=" +row.getR_adj()+ " , " +
                "r_price=" +row.getR_price()+ " , " +
                "r_amount=" +row.getR_amount()+ " , " +
                "r_remark=" +"'"+row.getR_remark()+"'"+ " , " +
                
                
                "r_user=" +"'"+row.getR_user()+"'"+ " , " +
                "r_time=" +"'"+row.getR_time()+"'"+ " , " +
                "r_entrydate=" +"'"+dateFmtShow.format(row.getR_entrydate())+"'"+  " , " +

                "WHERE r_no="+"'"+row.getR_no()+"' AND r_que="+row.getR_que();
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
    public boolean delete(String r_no,int que){
        String sql = "DELETE FROM adjstock" +
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
        String sql = "DELETE FROM adjstock" +
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
        String sql = "SELECT r_no FROM adjstock WHERE r_no='"+r_no+"'";
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
    
    private Adjstock getRecordAt(String r_no , int que){
        ResultSet rs;
        String sql;
        Adjstock hrb = new Adjstock();
        try {
            sql = "SELECT * FROM adjstock WHERE r_no='"+r_no+"' AND r_que="+que;
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
    
    
}
