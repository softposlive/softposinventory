/*
 * Jdi_report_recive.java
 *
 * Created on June 9, 2009, 4:49 PM
 */

package Main.viewreport;


import DBcontrol.MySQLConnect;
import Bean.FactoryBean;
import Main.browser.Jdi_browse_factory;
import Main.browser.jdi_showgroupfile;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import utilities.LookAndFeelFrame;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import report.SnpReport;
import utilities.Format;
import utilities.NimbusFrame;
import utilities.date_time.DateUtilities;

/**
 *
 * @author  root
 */
public class Jdi_report_sumProlostGroup extends javax.swing.JDialog {
 
    /** Creates new form Jdi_report_recive */
    public Jdi_report_sumProlostGroup(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,1);
        txt1.setText(Format.dateFmtShow.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_MONTH, DateUtilities.getMaxDay( (GregorianCalendar) cal ));
        txt2.setText(Format.dateFmtShow.format(cal.getTime()));
        
        setTableHeader();
      
        report = new SnpReport();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JFormattedTextField();
        txt2 = new javax.swing.JFormattedTextField();
        cmdDateChoose1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmdDateChoose2 = new javax.swing.JButton();
        cmdPrint = new javax.swing.JButton();
        cmdProcess = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtPcode1 = new javax.swing.JFormattedTextField();
        txtPcode2 = new javax.swing.JFormattedTextField();
        cmdProductChoose3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmdProductChoose4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHeader = new javax.swing.JTable();
        txtHlist = new javax.swing.JTextField();
        txtAmt = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("สรุปการบันทึกรายการของเสีย & สินค้าชำรุด ตามแผนกสินค้า");

        jPanel1.setBackground(new java.awt.Color(254, 234, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel2.setText("กำหนดช่วงวันที่");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Norasi", 0, 14));

        txt1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txt1.setFont(new java.awt.Font("Norasi", 0, 14));
        txt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt1FocusGained(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt1KeyPressed(evt);
            }
        });

        txt2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txt2.setFont(new java.awt.Font("Norasi", 0, 14));
        txt2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt2FocusGained(evt);
            }
        });
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt2KeyPressed(evt);
            }
        });

        cmdDateChoose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar.png"))); // NOI18N
        cmdDateChoose1.setFocusable(false);
        cmdDateChoose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDateChoose1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel1.setText("ถึง");

        cmdDateChoose2.setFont(new java.awt.Font("Norasi", 0, 14));
        cmdDateChoose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar.png"))); // NOI18N
        cmdDateChoose2.setFocusable(false);
        cmdDateChoose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDateChoose2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cmdDateChoose1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cmdDateChoose2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cmdDateChoose2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(cmdDateChoose1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cmdPrint.setFont(new java.awt.Font("Norasi", 1, 14));
        cmdPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        cmdPrint.setText("พิมพ์");
        cmdPrint.setFocusable(false);
        cmdPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrintActionPerformed(evt);
            }
        });

        cmdProcess.setFont(new java.awt.Font("Norasi", 1, 14));
        cmdProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SandClock.png"))); // NOI18N
        cmdProcess.setText("F5-ประมวณผล");
        cmdProcess.setFocusable(false);
        cmdProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProcessActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setFont(new java.awt.Font("Norasi", 0, 14));

        txtPcode1.setFont(new java.awt.Font("Norasi", 0, 14));
        txtPcode1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPcode1FocusGained(evt);
            }
        });
        txtPcode1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPcode1KeyPressed(evt);
            }
        });

        txtPcode2.setFont(new java.awt.Font("Norasi", 0, 14));
        txtPcode2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPcode2FocusGained(evt);
            }
        });
        txtPcode2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPcode2KeyPressed(evt);
            }
        });

        cmdProductChoose3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        cmdProductChoose3.setFocusable(false);
        cmdProductChoose3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProductChoose3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel4.setText("ถึง");

        cmdProductChoose4.setFont(new java.awt.Font("Norasi", 0, 14));
        cmdProductChoose4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        cmdProductChoose4.setFocusable(false);
        cmdProductChoose4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProductChoose4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cmdProductChoose3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPcode2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cmdProductChoose4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(txtPcode2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cmdProductChoose4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(cmdProductChoose3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtPcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel5.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel5.setText("กำหนดช่วงแผนกสินค้า (Dept)");

        btn_exit.setFont(new java.awt.Font("Norasi", 1, 14));
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.gif"))); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.setFocusable(false);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(cmdProcess)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_exit)
                            .addComponent(cmdPrint)
                            .addComponent(cmdProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setVerticalAlignment(0);
        jLabel2.setVerticalAlignment(0);

        jTabbedPane1.setFont(new java.awt.Font("Norasi", 0, 14));

        tblHeader.setFont(new java.awt.Font("Norasi", 0, 14));
        tblHeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "แผนก", "ชื่อแผนก", "รหัสสินค้า (PLU Code)", "ชื่อสินค้า/รายการ", "จำนวน", "หน่วยนับ", "จำนวนเงิน", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHeader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblHeaderKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblHeader);

        txtHlist.setBackground(new java.awt.Color(175, 251, 209));
        txtHlist.setEditable(false);
        txtHlist.setFont(new java.awt.Font("Norasi", 1, 14));
        txtHlist.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHlist.setText("จำนวน 0 รายการ");
        txtHlist.setFocusable(false);
        txtHlist.setRequestFocusEnabled(false);

        txtAmt.setBackground(new java.awt.Color(254, 208, 163));
        txtAmt.setEditable(false);
        txtAmt.setFont(new java.awt.Font("Norasi", 1, 16));
        txtAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmt.setText("0.00");
        txtAmt.setFocusable(false);
        txtAmt.setRequestFocusEnabled(false);

        txtQty.setBackground(new java.awt.Color(254, 208, 163));
        txtQty.setFont(new java.awt.Font("Norasi", 1, 14));
        txtQty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQty.setText("0.00");
        txtQty.setFocusable(false);
        txtQty.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtHlist, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHlist, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("สรุปรายการบันทึกรายการของเสีย & สินค้าชำรุด ตามแผนกสินค้า (รวมทั้งหมด)", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1024)/2, (screenSize.height-768)/2, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

private void cmdPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrintActionPerformed
     report.sumProlostGroup1PrintReport(txt1.getText().trim(), txt2.getText().trim(), txtPcode1.getText().trim(), txtPcode2.getText().trim(), true);
}//GEN-LAST:event_cmdPrintActionPerformed

private void cmdDateChoose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDateChoose1ActionPerformed
    cmdDateChoose1();
}//GEN-LAST:event_cmdDateChoose1ActionPerformed

private void cmdDateChoose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDateChoose2ActionPerformed
    cmdDateChoose2();
}//GEN-LAST:event_cmdDateChoose2ActionPerformed

private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
    if(evt.getKeyCode() == evt.VK_F1){
        cmdDateChoose1();
    }
    else if(evt.getKeyCode() == evt.VK_ENTER){
        txt2.requestFocus();
    }
    else if (evt.getKeyCode() == evt.VK_ESCAPE) {
        dispose();
    }
    else if (evt.getKeyCode() == evt.VK_F5) {
        cmdProcess();
    }
}//GEN-LAST:event_txt1KeyPressed

private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
    if(evt.getKeyCode() == evt.VK_F1){
        cmdDateChoose2();
    }
    else if (evt.getKeyCode() == evt.VK_ENTER){
        txtPcode1.requestFocus();
    }
    else if (evt.getKeyCode() == evt.VK_ESCAPE) {
        dispose();
    }
    else if (evt.getKeyCode() == evt.VK_F5) {
        cmdProcess();
    }
    
}//GEN-LAST:event_txt2KeyPressed

private void txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1FocusGained
    if(txt1.getText().trim().equals("")){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,1);
        txt1.setText(Format.dateFmtShow.format(cal.getTime()));        
    }
    txt1.selectAll();
}//GEN-LAST:event_txt1FocusGained

private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained
    if(txt2.getText().trim().equals("")){        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, DateUtilities.getMaxDay( (GregorianCalendar) cal ));
        txt2.setText(Format.dateFmtShow.format(cal.getTime())); 
    }
    if(txt1.getText().trim().equals("")){
        txt1.requestFocus();
    }
    txt2.selectAll();
}//GEN-LAST:event_txt2FocusGained

private void cmdProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProcessActionPerformed
    cmdProcess();
}//GEN-LAST:event_cmdProcessActionPerformed

private void txtPcode1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPcode1FocusGained
    txtPcode1.selectAll();
}//GEN-LAST:event_txtPcode1FocusGained

private void txtPcode1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPcode1KeyPressed
    if(evt.getKeyCode() == evt.VK_F1){
        cmdProductChoose3ActionPerformed(new ActionEvent(new Object(),0,""));
    }
    else if(evt.getKeyCode() == evt.VK_ENTER){
        txtPcode2.requestFocus();
    }else if(evt.getKeyCode() == evt.VK_ESCAPE){
        dispose();
    }else if (evt.getKeyCode() == evt.VK_F5) {
        cmdProcess();
    }
}//GEN-LAST:event_txtPcode1KeyPressed

private void txtPcode2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPcode2FocusGained
    txtPcode2.selectAll();
}//GEN-LAST:event_txtPcode2FocusGained

private void txtPcode2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPcode2KeyPressed
    if(evt.getKeyCode() == evt.VK_F1){
        cmdProductChoose4ActionPerformed(new ActionEvent(new Object(),0,""));
    }
    else if(evt.getKeyCode() == evt.VK_ENTER){
        txt1.requestFocus();
    }else if(evt.getKeyCode() == evt.VK_ESCAPE){
        dispose();
    }else if (evt.getKeyCode() == evt.VK_F5) {
        cmdProcess();
    }
}//GEN-LAST:event_txtPcode2KeyPressed

private void cmdProductChoose3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProductChoose3ActionPerformed
    jdi_showgroupfile jbpa = new jdi_showgroupfile(new NimbusFrame(),true);
    jbpa.setLocation(cmdProductChoose3.getLocationOnScreen());
    jbpa.setVisible(true);
    if(jbpa.getValueFromShowGroupFile()!= null)
        txtPcode1.setText(jbpa.getValueFromShowGroupFile()[0]);
    txtPcode1.requestFocus();
}//GEN-LAST:event_cmdProductChoose3ActionPerformed

private void cmdProductChoose4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProductChoose4ActionPerformed
    jdi_showgroupfile jbpa = new jdi_showgroupfile(new NimbusFrame(),true);
    jbpa.setLocation(cmdProductChoose4.getLocationOnScreen());
    jbpa.setVisible(true);
    if(jbpa.getValueFromShowGroupFile()!= null)
        txtPcode2.setText(jbpa.getValueFromShowGroupFile()[0]);
    txtPcode2.requestFocus();
}//GEN-LAST:event_cmdProductChoose4ActionPerformed

private void tblHeaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblHeaderKeyPressed
    int key = evt.getKeyCode();
    if(key == evt.VK_ESCAPE){
        txt1.requestFocus();
    }
}//GEN-LAST:event_tblHeaderKeyPressed

private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
    dispose();
}//GEN-LAST:event_btn_exitActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jdi_report_sumProlostGroup dialog = new Jdi_report_sumProlostGroup(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton cmdDateChoose1;
    private javax.swing.JButton cmdDateChoose2;
    private javax.swing.JButton cmdPrint;
    private javax.swing.JButton cmdProcess;
    private javax.swing.JButton cmdProductChoose3;
    private javax.swing.JButton cmdProductChoose4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblHeader;
    private javax.swing.JFormattedTextField txt1;
    private javax.swing.JFormattedTextField txt2;
    private javax.swing.JTextField txtAmt;
    private javax.swing.JTextField txtHlist;
    private javax.swing.JFormattedTextField txtPcode1;
    private javax.swing.JFormattedTextField txtPcode2;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
    
    DefaultTableModel modelHeader;
    SnpReport report;
    
    private void resetTableModel(DefaultTableModel model){
        int rowCount = model.getRowCount();
        for(int i=0; i < rowCount; i++){
            model.removeRow(0);
        }
    }
    
    private void setTableHeader(){
        modelHeader = (DefaultTableModel) tblHeader.getModel();
        tblHeader.setShowGrid(true);
        tblHeader.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblHeader.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblHeader.setRowSelectionAllowed(true);
        tblHeader.setShowGrid(true);
        tblHeader.setBackground(Color.WHITE);
        tblHeader.setGridColor(Color.LIGHT_GRAY);
        JTableHeader header = tblHeader.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblHeader.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tblHeader.setRowHeight(25);
        
        TableColumn column = null;
        int[] colSize = {100,250, 100,250,100,65,100,10};
        tblHeader.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblHeader.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }
        
        
        TableColumnModel tcm = tblHeader.getColumnModel();
        
        DefaultTableCellRenderer d;
        
        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        tcm.getColumn(0).setCellRenderer(d);
        tcm.getColumn(1).setCellRenderer(d);
        tcm.getColumn(2).setCellRenderer(d);
        tcm.getColumn(3).setCellRenderer(d);
        tcm.getColumn(5).setCellRenderer(d);
        tcm.getColumn(7).setCellRenderer(d);
        
        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.RIGHT);
        tcm.getColumn(4).setCellRenderer(d);
        tcm.getColumn(6).setCellRenderer(d);
    }
    
    
    
    Calendar date1;
    Calendar date2;
    
    ////////////////////////////// CMD /////////////////////////////////////////
    private void cmdDateChoose1(){
        Point point = cmdDateChoose1.getLocationOnScreen();
        utilities.DateChooser.DateChooserDialog dcd = new utilities.DateChooser.DateChooserDialog(null,true,point);
        dcd.setVisible(true);
        txt1.setText(Format.dateFmtShow.format(dcd.getSelectedDate().getTime()));
        txt1.requestFocus();
    }
    private void cmdDateChoose2(){
        
        Point point = cmdDateChoose2.getLocationOnScreen();
        utilities.DateChooser.DateChooserDialog dcd = new utilities.DateChooser.DateChooserDialog(null,true,point);
        dcd.setVisible(true);
        txt2.setText(Format.dateFmtShow.format(dcd.getSelectedDate().getTime()));
        txt2.requestFocus();
    }
    private void cmdProcess(){
        
        resetTableModel(modelHeader);

        if (!(txt1.getText().equals("") || txt2.getText().equals(""))) {
            date1 = new GregorianCalendar();
            date2 = new GregorianCalendar();
            try {
                date1.setTime(Format.dateFmtShow.parse(txt1.getText().trim()));
                date2.setTime(Format.dateFmtShow.parse(txt2.getText().trim()));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            
            if(date1 == null || date2==null){
                return;
            }
            
            if(date1.compareTo(date2)>0){
                JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                return;
            }
        }
        
        showRecordToTableHeader(getRecordHeader(date1, date2));
          
    }
    
    
    private boolean searchFacF1Dialog(JTextField txt){
        Jdi_browse_factory rsd = new Jdi_browse_factory(new NimbusFrame(),true);
        rsd.setVisible(true);
        FactoryBean hrb = rsd.getDataRecord();
        if (hrb != null) {
            txt.setText(hrb.getFactorycode());
            return true;
        }else{
            txt.requestFocus();
            return false;
        }
    }  
    
    ////////////////////////////////////////////////////////////////////////////
    
    ///////////////////////// Event ////////////////////////////////////////////
    
    ////////////////////////////////////////////////////////////////////////////
  
    private ResultSet getRecordHeader(Calendar date1, Calendar date2)  {
        String pcode1 = txtPcode1.getText().trim();
        String pcode2 = txtPcode2.getText().trim();
        
        pcode1 = pcode1.equals("") ? "0" : pcode1;
        pcode2 = pcode2.equals("") ? "ZZZZZ" : pcode2;
        
        String sql = "SELECT c.R_PCode AS cr_pcode,p.pdesc,p.punit1, SUM( c.R_Qty ) AS sum1, SUM( c.R_Amount ) AS sum2 , g.groupname ,p.pgroup" +
                " FROM prolost c left join hprolost h on c.r_no = h.r_no " +
                " left join product p on c.r_pcode = p.pcode" +
                " left join groupfile g on p.pgroup = g.groupcode" +
                " WHERE (c.r_post = 'Y') and " +
                " (h.r_date >= '"+Format.dateFmtSql.format(date1.getTime())+"')"+" AND "+"(h.r_date <= '"+Format.dateFmtSql.format(date2.getTime())+"') AND " +
                " (p.pgroup >='"+pcode1+"' AND p.pgroup<='"+pcode2+"' )" +
                " GROUP BY c.r_pcode" +
                " ORDER BY p.pgroup,c.r_pcode";
        
        try {
            System.out.println("Header := "+sql);    
            return MySQLConnect.con.createStatement().executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    private void showRecordToTableHeader (ResultSet rs){
        if(rs!=null){
            double sumQty = 0;
            BigDecimal sumAmt = new BigDecimal("0");
            try {
                while (rs.next()) {
                    String[] row = new String[tblHeader.getColumnCount()];
                    row[0] = rs.getString("pgroup");      
                    row[1] = rs.getString("groupname");
                    row[2] = rs.getString("cr_pcode");      
                    row[3] = rs.getString("pdesc");
                    row[4] = Format.qtyFmt.format(rs.getInt("sum1"));
                    row[5] = rs.getString("punit1") ;
                    row[6] = Format.doubleFmt.format(rs.getFloat("sum2"));
                    
                    modelHeader.addRow(row);
                    double qty = rs.getFloat("sum1");
                    sumQty += qty;
                    BigDecimal amt = new BigDecimal(String.valueOf(rs.getFloat("sum2")));
                    sumAmt = sumAmt.add(amt);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
                ex.printStackTrace();
            }
            
            txtQty.setText(Format.qtyFmt.format(sumQty));
            txtAmt.setText(Format.doubleFmt.format(sumAmt.doubleValue()));
            txtHlist.setText("จำนวน "+tblHeader.getRowCount()+" รายการ");
        }
    }
 
 
}
