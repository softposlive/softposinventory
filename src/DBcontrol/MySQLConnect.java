package DBcontrol;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

public class MySQLConnect {

    private String CLASS_NAME;
    public static String SERVER;
    private String USER;
    private String PASS;
    public static String DATABASE;
    public static Connection con;
    private String PORT;
    private String CHARSET;

    public MySQLConnect() {
        CLASS_NAME = "com.mysql.jdbc.Driver";
        
        try {
            FileInputStream fs = new FileInputStream("C:/softpos/connect.ini");
            DataInputStream ds = new DataInputStream(fs);
            BufferedReader br = new BufferedReader(new InputStreamReader(ds));
            String tmp;  
            while ((tmp = br.readLine()) != null)   {
                String []data = tmp.split(",", tmp.length());
                if(data[0].equalsIgnoreCase("server")){
                    SERVER = data[1];
                }else if(data[0].equalsIgnoreCase("database")){
                    DATABASE = data[1];
                }else if(data[0].equalsIgnoreCase("user")){
                    USER = data[1];
                }else if(data[0].equalsIgnoreCase("pass")){
                    PASS = data[1];
                }else if(data[0].equalsIgnoreCase("port")){
                    PORT = data[1];
                }else if(data[0].equalsIgnoreCase("charset")){
                    CHARSET = data[1];
                }else if(data[0].equalsIgnoreCase("macno")){
                }else if(data[0].equalsIgnoreCase("language")){
                }
            }  
            br.close();
            ds.close();
            fs.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        connect();
    }

    private Connection connect() {
        try {
            Class.forName(CLASS_NAME);
            System.out.println("Driver Loaded.");

            String jdbcUrl = "jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE + "?charset=" + CHARSET;
            con = DriverManager.getConnection(jdbcUrl, USER, PASS);
            System.out.println("Connected.");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return con;
    }

    public static Statement getStatement() throws Exception {
        if (con == null) {
            return null;
        } else {
            return con.createStatement();
        }
    }

    public static ResultSet getResultSet(String sql) throws Exception {
        if (con == null) {
            return null;
        } else {
            return getStatement().executeQuery(sql);
        }
    }

    public static int exeUpdate(String sql) throws Exception {
        if (con == null) {
            return -1;
        } else {
            return con.createStatement().executeUpdate(sql);
        }
    }

    public static void close() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Connection Closed.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
