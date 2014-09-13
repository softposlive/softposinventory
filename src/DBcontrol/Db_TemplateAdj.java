
package DBcontrol;

import Bean.TemplateAdj;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Db_TemplateAdj {

    public Db_TemplateAdj() {
    }
    
    //เลขที่เอกสารใหม่
    public ArrayList<TemplateAdj> getGroupNew() {
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<TemplateAdj> arr = new ArrayList<TemplateAdj>();

        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
            String sql = "select pcode,groupcode,groupname from product " +
                    "inner join groupfile on pgroup=groupcode " +
                    "where pactive='Y' and pstock='Y' " +
                    "group by pgroup" ;
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TemplateAdj bean = new TemplateAdj();
                bean.setPcode(rs.getString("pcode"));
                bean.setGroup_code(rs.getString("groupcode"));
                bean.setGroup_name(rs.getString("groupName"));
                
                arr.add(bean);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.print("Error : display groupfile error ");
        }
        return arr;
    }
    public ArrayList<TemplateAdj> getGroupNewAt(String group_name) {
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<TemplateAdj> arr = new ArrayList<TemplateAdj>();
        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
            String sql = "select  punit1, premark, pprice11, pdesc, pcode, groupcode, groupname "
                    + "from product p inner join groupfile g "
                    + "on p.pgroup=g.groupcode "
                    + "where groupname='"+group_name+"' and pstock='y' and pactive='y' " +
                    "order by pcode+0";
            rs = stmt.executeQuery(sql);
            System.out.println("ABC: "+sql);
            while (rs.next()) {
                TemplateAdj bean = new TemplateAdj();
                bean.setPcode(rs.getString("pcode"));
                bean.setPname(rs.getString("pdesc"));
                bean.setGroup_code(rs.getString("groupcode"));
                bean.setGroup_name(rs.getString("groupName"));
                bean.setPrice(rs.getString("pprice11"));
                bean.setRemark(rs.getString("premark"));
                bean.setUnit(rs.getString("punit1"));

                arr.add(bean);
            }

        } catch (Exception e) {
            System.err.print("Error : display groupfile error ");
        }
        return arr;
    }
    //old เลขที่เอกสาร
    public String[] getGroupOld(String r_no, String pcode) {
        Statement stmt = null;
        ResultSet rs = null;
        String []data = new String[2];
        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
            String sql = "select r_inhand from adjstock "
                    + "where r_no='"+r_no+"' and r_pcode='"+pcode+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next()) {
                data[0] = rs.getString("r_inhand");
            }else{
                data[0] = "-";
            }
            sql = "select r_qty from prolost p, hprolost hp "
                    + "where p.r_no='L-"+r_no+"' and p.r_no=hp.r_no" +
                    " and r_pcode='"+pcode+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next()) {
                data[1] = rs.getString("r_qty");
            }else{
                data[1] = "-";
            }
        } catch (Exception e) {
            System.err.print("Error : display groupfile error ");
        }
        return data;
    }
    public ArrayList<TemplateAdj> getGroupOldAt(String r_no, String group_name) {
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<TemplateAdj> arr = new ArrayList<TemplateAdj>();
        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
            String sql = "select r_inhand, premark, pprice11, pdesc, "
                    + "t.r_pcode, groupcode, groupname "
                    + "from adjstock t inner join product p "
                    + "on t.r_pcode=p.pcode inner join groupfile g "
                    + "on p.pgroup=g.groupcode "
                    + "where groupname='"+group_name+"' and pactive='y' and pstock='y'";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TemplateAdj bean = new TemplateAdj();
                bean.setPcode(rs.getString("r_pcode"));
                bean.setPname(rs.getString("pdesc"));
                bean.setGroup_code(rs.getString("groupcode"));
                bean.setGroup_name(rs.getString("groupName"));
                bean.setPrice(rs.getString("pprice11"));
                bean.setRemark(rs.getString("premark"));
                bean.setRinhand(rs.getString("r_inhand"));

                arr.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.print("Error : display groupfile error ");
        }
        return arr;
    }
    public ArrayList<TemplateAdj> getListTemplate() {
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<TemplateAdj> arr = new ArrayList<TemplateAdj>();
        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
            String sql = "select t.pcode, p.pdesc, p.pgroup, t.stock " +
                    "from template_adjust t " +
                    "inner join product p on t.pcode=p.pcode " +
                    "order by t.pcode";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TemplateAdj bean = new TemplateAdj();
                bean.setPcode(rs.getString("t.pcode"));
                bean.setPname(rs.getString("pdesc"));
                bean.setGroup_code(rs.getString("pgroup"));
                bean.setIsStock(rs.getString("t.stock").equalsIgnoreCase("Y"));

                arr.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return arr;
    }

    public void cancelDrafft() {
        try {
            String sql = "delete from template_adjust";
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void clearStatusStock() {
        try {
            String sql = "update template_adjust set stock='N' where stock='Y'";
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void addItem(String pcode) {
        try {
            String sql = "insert ignore into template_adjust values('"+pcode+"','N')";
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void delItem(String pcode) {
        try {
            String sql = "delete from template_adjust where pcode='"+pcode+"'";
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
