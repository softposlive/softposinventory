package DBcontrol;

import Bean.Company;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Date.*;
import javax.swing.JOptionPane;
import log.control.Log;
import utilities.ThaiUtil;

public class Db_company {

    public boolean insertCompany(Company comp, int statusMode) {
        
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyyy");
        SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd");
        Date time;
        String date = "";
        try {
            time = input.parse(comp.getAccterm());
            date = output.format(time);
        } catch (ParseException ex) {  
            Log.e(ex.getMessage());
        }            
      
        String sql;
        if (statusMode == 0) {
            sql = "INSERT INTO company " +
                    "VALUES (" +
                    "'" + comp.getCode() + "'" + "," +
                    "'" + ThaiUtil.Unicode2ASCII(comp.getName()) + "'" + "," +
                    "'" + ThaiUtil.Unicode2ASCII(comp.getAdress()) + "'" + "," +
                    "'" + ThaiUtil.Unicode2ASCII(comp.getSubprovince()) + "'" + "," +
                    "'" + ThaiUtil.Unicode2ASCII(comp.getProvince()) + "'" + "," +
                    "'" + ThaiUtil.Unicode2ASCII(comp.getCity()) + "'" + "," +
                    "'" + comp.getPost() + "'" + "," +
                    "'" + comp.getTel() + "'" + "," +
                    "'" + comp.getFax() + "'" + "," +
                    "'" + comp.getEmail() + "'" + "," +
                    "'" + comp.getTax() + "'" + "," +
                    "'" + date + "'" + "," +
                    "'" + comp.getPosstock() + "',null,null,null,null)";
        } else {
            sql = "update company set Code='" + comp.getCode() + "'," +
                    "Name ='" + ThaiUtil.Unicode2ASCII(comp.getName()) + "'," +
                    "Address ='" + ThaiUtil.Unicode2ASCII(comp.getAdress()) + "'," +
                    "Subprovince ='" + ThaiUtil.Unicode2ASCII(comp.getSubprovince()) + "'," +
                    "Province ='" + ThaiUtil.Unicode2ASCII(comp.getProvince()) + "'," +
                    "City ='" + ThaiUtil.Unicode2ASCII(comp.getCity()) + "'," +
                    "POST ='" + comp.getPost() + "'," +
                    "Tel ='" + comp.getTel() + "'," +
                    "Fax ='" + comp.getFax() + "'," +
                    "emailaddress ='" + comp.getEmail() + "'," +
                    "Tax ='" + comp.getTax() + "'," +
                    "Accterm ='" + date + "'," +
                    "POSStock='" + comp.getPosstock() + "'" +
                    "where Code='" + comp.getCode() + "' ;";
        }

        int result = -1;
        if (statusMode == 0) {
            try {
                comp = getCompanyDetail();
                if (comp != null) {
                    result = MySQLConnect.exeUpdate(sql);
                } else {
                    result = 0;
                }

            } catch (Exception ex) {
                Log.e(ex.getMessage());
            }
        } else {
            try {
                result = MySQLConnect.exeUpdate(sql);
            } catch (Exception e) {
                Log.e(e.getMessage());
            }
        }

        return result>0;
    }

    public Company getCompanyDetail() {
        ResultSet rs;
        String sql;
        Company bean = null;
        try {
            sql = "SELECT * FROM company";
            rs = MySQLConnect.getResultSet(sql);
            if (rs != null) {
                if (rs.next()) {
                    bean = new Company();
                    bean.setCode(rs.getString("code"));
                    bean.setName(ThaiUtil.ASCII2Unicode(rs.getString("name")));
                    bean.setAdress(ThaiUtil.ASCII2Unicode(rs.getString("address")));
                    bean.setSubprovince(ThaiUtil.ASCII2Unicode(rs.getString("subprovince")));
                    bean.setProvince(ThaiUtil.ASCII2Unicode(rs.getString("province")));
                    bean.setCity(ThaiUtil.ASCII2Unicode(rs.getString("city")));
                    bean.setPost(rs.getString("post"));
                    bean.setTel(rs.getString("tel"));
                    bean.setFax(rs.getString("fax"));
                    bean.setTax(rs.getString("tax"));
                    bean.setEmail(rs.getString("emailaddress"));
                    bean.setAccterm(rs.getDate("Accterm")+"");
                    bean.setPosstock(rs.getString("posstock"));
                }                
                rs.close();               
                return bean;
            } else {
                return null;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }
}
