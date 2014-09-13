package program;

import Main.viewreport.Jdi_report_tranin;
import Main.viewreport.Jdi_Inv_product;
import Main.browser.Jdi_browse_htranin;
import Main.browser.Jdi_browse_stockfile;
import Main.browser.jdi_browseBranchFile;
import report.ViewReport;
import Bean.Htranin;
import Bean.Product;
import Bean.Stockfile;
import Bean.Tranin;
import DBcontrol.Db_branchfile;
import DBcontrol.Db_company;
import DBcontrol.Db_htranin;
import DBcontrol.Db_product;
import DBcontrol.Db_stockfile;
import DBcontrol.Db_tranin;
import DBcontrol.MySQLConnect;
import Main.viewreport.Jdi_report_sumTraninGroup;
import Main.viewreport.Jdi_report_sumTraninPLU;
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

public class Main_tranin extends javax.swing.JDialog {
    private CheckDate checkDate;
    private boolean isPost;
    private Color colorDisable = new Color(246,248,200);

    public Main_tranin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setLocationRelativeTo(this);
        initComponents();        
        initTableComponents();
        
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
        btnFactory = new javax.swing.JButton();
        txt5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JFormattedTextField();
        btnCalendar = new javax.swing.JButton();
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
        jPanel6 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt14 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mn_addnew = new javax.swing.JMenuItem();
        mn_cancel = new javax.swing.JMenuItem();
        mn_save = new javax.swing.JMenuItem();
        mn_deldocno = new javax.swing.JMenuItem();
        mn_listdocno = new javax.swing.JMenuItem();
        mn_post = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รับโอนสินค้าเข้า");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        btn_save.setText("บันทึกข้อมูล");
        btn_save.setFocusable(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_deldocno.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_deldocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btn_deldocno.setText("ลบข้อมูล");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_addnew, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_deldocno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_listdocno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_addnew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deldocno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_listdocno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(156, 236, 211));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel1.setText("เลขที่เอกสาร");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 18, 90, 30));

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
        jPanel3.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 18, 148, 30));

        btnDocno.setBackground(java.awt.Color.white);
        btnDocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnDocno.setFocusable(false);
        btnDocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocnoActionPerformed(evt);
            }
        });
        jPanel3.add(btnDocno, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 18, 36, -1));
        //cmdSearchDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifying glass.jpg")));

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("วันที่โอน");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 30));

        jLabel3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel3.setText("หมายเหตุ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 54, -1, 30));

        txt3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt3.setText("txt3");
        txt3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt3FocusGained(evt);
            }
        });
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt3KeyPressed(evt);
            }
        });
        jPanel3.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 54, 443, 30));

        jLabel4.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel4.setText("รับโอนจากสาขา");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 90, -1, 30));

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
        jPanel3.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 90, 53, 30));

        btnFactory.setBackground(new java.awt.Color(228, 223, 217));
        btnFactory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnFactory.setAlignmentY(0.0F);
        btnFactory.setFocusable(false);
        btnFactory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactoryActionPerformed(evt);
            }
        });
        btnFactory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnFactoryFocusGained(evt);
            }
        });
        btnFactory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFactoryKeyPressed(evt);
            }
        });
        jPanel3.add(btnFactory, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 90, 36, -1));

        txt5.setBackground(new java.awt.Color(246, 248, 200));
        txt5.setEditable(false);
        txt5.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt5.setText("txt5");
        txt5.setFocusable(false);
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });
        txt5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt5FocusGained(evt);
            }
        });
        txt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt5KeyReleased(evt);
            }
        });
        jPanel3.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 90, 342, 30));

        jPanel4.setBackground(new java.awt.Color(176, 214, 217));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl2.setFont(new java.awt.Font("Norasi", 1, 26)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("รับโอนสินค้าเข้า");
        jPanel4.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 50));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 440, 100));

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
        jPanel3.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 18, 124, 30));

        btnCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar.png"))); // NOI18N
        btnCalendar.setFocusable(false);
        btnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 18, 36, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 140));

        jPanel5.setBackground(new java.awt.Color(234, 230, 237));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel6.setText("NO");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, -1, -1));

        jLabel7.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel7.setText("รหัสสินค้า (PLU-CODE)");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 24, -1, -1));

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
        jPanel5.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 50, 50, 30));

        txt7.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt7.setText("txt7");
        txt7.setNextFocusableComponent(txt9);
        txt7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt7FocusLost(evt);
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
        jPanel5.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 50, 118, 30));

        btnProduct.setBackground(new java.awt.Color(228, 223, 217));
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnProduct.setAlignmentY(0.0F);
        btnProduct.setFocusable(false);
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        btnProduct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnProductFocusGained(evt);
            }
        });
        jPanel5.add(btnProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 50, 40, -1));

        txt8.setBackground(new java.awt.Color(246, 248, 200));
        txt8.setEditable(false);
        txt8.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt8.setText("txt8");
        txt8.setFocusable(false);
        txt8.setNextFocusableComponent(txt9);
        txt8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt8FocusGained(evt);
            }
        });
        txt8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt8KeyPressed(evt);
            }
        });
        jPanel5.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 50, 288, 30));

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
        jPanel5.add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 50, 46, 30));

        btnStock.setBackground(new java.awt.Color(228, 223, 217));
        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnStock.setAlignmentY(0.0F);
        btnStock.setFocusable(false);
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });
        btnStock.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnStockFocusGained(evt);
            }
        });
        jPanel5.add(btnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 50, 40, -1));

        jLabel8.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel8.setText("สำหรับคลัง");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 24, -1, -1));

        jLabel9.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel9.setText("จำนวน (Qty)");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 24, -1, -1));

        jLabel10.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel10.setText("ราคา/หน่วย");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 24, -1, -1));

        jLabel11.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel11.setText("จำนวนเงิน");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        btnDelItem.setFont(new java.awt.Font("Norasi", 1, 12)); // NOI18N
        btnDelItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btnDelItem.setText("ลบรายการ");
        btnDelItem.setFocusable(false);
        btnDelItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelItemActionPerformed(evt);
            }
        });
        btnDelItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnDelItemFocusGained(evt);
            }
        });
        btnDelItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDelItemKeyPressed(evt);
            }
        });
        jPanel5.add(btnDelItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 83, 110, -1));

        btnAddItem.setFont(new java.awt.Font("Norasi", 1, 12)); // NOI18N
        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.gif"))); // NOI18N
        btnAddItem.setText("เพิ่มรายการ");
        btnAddItem.setFocusable(false);
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        btnAddItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnAddItemFocusGained(evt);
            }
        });
        btnAddItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAddItemKeyPressed(evt);
            }
        });
        jPanel5.add(btnAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 106, -1));

        txt13.setBackground(new java.awt.Color(246, 248, 215));
        txt13.setEditable(false);
        txt13.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt13.setText("txt13");
        txt13.setFocusable(false);
        txt13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt13FocusGained(evt);
            }
        });
        txt13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt13KeyPressed(evt);
            }
        });
        jPanel5.add(txt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 85, 150, 30));

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
        jPanel5.add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 50, 150, 30));

        txt11.setBackground(new java.awt.Color(246, 248, 200));
        txt11.setEditable(false);
        txt11.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txt11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt11.setFocusable(false);
        txt11.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt11ActionPerformed(evt);
            }
        });
        txt11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt11FocusGained(evt);
            }
        });
        txt11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt11KeyPressed(evt);
            }
        });
        jPanel5.add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 50, 110, 30));

        txt12.setBackground(new java.awt.Color(246, 248, 200));
        txt12.setEditable(false);
        txt12.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txt12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt12.setText("0");
        txt12.setFocusable(false);
        txt12.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt12FocusGained(evt);
            }
        });
        jPanel5.add(txt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 106, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1010, 130));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl1.setFont(new java.awt.Font("Norasi", 1, 16)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel12.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel12.setText("จำนวนรายการสินค้า");

        jLabel13.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow.gif"))); // NOI18N

        txt14.setBackground(new java.awt.Color(246, 248, 200));
        txt14.setEditable(false);
        txt14.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt14.setText("txt14");
        txt14.setFocusable(false);
        txt14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt14FocusGained(evt);
            }
        });
        txt14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt14KeyPressed(evt);
            }
        });

        txt15.setBackground(new java.awt.Color(246, 248, 200));
        txt15.setEditable(false);
        txt15.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt15.setText("txt15");
        txt15.setFocusable(false);
        txt15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt15FocusGained(evt);
            }
        });
        txt15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt15KeyPressed(evt);
            }
        });

        tblShow.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblShow.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "รหัสสินค้า PLU", "ชื่อสินค้า/รายการ", "คลัง", "จำนวนรับ", "หน่วยนับ", "ราคา/หน่วย", "จำนวนเงิน", "พนักงาน", "วันที่ป้อนข้อมูล", "เวลาป้อน"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowMouseClicked(evt);
            }
        });
        tblShow.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblShowFocusGained(evt);
            }
        });
        tblShow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblShowKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblShowKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblShow);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13)
                        .addGap(12, 12, 12)
                        .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(jLabel13)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1010, 380));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1010, 660));

        jMenu1.setText("ฟังก์ชั่น (Function)");
        jMenu1.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N

        mn_addnew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mn_addnew.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_addnew.setText("เพิ่มข้อมูลใหม่ (Add New)");
        mn_addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_addnewActionPerformed(evt);
            }
        });
        jMenu1.add(mn_addnew);

        mn_cancel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mn_cancel.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_cancel.setText("ยกเลิกรายการ (Cancle All)");
        mn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_cancelActionPerformed(evt);
            }
        });
        jMenu1.add(mn_cancel);

        mn_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mn_save.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_save.setText("บันทึกข้อมูล (Save/Update)");
        mn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_saveActionPerformed(evt);
            }
        });
        jMenu1.add(mn_save);

        mn_deldocno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mn_deldocno.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_deldocno.setText("ลบข้อมูล (Remove)");
        mn_deldocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_deldocnoActionPerformed(evt);
            }
        });
        jMenu1.add(mn_deldocno);

        mn_listdocno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mn_listdocno.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_listdocno.setText("แสดงรายการใบรับสินค้า");
        mn_listdocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_listdocnoActionPerformed(evt);
            }
        });
        jMenu1.add(mn_listdocno);

        mn_post.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mn_post.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_post.setText("POST ตัดสต็อกสินค้า");
        mn_post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_postActionPerformed(evt);
            }
        });
        jMenu1.add(mn_post);
        jMenu1.add(jSeparator1);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jMenuItem7.setText("ออกจากการทำงาน");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("รายงาน (Report)");
        jMenu2.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jMenuItem8.setText("สรุปรายการโอนสินค้า(เข้า)ตามรหัสสินค้า(PLU)");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jMenuItem9.setText("สรุปรายการโอนสินค้า(เข้า)ตามแผนกสินค้า(Dept)");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1018, 760));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btnDocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocnoActionPerformed
    searchDocF1Dialog();
}//GEN-LAST:event_btnDocnoActionPerformed

private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
    if (txt1.getText().equals("\\") || txt1.getText().equals("'")
            || txt1.getText().equals("\"")) {
        JOptionPane.showMessageDialog(this, "ไม่ควรขึ้นต้นเลขที่เอกสารด้วยเครื่องหมายดังต่อไปนี้ \n"
                + "( '\\' ) , ( ' ), ( \" )");
        txt1.setText("");
        txt1.requestFocus();
        return;
    } else if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
        JOptionPane.showMessageDialog(this, "กำหนดเลขที่เอกสารไม่ถูกต้อง ไม่ควรพิมพ์ค่าว่างระหว่างชื่อเลขที่เอกสาร !");
        txt1.setText("");
        txt1.requestFocus();
        return;
    }
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        if (txt1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, msgNotFoundDocno);
            txt1.requestFocus();
            return;
        }
        txt1_OnExit();
    } else if (evt.getKeyCode() == KeyEvent.VK_F1) {
        searchDocF1Dialog();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        if(txt1.getText().equals("")){
            dispose();
        }else{
            txt1.setText("");
            txt1.requestFocus();
            return;
        }
    }
}//GEN-LAST:event_txt1KeyPressed

private void txt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        btnFactory.setEnabled(true);
        txt4.setFocusable(true);
        txt4.requestFocus();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewDoc();
    }
}//GEN-LAST:event_txt3KeyPressed

private void txt4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt4Event();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewDoc();
    } else if (evt.getKeyCode() == KeyEvent.VK_F1) {
        searchBranchFileF1Dialog();
    }
}//GEN-LAST:event_txt4KeyPressed

private void txt5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5KeyPressed
}//GEN-LAST:event_txt5KeyPressed

private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt2_OnExit();
    }else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewDoc();
    }
}//GEN-LAST:event_txt2KeyPressed
    private boolean txt2_OnExit() {
        boolean isSave = false;
        String text = txt2.getText().trim();
        if (!text.equals("")||text.length()!=0) {
            //!
            SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date d = sim.parse(text);
                if(checkDate.validDate(d)){
                    isSave = true;
                    txt3.setFocusable(true);
                    txt3.requestFocus();
                }else{
                    txt2.requestFocus();
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "รูปแบบวันที่ไม่ถูกต้อง ! \n" +
                        "รูปแบบ = (วัน/เดือน/ปี คศ.) (01/01/2000)");
                txt2.requestFocus();
            }
        }else{
            JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ในการโอนสินค้าออก");
            txt2.requestFocus();
        }
        return isSave ;
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
private void btnFactoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactoryActionPerformed
    searchBranchFileF1Dialog();
}//GEN-LAST:event_btnFactoryActionPerformed

private void btn_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addnewActionPerformed
    cmdAddNew();
}//GEN-LAST:event_btn_addnewActionPerformed

private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
    cmdAddNew();
}//GEN-LAST:event_btn_cancelActionPerformed

private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
    if (txt1.getText().trim().equals("")) {
        JOptionPane.showMessageDialog(this, msgNotFoundDocno);
        txt1.requestFocus();
        return;
    }
    if(txt2_OnExit()){
        //uncheck digitnumber comming soon!
//        if (txt1.getText().trim().length() < 13 || txt1.getText().trim().length() > 13) {
//            PUtility.ShowError("ท่านระบุเลขที่เอกสารไม่ครบถ้วน \n" +
//                    "ต้องระบุจำนวน 13 หลัก");
//            txt1.setText("");
//            txt1.requestFocus();
//            return;
//        }
//        String str = txt1.getText().trim();
//        String bbb = str.substring(0, 3);
//        Db_branchfile dbb = new Db_branchfile();
//        String bcode = dbb.getBranchCode();
//        if (!bbb.equals(bcode)) {
//            PUtility.ShowError("ท่านระบุเลขที่เอกสารไม่ถูกต้อง กรุณาตรวจสอบ");
//            txt1.setText("");
//            txt1.requestFocus();
//            return;
//        } else {
//            String rrr = str.substring(3, 9);
//            String sum = str.substring(9, str.length());
//            if (!sum.equals(checkDigit(bbb, rrr))) {
//                PUtility.ShowMsg("เลขที่เอกสารไม่ถูกต้อง กรุณาตรวจสอบ");
//                txt1.setText("");
//                txt1.requestFocus();
//                return;
//            }
//        }
        cmdSaveUpdate();
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

}//GEN-LAST:event_btn_listdocnoActionPerformed

private void tblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowMouseClicked
    if (!isPost) {
        if (evt.getClickCount() == 2) {
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

            btnProduct.setEnabled(true);
            txt7.setFocusable(true);
            txt7.requestFocus();
        }
    }
}//GEN-LAST:event_tblShowMouseClicked

private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained
    txt2.setText(txt2.getText());
    txt2.selectAll();
}//GEN-LAST:event_txt2FocusGained

private void mn_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_addnewActionPerformed
    btn_addnewActionPerformed(null);
}//GEN-LAST:event_mn_addnewActionPerformed

private void mn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_cancelActionPerformed
    btn_addnewActionPerformed(null);
}//GEN-LAST:event_mn_cancelActionPerformed

private void mn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_saveActionPerformed
    btn_saveActionPerformed(null);
}//GEN-LAST:event_mn_saveActionPerformed

private void mn_deldocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_deldocnoActionPerformed
    btn_deldocnoActionPerformed(null);
}//GEN-LAST:event_mn_deldocnoActionPerformed

private void mn_listdocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_listdocnoActionPerformed
    btn_listdocnoActionPerformed(null);
}//GEN-LAST:event_mn_listdocnoActionPerformed

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

private void txt3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt3FocusGained
    txt3.setText(txt3.getText());
    txt3.selectAll();
}//GEN-LAST:event_txt3FocusGained

private void txt4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt4FocusGained
    txt4.setText(txt4.getText());
    txt4.selectAll();
}//GEN-LAST:event_txt4FocusGained

private void btnFactoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnFactoryFocusGained
    if (chkTxt1FocusLost()) {
    }
}//GEN-LAST:event_btnFactoryFocusGained

private void txt5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt5FocusGained
}//GEN-LAST:event_txt5FocusGained

private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txt5ActionPerformed

private void tblShowFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblShowFocusGained
}//GEN-LAST:event_tblShowFocusGained

private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
    cmdDateChoose1();
}//GEN-LAST:event_btnCalendarActionPerformed

private void txt5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5KeyReleased
    escapeEvent(evt);
}//GEN-LAST:event_txt5KeyReleased

private void btnFactoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFactoryKeyPressed
    escapeEvent(evt);
}//GEN-LAST:event_btnFactoryKeyPressed

private void tblShowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblShowKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        if (!isPost) {
            txt6.requestFocus();
        } else {
            addNewDoc();
        }
    } else if (!isPost) {
        if (evt.getKeyCode() == evt.VK_ENTER) {
            int index = tblShow.getSelectedRow();
            if (index < 0) {
                index = 0;
            }
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
            tblShow.setRowSelectionInterval(0, index);
            tblShow.scrollRectToVisible(tblShow.getCellRect(index, 0, true));
        }
    }
}//GEN-LAST:event_tblShowKeyPressed

private void txt13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt13KeyPressed
    escapeProEvent(evt);
}//GEN-LAST:event_txt13KeyPressed

private void txt13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt13FocusGained
}//GEN-LAST:event_txt13FocusGained

private void btnDelItemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDelItemFocusGained
}//GEN-LAST:event_btnDelItemFocusGained

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

private void btnAddItemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAddItemFocusGained
}//GEN-LAST:event_btnAddItemFocusGained

private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
    if (txt1.getText().equals("")) {
        txt1.requestFocus();
        return;
    }
    if (txt4.getText().equals("")) {
        txt4.requestFocus();
        return;
    } else if (txt7.getText().equals("")) {
        txt7.setFocusable(true);
        txt7.requestFocus();
        JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสินค้า");
        return;
    } else if (txt9.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "กรุณาระบุคลังสินค้า");
        txt9.setFocusable(true);
        txt9.requestFocus();
        return;
    }
    if(!CheckMakeStock.txt7_Stock(txt7.getText())){        
        addNewItem();
        txt7.setFocusable(true);
        txt7.requestFocus();
        return;
    }
    //ตรวจสอบ flag ว่าให้กำหนดแจ้งเตือนหรือไม
    Db_company db = new Db_company();
    stock_update stk = new stock_update();
    stk.stock_update();
    boolean minimumchk = db.getCompanyDetail().getMinchk().equals("Y");

    if (txt10.getText().indexOf("-") != -1) {
        if (minimumchk) {
            if(stk.checkStock(txt9.getText(), txt7.getText(), Double.parseDouble(txt10.getText()))){
                txt10.requestFocus();
                return;
            }else{
                cmdOk();
            }
        }
    }
    cmdOk();
}//GEN-LAST:event_btnAddItemActionPerformed

private void txt11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt11KeyPressed
    escapeProEvent(evt);
}//GEN-LAST:event_txt11KeyPressed

private void txt11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt11FocusGained
}//GEN-LAST:event_txt11FocusGained

private void txt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt11ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txt11ActionPerformed

private void txt12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt12FocusGained
}//GEN-LAST:event_txt12FocusGained

private void txt10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt10FocusGained
    txt10.setText(txt10.getText());
    txt10.selectAll();
}//GEN-LAST:event_txt10FocusGained

private void btnStockFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnStockFocusGained
}//GEN-LAST:event_btnStockFocusGained

private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
    searchStkF1Dialog();
}//GEN-LAST:event_btnStockActionPerformed

private void txt9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_F1) {
        searchStkF1Dialog();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt9Event();
    }
}//GEN-LAST:event_txt9KeyPressed

private void txt9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt9FocusGained
    txt9.setText(txt9.getText());
    txt9.selectAll();
}//GEN-LAST:event_txt9FocusGained

private void txt8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8KeyPressed
    escapeProEvent(evt);
}//GEN-LAST:event_txt8KeyPressed

private void txt8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt8FocusGained
}//GEN-LAST:event_txt8FocusGained

private void btnProductFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnProductFocusGained
    if (chkTxt1FocusLost()) {
    } else if (chkTxt4FocusLost()) {
    }
}//GEN-LAST:event_btnProductFocusGained

private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
    searchProF1Dialog();
    txt7Event();
    txt7.requestFocus();
}//GEN-LAST:event_btnProductActionPerformed

private void txt7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyReleased
    productAuto();
}//GEN-LAST:event_txt7KeyReleased

private void txt7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_F1) {
        searchProF1Dialog();
        txt7Event();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }else if(evt.getKeyCode()==KeyEvent.VK_ENTER){        
        txt7Event();
    }
}//GEN-LAST:event_txt7KeyPressed

private void txt7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt7FocusLost
}//GEN-LAST:event_txt7FocusLost

private void txt7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt7FocusGained
    txt7.selectAll();
}//GEN-LAST:event_txt7FocusGained

private void txt6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyReleased

}//GEN-LAST:event_txt6KeyReleased

private void txt6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt6.setFocusable(false);
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
            }
        }
        btnProduct.setEnabled(true);
        txt7.setFocusable(true);
        txt7.requestFocus();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewDoc();
    } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
        tblShow.requestFocus();
    }

}//GEN-LAST:event_txt6KeyPressed

private void txt6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt6FocusLost
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
}//GEN-LAST:event_txt6FocusLost

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

private void txt15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt15KeyPressed
    escapeProEvent(evt);
}//GEN-LAST:event_txt15KeyPressed

private void txt15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt15FocusGained
}//GEN-LAST:event_txt15FocusGained

private void txt14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt14KeyPressed
    escapeProEvent(evt);
}//GEN-LAST:event_txt14KeyPressed

private void txt14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt14FocusGained
}//GEN-LAST:event_txt14FocusGained

private void txt10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt10KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        try {
            Double x = Double.parseDouble(txt10.getText());
            if(x==0){
                    JOptionPane.showMessageDialog(this, "ระบุจำนวนสินค้าไม่ถูกต้อง \n" +
                            "จำนวนสินค้าไม่ควรเป็น 0");
                    txt10.requestFocus();
                }else{
                    btnAddItem.setFocusable(true);
                    btnAddItem.requestFocus();
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "จำนวนการสั่งต้องเป็นจำนวนเต็มเท่านั้น \n" +
                        "เช่น 1-10, -1,-2,-3","แจ้งเตือน", JOptionPane.ERROR_MESSAGE);
            txt10.requestFocus();
            return;
        }
    }
}//GEN-LAST:event_txt10KeyPressed

private void tblShowKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblShowKeyReleased
}//GEN-LAST:event_tblShowKeyReleased

private void mn_postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_postActionPerformed
    if (PublicVar.TempUser.Stock7.equals("Y")) {
        if (txt1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, msgNotFoundDocno);
            txt1.requestFocus();
            return;
        }
        stock_update stk = new stock_update();
        stk.stock_update();
//        String overstock = db.getCompanyDetail().getOvrstk();

        boolean posStock = true;
        Db_company db = new Db_company();
        boolean minimumchk = db.getCompanyDetail().getMinchk().equals("Y");
        if (minimumchk) {
            for (int i = 0; i < tblShow.getRowCount(); i++) {
                String r_no = txt1.getText();
                String pcode = "" + tblShow.getValueAt(i, 1);
                String stk2 = "" + tblShow.getValueAt(i, 3);

                if (stk.checkStock("tranin", stk2, pcode, r_no)) {
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
            if(txt2_OnExit()){
                PostStock();
            }else{
                txt2.requestFocus();
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "พนักงานรหัสนี้ ไม่สามารถเข้าทำงานรายการนี้ได้...");
    }
}//GEN-LAST:event_mn_postActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
// TODO add your handling code here:
    cmdReportByCode();
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
// TODO add your handling code here:
    cmdReportByGroup();
}//GEN-LAST:event_jMenuItem9ActionPerformed

private void txt10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt10KeyReleased
    try {
        Float.parseFloat(txt10.getText().trim());
        calculateValues();
    } catch (NumberFormatException ex) {
        txt12.setText("Input Number Only!");
    }
}//GEN-LAST:event_txt10KeyReleased

private void btnAddItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddItemKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }
}//GEN-LAST:event_btnAddItemKeyPressed

private void txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1FocusGained
    txt1.setText(txt1.getText());
    txt1.selectAll();
}//GEN-LAST:event_txt1FocusGained

private void txt4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyReleased
    branchAuto();
}//GEN-LAST:event_txt4KeyReleased

private void btnDelItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDelItemKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }
}//GEN-LAST:event_btnDelItemKeyPressed
    public String checkDigit(String bbb, String rrrrrr) {
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Main_tranin dialog = new Main_tranin(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnDelItem;
    private javax.swing.JButton btnDocno;
    private javax.swing.JButton btnFactory;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
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

    ////////////////////////////////////////////////////////////////////////////
    //////////////////  Utility ////////////////////////////////////////////////
    private String msgNotFoundDocno = "กรุณาระบุเลขที่เอกสาร !";
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
        //lbl2.setText("รับโอนสินค้าจากสาขา ");
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
        btnFactory.setEnabled(false);
        txt5.setText("");

        txt14.setText("");
        txt15.setText("");

        que = 1;
        isPost = false;
        resetTableModel();
        addNewItem();
    }

    private void resetTableModel() {
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            model.removeRow(0);
        }
    }

    private void initTableComponents() {
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
        int[] colSize = {50, 100, 200, 50, 90, 80, 90, 95, 75, 100, 80};
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
        tcm.getColumn(5).setCellRenderer(d);


        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.CENTER);
        tcm.getColumn(3).setCellRenderer(d);
        tcm.getColumn(8).setCellRenderer(d);
        tcm.getColumn(9).setCellRenderer(d);
        tcm.getColumn(10).setCellRenderer(d);

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
    }

    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////// Header & Detail ///////////////////////////////
    private Htranin setHeaderBean() {
        Htranin row = new Htranin();
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

    private Tranin setDetailBean() {
        Tranin row = new Tranin();
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
            Db_htranin hr = new Db_htranin();
            if (!hr.insert(setHeaderBean())) {
                System.err.println("Insert Fail!");
            }
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }
    }

    private void updateHeader() {
        try {
            Db_htranin hr = new Db_htranin();
            if (hr.update(setHeaderBean())) {
            } else {
                JOptionPane.showMessageDialog(this, "Field Error! Can not update Header.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void insertDetail() {
        try {
            Db_tranin hr = new Db_tranin();
            if (hr.insert(setDetailBean())) {
            } else {
                JOptionPane.showMessageDialog(this, "Field Error! Can not insert Detail.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void updateDetail() {
        try {
            Db_tranin hr = new Db_tranin();
            if (hr.update(setDetailBean())) {
            } else {
                JOptionPane.showMessageDialog(this, "Field Error! Can not update Detail.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private boolean checkDocnew() {
        Db_htranin hr = null;
        try {
            hr = new Db_htranin();
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

    private boolean seekDocno() {
        Db_htranin hr = null;
        try {
            hr = new Db_htranin();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (hr.seek(txt1.getText().trim())) {
            System.out.println("It is not new Doc.");
            return true;
        } else {
            System.out.println("It is new Doc.");
            return false;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////  Search Dialog ////////////////////////////////
    private boolean searchDocF1Dialog() {
        Jdi_browse_htranin rsd = new Jdi_browse_htranin(new NimbusFrame(), true);
        rsd.setLocation(btnDocno.getLocationOnScreen());
        rsd.setVisible(true);
        Htranin hrb = rsd.getDataRecord();
        if (hrb != null) {
            txt1.setText(hrb.getR_no());
            return true;
        } else {
            txt1.requestFocus();
            return false;
        }
    }

    private boolean searchBranchFileF1Dialog() {
        jdi_browseBranchFile rsd = new jdi_browseBranchFile(new NimbusFrame(), true);
        rsd.setLocation(btnFactory.getLocationOnScreen());
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
    private void txt1_OnExit() {
        isPost = false;
        isDocnew = checkDocnew();
        if (isDocnew) {
            //uncheck digitnumber from branch to order
            //comming soon to check!
//            if(txt1.getText().length()==13){
//                String text = txt1.getText().trim();
//                String str = txt1.getText().trim();
//                String bbb = str.substring(0, 3);
//                Db_branchfile dbb = new Db_branchfile();
//                String bcode = dbb.getBranchCode();
//                if (!bbb.equals(bcode)) {
//                    PUtility.ShowError("ท่านระบุเลขที่เอกสารไม่ถูกต้อง กรุณาตรวจสอบ");
//                    txt1.requestFocus();
//                    return;
//                } else {
//                    String rrr = str.substring(3, 9);
//                    String sum = str.substring(9, str.length());
//                    if (!sum.equals(checkDigit(bbb, rrr))) {
//                        PUtility.ShowMsg("เลขที่เอกสารไม่ถูกต้อง กรุณาตรวจสอบ");
//                        txt1.requestFocus();
//                        return;
//                    }
//                }
//            }else{
//                if(!seekDocno()){
//                    JOptionPane.showMessageDialog(this, "กรุณาระบุเลขที่เอกสารให้ถูกต้อง !");
//                    txt1.setText("");
//                    txt1.requestFocus();
//                    return;
//                }
//            }
            txt1.setBackground(colorDisable);
            txt1.setFocusable(false);
            txt2.setFocusable(true);
            txt2.requestFocus();
            btnCalendar.setEnabled(true);
            btnDocno.setEnabled(false);
        } else {
            isPost = loadHeader(txt1.getText());
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
            btnFactory.setEnabled(false);
            loadDetail(txt1.getText());
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
        }

        calculateValues();
    }

    private void txt4Event() {
        if (txt4.getText().trim().equals("") || txt4.getText() == null) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสาขา");
            txt4.requestFocus();
            return;
        } else {
            boolean b = false;

            Db_branchfile db = new Db_branchfile();

            if (!db.seek(txt4.getText().trim())) {
                JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสาขาให้ถูกต้อง");
                txt4.requestFocus();
                b = false;
                return;
            } else {
                txt5.setText("รับโอนสินค้าจาก " + db.getBranchFile(txt4.getText()).getBranchName());
                //lbl2.setText("รับโอนสินค้าจาก " + db.getBranchFile(txt4.getText()).getBranchName());
                b = true;
            }

            if (b) {
                txt6.setFocusable(true);
                txt6.requestFocus();
            } else {
                txt4.requestFocus();
                return;
            }
        }
    }

    private void branchAuto() {
        Db_branchfile db = new Db_branchfile();
        if(db.getBranchFile(txt4.getText())!=null){
            txt5.setText("รับโอนสินค้าจาก " + db.getBranchFile(txt4.getText()).getBranchName());
            //lbl2.setText("รับโอนสินค้าจาก " + db.getBranchFile(txt4.getText()).getBranchName());
        }
    }

    private void txt7Event() {
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
            if(b){
                btnStock.setEnabled(true);
                txt9.setFocusable(true);
                txt9.requestFocus();
            }else{
                txt7.requestFocus();
            }
        }
    }

    private void txt9Event() {
        String text = txt9.getText().trim();
        if (text.equals("") || text == null) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสคลังสินค้า");
            txt9.requestFocus();
        } else {
            boolean b = false;
            try {
                Db_stockfile db = new Db_stockfile();

                if (!db.seek(text)) {
                    JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสคลังสินค้าให้ถูกต้อง");
                    b = false;
                    txt9.requestFocus();
                    return;
                } else {
                    Stockfile row = db.getRecordAt(text);
                    txt9.setText(row.getStkcode());
                    stockData = row.getStkcode();
                    b = true;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
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

    private boolean loadHeader(String text) {
        try {
            String sql = "SELECT h.* , f.* FROM htranin h , branfile f where h.r_bran = f.code AND h.r_no ='" + text + "'";
            System.out.println(sql);
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            if (!rs.next()) {
                return false;
            }
            txt1.setText(rs.getString("r_no"));
            txt2.setText(dateFmtShow.format(rs.getDate("r_date")));
            txt3.setText(rs.getString("r_remark"));
            txt4.setText(rs.getString("r_bran"));
            txt5.setText("รับโอนสินค้าจาก " + rs.getString("name"));
            //lbl2.setText("รับโอนสินค้าจาก " + rs.getString("name"));

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
        for (int i = 0; i < rowcount; i++) {
            model.removeRow(0);
        }
        double amount = 0.0;
        try {
            String sql = "SELECT r.*, p.pdesc FROM tranin r , product p WHERE r.r_pcode=p.pcode AND r.r_no = '" + text + "'";
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

                txt9.setText(rs.getString("r_stock"));
                model.addRow(row);
                amount = amount + rs.getDouble("r_amount");

            }
            int RowCount = model.getRowCount();
            showCell(RowCount - 1, 0);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        txt14.setText(tblShow.getRowCount() + " รายการ");
        txt15.setText(doubleFmt.format(amount) + " บาท");

    }

    ////////////////////////////////////////////////////////////////////////////
    ///////////////////////////// CMD //////////////////////////////////////////
    private void cmdAddNew() {
        addNewDoc();
        txt1.requestFocus();
    }

    private void cmdSaveUpdate() {
        //check Values
        if (txt1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่เลขที่เอกสารให้ถูกต้อง");
            txt1.requestFocus();
        } else if (txt2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่วันที่รับสินค้าให้ถูกต้อง");
            txt2.requestFocus();
        } else if (txt4.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสสาขาให้ถูกต้อง");
            txt4.requestFocus();
        } else {


            Db_branchfile fac = new Db_branchfile();
            if (!fac.seek(txt4.getText().trim())) {
                JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสสาขาให้ถูกต้อง");
                txt4.setText("");
                txt4.requestFocus();
                return;
            }

            Db_htranin db = null;
            try {
                db = new Db_htranin();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            isDocnew = checkDocnew();
            if (isDocnew) {
                insertHeader();
            } else {
                if (db.seek(txt1.getText().trim(), "N")) {
                    updateHeader();
                    //txt1Event();
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

        String sql = "SELECT * FROM htranin where r_no ='" + text + "' AND " + "r_post = 'N'";
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

                sql = "DELETE FROM htranin where r_no='" + text + "'";
                int result = MySQLConnect.con.createStatement().executeUpdate(sql);
                System.out.println(sql);
                System.out.println("Result = " + result);

                sql = "DELETE FROM tranin where r_no='" + text + "'";
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
        new Jdi_report_tranin(new NimbusFrame(), true).setVisible(true);
        if (!PublicVar.ReturnString.equals("")) {
            txt1.setText(PublicVar.ReturnString);
            txt1_OnExit();
        }
    }

    private void cmdPrintOrder() {
        if (!txt1.getText().equals("")) {
            ViewReport vp = new ViewReport();
            vp.printReportTranin(txt1.getText());
        }
    }

    private void cmdExit() {
        dispose();
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
            JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสโรงงานให้ถูกต้อง");
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
                    JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสโรงงานให้ถูกต้อง");
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
            loadDetail(txt1.getText());
            calculateValues();
            isDocnew = checkDocnew();
            System.out.println("IsDocnew = " + isDocnew);
            if (isDocnew) {
                insertHeader();
            } else {
                updateHeader();
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

        int que2 = Integer.parseInt(txt6.getText().trim());

        String r_no = txt1.getText().trim();
        try {
            Db_tranin db = new Db_tranin();
            if (db.delete(r_no, que2)) {
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

    private void cmdReportByCode() {
        new Jdi_report_sumTraninPLU(new NimbusFrame(), true).setVisible(true);
    }

    private void cmdReportByGroup() {
        new Jdi_report_sumTraninGroup(new NimbusFrame(), true).setVisible(true);
    }

    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////// CheckFocus ////////////////////////////////////
    private boolean chkTxt1FocusLost() {
        if (txt1.getText().trim().equals("") || txt1.getText().trim() == null) {
            txt1.requestFocus();
            return true;
        } else {
            return false;
        }
    }

    private boolean chkTxt4FocusLost() {
        if (txt4.getText().trim().equals("") || txt4.getText().trim() == null) {
            txt4.requestFocus();
            return true;
        } else {
            return false;
        }
    }
    ////////////////////////////////////////////////////////////////////////////

    private void escapeEvent(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }

    private void escapeProEvent(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            txt6.requestFocus();
            txt7.setText("");
            txt8.setText("");
            txt10.setText("0.000");
            txt12.setText("0.00");
            txt11.setText("0.00");
            txt13.setText("");
            txt14.setText("0 รายการ");
            txt15.setText("0 บาท");
        }
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

    private void setReadOnly() {
        setActive(false, colorDisable);
    }
    void setActive(boolean active, Color color) {
        txt1.setBackground(color);
        txt2.setBackground(color);
        txt3.setBackground(color);
        txt4.setBackground(color);
        txt6.setBackground(color);
        txt7.setBackground(color);
        txt9.setBackground(color);
        txt10.setBackground(color);
        txt1.setFocusable(active);
        txt2.setFocusable(active);
        txt3.setFocusable(active);
        txt4.setFocusable(active);
        txt6.setFocusable(active);
        txt7.setFocusable(active);
        txt9.setFocusable(active);
        txt10.setFocusable(active);

        btnDocno.setEnabled(active);
        btnCalendar.setEnabled(active);
        btnFactory.setEnabled(active);
        btnProduct.setEnabled(active);
        btnStock.setEnabled(active);
        btnAddItem.setEnabled(active);
        btnDelItem.setEnabled(active);
        btnAddItem.setFocusable(active);
        btn_save.setEnabled(active);
        btn_deldocno.setEnabled(active);
    }

    private void SetEditable() {
        txt1.setFocusable(true);
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

        txt12.setBackground(Color.white);

        txt11.setBackground(Color.white);
        btnFactory.setEnabled(true);
        btnProduct.setEnabled(true);
        btnStock.setEnabled(true);
        btnAddItem.setEnabled(true);
        btnDelItem.setEnabled(true);
        btnCalendar.setEnabled(Main.ChangeInventoryDate);
    }

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
            String SqlQuery = "update tranin set r_post='Y' where r_no='" + TDoc + "' and r_que=" + TQue;
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
            String SqlQuery = "update htranin set r_post='Y',r_userpost='" + user + "',r_postdate='" + SqlDateFmt.format(date) + "',r_posttime='" + FullTimeFmt.format(date) + "' where r_no='" + TDoc + "'";
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void PostStock() {
        if (isPost) {
            return;
        }
        if (ChkPasswordPost()) {
            String TDoc = txt1.getText();
            if(TDoc.equals("")){
                txt1.requestFocus();
                return;
            }
            int totalRec = 0;
            int CurRec = 0;
            try {
                Statement stmt = (Statement) MySQLConnect.con.createStatement();
                String SQLQuery = "select tranin.r_no,r_date,r_que,r_pcode,r_stock,r_qty,r_amount,tranin.r_post from tranin left join htranin on tranin.r_no=htranin.r_no where tranin.r_no='" + TDoc + "' ";
                ResultSet rec = stmt.executeQuery(SQLQuery);
                rec.last();
                totalRec = rec.getRow();
                CurRec = 0;
                rec.first();
                if (rec.getRow() == 0) {
                    JOptionPane.showMessageDialog(this, "กรุณาป้อนรายการ..ก่อนทำการ POST สต้อกสินค้า...");
                    txt6.requestFocus();
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
                        String T_Rem = "TRI";
                        String TPost = rec.getString("r_post");
                        if (!TPost.equals("Y")) {
                            stock_update st = new stock_update();
                            st.ProcessStockIn(TDoc, TStk, TCode, TDate, T_Rem, TempQty, TempAmt, user);
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
}
