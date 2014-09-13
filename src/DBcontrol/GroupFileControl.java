package DBcontrol;

import Bean.Groupfile;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import log.control.Log;
import utilities.ThaiUtil;

public class GroupFileControl {

    public boolean isInsertGroupfile(String code, String name){        
        boolean isInsert = false;
        int rowInsert = -1;
        try {
            String sql = "insert into groupfile values('" + code + "','" + ThaiUtil.Unicode2ASCII(name) + "');";
            ResultSet rs = MySQLConnect.getResultSet("select * from groupfile where groupcode='"+code+"'");
            if(rs.next()){
                rs.close();
                isInsert = isUpdateGroupfile(code, name);
            }else{
                rs.close();
                rowInsert = MySQLConnect.exeUpdate(sql);
            }
            if (rowInsert > 0) {
                isInsert = true;
            }
        } catch (Exception e) {
            Log.e(e.getMessage());
        }        
        return isInsert;
    }

    public boolean isUpdateGroupfile(String pcode, String pdesc) {       
        boolean isUpdate = false;
        int rowUpdate;
        try {
            String sql = "update groupfile set "
                    + "groupName ='" + ThaiUtil.Unicode2ASCII(pdesc) + " ' "
                    + "where groupcode ='" + pcode + "';";
            rowUpdate = MySQLConnect.exeUpdate(sql);
            if (rowUpdate > 0) {
                isUpdate = true;
            }
        } catch (Exception e) {
            Log.e(e.getMessage());
        }
        
        return isUpdate;
    }

    public List displayGroupfile() {
        List groupfile = new ArrayList();

        try {
            String sql = "select * from groupfile";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                Groupfile data = new Groupfile();
                data.setGroupCode(rs.getString("groupcode"));
                data.setGroupName(ThaiUtil.ASCII2Unicode(rs.getString("groupName")));
                
                groupfile.add(data);
            }
            rs.close();
        } catch (Exception e) {
            Log.e(e.getMessage());
        }
        
        return groupfile;
    }
    
    public Groupfile getData(String code) {
        Groupfile bean = null;
        try {
            String sql = "select * from groupfile where groupcode='"+code+"'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                bean = new Groupfile();
                
                bean.setGroupCode(rs.getString("groupcode"));
                bean.setGroupName(ThaiUtil.ASCII2Unicode(rs.getString("groupName")));
            }
            rs.close();
        } catch (Exception e) {
            Log.e(e.getMessage());
        }
        
        return bean;
    }

    public boolean isRemoveGroupFile(String pcode) {
        boolean isRemove = false;
        try {
            String sql = "delete from groupfile where groupcode = '" + pcode + "';";
            int deleteRow = MySQLConnect.exeUpdate(sql);
            if (deleteRow > 0) {
                isRemove = true;
            }
        } catch (Exception e) {
            Log.e(e.getMessage());
        }
        
        return isRemove;
    }
    
    public boolean isCheckGroupFile(String groupCode) {
        boolean isCheck = false;
        try {
            String sql = "SELECT PGroup FROM product where PGroup ='"+groupCode+"'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                isCheck = true;
            }
            
            rs.close();
        } catch (Exception e) {
            Log.e(e.getMessage());
        }
        
        return isCheck;
    }
    
}
