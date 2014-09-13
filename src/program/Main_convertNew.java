package program;

import DBcontrol.Db_company;
import DBcontrol.Db_convert;
import DBcontrol.Db_hconvert;
import DBcontrol.Db_product;
import DBcontrol.Db_stockfile;
import DBcontrol.MySQLConnect;
import Bean.Convert;
import Bean.Hconvert;
import Bean.Product;
import Bean.Stockfile;
import Main.browser.Jdi_browse_hconvert;
import Main.browser.Jdi_browse_stockfile;
import Main.browser.jdi_browse_convertprint;
import Main.viewreport.Jdi_Inv_product;
import Main.viewreport.Jdi_report_sumConvertGroup;
import Main.viewreport.Jdi_report_sumConvertPLU;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import report.ViewReport;
import utilities.DateChooser.DateChooserDialog;
import utilities.Format;
import utilities.NimbusFrame;
import utilities.date_time.DateAndTime;

public class Main_convertNew extends javax.swing.JDialog {

    private CheckDate checkDate;
    private Color colorDisable = new Color(246, 248, 200);
    private Color colorBlue = new Color(154, 219, 242);
    private Color colorRed = new Color(253, 138, 129);

    public Main_convertNew(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        createView();
        setTableConvertIn();
        setTableConvertOut();

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
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JFormattedTextField();
        btnCalendar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        btnDocno = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnProduct = new javax.swing.JButton();
        txt8 = new javax.swing.JTextField();
        txt10 = new javax.swing.JFormattedTextField();
        txt12 = new javax.swing.JFormattedTextField();
        txt13 = new javax.swing.JTextField();
        btnDelItem = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt11 = new javax.swing.JFormattedTextField();
        txt7 = new javax.swing.JTextField();
        txt6 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txt9 = new javax.swing.JTextField();
        btnStock = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_compute = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt15 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConvertIn = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConvertOut = new javax.swing.JTable();
        txt16 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mn_addnew = new javax.swing.JMenuItem();
        mn_cancel = new javax.swing.JMenuItem();
        mn_save = new javax.swing.JMenuItem();
        mn_deldocno = new javax.swing.JMenuItem();
        mn_listdocno = new javax.swing.JMenuItem();
        mn_post = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mn_exit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แปรรูปสินค้า");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_addnew.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_addnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.gif"))); // NOI18N
        btn_addnew.setText("เพิ่มเอกสาร");
        btn_addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addnewActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancle.gif"))); // NOI18N
        btn_cancel.setText("ยกเลิก");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.gif"))); // NOI18N
        btn_save.setText("บันทึกข้อมูล");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_deldocno.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_deldocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btn_deldocno.setText("ลบรายการ");
        btn_deldocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deldocnoActionPerformed(evt);
            }
        });

        btn_listdocno.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_listdocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open.gif"))); // NOI18N
        btn_listdocno.setText("แสดงรายการ");
        btn_listdocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listdocnoActionPerformed(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        btn_print.setText("พิมพ์");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.gif"))); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Norasi", 1, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("Enter เพื่อสร้างเอกสารอัตโนมัติ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_addnew, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_deldocno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_listdocno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(62, 62, 62)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addnew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deldocno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_listdocno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("หมายเหตุ");

        txt1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("วันที่");

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
        btnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("เลขที่เอกสาร");

        txt3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
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

        btnDocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnDocno.setFocusable(false);
        btnDocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocnoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(176, 214, 217));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl2.setFont(new java.awt.Font("Norasi", 1, 24)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("บันทึกการแปรรูปสินค้า");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDocno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDocno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel5.setText("จำนวน (Qty)");

        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        txt8.setBackground(new java.awt.Color(248, 247, 200));
        txt8.setEditable(false);
        txt8.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N

        txt10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##0.000"))));
        txt10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt10.setText("0.000");
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

        txt12.setBackground(new java.awt.Color(248, 247, 200));
        txt12.setEditable(false);
        txt12.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txt12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt12.setText("0.00");
        txt12.setFocusable(false);
        txt12.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N

        txt13.setBackground(new java.awt.Color(248, 247, 200));
        txt13.setEditable(false);
        txt13.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDelItem.setFont(new java.awt.Font("Norasi", 1, 12)); // NOI18N
        btnDelItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btnDelItem.setText("ลบรายการ");
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

        jLabel6.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel6.setText("รหัสสินค้า (PLU Code)");

        jLabel7.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel7.setText("ราคา/หน่วย");

        jLabel8.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel8.setText("จำนวน(Amount)");

        txt11.setBackground(new java.awt.Color(248, 247, 200));
        txt11.setEditable(false);
        txt11.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txt11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt11.setFocusable(false);
        txt11.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N

        txt7.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
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

        txt6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setText("1");
        txt6.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt6FocusGained(evt);
            }
        });
        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt6KeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel9.setText("ลำดับ");

        txt9.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("คลัง");

        btn_compute.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_compute.setText("คำนวณรายการสินค้าที่จ่ายออกเพื่อแปรรูป");
        btn_compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_computeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btn_compute, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(btnDelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(txt11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_compute, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbl1.setFont(new java.awt.Font("Norasi", 1, 16)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 0, 0));
        lbl1.setText(".");
        lbl1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Norasi", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(247, 16, 11));
        jLabel11.setText("จ่ายออกเพื่อการแปรรูป");

        jLabel12.setFont(new java.awt.Font("Norasi", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(33, 41, 104));
        jLabel12.setText("รับเข้าจากการแปรรูป");

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txt15.setBackground(new java.awt.Color(248, 247, 200));
        txt15.setEditable(false);
        txt15.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt15.setText("จำนวนรายการ:");
        txt15.setFocusable(false);
        txt15.setRequestFocusEnabled(false);

        tblConvertIn.setAutoCreateRowSorter(true);
        tblConvertIn.setBackground(new java.awt.Color(166, 208, 219));
        tblConvertIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัสสินค้า", "ชื่อสินค้า", "จำนวน", "ประเภท", "คลัง", "หน่วย", "ราคา/หน่วย", "มูลค่ารวม"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConvertIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConvertInMouseClicked(evt);
            }
        });
        tblConvertIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblConvertInFocusGained(evt);
            }
        });
        tblConvertIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblConvertInKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblConvertIn);
        if (tblConvertIn.getColumnModel().getColumnCount() > 0) {
            tblConvertIn.getColumnModel().getColumn(0).setMinWidth(50);
            tblConvertIn.getColumnModel().getColumn(0).setMaxWidth(50);
            tblConvertIn.getColumnModel().getColumn(1).setMinWidth(80);
            tblConvertIn.getColumnModel().getColumn(1).setMaxWidth(80);
            tblConvertIn.getColumnModel().getColumn(2).setMinWidth(250);
            tblConvertIn.getColumnModel().getColumn(2).setMaxWidth(250);
            tblConvertIn.getColumnModel().getColumn(3).setMinWidth(100);
            tblConvertIn.getColumnModel().getColumn(3).setMaxWidth(100);
            tblConvertIn.getColumnModel().getColumn(4).setMinWidth(80);
            tblConvertIn.getColumnModel().getColumn(4).setMaxWidth(80);
            tblConvertIn.getColumnModel().getColumn(5).setMinWidth(50);
            tblConvertIn.getColumnModel().getColumn(5).setMaxWidth(50);
            tblConvertIn.getColumnModel().getColumn(6).setMinWidth(50);
            tblConvertIn.getColumnModel().getColumn(6).setMaxWidth(50);
            tblConvertIn.getColumnModel().getColumn(7).setMinWidth(100);
            tblConvertIn.getColumnModel().getColumn(7).setMaxWidth(100);
            tblConvertIn.getColumnModel().getColumn(8).setMinWidth(100);
            tblConvertIn.getColumnModel().getColumn(8).setMaxWidth(100);
        }

        tblConvertOut.setAutoCreateRowSorter(true);
        tblConvertOut.setBackground(new java.awt.Color(236, 180, 218));
        tblConvertOut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัสสินค้า", "ชื่อสินค้า", "จำนวน", "ประเภท", "คลัง", "หน่วย", "ราคา/หน่วย", "มูลค่ารวม"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConvertOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConvertOutMouseClicked(evt);
            }
        });
        tblConvertOut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblConvertOutFocusGained(evt);
            }
        });
        tblConvertOut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblConvertOutKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblConvertOut);
        if (tblConvertOut.getColumnModel().getColumnCount() > 0) {
            tblConvertOut.getColumnModel().getColumn(0).setMinWidth(50);
            tblConvertOut.getColumnModel().getColumn(0).setMaxWidth(50);
            tblConvertOut.getColumnModel().getColumn(1).setMinWidth(80);
            tblConvertOut.getColumnModel().getColumn(1).setMaxWidth(80);
            tblConvertOut.getColumnModel().getColumn(2).setMinWidth(250);
            tblConvertOut.getColumnModel().getColumn(2).setMaxWidth(250);
            tblConvertOut.getColumnModel().getColumn(3).setMinWidth(100);
            tblConvertOut.getColumnModel().getColumn(3).setMaxWidth(100);
            tblConvertOut.getColumnModel().getColumn(4).setMinWidth(80);
            tblConvertOut.getColumnModel().getColumn(4).setMaxWidth(80);
            tblConvertOut.getColumnModel().getColumn(5).setMinWidth(50);
            tblConvertOut.getColumnModel().getColumn(5).setMaxWidth(50);
            tblConvertOut.getColumnModel().getColumn(6).setMinWidth(50);
            tblConvertOut.getColumnModel().getColumn(6).setMaxWidth(50);
            tblConvertOut.getColumnModel().getColumn(7).setMinWidth(100);
            tblConvertOut.getColumnModel().getColumn(7).setMaxWidth(100);
            tblConvertOut.getColumnModel().getColumn(8).setMinWidth(100);
            tblConvertOut.getColumnModel().getColumn(8).setMaxWidth(100);
        }

        txt16.setBackground(new java.awt.Color(248, 247, 200));
        txt16.setEditable(false);
        txt16.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt16.setText("จำนวนรายการ:");
        txt16.setFocusable(false);
        txt16.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("ฟังก์ชัน (Function)");
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
        mn_cancel.setText("ยกเลิกรายการ (Cancel)");
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
        mn_deldocno.setText("ลบข้อมูล (Delete)");
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

        mn_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mn_exit.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_exit.setText("จบการทำงาน");
        mn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_exitActionPerformed(evt);
            }
        });
        jMenu1.add(mn_exit);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("รายงาน (Report)");
        jMenu4.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N

        jMenuItem10.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jMenuItem10.setText("สรุปรายการแปรรูปสินค้า(เข้า)ตามรหัสสินค้า(PLU)");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        setSize(new java.awt.Dimension(1024, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        dropview();
        dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_listdocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listdocnoActionPerformed
        jdi_browse_convertprint dialog = new jdi_browse_convertprint(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        if (!PublicVar.ReturnString.equals("")) {
            txt1.setText(PublicVar.ReturnString);
            txt1.setBackground(colorDisable);
            txt1.setFocusable(false);
            try {
                if (!new Db_hconvert().seek(txt1.getText())) {
                    addNewDoc();
                    JOptionPane.showMessageDialog(this, "ไม่พบเลขที่เอกสารในฐานข้อมูล กรุณาตรวจสอบ !");
                    return;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Main_convertNew.class.getName()).log(Level.SEVERE, null, ex);
            }
            txt1onAction();
            loadDetail(txt1.getText());
            if (checkPostStk(txt1.getText())) {
                SetReadOnly();
                lbl1.setText("เอกสารนี้ได้ทำการบันทึกเข้าสต็อกสินค้าแล้วไม่สามารถแก้ไขได้");
            }
            txt2.setText(dateFmtShow.format(new Date()));
        } else {
            txt1.requestFocus();
        }
    }//GEN-LAST:event_btn_listdocnoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txt1.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1FocusGained
        
    }//GEN-LAST:event_txt1FocusGained
    private String newGenerate = "~New Document~";
    private boolean newDocument = false;
    private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && txt1.getText().equals("")) {
            txt1.setText(newGenerate);
            txt1.setBackground(colorDisable);
            txt1.setFocusable(false);
            btnDocno.setEnabled(false);
            txt2.setFocusable(true);
            txt2.setText(dateFmtShow.format(new Date()));
            btnCalendar.setEnabled(true);
            btn_save.setEnabled(false);
            newDocument = false;
            txt2.setFocusable(true);
            txt2.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txt1.getText().equals("")) {
                txt1.setBackground(colorDisable);
                txt1.setFocusable(false);
                try {
                    if (!new Db_hconvert().seek(txt1.getText())) {
                        addNewDoc();
                        JOptionPane.showMessageDialog(this, "ไม่พบเลขที่เอกสารในฐานข้อมูล กรุณาตรวจสอบ !");
                        return;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Main_convertNew.class.getName()).log(Level.SEVERE, null, ex);
                }
                txt1onAction();
                loadDetail(txt1.getText());
                txt6.setFocusable(false);
                txt7.setFocusable(true);
                txt7.requestFocus();
                if (checkPostStk(txt1.getText())) {
                    SetReadOnly();
                    lbl1.setText("เอกสารนี้ได้ทำการบันทึกเข้าสต็อกสินค้าแล้วไม่สามารถแก้ไขได้");
                }
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_F1) {
            searchDocF1Dialog();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            if (txt1.getText().equals("")) {
                dispose();
            } else {
                addNewDoc();
            }
        }
    }//GEN-LAST:event_txt1KeyPressed

    private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained
        txt2.setText(txt2.getText());
        txt2.selectAll();
    }//GEN-LAST:event_txt2FocusGained

    private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt2_OnExit();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            addNewDoc();
        }
    }//GEN-LAST:event_txt2KeyPressed
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
            JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ในการรับสินค้าจากโรงงาน");
            txt2.requestFocus();
        }
        return isSave;
    }
    private void txt3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt3FocusGained
        txt3.selectAll();
    }//GEN-LAST:event_txt3FocusGained

    private void txt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt6.setFocusable(true);
            txt6.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            addNewDoc();
        }
    }//GEN-LAST:event_txt3KeyPressed

    private void txt10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt10FocusGained
        txt10.setText(txt10.getText());
        txt10.selectAll();
    }//GEN-LAST:event_txt10FocusGained

    private void txt10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt10KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt10.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "กรุณาระบุจำนวนสินค้า");
                txt10.requestFocus();
                return;
            } else if (!txt10.getText().equals("")) {
                try {
                    if (Double.parseDouble(txt10.getText()) == 0) {
                        JOptionPane.showMessageDialog(this, "ระบุจำนวนสินค้าไม่ถูกต้อง \n"
                                + "จำนวนสินค้าไม่ควรเป็น 0");
                        txt10.requestFocus();
                    } else {
                        btnAddItem.setFocusable(true);
                        btnAddItem.requestFocus();
                    }
                    return;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "กรุณาป้อนจำนวนสินค้าเป็นตัวเลขเท่านั้น");
                    txt10.requestFocus();
                    return;
                }
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            addNewItem();
            txt6.setFocusable(true);
            txt6.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tblConvertIn.requestFocus();
        }
    }//GEN-LAST:event_txt10KeyPressed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        if (txt7.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสินค้า");
            if(txt7.isFocusable()){
                txt7.requestFocus();
            }else{
                txt6.requestFocus();
            }
            return;
        } else if (txt9.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุคลังสินค้า");
            txt9.requestFocus();
            return;
        }
        if (!CheckMakeStock.txt7_Stock(txt7.getText())) {
            txt7.requestFocus();
            return;
        }

        if (txt10.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุจำนวนสินค้า");
            txt10.requestFocus();
            return;
        } else {
            try {
                double value = Double.parseDouble(txt10.getText());
                if (value == 0) {
                    JOptionPane.showMessageDialog(this, "กรุณาระบุจำนวนให้ถูกต้อง \n"
                            + "ไม่ควรระบุเป็นจำนวน 0");
                    txt10.requestFocus();
                    return;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "กรุณาระบุเป็นจำนวนตัวเลขเท่านั้น !");
                txt10.requestFocus();
                return;
            }
        }
        //ตรวจสอบ flag ว่าให้กำหนดแจ้งเตือนหรือไม
//        Db_company db = new Db_company();
//        stock_update stk = new stock_update();
//        stk.stock_update();
//        String minimumchk = db.getCompanyDetail().getMinchk();
        //จ่ายออก
//        if (cb1.getSelectedIndex() == 0) {
//            if (minimumchk.equalsIgnoreCase("Y")) {
//                if (stk.checkStockOver(txt9.getText(), txt7.getText(), -Double.parseDouble(txt10.getText()), new Date())) {
//                    txt10.requestFocus();
//                    return;
//                }
//            }
//        }

        if (txt1.getText().equals(newGenerate)) {
            try {
                Db_convert tout = new Db_convert();
                txt1.setText("T" + LoginDialog.BranchCode + tout.getRunningNumber());
                cmdOk();
                btn_save.setEnabled(true);
                newDocument = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            cmdOk();
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void cmdRemove() {
        String text = txt1.getText().trim();

        if (text.equals("") | text == null) {
            JOptionPane.showMessageDialog(this, "โปรดใส่เลขที่เอกสารที่ต้องการจะลบ");
            txt1.requestFocus();
            return;
        }

        String sql = "SELECT * FROM hconvert where r_no ='" + text + "' AND " + "r_post = 'N'";
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

                sql = "DELETE FROM hconvert where r_no='" + text + "'";
                int result = MySQLConnect.con.createStatement().executeUpdate(sql);
                System.out.println(sql);
                System.out.println("Result = " + result);

                sql = "DELETE FROM `convert` where r_no='" + text + "'";
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
    private int que = 1;

    private void cmdOk() {
        //check Values
        if (txt1.getText().trim().equals("")) {
            txt1.requestFocus();
            return;
        }
        stock_update st = new stock_update();
        Date TempDate = null;
        try {
            TempDate = Format.dateFmtShow.parse(txt2.getText());
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
            return;
        } else if (txt12.getText().length() >= 14) {
            JOptionPane.showMessageDialog(this, "จำนวนเงินมากเกิน 99,999,999.99 ล้านบาท ระบบไม่สามารถจัดเก็บได้");
            return;
        } else if (txt2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่วันที่รับสินค้าให้ถูกต้อง");
            txt2.requestFocus();
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
            try {
                Db_convert con = new Db_convert();
                boolean isEdit = con.seek(txt1.getText(), txt7.getText(), txt6.getText());
                if (isEdit) {
                    updateDetail();
                } else {
                    insertDetail();
                    que++;
                    txt6.setText("" + que);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            isDocnew = checkDocnew();
            System.out.println("IsDocnew = " + isDocnew);
            loadDetail(txt1.getText());

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

    void resetTableModel() {
        int size = modelIn.getRowCount();
        for (int i = 0; i < size; i++) {
            modelIn.removeRow(0);
        }
        size = modelOut.getRowCount();
        for (int i = 0; i < size; i++) {
            modelOut.removeRow(0);
        }
    }
    private DecimalFormat qtyFmt = new DecimalFormat("##0.000");
    private SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private DecimalFormat doubleFmt = new DecimalFormat("##0.00");

    private void loadDetail(String rno) {
        double amount = 0.0;
        try {
            resetTableModel();
            String sql = "SELECT r.*, pdesc, PUnit1, PPrice11 "
                    + "FROM `convert` r inner join product p "
                    + "on r.r_pcode=p.pcode "
                    + "WHERE r.r_pcode=p.pcode AND r.r_no = '" + rno + "' order by r_que";
            System.out.println(sql);
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            String[] row = new String[tblConvertIn.getColumnCount()];
            while (rs.next()) {
                row[0] = rs.getString("r_que");
                row[1] = rs.getString("r_pcode");
                row[2] = rs.getString("pdesc");
                row[3] = qtyFmt.format(rs.getDouble("r_qty"));
                row[4] = rs.getString("r_type");
                row[5] = rs.getString("r_stock");
                row[6] = rs.getString("punit1");
                row[7] = doubleFmt.format(rs.getDouble("PPrice11"));
                row[8] = doubleFmt.format(rs.getDouble("r_amount"));
                if (rs.getString("r_type").indexOf("-") == -1) {
                    modelIn.addRow(row);
                } else {
                    modelOut.addRow(row);
                }
                amount = amount + rs.getDouble("r_amount");
            }
            try {
                Db_convert con = new Db_convert();
                String que = "" + con.maxRqueNew(txt1.getText());
                txt6.setText(que);
            } catch (Exception e) {
            }
            txt15.setText("จำนวนรายการ: " + tblConvertIn.getRowCount());
            txt16.setText("จำนวนรายการ: " + tblConvertOut.getRowCount());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void showCell(int row, int column) {
        Rectangle rect = tblConvertIn.getCellRect(row, column, true);
        tblConvertIn.scrollRectToVisible(rect);
        tblConvertIn.clearSelection();
        if (row != -1) {
            tblConvertIn.setRowSelectionInterval(row, row);
        }
        //tblshowplu.getModel().fireTableDataChanged(); // notify the model
    }

    private void insertHeader() {
        try {
            Db_hconvert hr = new Db_hconvert();
            hr.insert(setHeaderBean());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void updateHeader() {
        try {
            Db_hconvert hr = new Db_hconvert();
            if (!hr.update(setHeaderBean())) {
                JOptionPane.showMessageDialog(this, "Field Error! Can not update Header.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private String user = PublicVar.TempUser.UserCode;
//    private String user = "pos";

    private Hconvert setHeaderBean() {
        Hconvert row = new Hconvert();
        row.setRNo(txt1.getText());
        try {
            row.setRDate(Format.dateFmtShow.parse(txt2.getText().trim()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        row.setRRemark(txt3.getText());
        int total = tblConvertIn.getRowCount()+tblConvertOut.getRowCount();
        row.setRTotal(total);
        row.setRUser(user);
        row.setRPost("N");

        return row;
    }
    private boolean isDocnew = false;

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

    private void updateDetail() {
        try {
            Db_convert hr = new Db_convert();
            if (!hr.update(setDetailUpdateBean())) {
                JOptionPane.showMessageDialog(this, "Field Error! Can not update Detail.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void insertDetail() {
        try {
            Db_convert hr = new Db_convert();
            hr.insert(setDetailBean());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "SQL: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private boolean checkDocnew() {
        Db_hconvert hr = null;
        try {
            hr = new Db_hconvert();
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

    private Convert setDetailBean() {
        Convert row = new Convert();
        row.setR_no(txt1.getText().trim());
        row.setR_que(txt6.getText());
        try {
            dbQueMax = new Db_convert();
        } catch (Exception e) {
        }
        row.setR_que(""+dbQueMax.maxRqueNew(txt1.getText()));
        row.setR_pcode(txt7.getText().trim());
        row.setR_stock(txt9.getText().trim());
        row.setR_qty(Float.parseFloat("" + txt10.getValue()));
        row.setR_post("N");
        row.setR_unit(txt13.getText().trim());
        row.setR_price(Float.parseFloat("" + txt11.getValue()));
        row.setR_amount(Float.parseFloat("" + txt12.getValue()));
        row.setR_user(user);
        row.setR_type("CON+");
        Calendar now = Calendar.getInstance();
        row.setR_time(DateAndTime.getTimeStringFormat(now));
        row.setR_entrydate(now.getTime());

        return row;
    }
    private Convert setDetailUpdateBean() {
        Convert row = new Convert();
        row.setR_no(txt1.getText().trim());
        row.setR_que(txt6.getText());
        row.setR_pcode(txt7.getText().trim());
        row.setR_stock(txt9.getText().trim());
        row.setR_qty(Float.parseFloat("" + txt10.getValue()));
        row.setR_post("N");
        row.setR_unit(txt13.getText().trim());
        row.setR_price(Float.parseFloat("" + txt11.getValue()));
        row.setR_amount(Float.parseFloat("" + txt12.getValue()));
        row.setR_user(user);
        row.setR_type("CON+");
        Calendar now = Calendar.getInstance();
        row.setR_time(DateAndTime.getTimeStringFormat(now));
        row.setR_entrydate(now.getTime());

        return row;
    }

    private void btn_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addnewActionPerformed
        addNewDoc();
    }//GEN-LAST:event_btn_addnewActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        addNewDoc();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        btn_computeActionPerformed(null);
        if (txt1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, msgNotFoundDocno);
            txt1.requestFocus();
            return;
        }
        if (txt2_OnExit()) {
            cmdSaveUpdate();
            txt1.requestFocus();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void cmdSaveUpdate() {
        //check Values
        if (txt1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่เลขที่เอกสารให้ถูกต้อง");
            txt1.requestFocus();
        } else if (txt2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่วันที่รับสินค้าให้ถูกต้อง");
            txt2.requestFocus();
        } else {
            Db_hconvert db = null;
            try {
                db = new Db_hconvert();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            isDocnew = checkDocnew();
            if (isDocnew) {
                insertHeader();
            } else {
                if (db.seek(txt1.getText().trim(), "N")) {
                    updateHeader();
                    //txt1Onaction();
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

    private void btn_deldocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deldocnoActionPerformed
        if (txt1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, msgNotFoundDocno);
            txt1.requestFocus();
            return;
        }
        cmdRemove();
        txt1.requestFocus();
    }//GEN-LAST:event_btn_deldocnoActionPerformed

    private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
        cmdDateChoose1();
    }//GEN-LAST:event_btnCalendarActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        searchStkF1Dialog();
        txt9.requestFocus();
    }//GEN-LAST:event_btnStockActionPerformed

    private void searchStkF1Dialog() {
        Jdi_browse_stockfile rsd = new Jdi_browse_stockfile(new NimbusFrame(), true);
        rsd.setLocation(btnStock.getLocationOnScreen());
        rsd.setVisible(true);
        Stockfile hrb = rsd.getDataRecord();
        if (hrb != null) {
            txt9.setText(hrb.getStkcode());
        }
    }

    private void txtStockEvent() {
        if (txt9.getText().trim().equals("") || txt9.getText() == null) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุคลังสินค้า");
            txt9.requestFocus();
        } else {
            try {
                Db_stockfile db2 = new Db_stockfile();

                if (db2.seek(txt9.getText().trim())) {
                    Stockfile row = db2.getRecordAt(txt9.getText().trim());
                    txt9.setText(row.getStkcode());
                    txt10.setFocusable(true);
                    txt10.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "กรุณาระบุคลังสินค้าให้ถูกต้อง");
                    txt9.requestFocus();
                    return;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void txtStockEvent(String txt) {
        try {
            Db_stockfile db2 = new Db_stockfile();

            if (db2.seek(txt)) {
                Stockfile row = db2.getRecordAt(txt);
                txt9.setText(row.getStkcode());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void txt1onAction() {
        try {
            Db_hconvert hcon = new Db_hconvert();
            if (hcon.seek(txt1.getText())) {
                Hconvert hc = hcon.getRecordAt(txt1.getText());
                btnCalendar.setEnabled(true);
                txt2.setText(dateFmtShow.format(hc.getRDate()));
                txt3.setText(hc.getRRemark());
                txt9.setText(hc.getRStk());
                txtStockEvent(txt9.getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "");
        }
    }
    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        searchProF1Dialog();
    }//GEN-LAST:event_btnProductActionPerformed

    private void txt7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt7FocusGained
        txt7.selectAll();
        clearSelection();
    }//GEN-LAST:event_txt7FocusGained

    private void txt7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt7.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสินค้า");
                txt7.requestFocus();
                return;
            } else {
                txt5Onaction();
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_F1) {
            btnProductActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            addNewItem();
            txt6.setFocusable(true);
            txt6.requestFocus();
        }
    }//GEN-LAST:event_txt7KeyPressed

    private void btnDocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocnoActionPerformed
        searchDocF1Dialog();
    }//GEN-LAST:event_btnDocnoActionPerformed

    private void txt9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            btnStockActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtStockEvent();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            addNewItem();
            txt6.setFocusable(true);
            txt6.requestFocus();
        }
    }//GEN-LAST:event_txt9KeyPressed

    private void txt9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt9FocusGained
        txt9.selectAll();
    }//GEN-LAST:event_txt9FocusGained

    private void btnAddItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddItemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            addNewItem();
            txt6.setFocusable(true);
            txt6.requestFocus();
        }
    }//GEN-LAST:event_btnAddItemKeyPressed

    private void txt10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt10KeyReleased
        try {
            float num1 = Float.parseFloat(txt10.getText());
            float num2 = Float.parseFloat(txt11.getText());
            float total = num1 * num2;
            txt12.setValue(total);
        } catch (Exception e) {
            txt12.setText("0.000");
        }
    }//GEN-LAST:event_txt10KeyReleased

    private void mn_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_addnewActionPerformed
        btn_addnewActionPerformed(null);
    }//GEN-LAST:event_mn_addnewActionPerformed

    private void mn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_saveActionPerformed
        btn_saveActionPerformed(null);
    }//GEN-LAST:event_mn_saveActionPerformed

    private void mn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_cancelActionPerformed
        btn_cancelActionPerformed(null);
    }//GEN-LAST:event_mn_cancelActionPerformed

    private void mn_listdocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_listdocnoActionPerformed
        btn_listdocnoActionPerformed(null);
    }//GEN-LAST:event_mn_listdocnoActionPerformed

    private void mn_deldocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_deldocnoActionPerformed
        btn_deldocnoActionPerformed(null);
    }//GEN-LAST:event_mn_deldocnoActionPerformed

    private void tblConvertInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConvertInMouseClicked
        if (evt.getClickCount() == 2) {
            int rows = tblConvertIn.getSelectedRow();
            if (rows != -1) {
                String que = "" + tblConvertIn.getValueAt(rows, 0);
                String pcode = "" + tblConvertIn.getValueAt(rows, 1);
                String pdesc = "" + tblConvertIn.getValueAt(rows, 2);
                String qty = "" + tblConvertIn.getValueAt(rows, 3);
                String type = "" + tblConvertIn.getValueAt(rows, 4);
                String stock = "" + tblConvertIn.getValueAt(rows, 5);
                String price = "" + tblConvertIn.getValueAt(rows, 7);
                String amount = "" + tblConvertIn.getValueAt(rows, 8);
                String unit = "" + tblConvertIn.getValueAt(rows, 6);
                txt6.setText(que);
                txt7.setText(pcode);
                txt8.setText(pdesc);
                txt10.setValue(Float.parseFloat(qty));
                txt11.setValue(Float.parseFloat(price));
                txt12.setValue(Float.parseFloat(amount));

                txt13.setText(unit);
                txt9.setText(stock);
                btnProduct.setEnabled(true);

                tblConvertIn.clearSelection();
                tblConvertOut.clearSelection();

                txt6.setFocusable(true);
                txt6.requestFocus();
            }
        } else {
            if (!txt7.getText().equals("")) {
                txt10.requestFocus();
            }
        }
    }//GEN-LAST:event_tblConvertInMouseClicked
    private boolean checkPostStk(String text) {
        try {
            String sql = "SELECT r_post from hconvert where r_no='" + text + "'";
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            if (!rs.next()) {
                return false;
            }
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
    private void btnDelItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelItemActionPerformed
        if (txt1.getText().equals("")) {
            txt1.requestFocus();
            return;
        }
        if (txt7.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสินค้า");
            if(txt7.isFocusable()){
                txt7.requestFocus();
            }else{
                txt6.requestFocus();
            }
            return;
        } else if (txt9.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุคลังสินค้า");
            txt9.requestFocus();
            return;
        }
        cmdDelete();

    }//GEN-LAST:event_btnDelItemActionPerformed
    private void cmdDelete() {
        try {
            Db_convert con = new Db_convert();
            con.delete(txt1.getText(), Integer.parseInt(txt6.getText()));
            loadDetail(txt1.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Main_convertNew.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadDetail(txt1.getText());
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }
    private void tblConvertInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblConvertInKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int rows = tblConvertIn.getSelectedRow();
            if (rows != -1) {
                String que = "" + tblConvertIn.getValueAt(rows, 0);
                String pcode = "" + tblConvertIn.getValueAt(rows, 1);
                String pdesc = "" + tblConvertIn.getValueAt(rows, 2);
                String qty = "" + tblConvertIn.getValueAt(rows, 3);
                String type = "" + tblConvertIn.getValueAt(rows, 4);
                String stock = "" + tblConvertIn.getValueAt(rows, 5);
                String price = "" + tblConvertIn.getValueAt(rows, 7);
                String amount = "" + tblConvertIn.getValueAt(rows, 8);
                String unit = "" + tblConvertIn.getValueAt(rows, 6);
                txt6.setText(que);
                txt7.setText(pcode);
                txt8.setText(pdesc);
                txt10.setValue(Float.parseFloat(qty));
                txt11.setValue(Float.parseFloat(price));
                txt12.setValue(Float.parseFloat(amount));
                txt13.setText(unit);
                txt9.setText(stock);
                clearSelection();
                txt7.requestFocus();
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            clearSelection();
        }
    }//GEN-LAST:event_tblConvertInKeyPressed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        if (txt1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, msgNotFoundDocno);
            txt1.requestFocus();
            return;
        }
        if (!txt1.getText().equals("")) {
            ViewReport vp = new ViewReport();
            vp.printReportConvert(txt1.getText());
        }
        txt1.requestFocus();
    }//GEN-LAST:event_btn_printActionPerformed

    private void mn_postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_postActionPerformed
        btn_computeActionPerformed(null);
        stock_update stk = new stock_update();
        stk.stock_update();
        boolean validatePost1 = false;
        boolean validatePost2 = false;

        boolean posStock = true;
        Db_company db = new Db_company();
        boolean minimumchk = db.getCompanyDetail().getMinchk().equals("Y");
        String msgError = "";
        if (minimumchk) {
        //post stock รายการจ่ายออกเพื่อการแปรรูป
            for (int i = 0; i < tblConvertOut.getRowCount(); i++) {
                validatePost1 = true;
                String r_no = txt1.getText();
                String pcode = "" + tblConvertOut.getValueAt(i, 1);
                String stk2 = "" + tblConvertOut.getValueAt(i, 5);
                String type = "" + tblConvertOut.getValueAt(i, 4);

                if (type.equalsIgnoreCase("CON-")) {
                    if (stk.checkStockOut("`convert`", stk2, pcode, r_no)) {
                        posStock = true;
                    } else {
                        msgError += pcode+",";
                        posStock = false;
                        break;
                    }
                }
            }
        }
        if (!posStock) {
                PUtility.ShowError("ไม่สามารถตัดสต็อกสินค้าได้ รหัสสินค้า(" + msgError + " ) \n"
            + "ระบุจำนวนเกินสต็อกสินค้า ทำให้ยอดติดลบ กรุณาตรวจสอบ");
            return;
        }
        msgError = "";
        if(minimumchk){
            //post stock รับเข้าเพื่อจากการแปรรูป
            for (int i = 0; i < tblConvertIn.getRowCount(); i++) {
                validatePost2 = true;
                String r_no = txt1.getText();
                String pcode = "" + tblConvertIn.getValueAt(i, 1);
                String stk2 = "" + tblConvertIn.getValueAt(i, 5);
                String type = "" + tblConvertIn.getValueAt(i, 4);

                if (type.equalsIgnoreCase("CON+")) {
                    if (stk.checkStock("`convert`", stk2, pcode, r_no)) {
                        posStock = true;
                    } else {
                        msgError += pcode+",";
                        posStock = false;
                        break;
                    }
                }
            }
        }
        if (!posStock) {
            PUtility.ShowError("ไม่สามารถตัดสต็อกสินค้าได้ รหัสสินค้า(" + msgError + " ) \n"
                    + "ระบุจำนวนเกินสต็อกสินค้า ทำให้ยอดติดลบ กรุณาตรวจสอบ");
            return;
        }

        if (tblConvertIn.getRowCount()!=0 && tblConvertOut.getRowCount()!=0) {
            //ตัดสต็อก
            if (posStock) {
                PostStock();
            }
        } else {
            JOptionPane.showMessageDialog(this, "การแปรรูปต้องมีข้อมูลทั้งการรับเข้าจากการแปรรูป และ\n"
                    + "จ่ายออกเพื่อการแปรรูป... !");
            txt7.requestFocus();
            return;
        }
    }//GEN-LAST:event_mn_postActionPerformed

    private void tblConvertOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConvertOutMouseClicked
        if (evt.getClickCount() == 2) {
            int rows = tblConvertOut.getSelectedRow();
            if (rows != -1) {
                String que = "" + tblConvertOut.getValueAt(rows, 0);
                String pcode = "" + tblConvertOut.getValueAt(rows, 1);
                String pdesc = "" + tblConvertOut.getValueAt(rows, 2);
                String qty = "" + tblConvertOut.getValueAt(rows, 3);
                String type = "" + tblConvertOut.getValueAt(rows, 4);
                String stock = "" + tblConvertOut.getValueAt(rows, 5);
                String price = "" + tblConvertOut.getValueAt(rows, 7);
                String amount = "" + tblConvertOut.getValueAt(rows, 8);
                String unit = "" + tblConvertOut.getValueAt(rows, 6);
                txt6.setText(que);
                txt7.setText(pcode);
                txt8.setText(pdesc);
                txt10.setValue(Float.parseFloat(qty));
                txt11.setValue(Float.parseFloat(price));
                txt12.setValue(Float.parseFloat(amount));

                txt13.setText(unit);
                txt9.setText(stock);
                btnProduct.setEnabled(true);
                tblConvertOut.clearSelection();
                tblConvertIn.clearSelection();
                txt6.setFocusable(true);
                txt6.requestFocus();
            }
        } else {
            if (!txt7.getText().equals("")) {
                txt10.requestFocus();
            }
        }
    }//GEN-LAST:event_tblConvertOutMouseClicked

    private void tblConvertOutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblConvertOutKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int rows = tblConvertOut.getSelectedRow();
            if (rows != -1) {
                String que = "" + tblConvertOut.getValueAt(rows, 0);
                String pcode = "" + tblConvertOut.getValueAt(rows, 1);
                String pdesc = "" + tblConvertOut.getValueAt(rows, 2);
                String qty = "" + tblConvertOut.getValueAt(rows, 3);
                String type = "" + tblConvertOut.getValueAt(rows, 4);
                String stock = "" + tblConvertOut.getValueAt(rows, 5);
                String price = "" + tblConvertOut.getValueAt(rows, 7);
                String amount = "" + tblConvertOut.getValueAt(rows, 8);
                String unit = "" + tblConvertOut.getValueAt(rows, 6);
                txt6.setText(que);
                txt7.setText(pcode);
                txt8.setText(pdesc);
                txt10.setValue(Float.parseFloat(qty));
                txt11.setValue(Float.parseFloat(price));
                txt12.setValue(Float.parseFloat(amount));
                txt13.setText(unit);
                txt9.setText(stock);
                clearSelection();
                txt7.requestFocus();
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            clearSelection();
        }
    }//GEN-LAST:event_tblConvertOutKeyPressed

    private void tblConvertInFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblConvertInFocusGained
        tblConvertOut.clearSelection();
    }//GEN-LAST:event_tblConvertInFocusGained

    private void tblConvertOutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblConvertOutFocusGained
        tblConvertIn.clearSelection();
    }//GEN-LAST:event_tblConvertOutFocusGained

    private void txt6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txt6.getText().equals("")) {
                GetDataRecord(Integer.parseInt(txt6.getText()));
                txt6.setFocusable(false);
                txt7.setFocusable(true);
                txt7.requestFocus();
                btnProduct.setEnabled(true);
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            addNewDoc();
        }
    }//GEN-LAST:event_txt6KeyPressed
    
    private DecimalFormat IntegerFmt = new DecimalFormat("##,###,##0");

    private void GetDataRecord(int que) {
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select * from `convert` left join product on pcode=r_pcode "
                    + "where (r_no='" + txt1.getText() + "') and (r_que=" + que + ")";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.last();
            if (rec.getRow() == 0) {
                txt6.setText(IntegerFmt.format(que));
                txt7.setText("");
                txt8.setText("");
                txt10.setValue(0.000);
                txt11.setValue(0.00);
                txt12.setValue(0.00);
                txt13.setText("");
            } else {
                txt6.setText(IntegerFmt.format(que));
                txt7.setText(rec.getString("r_pcode"));
                txt8.setText(rec.getString("pdesc"));
                txt9.setText(rec.getString("r_stock"));
                txt10.setText(qtyFmt.format(rec.getDouble("r_qty")));
                txt11.setText(doubleFmt.format(rec.getDouble("r_price")));
                txt12.setText(doubleFmt.format(rec.getDouble("r_amount")));
                txt13.setText(rec.getString("punit1"));
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            PUtility.ShowError(e.getMessage());
        }
    }
    private void txt6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt6FocusGained
        txt6.setText(txt6.getText());
        txt6.selectAll();
    }//GEN-LAST:event_txt6FocusGained

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        cmdReportByCode();
}//GEN-LAST:event_jMenuItem10ActionPerformed

    private void btnDelItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDelItemKeyPressed
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }//GEN-LAST:event_btnDelItemKeyPressed

    private void txt7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyReleased
        productAuto();
    }//GEN-LAST:event_txt7KeyReleased

    private void mn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_exitActionPerformed
        dispose();
    }//GEN-LAST:event_mn_exitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dropview();
    }//GEN-LAST:event_formWindowClosing

    private void txt7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt7FocusLost
        
    }//GEN-LAST:event_txt7FocusLost

    private void btn_computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_computeActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        clearModelOut();
        try {
            String sql = "SELECT pingcode, pdesc, sum(pingqty*r_qty)as qty,"
                    + "r_type,r_stock,r_qty,r_price,r_amount "
                    + "FROM `convert` c "
                    + "inner join pingedent pg on c.r_pcode=pg.pcode "
                    + "inner join product p on pg.pingcode=p.pcode "
                    + "where r_no='"+txt1.getText()+"' "
                    + "group by pingcode;";
            Statement stmt = MySQLConnect.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int index = 31;
            while(rs.next()){
                modelOut.addRow(new Object[]{
                    index,
                    rs.getString("pingcode"),
                    rs.getString("pdesc"),
                    rs.getString("qty"),
                    "CON-",
                    rs.getString("r_stock"),
                    rs.getString("r_qty"),
                    rs.getString("r_price"),
                    rs.getString("r_amount")
                });
                index++;
            }
            txt16.setText("จำนวนรายการ: " + tblConvertOut.getRowCount());
            rs.close();
            stmt.close();
        } catch (Exception e) {
        }
        saveReady();
    }//GEN-LAST:event_btn_computeActionPerformed

    private void cmdReportByCode() {
        new Jdi_report_sumConvertPLU(new NimbusFrame(), true).setVisible(true);
    }

    private void cmdReportByGroup() {
        new Jdi_report_sumConvertGroup(new NimbusFrame(), true).setVisible(true);
    }

    private void PostStock() {
        if (checkPostStk(txt1.getText())) {
            txt1.requestFocus();
            return;
        }
        if (true) {
            String TDoc = txt1.getText();
            if (TDoc.equals("")) {
                txt1.requestFocus();
                return;
            }
            int totalRec = 0;
            int CurRec = 0;
            try {
                Statement stmt = (Statement) MySQLConnect.con.createStatement();
                String SQLQuery = "select c.r_no,r_type,r_date,r_que,r_pcode,r_stock, r_qty,"
                        + "r_amount,c.r_post "
                        + "from `convert` c left join hconvert hc on c.r_no=hc.r_no "
                        + "where c.r_no='" + TDoc + "' ";
                ResultSet rec = stmt.executeQuery(SQLQuery);
                rec.last();
                totalRec = rec.getRow();
                CurRec = 0;
                rec.first();
                if (rec.getRow() == 0) {
                    JOptionPane.showMessageDialog(this, "กรุณาป้อนรายการ..ก่อนทำการ POST สต้อกสินค้า...");
                    return;
                } else {
                    SetReadOnly();
                    do {
                        CurRec++;
                        int TQue = rec.getInt("r_que");
                        Date TDate = rec.getDate("r_date");
                        String TCode = rec.getString("r_pcode");
                        String TStk = rec.getString("r_stock");
                        Double TempQty = rec.getDouble("r_qty");
                        Double TempAmt = rec.getDouble("r_amount");
                        String T_Rem = rec.getString("r_type");
                        String TPost = rec.getString("r_post");
                        if (!TPost.equals("Y")) {
                            stock_update st = new stock_update();
                            if (T_Rem.equals("CON+")) {
                                st.ProcessStockIn(TDoc, TStk, TCode, TDate, T_Rem, TempQty, TempAmt, user);
                            } else {
                                st.ProcessStockOut(TDoc, TStk, TCode, TDate, T_Rem, TempQty, TempAmt, user);
                            }
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

    public void UpdateDetail(String TDoc, int TQue) {
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "update `convert` set r_post='Y' "
                    + "where r_no='" + TDoc + "' and r_que=" + TQue;
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clearSelection() {
        tblConvertIn.clearSelection();
    }

    private void txt5Onaction() {
        String p_code = txt7.getText().trim();
        if (p_code.equals("") || p_code == null) {
            txt7.requestFocus();
        } else {
            try {
                Db_product db = new Db_product();
                if (!db.seek(p_code)) {
                    JOptionPane.showMessageDialog(this, "ไม่พบรหัสสินค้า " + p_code + " ในแฟ้มข้อมูลหลัก กรุณาตรวจสอบ...");
                    txt7.requestFocus();
                    return;
                } else {
                    if (!db.seek(p_code, 'Y', 'Y')) {
                        JOptionPane.showMessageDialog(this, "รหัสสินค้านีกำหนดให้ไม่ต้องทำสต็อกสินค้า...");
                        txt7.requestFocus();
                        return;
                    } else if(!db.isExistConvert(p_code)){
                        JOptionPane.showMessageDialog(this, "รหัสสินค้านี้ไม่ได้กำหนดผูกสูตรสำหรับการแปรรูปไว้...");
                        txt7.requestFocus();
                        return;
                    } else {
                        Product row = db.getRecordAt(p_code);
                        txt7.setText(row.getPcode());
                        txt8.setText(row.getPdesc());
                        txt11.setValue(row.getPprice11());
                        txt13.setText(row.getPunit1());
                        txt9.setFocusable(true);
                        btnStock.setEnabled(true);
                        txt9.requestFocus();
                    }
                }
            } catch (Exception ex) {
                txt7.setText("");
                txt7.requestFocus();
                txt8.setText("");
            }
        }
    }

    private void searchDocF1Dialog() {
        Jdi_browse_hconvert rsd = new Jdi_browse_hconvert(new NimbusFrame(), true);
        rsd.setLocation(btnDocno.getLocationOnScreen());
        rsd.setVisible(true);
        Hconvert hrb = rsd.getDataRecord();
        if (hrb != null) {
            txt1.setText(hrb.getRNo());
        }
    }

    Db_convert dbQueMax;

    private void addNewItem() {
        try {
            dbQueMax = new Db_convert();
        } catch (Exception e) {
        }
        txt6.setText("" + dbQueMax.maxRqueNew(txt1.getText()));
        txt6.setFocusable(false);
        txt6.setBackground(Color.WHITE);

        txt7.setText("");
        txt7.setFocusable(false);
        txt7.setBackground(Color.WHITE);
        btnProduct.setEnabled(false);

        txt8.setText("");

        txt9.setFocusable(false);
        txt9.setBackground(Color.WHITE);
        btnStock.setEnabled(false);

        txt10.setValue(0.000);
        txt10.setFocusable(false);
        txt10.setBackground(Color.WHITE);

        txt11.setValue(0.00);
        txt12.setValue(0.00);
        txt13.setText("");

        btnAddItem.setEnabled(true);
        btnDelItem.setEnabled(true);
    }
    boolean isPost = false;
    Db_product pauto = new Db_product();

    private void productAuto() {
        try {
            Product row = pauto.getRecordAt(txt7.getText());
            txt8.setText(row.getPdesc());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addNewDoc() {
        tblConvertIn.setEnabled(true);
        tblConvertOut.setEnabled(true);
        checkDate = new CheckDate();
        btn_addnew.setEnabled(true);
        btn_cancel.setEnabled(true);
        btn_save.setEnabled(true);
        btn_deldocno.setEnabled(true);
        btn_listdocno.setEnabled(true);
        btn_print.setEnabled(true);
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
        txt2.setFocusable(false);
        txt2.setText(dateFmtShow.format(new Date()));
        txt2.setBackground(Color.WHITE);
        btnCalendar.setEnabled(false);

        txt3.setFocusable(false);
        txt3.setText("");
        txt3.setBackground(Color.WHITE);

        txt15.setText("");

        que = 1;
        isPost = false;
        resetTableModel();
        addNewItem();
    }
    private String msgNotFoundDocno = "กรุณาระบุเลขที่เอกสาร !";

    private void searchProF1Dialog() {
        Jdi_Inv_product rsd = new Jdi_Inv_product(new NimbusFrame(), true);
        rsd.setVisible(true);
        Product hrb = rsd.getDataRecord();
        if (hrb != null) {
            txt7.setText(hrb.getPcode());
//            txt6.setText(hrb.getPdesc());
//            txt10.setText(hrb.getPunit1());

            Db_product db = new Db_product();
            Product row = db.getRecordAt(txt7.getText());
//            txt5.setText(row.getPcode());
            txt8.setText(row.getPdesc());
            txt11.setValue(row.getPprice11());
            txt13.setText(row.getPunit1());
            txt7.requestFocus();
        }
    }

    private void cmdDateChoose1() {
        Point point = btnCalendar.getLocationOnScreen();
        System.out.println(point.getY());
        point.setLocation(point.getX(), point.getY());
        DateChooserDialog dcd = new DateChooserDialog(new NimbusFrame(), true, point);
        dcd.setVisible(true);
        txt2.setText(dateFmtShow.format(dcd.getSelectedDate().getTime()));
        txt2.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnDelItem;
    private javax.swing.JButton btnDocno;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btn_addnew;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_compute;
    private javax.swing.JButton btn_deldocno;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_listdocno;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JMenuItem mn_addnew;
    private javax.swing.JMenuItem mn_cancel;
    private javax.swing.JMenuItem mn_deldocno;
    private javax.swing.JMenuItem mn_exit;
    private javax.swing.JMenuItem mn_listdocno;
    private javax.swing.JMenuItem mn_post;
    private javax.swing.JMenuItem mn_save;
    private javax.swing.JTable tblConvertIn;
    private javax.swing.JTable tblConvertOut;
    private javax.swing.JTextField txt1;
    private javax.swing.JFormattedTextField txt10;
    private javax.swing.JFormattedTextField txt11;
    private javax.swing.JFormattedTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JFormattedTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JFormattedTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables

    private void setTableConvertIn() {
        modelIn = (DefaultTableModel) tblConvertIn.getModel();
        tblConvertIn.setShowGrid(true);
        tblConvertIn.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblConvertIn.setRowSelectionAllowed(true);
        tblConvertIn.setShowGrid(true);
        tblConvertIn.setBackground(Color.WHITE);
        tblConvertIn.setGridColor(Color.LIGHT_GRAY);

        JTableHeader header = tblConvertIn.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblConvertIn.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblConvertIn.setRowHeight(25);

        //Setting column size
        TableColumn column = null;
        int[] colSize = {50, 100, 100, 100, 100, 50, 80};
        //tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblConvertIn.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }

        TableColumnModel tcm = tblConvertIn.getColumnModel();
        DefaultTableCellRenderer d;

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        d.setBackground(colorBlue);
        tcm.getColumn(2).setCellRenderer(d);
        tcm.getColumn(3).setCellRenderer(d);

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.CENTER);
        d.setBackground(colorBlue);
        tcm.getColumn(0).setCellRenderer(d);
        tcm.getColumn(1).setCellRenderer(d);
        tcm.getColumn(4).setCellRenderer(d);

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.RIGHT);
        d.setBackground(colorBlue);
        tcm.getColumn(5).setCellRenderer(d);
        tcm.getColumn(6).setCellRenderer(d);
        tcm.getColumn(7).setCellRenderer(d);
        tcm.getColumn(8).setCellRenderer(d);
    }

    private void setTableConvertOut() {
        modelOut = (DefaultTableModel) tblConvertOut.getModel();
        tblConvertOut.setShowGrid(true);
        tblConvertOut.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblConvertOut.setRowSelectionAllowed(true);
        tblConvertOut.setShowGrid(true);
        tblConvertOut.setBackground(Color.WHITE);
        tblConvertOut.setGridColor(Color.LIGHT_GRAY);

        JTableHeader header = tblConvertOut.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblConvertOut.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblConvertOut.setRowHeight(25);

        //Setting column size
        TableColumn column = null;
        int[] colSize = {50, 100, 100, 100, 100, 50, 80};
        //tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblConvertOut.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }

        TableColumnModel tcm = tblConvertOut.getColumnModel();
        DefaultTableCellRenderer d;

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        d.setBackground(colorRed);
        tcm.getColumn(2).setCellRenderer(d);
        tcm.getColumn(3).setCellRenderer(d);

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.CENTER);
        d.setBackground(colorRed);
        tcm.getColumn(0).setCellRenderer(d);
        tcm.getColumn(1).setCellRenderer(d);
        tcm.getColumn(4).setCellRenderer(d);

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.RIGHT);
        d.setBackground(colorRed);
        tcm.getColumn(5).setCellRenderer(d);
        tcm.getColumn(6).setCellRenderer(d);
        tcm.getColumn(7).setCellRenderer(d);
        tcm.getColumn(8).setCellRenderer(d);
    }

    private void SetActive() {
        txt1.setEnabled(true);
        txt1.setFocusable(true);
        btnDocno.setEnabled(true);
        btnDocno.setFocusable(true);
        txt2.setEnabled(true);
        txt2.setFocusable(true);
        btnCalendar.setEnabled(true);
        txt3.setEnabled(true);
        txt3.setFocusable(true);
        txt9.setEnabled(true);
        txt9.setFocusable(true);
        btnStock.setEnabled(true);
        txt7.setEnabled(true);
        txt7.setFocusable(true);
        txt8.setEnabled(true);
        txt8.setFocusable(true);
        txt10.setEnabled(true);
        txt10.setFocusable(true);
        txt11.setEnabled(true);
        txt11.setFocusable(true);
        txt12.setEnabled(true);
        txt12.setFocusable(true);
        txt13.setEnabled(true);
        txt13.setFocusable(true);
        txt6.setEnabled(true);
        txt6.setFocusable(true);
        btnProduct.setEnabled(true);
        btnDelItem.setEnabled(true);
        btnAddItem.setEnabled(true);
        tblConvertIn.setEnabled(true);
        tblConvertIn.setFocusable(true);
    }

    private void SetReadOnly() {
        tblConvertIn.setEnabled(false);
        tblConvertOut.setEnabled(false);
        txt1.setFocusable(false);
        txt1.setBackground(colorDisable);
        btnDocno.setEnabled(false);
        btnDocno.setFocusable(false);
        txt2.setBackground(colorDisable);
        txt2.setFocusable(false);
        btnCalendar.setEnabled(false);
        txt3.setBackground(colorDisable);
        txt3.setFocusable(false);
        txt9.setBackground(colorDisable);
        txt9.setFocusable(false);
        btnStock.setEnabled(false);
        txt7.setBackground(colorDisable);
        txt7.setFocusable(false);
        txt8.setBackground(colorDisable);
        txt8.setFocusable(false);
        txt10.setBackground(colorDisable);
        txt10.setFocusable(false);
        txt11.setBackground(colorDisable);
        txt11.setFocusable(false);
        txt12.setBackground(colorDisable);
        txt12.setFocusable(false);
        txt13.setBackground(colorDisable);
        txt13.setFocusable(false);
        txt6.setFocusable(false);
        btnProduct.setEnabled(false);
        btnDelItem.setEnabled(false);
        btnAddItem.setEnabled(false);
        tblConvertIn.setEnabled(false);
        tblConvertIn.setFocusable(false);

        btn_addnew.requestFocus();
    }

    private void UpdateHeader(String TDoc, String user) {
        SimpleDateFormat SqlDateFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat FullTimeFmt = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        Date date = new Date();
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "update hconvert set r_post='Y',"
                    + "r_userpost='" + user + "',"
                    + "r_postdate='" + SqlDateFmt.format(date) + "',"
                    + "r_posttime='" + FullTimeFmt.format(date) + "'"
                    + " where r_no='" + TDoc + "'";
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void createView() {
        dropview();
        String sql1 = "CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` "
                + "SQL SECURITY DEFINER VIEW `con1` AS select `h`.`R_Date` "
                + "AS `r_date`,`h`.`R_No` AS `r_no`,`h`.`R_Remark` AS `r_remark`,"
                + "count(`h`.`R_Total`) AS `r_total_con1`,sum(`c`.`R_Amount`) AS "
                + "`r_amount_con1`,`h`.`R_Post` AS `r_post` from (`hconvert` `h` join "
                + "`convert` `c` on((`h`.`R_No` = `c`.`R_No`))) where (`c`.`R_Type` = 'CON+') "
                + "group by `h`.`R_No`,`c`.`R_Type`;";
        String sql2 = "CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` "
                + "SQL SECURITY DEFINER VIEW `con2` AS select `h`.`R_Date` "
                + "AS `r_date`,`h`.`R_No` AS `r_no`,`h`.`R_Remark` AS `r_remark`,"
                + "count(`h`.`R_Total`) AS `r_total_con2`,sum(`c`.`R_Amount`) AS "
                + "`r_amount_con2`,`h`.`R_Post` AS `r_post` from (`hconvert` `h` join "
                + "`convert` `c` on((`h`.`R_No` = `c`.`R_No`))) where (`c`.`R_Type` = 'CON-') "
                + "group by `h`.`R_No`,`c`.`R_Type`;";
        try {
            Statement stmt = MySQLConnect.con.createStatement();
            Statement stmt2 = MySQLConnect.con.createStatement();
            stmt.execute(sql1);
            stmt2.execute(sql2);
            stmt.close();
            stmt2.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();
            System.err.println("create view error !");
        }
    }

    private void dropview() {
        String sql1 = "drop view con1";
        String sql2 = "drop view con2";
        try {
            //drop view
            Statement stmt = MySQLConnect.con.createStatement();
            stmt.execute(sql1);
            stmt.execute(sql2);

            //drop table
            sql1 = "drop table con1";
            sql2 = "drop table con2";
            stmt.execute(sql1);
            stmt.execute(sql2);
        } catch (SQLException ex) {            
            System.err.println("drop view error !");
        }
    }
    private DefaultTableModel modelIn;
    private DefaultTableModel modelOut;
    
    private void clearModelOut() {
        int size = modelOut.getRowCount();
        for (int i = 0; i < size; i++) {
            modelOut.removeRow(0);
        }
    }

    private void saveReady() {
        String r_no = txt1.getText();
        int r_que = 0;
        String r_pcode = "";
        String r_type = "";
        String r_stock = "";
        double r_qty = 0;
        String r_post = "N";
        double r_price = 0;
        double r_amount = 0;
        String r_user = user;
        String r_time = "";
        String r_entrydate;
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        Calendar now = Calendar.getInstance();
        r_time = sTime.format(now.getTime());
        r_entrydate = sDate.format(now.getTime());

        try {
            String sql = "delete FROM `convert` where r_no='"+txt1.getText()+"'";
            Statement stmt = MySQLConnect.con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

        //insert in
        for (int i = 0; i < tblConvertIn.getRowCount(); i++) {
            try {
                r_que = i+1;
                r_pcode = ""+tblConvertIn.getValueAt(i, 1);
                r_type = "CON+";
                r_stock = ""+tblConvertIn.getValueAt(i, 5);
                r_qty = Double.parseDouble(""+tblConvertIn.getValueAt(i, 3));
                r_price = Double.parseDouble(""+tblConvertIn.getValueAt(i, 7));
                r_amount = Double.parseDouble(""+tblConvertIn.getValueAt(i, 8));
                String sqlInsert = "INSERT INTO `convert` "
                        + "(R_No, R_Que, R_PCode, "
                        + "R_Type, R_Stock, R_qty, "
                        + "R_Post, R_Price, R_Amount, "
                        + "R_User, R_Time, R_EntryDate) "
                        + "VALUES ('"+r_no+"', '"+r_que+"', '"+r_pcode+"', "
                        + "'"+r_type+"', '"+r_stock+"', '"+r_qty+"', "
                        + "'"+r_post+"', '"+r_price+"', '"+r_amount+"', "
                        + "'"+r_user+"', '"+r_time+"', '"+r_entrydate+"');";
                Statement stmt = MySQLConnect.con.createStatement();
                stmt.executeUpdate(sqlInsert);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        //insert out
        for (int i = 0; i < tblConvertOut.getRowCount(); i++) {
            try {
                r_que = tblConvertIn.getRowCount()+i+30;
                r_pcode = ""+tblConvertOut.getValueAt(i, 1);
                r_type = "CON-";
                r_stock = ""+tblConvertOut.getValueAt(i, 5);
                r_qty = Double.parseDouble(""+tblConvertOut.getValueAt(i, 3));
                r_price = Double.parseDouble(""+tblConvertOut.getValueAt(i, 7));
                r_amount = Double.parseDouble(""+tblConvertOut.getValueAt(i, 8));
                String sqlInsert = "INSERT INTO `convert` "
                        + "(R_No, R_Que, R_PCode, "
                        + "R_Type, R_Stock, R_qty, "
                        + "R_Post, R_Price, R_Amount, "
                        + "R_User, R_Time, R_EntryDate) "
                        + "VALUES ('"+r_no+"', '"+r_que+"', '"+r_pcode+"', "
                        + "'"+r_type+"', '"+r_stock+"', '"+r_qty+"', "
                        + "'"+r_post+"', '"+r_price+"', '"+r_amount+"', "
                        + "'"+r_user+"', '"+r_time+"', '"+r_entrydate+"');";
                Statement stmt = MySQLConnect.con.createStatement();
                stmt.executeUpdate(sqlInsert);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }
}
