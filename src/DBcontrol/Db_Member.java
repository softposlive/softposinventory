package DBcontrol;

import Bean.Employee;
import Bean.Member;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Db_Member {
    private Statement stmt = null;

    public Db_Member() {
        try {
            stmt = MySQLConnect.con.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public ArrayList<Member> loadMember(){
        ArrayList<Member> arr = new ArrayList<Member>();
        try {
            String sql = "select m_code,m_name from memmaster limit 0, 12000";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Member bean = new Member();
                bean.setEmp_code(rs.getString("m_code"));
                bean.setEmp_name(rs.getString("m_name"));

                arr.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return arr;
    }
    public ArrayList<Employee> searchEmployee(String key){
        ArrayList<Employee> arr = new ArrayList<Employee>();
        try {
            String sql = "select emp_code,emp_name " +
                    "from employee " +
                    "where emp_code='"+key+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Employee bean = new Employee();
                bean.setEmpCode(rs.getString("emp_code"));
                bean.setEmpName(rs.getString("emp_name"));

                arr.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return arr;
    }
}