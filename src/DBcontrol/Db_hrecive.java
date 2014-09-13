package DBcontrol;

import Bean.Hrecive;
import program.PUtility;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Db_hrecive {
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("yyyy-MM-dd" ,Locale.ENGLISH);
    private Statement stmt;

    public Statement getStmt() {
        return stmt;
    }
    public Db_hrecive(){
        try {
            stmt = MySQLConnect.con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Db_hrecive.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean insert(Hrecive row)throws SQLException{
        String sql = "INSERT INTO hrecive (R_No, R_Date, R_Bran, R_Remark, R_Total, "
                + "R_User, R_Post, dt_receive)" +
                "VALUES ("+
                "'"+row.getR_no()+"'"+ ","+
                "'"+dateFmtShow.format(row.getR_date())+"'"+ ","+
                "'"+row.getR_bran()+"'"+ ","+
                "'"+row.getR_remark()+"'"+ ","+
                row.getR_total()+ ","+
                "'"+row.getR_user()+"'"+ ","+
                "'"+row.getR_post()+"'"+ ","
                + "'"+row.getDoctype()+"')";
        int result = -1;        
        result = stmt.executeUpdate(sql);
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean update(Hrecive row)throws SQLException{
        String sql = "UPDATE hrecive " +
                "SET " +
                "r_date=" +"'"+dateFmtShow.format(row.getR_date())+"'"+ "," +
                "r_bran=" +"'"+row.getR_bran()+"'"+ " , " +
                "r_remark=" +"'"+row.getR_remark()+"'"+ " , " +
                "r_total=" +row.getR_total()+ " , " +
                "r_user=" +"'"+row.getR_user()+"'"+ " , " +
                "r_post=" +"'"+row.getR_post()+"', "
                + "dt_receive = '"+row.getDoctype()+"'"+
                " WHERE r_no="+"'"+row.getR_no()+"'";
        int result = -1;        
        result = stmt.executeUpdate(sql);
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean seek(String r_no){
        String sql = "SELECT r_no FROM hrecive WHERE r_no='"+r_no+"'";
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
            PUtility.ShowError("SQL: "+ex.getMessage());
            return false;
        }
    }
    
    public boolean seek(String r_no , String r_post){
        String sql = "SELECT r_no FROM hrecive WHERE r_no='"+r_no+"' AND r_post= '"+r_post+"'";
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
            PUtility.ShowError("SQL: "+ex.getMessage());
            return false;
        }
    }
    
    public Hrecive getRecordAt(String r_no){
        ResultSet rs;
        String sql;
        Hrecive hrb = new Hrecive();
        try {
            sql = "SELECT * FROM hrecive WHERE r_no='"+r_no+"'";
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
            PUtility.ShowError("SQL: "+ex.getMessage());
            return null;
        }
    }
    

}
