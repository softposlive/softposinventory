/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBcontrol;

import Bean.Stockfile;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utilities.ThaiUtil;

/**
 *
 * @author root
 */
public class Db_stockfile {
    private Statement stmt;

    public Statement getStmt() {
        return stmt;
    }
    public Db_stockfile() throws SQLException{        
        stmt = MySQLConnect.con.createStatement();
    }
    
    public boolean insert(Stockfile row){
        String sql = "INSERT INTO stockfile (stkcode, stkname)" +
                "VALUES ("+
                "'"+row.getStkcode()+"'"+ ","+
                "'"+row.getStkname()+"'"+ ")";
                System.out.println(sql);
                
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                        
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean update(Stockfile row){
        String sql = "UPDATE stockfile " +
                "SET " +
                "stkname=" +"'"+row.getStkcode()+"'"+ "," +
                "WHERE stkcode="+"'"+row.getStkname()+"'";
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
    
    public boolean seek(String stkcode){
        String sql = "SELECT stkcode FROM stockfile WHERE stkcode='"+stkcode+"'";
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
            ex.printStackTrace();
            return false;
        }
    }
    
    public Stockfile getRecordAt(String stkcode){
        ResultSet rs;
        String sql;
        Stockfile fb = new Stockfile();
        try {
            sql = "SELECT * FROM stockfile WHERE stkcode='"+stkcode+"'";
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                
                while(rs.next()){
                    fb.setStkcode(rs.getString("stkcode"));
                    fb.setStkname(ThaiUtil.ASCII2Unicode(rs.getString("stkname")));

                }
                return fb;
                
            } else
                return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List displayStockFile() {
        ResultSet rs;
        String sql;
        List stockfile = new ArrayList();
        try {
            sql = "SELECT * FROM stockfile";
            rs = stmt.executeQuery(sql);
            if (rs != null) {

                while (rs.next()) {
                    Stockfile fb = new Stockfile();
                    fb.setStkcode(rs.getString("stkcode"));
                    fb.setStkname(ThaiUtil.ASCII2Unicode(rs.getString("stkname")));
                    stockfile.add(fb);
                }
                return stockfile;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean remove(String stkCode) {

        String sql = "Delete From stockfile WHERE stkcode ='" + stkCode + "'";
        int result = -1;
        if (!checkStockFile(stkCode)) {//false
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
        } else {
            return false;
        }

    }

    public boolean checkStockFile(String stkcode) {

        String sql = "SELECT bstk FROM stkfile WHERE bstk='" + stkcode + "'";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs != null) {
                if (rs.next()) {
                    return true;//has

                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
