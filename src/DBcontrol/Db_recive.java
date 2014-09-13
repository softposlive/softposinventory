
package DBcontrol;

import Bean.Recive;
import program.PUtility;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Db_recive {
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("yyyy-MM-dd" ,Locale.ENGLISH);
    private Statement stmt;

    public Statement getStmt() {
        return stmt;
    }
    public Db_recive(){
        try {
            stmt = MySQLConnect.con.createStatement();            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public int getRQue(String r_no){
        try {
            String sql = "select max(R_que)+1 as max from recive "
                    + "where r_no='"+r_no+"'";
            ResultSet rs = stmt.executeQuery(sql);
            return rs.getInt("max");
        } catch (Exception e) {
            System.err.println("max error!");
            return 0;
        }
    }

    public ArrayList<String[]> getDataReceive(){
        ArrayList<String[]> arr = new ArrayList<String[]>();
        try {
            String sql = "SELECT R_No,R_PCode,R_Qty,R_Stock FROM recive " +
                    "WHERE R_Post='N'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String []data = new String[4];
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                
                arr.add(data);
            }
        } catch (Exception e) {
            PUtility.ShowError("SQL: "+e.getMessage());
        }
        
        return arr;
    }
    
    public boolean insert(Recive row){
        String sql = "INSERT INTO recive " +
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
                "'"+dateFmtShow.format(row.getR_entrydate())+"'"+ ","+
                row.getR_order()+ ","+
                row.getR_send()+ ","+
                "'"+row.getR_pono()+"'," +
                "'"+row.getDt_receive()+"')";
        
                System.out.println(sql);
                
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
            System.out.println(result);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL: "+ex.getMessage());
        }
                        
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean update(Recive row){
        String sql = "UPDATE recive " +
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
                "r_entrydate=" +"'"+dateFmtShow.format(row.getR_entrydate())+"'"+  " , " +
                "r_pono=" +"'"+row.getR_pono()+"' " +
                "WHERE r_no="+"'"+row.getR_no()+"' AND r_que="+row.getR_que();
        System.out.println(sql);
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            PUtility.ShowError("SQL: "+ex.getMessage());
        }
                        
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean delete(String r_no,int que){
        String sql = "DELETE FROM recive" +
                "  WHERE r_no = '"+r_no+"'"+" AND "+"r_que = "+que;
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            PUtility.ShowError("SQL: "+ex.getMessage());
        }
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
                    System.out.println("SEEK = true");
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
}
