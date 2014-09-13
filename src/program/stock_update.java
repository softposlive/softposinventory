package program;

import DBcontrol.MySQLConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public class stock_update {
    SimpleDateFormat SqlDateFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    SimpleDateFormat DateFmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    SimpleDateFormat TimeFmt = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
    
    public void stock_update() {
        
    }
    public int GetActionMon(Date EndofdayDate) {
        int RetVal = 0;
        SimpleDateFormat XYear = new SimpleDateFormat("yyyy", Locale.ENGLISH);
        SimpleDateFormat XMonth = new SimpleDateFormat("MM", Locale.ENGLISH);
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String LoadTableFile = "select *from company";
            ResultSet rec = stmt.executeQuery(LoadTableFile);
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                String TempYear = XYear.format(rec.getDate("accterm"));
                String TempMonth = XMonth.format(rec.getDate("accterm"));
                String CurYear = XYear.format(EndofdayDate);
                String CurMonth = XMonth.format(EndofdayDate);
                if (TempYear.equals(CurYear)) {
                    RetVal = Integer.parseInt(CurMonth) + 12;
                } else {
                    if (Integer.parseInt(CurYear) == Integer.parseInt(TempYear) - 1) {
                        RetVal = Integer.parseInt(CurMonth);
                    } else {
                        RetVal = 0;
                    }
                }
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return RetVal;
    }
    public Boolean SeekStkFile(String TempCode, String T_Stk) {
        Boolean RetVal = false;
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String LoadTableFile = "select *from stkfile where (bpcode='" + TempCode + "') and (bstk='" + T_Stk + "') ";
            ResultSet rec = stmt.executeQuery(LoadTableFile);
            rec.first();
            if (rec.getRow() == 0) {
                RetVal = false;
            } else {
                RetVal = true;
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return RetVal;

    }
    public void ProcessStockOut(String DocNo ,String StkCode,String PCode,Date TDate,String Stk_Remark,Double Qty,Double Amount,String UserPost) {
        Date date = new Date();
        String TempCode = PCode;
        Double TempQty = Qty;
        Double TempAmt = Amount;
        String T_Rem = Stk_Remark;
        Boolean StkProc = false;
        Boolean SetProc = false;
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select *from product where pcode='" + TempCode + "'";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                if (rec.getString("pstock").equals("Y")) {
                    StkProc = true;
                } else {
                    StkProc = false;
                }
                if (rec.getString("pset").equals("Y")) {
                    SetProc = true;
                } else {
                    SetProc = false;
                }
            }
            rec.close();
            stmt.close();
            if (StkProc) {
                Statement stmt2 = (Statement) MySQLConnect.con.createStatement();
                String InsertQuery = "insert into stcard (s_date,s_no,s_stk,s_pcode,s_que,s_in,s_incost," +
                        "s_out,s_outcost,s_rem,s_user,s_entrydate,s_entrytime) " +
                        "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement prm = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery);
                prm.setString(1, SqlDateFmt.format(TDate));
                prm.setString(2, DocNo);
                prm.setString(3, StkCode);
                prm.setString(4, TempCode);
                prm.setInt(5, 1);
                prm.setDouble(6, 0);
                prm.setDouble(7, 0);
                prm.setDouble(8, TempQty);
                prm.setDouble(9, TempAmt);
                prm.setString(10, T_Rem);
                prm.setString(11, UserPost); //User

                prm.setString(12, SqlDateFmt.format(date));
                prm.setString(13, TimeFmt.format(date));
                prm.executeUpdate();
                stmt2.close();
                int TempAct = GetActionMon(TDate);
                if (!SeekStkFile(TempCode, StkCode)) {
                    Statement stmt4 = (Statement) MySQLConnect.con.createStatement();
                    String InsertQuery4 = "insert into stkfile (bpcode,bstk) values (?,?)";
                    PreparedStatement prm4 = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery4);
                    prm4.setString(1, TempCode);
                    prm4.setString(2, StkCode);
                    prm4.executeUpdate();
                    stmt4.close();
                }
                for (int i = TempAct; i <= 24; i++) {
                    String T_Mon = "bqty" + String.valueOf(i);
                    Statement stmt4 = (Statement) MySQLConnect.con.createStatement();
                    String InsertQuery4 = "update stkfile set " + T_Mon + "=" + T_Mon + "-? where (bpcode=?) and (bstk=?)";
                    PreparedStatement prm4 = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery4);
                    prm4.setDouble(1, TempQty);
                    prm4.setString(2, TempCode);
                    prm4.setString(3, StkCode);
                    prm4.executeUpdate();
                    stmt4.close();
                }
            }
            if (SetProc) {
                ProcessSetUpdateStockOut(DocNo,StkCode,PCode,TDate,Stk_Remark,Qty,UserPost);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void ProcessSetUpdateStockOut(String DocNo,String StkCode,String XCode,Date TDate,String StkRemark,Double XQty,String UserPost) {
        Date date = new Date(); 
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SQLQuery = "select *from pset where pcode='" + XCode + "'";
            ResultSet rec = stmt.executeQuery(SQLQuery);
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                do {
                    String TempCode = rec.getString("psubcode");
                    Double TempQty = rec.getDouble("psubqty") * XQty;
                    Double TempAmt = 0.0;
                    String T_Rem = StkRemark;
                    Boolean StkProc = false;
                    Statement stmt3 = (Statement) MySQLConnect.con.createStatement();
                    String LoadTableFile = "select *from product where pcode='" + TempCode + "'";
                    ResultSet rec3 = stmt3.executeQuery(LoadTableFile);
                    rec3.first();
                    if (rec3.getRow() == 0) {
                    } else {
                        if (rec3.getString("pstock").equals("Y")) {
                            StkProc = true;
                        } else {
                            StkProc = false;
                        }
                        TempAmt = rec3.getDouble("pprice11") * XQty;
                    }
                    rec3.close();
                    stmt3.close();
                    if (StkProc) {
                        Statement stmt2 = (Statement) MySQLConnect.con.createStatement();
                        String InsertQuery = "insert into stcard (s_date,s_no,s_stk,s_pcode,s_que,s_in,s_incost," +
                                "s_out,s_outcost,s_rem,s_user,s_entrydate,s_entrytime) " +
                                "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement prm = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery);
                        prm.setString(1, SqlDateFmt.format(TDate));
                        prm.setString(2, "@" + XCode);
                        prm.setString(3, StkCode);
                        prm.setString(4, TempCode);
                        prm.setInt(5, 1);
                        prm.setDouble(6, 0);
                        prm.setDouble(7, 0);
                        prm.setDouble(8, TempQty);
                        prm.setDouble(9, TempAmt);
                        prm.setString(10, T_Rem);
                        prm.setString(11, ""); //User

                        prm.setString(12, SqlDateFmt.format(date));
                        prm.setString(13, TimeFmt.format(date));
                        prm.executeUpdate();
                        stmt2.close();
                        int TempAct = GetActionMon(TDate);
                        if (!SeekStkFile(TempCode, StkCode)) {
                            Statement stmt4 = (Statement) MySQLConnect.con.createStatement();
                            String InsertQuery4 = "insert into stkfile (bpcode,bstk) values (?,?)";
                            PreparedStatement prm4 = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery4);
                            prm4.setString(1, TempCode);
                            prm4.setString(2, StkCode);
                            prm4.executeUpdate();
                            stmt4.close();
                        }
                        for (int i = TempAct; i <= 24; i++) {
                            String T_Mon = "bqty" + String.valueOf(i);
                            Statement stmt4 = (Statement) MySQLConnect.con.createStatement();
                            String InsertQuery4 = "update stkfile set " + T_Mon + "=" + T_Mon + "-? where (bpcode=?) and (bstk=?)";
                            PreparedStatement prm4 = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery4);
                            prm4.setDouble(1, TempQty);
                            prm4.setString(2, TempCode);
                            prm4.setString(3, StkCode);
                            prm4.executeUpdate();
                            stmt4.close();
                        }
                    }
                } while (rec.next());
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void ProcessStockIn(String DocNo ,String StkCode,String PCode,Date TDate,String Stk_Remark,Double Qty,Double Amount,String UserPost) {
        Date date = new Date();
        String TempCode = PCode;
        Double TempQty = Qty;
        Double TempAmt = Amount;
        String T_Rem = Stk_Remark;
        Boolean StkProc = false;
        Boolean SetProc = false;
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select *from product where pcode='" + TempCode + "'";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                if (rec.getString("pstock").equals("Y")) {
                    StkProc = true;
                } else {
                    StkProc = false;
                }
                if (rec.getString("pset").equals("Y")) {
                    SetProc = true;
                } else {
                    SetProc = false;
                }
            }
            rec.close();
            stmt.close();
            if (StkProc) {
                Statement stmt2 = (Statement) MySQLConnect.con.createStatement();
                String InsertQuery = "insert into stcard (s_date,s_no,s_stk,s_pcode,s_que,s_in,s_incost," +
                        "s_out,s_outcost,s_rem,s_user,s_entrydate,s_entrytime) " +
                        "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement prm = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery);
                prm.setString(1, SqlDateFmt.format(TDate));
                prm.setString(2, DocNo);
                prm.setString(3, StkCode);
                prm.setString(4, TempCode);
                prm.setInt(5, 1);
                prm.setDouble(6, TempQty);
                prm.setDouble(7, TempAmt);
                prm.setDouble(8, 0);
                prm.setDouble(9, 0);
                prm.setString(10, T_Rem);
                prm.setString(11, UserPost); //User

                prm.setString(12, SqlDateFmt.format(date));
                prm.setString(13, TimeFmt.format(date));
                prm.executeUpdate();
                stmt2.close();
                int TempAct = GetActionMon(TDate);
                if (!SeekStkFile(TempCode, StkCode)) {
                    Statement stmt4 = (Statement) MySQLConnect.con.createStatement();
                    String InsertQuery4 = "insert into stkfile (bpcode,bstk) values (?,?)";
                    PreparedStatement prm4 = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery4);
                    prm4.setString(1, TempCode);
                    prm4.setString(2, StkCode);
                    prm4.executeUpdate();
                    stmt4.close();
                }
                for (int i = TempAct; i <= 24; i++) {
                    String T_Mon = "bqty" + String.valueOf(i);
                    Statement stmt4 = (Statement) MySQLConnect.con.createStatement();
                    String InsertQuery4 = "update stkfile set " + T_Mon + "=" + T_Mon + "+? where (bpcode=?) and (bstk=?)";
                    PreparedStatement prm4 = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery4);
                    prm4.setDouble(1, TempQty);
                    prm4.setString(2, TempCode);
                    prm4.setString(3, StkCode);
                    prm4.executeUpdate();
                    stmt4.close();
                }
            }
            if (SetProc) {
                ProcessSetUpdateStockIn(DocNo,StkCode,PCode,TDate,Stk_Remark,Qty,UserPost);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void ProcessSetUpdateStockIn(String DocNo,String StkCode,String XCode,Date TDate,String StkRemark,Double XQty,String UserPost) {
        Date date = new Date(); 
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SQLQuery = "select *from pset where pcode='" + XCode + "'";
            ResultSet rec = stmt.executeQuery(SQLQuery);
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                do {
                    String TempCode = rec.getString("psubcode");
                    Double TempQty = rec.getDouble("psubqty") * XQty;
                    Double TempAmt = 0.0;
                    String T_Rem = StkRemark;
                    Boolean StkProc = false;
                    Statement stmt3 = (Statement) MySQLConnect.con.createStatement();
                    String LoadTableFile = "select *from product where pcode='" + TempCode + "'";
                    ResultSet rec3 = stmt3.executeQuery(LoadTableFile);
                    rec3.first();
                    if (rec3.getRow() == 0) {
                    } else {
                        if (rec3.getString("pstock").equals("Y")) {
                            StkProc = true;
                        } else {
                            StkProc = false;
                        }
                        TempAmt = rec3.getDouble("pprice11") * XQty;
                    }
                    rec3.close();
                    stmt3.close();
                    if (StkProc) {
                        Statement stmt2 = (Statement) MySQLConnect.con.createStatement();
                        String InsertQuery = "insert into stcard (s_date,s_no,s_stk,s_pcode,s_que,s_in,s_incost," +
                                "s_out,s_outcost,s_rem,s_user,s_entrydate,s_entrytime) " +
                                "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement prm = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery);
                        prm.setString(1, SqlDateFmt.format(TDate));
                        prm.setString(2, "@" + XCode);
                        prm.setString(3, StkCode);
                        prm.setString(4, TempCode);
                        prm.setInt(5, 1);
                        prm.setDouble(6, TempQty);
                        prm.setDouble(7, TempAmt);
                        prm.setDouble(8, 0);
                        prm.setDouble(9, 0);
                        prm.setString(10, T_Rem);
                        prm.setString(11, ""); //User

                        prm.setString(12, SqlDateFmt.format(date));
                        prm.setString(13, TimeFmt.format(date));
                        prm.executeUpdate();
                        stmt2.close();
                        int TempAct = GetActionMon(TDate);
                        if (!SeekStkFile(TempCode, StkCode)) {
                            Statement stmt4 = (Statement) MySQLConnect.con.createStatement();
                            String InsertQuery4 = "insert into stkfile (bpcode,bstk) values (?,?)";
                            PreparedStatement prm4 = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery4);
                            prm4.setString(1, TempCode);
                            prm4.setString(2, StkCode);
                            prm4.executeUpdate();
                            stmt4.close();
                        }
                        for (int i = TempAct; i <= 24; i++) {
                            String T_Mon = "bqty" + String.valueOf(i);
                            Statement stmt4 = (Statement) MySQLConnect.con.createStatement();
                            String InsertQuery4 = "update stkfile set " + T_Mon + "=" + T_Mon + "+? where (bpcode=?) and (bstk=?)";
                            PreparedStatement prm4 = (PreparedStatement) MySQLConnect.con.prepareStatement(InsertQuery4);
                            prm4.setDouble(1, TempQty);
                            prm4.setString(2, TempCode);
                            prm4.setString(3, StkCode);
                            prm4.executeUpdate();
                            stmt4.close();
                        }
                    }
                } while (rec.next());
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public boolean checkStockOver(String stk, String pcode, double qtychk, Date d){
        int index = GetActionMon(d);
        boolean warning = false;
        double qty = 0.00;
        String unit = "";
        try {
            String sql = "select BQTY"+index+",p.PUnit1  FROM stkfile sf " +
                " LEFT JOIN product p" +
                " ON sf.bpcode = p.pcode" +
                " WHERE ( p.pactive = 'Y' AND p.pstock = 'Y' ) and p.pcode='"+pcode+"' " +
                "and bstk='"+stk+"'";
            System.err.println(sql);
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                qty = rs.getDouble(1);
                unit = rs.getString(2);
                if(qtychk > qty){
                    warning = true;
                }
            }else{
                if(qtychk < 0){
                    warning = true;
                }
            }
            if(warning){
                JOptionPane.showMessageDialog(null, "ปริมาณสินค้าคงเหลือไม่พอสำหรับรายการนี้ \n" +
                        "(คลังสินค้า) "+stk+"\n"
                        + "(รหัสสินค้า) " + pcode + " \n" +
                        "(คงเหลือ) " + qty + " " + unit, "แจ้งเตือน",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return warning;
    }
    public boolean checkStock(String stk, String pcode, double qtychk){
        int index = GetActionMon(new Date());
        boolean warning = false;
        double qty = 0.00;
        String unit = "";
        try {
            String sql = "select BQTY"+index+",p.PUnit1  FROM stkfile sf " +
                " LEFT JOIN product p" +
                " ON sf.bpcode = p.pcode" +
                " WHERE ( p.pactive = 'Y' AND p.pstock = 'Y' ) " +
                "and p.pcode='"+pcode+"' " +
                "and bstk='"+stk+"'";
            System.err.println(sql);
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                qty = rs.getDouble(1);
                unit = rs.getString(2);
                if(qtychk-(-qty)<0){
                    warning = true;
                }
            }else{
                if(qtychk < 0){
                    warning = true;
                }
            }
            if(warning){
                JOptionPane.showMessageDialog(null, "ปริมาณสินค้าคงเหลือไม่พอสำหรับรายการนี้ \n"
                        + "(รหัสสินค้า) " + pcode + " \n(คงเหลือ) " + qty + " " + unit, "แจ้งเตือน",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return warning;
    }
    public boolean checkStock(String table, String stk, String pcode, String r_no){
        boolean isResult = false;
        double a = getValueAdd(table, stk, pcode, r_no);
        double b = getValueMinStock(stk, pcode);

        if(a + b >= 0){
            isResult = true;
        }else{
            if(a>b){
                isResult = true;
            }else{
                isResult = false;
            }
        }
        
        return isResult;
    }
    public boolean checkStockAdjust(String pcode, String r_no){
        boolean isResult = false;
        if(getValueAdjust(pcode, r_no)>=0){
            isResult = true;
        }else{
            isResult = false;
        }

        return isResult;
    }
    public boolean checkStockOut(String table, String stk, String pcode, String r_no){
        boolean isResult = false;
        if(getValueMinus(table, stk, pcode, r_no) > getValueMinStock(stk, pcode)){
            isResult = false;
        }else{
            isResult = true;
        }

        return isResult;
    }
    private double getValueAdd(String table, String stk, String pcode, String r_no){
        double qty = 0.00;
        try {
            String sql = "select sum(r_qty) " +
                    "from "+table+" " +
                    "where r_no='"+r_no+"' and r_pcode='"+pcode+"' " +
                    "and r_stock='"+stk+"' " +
                    "group by r_pcode";
            System.out.println(sql);
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                qty = rs.getDouble(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qty;
    }
    private double getValueAdjust(String pcode, String r_no){
        double qty = 0.00;
        try {
            String sql = "select sum(r_inhand) " +
                    "from adjstock " +
                    "where r_no='"+r_no+"' and r_pcode='"+pcode+"' " +
                    "group by r_pcode";
            System.out.println(sql);
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                qty = rs.getDouble(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qty;
    }
    private double getValueMinus(String table, String stk, String pcode, String r_no){
        double qty = 0.00;
        try {
            String sql = "select sum(r_qty) " +
                    "from "+table+" " +
                    "where r_no='"+r_no+"' and r_pcode='"+pcode+"' " +
                    "and r_stock='"+stk+"' " +
                    "group by r_pcode";
            System.out.println(sql);
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                qty = rs.getDouble(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qty;
    }
    public double getValueMinStock(String stk, String pcode){
        int index = GetActionMon(new Date());
        double qty = 0.00;
        try {
            String sql = "select BQTY"+index+" " +
                    "FROM stkfile sf " +
                " LEFT JOIN product p" +
                " ON sf.bpcode = p.pcode" +
                " WHERE ( p.pactive = 'Y' AND p.pstock = 'Y' ) " +
                "and p.pcode='"+pcode+"' " +
                "and bstk='"+stk+"'";
            System.err.println(sql);
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                qty = rs.getDouble(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qty;
    }
    public static void main(String[] args) {
        stock_update st = new stock_update();
        st.stock_update();
//        st.showWarningMinimumChk("0131", -7.0);
    }
}   