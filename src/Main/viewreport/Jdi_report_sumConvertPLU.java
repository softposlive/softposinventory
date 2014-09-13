
package Main.viewreport;

import DBcontrol.MySQLConnect;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import report.SnpReport;
import utilities.Format;
import utilities.NimbusFrame;
import utilities.date_time.DateUtilities;

public class Jdi_report_sumConvertPLU extends javax.swing.JDialog {

    public Jdi_report_sumConvertPLU(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,1);
        txt1.setText(Format.dateFmtShow.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_MONTH, DateUtilities.getMaxDay( (GregorianCalendar) cal ));
        txt2.setText(Format.dateFmtShow.format(cal.getTime())); 

        setTableHeader();
        setTbHeader();
        setTableDetail();
        
        setTableHeader2();
        setTbHeader2();
        setTableDetail2();

        report = new SnpReport();
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
        jPanel3 = new javax.swing.JPanel();
        txtPcode1 = new javax.swing.JFormattedTextField();
        txtPcode2 = new javax.swing.JFormattedTextField();
        cmdProductChoose3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmdProductChoose4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        txtHlist = new javax.swing.JTextField();
        txtAmt = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        cmdPrint = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb6 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb4 = new javax.swing.JTable();
        txtHlist1 = new javax.swing.JTextField();
        txtAmt1 = new javax.swing.JTextField();
        txtQty1 = new javax.swing.JTextField();
        cmdPrint1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb5 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("สรุปรายงานการแปรรูป ตามรหัสสินค้า");
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
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cmdDateChoose1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        cmdProductChoose3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdProductChoose3KeyPressed(evt);
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
        jLabel5.setText("กำหนดช่วงรหัสสินค้า (PLU Code)");

        b3.setFont(new java.awt.Font("Norasi", 1, 14));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.gif"))); // NOI18N
        b3.setText("ออก");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
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
                        .addGap(146, 146, 146)
                        .addComponent(cmdProcess)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(cmdProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setVerticalAlignment(0);
        jLabel2.setVerticalAlignment(0);

        jTabbedPane1.setFont(new java.awt.Font("Norasi", 0, 14));

        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่ (Date)", "เลขที่เอกสาร", "คลัง", "จำนวน", "จำนวนเงิน", "ผู้บันทึก", "วันที่บันทึก", "เวลาบันทึก"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb3);
        tb3.getColumnModel().getColumn(0).setMinWidth(80);
        tb3.getColumnModel().getColumn(0).setMaxWidth(80);
        tb3.getColumnModel().getColumn(1).setMinWidth(100);
        tb3.getColumnModel().getColumn(1).setMaxWidth(100);
        tb3.getColumnModel().getColumn(2).setMinWidth(80);
        tb3.getColumnModel().getColumn(2).setMaxWidth(80);
        tb3.getColumnModel().getColumn(3).setMinWidth(80);
        tb3.getColumnModel().getColumn(3).setMaxWidth(80);
        tb3.getColumnModel().getColumn(4).setMinWidth(80);
        tb3.getColumnModel().getColumn(4).setMaxWidth(80);
        tb3.getColumnModel().getColumn(5).setMinWidth(80);
        tb3.getColumnModel().getColumn(5).setMaxWidth(80);
        tb3.getColumnModel().getColumn(6).setMinWidth(80);
        tb3.getColumnModel().getColumn(6).setMaxWidth(80);
        tb3.getColumnModel().getColumn(7).setMinWidth(80);
        tb3.getColumnModel().getColumn(7).setMaxWidth(80);

        tb1.setAutoCreateRowSorter(true);
        tb1.setFont(new java.awt.Font("Norasi", 0, 14));
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสสินค้า (PLU Code)", "ชื่อสินค้า/รายการ", "จำนวน", "หน่วยนับ", "จำนวนเงิน"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tb1MouseReleased(evt);
            }
        });
        tb1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tb1);
        tb1.getColumnModel().getColumn(0).setMinWidth(80);
        tb1.getColumnModel().getColumn(0).setMaxWidth(80);
        tb1.getColumnModel().getColumn(1).setMinWidth(250);
        tb1.getColumnModel().getColumn(1).setMaxWidth(250);
        tb1.getColumnModel().getColumn(2).setMinWidth(80);
        tb1.getColumnModel().getColumn(2).setMaxWidth(80);
        tb1.getColumnModel().getColumn(3).setMinWidth(80);
        tb1.getColumnModel().getColumn(3).setMaxWidth(80);
        tb1.getColumnModel().getColumn(4).setMinWidth(80);
        tb1.getColumnModel().getColumn(4).setMaxWidth(80);

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

        cmdPrint.setFont(new java.awt.Font("Norasi", 1, 14));
        cmdPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        cmdPrint.setText("พิมพ์");
        cmdPrint.setFocusable(false);
        cmdPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrintActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel3.setText("จำนวนรวม");

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสสินค้า", "ชื่อสินค้า"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tb2);
        tb2.getColumnModel().getColumn(0).setMinWidth(80);
        tb2.getColumnModel().getColumn(0).setMaxWidth(80);
        tb2.getColumnModel().getColumn(1).setMinWidth(250);
        tb2.getColumnModel().getColumn(1).setMaxWidth(250);

        jButton1.setText(">>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtHlist, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222)
                        .addComponent(cmdPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jScrollPane5, 0, 0, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(161, 161, 161))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtHlist, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdPrint)
                    .addComponent(jLabel3)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("รายงานสรุปการรับสินค้าจากการแปรรูป", jPanel4);

        tb6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่ (Date)", "เลขที่เอกสาร", "คลัง", "จำนวน", "จำนวนเงิน", "ผู้บันทึก", "วันที่บันทึก", "เวลาบันทึก"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tb6);
        tb6.getColumnModel().getColumn(0).setMinWidth(80);
        tb6.getColumnModel().getColumn(0).setMaxWidth(80);
        tb6.getColumnModel().getColumn(1).setMinWidth(100);
        tb6.getColumnModel().getColumn(1).setMaxWidth(100);
        tb6.getColumnModel().getColumn(2).setMinWidth(80);
        tb6.getColumnModel().getColumn(2).setMaxWidth(80);
        tb6.getColumnModel().getColumn(3).setMinWidth(80);
        tb6.getColumnModel().getColumn(3).setMaxWidth(80);
        tb6.getColumnModel().getColumn(4).setMinWidth(80);
        tb6.getColumnModel().getColumn(4).setMaxWidth(80);
        tb6.getColumnModel().getColumn(5).setMinWidth(80);
        tb6.getColumnModel().getColumn(5).setMaxWidth(80);
        tb6.getColumnModel().getColumn(6).setMinWidth(80);
        tb6.getColumnModel().getColumn(6).setMaxWidth(80);
        tb6.getColumnModel().getColumn(7).setMinWidth(80);
        tb6.getColumnModel().getColumn(7).setMaxWidth(80);

        tb4.setAutoCreateRowSorter(true);
        tb4.setFont(new java.awt.Font("Norasi", 0, 14));
        tb4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสสินค้า (PLU Code)", "ชื่อสินค้า/รายการ", "จำนวน", "หน่วยนับ", "จำนวนเงิน"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tb4MouseReleased(evt);
            }
        });
        tb4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb4KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(tb4);
        tb4.getColumnModel().getColumn(0).setMinWidth(80);
        tb4.getColumnModel().getColumn(0).setMaxWidth(80);
        tb4.getColumnModel().getColumn(1).setMinWidth(250);
        tb4.getColumnModel().getColumn(1).setMaxWidth(250);
        tb4.getColumnModel().getColumn(2).setMinWidth(80);
        tb4.getColumnModel().getColumn(2).setMaxWidth(80);
        tb4.getColumnModel().getColumn(3).setMinWidth(80);
        tb4.getColumnModel().getColumn(3).setMaxWidth(80);
        tb4.getColumnModel().getColumn(4).setMinWidth(80);
        tb4.getColumnModel().getColumn(4).setMaxWidth(80);

        txtHlist1.setBackground(new java.awt.Color(175, 251, 209));
        txtHlist1.setEditable(false);
        txtHlist1.setFont(new java.awt.Font("Norasi", 1, 14));
        txtHlist1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHlist1.setText("จำนวน 0 รายการ");
        txtHlist1.setFocusable(false);
        txtHlist1.setRequestFocusEnabled(false);

        txtAmt1.setBackground(new java.awt.Color(254, 208, 163));
        txtAmt1.setEditable(false);
        txtAmt1.setFont(new java.awt.Font("Norasi", 1, 16));
        txtAmt1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmt1.setText("0.00");
        txtAmt1.setFocusable(false);
        txtAmt1.setRequestFocusEnabled(false);

        txtQty1.setBackground(new java.awt.Color(254, 208, 163));
        txtQty1.setFont(new java.awt.Font("Norasi", 1, 14));
        txtQty1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQty1.setText("0.00");
        txtQty1.setFocusable(false);
        txtQty1.setRequestFocusEnabled(false);

        cmdPrint1.setFont(new java.awt.Font("Norasi", 1, 14));
        cmdPrint1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        cmdPrint1.setText("พิมพ์");
        cmdPrint1.setFocusable(false);
        cmdPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrint1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel6.setText("จำนวนรวม");

        tb5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสสินค้า", "ชื่อสินค้า"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tb5);
        tb5.getColumnModel().getColumn(0).setMinWidth(80);
        tb5.getColumnModel().getColumn(0).setMaxWidth(80);
        tb5.getColumnModel().getColumn(1).setMinWidth(250);
        tb5.getColumnModel().getColumn(1).setMaxWidth(250);

        jButton2.setText(">>");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtHlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQty1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222)
                        .addComponent(cmdPrint1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jScrollPane6, 0, 0, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(161, 161, 161))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtHlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdPrint1)
                    .addComponent(jLabel6)
                    .addComponent(txtQty1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("รายงานสรุปการจ่ายสินค้าเพื่อการแปรรูป", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1024)/2, (screenSize.height-768)/2, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

private void cmdDateChoose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDateChoose1ActionPerformed
    cmdDateChoose1();
}//GEN-LAST:event_cmdDateChoose1ActionPerformed

private void cmdDateChoose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDateChoose2ActionPerformed
    cmdDateChoose2();
}//GEN-LAST:event_cmdDateChoose2ActionPerformed

private void cmdProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProcessActionPerformed
    cmdProcess();
    tb3.requestFocus();
}//GEN-LAST:event_cmdProcessActionPerformed

private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    escapeEvent(evt);
    F5Event(evt);
}//GEN-LAST:event_formKeyPressed

private void cmdProductChoose3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProductChoose3ActionPerformed
    Jdi_Inv_product jbpa = new Jdi_Inv_product(new NimbusFrame(),true);
    jbpa.setLocation(cmdProductChoose3.getLocationOnScreen());
    jbpa.setVisible(true);
    if(jbpa.getDataRecord() != null){
        txtPcode1.setText(jbpa.getDataRecord().getPcode());
    }
}//GEN-LAST:event_cmdProductChoose3ActionPerformed

private void cmdProductChoose3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdProductChoose3KeyPressed
// TODO add your handling code here:
}//GEN-LAST:event_cmdProductChoose3KeyPressed

private void cmdProductChoose4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProductChoose4ActionPerformed
    Jdi_Inv_product jbpa = new Jdi_Inv_product(new NimbusFrame(),true);
    jbpa.setLocation(cmdProductChoose4.getLocationOnScreen());
    jbpa.setVisible(true);
    if(jbpa.getDataRecord() != null){
        txtPcode2.setText(jbpa.getDataRecord().getPcode());
    }
}//GEN-LAST:event_cmdProductChoose4ActionPerformed

private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_F1){
        cmdDateChoose1();
    }
    else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        txt2.requestFocus();
    }else if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
        dispose();
    }else if (evt.getKeyCode() == KeyEvent.VK_F5) {
        cmdProcess();
    }
}//GEN-LAST:event_txt1KeyPressed

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

private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_F1){
        cmdDateChoose2();
    }
    else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        txtPcode1.requestFocus();
    }else if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
        dispose();
    }else if (evt.getKeyCode() == KeyEvent.VK_F5) {
        cmdProcess();
    }
}//GEN-LAST:event_txt2KeyPressed

private void txtPcode1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPcode1KeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_F1){
        cmdProductChoose3ActionPerformed(new ActionEvent(new Object(),0,""));
    }
    else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        txtPcode2.requestFocus();
    }else if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
        dispose();
    }else if (evt.getKeyCode() == KeyEvent.VK_F5) {
        cmdProcess();
    }
}//GEN-LAST:event_txtPcode1KeyPressed

private void txtPcode1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPcode1FocusGained
    txtPcode1.selectAll();
}//GEN-LAST:event_txtPcode1FocusGained

private void txtPcode2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPcode2KeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_F1){
        cmdProductChoose4ActionPerformed(new ActionEvent(new Object(),0,""));
    }else if (evt.getKeyCode() == KeyEvent.VK_F5) {
        cmdProcess();
    }
}//GEN-LAST:event_txtPcode2KeyPressed

private void txtPcode2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPcode2FocusGained
    txtPcode2.selectAll();
}//GEN-LAST:event_txtPcode2FocusGained

private void cmdPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrintActionPerformed
    report.sumConvertAddPrintReport(txt1.getText().trim(), txt2.getText().trim(),
            txtPcode1.getText().trim(), txtPcode2.getText().trim(),
            "", "", true);
}//GEN-LAST:event_cmdPrintActionPerformed

private void tb1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb1KeyPressed
    int key = evt.getKeyCode();
    if(key == KeyEvent.VK_ESCAPE){
        txt1.requestFocus();
    }else if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN || key == KeyEvent.VK_ENTER) {
        int index = tb1.getSelectedRow();
        if (index != -1) {
            Calendar date1 = null;
            Calendar date2 = null;

            if (!(txt1.getText().equals("") || txt2.getText().equals(""))) {
                date1 = new GregorianCalendar();
                date2 = new GregorianCalendar();
                try {
                    date1.setTime(Format.dateFmtShow.parse(txt1.getText().trim()));
                    date2.setTime(Format.dateFmtShow.parse(txt2.getText().trim()));
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

                if (date1 == null || date2 == null) {
                    JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                    return;
                }

                if (date1.compareTo(date2) > 0) {
                    JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                    return;
                }
            }

            String pcode1 = txtPcode1.getText().trim();
            String pcode2 = txtPcode2.getText().trim();

            pcode1 = pcode1.equals("") ? "0" : pcode1;
            pcode2 = pcode2.equals("") ? "ZZZZZ" : pcode2;

            loadDetail1(date1, date2, tb1.getValueAt(index, 0).toString());
        }
    }
}//GEN-LAST:event_tb1KeyPressed

private void tb1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseReleased
    int index = tb1.getSelectedRow();
    if (index != -1) {
        Calendar date1 = null;
        Calendar date2 = null;

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
                JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                return;
            }

            if(date1.compareTo(date2)>0){
                JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                return;
            }
        }

        String pcode1 = txtPcode1.getText().trim();
        String pcode2 = txtPcode2.getText().trim();

        pcode1 = pcode1.equals("") ? "0" : pcode1;
        pcode2 = pcode2.equals("") ? "ZZZZZ" : pcode2;

        loadDetail1(date1,date2,tb1.getValueAt(index, 0).toString());
        loadCheck1(date1,date2);
    }
}//GEN-LAST:event_tb1MouseReleased

private void tb4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb4MouseReleased
    int index = tb4.getSelectedRow();
    if (index != -1) {
        Calendar date1 = null;
        Calendar date2 = null;

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
                JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                return;
            }

            if(date1.compareTo(date2)>0){
                JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                return;
            }
        }

        String pcode1 = txtPcode1.getText().trim();
        String pcode2 = txtPcode2.getText().trim();

        pcode1 = pcode1.equals("") ? "0" : pcode1;
        pcode2 = pcode2.equals("") ? "ZZZZZ" : pcode2;

        loadDetail2(date1,date2, ""+tb4.getValueAt(index, 0));
        loadCheck2(date1,date2);
    }
}//GEN-LAST:event_tb4MouseReleased

private void tb4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb4KeyPressed
    int key = evt.getKeyCode();
    if(key == KeyEvent.VK_ESCAPE){
        txt1.requestFocus();
    }else if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN || key == KeyEvent.VK_ENTER) {
        int index = tb4.getSelectedRow();
        if (index != -1) {
            Calendar date1 = null;
            Calendar date2 = null;

            if (!(txt1.getText().equals("") || txt2.getText().equals(""))) {
                date1 = new GregorianCalendar();
                date2 = new GregorianCalendar();
                try {
                    date1.setTime(Format.dateFmtShow.parse(txt1.getText().trim()));
                    date2.setTime(Format.dateFmtShow.parse(txt2.getText().trim()));
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

                if (date1 == null || date2 == null) {
                    JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                    return;
                }

                if (date1.compareTo(date2) > 0) {
                    JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                    return;
                }
            }

            String pcode1 = txtPcode1.getText().trim();
            String pcode2 = txtPcode2.getText().trim();

            pcode1 = pcode1.equals("") ? "0" : pcode1;
            pcode2 = pcode2.equals("") ? "ZZZZZ" : pcode2;

            loadDetail2(date1, date2, ""+tb4.getValueAt(index, 0));
        }
    }
}//GEN-LAST:event_tb4KeyPressed

private void cmdPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrint1ActionPerformed
    report.sumConvertPayPrintReport(txt1.getText().trim(), txt2.getText().trim(),
            txtPcode1.getText().trim(), txtPcode2.getText().trim(),
            "", "", true);
}//GEN-LAST:event_cmdPrint1ActionPerformed

private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
    dispose();
}//GEN-LAST:event_b3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jdi_report_sumConvertPLU dialog = new Jdi_report_sumConvertPLU(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton b3;
    private javax.swing.JButton cmdDateChoose1;
    private javax.swing.JButton cmdDateChoose2;
    private javax.swing.JButton cmdPrint;
    private javax.swing.JButton cmdPrint1;
    private javax.swing.JButton cmdProcess;
    private javax.swing.JButton cmdProductChoose3;
    private javax.swing.JButton cmdProductChoose4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tb3;
    private javax.swing.JTable tb4;
    private javax.swing.JTable tb5;
    private javax.swing.JTable tb6;
    private javax.swing.JFormattedTextField txt1;
    private javax.swing.JFormattedTextField txt2;
    private javax.swing.JTextField txtAmt;
    private javax.swing.JTextField txtAmt1;
    private javax.swing.JTextField txtHlist;
    private javax.swing.JTextField txtHlist1;
    private javax.swing.JFormattedTextField txtPcode1;
    private javax.swing.JFormattedTextField txtPcode2;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtQty1;
    // End of variables declaration//GEN-END:variables
    
    private DefaultTableModel modelT1;
    private DefaultTableModel modelT2;
    private DefaultTableModel modelT3;
    private DefaultTableModel modelT4;
    private DefaultTableModel modelT5;
    private DefaultTableModel modelT6;
    
    SnpReport report;
    
    private void resetTableModel(DefaultTableModel model){
        int rowCount = model.getRowCount();
        for(int i=0; i < rowCount; i++){
            model.removeRow(0);
        }
    }
    private void setTbHeader2(){
        modelT4 = (DefaultTableModel) tb4.getModel();
        tb4.setShowGrid(true);
        tb4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb4.setRowSelectionAllowed(true);
        tb4.setBackground(Color.WHITE);
        tb4.setGridColor(Color.LIGHT_GRAY);
        JTableHeader header = tb4.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tb4.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tb4.setRowHeight(25);
    }
    private void setTableHeader2(){
        modelT5 = (DefaultTableModel) tb5.getModel();
        tb5.setShowGrid(true);
        tb5.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb5.setRowSelectionAllowed(true);
        tb5.setBackground(Color.WHITE);
        tb5.setGridColor(Color.LIGHT_GRAY);
        JTableHeader header = tb5.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tb5.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tb5.setRowHeight(25);

        TableColumnModel tcm = tb5.getColumnModel();
        DefaultTableCellRenderer d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        d.setBackground(new Color(154,219,242));
        tcm.getColumn(0).setCellRenderer(d);
        tcm.getColumn(1).setCellRenderer(d);
    }
    private void setTableDetail2(){
        modelT6 = (DefaultTableModel) tb6.getModel();
        tb6.setShowGrid(true);
        tb6.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb6.setRowSelectionAllowed(true);
        tb6.setBackground(Color.WHITE);
        tb6.setGridColor(Color.LIGHT_GRAY);
        JTableHeader header = tb6.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tb6.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tb6.setRowHeight(25);
    }
    private void setTbHeader(){
        modelT1 = (DefaultTableModel) tb1.getModel();
        tb1.setShowGrid(true);
        tb1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb1.setRowSelectionAllowed(true);
        tb1.setBackground(Color.WHITE);
        tb1.setGridColor(Color.LIGHT_GRAY);
        JTableHeader header = tb1.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tb1.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tb1.setRowHeight(25);
    }
    private void setTableHeader(){
        modelT2 = (DefaultTableModel) tb2.getModel();
        tb2.setShowGrid(true);
        tb2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb2.setRowSelectionAllowed(true);
        tb2.setBackground(Color.WHITE);
        tb2.setGridColor(Color.LIGHT_GRAY);
        JTableHeader header = tb2.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tb2.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tb2.setRowHeight(25);

        TableColumnModel tcm = tb2.getColumnModel();
        DefaultTableCellRenderer d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        d.setBackground(new Color(253,138,129));
        tcm.getColumn(0).setCellRenderer(d);
        tcm.getColumn(1).setCellRenderer(d);
    } 
    private void setTableDetail(){
        modelT3 = (DefaultTableModel) tb3.getModel();
        tb3.setShowGrid(true);
        tb3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb3.setRowSelectionAllowed(true);
        tb3.setBackground(Color.WHITE);
        tb3.setGridColor(Color.LIGHT_GRAY);
        JTableHeader header = tb3.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tb3.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tb3.setRowHeight(25);
    }
    
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
        resetTableModel(modelT1);
        resetTableModel(modelT2);
        resetTableModel(modelT3);
        resetTableModel(modelT4);
        resetTableModel(modelT5);
        resetTableModel(modelT6);
        
        Calendar date1 = null;
        Calendar date2 = null;
    
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
                JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                return;
            }
            
            if(date1.compareTo(date2)>0){
                JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ให้ถูกต้อง");
                return;
            }
        }
        
        String pcode1 = txtPcode1.getText().trim();
        String pcode2 = txtPcode2.getText().trim();
        
        pcode1 = pcode1.equals("") ? "0" : pcode1;
        pcode2 = pcode2.equals("") ? "ZZZZZ" : pcode2;
        
        pageOne(date1,date2,pcode1,pcode2);
        pageTwo(date1,date2,pcode1,pcode2);
    }
    
    private void pageOne(Calendar date1, Calendar date2, String pcode1 , String pcode2){  
        showRecordToTable1(getRecordHeaderAll1(date1, date2, pcode1,pcode2));

        if(tb1.getRowCount() != 0){
            tb1.setRowSelectionInterval(0, 0);
            loadDetail1(date1,date2,(String)tb1.getValueAt(0, 0));
        }
    }
    private void pageTwo(Calendar date1, Calendar date2, String pcode1 , String pcode2){
        showRecordToTable2(getRecordHeaderAll2(date1, date2, pcode1,pcode2));

        if(tb4.getRowCount() != 0){
            tb4.setRowSelectionInterval(0, 0);
            loadDetail2(date1,date2, ""+tb4.getValueAt(0, 0));
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    ///////////////////////// Event ////////////////////////////////////////////
    
    ////////////////////////////////////////////////////////////////////////////
  
    private ResultSet getRecordHeaderAll1(Calendar date1, Calendar date2, String pcode1 , String pcode2)  {
        String sql = "SELECT `convert`.R_PCode, SUM( `convert`.R_Qty ), " +
                "SUM( `convert`.R_Amount ), `convert`.R_No, `convert`.R_Post, " +
                "`convert`.R_Que, `convert`.R_Stock, `hconvert`.R_No, " +
                "`hconvert`.R_Date,Product.pdesc,Product.punit1" +
                    " FROM `convert` left JOIN `hconvert` " +
                    " ON  (`convert`.R_No = `hconvert`.R_No)" +
                    " left JOIN product Product " +
                    " ON (`convert`.r_pcode = Product.pcode)" +
                    " WHERE  (`convert`.R_Post = 'Y') and " +
                    " (`hconvert`.R_Date>='"+Format.dateFmtSql.format(date1.getTime())+"') " +
                    "and (`hconvert`.R_Date<='"+Format.dateFmtSql.format(date2.getTime())+"') and" +
                    " (`convert`.R_PCode>='"+pcode1+"') and (`convert`.R_PCode<='"+pcode2+"') " +
                    "and `convert`.R_Type='CON+' " +
                    " GROUP BY `convert`.R_PCode" +
                    " ORDER BY `convert`.R_PCode";
        System.out.println(sql);
        try {
            System.out.println("Header := "+sql);    
            return MySQLConnect.con.createStatement().executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    private ResultSet getRecordHeaderAll2(Calendar date1, Calendar date2, String pcode1 , String pcode2)  {
        String sql = "SELECT `convert`.R_PCode, SUM( `convert`.R_Qty ), " +
                "SUM( `convert`.R_Amount ), `convert`.R_No, `convert`.R_Post, " +
                "`convert`.R_Que, `convert`.R_Stock, `hconvert`.R_No, " +
                "`hconvert`.R_Date,Product.pdesc,Product.punit1" +
                    " FROM `convert` left JOIN `hconvert` " +
                    " ON  (`convert`.R_No = `hconvert`.R_No)" +
                    " left JOIN product Product " +
                    " ON (`convert`.r_pcode = Product.pcode)" +
                    " WHERE  (`convert`.R_Post = 'Y') and " +
                    " (`hconvert`.R_Date>='"+Format.dateFmtSql.format(date1.getTime())+"') " +
                    "and (`hconvert`.R_Date<='"+Format.dateFmtSql.format(date2.getTime())+"') and" +
                    " (`convert`.R_PCode>='"+pcode1+"') and (`convert`.R_PCode<='"+pcode2+"') " +
                    "and `convert`.R_Type='CON-' " +
                    " GROUP BY `convert`.R_PCode" +
                    " ORDER BY `convert`.R_PCode";
        System.out.println(sql);
        try {
            System.out.println("Header := "+sql);
            return MySQLConnect.con.createStatement().executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    private void showRecordToTable1 (ResultSet rs){
        if(rs!=null){
            double sumQty = 0;
            BigDecimal sumAmt = new BigDecimal("0");
            try {
                while (rs.next()) {
                    String[] row = new String[tb1.getColumnCount()];
                    row[0] = rs.getString("r_pcode");      
                    row[1] = rs.getString("pdesc");
                    row[2] = Format.qtyFmt.format(rs.getDouble("SUM( `convert`.R_Qty )"));
                    row[3] = rs.getString("punit1") ;
                    row[4] = Format.doubleFmt.format(rs.getFloat("SUM( `convert`.R_Amount )"));
                    
                    modelT1.addRow(row);
                    double qty = rs.getDouble("SUM( `convert`.R_Qty )");
                    sumQty += qty;
                    BigDecimal amt = new BigDecimal(String.valueOf(rs.getFloat("SUM( `convert`.R_Amount )")));
                    sumAmt = sumAmt.add(amt);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
                ex.printStackTrace();
            }
            
            txtQty.setText(Format.qtyFmt.format(sumQty));
            txtAmt.setText(Format.doubleFmt.format(sumAmt.doubleValue()));
            txtHlist.setText("จำนวน "+tb1.getRowCount()+" รายการ");
        }
    }
    private void showRecordToTable2 (ResultSet rs){
        if(rs!=null){
            double sumQty = 0;
            BigDecimal sumAmt = new BigDecimal("0");
            try {
                while (rs.next()) {
                    String[] row = new String[tb4.getColumnCount()];
                    row[0] = rs.getString("r_pcode");
                    row[1] = rs.getString("pdesc");
                    row[2] = Format.qtyFmt.format(rs.getDouble("SUM( `convert`.R_Qty )"));
                    row[3] = rs.getString("punit1") ;
                    row[4] = Format.doubleFmt.format(rs.getFloat("SUM( `convert`.R_Amount )"));

                    modelT4.addRow(row);
                    double qty = rs.getDouble("SUM( `convert`.R_Qty )");
                    sumQty += qty;
                    BigDecimal amt = new BigDecimal(String.valueOf(rs.getFloat("SUM( `convert`.R_Amount )")));
                    sumAmt = sumAmt.add(amt);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
                ex.printStackTrace();
            }

            txtQty1.setText(Format.qtyFmt.format(sumQty));
            txtAmt1.setText(Format.doubleFmt.format(sumAmt.doubleValue()));
            txtHlist1.setText("จำนวน "+tb4.getRowCount()+" รายการ");
        }
    }
    private void loadDetail1(Calendar date1, Calendar date2, String pcode){
        resetTableModel(modelT3);

        String sql = "SELECT DISTINCT `convert`.R_No, `convert`.R_Que, " +
                "`convert`.R_PCode, `convert`.R_Stock, " +
                "`convert`.R_Qty, `convert`.R_Post, " +
                "`convert`.R_Amount, `convert`.R_Type," +
                "`convert`.R_User, `convert`.R_Time, `convert`.R_EntryDate, `hconvert`.R_No, " +
                "`hconvert`.R_Date, `hconvert`.R_Remark, " +
                "`hconvert`.R_User, `hconvert`.R_Post, " +
                "`hconvert`.R_UserPost, `hconvert`.R_PostDate, `hconvert`.R_PostTime" +
                " FROM `convert`" +
                " left JOIN `hconvert` ON  (`convert`.R_No = `hconvert`.R_No)" +
                " where (`convert`.R_Post='Y') and " +
                " (`hconvert`.R_Date>='"+Format.dateFmtSql.format(date1.getTime())+"') " +
                "and (`hconvert`.R_Date<='"+Format.dateFmtSql.format(date2.getTime())+"') and " +
                " (`convert`.R_PCode='"+pcode+"') and r_type='CON+' " +
                " Order by `hconvert`.R_Date";

        System.out.println(" loadDetail = "+sql);
        try {
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            while(rs.next()){
                String[] row = new String[tb3.getColumnCount()];

                try{
                        row[0] = Format.dateFmtShow.format(rs.getDate("r_date"));
                    }catch(Exception ex){
                        row[0] = null;
                    }

                row[1] = rs.getString("r_no");
                row[2] = rs.getString("r_stock");
                row[3] = Format.qtyFmt.format(rs.getDouble("r_qty"));
                row[4] = Format.doubleFmt.format(rs.getFloat("r_amount"));
                row[5] = rs.getString("r_userpost");
                row[6] = rs.getString("r_postdate");
                row[7] = rs.getString("r_posttime");

                modelT3.addRow(row);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private void loadCheck1(Calendar date1, Calendar date2){
        resetTableModel(modelT2);

        String sql = "SELECT pcode, pdesc " +
                " FROM `convert` inner JOIN `hconvert` " +
                "ON `convert`.R_No = `hconvert`.R_No " +
                "inner join product on `convert`.r_pcode=product.pcode " +
                " where `convert`.R_Post='Y' " +
                "and `hconvert`.R_Date>='"+Format.dateFmtSql.format(date1.getTime())+"' " +
                "and `hconvert`.R_Date<='"+Format.dateFmtSql.format(date2.getTime())+"' " +
                "and `convert`.R_Type='CON-' " +
                "group by pcode";
        System.err.println(sql);
        try {
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            while(rs.next()){
                String[] row = new String[tb2.getColumnCount()];
                row[0] = rs.getString("pcode");
                row[1] = rs.getString("pdesc");
                
                modelT2.addRow(row);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private void loadCheck2(Calendar date1, Calendar date2){
        resetTableModel(modelT5);

        String sql = "SELECT pcode, pdesc " +
                " FROM `convert` inner JOIN `hconvert` " +
                "ON `convert`.R_No = `hconvert`.R_No " +
                "inner join product on `convert`.r_pcode=product.pcode " +
                " where `convert`.R_Post='Y' " +
                "and `hconvert`.R_Date>='"+Format.dateFmtSql.format(date1.getTime())+"' " +
                "and `hconvert`.R_Date<='"+Format.dateFmtSql.format(date2.getTime())+"' " +
                "and `convert`.R_Type='CON+' " +
                "group by pcode";
        System.err.println(sql);
        try {
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            while(rs.next()){
                String[] row = new String[tb2.getColumnCount()];
                row[0] = rs.getString("pcode");
                row[1] = rs.getString("pdesc");

                modelT5.addRow(row);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private void loadDetail2(Calendar date1, Calendar date2, String pcode){
        resetTableModel(modelT6);

        String sql = "SELECT DISTINCT `convert`.R_No, `convert`.R_Que, " +
                "`convert`.R_PCode, `convert`.R_Stock, " +
                "`convert`.R_Qty, `convert`.R_Post, " +
                "`convert`.R_Amount, `convert`.R_Type," +
                "`convert`.R_User, `convert`.R_Time, `convert`.R_EntryDate, `hconvert`.R_No, " +
                "`hconvert`.R_Date, `hconvert`.R_Remark, " +
                "`hconvert`.R_User, `hconvert`.R_Post, " +
                "`hconvert`.R_UserPost, `hconvert`.R_PostDate, `hconvert`.R_PostTime" +
                " FROM `convert`" +
                " left JOIN `hconvert` ON  (`convert`.R_No = `hconvert`.R_No)" +
                " where (`convert`.R_Post='Y') and " +
                " (`hconvert`.R_Date>='"+Format.dateFmtSql.format(date1.getTime())+"') " +
                "and (`hconvert`.R_Date<='"+Format.dateFmtSql.format(date2.getTime())+"') and " +
                " (`convert`.R_PCode='"+pcode+"') and r_type='CON-' " +
                " Order by `hconvert`.R_Date";

        System.out.println(" loadDetail = "+sql);
        try {
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            while(rs.next()){
                String[] row = new String[tb6.getColumnCount()];

                try{
                        row[0] = Format.dateFmtShow.format(rs.getDate("r_date"));
                    }catch(Exception ex){
                        row[0] = null;
                    }

                row[1] = rs.getString("r_no");
                row[2] = rs.getString("r_stock");
                row[3] = Format.qtyFmt.format(rs.getDouble("r_qty"));
                row[4] = Format.doubleFmt.format(rs.getFloat("r_amount"));
                row[5] = rs.getString("r_userpost");
                row[6] = rs.getString("r_postdate");
                row[7] = rs.getString("r_posttime");

                modelT6.addRow(row);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void escapeEvent(java.awt.event.KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
        dispose();
    }
    }
    private void F5Event(java.awt.event.KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_F5){
            cmdProcess();
            tb3.requestFocus();
        }
    }
}
