package DBcontrol;

import Bean.FactoryBean;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import log.control.Log;
import utilities.ThaiUtil;

public class FactoryControl {

    public boolean insert(FactoryBean row) {
        String sql = "INSERT INTO factory (factorycode, factoryname)"
                + "VALUES ("
                + "'" + row.getFactorycode() + "'" + ","
                + "'" + ThaiUtil.Unicode2ASCII(row.getFactoryname()) + "'" + ")";
        int result = -1;
        try {
            String chk = "select * from factory where factorycode='" + row.getFactorycode() + "'";
            ResultSet rs = MySQLConnect.getResultSet(chk);
            if (rs.next()) {
                return update(row);
            } else {
                result = MySQLConnect.exeUpdate(sql);
            }

            rs.close();
        } catch (Exception ex) {
            Log.e(ex.getMessage());
        }

        return result > 0;
    }

    public boolean update(FactoryBean row) {
        String sql = "UPDATE factory "
                + "SET "
                + "factoryname=" + "'" + ThaiUtil.Unicode2ASCII(row.getFactoryname()) + "'" + ""
                + "WHERE factorycode=" + "'" + row.getFactorycode() + "'";
        int result = -1;
        try {
            result = MySQLConnect.exeUpdate(sql);
        } catch (Exception ex) {
            Log.e(ex.getMessage());
        }

        return result > 0;
    }

    public boolean seek(String factorycode) {
        String sql = "SELECT factorycode FROM factory "
                + "WHERE factorycode='" + factorycode + "'";
        try {
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                rs.close();
                return true;
            } else {
                rs.close();
                return false;
            }
        } catch (Exception ex) {
            Log.e(ex.getMessage());
            return false;
        }
    }

    public FactoryBean getRecordAt(String factorycode) {
        ResultSet rs;
        String sql;
        FactoryBean bean = null;
        try {
            sql = "SELECT * FROM factory WHERE factorycode='" + factorycode + "'";
            rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                bean = new FactoryBean();
                bean.setFactorycode(rs.getString("factorycode"));
                bean.setFactoryname(ThaiUtil.ASCII2Unicode(rs.getString("factoryname")));
            }
            rs.close();
            return bean;
        } catch (Exception ex) {
            Log.e(ex.getMessage());
            return null;
        }
    }

    public List getFactoryData() {
        ResultSet rs;
        String sql;
        List factory = new ArrayList();
        try {
            sql = "SELECT * FROM factory";
            rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                FactoryBean fac = new FactoryBean();
                fac.setFactorycode(rs.getString("factorycode"));
                fac.setFactoryname(ThaiUtil.ASCII2Unicode(rs.getString("factoryname")));
                factory.add(fac);
            }
            rs.close();

            return factory;
        } catch (Exception ex) {
            Log.e(ex.getMessage());
            return null;
        }
    }

    public boolean remove(String facCode) {
        String sql = "Delete From factory WHERE factorycode ='" + facCode + "'";
        int result = -1;
        if (!checkFactory_HRecive(facCode)) {
            try {
                result = MySQLConnect.exeUpdate(sql);
            } catch (Exception ex) {
                Log.e(ex.getMessage());
            }
            return result > 0;
        } else {
            return false;
        }

    }

    public boolean checkFactory_HRecive(String facCode) {
        String sql = "SELECT r_bran FROM hrecive h where r_bran ='" + facCode + "' group by r_bran";
        try {
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                rs.close();
                return true;
            } else {
                rs.close();
                return false;
            }
        } catch (Exception ex) {
            Log.e(ex.getMessage());
            return false;
        }
    }

}
