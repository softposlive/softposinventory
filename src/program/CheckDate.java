package program;

import DBcontrol.MySQLConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CheckDate {
    private boolean isEdit = false;
    private Statement stmt;

    public CheckDate(){
        try {
            stmt = MySQLConnect.con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CheckDate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Date getEndOfDayDate(){
        try {
            String sql = "select endofdaydate from branch";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                return rs.getDate(1);
            }else{
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public boolean validDate(Date dCheck){
        Date currentDate = new Date();
        Date dbDate = getEndOfDayDate();
        Date dateCheck = dCheck;
        if(dateCheck.compareTo(dbDate)<=0){
            JOptionPane.showMessageDialog(null, "ไม่สามารถเลือกวันที่นี้ได้ สาเหตุอาจเนื่องมากจาก:\n" +
                "ได้ปิดสิ้นวันไปแล้ว");
            isEdit = false;
        }else if(dateCheck.compareTo(currentDate)==1){
            JOptionPane.showMessageDialog(null, "ไม่สามารถเลือกวันที่นี้ได้ สาเหตุอาจเนื่องมากจาก:\n" +
                            "ระบุเป็นวันที่ล่วงหน้า");
            isEdit = false;
        }else{
            isEdit = true;
        }

        return isEdit;
    }
    public boolean validDate(Date dCheck, boolean isCheck){
        Date currentDate = new Date();
        Date dbDate = getEndOfDayDate();
        Date dateCheck = dCheck;
        if(dateCheck.compareTo(dbDate)<=0){
            isEdit = false;
        }else if(dateCheck.compareTo(currentDate)==1){
            isEdit = false;
        }else{
            isEdit = true;
        }

        return isEdit;
    }
    public static void main(String[] args) {
        CheckDate chk = new CheckDate();
        Calendar car = Calendar.getInstance();
        car.add(Calendar.DAY_OF_MONTH, +2);
        boolean valid = chk.validDate(car.getTime());
        if(valid){
            System.out.println("-----pass-----");
        }else{
            System.err.println("-----fail-----");
        }
    }
}
