package program;

import Main.viewreport.Jdi_Inv_product;
import Main.viewreport.Jdi_report_tranout;
import Main.browser.Jdi_browse_htranout;
import Main.browser.Jdi_browse_stockfile;
import Main.browser.jdi_browseBranchFile;
import report.ViewReport;
import Bean.Branchfile;
import Bean.Htranout;
import Bean.Product;
import Bean.Stockfile;
import Bean.Tranout;
import DBcontrol.Db_branchfile;
import DBcontrol.Db_company;
import DBcontrol.Db_htranout;
import DBcontrol.Db_product;
import DBcontrol.Db_stockfile;
import DBcontrol.Db_tranout;
import DBcontrol.MySQLConnect;
import Main.viewreport.Jdi_report_sumTranoutGroup;
import Main.viewreport.Jdi_report_sumTranoutPLU;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import utilities.date_time.DateAndTime;
import utilities.NimbusFrame;
import utilities.TableTestFormatRenderer;

public class Main_tranout extends javax.swing.JDialog {

    private CheckDate checkDate;
    private boolean isPost;
    private String newGenerate = "~New Document~";
    private Color colorDisable = new Color(246, 248, 200);

    /** Creates new form HRecive */
    public Main_tranout(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setLocationRelativeTo(this);
        initComponents();
        initTableComponent();

        addNewDoc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_addnew = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_deldocno = new javax.swing.JButton();
        btn_listdocno = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        btnDocno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        btnBranch = new javax.swing.JButton();
        txt5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JFormattedTextField();
        btnCalendar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt14 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        btnProduct = new javax.swing.JButton();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        btnStock = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnDelItem = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        txt13 = new javax.swing.JTextField();
        txt10 = new javax.swing.JFormattedTextField();
        txt11 = new javax.swing.JFormattedTextField();
        txt12 = new javax.swing.JFormattedTextField();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        mn_addnew = new javax.swing.JMenuItem();
        mn_cancel = new javax.swing.JMenuItem();
        mn_save = new javax.swing.JMenuItem();
        mn_deldocno = new javax.swing.JMenuItem();
        mn_listdocno = new javax.swing.JMenuItem();
        mn_post = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("โอนสินค้าออก");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_addnew.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_addnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.gif"))); // NOI18N
        btn_addnew.setText("เพิ่มเอกสาร");
        btn_addnew.setFocusable(false);
        btn_addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addnewActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancle.gif"))); // NOI18N
        btn_cancel.setText("ยกเลิก");
        btn_cancel.setFocusable(false);
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.gif"))); // NOI18N
        btn_save.setText("บันทึก");
        btn_save.setFocusable(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_deldocno.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_deldocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btn_deldocno.setText("ลบ");
        btn_deldocno.setFocusable(false);
        btn_deldocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deldocnoActionPerformed(evt);
            }
        });

        btn_listdocno.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_listdocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open.gif"))); // NOI18N
        btn_listdocno.setText("แสดงรายการ");
        btn_listdocno.setFocusable(false);
        btn_listdocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listdocnoActionPerformed(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        btn_print.setText("พิมพ์");
        btn_print.setFocusable(false);
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Norasi", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Enter เพื่อสร้างเอกสารอัตโนมัติ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_addnew, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_deldocno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_listdocno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addnew)
                    .addComponent(btn_cancel)
                    .addComponent(btn_save)
                    .addComponent(btn_deldocno)
                    .addComponent(btn_listdocno)
                    .addComponent(btn_print)
                    .addComponent(btn_exit)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel1.setText("เลขที่เอกสาร");

        txt1.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt1.setText("txt1");
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

        btnDocno.setBackground(java.awt.Color.white);
        btnDocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnDocno.setFocusable(false);
        btnDocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("วันที่โอน");

        jLabel3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel3.setText("หมายเหตุ");

        txt3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt3.setText("txt3");
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt3KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel4.setText("โอนไปสาขา");

        txt4.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.setText("txt4");
        txt4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt4FocusGained(evt);
            }
        });
        txt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4KeyReleased(evt);
            }
        });

        btnBranch.setBackground(new java.awt.Color(228, 223, 217));
        btnBranch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnBranch.setAlignmentY(0.0F);
        btnBranch.setFocusable(false);
        btnBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchActionPerformed(evt);
            }
        });

        txt5.setBackground(new java.awt.Color(248, 247, 200));
        txt5.setEditable(false);
        txt5.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt5.setText("txt5");
        txt5.setFocusable(false);
        txt5.setRequestFocusEnabled(false);

        jPanel4.setBackground(new java.awt.Color(176, 214, 217));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl2.setFont(new java.awt.Font("Norasi", 1, 26)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("โอนสินค้าออก");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt2.setEditable(false);
        txt2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txt2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
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

        btnCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar.png"))); // NOI18N
        btnCalendar.setFocusable(false);
        btnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDocno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt5))
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(442, 442, 442))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalendar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDocno)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBranch)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //cmdSearchDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifying glass.jpg")));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl1.setFont(new java.awt.Font("Norasi", 1, 16)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel12.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel12.setText("จำนวนรายการสินค้า");

        jLabel13.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow.gif"))); // NOI18N

        txt14.setBackground(new java.awt.Color(248, 247, 200));
        txt14.setEditable(false);
        txt14.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt14.setText("txt14");
        txt14.setFocusable(false);
        txt14.setRequestFocusEnabled(false);

        txt15.setBackground(new java.awt.Color(248, 247, 200));
        txt15.setEditable(false);
        txt15.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt15.setText("txt15");
        txt15.setFocusable(false);
        txt15.setRequestFocusEnabled(false);

        tblShow.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblShow.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "รหัสสินค้า PLU", "ชื่อสินค้า/รายการ", "คลัง", "จำนวนโอนออก", "หน่วยนับ", "ราคา/หน่วย", "จำนวนเงิน", "พนักงาน", "วันที่ป้อน", "เวลาป้อน"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblShow.setRowHeight(25);
        tblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblShowMouseReleased(evt);
            }
        });
        tblShow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblShowKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblShow);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12))
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(234, 230, 237));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel6.setText("NO");

        jLabel7.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel7.setText("รหัสสินค้า (PLU-CODE)");

        txt6.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setText("1");
        txt6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt6FocusLost(evt);
            }
        });
        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6KeyReleased(evt);
            }
        });

        txt7.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt7.setText("txt7");
        txt7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt7FocusGained(evt);
            }
        });
        txt7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt7KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt7KeyReleased(evt);
            }
        });

        btnProduct.setBackground(new java.awt.Color(228, 223, 217));
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnProduct.setAlignmentY(0.0F);
        btnProduct.setFocusable(false);
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        txt8.setBackground(new java.awt.Color(248, 247, 200));
        txt8.setEditable(false);
        txt8.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt8.setText("txt8");
        txt8.setFocusable(false);
        txt8.setNextFocusableComponent(txt9);
        txt8.setRequestFocusEnabled(false);

        txt9.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9.setText("txt9");
        txt9.setNextFocusableComponent(txt10);
        txt9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt9FocusGained(evt);
            }
        });
        txt9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt9KeyPressed(evt);
            }
        });

        btnStock.setBackground(new java.awt.Color(228, 223, 217));
        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnStock.setAlignmentY(0.0F);
        btnStock.setFocusable(false);
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel8.setText("สำหรับคลัง");

        jLabel9.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel9.setText("จำนวน (Qty)");

        jLabel10.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel10.setText("ราคา/หน่วย");

        jLabel11.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel11.setText("จำนวนเงิน");

        btnDelItem.setFont(new java.awt.Font("Norasi", 1, 12)); // NOI18N
        btnDelItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btnDelItem.setText("ลบรายการ");
        btnDelItem.setFocusable(false);
        btnDelItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelItemActionPerformed(evt);
            }
        });
        btnDelItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDelItemKeyPressed(evt);
            }
        });

        btnAddItem.setFont(new java.awt.Font("Norasi", 1, 12)); // NOI18N
        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.gif"))); // NOI18N
        btnAddItem.setText("เพิ่มรายการ");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        btnAddItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAddItemKeyPressed(evt);
            }
        });

        txt13.setBackground(new java.awt.Color(248, 247, 200));
        txt13.setEditable(false);
        txt13.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt13.setText("txt13");
        txt13.setFocusable(false);
        txt13.setRequestFocusEnabled(false);

        txt10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        txt10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt10.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt10FocusGained(evt);
            }
        });
        txt10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt10KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt10KeyReleased(evt);
            }
        });

        txt11.setBackground(new java.awt.Color(248, 247, 200));
        txt11.setEditable(false);
        txt11.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txt11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt11.setFocusable(false);
        txt11.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt11.setRequestFocusEnabled(false);

        txt12.setBackground(new java.awt.Color(248, 247, 200));
        txt12.setEditable(false);
        txt12.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txt12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt12.setText("0");
        txt12.setFocusable(false);
        txt12.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt12.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addGap(321, 321, 321)
                        .addComponent(jLabel8)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel9)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel10)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(633, 633, 633)
                                .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduct)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStock)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelItem)
                    .addComponent(btnAddItem)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu7.setText("ฟังก์ชั่น (Function)");
        jMenu7.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N

        mn_addnew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mn_addnew.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_addnew.setText("เพิ่มเอกสาร");
        mn_addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(mn_addnew);

        mn_cancel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mn_cancel.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_cancel.setText("ยกเลิกรายการ (Cancle All)");
        mn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(mn_cancel);

        mn_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mn_save.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_save.setText("บันทึกรายการ");
        mn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(mn_save);

        mn_deldocno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mn_deldocno.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_deldocno.setText("ลบข้อมูล (Remove)");
        mn_deldocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu7.add(mn_deldocno);

        mn_listdocno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mn_listdocno.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_listdocno.setText("แสดงรายการใบรับสินค้า");
        mn_listdocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu7.add(mn_listdocno);

        mn_post.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mn_post.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_post.setText("POST ตัดสต็อกสินค้า");
        mn_post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_postActionPerformed(evt);
            }
        });
        jMenu7.add(mn_post);
        jMenu7.add(jSeparator3);

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem25.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jMenuItem25.setText("ออกจากการทำงาน");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem25);

        jMenuBar3.add(jMenu7);

        jMenu8.setText("รายงาน (Report)");
        jMenu8.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N

        jMenuItem26.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jMenuItem26.setText("สรุปรายการโอนสินค้า(ออก)ตามรหัสสินค้า(PLU)");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem26);

        jMenuItem27.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jMenuItem27.setText("สรุปรายการโอนสินค้า(ออก)ตามแผนกสินค้า(Dept)");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem27);

        jMenuBar3.add(jMenu8);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, 0, 1018, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1018, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btnDocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocnoActionPerformed
    searchDocF1Dialog();
}//GEN-LAST:event_btnDocnoActionPerformed
    boolean isCreateDocument = false;

private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        if (txt1.getText().equals("")) {
            txt1.requestFocus();
            return;
        }
        if (txt4.getText().equals("")) {
            txt4.requestFocus();
            return;
        } else if (txt7.getText().equals("")) {
            txt7.requestFocus();
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสินค้า");
            return;
        } else if (txt9.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุคลังสินค้า");
            txt9.requestFocus();
            return;
        }
        if (!CheckMakeStock.txt7_Stock(txt7.getText())) {
            txt7.requestFocus();
            addNewItem();
            return;
        }
        //ตรวจสอบ flag ว่าให้กำหนดแจ้งเตือนหรือไม
        Db_company db = new Db_company();
        stock_update stk = new stock_update();
        stk.stock_update();
        boolean minimumchk = db.getCompanyDetail().getMinchk().equals("Y");
        if (minimumchk) {
            String STOCK = txt9.getText();
            String PCODE = txt7.getText();
            double QTY = Double.parseDouble(txt10.getText());
            Date d = new Date();
            try {
                d = new SimpleDateFormat("dd/MM/yyyy").parse(txt2.getText());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Parse: " + ex.getMessage());
            }
            if (stk.checkStockOver(STOCK, PCODE, QTY, d)) {
                txt10.requestFocus();
                return;
            }
        }

        if (!existDocno(txt1.getText())) {
            try {
                Db_htranout tout = new Db_htranout();
                txt1.setText(getDigit(txt4.getText().trim(), tout.getRunningNumber()));
                //check r_no again
                checkRno(txt1.getText());
                cmdOk();
                btn_save.setEnabled(true);
                isCreateDocument = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            cmdOk();
        }
        btnDocno.setEnabled(false);
        txt4.setFocusable(false);
        btnBranch.setEnabled(false);
    }
//GEN-LAST:event_btnAddItemActionPerformed
    public String getDigit(String bbb, String rrrrrr) {
        String XXXX = "";
        String BBB = bbb;
        String RRRRRR = rrrrrr;
        try {
            //generate เลขที่เอกสาร

            String all = "" + BBB + RRRRRR;
            int multiple = 99;
            String fix = "515253545";
            //คูณ
            int sum = 0;
            char[] a = all.toCharArray();
            char[] b = fix.toCharArray();
            for (int i = 0; i < a.length; i++) {
                char aa = a[i];
                char bb = b[i];
                sum += (Integer.parseInt("" + aa) * Integer.parseInt("" + bb));
            }
            sum = sum * multiple;
            if (sum > 9999) {
                String str = "" + sum;
                XXXX = str.substring(str.length() - 4, str.length());
            } else {
                XXXX = "" + sum;
            }
            System.out.println(XXXX);

        } catch (Exception e) {
            e.printStackTrace();
        }

        

        return BBB + RRRRRR + XXXX;
    }

private void btnBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchActionPerformed
    searchBranchFileF1Dialog();
    txt4Onaction();
    if (txt4.getText().equals("")) {
        txt4.requestFocus();
    }
}//GEN-LAST:event_btnBranchActionPerformed

private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
    searchStkF1Dialog();
}//GEN-LAST:event_btnStockActionPerformed

private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
    searchProF1Dialog();
}//GEN-LAST:event_btnProductActionPerformed

private void btn_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addnewActionPerformed
    cmdAddNew();
}//GEN-LAST:event_btn_addnewActionPerformed
    private String msgNotFoundDocno = "กรุณาระบุเลขที่เอกสาร !";
private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
    btn_addnewActionPerformed(null);
}//GEN-LAST:event_btn_cancelActionPerformed

private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
    if (txt1.getText().trim().equals("")) {
        JOptionPane.showMessageDialog(this, msgNotFoundDocno);
        txt1.requestFocus();
        return;
    }else if(txt1.getText().equals(newGenerate)){
        return;
    }
    if (txt1.getText().equals(newGenerate)) {
    } else {
        if (txt2_OnExit()) {
            cmdSaveUpdate();
        }
    }
}//GEN-LAST:event_btn_saveActionPerformed

private void btn_deldocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deldocnoActionPerformed
    if (txt1.getText().trim().equals("")) {
        JOptionPane.showMessageDialog(this, msgNotFoundDocno);
        txt1.requestFocus();
        return;
    }
    cmdRemove();
}//GEN-LAST:event_btn_deldocnoActionPerformed

private void btn_listdocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listdocnoActionPerformed
    cmdOrderShow();
    txt1.requestFocus();
}//GEN-LAST:event_btn_listdocnoActionPerformed

private void btnDelItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelItemActionPerformed
    if (txt1.getText().equals("")) {
        txt1.requestFocus();
        return;
    }
    if (txt4.getText().equals("")) {
        txt4.requestFocus();
        return;
    } else if (txt7.getText().equals("")) {
        txt7.requestFocus();
        JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสินค้า");
        return;
    } else if (txt9.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "กรุณาระบุคลังสินค้า");
        txt9.requestFocus();
        return;
    }
    cmdDelete();
}//GEN-LAST:event_btnDelItemActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    btn_addnewActionPerformed(null);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    btn_addnewActionPerformed(null);
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    btn_saveActionPerformed(null);
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    btn_deldocnoActionPerformed(null);
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    cmdOrderShow();
    txt1.requestFocus();
}//GEN-LAST:event_jMenuItem5ActionPerformed

private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
    if (txt1.getText().trim().equals("")) {
        JOptionPane.showMessageDialog(this, msgNotFoundDocno);
        txt1.requestFocus();
        return;
    }
    cmdPrintOrder();
    txt1.requestFocus();
}//GEN-LAST:event_btn_printActionPerformed

private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
    cmdExit();
}//GEN-LAST:event_btn_exitActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    cmdExit();
}//GEN-LAST:event_jMenuItem7ActionPerformed

private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
    cmdDateChoose1();
}//GEN-LAST:event_btnCalendarActionPerformed

private void tblShowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblShowKeyPressed
    tblShowKeyPressedEvt(evt);
}//GEN-LAST:event_tblShowKeyPressed

private void mn_postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_postActionPerformed
    if (PublicVar.TempUser.Stock12.equals("Y")) {
        if (txt1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, msgNotFoundDocno);
            txt1.requestFocus();
            return;
        }
        boolean posStock = true;
        stock_update stk = new stock_update();
        stk.stock_update();
        Db_company db = new Db_company();
        boolean minimumchk = db.getCompanyDetail().getMinchk().equals("Y");
        if (minimumchk) {
            for (int i = 0; i < tblShow.getRowCount(); i++) {
                String r_no = txt1.getText();
                String pcode = "" + tblShow.getValueAt(i, 1);
                String stk2 = "" + tblShow.getValueAt(i, 3);

                if (stk.checkStockOut("tranout", stk2, pcode, r_no)) {
                    posStock = true;
                } else {
                    PUtility.ShowError("ไม่สามารถตัดสต็อกสินค้าได้ รหัสสินค้า(" + pcode + " ) \n"
                            + "ระบุจำนวนเกินสต็อกสินค้า ทำให้ยอดติดลบ กรุณาตรวจสอบ");
                    txt6.requestFocus();
                    posStock = false;
                    break;
                }
            }
        }
        //ตัดสต็อก
        if (posStock) {
            if (txt2_OnExit()) {
                PostStock();
            } else {
                txt2.requestFocus();
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "พนักงานรหัสนี้ ไม่สามารถเข้าทำงานรายการนี้ได้...");
    }
}//GEN-LAST:event_mn_postActionPerformed

private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_F1) {
        searchDocF1Dialog();
    } else if (evt.getKeyCode() == KeyEvent.VK_ENTER && txt1.getText().equals("")) {
        txt1.setText(newGenerate);
        txt1.setBackground(colorDisable);
        txt1.setFocusable(false);
        btnDocno.setEnabled(false);
        txt2.setText(dateFmtShow.format(new Date()));
        txt2.setFocusable(true);
        txt2.requestFocus();
        btnCalendar.setEnabled(true);
        isCreateDocument = false;
    } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        //check document in database
        if (!txt1.getText().equals("")) {
            txt1Onaction();
        } else {
            txt1KeyPressedEvt(evt);
            txt2.setText(dateFmtShow.format(new Date()));
            txt2.requestFocus();
        }
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        if(txt1.getText().equals("")){
            dispose();
        }else{
            txt1.setText("");
            txt1.requestFocus();
        }
    }
}//GEN-LAST:event_txt1KeyPressed

private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt2_OnExit();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewDoc();
    }
}//GEN-LAST:event_txt2KeyPressed

private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained
    txt2.setText(txt2.getText());
    txt2.selectAll();
}//GEN-LAST:event_txt2FocusGained

private void txt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyPressed
    txt3KeyPressedEvt(evt);
}//GEN-LAST:event_txt3KeyPressed

private void txt4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        if (txt4.getText().equals("")) {
            PUtility.ShowMsg("กรุณาระบุรหัสสาขาที่ท่านจะโอนสินค้าไป");
            txt4.requestFocus();
            return;
        }
        txt4KeyPressedEvt(evt);
    } else if (evt.getKeyCode() == KeyEvent.VK_F1) {
        searchBranchFileF1Dialog();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewDoc();
    }
}//GEN-LAST:event_txt4KeyPressed

private void txt4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt4FocusGained
    if (txt4.getText().equals("")) {
        txt4.requestFocus();
    }
    txt4.selectAll();
}//GEN-LAST:event_txt4FocusGained

private void txt6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt6FocusGained
    int rowCount = tblShow.getRowCount();
    if (rowCount == 0) {
        txt6.setText("1");
    } else {
        txt6.setText("" + (Integer.parseInt((String) tblShow.getValueAt(rowCount - 1, 0)) + 1));
        txt9.setText((String) tblShow.getValueAt(rowCount - 1, 3));
    }
    txt6.selectAll();
}//GEN-LAST:event_txt6FocusGained

private void txt6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt6FocusLost
    txt6FocusLostEvt(evt);
}//GEN-LAST:event_txt6FocusLost

private void txt6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyReleased
}//GEN-LAST:event_txt6KeyReleased

private void txt7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyPressed
    txt7KeyPressedEvt(evt);
}//GEN-LAST:event_txt7KeyPressed

private void txt7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt7FocusGained
    txt7.selectAll();
}//GEN-LAST:event_txt7FocusGained

private void txt9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt9FocusGained

    txt9.selectAll();
}//GEN-LAST:event_txt9FocusGained

private void txt9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9KeyPressed
    txt9KeyPressedEvt(evt);
}//GEN-LAST:event_txt9KeyPressed

private void txt10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt10FocusGained
    txt10.setText(txt10.getText());
    txt10.selectAll();
}//GEN-LAST:event_txt10FocusGained

private void txt10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt10KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt10_OnExit();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }
}//GEN-LAST:event_txt10KeyPressed

private void tblShowMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowMouseReleased
    tblShowMouseReleasedEvt(evt);
}//GEN-LAST:event_tblShowMouseReleased

private void txt6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyPressed
// TODO add your handling code here:
    txt6KeyReleasedEvt(evt);
}//GEN-LAST:event_txt6KeyPressed

private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
// TODO add your handling code here:
    cmdReportByCode();
}//GEN-LAST:event_jMenuItem26ActionPerformed

private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
// TODO add your handling code here:
    cmdReportByGroup();
}//GEN-LAST:event_jMenuItem27ActionPerformed

private void txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1FocusGained
    txt1.selectAll();
}//GEN-LAST:event_txt1FocusGained

private void btnAddItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddItemKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }
}//GEN-LAST:event_btnAddItemKeyPressed

private void txt10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt10KeyReleased
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        txt10.setText("0.000");
    } else {
        try {
            Float.parseFloat(txt10.getText().trim());
            calculateValues();
        } catch (NumberFormatException ex) {
            txt12.setText("Input Number Only!");
        }
    }
}//GEN-LAST:event_txt10KeyReleased

private void txt4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyReleased
    branchAuto();
}//GEN-LAST:event_txt4KeyReleased

private void txt7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyReleased
    productAuto();
}//GEN-LAST:event_txt7KeyReleased

private void btnDelItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDelItemKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }
}//GEN-LAST:event_btnDelItemKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBranch;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnDelItem;
    private javax.swing.JButton btnDocno;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btn_addnew;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_deldocno;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_listdocno;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JMenuItem mn_addnew;
    private javax.swing.JMenuItem mn_cancel;
    private javax.swing.JMenuItem mn_deldocno;
    private javax.swing.JMenuItem mn_listdocno;
    private javax.swing.JMenuItem mn_post;
    private javax.swing.JMenuItem mn_save;
    private javax.swing.JTable tblShow;
    private javax.swing.JTextField txt1;
    private javax.swing.JFormattedTextField txt10;
    private javax.swing.JFormattedTextField txt11;
    private javax.swing.JFormattedTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JFormattedTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
    ///////////////////  Variable /////////////////////////////////////////////
    DefaultTableModel model;
    private int que;
    private boolean isDocnew;
    String user = PublicVar.TempUser.UserCode;
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    SimpleDateFormat timeFmtShow = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
    DecimalFormat doubleFmt = new DecimalFormat("##,###,##0.00");
    DecimalFormat qtyFmt = new DecimalFormat("##,###,##0.000");
    private static String stockData = "";

    private void addNewDoc() {
        checkDate = new CheckDate();
        btn_addnew.setEnabled(true);
        btn_cancel.setEnabled(true);
        btn_save.setEnabled(true);
        btn_deldocno.setEnabled(true);
        btn_listdocno.setEnabled(true);
        btn_print.setEnabled(true);
        btn_exit.setEnabled(true);
        mn_addnew.setEnabled(true);
        mn_cancel.setEnabled(true);
        mn_save.setEnabled(true);
        mn_deldocno.setEnabled(true);
        mn_listdocno.setEnabled(true);

        //set default components
        txt1.setFocusable(true);
        txt1.setText("");
        txt1.requestFocus();
        txt1.setBackground(Color.WHITE);
        btnDocno.setEnabled(true);

        lbl1.setText("");
        //lbl2.setText("รับโอนสินค้าไปสาขา ");
        txt2.setFocusable(false);
        txt2.setText(dateFmtShow.format(new Date()));
        txt2.setBackground(Color.WHITE);
        btnCalendar.setEnabled(false);

        txt3.setFocusable(false);
        txt3.setText("");
        txt3.setBackground(Color.WHITE);

        txt4.setFocusable(false);
        txt4.setText("");
        txt4.setBackground(Color.WHITE);
        btnBranch.setEnabled(false);
        txt5.setText("");

        txt14.setText("");
        txt15.setText("");

        que = 1;
        isPost = false;
        resetTableModel();
        addNewItem();
    }

    private void setReadOnly() {
        txt1.setBackground(colorDisable);
        txt1.setFocusable(false);
        txt2.setBackground(colorDisable);
        txt2.setFocusable(false);
        txt3.setBackground(colorDisable);
        txt3.setFocusable(false);
        txt4.setBackground(colorDisable);
        txt4.setFocusable(false);
        txt6.setFocusable(false);
        txt6.setBackground(colorDisable);
        txt7.setFocusable(false);
        txt7.setBackground(colorDisable);
        txt9.setFocusable(false);
        txt9.setBackground(colorDisable);
        txt10.setFocusable(false);
        txt10.setBackground(colorDisable);
        btnDocno.setEnabled(false);
        btnBranch.setEnabled(false);
        btnProduct.setEnabled(false);
        btnStock.setEnabled(false);
        btnAddItem.setEnabled(false);
        btnDelItem.setEnabled(false);
        btnCalendar.setEnabled(false);
        btn_save.setEnabled(false);
        btn_deldocno.setEnabled(false);
    }

    private void SetEditable() {
        txt2.setFocusable(true);
        txt2.setBackground(Color.white);
        txt3.setFocusable(true);
        txt3.setBackground(Color.white);
        txt4.setFocusable(true);
        txt4.setBackground(Color.white);
        txt6.setFocusable(true);
        txt6.setBackground(Color.white);
        txt7.setFocusable(true);
        txt7.setBackground(Color.white);
        txt9.setFocusable(true);
        txt9.setBackground(Color.white);
        txt10.setFocusable(true);
        txt10.setBackground(Color.white);
        btnDocno.setEnabled(true);
        btnProduct.setEnabled(true);
        btnStock.setEnabled(true);
        btnAddItem.setEnabled(true);
        btnDelItem.setEnabled(true);
        btn_save.setEnabled(true);
        btn_deldocno.setEnabled(true);
    }

    private void setInputDisable() {
        txt2.setFocusable(false);
        txt2.setBackground(Color.getHSBColor(150, 200, 180));
        txt3.setFocusable(false);
        txt3.setBackground(Color.getHSBColor(150, 200, 180));
        txt4.setFocusable(false);
        txt4.setBackground(Color.getHSBColor(150, 200, 180));
        txt5.setFocusable(false);
        txt5.setBackground(Color.getHSBColor(150, 200, 180));
        txt6.setFocusable(false);
        txt6.setBackground(Color.getHSBColor(150, 200, 180));
        txt7.setFocusable(false);
        txt7.setBackground(Color.getHSBColor(150, 200, 180));
        txt9.setFocusable(false);
        txt9.setBackground(Color.getHSBColor(150, 200, 180));
        txt10.setFocusable(false);
        txt10.setBackground(Color.getHSBColor(150, 200, 180));
        btnBranch.setEnabled(false);
        btnProduct.setEnabled(false);
        btnStock.setEnabled(false);
        btnAddItem.setEnabled(false);
        btnDelItem.setEnabled(false);
        btnCalendar.setEnabled(false);
    }

    private void resetTableModel() {
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            model.removeRow(0);
        }
    }

    private void initTableComponent() {
        //Setting column size

        model = (DefaultTableModel) tblShow.getModel();
        tblShow.setShowGrid(true);
        tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblShow.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblShow.setRowSelectionAllowed(true);
        tblShow.setShowGrid(true);
        tblShow.setBackground(Color.WHITE);
        tblShow.setGridColor(Color.LIGHT_GRAY);

        JTableHeader header = tblShow.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblShow.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblShow.setRowHeight(25);

        //Setting column size
        TableColumn column = null;
        int[] colSize = {50, 100, 200, 60, 80, 60, 80, 90, 80, 80, 80};
        //tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblShow.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }

        // Hidden Collumn not use
        TableColumnModel colmodel = tblShow.getColumnModel();

        DecimalFormat DoubleFmt = new DecimalFormat("##,###,##0.00");
        DecimalFormat IntegerFmt = new DecimalFormat("##,###,##0");
        DecimalFormat PersentFmt = new DecimalFormat("#,##0.00%");

        TableColumnModel tcm = tblShow.getColumnModel();

        TableTestFormatRenderer r;
        DefaultTableCellRenderer d;

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        tcm.getColumn(1).setCellRenderer(d);
        tcm.getColumn(2).setCellRenderer(d);
        tcm.getColumn(8).setCellRenderer(d);
        tcm.getColumn(9).setCellRenderer(d);
        tcm.getColumn(10).setCellRenderer(d);


        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.CENTER);
        tcm.getColumn(3).setCellRenderer(d);
        tcm.getColumn(5).setCellRenderer(d);

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.RIGHT);
        tcm.getColumn(0).setCellRenderer(d);
        tcm.getColumn(4).setCellRenderer(d);
        tcm.getColumn(6).setCellRenderer(d);
        tcm.getColumn(7).setCellRenderer(d);

        //  r = new TableTestFormatRenderer(IntegerFmt);
        //  r.setHorizontalAlignment(SwingConstants.CENTER);
        //  tcm.getColumn(4).setCellRenderer(r);
/*
        r = new TableTestFormatRenderer(DoubleFmt);
        r.setHorizontalAlignment(SwingConstants.RIGHT);
        tcm.getColumn(6).setCellRenderer(r);
        tcm.getColumn(8).setCellRenderer(r);
        tcm.getColumn(9).setCellRenderer(r);
         */

    }

    private void calculateValues() {
        float ans = Float.parseFloat(PUtility.ConvertReal(txt10.getText().trim())) * Float.parseFloat(PUtility.ConvertReal(txt11.getText().trim()));
        txt12.setValue(ans);
        txt14.setText(tblShow.getRowCount() + " รายการ");
//        cmdBranch.setEnabled(false);
        //if(tblShow.getRowCount()==0){
        //    txt15.setText(0.00 + " บาท");
        //}else {
        //    float amount = 0;
        //    for(int i=0; i<tblShow.getRowCount(); i++){
        //        amount += Float.parseFloat((String)tblShow.getValueAt(i, 7));
        //    }
        //    txt15.setText(doubleFmt.format(amount) + " บาท");
        // }
    }

    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////// Header & Detail ///////////////////////////////
    private Htranout setHeaderBean() {
        Htranout row = new Htranout();
        row.setR_no(txt1.getText());
        try {
            row.setR_date(dateFmtShow.parse(txt2.getText().trim()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        row.setR_bran(txt4.getText());
        row.setR_remark(txt3.getText());
        int total = tblShow.getRowCount();
        row.setR_total(total);
        row.setR_user(user);
        row.setR_post("N");
        /*
        row.setR_userpost(userpost);
        Calendar now = Calendar.getInstance();
        row.setR_postdate(now.getTime());
        row.setR_posttime(DateAndTime.getTimeStringFormat(now));
         * */
        return row;
    }

    private Tranout setDetailBean() {
        Tranout row = new Tranout();
        row.setR_no(txt1.getText().trim());
        row.setR_que(Integer.parseInt(txt6.getText().trim()));
        row.setR_pcode(txt7.getText().trim());
        row.setR_stock(txt9.getText().trim());
        row.setR_pack(0);
        row.setR_qty(Float.parseFloat("" + txt10.getValue()));
        row.setR_post("N");
        row.setR_unit(txt13.getText().trim());
        row.setR_cost(Float.parseFloat("" + txt11.getValue()));
        row.setR_amount(Float.parseFloat("" + txt12.getValue()));
        //row.setR_totalqty();
        row.setR_user(user);
        Calendar now = Calendar.getInstance();
        //row.setR_time(timeFmtShow.format(now.toString()));
        row.setR_time(DateAndTime.getTimeStringFormat(now));
        row.setR_entrydate(now.getTime());
        return row;
    }

    private void insertHeader() {
        try {
            Db_htranout hr = new Db_htranout();
            hr.insert(setHeaderBean());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void updateHeader() {
        try {
            Db_htranout hr = new Db_htranout();
            hr.update(setHeaderBean());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void insertDetail() {
        try {
            Db_tranout hr = new Db_tranout();
            hr.insert(setDetailBean());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void updateDetail() {
        try {
            Db_tranout hr = new Db_tranout();
            hr.update(setDetailBean());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private boolean loadHeader(String text) {
        try {
            String sql = "SELECT h.* , f.* FROM htranout h , branfile f where h.r_bran = f.code AND h.r_no ='" + text + "'";
            System.out.println(sql);
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            if (!rs.next()) {
                return false;
            }
            txt1.setFocusable(true);
            txt1.setText(rs.getString("r_no"));
            txt2.setText(dateFmtShow.format(rs.getDate("r_date")));
            txt3.setText(rs.getString("r_remark"));
            txt4.setText(rs.getString("r_bran"));
            txt5.setText("โอนสินค้าไปสาขา " + rs.getString("name"));
            //lbl2.setText("โอนสินค้าไปสาขา " + rs.getString("name"));

            if (rs.getString("r_post").toLowerCase().equals("y")) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    private void loadDetail(String text) {
        int rowcount = tblShow.getRowCount();
        double amount = 0.0;
        for (int i = 0; i < rowcount; i++) {
            model.removeRow(0);
            double TempAmt = Double.parseDouble(ConvertReal(txt10.getText()));

            if (TempAmt == 0.0) {
                JOptionPane.showMessageDialog(this, "กรุณาป้อนจำนวนสินค้า ...");
                txt10.requestFocus();
                txt10.selectAll();
                return;
            }
        }
        try {
            resetTableModel();
            String sql = "SELECT r.*, p.pdesc FROM tranout r , product p WHERE r.r_pcode=p.pcode AND r.r_no = '" + text + "'";
            System.out.println(sql);
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            String[] row = new String[tblShow.getColumnCount()];
            while (rs.next()) {
                row[0] = rs.getString("r_que");
                row[1] = rs.getString("r_pcode");
                row[2] = rs.getString("pdesc");
                row[3] = rs.getString("r_stock");
                row[4] = qtyFmt.format(rs.getDouble("r_qty"));
                row[5] = rs.getString("r_unit");
                row[6] = doubleFmt.format(rs.getDouble("r_cost"));
                row[7] = doubleFmt.format(rs.getDouble("r_amount"));
                row[8] = rs.getString("r_user");
                row[9] = dateFmtShow.format(rs.getDate("r_entrydate"));
                row[10] = rs.getString("r_time");
                model.addRow(row);
                amount = amount + rs.getDouble("r_amount");
                txt9.setText(rs.getString("r_stock"));
            }
            int RowCount = model.getRowCount();
            showCell(RowCount - 1, 0);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        txt14.setText(tblShow.getRowCount() + " รายการ");
        txt15.setText(doubleFmt.format(amount) + " บาท");

    }

    private boolean checkDocnew() {
        Db_htranout hr = null;
        try {
            hr = new Db_htranout();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (hr.seek(txt1.getText().trim())) {
            System.out.println("It is not new Doc.");
            return false;
        } else {
            System.out.println("It is new Doc.");
            return true;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////  Search Dialog ////////////////////////////////
    private boolean searchDocF1Dialog() {
        Jdi_browse_htranout rsd = new Jdi_browse_htranout(new NimbusFrame(), true);
        rsd.setLocation(btnDocno.getLocationOnScreen());
        rsd.setVisible(true);
        Htranout hrb = rsd.getDataRecord();
        if (hrb != null) {
            txt1.setText(hrb.getR_no());
            return true;
        } else {
            txt1.setFocusable(true);
            txt1.requestFocus();
            return false;
        }
    }

    private boolean searchBranchFileF1Dialog() {
        jdi_browseBranchFile rsd = new jdi_browseBranchFile(new NimbusFrame(), true);
        rsd.setLocation(btnBranch.getLocationOnScreen());
        rsd.setVisible(true);
        String hrb = jdi_browseBranchFile.branchSelect;
        if (hrb != null && !hrb.equals("")) {
            txt4.setText(hrb);
            return true;
        } else {
            txt1.requestFocus();
            return false;
        }
    }

    private boolean searchStkF1Dialog() {
        Jdi_browse_stockfile rsd = new Jdi_browse_stockfile(new NimbusFrame(), true);
        rsd.setLocation(btnStock.getLocationOnScreen());
        rsd.setVisible(true);
        Stockfile hrb = rsd.getDataRecord();
        if (hrb != null) {
            txt9.setText(hrb.getStkcode());
            return true;
        } else {
            txt9.requestFocus();
            return false;
        }
    }
    private void branchAuto() {
        Db_branchfile db = new Db_branchfile();
        if(db.getBranchFile(txt4.getText())!=null){
            txt5.setText("รับโอนสินค้าจาก " + db.getBranchFile(txt4.getText()).getBranchName());
            //lbl2.setText("รับโอนสินค้าจาก " + db.getBranchFile(txt4.getText()).getBranchName());
        }
    }
    Db_product pauto = new Db_product();
    private void productAuto() {
        try {
            Product row = pauto.getRecordAt(txt7.getText());
            txt8.setText(row.getPdesc());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private boolean searchProF1Dialog() {
        Jdi_Inv_product rsd = new Jdi_Inv_product(new NimbusFrame(), true);
        rsd.setVisible(true);
        Product hrb = rsd.getDataRecord();
        if (hrb != null) {
            txt7.setText(hrb.getPcode());
            return true;
        } else {

            txt9.requestFocus();
            return false;
        }
    }
    ////////////////////////////////////////////////////////////////////////////

    /////////////////////////////// Event //////////////////////////////////////
    private void txt1Onaction() {
        int rowcount = model.getRowCount();
        for (int i = 0; i < rowcount; i++) {
            model.removeRow(0);
        }
        isPost = false;
        String text = txt1.getText().trim();
        Htranout hrb = null;
        if (text.equals("") || text == null) {
            txt1.requestFocus();
        } else {
            isDocnew = checkDocnew();
            System.out.println("IsDocnew = " + isDocnew);
            if (isDocnew) {
                txt1.setBackground(colorDisable);
                txt1.setFocusable(false);
                txt2.setFocusable(true);
                txt2.requestFocus();
                btnCalendar.setEnabled(true);
                btnDocno.setEnabled(false);
                que = 1;
                txt6.setText("" + que);
            } else {
                isPost = loadHeader(text);
                txt1.setFocusable(false);
                txt1.setBackground(colorDisable);
                btnDocno.setEnabled(false);
                txt2.setEditable(true);
                txt2.setFocusable(true);
                txt2.setBackground(Color.WHITE);
                txt3.setEditable(true);
                txt3.setFocusable(true);
                txt3.setBackground(Color.WHITE);
                txt2.setBackground(Color.WHITE);
                txt4.setFocusable(false);
                txt4.setBackground(Color.WHITE);
                loadDetail(text);
                addNewItem();
                txt6.setBackground(Color.WHITE);
                txt7.setBackground(Color.WHITE);
                txt9.setBackground(Color.WHITE);
                txt10.setBackground(Color.WHITE);
                txt6.setFocusable(true);
                txt6.requestFocus();
                btnCalendar.setEnabled(true);
            }

            if (isPost) {
                setReadOnly();
                lbl1.setText("เอกสารนี้ได้ทำการบันทึกเข้าสต็อกสินค้าแล้วไม่สามารถแก้ไขได้");
                tblShow.requestFocus();
            }
        }
        calculateValues();
    }

    private void txt4Onaction() {
        if (txt4.getText().equals("") || txt4.getText().length() == 0) {
            txt4.requestFocus();
        } else {
            boolean b = false;
            Db_branchfile db = new Db_branchfile();
            if (!db.seek(txt4.getText().trim())) {
                JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสาขาที่ต้องการโอนสินค้าออก ให้ถูกต้อง");
                b = false;
            } else {
                Branchfile row = db.getBranchFile(txt4.getText().trim());
                txt4.setText(row.getBranchCode());
                txt5.setText("โอนสินค้าไปสาขา " + row.getBranchName());
                //lbl2.setText("โอนสินค้าไปสาขา " + row.getBranchName());
                b = true;
            }

            if (b) {
                txt6.setFocusable(true);
                txt6.requestFocus();
            } else {
                txt4.requestFocus();
            }
        }
    }

    private void txt7Onaction() {
        String text = txt7.getText().trim();
        if (text.equals("") || text == null) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสินค้า");
            txt7.requestFocus();
        } else {
            boolean b = false;
            try {
                Db_product db = new Db_product();
                if (!db.seek(text)) {
                    JOptionPane.showMessageDialog(this, "ไม่พบรหัสสินค้า " + text + " ในแฟ้มข้อมูลหลัก กรุณาตรวจสอบ...");
                    txt7.setText("");
                    b = false;
                } else {
                    if (!db.seek(text, 'Y', 'Y')) {
                        JOptionPane.showMessageDialog(this, "รหัสสินค้านีกำหนดให้ไม่ต้องทำสต็อกสินค้า...");
                        txt7.setText("");
                        b = false;
                    } else {
                        Product row = db.getRecordAt(text);

                        txt7.setText(row.getPcode());
                        txt8.setText(row.getPdesc());
                        txt11.setValue(row.getPprice11());
                        txt13.setText(row.getPunit1());

                        b = true;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                txt7.setText("");
                b = false;
            }
            if (b) {
                btnStock.setEnabled(true);
                txt9.setFocusable(true);
                txt9.requestFocus();

            } else {
                txt7.requestFocus();
            }
        }
    }

    private void txt9Onaction() {
        String text = txt9.getText().trim();
        if (text.equals("") || text == null) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุคลังสินค้า");
            txt9.requestFocus();
        } else {
            boolean b = false;
            try {
                Db_stockfile db = new Db_stockfile();

                if (!db.seek(text)) {
                    JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสคลังให้ถูกต้อง");
                    b = false;
                } else {
                    Stockfile row = db.getRecordAt(text);
                    txt9.setText(row.getStkcode());
                    stockData = row.getStkcode();
                    b = true;
                }
            } catch (SQLException ex) {
                b = false;
            }
            if (b) {
                txt10.setFocusable(true);
                txt10.requestFocus();
            } else {
                txt9.requestFocus();
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////

    private void txt1KeyPressedEvt(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_F1) {
            searchDocF1Dialog();
            txt1Onaction();
        }
        if (key == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
        if (key == KeyEvent.VK_ENTER) {
            txt1Onaction();
        }
    }

    private void txt1KeyReleasedEvt(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            txt1Onaction();
        }
    }

    private void txt2KeyPressedEvt(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            txt3.requestFocus();
            txt3.selectAll();
        } else if (key == KeyEvent.VK_ESCAPE) {
            addNewDoc();
        }
    }

    private void txt3KeyPressedEvt(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            btnBranch.setEnabled(true);
            txt4.setFocusable(true);
            txt4.requestFocus();
        } else if (key == KeyEvent.VK_ESCAPE) {
            addNewDoc();
        }
    }

    private String checkDigit(String bbb, String rrrrrr) {
        String XXXX = "";
        String BBB = bbb;
        String RRRRRR = rrrrrr;
        try {
            //generate เลขที่เอกสาร

            String all = "" + BBB + RRRRRR;
            int multiple = 99;
            String fix = "515253545";
            //คูณ
            int sum = 0;
            char[] a = all.toCharArray();
            char[] b = fix.toCharArray();
            for (int i = 0; i < a.length; i++) {
                char aa = a[i];
                char bb = b[i];
                sum += (Integer.parseInt("" + aa) * Integer.parseInt("" + bb));
            }
            sum = sum * multiple;
            if (sum > 9999) {
                String str = "" + sum;
                XXXX = str.substring(str.length() - 4, str.length());
            } else {
                XXXX = "" + sum;
            }
            System.out.println(XXXX);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return XXXX;
    }

    private void txt4KeyPressedEvt(java.awt.event.KeyEvent evt) {
        if (txt1.getText().length() < 13 || txt1.getText().length() > 13) {
            if (!txt1.getText().equals("~New Document~")) {
                PUtility.ShowMsg("กรุณาป้อนข้อมูลให้ครบ 13 หลัก");
                txt4.setText("");
                txt5.setText("");
                txt1.requestFocus();
                return;
            }
        }
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_F1) {
            searchBranchFileF1Dialog();
            if (!txt1.getText().equals("~New Document~")) {
                String rrr = txt1.getText().substring(3, 9);
                //check digit number
                String digit = txt1.getText().substring(9, txt1.getText().length());
                if (!checkDigit(txt4.getText(), rrr).equals(digit)) {
                    PUtility.ShowMsg("กรุณาระบุเลขที่เอกสารให้ถูกต้อง");
                    txt4.setText("");
                    txt5.setText("");
                    txt1.requestFocus();
                    return;
                } else {
                    txt4Onaction();
                }
            } else {
                txt4Onaction();
            }
        } else if (key == KeyEvent.VK_ENTER) {
            //check digit number
            if (!txt1.getText().equals("~New Document~")) {
                String rrr = txt1.getText().substring(3, 9);
                String digit = txt1.getText().substring(9, txt1.getText().length());
                if (!checkDigit(txt4.getText(), rrr).equals(digit)) {
                    PUtility.ShowMsg("กรุณาระบุเลขที่เอกสารให้ถูกต้อง");
                    txt4.setText("");
                    txt5.setText("");
                    txt1.requestFocus();
                    return;
                } else {
                    txt4Onaction();
                }
            } else {
                txt4Onaction();
            }
        } else if (key == KeyEvent.VK_ESCAPE) {
            addNewDoc();
        }
    }

    private void txt6KeyReleasedEvt(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ESCAPE) {
            addNewDoc();
        }
        if (key == KeyEvent.VK_ENTER) {
            String text = txt6.getText().trim();
            for (int i = 0; i < tblShow.getRowCount(); i++) {
                if (text.equals((String) tblShow.getValueAt(i, 0))) {
                    txt6.setText((String) tblShow.getValueAt(i, 0));
                    txt7.setText((String) tblShow.getValueAt(i, 1));
                    txt8.setText((String) tblShow.getValueAt(i, 2));
                    txt9.setText((String) tblShow.getValueAt(i, 3));
                    txt10.setText((String) tblShow.getValueAt(i, 4));
                    txt12.setText((String) tblShow.getValueAt(i, 6));
                    txt11.setText((String) tblShow.getValueAt(i, 7));
                    txt13.setText((String) tblShow.getValueAt(i, 5));
                    break;
                } else {
                    txt7.setText("");
                    txt8.setText("");
                    txt10.setText("0.000");
                    txt12.setText("0.00");
                    txt11.setText("0.00");
                    txt13.setText("");
                    btnProduct.setEnabled(true);
                    btnAddItem.setEnabled(true);
                    btnDelItem.setEnabled(true);
                }
            }
            txt6.setFocusable(false);
            btnProduct.setEnabled(true);
            txt7.setFocusable(true);
            txt7.requestFocus();
        }
    }

    private void txt7KeyPressedEvt(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_F1) {
            searchProF1Dialog();
        } else if (key == KeyEvent.VK_ENTER) {
            txt7Onaction();
        } else if (key == KeyEvent.VK_ESCAPE) {
            addNewItem();
            txt6.setFocusable(true);
            txt6.requestFocus();
        }
    }

    private void txt9KeyPressedEvt(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_F1) {
            searchStkF1Dialog();
        } else if (key == KeyEvent.VK_ENTER) {
            txt9Onaction();
        } else if (key == KeyEvent.VK_ESCAPE) {
            addNewItem();
            txt6.setFocusable(true);
            txt6.requestFocus();
        }
    }

    private void txt10KeyPressedEvt(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            btnAddItem.requestFocus();
        } else if (key == KeyEvent.VK_ESCAPE) {
            addNewItem();
        }
    }

    private void txt10KeyReleasedEvt(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key != KeyEvent.VK_ENTER && key != KeyEvent.VK_ESCAPE) {
            try {
                Float.parseFloat(txt10.getText().trim());
                calculateValues();
            } catch (NumberFormatException ex) {
                txt11.setText("Input Number Only!");
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    private void txt6FocusLostEvt(java.awt.event.FocusEvent evt) {
        int rowCount = tblShow.getRowCount();
        if (rowCount == 0) {
            txt6.setText("1");
        } else {
            boolean b = false;
            for (int i = 0; i < rowCount; i++) {
                if (txt6.getText().trim().equals((String) tblShow.getValueAt(i, 0))) {
                    txt6.setText("" + tblShow.getValueAt(i, 0));
                    b = true;
                    break;
                }
            }

            //if (!b) {
            //    txt6.setText("" + (Integer.parseInt((String) tblShow.getValueAt(rowCount - 1, 0)) + 1));
            //}
        }
    }

    private void tblShowMouseReleasedEvt(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            if (!isPost) {
                int index = tblShow.getSelectedRow();
                txt6.setText("" + tblShow.getValueAt(index, 0));
                txt7.setText("" + tblShow.getValueAt(index, 1));
                txt8.setText("" + tblShow.getValueAt(index, 2));
                txt9.setText("" + tblShow.getValueAt(index, 3));
                stockData = "" + tblShow.getValueAt(index, 3);
                txt10.setText("" + tblShow.getValueAt(index, 4));
                txt13.setText("" + tblShow.getValueAt(index, 5));
                txt12.setText("" + tblShow.getValueAt(index, 6));
                txt11.setText("" + tblShow.getValueAt(index, 7));

                txt6.setFocusable(false);
                btnProduct.setEnabled(true);
                txt7.setFocusable(true);
                txt7.requestFocus();
            }
        }
    }

    private void tblShowKeyPressedEvt(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ESCAPE) {
            if (!isPost) {
                txt6.requestFocus();
            } else {
                addNewDoc();
            }
        } else if (key == KeyEvent.VK_ENTER) {
            if (!isPost) {
                int index = tblShow.getSelectedRow();
                txt6.setText("" + tblShow.getValueAt(index, 0));
                txt7.setText("" + tblShow.getValueAt(index, 1));
                txt8.setText("" + tblShow.getValueAt(index, 2));
                txt9.setText("" + tblShow.getValueAt(index, 3));
                stockData = "" + tblShow.getValueAt(index, 3);
                txt10.setText("" + tblShow.getValueAt(index, 4));
                txt13.setText("" + tblShow.getValueAt(index, 5));
                txt12.setText("" + tblShow.getValueAt(index, 6));
                txt11.setText("" + tblShow.getValueAt(index, 7));
                txt7.requestFocus();
                if ((index - 1) > -1) {
                    tblShow.setRowSelectionInterval(0, index - 1);
                    tblShow.scrollRectToVisible(tblShow.getCellRect(index - 1, 0, true));
                }
            }
        }
    }

    ///////////////////////////// CMD //////////////////////////////////////////
    private void cmdAddNew() {
        addNewDoc();
    }

    private void cmdSaveUpdate() {
        //check Values
        if (txt1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่เลขที่เอกสารให้ถูกต้อง");
            txt1.requestFocus();
            return;
        } else if (txt2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่วันที่รับสินค้าให้ถูกต้อง");
            txt2.requestFocus();
            return;
        } else if (txt4.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสสาขาให้ถูกต้อง");
            txt4.requestFocus();
            return;
        } else {
            Db_branchfile fac = new Db_branchfile();
            if (!fac.seek(txt4.getText().trim())) {
                JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสสาขาให้ถูกต้อง");
                txt4.setText("");
                txt4.requestFocus();
                return;
            }

            Db_htranout db = null;
            try {
                db = new Db_htranout();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            isDocnew = checkDocnew();
            if (isDocnew) {
                insertHeader();
            } else {
                if (db.seek(txt1.getText().trim(), "N")) {
                    updateHeader();
                    txt7.requestFocus();
                } else if (db.seek(txt1.getText().trim(), "Y")) {
                    JOptionPane.showMessageDialog(this, "ไม่สามารถบันทึกได้เพราะเอกสารนี้ได้ถูกโพสตัดสต็อกแล้ว");
                    txt1.requestFocus();
                    return;
                } else {
                    JOptionPane.showMessageDialog(this, "ไม่พบเลขที่เอกสารนี้ในฐานข้อมูล \nกรุณาตรวจสอบ");
                    txt1.requestFocus();
                    return;
                }
            }
        }
    }

    private void cmdRemove() {
        String text = txt1.getText().trim();

        if (text.equals("") | text == null) {
            JOptionPane.showMessageDialog(this, "โปรดใส่เลขที่เอกสารที่ต้องการจะลบ");
            txt1.requestFocus();
            return;
        }

        String sql = "SELECT * FROM htranout where r_no ='" + text + "' AND " + "r_post = 'N'";
        System.out.println(sql);
        boolean b;
        ResultSet rs = null;
        try {
            rs = MySQLConnect.con.createStatement().executeQuery(sql);

            try {
                if (!rs.next()) {
                    b = false;
                } else {
                    b = true;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                b = false;
            }

            if (b) {

                int a = JOptionPane.showConfirmDialog(this, "คุณต้องการลบเอกสารเลขที่ " + text + " ใช่หรือไม่ ?");
                if (a != JOptionPane.YES_OPTION) {
                    txt1.requestFocus();
                    return;
                }

                sql = "DELETE FROM htranout where r_no='" + text + "'";
                int result = MySQLConnect.con.createStatement().executeUpdate(sql);
                System.out.println(sql);
                System.out.println("Result = " + result);

                sql = "DELETE FROM tranout where r_no='" + text + "'";
                result = MySQLConnect.con.createStatement().executeUpdate(sql);
                System.out.println(sql);
                System.out.println("Result = " + result);

                addNewDoc();
                txt1.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "ไม่สามารถลบเอกสารเลขที่ " + text + " นี้ได้ \nเพราะเอกสารนี้ได้ทำการบันทึกเข้าสต็อกสินค้าแล้ว ");
                txt1.requestFocus();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void cmdOrderShow() {
        new Jdi_report_tranout(new NimbusFrame(), true).setVisible(true);
        if (!PublicVar.ReturnString.equals("")) {
            txt1.setText(PublicVar.ReturnString);
            txt1Onaction();
        }
    }

    private void cmdPrintOrder() {
        if (!txt1.getText().equals("")) {
            ViewReport vp = new ViewReport();
            vp.printReportTranout(txt1.getText());
        }
    }

    private void cmdExit() {
        dispose();
    }

    private void cmdReportByCode() {
        new Jdi_report_sumTranoutPLU(new NimbusFrame(), true).setVisible(true);
    }

    private void cmdReportByGroup() {
        new Jdi_report_sumTranoutGroup(new NimbusFrame(), true).setVisible(true);
    }

    private void cmdOk() {
        //check Values
        if (txt1.getText().trim().equals("")) {
            txt1.requestFocus();
            return;
        }
        stock_update st = new stock_update();
        Date TempDate = null;
        try {
            TempDate = dateFmtShow.parse(txt2.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "กรุณาป้อนวันที่ให้ถูกต้อง...");
        }
        int actmonth = st.GetActionMon(TempDate);
        if (actmonth <= 0) {
            JOptionPane.showMessageDialog(this, "วันที่ไม่อยู่ในงวดที่สามารถทำงานได้ !!!");
            txt2.requestFocus();
            return;
        }
        double TempAmt = Double.parseDouble(ConvertReal(txt10.getText()));
        if (TempAmt == 0.0) {
            JOptionPane.showMessageDialog(this, "กรุณาป้อนจำนวนสินค้า ...");
            txt10.requestFocus();
            txt10.selectAll();
            return;
        }

        if (txt12.getText().length() >= 14) {
            JOptionPane.showMessageDialog(this, "จำนวนเงินมากเกิน 99,999,999.99 ล้านบาท ระบบไม่สามารถจัดเก็บได้");
            return;
        }
        if (txt2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่วันที่รับสินค้าให้ถูกต้อง");
            txt2.requestFocus();
        } else if (txt4.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสสาขาให้ถูกต้อง");
            txt4.requestFocus();
        } else if (txt6.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่รหัส No ให้ถูกต้อง");
            txt6.requestFocus();
        } else if (txt7.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสสินค้าให้ถูกต้อง");
            txt7.requestFocus();
        } else if (txt9.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสคลังสินค้าให้ถูกต้อง");
            txt9.requestFocus();
        } else if (txt10.getValue().toString().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่จำนวนสินค้า Qty ให้ถูกต้อง");
            txt10.requestFocus();
        } else {
            {
                Db_branchfile db = new Db_branchfile();
                String text = txt4.getText().trim();
                if (!db.seek(text)) {
                    JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสสาขาให้ถูกต้อง");
                    txt4.requestFocus();
                    return;
                }
            }

            try {
                Db_product db = new Db_product();
                String text = txt7.getText().trim();
                if (!db.seek(text)) {
                    JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสสินค้าให้ถูกต้อง");
                    txt7.requestFocus();
                    return;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสสินค้าให้ถูกต้อง");
                txt7.requestFocus();
                return;
            }

            try {
                Db_stockfile db = new Db_stockfile();
                String text = txt9.getText().trim();
                if (!db.seek(text)) {
                    JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสคลังสินค้าให้ถูกต้อง");
                    txt9.requestFocus();
                    return;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสคลังสินค้าให้ถูกต้อง");
                txt9.requestFocus();
                return;
            }

            boolean isEdit = false;
            int rowCount = tblShow.getRowCount();
            String no = txt6.getText();
            for (int i = 0; i < rowCount; i++) {
                if (tblShow.getValueAt(i, 0).equals(no)) {
                    isEdit = true;
                    break;
                }
            }

            if (isEdit) {
                updateDetail();
            } else {
                insertDetail();
            }
            isDocnew = checkDocnew();
            System.out.println("IsDocnew = " + isDocnew);
            loadDetail(txt1.getText());
            calculateValues();
            if (isDocnew) {
                insertHeader();
            } else {
                updateHeader();
            }
            txt6.requestFocus();
            try {
                tblShow.setRowSelectionInterval(0, tblShow.getRowCount() - 1);
                tblShow.scrollRectToVisible(tblShow.getCellRect(tblShow.getRowCount() - 1, 0, true));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            addNewItem();
            txt6.setFocusable(true);
            txt6.requestFocus();
        }
    }

    private void cmdDelete() {
        if (txt1.getText().trim().equals("")) {
            txt1.requestFocus();
            return;
        }

        int que = Integer.parseInt(txt6.getText().trim());

        String r_no = txt1.getText().trim();
        try {
            Db_tranout db = new Db_tranout();
            if (db.delete(r_no, que)) {
            } else {
                JOptionPane.showMessageDialog(this, "ไม่สามารถลบข้อมูลได้ กรุณาตรวจสอบความถูกต้องของการเลือกข้อมูลที่นำมาลบ");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        loadDetail(txt1.getText());
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }

    private void cmdDateChoose1() {
        Point point = btnCalendar.getLocationOnScreen();
        utilities.DateChooser.DateChooserDialog dcd =
                new utilities.DateChooser.DateChooserDialog(null, true, point);
        dcd.setVisible(true);
        txt2.setText(dateFmtShow.format(dcd.getSelectedDate().getTime()));
        txt2.requestFocus();
    }

    private void addNewItem() {

        txt6.setText("" + que);
        txt6.setFocusable(false);
        txt6.setBackground(Color.WHITE);

        txt7.setText("");
        txt7.setFocusable(false);
        txt7.setBackground(Color.WHITE);
        btnProduct.setEnabled(false);

        txt8.setText("");

        txt9.setText("");
        txt9.setFocusable(false);
        txt9.setBackground(Color.WHITE);
        btnStock.setEnabled(false);

        txt10.setValue(0.000);
        txt10.setFocusable(false);
        txt10.setBackground(Color.WHITE);

        txt12.setValue(0.00);
        txt11.setValue(0.00);
        txt13.setText("");

        btnAddItem.setEnabled(true);
        btnDelItem.setEnabled(true);
    }

    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    private String ConvertReal(String TStr) {
        String TempStr = "";
        if (TStr.indexOf(",") > 0) {
            for (int i = 0; i < TStr.length(); i++) {
                char ch = TStr.charAt(i);
                String StrCh = "";
                StrCh = StrCh + ch;
                if (!StrCh.equals(",")) {
                    TempStr = TempStr + StrCh;
                }
            }
        } else {
            TempStr = TStr;
        }
        return TempStr;
    }

    private boolean ChkPasswordPost() {
        return true;
    }

    public void UpdateDetail(String TDoc, int TQue) {
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "update tranout set r_post='Y' where r_no='" + TDoc + "' and r_que=" + TQue;
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    public void UpdateHeader(String TDoc, String user) {
        SimpleDateFormat DateFmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat SqlDateFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat FullTimeFmt = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        Date date = new Date();
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "update htranout set r_post='Y',r_userpost='" + user + "',r_postdate='" + SqlDateFmt.format(date) + "',r_posttime='" + FullTimeFmt.format(date) + "' where r_no='" + TDoc + "'";
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private void PostStock() {
        SimpleDateFormat DateFmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat SqlDateFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        DecimalFormat IntFmt = new DecimalFormat("##,###,##0");
        if (isPost) {
            return;
        }
        if (ChkPasswordPost()) {
            String TDoc = txt1.getText();
            if (TDoc.equals("")) {
                txt1.requestFocus();
                return;
            }
            int totalRec = 0;
            int CurRec = 0;
            try {
                Statement stmt = (Statement) MySQLConnect.con.createStatement();
                String SQLQuery = "select tranout.r_no,r_date,r_que,r_pcode,r_stock,r_qty,r_amount,tranout.r_post from tranout left join htranout on tranout.r_no=htranout.r_no where tranout.r_no='" + TDoc + "' ";
                ResultSet rec = stmt.executeQuery(SQLQuery);
                rec.last();
                totalRec = rec.getRow();
                CurRec = 0;
                rec.first();
                if (rec.getRow() == 0) {
                    JOptionPane.showMessageDialog(this, "กรุณาป้อนรายการ..ก่อนทำการ POST สต้อกสินค้า...");
                    return;
                } else {
                    setReadOnly();
                    do {
                        CurRec++;
                        int TQue = rec.getInt("r_que");
                        Date TDate = rec.getDate("r_date");
                        String TCode = rec.getString("r_pcode");
                        String TStk = rec.getString("r_stock");
                        Double TempQty = rec.getDouble("r_qty");
                        Double TempAmt = rec.getDouble("r_amount");
                        String T_Rem = "TRO";
                        String TPost = rec.getString("r_post");
                        if (!TPost.equals("Y")) {
                            stock_update st = new stock_update();
                            st.ProcessStockOut(TDoc, TStk, TCode, TDate, T_Rem, TempQty, TempAmt, user);
                            UpdateDetail(TDoc, TQue);
                        }
                    } while (rec.next());
                }
                rec.close();
                stmt.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            if (totalRec > 0) {
                UpdateHeader(TDoc, user);
                JOptionPane.showMessageDialog(this, "จบการ POST สต็อกสินค้า เอกสารหมายเลข " + TDoc + " จำนวน " + totalRec + " รายการ...");
                addNewDoc();
            }

        } else {
            JOptionPane.showMessageDialog(this, "รหัสพนักงานนี้ไม่สามารถ POST สต็อกสินค้าได้...");
        }
    }

    public void showCell(int row, int column) {
        Rectangle rect = tblShow.getCellRect(row, column, true);
        tblShow.scrollRectToVisible(rect);
        tblShow.clearSelection();
        if (row != -1) {
            tblShow.setRowSelectionInterval(row, row);
        }
        //tblshowplu.getModel().fireTableDataChanged(); // notify the model
    }

    private boolean txt2_OnExit() {
        boolean isSave = false;
        String text = txt2.getText().trim();
        if (!text.equals("") || text.length() != 0) {
            //!
            SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date d = sim.parse(text);
                if (checkDate.validDate(d)) {
                    isSave = true;
                    txt3.setFocusable(true);
                    txt3.requestFocus();
                } else {
                    txt2.requestFocus();
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "รูปแบบวันที่ไม่ถูกต้อง ! \n"
                        + "รูปแบบ = (วัน/เดือน/ปี คศ.) (01/01/2000)");
                txt2.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ในการโอนสินค้าออก");
            txt2.requestFocus();
        }
        return isSave;
    }

    private void txt10_OnExit() {
        if (txt10.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุจำนวนสินค้า");
            txt10.requestFocus();
        } else {
            double qty = 0.00;
            try {
                qty = Double.parseDouble(txt10.getText());
                if (qty == 0) {
                    JOptionPane.showMessageDialog(this, "ระบุจำนวนสินค้าไม่ถูกต้อง \n"
                            + "จำนวนสินค้าไม่ควรเป็น 0");
                    txt10.requestFocus();
                } else {
                    btnAddItem.setFocusable(true);
                    btnAddItem.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "จำนวนการสั่งต้องเป็นจำนวนเต็มเท่านั้น \n"
                        + "เช่น 1-10, -1,-2,-3", "แจ้งเตือน", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean checkRno(String rno) {        
        boolean isTrue = false;
        try {
            Db_htranout tt = new Db_htranout();
            String sql = "select r_no from htranout where r_no='"+rno+"'";
            Statement stmt = MySQLConnect.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                Statement st = MySQLConnect.con.createStatement();
                st.executeUpdate("update branch set TO_NO = TO_NO+1;");
                txt1.setText(getDigit(txt4.getText().trim(), tt.getRunningNumber()));
                st.close();
                checkRno(txt1.getText());                
            }else{
                isTrue = true;
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

        return isTrue;
    }

    private boolean existDocno(String docno) {
        boolean isExist = false;
        try {
            String sql = "select R_NO from htranout where r_no='"+docno+"'";
            Statement stmt = MySQLConnect.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                isExist = true;
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

        return isExist;
    }
}
