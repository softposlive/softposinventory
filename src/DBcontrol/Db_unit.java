package DBcontrol;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.ThaiUtil;

public class Db_unit {

    private Statement stmt;

    public Db_unit() {
        try {
            stmt = MySQLConnect.con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Db_unit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean insert(String[] unit) {
        String sql = "";
        int result = -1;
        try {
            remove();
            for (int i = 0; i < unit.length; i++) {
                sql = "INSERT INTO unitfile values('" + unit[i] + "')";
                result = stmt.executeUpdate(sql);
                System.out.println(sql);
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

    public List getUnitData() {
        ResultSet rs;
        String sql;
        List unit = new ArrayList();
        try {
            sql = "SELECT * FROM unitfile";
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    unit.add(ThaiUtil.ASCII2Unicode(rs.getString("unitname")));
                }
                return unit;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean remove() {

        String sql = "Delete From unitfile";
        int result = -1;
        try {
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkRemoveUnit(String unitSelect) {

        String sql = "SELECT p.PUnit1 FROM product p WHERE PUnit1 = '"+unitSelect+"' ";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs != null) {
                if (rs.next()) {                    
                    return true;
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
    public static void main(String[] args) {
        String a = "abc_03-08-2009.sql";
        int b = a.indexOf("abc");
        System.out.println(b);
    }
}
