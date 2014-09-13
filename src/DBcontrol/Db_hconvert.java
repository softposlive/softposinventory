package DBcontrol;

import Bean.Hconvert;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Db_hconvert {
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("yyyy-MM-dd" ,Locale.ENGLISH);
    private Statement stmt;

    public Statement getStmt() {
        return stmt;
    }
    public Db_hconvert() throws SQLException{
        stmt = MySQLConnect.con.createStatement();
    }
    
    public boolean insert(Hconvert row){
        if(row.getRTotal()==0){
            return false;
        }
        String sql = "INSERT INTO hconvert(R_No ,R_Date ,R_Remark ,R_Total ,"
                + "R_User ,R_Post ,R_Userpost, R_PostTime)"
                + "VALUES ('"+row.getRNo()+"', "
                + "'"+dateFmtShow.format(row.getRDate())+"', '"+row.getRRemark()+"', "
                + row.getRTotal()+", "
                + "'"+row.getRUser()+"', 'N', '', "
                + "'00:00');";
                System.out.println(sql);
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
            System.out.println("Result = " + result);
            String updateNO = row.getRNo();
            if(updateNO.length()==10){
                ResultSet rs = stmt.executeQuery("select sum(T_NO)+1 from branch");
                if(rs.next()){
                    stmt.executeUpdate("update branch set T_NO="+rs.getString(1)+"");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                        
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {

    }

    
    public boolean update(Hconvert row){
        String sql = "UPDATE hconvert " +
                "SET " +
                "r_date=" +"'"+dateFmtShow.format(row.getRDate())+"'"+ "," +
                "r_remark=" +"'"+row.getRRemark()+"'"+ " , " +
                "r_total=" +row.getRTotal()+ " , " +
                "r_user=" +"'"+row.getRUser()+"'"+ " , " +
                "r_post=" +"'"+row.getRPost()+"'"+
                " WHERE r_no="+"'"+row.getRNo()+"'";
        System.out.println(sql);
        try {
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean seek(String r_no){
        String sql = "SELECT r_no FROM hconvert WHERE r_no='"+r_no+"'";
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
    
    public boolean seek(String r_no , String r_post){
        String sql = "SELECT r_no FROM hconvert WHERE r_no='"+r_no+"' AND r_post= '"+r_post+"'";
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
    
    public Hconvert getRecordAt(String r_no){
        ResultSet rs;
        String sql;
        Hconvert hrb = new Hconvert();
        try {
            sql = "SELECT * FROM hconvert WHERE r_no='"+r_no+"'";
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                
                while(rs.next()){
                    hrb.setRNo(rs.getString("r_no"));
                    hrb.setRDate(rs.getDate("r_date"));
                    hrb.setRRemark(rs.getString("r_remark"));
                    hrb.setRTotal(rs.getInt("r_total"));
                    hrb.setRUser(rs.getString("r_user"));
                    hrb.setRPost(rs.getString("r_post"));
                    hrb.setRUserpost(rs.getString("r_userpost"));
                    hrb.setRPostDate(rs.getDate("r_postdate"));
                    hrb.setRPostTime(rs.getString("r_posttime"));
                }
                return hrb;
                
            } else
                return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public ArrayList<Hconvert> getListConvert(String date1, String date2){
        ArrayList<Hconvert> arr = new ArrayList<Hconvert>();
        try {
            String sql = "select * from `hconvert` where 1 ";
            if(!date1.equals("")&&!date2.equals("")){
                sql+="and r_date between '"+date1+"' and '"+date2+"' ";
            }
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Hconvert hc = new Hconvert();
                hc.setRNo(rs.getString("r_no"));
                hc.setRDate(rs.getDate("r_date"));
                hc.setRRemark(rs.getString("r_remark"));
                //!
                hc.setRTotal(loadDetailCount(rs.getString("r_no")));
                hc.setRUser(rs.getString("r_user"));
                hc.setRPost(rs.getString("r_post"));
                hc.setRUserpost(rs.getString("r_userpost"));
                hc.setRPostDate(rs.getDate("r_postdate"));
                hc.setRPostTime(rs.getString("r_posttime"));

                arr.add(hc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
    private int loadDetailCount(String r_no){
        int count = 0;
        String sql = "select r_no from `convert` where r_no='"+r_no+"'";
        try {
            //JOptionPane.showMessageDialog(this, "KKK");
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            while(rs.next()){
                count++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL: "+ex.getMessage());
        }
        return count;
    }
}
