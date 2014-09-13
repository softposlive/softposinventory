/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBcontrol;

import Bean.Branchfile;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.ThaiUtil;

/**
 *
 * @author root
 */
public class Db_branchfile {

    private Statement stmt;

    public Db_branchfile() {
        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Db_branchfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean insertBranch(Branchfile branch) {
        String sql = "";
        if (seek(branch.getBranchCode())) {
            sql = "UPDATE  branfile " +
                    "SET Name = " +
                    "'" + branch.getBranchName() + "'" + "," +
                    "AddressNo = '" + branch.getAddress() + "'" + "," +
                    "Locality = '" + branch.getLocality() + "'" + "," +
                    "SubProvince = '" + branch.getSubProvince() + "'" + "," +
                    "Province = '" + branch.getProvince() + "'" + "," +
                    "Post = '" + branch.getPost() + "'" + "," +
                    "Tel_No = '" + branch.getTelNo() + "'" + "," +
                    "Fax_No = '" + branch.getFaxNo() + "'" + "," +
                    "E_Mail = '" + branch.getEmail() + "'" + "," +
                    "Manager = '" + branch.getManagerName() + "'" + "," +
                    "Location_Area = '" + branch.getLocation_Area() + "'" + "," +
                    "Ser_Area = " + branch.getSer_Area() + "" + "," +
                    "Cou_Area = " + branch.getCou_Area() + "" + "," +
                    "Kic_Area = " + branch.getKic_Area() + "" + "," +
                    "Tot_Area = " + branch.getTot_Area() + "" + "," +
                    "cost = " + branch.getCost() + "" + "," +
                    "Charge = " + branch.getCharge() + "" + "," +
                    "FlageCost = '" + branch.getFlageCost() + "'" + "," +
                    " Gp = " + branch.getGp() + "" + "," +
                    "FlageGp = '" + branch.getFlageGp() + "'" + "," +
                    "Remark = '" + branch.getRemark() + "' " +
                    "WHERE code = '" + branch.getBranchCode() + "';";
        } else {
            sql = "INSERT INTO branfile (`Code`, `Name`, `AddressNo`, `Locality`, `SubProvince`, `Province`, " +
                    "`Post`, `Tel_No`, `Fax_No`, `E_Mail`, `Manager`, `Location_Area`, `Ser_Area`, `Cou_Area`, " +
                    "`Kic_Area`, `Tot_Area`, `Cost`, `Charge`, `FlageCost`, `Gp`, `FlageGp`, `Remark`) " +
                    "VALUES (" +
                    "'" + branch.getBranchCode() + "'" + "," +
                    "'" + branch.getBranchName() + "'" + "," +
                    "'" + branch.getAddress() + "'" + "," +
                    "'" + branch.getLocality() + "'" + "," +
                    "'" + branch.getSubProvince() + "'" + "," +
                    "'" + branch.getProvince() + "'" + "," +
                    "'" + branch.getPost() + "'" + "," +
                    "'" + branch.getTelNo() + "'" + "," +
                    "'" + branch.getFaxNo() + "'" + "," +
                    "'" + branch.getEmail() + "'" + "," +
                    "'" + branch.getManagerName() + "'" + "," +
                    "'" + branch.getLocation_Area() + "'" + "," +
                    "" + branch.getSer_Area() + "" + "," +
                    "" + branch.getCou_Area() + "" + "," +
                    "" + branch.getKic_Area() + "" + "," +
                    "" + branch.getTot_Area() + "" + "," +
                    "" + branch.getCost() + "" + "," +
                    "" + branch.getCharge() + "" + "," +
                    "'" + branch.getFlageCost() + "'" + "," +
                    "" + branch.getGp() + "" + "," +
                    "'" + branch.getFlageGp() + "'" + "," +
                    "'" + branch.getRemark() + "');";
        }


        System.out.println(sql);

        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (result == 1|| result > 0) {
            return true;
        } else {
            return false;
        }

    }

    public List getBranchFile() {
        ResultSet rs;
        String sql;
        List branchData = new ArrayList();
        try {
            sql = "SELECT b.Code, b.Name, b.Tel_No, b.Fax_No, b.Manager FROM branfile b";
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    Branchfile bean = new Branchfile();
                    bean.setBranchCode(rs.getString("Code"));
                    bean.setBranchName(rs.getString("Name"));
                    bean.setTelNo(rs.getString("Tel_No"));
                    bean.setFaxNo(rs.getString("Fax_No"));
                    bean.setManagerName(rs.getString("Manager"));
                    branchData.add(bean);
                }
                return branchData;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public String getBranchCode() {
        ResultSet rs;
        String sql;
        try {
            sql = "SELECT code FROM branch";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return rs.getString("code");
            } else {
                return "";
            }
        } catch (SQLException ex) {
            return "";
        }
    }
    public Branchfile getBranchFile(String branchCode) {
        ResultSet rs;
        String sql;
        Branchfile bean = new Branchfile();
        try {
            sql = "SELECT * FROM branfile b where b.Code = '" + branchCode + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                bean.setBranchCode(rs.getString("Code"));
                bean.setBranchName(ThaiUtil.ASCII2Unicode(rs.getString("Name")));
                bean.setTelNo(rs.getString("Tel_No"));
                bean.setFaxNo(rs.getString("Fax_No"));
                bean.setManagerName(ThaiUtil.ASCII2Unicode(rs.getString("Manager")));
                bean.setAddress(ThaiUtil.ASCII2Unicode(rs.getString("AddressNo")));
                bean.setLocality(ThaiUtil.ASCII2Unicode(rs.getString("Locality")));
                bean.setSubProvince(ThaiUtil.ASCII2Unicode(rs.getString("SubProvince")));
                bean.setProvince(ThaiUtil.ASCII2Unicode(rs.getString("Province")));
                bean.setPost(rs.getString("Post"));
                bean.setEmail(rs.getString("E_Mail"));
                bean.setSer_Area(rs.getFloat("ser_Area"));
                bean.setCou_Area(rs.getFloat("cou_Area"));
                bean.setKic_Area(rs.getFloat("kic_Area"));
                bean.setTot_Area(rs.getFloat("tot_Area"));
                bean.setCost(rs.getFloat("cost"));
                bean.setCharge(rs.getFloat("charge"));
                bean.setGp(rs.getFloat("gp"));
                bean.setFlageCost(rs.getString("FlageCost"));
                bean.setFlageGp(rs.getString("FlageGp"));

                return bean;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean removeBranchFile(String code) {

        String sql = "Delete From branfile WHERE Code ='" + code + "'";
        int result = -1;
        if (!checkRemove(code)) {//false

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
        } else {
            return false;
        }

    }

    public boolean seek(String branchCode) {
        ResultSet rs;
        String sql;
        boolean check = false;
        try {
            sql = "SELECT code FROM branfile b where b.Code = '" + branchCode + "'";
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                if (rs.next()) {
                    check = true;
                }
            } else {
                check = false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return check;
    }

    public boolean checkRemove(String branchCode) {
        ResultSet rs;
        String sqlTranin, sqlTranout;
        boolean check = false;
        try {
            sqlTranin = "SELECT distinct(r_bran) from htranin where r_bran = '" + branchCode + "'";
            sqlTranout = "SELECT distinct(r_bran) from htranin where r_bran = '" + branchCode + "'";

            rs = stmt.executeQuery(sqlTranin);
            if (rs != null) {
                if (rs.next()) {
                    // stmt = (Statement) dbUtility.con.createStatement();
                    rs = stmt.executeQuery(sqlTranout);
                    if (rs.next()) {
                        check = true;
                    } else {
                        check = false;
                    }
                }
            } else {
                check = false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return check;
    }
}
