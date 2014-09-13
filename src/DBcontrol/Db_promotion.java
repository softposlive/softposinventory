package DBcontrol;

import Bean.Promotion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Db_promotion {

    private Statement stmt;

    public Db_promotion() {
        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
        } catch (Exception e) {
        }

    }

    public List getPromotion() {
        ResultSet rs;
        String sql;
        List promotion = new ArrayList();
        try {
            sql = "SELECT ProCode,Prodesc,PDate1,PDate2,PStrDay FROM protab  ";
            rs = stmt.executeQuery(sql);
            if (rs != null) {

                while (rs.next()) {
                    Promotion bean = new Promotion();
                    bean.setCode(rs.getString("ProCode"));
                    bean.setDescription(rs.getString("Prodesc"));
                    bean.setStartDate(rs.getDate("PDate1"));
                    bean.setEndDate(rs.getDate("PDate2"));
                    bean.setStrDay(rs.getString("PStrDay"));
                    promotion.add(bean); 
                }
                return promotion;

            } else {
                return null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }       
    }
}
