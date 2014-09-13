package Main.viewreport;

import Main.browser.Jdi_browse_factory;
import Bean.FactoryBean;
import DBcontrol.MySQLConnect;
import program.PublicVar;
import Main.browser.jdi_browse_mem;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import report.SnpReport;
import utilities.NimbusFrame;
import utilities.TableTestFormatRenderer;

public class Jdi_report_charge extends javax.swing.JDialog {

    public Jdi_report_charge(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PublicVar.ReturnString = "";
        if (txt2.getText().trim().equals("")) {
            txt2.setText(dateFmtShow.format(Calendar.getInstance().getTime()));
        }
        if (txt1.getText().trim().equals("")) {
            txt1.setText(dateFmtShow.format(Calendar.getInstance().getTime()));
            txt1.requestFocus();
        }

        setTableHeader();
        setTableDetail();
    }
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
        cmdProcess = new javax.swing.JButton();
        btn_browse = new javax.swing.JButton();
        emp_code = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emp_code2 = new javax.swing.JTextField();
        btn_browse1 = new javax.swing.JButton();
        cmdPrint = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        chk1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHeader = new javax.swing.JTable();
        txt5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetail = new javax.swing.JTable();
        txt6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงรายการใบบันทึกรายการแจกฟรี");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(254, 234, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel2.setText("กำหนดช่วงวันที่");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N

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
        cmdDateChoose1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdDateChoose1KeyPressed(evt);
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
        cmdDateChoose2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmdDateChoose2FocusGained(evt);
            }
        });
        cmdDateChoose2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdDateChoose2KeyPressed(evt);
            }
        });

        cmdProcess.setFont(new java.awt.Font("Norasi", 1, 14));
        cmdProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SandClock.png"))); // NOI18N
        cmdProcess.setText("F5-ประมวณผล");
        cmdProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProcessActionPerformed(evt);
            }
        });
        cmdProcess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdProcessKeyPressed(evt);
            }
        });

        btn_browse.setBackground(java.awt.Color.white);
        btn_browse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btn_browse.setFocusable(false);
        btn_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browseActionPerformed(evt);
            }
        });

        emp_code.setFont(new java.awt.Font("Norasi", 0, 14));
        emp_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emp_codeKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel4.setText("พนักงาน");

        jLabel5.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel5.setText("ถึง");

        emp_code2.setFont(new java.awt.Font("Norasi", 0, 14));
        emp_code2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emp_code2KeyPressed(evt);
            }
        });

        btn_browse1.setBackground(java.awt.Color.white);
        btn_browse1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btn_browse1.setFocusable(false);
        btn_browse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browse1ActionPerformed(evt);
            }
        });

        cmdPrint.setFont(new java.awt.Font("Norasi", 1, 14));
        cmdPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        cmdPrint.setText("พิมพ์");
        cmdPrint.setFocusable(false);
        cmdPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrintActionPerformed(evt);
            }
        });
        cmdPrint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmdPrintKeyReleased(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.gif"))); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.setFocusable(false);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDateChoose1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDateChoose2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emp_code, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_browse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emp_code2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_browse1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdProcess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDateChoose1)
                    .addComponent(jLabel1)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDateChoose2)
                    .addComponent(jLabel4)
                    .addComponent(emp_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_browse)
                    .addComponent(jLabel5)
                    .addComponent(emp_code2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_browse1)
                    .addComponent(cmdProcess)
                    .addComponent(cmdPrint)
                    .addComponent(btn_exit)))
        );

        //cmdSearchDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifying glass.jpg")));
        //cmdSearchDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifying glass.jpg")));

        chk1.setFont(new java.awt.Font("Norasi", 0, 14));
        chk1.setText("แสดงรายละเอียดในรายงาน");
        chk1.setFocusable(false);
        chk1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chk1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(652, 652, 652)
                .addComponent(chk1))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setVerticalAlignment(0);

        tblHeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่ (Date)", "เลขที่เอกสาร", "รหัสพนักงาน", "ชื่อพนักงาน", "หมายเหตุ", "จำนวนรายการ", "เข้าสต็อก", "วันที่ POST", "เวลา POST", "พนักงาน"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHeaderMouseClicked(evt);
            }
        });
        tblHeader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblHeaderKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblHeaderKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblHeader);

        txt5.setBackground(new java.awt.Color(175, 251, 209));
        txt5.setEditable(false);
        txt5.setFont(new java.awt.Font("Norasi", 1, 14));
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5.setText("จำนวนรวมทั้งหมด 0 บิล");
        txt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt5KeyPressed(evt);
            }
        });

        tblDetail.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tblDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัสสินค้า (PLU Code)", "ชื่อสินค้า/รายการ", "คลัง", "จำนวน", "หน่วย", "ราคา/หน่วย", "จำนวนเงิน", "วันที่บันทึก", "เวลาบันทึก", "ผู้บันทึก"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDetailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDetailKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblDetail);

        txt6.setBackground(new java.awt.Color(175, 251, 209));
        txt6.setEditable(false);
        txt6.setFont(new java.awt.Font("Norasi", 1, 14));
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setText("จำนวน 0 รายการ");
        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt6KeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel3.setText("รวมจำนวนเงิน");

        txt7.setBackground(new java.awt.Color(254, 208, 163));
        txt7.setEditable(false);
        txt7.setFont(new java.awt.Font("Norasi", 1, 16));
        txt7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt7.setText("0.00");
        txt7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt7KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(235, 235, 235))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(47, 47, 47))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1024)/2, (screenSize.height-768)/2, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

private void cmdPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrintActionPerformed
    SnpReport snp = new SnpReport();
    snp.chargePrintReport(txt1.getText().trim(), txt2.getText().trim(),chk1.isSelected(), true,
            emp_code.getText(), emp_code2.getText());
}//GEN-LAST:event_cmdPrintActionPerformed

private void cmdDateChoose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDateChoose1ActionPerformed
    cmdDateChoose1();
}//GEN-LAST:event_cmdDateChoose1ActionPerformed

private void cmdDateChoose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDateChoose2ActionPerformed
    cmdDateChoose2();
}//GEN-LAST:event_cmdDateChoose2ActionPerformed

private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_F1) {
        cmdDateChoose1();
    }
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt2.requestFocus();
    }
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_txt1KeyPressed

private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_F1) {
        cmdDateChoose2();
    }
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        emp_code.requestFocus();
        emp_code.selectAll();
    }
    escapeEvent(evt);
    F5Event(evt);

}//GEN-LAST:event_txt2KeyPressed

private void txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1FocusGained
    if (txt1.getText().trim().equals("")) {
        txt1.setText(dateFmtShow.format(Calendar.getInstance().getTime()));
        txt1.selectAll();
    }else{
        txt1.selectAll();
    }
}//GEN-LAST:event_txt1FocusGained

private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained
    if (txt2.getText().trim().equals("")) {
        txt2.setText(dateFmtShow.format(Calendar.getInstance().getTime()));
        txt2.selectAll();
    }else{
        txt2.selectAll();
    }
}//GEN-LAST:event_txt2FocusGained

private void cmdProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProcessActionPerformed
    cmdProcess();
    tblHeader.requestFocus();
}//GEN-LAST:event_cmdProcessActionPerformed

private void cmdDateChoose2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmdDateChoose2FocusGained
    if (txt1.getText().trim().equals("")) {
        txt1.requestFocus();
    }
}//GEN-LAST:event_cmdDateChoose2FocusGained

private void tblHeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHeaderMouseClicked
    if (evt.getClickCount() == 2) {
        int index = tblHeader.getSelectedRow();
        String text = (String) tblHeader.getValueAt(index, 1);
        PublicVar.ReturnString = text;
        this.dispose();
    } else {
        int index = tblHeader.getSelectedRow();
        String text = (String) tblHeader.getValueAt(index, 1);
        loadDetail(text);
    }
}//GEN-LAST:event_tblHeaderMouseClicked

private void tblHeaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblHeaderKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        int index = tblHeader.getSelectedRow();
        String text = (String) tblHeader.getValueAt(index, 1);
        PublicVar.ReturnString = text;
        this.dispose();
    }
}//GEN-LAST:event_tblHeaderKeyPressed

private void tblDetailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDetailKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        cmdPrint.requestFocus();
    }
}//GEN-LAST:event_tblDetailKeyPressed

private void cmdDateChoose1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdDateChoose1KeyPressed
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_cmdDateChoose1KeyPressed

private void cmdDateChoose2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdDateChoose2KeyPressed
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_cmdDateChoose2KeyPressed

private void cmdProcessKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdProcessKeyPressed
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_cmdProcessKeyPressed

private void chk1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chk1KeyReleased
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_chk1KeyReleased

private void cmdPrintKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdPrintKeyReleased
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_cmdPrintKeyReleased

private void tblHeaderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblHeaderKeyReleased
 if (evt.getKeyCode() == evt.VK_UP || evt.getKeyCode() == evt.VK_DOWN) {//GEN-LAST:event_tblHeaderKeyReleased
        int index = tblHeader.getSelectedRow();
        String text = (String) tblHeader.getValueAt(index, 1);
        loadDetail(text);
    }
    escapeEvent(evt);
    F5Event(evt);
}                                     

private void txt5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5KeyPressed
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_txt5KeyPressed

private void tblDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDetailKeyReleased
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_tblDetailKeyReleased

private void txt6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyPressed
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_txt6KeyPressed

private void txt7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyReleased
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_txt7KeyReleased

private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_formKeyPressed

private void btn_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browseActionPerformed
    jdi_browse_mem dialog = new jdi_browse_mem(null, true);
    dialog.setLocation(btn_browse.getLocationOnScreen());
    dialog.setVisible(true);

    String []arr = dialog.getEmployee();
    if(!arr[0].equals("")){
        emp_code.setText(arr[0]);
        emp_code2.requestFocus();
    }else{
        emp_code.requestFocus();
    }
}//GEN-LAST:event_btn_browseActionPerformed

private void emp_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emp_codeKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_F5){
        cmdProcessActionPerformed(null);
    }else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        emp_code2.requestFocus();
    }else if(evt.getKeyCode()==KeyEvent.VK_F1){
        jdi_browse_mem dialog = new jdi_browse_mem(null, true);
        dialog.setVisible(true);

        String []arr = dialog.getEmployee();
        if(!arr[0].equals("")){
            emp_code.setText(arr[0]);
            emp_code2.requestFocus();
        }else{
            emp_code.requestFocus();
        }
    }else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        escapeEvent(evt);
    }
}//GEN-LAST:event_emp_codeKeyPressed

private void emp_code2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emp_code2KeyPressed
    if (evt.getKeyCode() == evt.VK_ENTER) {
        cmdProcess.requestFocus();
    }else if(evt.getKeyCode()==evt.VK_F1){
        jdi_browse_mem dialog = new jdi_browse_mem(null, true);
        dialog.setVisible(true);

        String []arr = dialog.getEmployee();
        if(!arr[0].equals("")){
            emp_code2.setText(arr[0]);
            cmdProcess.requestFocus();
        }else{
            emp_code2.requestFocus();
        }
    }else if(evt.getKeyCode()==evt.VK_F5){
        cmdProcessActionPerformed(null);
    }else if(evt.getKeyCode()==evt.VK_ESCAPE){
        escapeEvent(evt);
    }
}//GEN-LAST:event_emp_code2KeyPressed

private void btn_browse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browse1ActionPerformed
    jdi_browse_mem dialog = new jdi_browse_mem(null, true);
    dialog.setLocation(btn_browse1.getLocationOnScreen());
    dialog.setVisible(true);

    String []arr = dialog.getEmployee();
    if(!arr[0].equals("")){
        emp_code2.setText(arr[0]);
        cmdProcess.requestFocus();
    }else{
        emp_code2.requestFocus();
    }
}//GEN-LAST:event_btn_browse1ActionPerformed

private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
    dispose();
}//GEN-LAST:event_btn_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Jdi_report_charge dialog = new Jdi_report_charge(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_browse;
    private javax.swing.JButton btn_browse1;
    private javax.swing.JButton btn_exit;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JButton cmdDateChoose1;
    private javax.swing.JButton cmdDateChoose2;
    private javax.swing.JButton cmdPrint;
    private javax.swing.JButton cmdProcess;
    private javax.swing.JTextField emp_code;
    private javax.swing.JTextField emp_code2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDetail;
    private javax.swing.JTable tblHeader;
    private javax.swing.JFormattedTextField txt1;
    private javax.swing.JFormattedTextField txt2;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    // End of variables declaration//GEN-END:variables
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    SimpleDateFormat dateFmtSql = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    SimpleDateFormat timeFmtShow = new SimpleDateFormat("hh:mm:ss", Locale.ENGLISH);
    DecimalFormat doubleFmt = new DecimalFormat("##,###,##0.00");
    DecimalFormat intFmt = new DecimalFormat("##,###,##0");
    DecimalFormat qtyFmt = new DecimalFormat("##,###,##0.000");
    DefaultTableModel modelHeader;
    DefaultTableModel modelDetail;

    private void resetTableModel(DefaultTableModel model) {
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            model.removeRow(0);
        }
    }

    private void setTableHeader() {
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
        tblHeader.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblHeader.setRowHeight(25);

        TableColumn column = null;
        int[] colSize = {90, 130, 80, 170, 210, 110, 70, 90, 90, 100};
        tblHeader.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblHeader.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }

        // Hidden Collumn not use
//        TableColumnModel colmodel = tblHeader.getColumnModel();
//        TableColumn c = colmodel.getColumn(2);
//        c.setMinWidth(0);
//        c.setMaxWidth(0);
//        c.setWidth(0);
//
//        c = colmodel.getColumn(3);
//        c.setMinWidth(0);
//        c.setMaxWidth(0);
//        c.setWidth(0);
//
//
//        TableColumnModel tcm = tblHeader.getColumnModel();
//
//        TableTestFormatRenderer r;
//        DefaultTableCellRenderer d;
//
//        d = new DefaultTableCellRenderer();
//        d.setHorizontalAlignment(SwingConstants.LEADING);
//        tcm.getColumn(1).setCellRenderer(d);
//        tcm.getColumn(2).setCellRenderer(d);
//        tcm.getColumn(4).setCellRenderer(d);
//        tcm.getColumn(9).setCellRenderer(d);
//
//        d = new DefaultTableCellRenderer();
//        d.setHorizontalAlignment(SwingConstants.CENTER);
//        tcm.getColumn(0).setCellRenderer(d);
//        tcm.getColumn(3).setCellRenderer(d);
//        tcm.getColumn(6).setCellRenderer(d);
//        tcm.getColumn(7).setCellRenderer(d);
//        tcm.getColumn(8).setCellRenderer(d);
//
//
//        d = new DefaultTableCellRenderer();
//        d.setHorizontalAlignment(SwingConstants.RIGHT);
//        tcm.getColumn(5).setCellRenderer(d);

    }

    private void setTableDetail() {
        modelDetail = (DefaultTableModel) tblDetail.getModel();
        tblDetail.setShowGrid(true);
        tblDetail.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblDetail.setRowSelectionAllowed(true);
        tblDetail.setShowGrid(true);
        tblDetail.setBackground(Color.WHITE);
        tblDetail.setGridColor(Color.LIGHT_GRAY);
        JTableHeader header = tblDetail.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblDetail.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblDetail.setRowHeight(25);

        TableColumn column = null;
        int[] colSize = {50, 120, 200, 50, 80, 80, 80, 100, 80, 80, 80};
        tblDetail.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblDetail.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }

        // Hidden Collumn not use        
        TableColumnModel tcm = tblDetail.getColumnModel();

        TableTestFormatRenderer r;
        DefaultTableCellRenderer d;

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        tcm.getColumn(0).setCellRenderer(d);
        tcm.getColumn(1).setCellRenderer(d);
        tcm.getColumn(2).setCellRenderer(d);
        tcm.getColumn(5).setCellRenderer(d);
        tcm.getColumn(10).setCellRenderer(d);

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.CENTER);
        tcm.getColumn(3).setCellRenderer(d);
        tcm.getColumn(8).setCellRenderer(d);
        tcm.getColumn(9).setCellRenderer(d);


        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.RIGHT);
        tcm.getColumn(4).setCellRenderer(d);
        tcm.getColumn(6).setCellRenderer(d);
        tcm.getColumn(7).setCellRenderer(d);
    }

    private void cmdDateChoose1() {
        Point point = cmdDateChoose1.getLocationOnScreen();
        utilities.DateChooser.DateChooserDialog dcd = new utilities.DateChooser.DateChooserDialog(null,true,point);
        dcd.setVisible(true);
        txt1.setText(dateFmtShow.format(dcd.getSelectedDate().getTime()));
        txt2.requestFocus();
    }

    private void cmdDateChoose2() {
        Point point = cmdDateChoose2.getLocationOnScreen();
        utilities.DateChooser.DateChooserDialog dcd = new utilities.DateChooser.DateChooserDialog(null,true,point);
        dcd.setVisible(true);
        txt2.setText(dateFmtShow.format(dcd.getSelectedDate().getTime()));
        emp_code.requestFocus();
    }

    private void cmdProcess() {
        txt6.setText("จำนวน 0 รายการ");
        txt7.setText("0.00");
        resetTableModel(modelHeader);
        resetTableModel(modelDetail);
        Calendar date1 = null;
        Calendar date2 = null;

        if (!(txt1.getText().equals("") || txt2.getText().equals(""))) {
            date1 = new GregorianCalendar();
            date2 = new GregorianCalendar();
            try {
                date1.setTime(dateFmtShow.parse(txt1.getText().trim()));
                date2.setTime(dateFmtShow.parse(txt2.getText().trim()));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

            if (date1 == null || date2 == null) {
                return;
            }

            if (date1.compareTo(date2) > 0) {
                JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                return;
            }
        }

        showRecordToTableHeader(getRecordHeader(date1, date2, emp_code.getText(), emp_code2.getText()));

        if (tblHeader.getRowCount() != 0) {
            tblHeader.setRowSelectionInterval(0, 0);
            loadDetail((String) tblHeader.getValueAt(0, 1));
        }

        txt5.setText("จำนวนรวมทั้งหมด " + tblHeader.getRowCount() + " บิล");
    }

    private void loadDetail(String text) {
        resetTableModel(modelDetail);        
        String sql = "SELECT r.*, p.* FROM charge r, product p "
                + "WHERE (r.r_pcode = p.pcode) AND r.r_no = '" + text + "'";
        try {
            //JOptionPane.showMessageDialog(this, "KKK");
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            while (rs.next()) {
                String[] row = new String[tblDetail.getColumnCount()];
                row[0] = intFmt.format(rs.getInt("r_que"));
                row[1] = rs.getString("r_pcode");
                row[2] = rs.getString("pdesc");
                row[3] = rs.getString("r_stock");
                row[4] = qtyFmt.format(rs.getFloat("r_qty"));
                row[5] = rs.getString("r_unit");
                row[6] = doubleFmt.format(rs.getFloat("r_cost"));
                row[7] = doubleFmt.format(rs.getFloat("r_amount"));
                row[8] = dateFmtShow.format(rs.getDate("r_entrydate"));
                row[9] = rs.getString("r_time");
                row[10] = rs.getString("r_user");
                modelDetail.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        txt6.setText("จำนวน " + tblDetail.getRowCount() + " รายการ");
        float total = 0;

        for (int i = 0; i < tblDetail.getRowCount(); i++) {
            try {
                total += doubleFmt.parse((String) tblDetail.getValueAt(i, 10)).floatValue();
            } catch (ParseException ex) {
//                ex.printStackTrace();
            }
        }

        txt7.setText(doubleFmt.format(total));

        if (tblDetail.getRowCount() != 0) {
            tblDetail.setRowSelectionInterval(0, 0);
        }
    }

    private boolean searchFacF1Dialog(JTextField txt) {
        Jdi_browse_factory rsd = new Jdi_browse_factory(new NimbusFrame(), true);
        rsd.setVisible(true);
        FactoryBean hrb = rsd.getDataRecord();
        if (hrb != null) {
            txt.setText(hrb.getFactorycode());
            return true;
        } else {
            txt.requestFocus();
            return false;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    ///////////////////////// Event ////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    private ResultSet getRecordHeader(Calendar date1, Calendar date2, String emp_code, String emp_code2) {
        if(emp_code.equals("")){
            emp_code = "0";
        }
        if(emp_code2.equals("")){
            emp_code2 = "9999999999999";
        }
        String sql = "SELECT * FROM hcharge "
                + "WHERE (r_date BETWEEN '" + dateFmtSql.format(date1.getTime()) + "' "
                + "AND '" + dateFmtSql.format(date2.getTime()) + "') " +
                "and emp_code between '"+emp_code+"' and '"+emp_code2+"' ";
        sql += " ORDER BY r_date,r_no";
        try {
            System.out.println(sql);
            return MySQLConnect.con.createStatement().executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private void showRecordToTableHeader(ResultSet rs) {
        if (rs != null) {
            try {
                while (rs.next()) {
                    String[] row = new String[tblHeader.getColumnCount()];
                    row[0] = dateFmtShow.format(rs.getDate("r_date"));
                    row[1] = rs.getString("r_no");
                    row[2] = rs.getString("emp_code");
                    row[3] = rs.getString("emp_name");
                    row[4] = rs.getString("r_remark");
                    row[5] = intFmt.format(rs.getInt("r_total"));
                    row[6] = rs.getString("r_post");
                    try {
                        row[7] = dateFmtShow.format(rs.getDate("r_postdate"));
                    } catch (Exception ex) {
                        row[7] = null;
                    }
                    row[8] = rs.getString("r_posttime");
                    row[9] = rs.getString("r_userpost");

                    modelHeader.addRow(row);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "gg");
                ex.printStackTrace();
            }
        }
    }

    private void escapeEvent(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == evt.VK_ESCAPE) {
            dispose();
        }
    }

    private void F5Event(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == evt.VK_F5) {
            cmdProcess();
            tblHeader.requestFocus();
        }
    }
}
