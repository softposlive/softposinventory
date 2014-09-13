/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBcontrol;

import Bean.Tranin;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author root
 */
public class Db_tranin {
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("yyyy-MM-dd" ,Locale.ENGLISH);
    private Statement stmt;

    public Statement getStmt() {
        return stmt;
    }
    public Db_tranin() throws SQLException{
        
        stmt = MySQLConnect.con.createStatement();
    }
    
    public boolean insert(Tranin row){
        String sql = "INSERT INTO tranin " +
                "VALUES ("+
                "'"+row.getR_no()+"'"+ ","+
                row.getR_que()+ ","+
                "'"+row.getR_pcode()+"'"+ ","+
                "'"+row.getR_stock()+"'"+ ","+
                row.getR_pack()+ ","+
                row.getR_qty()+ ","+
                "'"+row.getR_post()+"'"+ ","+
                "'"+row.getR_unit()+"'"+ ","+
                row.getR_cost()+ ","+
                row.getR_amount()+ ","+
                row.getR_totalqty()+ ","+
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
    
    public boolean update(Tranin row){
        String sql = "UPDATE tranin " +
                "SET " +
                "r_pcode=" +"'"+row.getR_pcode()+"'"+ " , " +
                "r_stock=" +"'"+row.getR_stock()+"'"+ " , " +
                "r_pack=" +row.getR_pack()+ " , " +
                "r_qty=" +row.getR_qty()+ " , " +
                "r_post=" +"'"+row.getR_post()+"'"+ " , " +
                "r_unit=" +"'"+row.getR_unit()+"'"+ " , " +
                "r_cost=" +row.getR_cost()+ " , " +
                "r_amount=" +row.getR_amount()+ " , " +
                "r_totalqty=" +row.getR_totalqty()+ " , " +
                
                
                "r_user=" +"'"+row.getR_user()+"'"+ " , " +
                "r_time=" +"'"+row.getR_time()+"'"+ " , " +
                "r_entrydate=" +"'"+dateFmtShow.format(row.getR_entrydate())+"' " +
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
        String sql = "DELETE FROM tranin" +
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
    
    public boolean seek(String r_no){
        String sql = "SELECT r_no FROM tranin WHERE r_no='"+r_no+"'";
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
    
    private Tranin getRecordAt(String r_no , int que){
        ResultSet rs;
        String sql;
        Tranin hrb = new Tranin();
        try {
            sql = "SELECT * FROM tranin WHERE r_no='"+r_no+"' AND r_que="+que;
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
