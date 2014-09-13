package DBcontrol;

import Bean.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Db_employee {
    Statement stmt = null;

    public Db_employee() {
        try {
            stmt = MySQLConnect.con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Db_employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Employee> loadEmployee(){
        ArrayList<Employee> arr = new ArrayList<Employee>();
        try {
            String sql = "select emp_code,emp_name from employee order by emp_name";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Employee bean = new Employee();
                bean.setEmpCode(rs.getString(1));
                bean.setEmpName(rs.getString(2));

                arr.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return arr;
    }

    public boolean isInsertMemberfile(String pcode, String pdesc) throws SQLException {
        boolean isInsert = false;
        int rowInsert = 0;
        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
            String sql = "insert into employee values('" + pcode + "','" + pdesc + "');";
            rowInsert = stmt.executeUpdate(sql);
            if (rowInsert > 0) {
                isInsert = true;
                System.out.print("@@@ is insert success @@@");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error : insert employee is error ");
        }        
        return isInsert;
    }

    public boolean isUpdateMemberfile(String pcode, String pdesc) {
        boolean isUpdate = false;
        int rowUpdate = 0;
        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
            String sql = "update employee set emp_name ='" + pdesc + " ' " +
                    "where emp_code ='" + pcode + "';";
            String a = sql;           
            rowUpdate = stmt.executeUpdate(sql);
            if (rowUpdate > 0) {
                isUpdate = true;
                System.out.print("@@@ is update success @@@");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error : update employee is error ");
        }
        return isUpdate;
    }

    public List displayMemberfile() {
        ResultSet rs = null;
        List emp = new ArrayList();

        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
            String sql = "select * from employee g;";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Employee data = new Employee();
                data.setEmpCode(rs.getString("emp_code"));
                data.setEmpName(rs.getString("emp_name"));
                
                emp.add(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error : display employee error ");
        }
        return emp;
    }

    public boolean isRemoveMemberFile(String pcode) {
        boolean isRemove = false;
        if (isCheckMemberFile(pcode)) {//true

            try {
                stmt = (Statement) MySQLConnect.con.createStatement();
                String sql = "delete from employee where emp_code = '" + pcode + "';";
                int deleteRow = stmt.executeUpdate(sql);
                if (deleteRow > 0) {
                    isRemove = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.print("Error : remove employee error ");
            }
        }
        else{
            System.out.print(" Cannot remove this employee ");
        }
        return isRemove;
    }

    public boolean isCheckMemberFile(String pcodeCheck) {
        ResultSet rs = null;
        boolean isCheck = true;
        try {
            stmt = (Statement) MySQLConnect.con.createStatement();            
            String sql = "SELECT emp_code FROM employee p " +
                    "where emp_code ='"+pcodeCheck+"'";
            System.out.print(" sql is :"+sql);
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                isCheck = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isCheck;
    }
}
