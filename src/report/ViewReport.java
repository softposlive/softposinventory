package report;

import DBcontrol.MySQLConnect;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.util.JRLoader;

public final class ViewReport {

    private Statement stmt;
    DecimalFormat doubleFmt = new DecimalFormat("##,###,##0.00");
    SimpleDateFormat outFmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    SimpleDateFormat inFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    String companyName = "";
    String taxNo = "เลขประจำตัวผู้เสียภาษี : ";

    public ViewReport() {
        try {
            stmt = MySQLConnect.getStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        getCompanyDetail();
    }

    public void getCompanyDetail() {

        String sqlCompany = "SELECT * FROM company ";
        try {
            ResultSet rs = stmt.executeQuery(sqlCompany);
            if (rs != null) {
                if (rs.next()) {
                    companyName = rs.getString("Name");
                    taxNo += rs.getString("Tax");
                }
            }
            rs.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void printReportReceive(String R_no) {

        String sql = "SELECT hrecive.R_Date,hrecive.R_Remark,hrecive.R_Bran,factory.FactoryName " +
                "FROM hrecive INNER JOIN factory ON hrecive.R_Bran = factory.FactoryCode " +
                "WHERE R_No = '" + R_no + "' ;";

        String[] hrecive = new String[4];
        ResultSet rs;
        int check = 0;
        String amoutlist = "";
        String amoutprice = "";
        try {
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    hrecive[0] = rs.getString("hrecive.R_Date");
                    hrecive[1] = rs.getString("hrecive.R_Remark");
                    hrecive[2] = rs.getString("hrecive.R_Bran");
                    hrecive[3] = rs.getString("factory.FactoryName");
                }
                check = 1;
            }

            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


        if (check > 0) {

            String sqlCount = "SELECT count(R_No) as row,sum(R_Amount) as total " +
                    "FROM recive WHERE R_No = '" + R_no + "'";
            try {
                rs = stmt.executeQuery(sqlCount);
                if (rs != null) {
                    while (rs.next()) {
                        amoutlist = rs.getString("row");
                        amoutprice = rs.getString("total");
                    }

                }

                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            String sqlBranch = "SELECT * FROM branch ";
            String branchName = "";
            try {
                rs = stmt.executeQuery(sqlBranch);
                if (rs != null) {
                    if (rs.next()) {
                        branchName = rs.getString("Name");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            try {

                String date = convertDate(hrecive[0]);
                Float p = Float.parseFloat(amoutprice);
                String price = doubleFmt.format(p);
                Map parameters = new HashMap();
                parameters.put("branchName", branchName);
                parameters.put("rno", R_no);
                parameters.put("amoutlist", amoutlist);
                parameters.put("totalprice", price);
                parameters.put("date", date);
                parameters.put("remark", hrecive[1]);
                parameters.put("fac", hrecive[2] + "   " + hrecive[3]);
                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/reportfiles/receive.jasper"));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);

                int pageSize = jasperPrint.getPages().size();
                if (pageSize > 0) {
                    JasperViewer v = new JasperViewer(jasperPrint, false);
                    JDialog j = new JDialog(new JFrame(), true);
                    j.setTitle("Print");
                    j.setSize(1024, 768);
                    j.getContentPane().add(v.getContentPane());
                    j.setLocationRelativeTo(null);
                    j.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลที่ต้องการพิมพ์");
                }
                //dbUtility.con.close();
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "ไมพบข้อมูลที่ต้องการพิมพ์");
        }
    }

    public void printReportTranin(String R_no) {

        String sql = "SELECT distinct htranin.R_Date,htranin.R_Remark,htranin.R_Bran,branfile.Name " +
                "FROM htranin INNER JOIN branfile ON htranin.R_Bran = branfile.Code " +
                "WHERE R_No = '" + R_no + "' ;";
        System.out.println(sql);
        String[] hrecive = new String[4];
        ResultSet rs;
        int check = 0;
        String amoutlist = "";
        String amoutprice = "";
        try {
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    hrecive[0] = rs.getString("htranin.R_Date");
                    hrecive[1] = rs.getString("htranin.R_Remark");
                    hrecive[2] = rs.getString("htranin.R_Bran");
                    hrecive[3] = rs.getString("branfile.Name");
                }
                check = 1;
            }

            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


        if (check > 0) {

            String sqlCount = "SELECT count(R_No) as row,sum(R_Amount) as total " +
                    "FROM tranin WHERE R_No = '" + R_no + "'";
            try {
                rs = stmt.executeQuery(sqlCount);
                if (rs != null) {
                    while (rs.next()) {
                        amoutlist = rs.getString("row");
                        amoutprice = rs.getString("total");
                    }
                // check = 1;
                }

                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            String sqlBranch = "SELECT * FROM branch ";
            String branchName = "";
            try {
                rs = stmt.executeQuery(sqlBranch);
                if (rs != null) {
                    if (rs.next()) {
                        branchName = rs.getString("Name");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }            
            try {

                String date = convertDate(hrecive[0]);
                Float p = Float.parseFloat(amoutprice);
                String price = doubleFmt.format(p);
                Map parameters = new HashMap();
                parameters.put("branchName", branchName);
                parameters.put("rno", R_no);
                parameters.put("amoutlist", amoutlist);
                parameters.put("amoutprice", price);
                parameters.put("date", date);
                parameters.put("remark", hrecive[1]);
                parameters.put("fac", hrecive[2] + "    " + hrecive[3]);
                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/reportfiles/tranin.jasper"));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);
                int pageSize = jasperPrint.getPages().size();
                if (pageSize > 0) {
                    JasperViewer v = new JasperViewer(jasperPrint, false);
                    JDialog j = new JDialog(new JFrame(), true);
                    j.setTitle("Print");
                    j.setSize(1024, 768);
                    j.getContentPane().add(v.getContentPane());
                    j.setLocationRelativeTo(null);
                    j.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลที่ต้องการพิมพ์");
                }
               // dbUtility.con.close();
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "ไมพบข้อมูลที่ต้องการพิมพ์");
        }
    }

    public void printReportTranout(String R_no) {
        String sql = "SELECT distinct htranout.R_Date,htranout.R_Remark,htranout.R_Bran,branfile.Name " +
                "FROM htranout INNER JOIN branfile ON htranout.R_Bran = branfile.Code " +
                "WHERE R_No = '" + R_no + "' ;";
        System.out.println(sql);
        String[] hrecive = new String[4];
        ResultSet rs;
        int check = 0;
        String amoutlist = "";
        String amoutprice = "";
        try {
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    hrecive[0] = rs.getString("htranout.R_Date");
                    hrecive[1] = rs.getString("htranout.R_Remark");
                    hrecive[2] = rs.getString("htranout.R_Bran");
                    hrecive[3] = rs.getString("branfile.Name");
                }
                check = 1;
            }

            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


        if (check > 0) {

            String sqlCount = "SELECT count(R_No) as row,sum(R_Amount) as total " +
                    "FROM tranout WHERE R_No = '" + R_no + "'";
            try {
                rs = stmt.executeQuery(sqlCount);
                if (rs != null) {
                    while (rs.next()) {
                        amoutlist = rs.getString("row");
                        amoutprice = rs.getString("total");
                    }
                // check = 1;
                }

                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            String sqlBranch = "SELECT * FROM branch ";
            String branchName = "";
            try {
                rs = stmt.executeQuery(sqlBranch);
                if (rs != null) {
                    if (rs.next()) {
                        branchName = rs.getString("Name");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            try {

                String date = convertDate(hrecive[0]);
                Float p = Float.parseFloat(amoutprice);
                String price = doubleFmt.format(p);
                Map parameters = new HashMap();
                parameters.put("branchName", branchName);
                parameters.put("rno", R_no);
                parameters.put("amoutlist", amoutlist);
                parameters.put("amoutprice", price);
                parameters.put("date", date);
                parameters.put("remark", hrecive[1]);
                parameters.put("fac", hrecive[2] + "    " + hrecive[3]);
                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/reportfiles/tranout.jasper"));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);
                int pageSize = jasperPrint.getPages().size();
                if (pageSize > 0) {
                    JasperViewer v = new JasperViewer(jasperPrint, false);
                    JDialog j = new JDialog(new JFrame(), true);
                    j.setTitle("Print");
                    j.setSize(1024, 768);
                    j.getContentPane().add(v.getContentPane());
                    j.setLocationRelativeTo(null);
                    j.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลที่ต้องการพิมพ์");
                }
                //dbUtility.con.close();
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "ไมพบข้อมูลที่ต้องการพิมพ์");
        }
    }

    public void printReportProLost(String R_no) {

        String sql = "SELECT distinct(h.R_No), h.R_Date, h.R_Remark, h.R_Total FROM hprolost h " +
                "WHERE R_No = '" + R_no + "' ;";
        System.out.println(sql);
        String[] hrecive = new String[4];
        ResultSet rs;
        int check = 0;
        String amoutlist = "";
        String amoutprice = "";
        try {
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    hrecive[0] = rs.getString("h.R_Date");
                    hrecive[1] = rs.getString("h.R_Remark");
                    hrecive[2] = rs.getString("h.R_Total");
                    check = 1;
                }
            }

            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


        if (check > 0) {

            String sqlCount = "SELECT count(R_No) as row,sum(R_Amount) as total " +
                    "FROM prolost WHERE R_No = '" + R_no + "'";
            try {
                rs = stmt.executeQuery(sqlCount);
                if (rs != null) {
                    while (rs.next()) {
                        amoutlist = rs.getString("row");
                        amoutprice = rs.getString("total");
                    }
                }

                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            String sqlBranch = "SELECT * FROM branch ";
            String branchName = "";
            try {
                rs = stmt.executeQuery(sqlBranch);
                if (rs != null) {
                    if (rs.next()) {
                        branchName = rs.getString("Name");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            try {

                String date = convertDate(hrecive[0]);
                Float p = Float.parseFloat(amoutprice);
                String price = doubleFmt.format(p);
                Map parameters = new HashMap();
                parameters.put("branchName", branchName);
                parameters.put("rno", R_no);
                parameters.put("amoutlist", amoutlist);
                parameters.put("amoutprice", price);
                parameters.put("date", date);
                parameters.put("remark", hrecive[1]);

                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/reportfiles/lose.jasper"));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);
                int pageSize = jasperPrint.getPages().size();
                if (pageSize > 0) {
                    JasperViewer v = new JasperViewer(jasperPrint, false);
                    JDialog j = new JDialog(new JFrame(), true);
                    j.setTitle("Print");
                    j.setSize(1024, 768);
                    j.getContentPane().add(v.getContentPane());
                    j.setLocationRelativeTo(null);
                    j.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลที่ต้องการพิมพ์");
                }
                //dbUtility.con.close();
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "ไมพบข้อมูลที่ต้องการพิมพ์");
        }
    }

    public void printReportConvert(String R_no) {

        String sql = "SELECT distinct(h.R_No), h.R_Date, h.R_Remark, h.R_Total FROM hconvert h " +
                "WHERE R_No = '" + R_no + "' ;";
        System.out.println(sql);
        String[] hrecive = new String[4];
        ResultSet rs;
        int check = 0;
        String amoutlist = "";
        String amoutprice = "";
        try {
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    hrecive[0] = rs.getString("h.R_Date");
                    hrecive[1] = rs.getString("h.R_Remark");
                    hrecive[2] = rs.getString("h.R_Total");
                    check = 1;
                }
            }

            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


        if (check > 0) {

            String sqlCount = "SELECT count(R_No) as row,sum(R_Amount) as total " +
                    "FROM `convert` WHERE R_No = '" + R_no + "'";
            try {
                rs = stmt.executeQuery(sqlCount);
                if (rs != null) {
                    while (rs.next()) {
                        amoutlist = rs.getString("row");
                        amoutprice = rs.getString("total");
                    }
                }

                rs.close();
            } catch (Exception e) {
            }

            String sqlBranch = "SELECT * FROM branch ";
            String branchName = "";
            try {
                rs = stmt.executeQuery(sqlBranch);
                if (rs != null) {
                    if (rs.next()) {
                        branchName = rs.getString("Name");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {

                String date = convertDate(hrecive[0]);
                Float p = Float.parseFloat(amoutprice);
                String price = doubleFmt.format(p);
                Map parameters = new HashMap();
                parameters.put("branchName", branchName);
                parameters.put("rno", R_no);
                parameters.put("amoutlist", amoutlist);
                parameters.put("amoutprice", price);
                parameters.put("date", date);
                parameters.put("remark", hrecive[1]);

                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/reportfiles/convert.jasper"));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);
                int pageSize = jasperPrint.getPages().size();
                if (pageSize > 0) {
                    JasperViewer v = new JasperViewer(jasperPrint, false);
                    JDialog j = new JDialog(new JFrame(), true);
                    j.setTitle("Print");
                    j.setSize(1024, 768);
                    j.getContentPane().add(v.getContentPane());
                    j.setLocationRelativeTo(null);
                    j.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลที่ต้องการพิมพ์");
                }
                //dbUtility.con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "ไมพบข้อมูลที่ต้องการพิมพ์");
        }
    }

    public void printReportProFree(String R_no) {

        String sql = "SELECT distinct(h.R_No), h.R_Date, h.R_Remark FROM hcharge  h  " +
                "WHERE R_No = '" + R_no + "' ;";
        String[] hrecive = new String[4];
        ResultSet rs;
        int check = 0;
        String amoutlist = "";
        String amoutprice = "";
        try {
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    hrecive[0] = rs.getString("h.R_Date");
                    hrecive[1] = rs.getString("h.R_Remark");
                    check = 1;
                }
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        if (check > 0) {

            String sqlCount = "SELECT count(R_No) as row,sum(R_Amount) as total " +
                    "FROM charge  WHERE R_No = '" + R_no + "'";
            try {
                rs = stmt.executeQuery(sqlCount);
                if (rs != null) {
                    while (rs.next()) {
                        amoutlist = rs.getString("row");
                        amoutprice = rs.getString("total");
                    }
                }

                rs.close();
            } catch (Exception e) {
            }

            String sqlBranch = "SELECT * FROM branch ";
            String branchName = "";
            try {
                rs = stmt.executeQuery(sqlBranch);
                if (rs != null) {
                    if (rs.next()) {
                        branchName = rs.getString("Name");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {

                String date = convertDate(hrecive[0]);
                Float p = Float.parseFloat(amoutprice);
                String price = doubleFmt.format(p);
                Map parameters = new HashMap();
                parameters.put("branchName", branchName);
                parameters.put("rno", R_no);
                parameters.put("amoutlist", amoutlist);
                parameters.put("amoutprice", price);
                parameters.put("date", date);
                parameters.put("remark", hrecive[1]);

                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/reportfiles/free.jasper"));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);
                int pageSize = jasperPrint.getPages().size();
                if (pageSize > 0) {
                    JasperViewer v = new JasperViewer(jasperPrint, false);
                    JDialog j = new JDialog(new JFrame(), true);
                    j.setTitle("Print");
                    j.setSize(1024, 768);
                    j.getContentPane().add(v.getContentPane());
                    j.setLocationRelativeTo(null);
                    j.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลที่ต้องการพิมพ์");
                }
                //dbUtility.con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "ไมพบข้อมูลที่ต้องการพิมพ์");
        }
    }

    public String convertDate(String convert) {
        String output = "";
        try {
            Date date = new Date();
            date = inFmt.parse(convert);
            output = outFmt.format(date);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }

    public void printAdjStock(String R_no) {
        ResultSet rs;
        String docDate = "";
        String stk = "";
        String psDate = "";
        String sql = "SELECT R_Date,R_Stk,R_Date FROM hadjstock where R_No = '" + R_no + "'";
        try {
            rs = stmt.executeQuery(sql);
            if (rs != null) {
                if (rs.next()) {
                    docDate = rs.getString("R_Date").toString();
                    stk = rs.getString("R_Stk");
                    psDate = rs.getDate("R_Date").toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        String sqlBranch = "SELECT * FROM branch ";
        String branchCode = "";
        String branchName = "";
        try {
            rs = stmt.executeQuery(sqlBranch);
            if (rs != null) {
                if (rs.next()) {
                    branchCode = rs.getString("Code");
                    branchName = rs.getString("Name");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {

            String date = convertDate(docDate);
            Map parameters = new HashMap();
            parameters.put("branchName", branchName);
            parameters.put("rno", R_no);
            parameters.put("docdate", convertDate(docDate));
            parameters.put("stock", stk);
            parameters.put("docadj", convertDate(psDate));
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/reportfiles/adjstock.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);

            int pageSize = jasperPrint.getPages().size();
            if (pageSize > 0) {
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลที่ต้องการพิมพ์");
            }

           // dbUtility.con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void printStockCard(String sql, String timer) {
        //new dbUtility().dbconnect();
        ResultSet rs;
        String sqlBranch = "SELECT * FROM branch ";
        String branchCode = "";
        String branchName = "";
        try {
            rs = stmt.executeQuery(sqlBranch);
            if (rs != null) {
                if (rs.next()) {
                    branchCode = rs.getString("Code");
                    branchName = rs.getString("Name");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {

            Map parameters = new HashMap();
            parameters.put("branchName", branchCode + " " + branchName);
            parameters.put("sql", sql);
            parameters.put("timer", timer);

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/reportfiles/stockCard.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);
            int pageSize = jasperPrint.getPages().size();
            if (pageSize > 0) {
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลที่ต้องการพิมพ์");
            }

           // dbUtility.con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void printstockInHand(String condition, String month, String mode, String displayby, String bqty) {
        ResultSet rs;
        String sql = "";
        String sqlBranch = "SELECT * FROM branch ";
        String branchCode = "";
        String branchName = "";
        try {
            rs = stmt.executeQuery(sqlBranch);
            if (rs != null) {
                if (rs.next()) {
                    branchCode = rs.getString("Code");
                    branchName = rs.getString("Name");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                stmt.close();
            } catch (Exception e) {
            }
        }

        File file;
        if (mode.equals("byGroup")) {
            file = new File("/report/reportfiles/stockInhandGroup.jasper");
            sql = " SELECT  PCode,PDesc," + bqty + " as BQty, PStock,PUnit1,PPrice11,BStk, GroupCode,GroupName," +
                    " (" + bqty + "*PPrice11) as sum " +
                    "FROM ( product INNER JOIN stkfile ON product.PCode = stkfile.BPCode) " +
                    "INNER JOIN  groupfile ON product.PGroup = groupfile.GroupCode ";

        } else if (mode.equals("byPCode")) {
            file = new File("/report/reportfiles/stockInhandPCode.jasper");
            sql = " SELECT  PCode,PDesc," + bqty + " as BQty, PStock,PUnit1,PPrice11,BStk," +
                    " (" + bqty + "*PPrice11) as sum " +
                    " From product INNER JOIN  stkfile ON product.PCode = stkfile.BPCode ";

        } else {
            file = new File("/report/reportfiles/stockInhandVender.jasper");
            sql = " SELECT  PCode,PDesc," + bqty + " as BQty, PStock,PUnit1,PPrice11,BStk, pVender as VCode,Vname," +
                    " (" + bqty + "*PPrice11) as sum " +
                    "FROM ( product INNER JOIN stkfile ON product.PCode = stkfile.BPCode) " +
                    " INNER JOIN  vender ON product.PVender = vender.VCode ";
        }
        System.out.println("sql :" + sql + condition);
        try {

            Map parameters = new HashMap();
            parameters.put("branchName", branchCode + " " + branchName);
            parameters.put("month", month);
            parameters.put("tax", taxNo);
            parameters.put("companyName", companyName);
            parameters.put("displayby", displayby);
            parameters.put("sql", sql + condition);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(file.toString()));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);

            int pageSize = jasperPrint.getPages().size();
            if (pageSize > 0) {
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลที่ต้องการพิมพ์");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printstockControl(String pluCode, String groupCode, String groupCode2, String vender, String stock, String printby, String bqty, String date) {
        String condition = " Where product.PStock='Y' and product.PActive<>'N' ";
        String displayby = "แสดงเฉพาะ";
        String mode = "";

        if (!stock.equals("")) {
            condition += " and stkfile.BStk = '" + stock + "'";
        }

        if (groupCode.equals("") && groupCode2.equals("")) {
        } else if (!groupCode.equals("") && groupCode2.equals("")) {
            condition += " AND (product.pgroup >='" + groupCode + "')";
        } else if (!groupCode.equals("") && !groupCode2.equals("")) {
            condition += " AND (product.pgroup between '" + groupCode + "' AND '" + groupCode2 + "')";
        } else {
            condition += " AND (product.pgroup between 0 AND '" + groupCode2 + "')";
        }

        if (!vender.equals("")) {
            condition += " AND product.pvender = '" + vender + "'";
        }

        if (!pluCode.equals("")) {
            condition += " AND product.pcode LIKE '%" + pluCode + "%'";
        } else if (!pluCode.equals("")) {
            condition += " AND product.pdesc LIKE '%" + pluCode + "%'";
        }


        if (!pluCode.equals("")) {
            if (printby.equals("byPCode")) {
                mode = "byPCode";
            } else if (printby.equals("byGroup")) {
                mode = "byGroup";
            } else {
                mode = "byVender";
            }
        } else if (!groupCode.equals("")) {
            if (printby.equals("byPCode")) {
                mode = "byPCode";
            } else if (printby.equals("byGroup")) {
                mode = "byGroup";
            } else {
                mode = "byVender";
            }
        } else if (!vender.equals("")) {
            if (printby.equals("byPCode")) {
                mode = "byPCode";
            } else if (printby.equals("byGroup")) {
                mode = "byGroup";
            } else {
                mode = "byVender";
            }
        } else {
            if (printby.equals("byPCode")) {
                mode = "byPCode";
            } else if (printby.equals("byGroup")) {
                mode = "byGroup";
            } else {
                mode = "byVender";
            }
        }
        if (pluCode.equals("") && groupCode.equals("") && groupCode2.equals("") && vender.equals("")) {
            displayby = "แสดงทั้งหมด";
        } else {
            if (!pluCode.equals("")) {
                displayby += " (รหัส : " + pluCode + ")";
            }
            if (!groupCode.equals("") && !groupCode2.equals("")) {
                displayby += " (แผนก (Group) :  " + groupCode + " - " + groupCode2 + ")";
            }
            if (!groupCode.equals("") && groupCode2.equals("")) {
                displayby += " (แผนก (Group) :  " + groupCode + " - ZZZZ)";
            }
            if (groupCode.equals("") && !groupCode2.equals("")) {
                displayby += " (แผนก (Group) :  - " + groupCode2 + ")";
            }
            if (!vender.equals("")) {
                displayby += " (ผู้ขาย (Vender) : " + vender + ")";
            }
        }



        ViewReport view = new ViewReport();
        view.printstockInHand(condition, date, mode, displayby, bqty);
    }

    public void printConcludeGroup(String timer, String sql) {
        ResultSet rs;
        String sqlBranch = "SELECT * FROM branch ";
        String branchCode = "";
        String branchName = "";
        try {
            rs = stmt.executeQuery(sqlBranch);
            if (rs != null) {
                if (rs.next()) {
                    branchCode = rs.getString("Code");
                    branchName = rs.getString("Name");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            try {
                stmt.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        try {

            Map parameters = new HashMap();
            parameters.put("branchName", branchCode + " " + branchName);
            parameters.put("month", timer);
            parameters.put("sql", sql);
            parameters.put("tax", taxNo);
            parameters.put("companyName", companyName);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/reportfiles/stockInhand_balanceGroup.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);

            int pageSize = jasperPrint.getPages().size();
            if (pageSize > 0) {
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลที่ต้องการพิมพ์");
            }

            //dbUtility.con.close();
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void printConcludeVender(String timer, String sql) {
        ResultSet rs;
        String sqlBranch = "SELECT * FROM branch ";
        String branchCode = "";
        String branchName = "";
        try {
            rs = stmt.executeQuery(sqlBranch);
            if (rs != null) {
                if (rs.next()) {
                    branchCode = rs.getString("Code");
                    branchName = rs.getString("Name");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                stmt.close();                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        try {

            Map parameters = new HashMap();
            parameters.put("branchName", branchCode + " " + branchName);
            parameters.put("month", timer);
            parameters.put("sql", sql);
            parameters.put("tax", taxNo);
            parameters.put("companyName", companyName);
            System.out.println("sql :" + sql);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/reportfiles/stockInhand_balanceVender.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);

            int pageSize = jasperPrint.getPages().size();
            if (pageSize > 0) {
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลที่ต้องการพิมพ์");
            }
          
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void printCompile() {
        try {
            JasperReport jasperReport = (JasperReport)
                    JRLoader.loadObject(getClass().getResource("/report/reportfiles/ReportSample.jasper"));
            JasperFillManager.fillReport(jasperReport, null);
        } catch (JRException ex) {
            Logger.getLogger(ViewReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
