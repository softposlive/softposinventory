/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package report;

import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import DBcontrol.MySQLConnect;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JDialog;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author root
 */
public class Report {
    protected final String rootPath = "/root/report/";
    protected SimpleDateFormat humanFmt;
    protected SimpleDateFormat sqlFmt;    
    protected MySQLConnect db;
    
    public Report(){
        humanFmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        sqlFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    }
    
    protected void viewReport(String reportName, Map parameters){
        try{
            JasperReport jasperReport = getCompiledReport(reportName);
            if (jasperReport == null) {
                JOptionPane.showMessageDialog(null, "File not Found: " + reportName + ".jasper");
            } else {
                JasperPrint jasperPrint = JasperFillManager.
                        fillReport(jasperReport, parameters, MySQLConnect.con);
           
                int pageSize = jasperPrint.getPages().size();
                if (pageSize > 0) {
                    JasperViewer viewer = new JasperViewer(jasperPrint, false);
                    JDialog jviewer = new JDialog(new JFrame(), true);
                    jviewer.setTitle(reportName + " Print");
                    jviewer.setSize(1024, 768);
                    jviewer.getContentPane().add(viewer.getContentPane());
                    jviewer.setLocationRelativeTo(null);
                    jviewer.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ไม่พบข้อมูล");
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex +"\n\tviewReport();");
            ex.printStackTrace();
        }
    }

    protected void printReport(String reportName, Map parameters) {
        try {
            JasperReport jasperReport = getCompiledReport(reportName);
            if (jasperReport == null) {
                JOptionPane.showMessageDialog(null, "File not Found: " + reportName + ".jasper");
            } else {
                
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.con);
                int pageSize = jasperPrint.getPages().size();
                if (pageSize > 0) {
                    JasperPrintManager.printReport(jasperPrint, true);
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex +"\n\tprintReport();");
            ex.printStackTrace();
        }
    }   

    public JasperReport getCompiledReport( String reportName ) throws JRException{
        JasperReport jasperReport = null;
        try{            
            jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/reportfiles/"+reportName+".jasper")); 
            //jasperReport = JasperCompileManager.compileReport(getClass().getResource("/report/reportfiles/"+reportName+".jrxml").getPath());
        }catch(NullPointerException ex){
            jasperReport = null;
        }
        return jasperReport;
    }
    
    public String convertDateFromSQL(String convert) {
        String output = "";
        try {
            Date date = sqlFmt.parse(convert);
            output = humanFmt.format(date);           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }

    public String convertDateToSQL(String convert) {
        String output = "";
        try {
            Date date = humanFmt.parse(convert);
            output = sqlFmt.format(date);           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }
    
    protected void disconnectDB(){
        try {
            MySQLConnect.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
