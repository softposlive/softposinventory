
package DBcontrol;

import program.LoginDialog;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Db_DayOperation {
    private Statement stmt;
    private Statement stmt2;

    public Db_DayOperation() {
        try {
            stmt = (Statement) MySQLConnect.con.createStatement();
            stmt2 = (Statement) MySQLConnect.con.createStatement();
        } catch (SQLException ex) {
        }
    }
    public boolean updateStatusAdj(Date AdjDate){
        SimpleDateFormat simp1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            String sqlInsertAdj = "INSERT INTO `dayoperation` " +
                    "VALUES ('"+simp1.format(AdjDate)+"', 'N', NULL, NULL, 'N', NULL, NULL, 'N', " +
                    "NULL, NULL, 'N', NULL, NULL, " +
                    "'Y', '"+LoginDialog.UserCode+"', '"+simp.format(new Date())+"', 'N', " +
                    "NULL, NULL, 'N', NULL, NULL);";
            String sql = "update dayoperation set adjstock='Y', " +
                    "adjstockuser='"+LoginDialog.UserCode+"', " +
                    "adjstocktime='"+simp.format(new Date())+"' where operationdate='"+simp1.format(AdjDate)+"'";
            String chkDate = "select operationdate from dayoperation where " +
                    "operationdate='"+simp1.format(AdjDate)+"'";
            ResultSet rs = stmt.executeQuery(chkDate);
            if(rs.next()){
                stmt2.executeUpdate(sql);
            }else{
                stmt2.executeUpdate(sqlInsertAdj);
            }
            String sqlbranch = "update branch set adjstockdate= '"+simp.format(AdjDate)+"'" ;
            stmt2.executeUpdate(sqlbranch);

            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
