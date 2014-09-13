/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBcontrol;


import Bean.Htranout;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author root
 */
public class Db_htranout {
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("yyyy-MM-dd" ,Locale.ENGLISH);
    private Statement stmt;

    public Statement getStmt() {
        return stmt;
    }
    public Db_htranout() throws SQLException{        
        stmt = MySQLConnect.con.createStatement();
    }

    public String getRunningNumber(){
        try {
//            String sql = "select max(substring(R_No,4,6)) as xxx from htranout";
            String sql = "select TO_NO as xxx from branch";
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

    public boolean insert(Htranout row){
        String sql = "INSERT INTO htranout (R_No, R_Date, R_Bran, R_Remark, R_Total, R_User, R_Post)" +
                "VALUES ("+
                "'"+row.getR_no()+"'"+ ","+
                "'"+dateFmtShow.format(row.getR_date())+"'"+ ","+
                "'"+row.getR_bran()+"'"+ ","+
                "'"+row.getR_remark()+"'"+ ","+
                row.getR_total()+ ","+
                "'"+row.getR_user()+"'"+ ","+
                "'"+row.getR_post()+"'"+ ")";
                System.out.println(sql);
                
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
            stmt.executeUpdate("update branch set TO_NO = TO_NO+1;");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                        
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean update(Htranout row){
        String sql = "UPDATE htranout " +
                "SET " +
                "r_date=" +"'"+dateFmtShow.format(row.getR_date())+"'"+ "," +
                "r_bran=" +"'"+row.getR_bran()+"'"+ " , " +
                "r_remark=" +"'"+row.getR_remark()+"'"+ " , " +
                "r_total=" +row.getR_total()+ " , " +
                "r_user=" +"'"+row.getR_user()+"'"+ " , " +
                "r_post=" +"'"+row.getR_post()+"'"+ 
                " WHERE r_no="+"'"+row.getR_no()+"'";
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
        String sql = "SELECT r_no FROM htranout WHERE r_no='"+r_no+"'";
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
    
    public boolean seek(String r_no , String r_post){
        String sql = "SELECT r_no FROM htranout WHERE r_no='"+r_no+"' AND r_post= '"+r_post+"'";
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
    
    public Htranout getRecordAt(String r_no){
        ResultSet rs;
        String sql;
        Htranout hrb = new Htranout();
        try {
            sql = "SELECT * FROM htranout WHERE r_no='"+r_no+"'";
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                
                while(rs.next()){
                    hrb.setR_no(rs.getString("r_no"));
                    hrb.setR_date(rs.getDate("r_date"));
                    hrb.setR_bran(rs.getString("r_bran"));
                    hrb.setR_remark(rs.getString("r_remark"));
                    hrb.setR_total(rs.getInt("r_total"));
                    hrb.setR_user(rs.getString("r_user"));
                    hrb.setR_post(rs.getString("r_post"));
                    hrb.setR_userpost(rs.getString("r_userpost"));
                    hrb.setR_postdate(rs.getDate("r_postdate"));
                    hrb.setR_posttime(rs.getString("r_posttime"));
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
