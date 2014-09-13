/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBcontrol;

import Bean.Vender;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author root
 */
public class Db_vender {

    private Statement stmt;
    SimpleDateFormat thFmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    SimpleDateFormat enFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

    public Db_vender() {
        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
        } catch (Exception ex) {
        }
    }

    public Vender getVenderFile(String Code) {
        ResultSet rs;
        String sql;
        Vender bean = null;
        try {
            sql = "SELECT * FROM vender where VCode = " + Code + "";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                bean = new Vender();
                bean.setVname(rs.getString("Vname"));
                bean.setVaddress(rs.getString("Vaddress"));
                bean.setVCity(rs.getString("VCity"));
                bean.setVSubProvince(rs.getString("VSubProvince"));
                bean.setVProvince(rs.getString("VProvince"));
                bean.setVPost(rs.getString("VPost"));
                bean.setVTel(rs.getString("VTel"));
                bean.setVFax(rs.getString("VFax"));
                bean.setVEmail(rs.getString("VEmail"));
                bean.setVContack(rs.getString("VContack"));
                bean.setVDept(rs.getString("VDept"));
                bean.setVSendTime(rs.getString("VSendTime"));
                bean.setVConPur(rs.getString("VConPur"));
                bean.setVTran(rs.getString("VTran"));
                bean.setVBusType(rs.getString("VBusType"));
                bean.setVBusAssi(rs.getString("VBusAssi"));
               
                try {                   
                    bean.setVBusBegin(rs.getDate("VBusBegin").toString());
                } catch (Exception e) {
                    bean.setVBusBegin("");
                }              
                bean.setVBusNo(rs.getString("VBusNo"));
                bean.setVTaxNo(rs.getString("VTaxNo"));
                bean.setVVatNo(rs.getString("VVatNo"));
                bean.setVCrTerm(rs.getString("VCrTerm"));
                bean.setVCrAmount(rs.getString("VCrAmount"));
                bean.setVPayType(rs.getString("VPayType"));
                bean.setVBankAcc(rs.getString("VBankAcc"));
                bean.setVDiscount(rs.getString("VDiscount"));
                bean.setVCharge(rs.getString("VCharge"));
                bean.setVRemark(rs.getString("VRemark"));
                bean.setVCode(rs.getString("VCode"));
                bean.setVAccNo(rs.getString("VAccNo"));
                return bean;

            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    public boolean inSertVender(Vender bean, String statusMode) {
        Date time;
        String date = "";
        try {
            time = thFmt.parse(bean.getVBusBegin());
            date = enFmt.format(time);
        } catch (Exception ex) {
            date = "0000-00-00";
        }    
        String sql = "";
        if (statusMode.equals("insert")) {
            sql = "insert into vender values ('" + bean.getVname() + "','" + bean.getVaddress() + "','" + bean.getVCity() + "','" + bean.getVSubProvince() + "'," +
                    "'" + bean.getVProvince() + "','" + bean.getVPost() + "','" + bean.getVTel() + "','" + bean.getVFax() + "','" + bean.getVEmail() + "'," +
                    "'" + bean.getVContack() + "','" + bean.getVDept() + "'," + bean.getVSendTime() + ",'" + bean.getVConPur() + "','" + bean.getVTran() + "','" + bean.getVBusType() + "'," +
                    "'" + bean.getVBusAssi() + "','" + date + "','" + bean.getVBusNo() + "','" + bean.getVTaxNo() + "','" + bean.getVVatNo() + "'," +
                    "" + bean.getVCrTerm() + "," + bean.getVCrAmount() + ",'" + bean.getVPayType() + "','" + bean.getVBankAcc() + "','" + bean.getVDiscount() + "'," +
                    "'" + bean.getVCharge() + "','" + bean.getVRemark() + "','" + bean.getVCode() + "','" + bean.getVAccNo() + "');";
        } else {
            sql = "update vender set" +
                    " Vname ='" + bean.getVname() + "'," +
                    "Vaddress='" + bean.getVaddress() + "'," +
                    "VCity='" + bean.getVCity() + "'," +
                    "VSubProvince='" + bean.getVSubProvince() + "'," +
                    "VProvince='" + bean.getVProvince() + "'," +
                    "VPost='" + bean.getVPost() + "'," +
                    "VTel='" + bean.getVTel() + "'," +
                    "VFax='" + bean.getVFax() + "'," +
                    "VEmail='" + bean.getVEmail() + "'," +
                    "VContack='" + bean.getVContack() + "'," +
                    "VDept='" + bean.getVDept() + "'," +
                    "VSendTime=" + bean.getVSendTime() + "," +
                    "VConPur='" + bean.getVConPur() + "'," +
                    "VTran='" + bean.getVTran() + "'," +
                    "VBusType='" + bean.getVBusType() + "'," +
                    "VBusAssi='" + bean.getVBusAssi() + "'," +
                    "VBusBegin='" + date + "'," +
                    "VBusNo='" + bean.getVBusNo() + "'," +
                    "VTaxNo='" + bean.getVTaxNo() + "'" +
                    ",VCrTerm=" + bean.getVCrTerm() + "," +
                    "VCrAmount=" + bean.getVCrAmount() + "," +
                    "VPayType='" + bean.getVPayType() + "'," +
                    "VBankAcc='" + bean.getVBankAcc() + "'," +
                    "VDiscount='" + bean.getVDiscount() + "'," +
                    "VCharge='" + bean.getVCharge() + "'," +
                    "VRemark='" + bean.getVRemark() + "'," +
                    "VAccNo='" + bean.getVAccNo() + "' " +
                    " where VCode='" + bean.getVCode() + "'";
        }      
        System.out.println("sql :"+sql);
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);          
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result > 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean removeVenderFile(String Code) {
         String sql = "Delete From vender WHERE VCode ='" + Code + "'";       
        int result = -1;      
            try {
                result = stmt.executeUpdate(sql);               
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            if (result > 0) {
                return true;
            } else {
                return false;
            }
       
    }
}
