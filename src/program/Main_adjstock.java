package program;

import DBcontrol.Db_DayOperation;
import DBcontrol.Db_TemplateAdj;
import DBcontrol.Db_adjstock;
import DBcontrol.Db_company;
import Main.browser.Jdi_browse_stockfile;
import Main.browser.Jdi_browse_hadjstock;
import java.awt.event.FocusEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import report.ViewReport;
import Bean.Hadjstock;
import Bean.Stockfile;
import DBcontrol.Db_hadjstock;
import DBcontrol.Db_hprolost;
import DBcontrol.Db_product;
import DBcontrol.Db_prolost;
import DBcontrol.Db_stockfile;
import DBcontrol.MySQLConnect;
import Bean.Hprolost;
import Bean.TemplateAdj;
import Main.viewreport.Jdi_report_adjstock;
import Main.viewreport.Jdi_report_sumAdjstockPLU;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import utilities.DateChooser.DateChooserDialog;
import utilities.NimbusFrame;
import utilities.TableTestFormatRenderer;

public class Main_adjstock extends javax.swing.JDialog {

    UserRecord Inv_UserRec = new UserRecord();
    DecimalFormat IntFmt = new DecimalFormat("#######0");
    SimpleDateFormat SqlDateFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    private javax.swing.JButton[] btn = new javax.swing.JButton[50];
    private CheckDate checkDate;
    private Color colorDisable = new Color(246, 248, 200);

    public Main_adjstock(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setLocationRelativeTo(this);
        initComponents();
        initTableComponent();

        Inv_UserRec = PublicVar.TempUser;
        jPanel2.setVisible(false);
        addNewDoc();
    }

    private void setSearchProduct() {
        lbl7.setVisible(true);
        lbl8.setVisible(true);
        txt7.setVisible(true);
        txt8.setVisible(true);
        btn_allDept.setVisible(true);
    }
    private String newGenerate = "~New Document~";

    private void setButton() {
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        txt7.setVisible(false);
        txt8.setVisible(false);
        btn_allDept.setVisible(false);
        clearModel();
        btn[0] = btn1;
        btn[1] = btn2;
        btn[2] = btn3;
        btn[3] = btn4;
        btn[4] = btn5;
        btn[5] = btn6;
        btn[6] = btn7;
        btn[7] = btn8;
        btn[8] = btn9;
        btn[9] = btn10;
        btn[10] = btn11;
        btn[11] = btn12;
        btn[12] = btn13;
        btn[13] = btn14;
        btn[14] = btn15;
        btn[15] = btn16;
        btn[16] = btn17;
        btn[17] = btn18;
        btn[18] = btn19;
        btn[19] = btn20;
        btn[20] = btn21;
        btn[21] = btn22;
        btn[22] = btn23;
        btn[23] = btn24;
        btn[24] = btn25;
        btn[25] = btn26;
        btn[26] = btn27;
        btn[27] = btn28;
        btn[28] = btn29;
        btn[29] = btn30;
        btn[30] = btn31;
        btn[31] = btn32;
        btn[32] = btn33;
        btn[33] = btn34;
        btn[34] = btn35;
        btn[35] = btn36;
        btn[36] = btn37;
        btn[37] = btn38;
        btn[38] = btn39;
        btn[39] = btn40;
        btn[40] = btn41;
        btn[41] = btn42;
        btn[42] = btn43;
        btn[43] = btn44;
        btn[44] = btn45;
        btn[45] = btn46;
        btn[46] = btn47;
        btn[47] = btn48;
        btn[48] = btn49;
        btn[49] = btn50;
        addButtonAction();
        Db_TemplateAdj temp = new Db_TemplateAdj();
        setTextButton(temp.getGroupNew());
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
        btn_listdept = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        btnDocno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        btnStock = new javax.swing.JButton();
        txt5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JFormattedTextField();
        btnCalendar = new javax.swing.JButton();
        lb_pitem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdjstock = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        lbl7 = new javax.swing.JLabel();
        txt7 = new javax.swing.JTextField();
        lbl8 = new javax.swing.JLabel();
        txt8 = new javax.swing.JTextField();
        btn_allDept = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mn_addnew = new javax.swing.JMenuItem();
        mn_cancel = new javax.swing.JMenuItem();
        mn_save = new javax.swing.JMenuItem();
        mn_deldocno = new javax.swing.JMenuItem();
        mn_listdocno = new javax.swing.JMenuItem();
        mn_post = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        mn_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mn_report = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ตรวจนับสต็อกสินค้า");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btn_addnew.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_addnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.gif"))); // NOI18N
        btn_addnew.setText("เพิ่มเอกสาร");
        btn_addnew.setFocusable(false);
        btn_addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addnewActionPerformed(evt);
            }
        });
        jPanel1.add(btn_addnew);

        btn_cancel.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancle.gif"))); // NOI18N
        btn_cancel.setText("ยกเลิก");
        btn_cancel.setFocusable(false);
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel);

        btn_save.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.gif"))); // NOI18N
        btn_save.setText("บันทึกข้อมูล");
        btn_save.setFocusable(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save);

        btn_deldocno.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_deldocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btn_deldocno.setText("ลบข้อมูล");
        btn_deldocno.setFocusable(false);
        btn_deldocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deldocnoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_deldocno);

        btn_listdocno.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_listdocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open.gif"))); // NOI18N
        btn_listdocno.setText("แสดงรายการ");
        btn_listdocno.setFocusable(false);
        btn_listdocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listdocnoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_listdocno);

        btn_listdept.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_listdept.setText("รายการตาม Dept");
        btn_listdept.setToolTipText("แสดงรายการแยกตาม Dept");
        btn_listdept.setFocusable(false);
        btn_listdept.setMaximumSize(new java.awt.Dimension(200, 36));
        btn_listdept.setMinimumSize(new java.awt.Dimension(200, 36));
        btn_listdept.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_listdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listdeptActionPerformed(evt);
            }
        });
        jPanel1.add(btn_listdept);

        btn_print.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        btn_print.setText("พิมพ์");
        btn_print.setFocusable(false);
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel1.add(btn_print);

        btn_exit.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.gif"))); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.setFocusable(false);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit);

        jPanel3.setBackground(new java.awt.Color(193, 215, 225));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("เลขที่เอกสาร");

        txt1.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt1.setText("txt1");
        txt1.setNextFocusableComponent(txt2);
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
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("วันที่");

        jLabel3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("หมายเหตุ");

        txt3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt3.setText("txt3");
        txt3.setNextFocusableComponent(txt4);
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt3KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("สำหรับคลัง");

        txt4.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.setText("txt4");
        txt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4KeyReleased(evt);
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

        txt5.setBackground(new java.awt.Color(249, 248, 189));
        txt5.setEditable(false);
        txt5.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt5.setText("txt5");
        txt5.setFocusable(false);
        txt5.setRequestFocusEnabled(false);

        jPanel4.setBackground(new java.awt.Color(250, 254, 177));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 2, 1, new java.awt.Color(255, 0, 0)));

        lbl2.setFont(new java.awt.Font("Norasi", 1, 22)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("ตรวจนับสต็อกสินค้า");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txt2.setFocusable(false);
        txt2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt2.setNextFocusableComponent(txt3);
        txt2.setRequestFocusEnabled(false);
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

        lb_pitem.setFont(new java.awt.Font("Norasi", 1, 18)); // NOI18N
        lb_pitem.setForeground(new java.awt.Color(224, 49, 40));
        lb_pitem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnDocno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_pitem, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDocno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, 0, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_pitem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        //cmdSearchDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifying glass.jpg")));

        tblAdjstock.setAutoCreateRowSorter(true);
        tblAdjstock.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tblAdjstock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "รหัสสินค้า PLU", "ชื่อสินค้า/รายการ", "จำนวนนับได้จริง", "ราคา/หน่วย", "ผู้บันทึก", "หมายเหตุ", "หน่วยนับ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdjstock.setEnabled(false);
        tblAdjstock.setRowHeight(25);
        tblAdjstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAdjstockKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblAdjstock);

        jLabel12.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel12.setText("จำนวนรายการสินค้า");

        jLabel13.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow.gif"))); // NOI18N

        txt6.setEditable(false);
        txt6.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setText("txt6");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn1.setNextFocusableComponent(btn2);

        btn2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn2.setNextFocusableComponent(btn3);

        btn3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn3.setNextFocusableComponent(btn4);

        btn4.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn4.setNextFocusableComponent(btn5);

        btn5.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn5.setNextFocusableComponent(btn6);

        btn6.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn6.setNextFocusableComponent(btn7);

        btn7.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn7.setNextFocusableComponent(btn8);

        btn8.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn8.setNextFocusableComponent(btn9);

        btn9.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn9.setNextFocusableComponent(btn10);

        btn10.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn10.setNextFocusableComponent(btn11);

        btn11.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn11.setNextFocusableComponent(btn12);

        btn12.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn12.setNextFocusableComponent(btn13);

        btn13.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn13.setNextFocusableComponent(btn14);

        btn14.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn14.setNextFocusableComponent(btn15);

        btn15.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn15.setNextFocusableComponent(btn16);

        btn16.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn16.setNextFocusableComponent(btn17);

        btn17.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn17.setNextFocusableComponent(btn18);

        btn18.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn18.setNextFocusableComponent(btn19);

        btn19.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn19.setNextFocusableComponent(btn20);

        btn20.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn20.setNextFocusableComponent(btn21);

        btn21.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn21.setNextFocusableComponent(btn22);

        btn22.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn22.setNextFocusableComponent(btn23);

        btn23.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn23.setNextFocusableComponent(btn24);

        btn24.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn24.setNextFocusableComponent(btn25);

        btn25.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn25.setNextFocusableComponent(btn26);

        btn26.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn26.setNextFocusableComponent(btn27);

        btn27.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn27.setNextFocusableComponent(btn28);

        btn28.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn28.setNextFocusableComponent(btn29);

        btn29.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn29.setNextFocusableComponent(btn30);

        btn30.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn30.setNextFocusableComponent(btn31);

        btn31.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn31.setNextFocusableComponent(btn32);

        btn32.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn32.setNextFocusableComponent(btn33);

        btn33.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn33.setNextFocusableComponent(btn34);

        btn34.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn34.setNextFocusableComponent(btn35);

        btn35.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn35.setNextFocusableComponent(btn36);

        btn36.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn36.setNextFocusableComponent(btn37);

        btn37.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn37.setNextFocusableComponent(btn38);

        btn38.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn38.setNextFocusableComponent(btn39);

        btn39.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn39.setNextFocusableComponent(btn40);

        btn40.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn40.setNextFocusableComponent(btn41);

        btn41.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn41.setNextFocusableComponent(btn42);

        btn42.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn42.setNextFocusableComponent(btn43);

        btn43.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn43.setNextFocusableComponent(btn44);

        btn44.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn44.setNextFocusableComponent(btn45);

        btn45.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn45.setNextFocusableComponent(btn46);

        btn46.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn46.setNextFocusableComponent(btn47);

        btn47.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn47.setNextFocusableComponent(btn48);

        btn48.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn48.setNextFocusableComponent(btn49);

        btn49.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn49.setNextFocusableComponent(btn50);

        btn50.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn50.setNextFocusableComponent(btn1);

        lbl7.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl7.setText("รหัสสินค้า (Product Code)");

        txt7.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt7KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt7KeyReleased(evt);
            }
        });

        lbl8.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl8.setText("ชื่อสินค้า(Product Description)");

        txt8.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt8KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt8KeyReleased(evt);
            }
        });

        btn_allDept.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn_allDept.setText("แสดงกลุ่มสินค้า");
        btn_allDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_allDeptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_allDept, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_allDept, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbl1.setFont(new java.awt.Font("Norasi", 1, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(219, 54, 17));
        lbl1.setText("jLabel5");

        jLabel5.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("กด Tab เพื่อเลือกกลุ่มสินค้า     กด ลูกศรขื้น/ลง เพื่อเลือกรายการสินค้า");

        jLabel8.setFont(new java.awt.Font("Norasi", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("Enter เพื่อสร้างเอกสารอัตโนมัติ       ESC ป้อนรหัสสินค้า");

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
        mn_listdocno.setText("แสดงรายการตรวจนับสินค้า");
        mn_listdocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_listdocnoActionPerformed(evt);
            }
        });
        jMenu1.add(mn_listdocno);

        mn_post.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_post.setText("POST ตัดสต็อกสินค้า");
        mn_post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_postActionPerformed(evt);
            }
        });
        jMenu1.add(mn_post);
        jMenu1.add(jSeparator1);

        mn_exit.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_exit.setText("ออกจากการทำงาน");
        mn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_exitActionPerformed(evt);
            }
        });
        jMenu1.add(mn_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("รายงาน (Report)");
        jMenu2.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N

        mn_report.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        mn_report.setText("สรุปรายการปรับยอดสินค้าตามรหัสสินค้า(PLU)");
        mn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_reportActionPerformed(evt);
            }
        });
        jMenu2.add(mn_report);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(10, 10, 10)
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, 0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        setSize(new java.awt.Dimension(1029, 766));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btnDocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocnoActionPerformed
    searchDocF1Dialog();
}//GEN-LAST:event_btnDocnoActionPerformed

private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
    searchStkF1Dialog();
}//GEN-LAST:event_btnStockActionPerformed

private void btn_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addnewActionPerformed
    addNewDoc();
}//GEN-LAST:event_btn_addnewActionPerformed

private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
    addNewDoc();
}//GEN-LAST:event_btn_cancelActionPerformed
    private String msgNotFoundDocno = "กรุณาระบุเลขที่เอกสาร !";
private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
    if (txt1.getText().trim().equals("")) {
//        JOptionPane.showMessageDialog(this, msgNotFoundDocno);
        txt1.requestFocus();
        return;
    }
    if(validData()){
        cmdSaveUpdateHeader();
        if (ISSAVE) {
            cmdSaveUpdate();
            ISSAVE = false;
        }
    }else{
        JOptionPane.showMessageDialog(this, "การคีย์ตรวจนับ หรือบันทึกของเนียไม่สามารถคีย์จำนวนติดลบได้ \n" +
                "กรุณาตรวจสอบ !\n" +
                ""+codeError);
    }
}//GEN-LAST:event_btn_saveActionPerformed
    private boolean checkSaveTable() {
        for (int i = 0; i < tblAdjstock.getRowCount(); i++) {
            try {
                Integer.parseInt("" + tblAdjstock.getValueAt(i, 3));
                Integer.parseInt("" + tblAdjstock.getValueAt(i, 4));
                break;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }
private void btn_deldocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deldocnoActionPerformed
    if (txt1.getText().trim().equals("")) {
        JOptionPane.showMessageDialog(this, msgNotFoundDocno);
        txt1.requestFocus();
        return;
    } else if (txt1.getText().equals(newGenerate)) {
        return;
    }
    cmdRemoveAllAdjPro();
}//GEN-LAST:event_btn_deldocnoActionPerformed

private void btn_listdocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listdocnoActionPerformed
    cmdOrderShow();
    tblAdjstock.requestFocus();
}//GEN-LAST:event_btn_listdocnoActionPerformed

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
    } else if (txt1.getText().equals(newGenerate)) {
        return;
    }
    cmdPrintOrder();
    txt1.requestFocus();
}//GEN-LAST:event_btn_printActionPerformed

private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
    cmdExit();
}//GEN-LAST:event_btn_exitActionPerformed

private void mn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_exitActionPerformed
    cmdExit();
}//GEN-LAST:event_mn_exitActionPerformed

private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
    cmdDateChoose1();
}//GEN-LAST:event_btnCalendarActionPerformed

private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained
    txt2.selectAll();
}//GEN-LAST:event_txt2FocusGained
    boolean isCreateDocument = false;
    public static String rno_adj = "";
    public static String rno_pro = "";

private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER && txt1.getText().trim().equals("")) {
        rno_adj = "";
        rno_pro = "";
        txt1.setText(newGenerate);
        txt1.setBackground(colorDisable);
        txt1.setFocusable(false);
        btnDocno.setEnabled(false);
        txt2.setFocusable(true);
        txt2.setText(dateFmtShow.format(new Date()));
        txt2.requestFocus();
        btnCalendar.setEnabled(true);
        isCreateDocument = false;
        isDocnew = true;
    } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        if (!txt1.getText().equals("")) {
            try {
                if (!new Db_hadjstock().seek(txt1.getText())) {
                    addNewDoc();
                    JOptionPane.showMessageDialog(this, "ไม่พบเลขที่เอกสารในฐานข้อมูล กรุณาตรวจสอบ !");
                    txt1.requestFocus();
                    return;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Main_adjstock.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtRnoEvent();
        }
    } else if (evt.getKeyCode() == KeyEvent.VK_F1) {
        btnDocnoActionPerformed(null);
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        if (txt1.getText().equals("")) {
            this.dispose();
        } else {
            txt1.setText("");
            txt1.requestFocus();
        }
    }
}//GEN-LAST:event_txt1KeyPressed

private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt2_OnExit();
    }
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewDoc();
    }
}//GEN-LAST:event_txt2KeyPressed

private void txt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyPressed
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt4.setFocusable(true);
        txt4.requestFocus();
        btnStock.setEnabled(true);
    }
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewDoc();
    }
}//GEN-LAST:event_txt3KeyPressed

private void txt4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_F1) {
        btnStockActionPerformed(null);
    } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        try {
            btn_listdept.setText("รายการตรวจนับ");
            if (!txt4.getText().equals("") && !txt5.getText().equals("")) {
                btn1.requestFocus();
            } else if (txt4.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสคลังสินค้า");
                txt4.requestFocus();
                return;
            }
            Db_stockfile dbstock = new Db_stockfile();
            if (!dbstock.seek(txt4.getText())) {
                JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสคลังสินค้าให้ถูกต้อง");
                txt4.requestFocus();
                return;
            }
            jPanel2.setVisible(true);
            setButton();
            btn1.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Main_adjstock.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewDoc();
    }
}//GEN-LAST:event_txt4KeyPressed

private void mn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_reportActionPerformed
    new Jdi_report_sumAdjstockPLU(null, true).setVisible(true);
}//GEN-LAST:event_mn_reportActionPerformed

    private boolean CheckOtherDocNotPost() {
        String TempDocNo = "";
        int Cnt = 0;
        boolean Retval = true;
        try {
            TempDocNo = "" ;
            Cnt = 0 ;
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SQLQuery = "select *from hrecive where r_post<>'Y'";
            ResultSet rec = stmt.executeQuery(SQLQuery);
            rec.last();
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                do {
                    Cnt++;
                    TempDocNo = TempDocNo + rec.getString("R_No") + ",";
                } while (rec.next());
            }
            rec.close();
            stmt.close();
            if (Cnt > 0) {
                PUtility.ShowMsg("ยังมีเอกสารการรับสินค้าจากโรงงาน ที่ยังไม่ได้ทำการ POST สต็อก \n เลขที่ " + TempDocNo+"\n กรุณา POST เอกสารดังกล่าวให้เรียบร้อยก่อน...");
                Retval = false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "hrecive : " + e.getMessage());
        }

        try {
            TempDocNo = "" ;
            Cnt = 0 ;
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SQLQuery = "select *from htranin where r_post<>'Y'";
            ResultSet rec = stmt.executeQuery(SQLQuery);
            rec.last();
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                do {
                    Cnt++;
                    TempDocNo = TempDocNo + rec.getString("R_No") + ",";
                } while (rec.next());
            }
            rec.close();
            stmt.close();
            if (Cnt > 0) {
                PUtility.ShowMsg("ยังมีเอกสารการรับโอนสินค้า(เข้า) ที่ยังไม่ได้ทำการ POST สต็อก \n เลขที่ " + TempDocNo+"\n กรุณา POST เอกสารดังกล่าวให้เรียบร้อยก่อน...");
                Retval = false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "htranin : " + e.getMessage());
        }

        try {
            TempDocNo = "" ;
            Cnt = 0 ;
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SQLQuery = "select *from htranout where r_post<>'Y'";
            ResultSet rec = stmt.executeQuery(SQLQuery);
            rec.last();
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                do {
                    Cnt++;
                    TempDocNo = TempDocNo + rec.getString("R_No") + ",";
                } while (rec.next());
            }
            rec.close();
            stmt.close();
            if (Cnt > 0) {
                PUtility.ShowMsg("ยังมีเอกสารการโอนสินค้า(ออก) ที่ยังไม่ได้ทำการ POST สต็อก \n เลขที่ " + TempDocNo+"\n กรุณา POST เอกสารดังกล่าวให้เรียบร้อยก่อน...");
                Retval = false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "htranout : " + e.getMessage());
        }
//        try {
//            TempDocNo = "" ;
//            Cnt = 0 ;
//            Statement stmt = (Statement) dbUtility.con.createStatement();
//            String SQLQuery = "select *from hprolost where r_post<>'Y'";
//            ResultSet rec = stmt.executeQuery(SQLQuery);
//            rec.last();
//            rec.first();
//            if (rec.getRow() == 0) {
//            } else {
//                do {
//                    if (!rec.getString("R_No").equals("L-"+txt1.getText())) {
//                       Cnt++;
//                       TempDocNo = TempDocNo + rec.getString("R_No") + ",";
//                    }
//                } while (rec.next());
//            }
//            rec.close();
//            stmt.close();
//            if (Cnt > 0) {
//                PUtility.ShowMsg("ยังมีเอกสารการบันทึกของเสีย ที่ยังไม่ได้ทำการ POST สต็อก \n เลขที่ " + TempDocNo+"\n กรุณา POST เอกสารดังกล่าวให้เรียบร้อยก่อน...");
//                Retval = false;
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(this, "hprolost : " + e.getMessage());
//        }
        try {
            TempDocNo = "" ;
            Cnt = 0 ;
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SQLQuery = "select *from hcharge where r_post<>'Y'";
            ResultSet rec = stmt.executeQuery(SQLQuery);
            rec.last();
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                do {
                    Cnt++;
                    TempDocNo = TempDocNo + rec.getString("R_No") + ",";
                } while (rec.next());
            }
            rec.close();
            stmt.close();
            if (Cnt > 0) {
                PUtility.ShowMsg("ยังมีเอกสารการบันทึกแจกฟรี ที่ยังไม่ได้ทำการ POST สต็อก \n เลขที่ " + TempDocNo+"\n กรุณา POST เอกสารดังกล่าวให้เรียบร้อยก่อน...");
                Retval = false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "hcharge : " + e.getMessage());
        }
        try {
            TempDocNo = "" ;
            Cnt = 0 ;
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SQLQuery = "select *from hconvert where r_post<>'Y'";
            ResultSet rec = stmt.executeQuery(SQLQuery);
            rec.last();
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                do {
                    Cnt++;
                    TempDocNo = TempDocNo + rec.getString("R_No") + ",";
                } while (rec.next());
            }
            rec.close();
            stmt.close();
            if (Cnt > 0) {
                PUtility.ShowMsg("ยังมีเอกสารการแปรรูปสินค้า ที่ยังไม่ได้ทำการ POST สต็อก \n เลขที่ " + TempDocNo+"\n กรุณา POST เอกสารดังกล่าวให้เรียบร้อยก่อน...");
                Retval = false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "hconvart : " + e.getMessage());
        }
        return Retval;
    }

private void mn_postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_postActionPerformed
    new Thread(new Runnable() {

            public void run() {
                lb_pitem.setText("");
                disableProcess();
                txt2.setEditable(false);
                txt6.requestFocus();
                mn_postActionPerformed();
                txt2.setEditable(true);
                activeProcess();
                lb_pitem.setText("");
            }
        }).start();
    
}//GEN-LAST:event_mn_postActionPerformed

private void mn_postActionPerformed(){
    //ตรวจสอบวันที่ก่อน post ตัดสต็อก
    if(!checkDate()){
        txt2.requestFocus();
        return;
    }
    if (!CheckOtherDocNotPost()) {
        return;
    }
    if (txt1.getText().trim().equals("")) {
        JOptionPane.showMessageDialog(this, msgNotFoundDocno);
        txt1.requestFocus();
        return;
    } else if (txt1.getText().equals(newGenerate)) {
        txt1.requestFocus();
        return;
    }
    cmdSaveUpdate();
    //--------------------------------------------------------------------------
    btn_listdept.setText("รายการตาม Dept");
    jPanel2.setVisible(false);
    txtRnoEvent();
    btnCalendar.setEnabled(false);
    txt6.requestFocus();
    tblAdjstock.setEnabled(false);

    //POST ของเสียก่อนนะจ๊ะ
    //--------------------------------------------------------------------------
    Db_company dbCom = new Db_company();
    stock_update stk = new stock_update();
    stk.stock_update();
    boolean posStockProlost = true;
    String msgProlost = "";
    boolean minimumchk = dbCom.getCompanyDetail().getMinchk().equals("Y");
//    if (minimumchk) {
//        for (int i = 0; i < tblAdjstock.getRowCount(); i++) {
//            String pcode = "" + tblAdjstock.getValueAt(i, 1);
//            String qtyChk = "" + tblAdjstock.getValueAt(i, 4);
//            if (!qtyChk.equals("-") && !qtyChk.equals("")) {
//                String stk2 = txt4.getText();
//                //จะต้องปะ 'L-' ไว้ข้างหน้าสำหรับการ post ของเสียเท่านั้น
//                if (stk.checkStockOut("prolost", stk2, pcode, "L-" + txt1.getText())) {
//                    posStockProlost = true;
//                } else {
//                    //error stock ติดลบ
//                    msgProlost+=pcode+",";
//                    posStockProlost = false;
//                }
//            }
//        }
//    }
//
//    if(!posStockProlost){
//        PUtility.ShowError("ไม่สามารถตัดสต็อกสินค้าได้ รหัสสินค้า(" + msgProlost + " ) \n"
//                        + "ทำให้ยอดสินค้าในสต็อกติดลบ กรุณาตรวจสอบ");
//    }
    //--------------------------------------------------------------------------

    //POST นับสต็อก
    boolean posStockAdj = true;
    msgProlost = "";
    if (minimumchk) {
        for (int i = 0; i < tblAdjstock.getRowCount(); i++) {
            String pcode = "" + tblAdjstock.getValueAt(i, 1);
            String qtyChk = "" + tblAdjstock.getValueAt(i, 3);
            String stk2 = txt4.getText();
            if (!qtyChk.equals("-") && !qtyChk.equals("")) {
                if (stk.checkStockAdjust(pcode, txt1.getText())) {
                    posStockAdj = true;
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }                    
                } else {
                    msgProlost+=pcode+",";
                    posStockAdj = false;
                }                
            }
        }
    }
    if(!posStockAdj){
        PUtility.ShowError("ไม่สามารถตัดสต็อกสินค้าได้ รหัสสินค้า(" + msgProlost + " ) \n"
                            + "ระบุจำนวนทำให้ยอดสินค้าในสต็อกติดลบ กรุณาตรวจสอบ");
    }
    //ตัดสต็อก
    if (posStockProlost && posStockAdj) {
//        PostStockProlost();
        cmdpoststock();
    }else{
        JOptionPane.showMessageDialog(this, "กรุณาตรวจสอบรายการสินค้า และ post ตัดสต็อกใหม่อีกครั้ง");
    }
    //----------------------------------------------------------------------
}

private void btn_listdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listdeptActionPerformed
    //----------------------------------------------------
    if (tblAdjstock.isEditing()) {
        tblAdjstock.getCellEditor().stopCellEditing();
    }
    if (txt1.getText().trim().equals("")) {
//        JOptionPane.showMessageDialog(this, msgNotFoundDocno);
        txt1.requestFocus();
        return;
    }
    if(validData()){
        cmdSaveUpdateHeader();
        if (ISSAVE) {
            cmdSaveUpdate();
            ISSAVE = false;
        }
    }else{
        JOptionPane.showMessageDialog(this, "การคีย์ตรวจนับ หรือบันทึกของเนียไม่สามารถคีย์จำนวนติดลบได้ \n" +
                "กรุณาตรวจสอบ !\n" +
                ""+codeError);
    }
    //-------------------------------
    if(txt1.getText().equals("")){
        txt1.requestFocus();
        return;
    }    
    if (tblAdjstock.isEditing()) {
        tblAdjstock.getCellEditor().stopCellEditing();
    }
    clearModel();
    if (btn_listdept.getText().equals("รายการตรวจนับ")) {
        btn_listdept.setText("รายการตาม Dept");
        btn_listdept.setToolTipText("รายการตาม Dept");
        jPanel2.setVisible(false);
        txtRnoEvent();
    } else {
        btn_listdept.setText("รายการตรวจนับ");
        btn_listdept.setToolTipText("รายการตรวจนับ");
        jPanel2.setVisible(true);
        ButtonDefaultColor();
    }

}//GEN-LAST:event_btn_listdeptActionPerformed

private void txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1FocusGained
    jPanel2.setVisible(false);
    btn_listdept.setText("รายการตาม Dept");
    txt1.selectAll();
}//GEN-LAST:event_txt1FocusGained
    private void stockAuto() {
        Db_stockfile db2 = null;
        try {
            db2 = new Db_stockfile();
        } catch (SQLException ex) {
            Logger.getLogger(Main_adjstock.class.getName()).log(Level.SEVERE, null, ex);
        }
        Stockfile row = db2.getRecordAt(txt4.getText().trim());
        if (row.getStkcode() != null) {
            txt4.setText(row.getStkcode());
            txt5.setText(row.getStkname());
            lbl2.setText("ตรวจนับ" + row.getStkname());
            txt4.requestFocus();
        } else {
            lbl2.setText("ตรวจนับสต็อกสินค้า" + "");
            txt4.requestFocus();
        }
    }
private void txt4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyReleased
    stockAuto();
}//GEN-LAST:event_txt4KeyReleased

private void txt7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        ButtonDefaultColor();
        setButton();
        btn1.requestFocus();
        txt7.setText("");
    } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt7.setText("");
        txt8.setText("");
        int i = tblAdjstock.getSelectedRow();
        if(i!=-1){
            tblAdjstock.setRowSelectionAllowed(true);
            tblAdjstock.setColumnSelectionAllowed(true);
            tblAdjstock.setRowSelectionInterval(i, i);
            tblAdjstock.setColumnSelectionInterval(1, 3);
            tblAdjstock.scrollRectToVisible(tblAdjstock.getCellRect(i, 3, true));
            tblAdjstock.requestFocus();
        }
    } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
        txt8.requestFocus();
    } else if (evt.getKeyCode() == KeyEvent.VK_F5) {
        btn_allDeptActionPerformed(null);
    }
}//GEN-LAST:event_txt7KeyPressed

private void txt7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyReleased
    if (txt7.getText().equals("")) {
        tblAdjstock.clearSelection();
    }else{
        for (int i = 0; i < tblAdjstock.getRowCount(); i++) {
            String product = "" + tblAdjstock.getValueAt(i, 1);
            if (txt7.getText().equals(product)) {
                tblAdjstock.setRowSelectionAllowed(true);
                tblAdjstock.setColumnSelectionAllowed(false);
                tblAdjstock.setRowSelectionInterval(i, i);
                tblAdjstock.scrollRectToVisible(tblAdjstock.getCellRect(i, 3, true));
            }
        }
    }
}//GEN-LAST:event_txt7KeyReleased

private void btn_allDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_allDeptActionPerformed
    ButtonDefaultColor();
    setButton();
    btn1.requestFocus();
}//GEN-LAST:event_btn_allDeptActionPerformed

private void txt8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        ButtonDefaultColor();
        btn1.requestFocus();
        txt8.setText("");
    } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt7.setText("");
        txt8.setText("");
        int i = tblAdjstock.getSelectedRow();
        if(i!=-1){
            tblAdjstock.setRowSelectionAllowed(true);
            tblAdjstock.setColumnSelectionAllowed(true);
            tblAdjstock.setRowSelectionInterval(i, i);
            tblAdjstock.setColumnSelectionInterval(1, 3);
            tblAdjstock.scrollRectToVisible(tblAdjstock.getCellRect(i, 3, true));
            tblAdjstock.requestFocus();
        }
    } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
        txt7.requestFocus();
    } else if (evt.getKeyCode() == KeyEvent.VK_F5) {
        btn_allDeptActionPerformed(null);
    }
}//GEN-LAST:event_txt8KeyPressed
    Db_product dbproduct = new Db_product();

private void txt8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8KeyReleased
    if (txt8.getText().equals("")) {
        tblAdjstock.clearSelection();
    }else{
        ArrayList<String> arr = dbproduct.searchProduct(txt8.getText());
        stop:
        for (int i = 0; i < arr.size(); i++) {
            for (int a = 0; a < tblAdjstock.getRowCount(); a++) {
                String productName = "" + tblAdjstock.getValueAt(a, 2);

                if (arr.get(i).equals(productName)) {
                    tblAdjstock.setRowSelectionAllowed(true);
                    tblAdjstock.setColumnSelectionAllowed(false);
                    tblAdjstock.setRowSelectionInterval(a, a);
                    tblAdjstock.setColumnSelectionInterval(1, 3);
                    tblAdjstock.scrollRectToVisible(tblAdjstock.getCellRect(a, 3, true));
                    break stop;
                }
            }
        }
    }
}//GEN-LAST:event_txt8KeyReleased

private void tblAdjstockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAdjstockKeyPressed
    // TODO add your handling code here:
}//GEN-LAST:event_tblAdjstockKeyPressed

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    if(ISPROCESS){
        JOptionPane.showMessageDialog(this, "ไม่สามารถออกจากหน้าจอนี้ได้ กรุณารอสักครู่...\n" +
                "โปรแกรมกำลังประมวลผลตัดสต็อกสินค้าอยู่");
        return ;
    }
}//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnDocno;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btn_addnew;
    private javax.swing.JButton btn_allDept;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_deldocno;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_listdept;
    private javax.swing.JButton btn_listdocno;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_pitem;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JMenuItem mn_addnew;
    private javax.swing.JMenuItem mn_cancel;
    private javax.swing.JMenuItem mn_deldocno;
    private javax.swing.JMenuItem mn_exit;
    private javax.swing.JMenuItem mn_listdocno;
    private javax.swing.JMenuItem mn_post;
    private javax.swing.JMenuItem mn_report;
    private javax.swing.JMenuItem mn_save;
    private javax.swing.JTable tblAdjstock;
    private javax.swing.JTextField txt1;
    private javax.swing.JFormattedTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    // End of variables declaration//GEN-END:variables
    ///////////////////  Variable /////////////////////////////////////////////
    DefaultTableModel model;
    private int que;
    private boolean isDocnew;
    String user = PublicVar.TempUser.UserCode;
    //String userpost = "1001";
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    SimpleDateFormat timeFmtShow = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
    SimpleDateFormat dateFmtSQL = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    DecimalFormat IntegerFmt = new DecimalFormat("##,###,##0");
    DecimalFormat FloatFmt = new DecimalFormat("##,###,##0.00");
    DecimalFormat DoubleFmt = new DecimalFormat("##,###,##0.000");

    private void addNewDoc() {
        checkDate = new CheckDate();
        txt1.setBackground(Color.WHITE);
        txt1.setFocusable(true);
        txt1.setText("");
        txt1.requestFocus();
        btnDocno.setEnabled(true);

        txt2.setFocusable(false);
        txt2.setBackground(Color.WHITE);
        btnCalendar.setEnabled(false);

        txt3.setFocusable(false);
        txt3.setText("");
        txt3.setBackground(Color.WHITE);

        txt4.setText("");
        txt4.setFocusable(false);
        txt4.setBackground(Color.WHITE);
        btnStock.setEnabled(false);

        txt5.setText("");

        txt6.setText("0 รายการ");
        que = 0;
        resetTableModel();
        lbl1.setText("");
        lbl2.setText("ตรวจนับสต็อกสินค้า");
        tblAdjstock.setEnabled(true);
    }

    private void resetTableModel() {
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            model.removeRow(0);
        }
    }
    boolean ISSAVE = false;

    private void initTableComponent() {
        //Setting column size
        tblAdjstock.setRowSelectionAllowed(true);
        tblAdjstock.setColumnSelectionAllowed(true);
        tblAdjstock.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent ke) {
            }

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    int rowSelected = tblAdjstock.getSelectedRow();
                    int colFix = tblAdjstock.getSelectedColumn();
                    //if (tblAdjstock.editCellAt(rowSelected, colFix)) {
                    //    return;
                    //} else {
                        tblAdjstock.clearSelection();
//                        ButtonDefaultColor();
                        if (jPanel2.isVisible()) {
                            txt7.requestFocus();
                        } else {
                            txt4.setFocusable(true);
                            txt4.setEnabled(true);
                            txt4.requestFocus();
                        }
                    //}
                    return;
                }
                int rowSelected = tblAdjstock.getSelectedRow();
                int colFix = tblAdjstock.getSelectedColumn();
//                int colFix = 3;
                if (ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP
                        || ke.getKeyCode() == KeyEvent.VK_RIGHT || ke.getKeyCode() == KeyEvent.VK_LEFT
                        || ke.getKeyCode() == KeyEvent.VK_ENTER || ke.getKeyCode() == KeyEvent.VK_TAB
                        || ke.getKeyCode() == KeyEvent.VK_CONTROL || ke.getKeyCode() == KeyEvent.VK_ALT
                        || ke.getKeyCode() == KeyEvent.VK_SHIFT || ke.getKeyCode() == KeyEvent.VK_CAPS_LOCK
                        || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DELETE) {
                    
//                    if (rowSelected != -1)  {
//                    String msg = "" + tblAdjstock.getValueAt(rowSelected, colFix).toString();
//                     if (msg.length() == 0) {
//                        if (tblAdjstock.isCellEditable(rowSelected, colFix)) {
//                            tblAdjstock.setValueAt("-", rowSelected, colFix);
//                        }
//                    }
//                    }
                    return;
                }
                String TempString ="0123456789.-" ;
                char curchar = ke.getKeyChar() ;
                if (TempString.indexOf(""+curchar)<0) {
                   PUtility.ShowMsg("กรุณาป้อนตัวเลขเท่านั้น...");
                   //tblAdjstock.setValueAt("-", rowSelected, colFix);
                   return ;
                }
                tblAdjstock.setRowSelectionInterval(rowSelected, rowSelected);
                tblAdjstock.setColumnSelectionInterval(colFix, colFix);
                String msg = "" + tblAdjstock.getValueAt(rowSelected, colFix);
                if (msg.length() > 0) {
                    if (tblAdjstock.isCellEditable(rowSelected, colFix)) {
                        tblAdjstock.setValueAt("", rowSelected, colFix);
                    }
                }
                ISSAVE = true;
            }

            public void keyReleased(KeyEvent ke) {
            }
        });

        tblAdjstock.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                int rowSelected = tblAdjstock.getSelectedRow();
                int colFix = tblAdjstock.getSelectedColumn();

                if (rowSelected == -1 || colFix == -1) {
                    return;
                }
                tblAdjstock.setRowSelectionInterval(rowSelected, rowSelected);
                tblAdjstock.setColumnSelectionInterval(colFix, colFix);
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        tblAdjstock.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent fe) {
                System.err.println("FOCUS GAINED !");
            }

            public void focusLost(FocusEvent fe) {
                if (tblAdjstock.isEditing()) {
                    tblAdjstock.getCellEditor().stopCellEditing();
                }
                btn_saveActionPerformed(null);
                System.err.println("FOCUS LOST !");
            }
        });

        model = (DefaultTableModel) tblAdjstock.getModel();
        tblAdjstock.setShowGrid(true);
        tblAdjstock.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblAdjstock.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblAdjstock.setRowSelectionAllowed(true);
        tblAdjstock.setBackground(Color.WHITE);
        tblAdjstock.setGridColor(Color.LIGHT_GRAY);

        JTableHeader header = tblAdjstock.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblAdjstock.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblAdjstock.setRowHeight(25);

        //Setting column size
        TableColumn column = null;
        int[] colSize = {50, 130, 250, 100, 80, 100, 265, 100};
        //tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblAdjstock.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }

//        TableTestFormatRenderer rInt = new TableTestFormatRenderer(IntegerFmt);
        
        // Hidden Collumn not use
        TableColumnModel colmodel = tblAdjstock.getColumnModel();
        TableColumn c = colmodel.getColumn(7);
        c.setResizable(false);
        c.setMinWidth(0);
        c.setMaxWidth(0);
        c.setWidth(0);

        colmodel = tblAdjstock.getColumnModel();
//        c = colmodel.getColumn(8);
//        c.setResizable(false);
//        c.setMinWidth(0);
//        c.setMaxWidth(0);
//        c.setWidth(0);

        TableColumnModel tcm = tblAdjstock.getColumnModel();

        TableTestFormatRenderer r;
        DefaultTableCellRenderer d;

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        tcm.getColumn(1).setCellRenderer(d);
        tcm.getColumn(2).setCellRenderer(d);
        tcm.getColumn(6).setCellRenderer(d);

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.CENTER);
        tcm.getColumn(0).setCellRenderer(d);

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.RIGHT);
        tcm.getColumn(3).setCellRenderer(d);
        tcm.getColumn(5).setCellRenderer(d);
        tcm.getColumn(7).setCellRenderer(d);
        tcm.getColumn(4).setCellRenderer(d);

        setButton();
    }

    private Hadjstock setHReciveBeanHAdjstock() {
        Hadjstock row = new Hadjstock();
        String rnoo = "A" + LoginDialog.BranchCode;
        row.setR_no(rnoo);
        try {
            row.setR_date(dateFmtShow.parse(txt2.getText().trim()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        row.setR_stk(txt4.getText());
        row.setR_remark(txt3.getText());
        int total = 0;
        for (int i = 0; i < tblAdjstock.getRowCount(); i++) {
            String num = "" + tblAdjstock.getValueAt(i, 3);
            if (!num.equals("-")) {
                try {
                    Double.parseDouble(num);
                    total++;
                } catch (Exception e) {
                    continue;
                }
            }
        }
        row.setR_total(total);
        row.setR_user(user);
        row.setR_post("N");

        return row;
    }
    private Hadjstock setUpdateHAdjstock() {
        Hadjstock row = new Hadjstock();
        String rnoo = txt1.getText();
        row.setR_no(rnoo);
        try {
            row.setR_date(dateFmtShow.parse(txt2.getText().trim()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        row.setR_stk(txt4.getText());
        row.setR_remark(txt3.getText());
        int total = 0;
        for (int i = 0; i < tblAdjstock.getRowCount(); i++) {
            String num = "" + tblAdjstock.getValueAt(i, 3);
            if (!num.equals("-")) {
                try {
                    Double.parseDouble(num);
                    total++;
                } catch (Exception e) {
                    continue;
                }
            }
        }
        row.setR_total(total);
        row.setR_user(user);
        row.setR_post("N");

        return row;
    }

    private void insertHeader() {
        try {
            //save adjstock
            Db_hadjstock hr = new Db_hadjstock();
            hr.insert(setHReciveBeanHAdjstock());
            if (txt1.getText().indexOf(newGenerate) != -1) {
                txt1.setText(rno_adj);
            }
            //save prolost
            Db_hprolost hp = new Db_hprolost();
//            hp.insert(setHeaderBeanHProlost());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private Hprolost setHeaderBeanHProlost() {
        Hprolost row = new Hprolost();
        String rno = "L-" + txt1.getText();
        row.setR_no(rno);
        try {
            row.setR_date(dateFmtShow.parse(txt2.getText().trim()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        row.setR_remark(txt3.getText());
        int total = 0;
        for (int i = 0; i < tblAdjstock.getRowCount(); i++) {
            String num = "" + tblAdjstock.getValueAt(i, 4);
            if (!num.equals("-")) {
                try {
                    Double.parseDouble(num);
                    total++;
                } catch (Exception e) {
                    continue;
                }
            }
        }
        row.setR_total(total);
        row.setR_user(user);
        row.setR_post("N");
        /*
        row.setR_userpost(userpost);
        Calendar now = Calendar.getInstance();
        row.setR_postdate(now.getTime());
        row.setR_posttime(DateAndTime.getTimeStringFormat(now));
         */
        return row;
    }

    private void updateHeader() {
        try {
            Db_hadjstock hr = new Db_hadjstock();
            hr.update(setUpdateHAdjstock());

            Db_hprolost pr = new Db_hprolost();
//            pr.update(setHeaderBeanHProlost());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private boolean checkDocnew() {
        Db_hadjstock hr = null;
        try {
            hr = new Db_hadjstock();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (hr.seek(txt1.getText().trim())) {
            return false;
        } else {
            return true;
        }
    }

    private boolean searchDocF1Dialog() {
        Jdi_browse_hadjstock rsd = new Jdi_browse_hadjstock(new NimbusFrame(), true);
        rsd.setLocation(btnDocno.getLocationOnScreen());
        rsd.setVisible(true);
        Hadjstock hrb = rsd.getDataRecord();
        if (hrb != null) {
            txt1.setText(hrb.getR_no());
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
            txt4.setText(hrb.getStkcode());
            txt5.setText(hrb.getStkname());
            txt4.requestFocus();
            return true;
        } else {
            txt4.requestFocus();
            return false;
        }
    }
private void setTableActive(){
    if(checkDate(true)){
        tblAdjstock.setEnabled(true);
    }else{
        tblAdjstock.setEnabled(false);
    }
}
    private void txtRnoEvent() {
        boolean isPost = false;
        String rno = txt1.getText().trim();
        if (rno.equals("") || rno == null) {
            txt1.requestFocus();
        } else {
            isDocnew = checkDocnew();
            if (isDocnew) {
                jPanel2.setVisible(true);
                btn_listdept.setText("รายการตรวจนับ");
                txt2.setText(dateFmtShow.format(Calendar.getInstance().getTime()));
                que = 1;
            } else {
                isPost = loadHeader(rno);
                loadDetail(rno);
                setTableActive();
                if (tblAdjstock.getRowCount() == 0) {
                    que = 1;
                } else {
                    int index = tblAdjstock.getRowCount() - 1;
                    que = Integer.parseInt((String) tblAdjstock.getValueAt(index, 0)) + 1;
                }
                txt1.setFocusable(false);
                txt1.setBackground(colorDisable);
                btnDocno.setEnabled(false);
                txt2.setFocusable(true);
                txt2.requestFocus();
                btnCalendar.setEnabled(true);
                txt6.setText("" + tblAdjstock.getRowCount() + " รายการ");
                txtStockEvent();
            }

            if (isPost) {
                setReadOnly();
                lbl1.setText("เอกสารนี้ได้ทำการบันทึกเข้าสต็อกสินค้าแล้วไม่สามารถแก้ไขได้");
                tblAdjstock.requestFocus();
            }
        }
    }

    private void txtStockEvent() {
        if (txt4.getText().trim().equals("") || txt4.getText() == null) {
            txt4.requestFocus();
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสคลังสินค้า");
            txt4.requestFocus();
            return;
        } else {

            boolean b = false;
            try {
                Db_stockfile db2 = new Db_stockfile();

                if (!db2.seek(txt4.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสคลังสินค้าให้ถูกต้อง");
                    b = false;
                } else {
                    Stockfile row = db2.getRecordAt(txt4.getText().trim());
                    txt4.setText(row.getStkcode());
                    txt5.setText(row.getStkname());
                    lbl2.setText("ตรวจนับ" + row.getStkname());
                    b = true;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                b = false;
            }
            if (b) {
//                btn_save.setEnabled(true);
            }
        }

    }

    private boolean loadHeader(String text) {
        try {
            String sql = "SELECT h.* , f.* FROM hadjstock h , stockfile f where h.r_stk = f.stkcode "
                    + "AND h.r_no ='" + text + "'";
            System.out.println(sql);
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            if (!rs.next()) {
                return false;
            }
            txt1.setText(rs.getString("r_no"));
            txt2.setText(dateFmtShow.format(rs.getDate("r_date")));
            txt3.setText(rs.getString("r_remark"));
            txt4.setText(rs.getString("r_stk"));
            txt5.setText(rs.getString("stkname"));
            lbl2.setText("ตรวจนับ " + rs.getString("stkname"));

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

    private void loadDetail(String r_no) {
        try {
            resetTableModel();
            
            String sql = "SELECT * FROM adjstock r , product p WHERE r.r_pcode=p.pcode "
                    + "AND r.r_no = '" + r_no + "' "
                    + "order by p.pgroup, p.pdesc";
            System.out.println(sql);
            String[] row = new String[tblAdjstock.getColumnCount()];
            ResultSet rs ;
            rs = MySQLConnect.con.createStatement().executeQuery(sql);
            while (rs.next()) {
                row[0] = ""+(model.getRowCount()+1);
                row[1] = rs.getString("r_pcode");
                row[2] = rs.getString("pdesc");
                row[3] = rs.getString("r_inhand");
                row[4] = rs.getString("pprice11");
                row[5] = rs.getString("r_user");
                row[6] = "";
                row[7] = rs.getString("punit1");
                
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String getProlostQty(String rno, String rpcode) {
        String qty = "-";
        try {
            //String sql = "select r_qty from prolost p, hprolost hp "
            //        + "where p.r_no like '%-"+rno.substring(7, 10)+"' and p.r_no=hp.r_no " +
            //        "and r_pcode='"+rpcode+"'";
            String sql = "select r_qty from prolost p, hprolost hp "
                    + "where p.r_no ='" + rno + "' and p.r_no=hp.r_no "
                    + "and r_pcode='" + rpcode + "'";
//            System.out.println("qty: " + sql);
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            if (rs.next()) {
                qty = rs.getString("r_qty");
            }
        } catch (Exception e) {
            e.printStackTrace();
            qty = "-";
        }
        return qty;
    }

    public String getAdjStockQty(String rno, String rpcode) {
        String qty = "-";
        try {
            String sql = "select r_inhand from adjstock "
                    + "where r_no='" + rno + "' and r_pcode='" + rpcode + "'";
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            if (rs.next()) {
                qty = rs.getString("r_inhand");
            }
        } catch (Exception e) {
            qty = "-";
        }
        return qty;
    }

    public void showCell(int row, int column) {
        Rectangle rect = tblAdjstock.getCellRect(row, column, true);
        tblAdjstock.scrollRectToVisible(rect);
        tblAdjstock.clearSelection();
        if (row != -1) {
            tblAdjstock.setRowSelectionInterval(row, row);
        }
        //tblshowplu.getModel().fireTableDataChanged(); // notify the model
    }

    private void cmdAddNew() {
        addNewDoc();
        txt1.requestFocus();
    }

    private void cmdSaveUpdateHeader() {
        if (tblAdjstock.isEditing()) {
            tblAdjstock.getCellEditor().stopCellEditing();
        }
        boolean genid = false;
        boolean saveAdjstock = false;

        for (int i = 0; i < tblAdjstock.getRowCount(); i++) {
            String value = "" + tblAdjstock.getValueAt(i, 3);
//            String value2 = "" + tblAdjstock.getValueAt(i, 4);
            if (!value.equals("") && !value.equals("-")) {
                genid = true;
                saveAdjstock = true;
                break;
            }
//            if (!value2.equals("") && !value2.equals("-")) {
//                genid = true;
//                break;
//            }
        }
        if (!genid) {
            return;
        }
        else if (!saveAdjstock) {
            return;
        }
//-----------------------------------------------------------------------------------------------------------
        if (txt1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่เลขที่เอกสารให้ถูกต้อง");
            txt1.requestFocus();
        } else if (txt2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่วันที่รับสินค้าให้ถูกต้อง");
            txt2.setEditable(true);
            txt2.setFocusable(true);
            txt2.requestFocus();
        } else if (txt4.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสคลังสินค้าให้ถูกต้อง");
            txt4.setEditable(true);
            txt4.setFocusable(true);
            txt4.requestFocus();
        } else {
            try {
                Db_stockfile fac = new Db_stockfile();
                if (!fac.seek(txt4.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสคลังสินค้าให้ถูกต้อง");
                    txt4.setText("");
                    txt4.requestFocus();
                    return;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            Db_hadjstock db = null;
            try {
                db = new Db_hadjstock();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            if (isDocnew) {
                insertHeader();
            } else {
                if (db.seek(txt1.getText().trim(), "N")) {
                    updateHeader();
                } else {
                    btnDocno.requestFocus();
                }
            }
        }
    }

    private void cmdSaveUpdate() {
        if (tblAdjstock.isEditing()) {
            tblAdjstock.getCellEditor().stopCellEditing();
        }
        //save detail
        cmdOk();
    }
    private Db_adjstock db;

    private void cmdOk() {
        try {
            db = new Db_adjstock();
        } catch (Exception e) {
        }
        if (txt4.getText().length() >= 14) {
            JOptionPane.showMessageDialog(this, "จำนวนมากเกิน 99,999,999.99 ล้านบาท ระบบไม่สามารถจัดเก็บได้");
            return;
        } else {
            for (int i = 0; i < tblAdjstock.getRowCount(); i++) {
                String text = "" + tblAdjstock.getValueAt(i, 3);
                try {
                    Float.parseFloat(text);
                } catch (Exception e) {
                    //remove r_pcode, r_no
                    String rpcode = "" + tblAdjstock.getValueAt(i, 1);
                    db.delete2(txt1.getText(), rpcode);
                    continue;
                }
                int rque = Integer.parseInt("" + tblAdjstock.getValueAt(i, 0));
                int maxrque = db.maxRque(txt1.getText());
                rque = maxrque;
                String rpcode = "" + tblAdjstock.getValueAt(i, 1);
                float rinhand = Float.parseFloat(PUtility.ConvertReal(text));
                float rprice = Float.parseFloat(PUtility.ConvertReal("" + tblAdjstock.getValueAt(i, 4)));
                String rremark = "" + tblAdjstock.getValueAt(i, 6);
                if (!SeekOldAdj(rpcode)) {
                    insertDetail(rpcode, rque, rinhand, rprice, rremark);
                } else {
                    updateDetail(rpcode, rinhand, rprice, rremark);
                }
                isDocnew = checkDocnew();
            }
            //update prolost
            Db_prolost dbProlost = null;
            try {
                dbProlost = new Db_prolost();
            } catch (Exception e) {
            }

//            for (int i = 0; i < tblAdjstock.getRowCount(); i++) {
//                String text = "" + tblAdjstock.getValueAt(i, 4);
//                try {
//                    Float.parseFloat(text);
//                } catch (Exception e) {
//                    //remove
//                    String rpcode = "" + tblAdjstock.getValueAt(i, 1);
//                    dbProlost.deleteProlost("L-" + txt1.getText(), rpcode);
//                    continue;
//                }
//                int rque = Integer.parseInt("" + tblAdjstock.getValueAt(i, 0));
//                int maxrque = dbProlost.maxRque("L-" + txt1.getText());
//                rque = maxrque;
//                String rpcode = "" + tblAdjstock.getValueAt(i, 1);
//                float rinhand = Float.parseFloat(PUtility.ConvertReal(text));
//                float rprice = Float.parseFloat(PUtility.ConvertReal("" + tblAdjstock.getValueAt(i, 5)));
//                String stock = txt4.getText();
//                String unit = ""+tblAdjstock.getValueAt(i, 7);
//
//                if (!SeekOldProLost(rpcode)) {
////                    insertDetailProlost(rpcode, rque, rinhand, rprice, stock, unit);
//                } else {
////                    updateDetailProlost(rpcode, rinhand, rprice, stock, unit);
//                }
//            }
            isDocnew = checkDocnew();
        }
    }

    private void updateDetailOldCode(String rpcode, int rque, float rinhand, float rprice, String rremark) {
        int TempQue = 0;
        double TempInhand = 0.0;
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select * from adjstock where (r_no='" + txt1.getText() + "') "
                    + "and (r_pcode='" + rpcode + "')";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.last();
            if (rec.getRow() == 0) {
            } else {
                TempQue = rec.getInt("r_que");
                TempInhand = rec.getDouble("r_inhand");
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            PUtility.ShowError(e.getMessage());
        }
        String rno = txt1.getText().trim();
        float ronhand;
        float radj = 0f;
        float ramount = 0f;
        Calendar now = Calendar.getInstance();
        String ruser = user;
        String rtime = timeFmtShow.format(now.getTime());
        String rentrydate = dateFmtSQL.format(now.getTime());
        //----------------------//
        rinhand = (float) (rinhand + TempInhand);
        rque = TempQue;
        try {
            ronhand = 0;
            String sql = "UPDATE adjstock"
                    + " SET "
                    + "r_pcode=" + "'" + rpcode + "'" + ","
                    + "r_onhand=" + ronhand + ","
                    + "r_inhand=" + rinhand + ","
                    + "r_post=" + "'N'" + ","
                    + "r_adj=" + radj + ","
                    + "r_price=" + rprice + ","
                    + "r_amount=" + ramount + ","
                    + "r_remark=" + "'" + rremark + "'" + ","
                    + "r_user=" + "'" + ruser + "'" + ","
                    + "r_time=" + "'" + rtime + "'" + ","
                    + "r_entrydate=" + "'" + rentrydate + "'"
                    + "WHERE r_no='" + rno + "'" + " AND " + "r_que=" + rque;

//            System.out.println("UPDATE Dtail := " + sql);
            int result = MySQLConnect.con.createStatement().executeUpdate(sql);
//            System.out.println("Result := " + result);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
            ex.printStackTrace();
        }
    }

    private void insertDetail(String rpcode, int rque, float rinhand, float rprice, String rremark) {
        String rno = txt1.getText().trim();
        float ronhand;
        float radj = 0f;
        float ramount = 0f;
        Calendar now = Calendar.getInstance();
        String ruser = user;
        String rtime = timeFmtShow.format(now.getTime());
        String rentrydate = dateFmtSQL.format(now.getTime());
        try {
            ronhand = 0;
            String sql = "INSERT INTO adjstock"
                    + " VALUES ("
                    + "'" + rno + "'" + ","
                    + rque + ","
                    + "'" + rpcode + "'" + ","
                    + ronhand + ","
                    + rinhand + ","
                    + "'N'" + ","
                    + radj + ","
                    + rprice + ","
                    + ramount + ","
                    + "'" + rremark + "'" + ","
                    + "'" + ruser + "'" + ","
                    + "'" + rtime + "'" + ","
                    + "'" + rentrydate + "'" + ")";
//            System.out.println("INSERT Dtail := " + sql);
            int result = MySQLConnect.con.createStatement().executeUpdate(sql);
//            System.out.println("Result := " + result);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void insertDetailProlost(String rpcode, int rque, float rinhand, float rprice, String stock,
            String unit) {
        String rno = "L-" + txt1.getText();
        float ronhand;
        float radj = 0f;
        float ramount = 0f;
        Calendar now = Calendar.getInstance();
        String ruser = user;
        String rtime = timeFmtShow.format(now.getTime());
        String rentrydate = dateFmtSQL.format(now.getTime());
        ramount = rprice*rinhand;

        try {
            ronhand = 0;
            String sql = "INSERT INTO prolost VALUES ("
                    + "'" + rno + "'," + rque + ",'" + rpcode + "','" + stock + "',1," + rinhand + ",'N','" + unit + "'," + rprice + ","
                    + ramount + ",0," + "'" + ruser + "','" + rtime + "','" + rentrydate + "'" + ")";
//            System.out.println("INSERT Dtail := " + sql);
            int result = MySQLConnect.con.createStatement().executeUpdate(sql);
//            System.out.println("Result := " + result);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "SQL: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void updateDetail(String rpcode, float rinhand, float rprice, String rremark) {
        String rno = txt1.getText().trim();
        float radj = 0f;
        float ronhand;
        float ramount = 0f;
        Calendar now = Calendar.getInstance();
        String ruser = user;
        String rtime = timeFmtShow.format(now.getTime());
        String rentrydate = dateFmtSQL.format(now.getTime());
        try {
            ronhand = 0;
            String sql = "UPDATE adjstock"
                    + " SET "
                    + "r_pcode=" + "'" + rpcode + "'" + ","
                    + "r_onhand=" + ronhand + ","
                    + "r_inhand=" + rinhand + ","
                    + "r_post=" + "'N'" + ","
                    + "r_adj=" + radj + ","
                    + "r_price=" + rprice + ","
                    + "r_amount=" + ramount + ","
                    + "r_remark=" + "'" + rremark + "'" + ","
                    + "r_user=" + "'" + ruser + "'" + ","
                    + "r_time=" + "'" + rtime + "'" + ","
                    + "r_entrydate=" + "'" + rentrydate + "' "
                    + "WHERE r_no='" + rno + "'" + " AND " + "r_pcode='" + rpcode+"'";

            System.out.println("UPDATE Dtail := " + sql);
            int result = MySQLConnect.con.createStatement().executeUpdate(sql);
            System.out.println("Result := " + result);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "SQL: " + ex.toString());
            ex.printStackTrace();
        }
    }

    private void updateDetailProlost(String rpcode, float rinhand, float rprice, String stock, String unit) {
        String rno = "L-" + txt1.getText();
        float ramount = 0f;
        Calendar now = Calendar.getInstance();
        String ruser = user;
        String rtime = timeFmtShow.format(now.getTime());
        String rentrydate = dateFmtSQL.format(now.getTime());
        ramount = rinhand*rprice;
        try {
            String sql = "UPDATE prolost "
                    + "SET r_pcode=" + "'" + rpcode + "'" + " , "
                    + "r_stock=" + "'" + stock + "'" + " ,"
                    + "r_qty=" + rinhand + " , r_post=" + "'N'" + " , "
                    + "r_unit='" + unit + "' , r_cost=" + rprice + " , "
                    + "r_amount=" + ramount + " , r_totalqty=0 , "
                    + "r_user=" + "'" + ruser + "'" + " , r_time=" + "'" + rtime + "'" + " , "
                    + "r_entrydate=" + "'" + rentrydate + "' "
                    + "WHERE r_no=" + "'" + rno + "' AND r_pcode='" + rpcode + "'";
            System.out.println("UPDATE Dtail := " + sql);
            int result = MySQLConnect.con.createStatement().executeUpdate(sql);
            System.out.println("Result := " + result);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private Boolean SeekOldAdj(String rpcode) {
        boolean RetVal = false;
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select *from adjstock where (r_no='" + txt1.getText() + "') "
                    + "and (r_pcode='" + rpcode + "')";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.last();
            if (rec.getRow() == 0) {
                RetVal = false;
            } else {
                RetVal = true;
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            PUtility.ShowError(e.getMessage());
        }
        return RetVal;
    }

    private Boolean SeekOldProLost(String rpcode) {
        boolean RetVal = false;
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select *from prolost "
                    + "where (r_no = 'L-" + txt1.getText() + "') "
                    + "and (r_pcode='" + rpcode + "')";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.last();
            if (rec.getRow() == 0) {
                RetVal = false;
            } else {
                RetVal = true;
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            PUtility.ShowError(e.getMessage());
        }
        return RetVal;
    }

    private void cmdRemoveAllAdjPro() {
        String text = txt1.getText().trim();

        if (text.equals("") | text == null) {
            JOptionPane.showMessageDialog(this, "โปรดใส่เลขที่เอกสารที่ต้องการจะลบ");
            txt1.requestFocus();
            return;
        }

        String sql = "SELECT * FROM hadjstock where r_no ='" + text + "' AND " + "r_post = 'N'";
//        System.out.println(sql);
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
                sql = "DELETE FROM hadjstock where r_no='" + text + "'";
                MySQLConnect.con.createStatement().executeUpdate(sql);
                sql = "DELETE FROM adjstock where r_no='" + text + "'";
                MySQLConnect.con.createStatement().executeUpdate(sql);

                sql = "DELETE FROM hprolost where r_no = 'L-" + txt1.getText() + "'";
                System.out.println(sql);
                MySQLConnect.con.createStatement().executeUpdate(sql);
                sql = "DELETE FROM prolost where r_no = 'L-" + txt1.getText() + "'";
                System.out.println(sql);
                MySQLConnect.con.createStatement().executeUpdate(sql);

                addNewDoc();
                txt1.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "ไม่สามารถลบเอกสารเลขที่ " + text
                        + " นี้ได้ \nเพราะเอกสารนี้ได้ทำการบันทึกเข้าสต็อกสินค้าแล้ว ");
                txt1.requestFocus();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void cmdOrderShow() {
        new Jdi_report_adjstock(new NimbusFrame(), true).setVisible(true);
        if (!PublicVar.ReturnString.equals("")) {
            txt1.setText(PublicVar.ReturnString);
        }
        txtRnoEvent();
    }

    private void cmdPrintOrder() {
        String Rno = txt1.getText().trim();
        if (!Rno.equals("")) {
            ViewReport report = new ViewReport();
            report.printAdjStock(Rno);
        }
    }

    private void cmdExit() {
        dispose();
    }

    private void cmdDelete() {
        if (txt1.getText().trim().equals("")) {
            txt1.requestFocus();
            return;
        }
        String r_no = txt1.getText().trim();
        String sql = "Delete from adjstock where r_no = '" + r_no + "' and r_que =" + que + "";
        try {
            int result = MySQLConnect.con.createStatement().executeUpdate(sql);
            txtRnoEvent();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void cmdDateChoose1() {
        Point point = btnCalendar.getLocationOnScreen();
        DateChooserDialog dcd = new DateChooserDialog(null, true, point);
        dcd.setVisible(true);
        txt2.setText(dateFmtShow.format(dcd.getSelectedDate().getTime()));
        txt2.requestFocus();
    }

    private Boolean SeekOldAdj() {
        boolean RetVal = false;
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
//            String SqlQuery = "select *from adjstock where (r_no='" + txtRno.getText() + "') +
//            and (r_pcode="+txtPcode.getText()+")";
            String SqlQuery = "";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.last();
            if (rec.getRow() == 0) {
                RetVal = false;
            } else {
                RetVal = true;
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            PUtility.ShowError(e.getMessage());
        }
        return RetVal;
    }

    public void ShowUserError() {
        JOptionPane.showMessageDialog(this, "พนักงานรหัสนี้ ไม่สามารถเข้าทำงานรายการนี้ได้...");
    }

    private boolean ChkPasswordPost() {
        return true;
    }

    private void AdjPostStock() {
        SimpleDateFormat DateFmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date AdjDate = new Date();
        if (ChkPasswordPost()) {
            String TDoc = txt1.getText();
            int totalRec = 0;
            int CurRec = 0;
            try {
                Statement stmt = (Statement) MySQLConnect.con.createStatement();
                String SQLQuery = "select * from adjstock left join hadjstock "
                        + "on adjstock.r_no=hadjstock.r_no "
                        + "where adjstock.r_no='" + TDoc + "' ";
                ResultSet rec = stmt.executeQuery(SQLQuery);
                rec.last();
                totalRec = rec.getRow();
                CurRec = 0;
                rec.first();
                if (rec.getRow() == 0) {
                    JOptionPane.showMessageDialog(this, "กรุณาป้อนรายการ..ก่อนทำการ POST สต้อกสินค้า...");
                    return;
                } else {
                    //SetReadOnly() ;
                    do {
                        double TQty = 0.0;
                        double TOnHand = 0.0;
                        double TAmount = 0.0;
                        CurRec++;
                        int TQue = rec.getInt("r_que");
                        Date TDate = rec.getDate("r_date");
                        String TCode = rec.getString("r_pcode");
                        String TStk = rec.getString("r_stk");
                        Double TempQty = rec.getDouble("r_inhand");
                        Double TempAmt = rec.getDouble("r_amount");
                        Double TPrice = rec.getDouble("r_price");
                        String T_Rem = "ADJ";
                        String TPost = rec.getString("r_post");
                        AdjDate = TDate;

                        if (!TPost.equals("Y")) {
                            TOnHand = GetTOnHand(TStk, TCode);
                            TQty = TempQty - TOnHand;
                            stock_update st = new stock_update();
                            TAmount = TQty * TPrice;
                            st.ProcessStockIn(TDoc, TStk, TCode, TDate, T_Rem, TQty, TAmount, user);
                            UpdateDetail(TDoc, TQue, TCode, TOnHand, TQty, TAmount);
                            lb_pitem.setText("กรุณารอสักครู่กำลัง POST ตรวจนับรายการที่ "+(CurRec)+"/"+totalRec);
                        }
                    } while (rec.next());
                }
                rec.close();
                stmt.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            if (CurRec > 0) {
                UpdateHeader(TDoc, user);
                JOptionPane.showMessageDialog(this, "จบการ POST สต็อกสินค้า(ตรวจนับ) เอกสารหมายเลข " + TDoc
                        + " จำนวน " + totalRec + " รายการ...");
                //update table dayoperation
                Db_DayOperation day = new Db_DayOperation();
                day.updateStatusAdj(AdjDate);

                addNewDoc();
            }
        } else {
            JOptionPane.showMessageDialog(this, "รหัสพนักงานนี้ไม่สามารถ POST สต็อกสินค้าได้...");
        }
    }
boolean ISPROCESS = false;
    void disableProcess(){
        ISPROCESS = true;
        tblAdjstock.setEnabled(false);
        btn_addnew.setEnabled(false);
        btn_allDept.setEnabled(false);
        btn_cancel.setEnabled(false);
        btn_deldocno.setEnabled(false);
        btn_exit.setEnabled(false);
        btn_listdept.setEnabled(false);
        btn_listdocno.setEnabled(false);
        btn_print.setEnabled(false);
        btn_save.setEnabled(false);
        mn_addnew.setEnabled(false);
        mn_cancel.setEnabled(false);
        mn_deldocno.setEnabled(false);
        mn_listdocno.setEnabled(false);
        mn_post.setEnabled(false);
        mn_save.setEnabled(false);
        btnCalendar.setEnabled(false);
        mn_exit.setEnabled(false);
        txt2.setFocusable(false);
        txt1.setFocusable(false);
        txt2.setRequestFocusEnabled(false);
        mn_report.setEnabled(false);
        txt6.requestFocus();
    }
    void activeProcess(){
        ISPROCESS = false;
        tblAdjstock.setEnabled(true);
        mn_report.setEnabled(true);
        mn_exit.setEnabled(true);
        txt2.setFocusable(true);
        txt1.setFocusable(true);
        btnCalendar.setEnabled(true);
        btn_addnew.setEnabled(true);
        btn_allDept.setEnabled(true);
        btn_cancel.setEnabled(true);
        btn_deldocno.setEnabled(true);
        btn_exit.setEnabled(true);
        btn_listdept.setEnabled(true);
        btn_listdocno.setEnabled(true);
        btn_print.setEnabled(true);
        btn_save.setEnabled(true);
        mn_addnew.setEnabled(true);
        mn_cancel.setEnabled(true);
        mn_deldocno.setEnabled(true);
        mn_listdocno.setEnabled(true);
        mn_post.setEnabled(true);
        mn_save.setEnabled(true);
    }

    private boolean ChkPostAdj() {
        boolean RetVal = false;
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select *from hadjstock where (r_no='" + txt1.getText() + "')";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.last();
            if (rec.getRow() == 0) {
            } else {
                if (rec.getString("r_post").equals("Y")) {
                    RetVal = true;
                } else {
                    RetVal = false;
                }
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            PUtility.ShowError(e.getMessage());
        }
        return RetVal;
    }

    public void UpdateDetail(String TDoc, int TQue, String TCode, Double T_OnHand,
            Double T_Adj, Double T_Amount) {
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "update adjstock set r_post='Y',r_onhand="
                    + T_OnHand + ",r_adj=" + T_Adj + ",r_amount=" + T_Amount + "  "
                    + "where r_no='" + TDoc + "' and r_que=" + TQue;
            //update template_adjstock
            stmt.executeUpdate("update template_adjust set stock='Y' where pcode='" + TCode + "'");
            //end update
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
            String SqlQuery = "update hadjstock set r_post='Y',r_userpost='" + user
                    + "',r_postdate='" + SqlDateFmt.format(date) + "',r_posttime='"
                    + FullTimeFmt.format(date) + "' where r_no='" + TDoc + "'";
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void UpdateHeaderProlost(String TDoc, String user) {
        SimpleDateFormat DateFmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat SqlDateFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat FullTimeFmt = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        Date date = new Date();
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "update hprolost set r_post='Y',r_userpost='" + user
                    + "',r_postdate='" + SqlDateFmt.format(date) + "',r_posttime='"
                    + FullTimeFmt.format(date) + "' "
                    + "where r_no='"+TDoc + "'";
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public int GetActMonth(Date TempDate) {
        int ReturnVal = 0;
        Date Acterm = new Date();
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select *from company ";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                Acterm = rec.getDate("accterm");
                int ActermYear = Integer.parseInt(SqlDateFmt.format(Acterm).substring(0, 4));
                int TempDateYear = Integer.parseInt(SqlDateFmt.format(TempDate).substring(0, 4));
                if (ActermYear == TempDateYear) {
                    ReturnVal = Integer.parseInt(SqlDateFmt.format(TempDate).substring(5, 7)) + 12;
                } else {
                    if (ActermYear == TempDateYear + 1) {
                        ReturnVal = Integer.parseInt(SqlDateFmt.format(TempDate).substring(5, 7));
                    } else {
                        ReturnVal = 0;
                    }
                }
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return ReturnVal;
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
            JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่ในการรับสินค้าจากโรงงาน");
            txt2.requestFocus();
        }
        return isSave;
    }
    private boolean checkDate() {
        boolean isSave = false;
        SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date d = sim.parse(txt2.getText());
            if (checkDate.validDate(d)) {
                isSave = true;
            } else {
                isSave = false;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return isSave;
    }
    private boolean checkDate(boolean isActive) {
        boolean isSave = false;
        SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date d = sim.parse(txt2.getText());
            if (checkDate.validDate(d, isActive)) {
                isSave = true;
            } else {
                isSave = false;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return isSave;
    }

    private double GetTOnHand(String TStk, String TCode) {
        double TOnHand = 0.0;
        SimpleDateFormat DateFmtM = new SimpleDateFormat("MM/yyyy", Locale.ENGLISH);
        Date txtDate = new Date();
        try {
            txtDate = dateFmtShow.parse(txt2.getText());
        } catch (ParseException ex) {
            Logger.getLogger(Main_adjstock.class.getName()).log(Level.SEVERE, null, ex);
        }

        String TempStrDate = "01/" + DateFmtM.format(txtDate);
        Date TempDate = new Date();
        try {
            TempDate = dateFmtShow.parse(TempStrDate);
        } catch (java.text.ParseException ex) {
        }
        int TempAct = GetActMonth(TempDate) - 1;
        String TempFieldName = "bqty" + IntFmt.format(TempAct).trim();
        String STK = TStk;

        try {
            Statement stmt2 = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery2 = "select *from stkfile  "
                    + "where  bpcode ='" + TCode + "' and bstk='" + STK + "'";
            ResultSet rec2 = stmt2.executeQuery(SqlQuery2);
            rec2.first();
            if (rec2.getRow() == 0) {
            } else {
                TempFieldName = "bqty" + IntFmt.format(TempAct).trim();
                TOnHand = rec2.getDouble(TempFieldName);
            }
            rec2.close();
            stmt2.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        try {
            Statement stmt3 = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery3 = "select s_pcode,s_stk,sum(s_in),sum(s_out) from stcard  "
                    + "where  s_pcode ='" + TCode + "' and s_stk='" + STK + "' and s_date>='"
                    + SqlDateFmt.format(TempDate) + "' and s_date<='" + SqlDateFmt.format(txtDate) + "' "
                    + "group by s_stk";
            ResultSet rec3 = stmt3.executeQuery(SqlQuery3);
            rec3.first();
            if (rec3.getRow() == 0) {
            } else {
                TOnHand = TOnHand + rec3.getDouble("sum(s_in)") - rec3.getDouble("sum(s_out)");
            }
            rec3.close();
            stmt3.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return TOnHand;
    }

    private void ButtonDefaultColor() {
        btn1.setBackground(null);
        btn2.setBackground(null);
        btn3.setBackground(null);
        btn4.setBackground(null);
        btn5.setBackground(null);
        btn6.setBackground(null);
        btn7.setBackground(null);
        btn8.setBackground(null);
        btn9.setBackground(null);
        btn10.setBackground(null);
        btn11.setBackground(null);
        btn12.setBackground(null);
        btn13.setBackground(null);
        btn14.setBackground(null);
        btn15.setBackground(null);
        btn16.setBackground(null);
        btn17.setBackground(null);
        btn18.setBackground(null);
        btn19.setBackground(null);
        btn20.setBackground(null);
        btn21.setBackground(null);
        btn22.setBackground(null);
        btn23.setBackground(null);
        btn24.setBackground(null);
        btn25.setBackground(null);
        btn26.setBackground(null);
        btn27.setBackground(null);
        btn28.setBackground(null);
        btn29.setBackground(null);
        btn30.setBackground(null);
        btn31.setBackground(null);
        btn32.setBackground(null);
        btn33.setBackground(null);
        btn34.setBackground(null);
        btn35.setBackground(null);
        btn36.setBackground(null);
        btn37.setBackground(null);
        btn38.setBackground(null);
        btn39.setBackground(null);
        btn40.setBackground(null);
        btn41.setBackground(null);
        btn42.setBackground(null);
        btn43.setBackground(null);
        btn44.setBackground(null);
        btn45.setBackground(null);
        btn46.setBackground(null);
        btn47.setBackground(null);
        btn48.setBackground(null);
        btn49.setBackground(null);
        btn50.setBackground(null);
    }

    void clearModel() {
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }
    }
    String r_no = null;
    Db_TemplateAdj dbAdj = new Db_TemplateAdj();

    public void readButton(javax.swing.JButton button, int index) {
        setTableActive();
        clearButton(index);
        ButtonDefaultColor();
        button.setBackground(Color.PINK);
        //user change button to save
        clearModel();
        ArrayList<TemplateAdj> arr = null;
        arr = dbAdj.getGroupNewAt(button.getText());
        for (int i = 0; i < arr.size(); i++) {
            TemplateAdj bean = (TemplateAdj) arr.get(i);
            String pcode = bean.getPcode();
            String rno = txt1.getText();
            String adj = "-";
            try {
                String[] data = dbAdj.getGroupOld(rno, pcode);
                adj = data[0];
            } catch (Exception e) {
                adj = "-";
            }
            model.addRow(new Object[]{i + 1, bean.getPcode(), bean.getPname(), adj, 
                        bean.getPrice(), user, bean.getRemark(), bean.getUnit()});
        }
        setSearchProduct();
        txt6.setText(tblAdjstock.getRowCount() + " รายการ");
    }

    private void addButtonAction() {
        btn1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn1, 0);
            }
        });
        btn2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn2, 1);
            }
        });
        btn3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn3, 2);
            }
        });
        btn4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn4, 3);
            }
        });
        btn5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn5, 4);
            }
        });
        btn6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn6, 5);
            }
        });
        btn7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn7, 6);
            }
        });
        btn8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn8, 7);
            }
        });
        btn9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn9, 8);
            }
        });
        btn10.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn10, 9);
            }
        });
        btn11.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn11, 10);
            }
        });
        btn12.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn12, 11);
            }
        });
        btn13.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn13, 12);
            }
        });
        btn14.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn14, 13);
            }
        });
        btn15.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn15, 14);
            }
        });
        btn16.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn16, 15);
            }
        });
        btn17.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn17, 16);
            }
        });
        btn18.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn18, 17);
            }
        });
        btn19.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn19, 18);
            }
        });
        btn20.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn20, 19);
            }
        });
        btn21.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn21, 20);
            }
        });
        btn22.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn22, 21);
            }
        });
        btn23.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn23, 22);
            }
        });
        btn24.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn24, 23);
            }
        });
        btn25.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn25, 24);
            }
        });
        btn26.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn26, 25);
            }
        });
        btn27.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn27, 26);
            }
        });
        btn28.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn28, 27);
            }
        });
        btn29.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn29, 28);
            }
        });
        btn30.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn30, 29);
            }
        });
        btn31.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn31, 30);
            }
        });
        btn32.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn32, 31);
            }
        });
        btn33.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn33, 32);
            }
        });
        btn34.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn34, 33);
            }
        });
        btn35.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn35, 34);
            }
        });
        btn36.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn36, 35);
            }
        });
        btn37.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn37, 36);
            }
        });
        btn38.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn38, 37);
            }
        });
        btn39.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn39, 38);
            }
        });
        btn40.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn40, 39);
            }
        });
        btn41.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn41, 40);
            }
        });
        btn42.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn42, 41);
            }
        });
        btn43.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn43, 42);
            }
        });
        btn44.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn44, 43);
            }
        });
        btn45.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn45, 44);
            }
        });
        btn46.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn46, 45);
            }
        });
        btn47.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn47, 46);
            }
        });
        btn48.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn48, 47);
            }
        });
        btn49.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn49, 48);
            }
        });
        btn50.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readButton(btn50, 49);
            }
        });
        for (int i = 0; i < btn.length; i++) {
            btn[i].addKeyListener(new KeyListener() {

                public void keyTyped(KeyEvent ke) {
                }

                public void keyPressed(KeyEvent ke) {
                    if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                        txt7.requestFocus();
                    } else if (ke.getKeyCode() == KeyEvent.VK_ESCAPE) {
                        ButtonDefaultColor();
                        setButton();
                        txt4.requestFocus();
                    }
                }

                public void keyReleased(KeyEvent ke) {
                }
            });
        }
    }

    private void setTextButton(ArrayList<TemplateAdj> arr) {
        for (int i = 0; i < arr.size(); i++) {
            TemplateAdj bean = (TemplateAdj) arr.get(i);
            String groupname = bean.getGroup_name();
            if (btn[i] != null) {
                btn[i].setVisible(true);
                btn[i].setText(groupname);
            }
        }
        for (int i = arr.size(); i < btn.length; i++) {
            if (btn[i] != null) {
                btn[i].setVisible(false);
            }
        }
    }

    private void cmdpoststock() {
        int RowCount = model.getRowCount();
        if ((txt1.getText().equals("")) || (RowCount == 0)) {
            txt1.requestFocus();
            return;
        }
        if (!Inv_UserRec.Stock27.equals("Y")) {
            ShowUserError();
            txt1.requestFocus();
            return;
        }
        Date TempDate = new Date();
        try {
            TempDate = dateFmtShow.parse(txt2.getText());
        } catch (ParseException ex) {
            //Logger.getLogger(Main_adjstock.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(this, "ป้อนวันที่ไม่ถูกต้อง...");
            return;
        }
        //ตรวจสอบวันที่ สิ้นเดือน
        String txt1_ = "";
        String txt2_ = "";
        Calendar cal = Calendar.getInstance();
        txt1_ = dateFmtShow.format(TempDate);
        txt2_ = dateFmtShow.format(cal.getTime());
        if (ChkPostAdj()) {
            JOptionPane.showMessageDialog(this, "เอกสารเลขที่ " + txt1.getText()
                    + " ได้ทำการตัดสต็อกสินค้าไปแล้ว...");
        } else {
            //add code
            AdjPostStock();
        }
        addNewDoc();
    }

    public void UpdateDetailProlost(String TDoc, int TQue) {
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "update prolost set r_post='Y' " +
                    "where r_no='" + TDoc + "' "
                    + "and r_que=" + TQue;
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void PostStockProlost() {
        String TDoc = "L-"+txt1.getText();
        if (TDoc.equals("")) {
            txt1.requestFocus();
            return;
        }
        int totalRec = 0;
        int CurRec = 0;
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SQLQuery = "select prolost.r_no,r_date,r_que,r_pcode,r_stock,"
                    + "r_qty,r_amount,prolost.r_post "
                    + "from prolost left join hprolost on prolost.r_no=hprolost.r_no "
                    + "where prolost.r_no='" + TDoc + "' ";
            ResultSet rec = stmt.executeQuery(SQLQuery);
            rec.last();
            totalRec = rec.getRow();
            CurRec = 0;
            rec.first();
            if (rec.getRow() == 0) {
                return;
            } else {
                do {
                    CurRec++;
                    int TQue = rec.getInt("r_que");
                    Date TDate = rec.getDate("r_date");
                    String TCode = rec.getString("r_pcode");
                    String TStk = rec.getString("r_stock");
                    Double TempQty = rec.getDouble("r_qty");
                    Double TempAmt = rec.getDouble("r_amount");
                    String T_Rem = "LOS";
                    String TPost = rec.getString("r_post");
                    if (!TPost.equals("Y")) {
                        stock_update st = new stock_update();
                        st.ProcessStockOut(TDoc, TStk, TCode, TDate, T_Rem, TempQty, TempAmt, user);
                        UpdateDetailProlost(TDoc, TQue);
                        lb_pitem.setText("กรุณารอสักครู่ กำลัง POST ของเสียรายการที่ "+(CurRec)+"/"+totalRec);
                    }
                } while (rec.next());
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        if (totalRec > 0) {
            UpdateHeaderProlost(TDoc, user);
            JOptionPane.showMessageDialog(this, "จบการ POST สต็อกสินค้า(ของเสีย) เอกสารหมายเลข "
                    + TDoc + " จำนวน " + totalRec + " รายการ...");
        }
    }

    private void setReadOnly() {
        txt1.setBackground(colorDisable);
        txt1.setFocusable(false);
        txt2.setFocusable(false);
        txt4.setFocusable(false);
        btnDocno.setEnabled(true);
        btnStock.setEnabled(false);
        txt2.setForeground(Color.DARK_GRAY);
        txt3.setForeground(Color.DARK_GRAY);
        txt4.setForeground(Color.DARK_GRAY);
        tblAdjstock.setEnabled(false);
        btnDocno.requestFocus();
    }

    private void clearButton(int no) {
        for (int i = 0; i < btn.length; i++) {
            if (i != no) {
                btn[i].setVisible(false);
            }
        }
    }
    private String codeError;

    private boolean validData(){
        if (tblAdjstock.isEditing()) {
            tblAdjstock.getCellEditor().stopCellEditing();
        }
        codeError = "";
        boolean isValid = true;
        for(int i=0;i<tblAdjstock.getRowCount();i++){
            double qty_adjstock = 0;
            String product = ""+tblAdjstock.getValueAt(i, 1);
            String qty_adj = ""+tblAdjstock.getValueAt(i, 3);
            try {
                qty_adjstock = Double.parseDouble(qty_adj);
            }catch(Exception e){
            }
            
            if(qty_adjstock<0){
                isValid = false;
                codeError = codeError+product+",";
            }
        }

        return isValid;
    }
}
