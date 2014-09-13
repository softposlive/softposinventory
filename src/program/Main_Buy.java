package program;

import DBcontrol.Db_Ordering;
import DBcontrol.Db_company;
import Main.viewreport.Jdi_report_recive;
import Main.viewreport.Jdi_Inv_product;
import Main.browser.Jdi_browse_stockfile;
import Main.browser.Jdi_browse_hrecive;
import Main.browser.Jdi_show_factory;
import report.ViewReport;
import Bean.FactoryBean;
import Bean.Hrecive;
import Bean.Product;
import Bean.Recive;
import Bean.Stockfile;
import DBcontrol.Db_hrecive;
import DBcontrol.FactoryControl;
import DBcontrol.Db_product;
import DBcontrol.Db_recive;
import DBcontrol.Db_stockfile;
import DBcontrol.MySQLConnect;
import Main.viewreport.Jdi_report_sumReciveGroup;
import Main.viewreport.Jdi_report_sumRecivePLU;
import java.awt.Color;
import java.awt.Font;
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
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import utilities.date_time.DateAndTime;
import utilities.NimbusFrame;

public class Main_Buy extends javax.swing.JDialog {
    private boolean isPost;
    private CheckDate checkDate;
    private Color colorDisable = new Color(246, 248, 200);

    public Main_Buy(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        Font myfont = new Font("Tahoma", Font.PLAIN, 14);
        UIManager.put("Label.font", myfont);
        UIManager.put("Button.font", myfont);
        
        initComponents();
        initTableComponents();

        addNewDoc();
    }

    private void clearModel() {
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        HeaderPanal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDocno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JFormattedTextField();
        btnCalendar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt17 = new javax.swing.JTextField();
        btnDocno1 = new javax.swing.JButton();
        txt18 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        ItemPanal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        btnProduct = new javax.swing.JButton();
        txt9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnStock = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt10 = new javax.swing.JFormattedTextField();
        txt11 = new javax.swing.JFormattedTextField();
        txt12 = new javax.swing.JFormattedTextField();
        txt13 = new javax.swing.JTextField();
        btnDelItem = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt21 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt22 = new javax.swing.JFormattedTextField();
        txt16 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();
        txt15 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_addnew = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_deldocno = new javax.swing.JButton();
        btn_listdocno = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("รับสินค้าจากโรงงาน/การผลิต");
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        HeaderPanal.setBackground(new java.awt.Color(147, 202, 238));
        HeaderPanal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("เลขที่เอกสาร");

        btnDocno.setBackground(java.awt.Color.white);
        btnDocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnDocno.setFocusable(false);
        btnDocno.setRequestFocusEnabled(false);
        btnDocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("วันที่รับสินค้า");

        jLabel3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("รับสินค้าจาก");

        jLabel4.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("เครดิต (CR)");

        txt4.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt4.setText("0 วัน");
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

        jPanel4.setBackground(new java.awt.Color(176, 214, 217));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl2.setFont(new java.awt.Font("Norasi", 1, 24)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("รายการซื้อสินค้า");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
        btnCalendar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnCalendarFocusGained(evt);
            }
        });
        btnCalendar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCalendarKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("เลขที่ใบสั่งซื้อ");

        txt17.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt17FocusGained(evt);
            }
        });
        txt17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt17KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt17KeyReleased(evt);
            }
        });

        btnDocno1.setBackground(java.awt.Color.white);
        btnDocno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnDocno1.setFocusable(false);
        btnDocno1.setRequestFocusEnabled(false);
        btnDocno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocno1ActionPerformed(evt);
            }
        });

        txt18.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt18FocusGained(evt);
            }
        });
        txt18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt18KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt18KeyReleased(evt);
            }
        });

        txt19.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt19FocusGained(evt);
            }
        });
        txt19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt19KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt19KeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("วิธีการคำนวณภาษี (Vat)");

        txt1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt1FocusGained(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout HeaderPanalLayout = new javax.swing.GroupLayout(HeaderPanal);
        HeaderPanal.setLayout(HeaderPanalLayout);
        HeaderPanalLayout.setHorizontalGroup(
            HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt18)
                    .addComponent(txt4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txt1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanalLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HeaderPanalLayout.createSequentialGroup()
                        .addComponent(btnDocno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HeaderPanalLayout.createSequentialGroup()
                        .addComponent(btnDocno1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        HeaderPanalLayout.setVerticalGroup(
            HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(HeaderPanalLayout.createSequentialGroup()
                        .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDocno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnDocno1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HeaderPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        //cmdSearchDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifying glass.jpg")));
        //cmdSearchDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifying glass.jpg")));

        ItemPanal.setBackground(new java.awt.Color(234, 230, 237));
        ItemPanal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ItemPanal.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel6.setText("NO");

        jLabel7.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel7.setText("รหัสสินค้า (PLU-CODE)");

        txt6.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setText("1");
        txt6.setNextFocusableComponent(txt7);
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

        txt7.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
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
        btnProduct.setRequestFocusEnabled(false);
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
        btnProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnProductKeyPressed(evt);
            }
        });

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

        jLabel8.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel8.setText("สำหรับคลัง");

        btnStock.setBackground(new java.awt.Color(228, 223, 217));
        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnStock.setAlignmentY(0.0F);
        btnStock.setRequestFocusEnabled(false);
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel9.setText("หน่วยบรรจุ");

        jLabel10.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel10.setText("ส่วนลด %");

        jLabel11.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel11.setText("จำนวนเงิน (Amount)");

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

        txt11.setEditable(false);
        txt11.setBackground(new java.awt.Color(246, 248, 200));
        txt11.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txt11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt11.setFocusable(false);
        txt11.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt11.setRequestFocusEnabled(false);

        txt12.setEditable(false);
        txt12.setBackground(new java.awt.Color(246, 248, 200));
        txt12.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txt12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt12.setText("0.00");
        txt12.setFocusable(false);
        txt12.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N

        txt13.setEditable(false);
        txt13.setBackground(new java.awt.Color(246, 248, 200));
        txt13.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt13.setFocusable(false);

        btnDelItem.setFont(new java.awt.Font("Norasi", 1, 12)); // NOI18N
        btnDelItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btnDelItem.setText("ลบรายการ");
        btnDelItem.setFocusable(false);
        btnDelItem.setRequestFocusEnabled(false);
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
        btnAddItem.setRequestFocusEnabled(false);
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

        jLabel15.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel15.setText("จำนวน (Qty)");

        txt21.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt21FocusGained(evt);
            }
        });
        txt21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt21KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt21KeyReleased(evt);
            }
        });

        txt20.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt20FocusGained(evt);
            }
        });
        txt20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt20KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt20KeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel16.setText("จำนวนของแถม");

        txt22.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        txt22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt22.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt22FocusGained(evt);
            }
        });
        txt22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt22KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt22KeyReleased(evt);
            }
        });

        txt16.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        txt16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt16.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt16FocusGained(evt);
            }
        });
        txt16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt16KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt16KeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel17.setText("หน่วยซื้อ");

        javax.swing.GroupLayout ItemPanalLayout = new javax.swing.GroupLayout(ItemPanal);
        ItemPanal.setLayout(ItemPanalLayout);
        ItemPanalLayout.setHorizontalGroup(
            ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemPanalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ItemPanalLayout.createSequentialGroup()
                        .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txt7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ItemPanalLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ItemPanalLayout.createSequentialGroup()
                                .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ItemPanalLayout.createSequentialGroup()
                        .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItemPanalLayout.createSequentialGroup()
                        .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(ItemPanalLayout.createSequentialGroup()
                        .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ItemPanalLayout.createSequentialGroup()
                        .addComponent(btnDelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ItemPanalLayout.createSequentialGroup()
                        .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt12)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        ItemPanalLayout.setVerticalGroup(
            ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemPanalLayout.createSequentialGroup()
                .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ItemPanalLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ItemPanalLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ItemPanalLayout.createSequentialGroup()
                            .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ItemPanalLayout.createSequentialGroup()
                                    .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addGap(2, 2, 2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemPanalLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ItemPanalLayout.createSequentialGroup()
                        .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ItemPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jScrollPane1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N

        tblShow.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblShow.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", " PLU", "ชื่อสินค้า/รายการ", "คลัง", "จำนวนสั่ง", "จำนวนส่ง", "จำนวนรับ", "หน่วยนับ", "ราคา/หน่วย", "จำนวนเงิน", "พนักงาน", "วันที่ป้อนข้อมูล", "เวลาป้อน"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
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
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblShowFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tblShow);

        txt15.setEditable(false);
        txt15.setBackground(new java.awt.Color(246, 248, 200));
        txt15.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt15.setRequestFocusEnabled(false);

        txt14.setEditable(false);
        txt14.setBackground(new java.awt.Color(246, 248, 200));
        txt14.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt14.setFocusable(false);

        jLabel12.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("จำนวนรายการสินค้า");

        lbl1.setFont(new java.awt.Font("Norasi", 1, 16)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 0, 0));
        lbl1.setText("XXX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HeaderPanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ItemPanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(HeaderPanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemPanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setRequestFocusEnabled(false);

        btn_addnew.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_addnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.gif"))); // NOI18N
        btn_addnew.setText("เพิ่มเอกสาร");
        btn_addnew.setFocusable(false);
        btn_addnew.setRequestFocusEnabled(false);
        btn_addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addnewActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancle.gif"))); // NOI18N
        btn_cancel.setText("ยกเลิก");
        btn_cancel.setFocusable(false);
        btn_cancel.setRequestFocusEnabled(false);
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.gif"))); // NOI18N
        btn_save.setText("บันทึกข้อมูล");
        btn_save.setFocusable(false);
        btn_save.setRequestFocusEnabled(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_deldocno.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_deldocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btn_deldocno.setText("ลบข้อมูลใบรับ");
        btn_deldocno.setFocusable(false);
        btn_deldocno.setRequestFocusEnabled(false);
        btn_deldocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deldocnoActionPerformed(evt);
            }
        });

        btn_listdocno.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_listdocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open.gif"))); // NOI18N
        btn_listdocno.setText("แสดงรายการ");
        btn_listdocno.setFocusable(false);
        btn_listdocno.setRequestFocusEnabled(false);
        btn_listdocno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listdocnoActionPerformed(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        btn_print.setText("พิมพ์");
        btn_print.setFocusable(false);
        btn_print.setRequestFocusEnabled(false);
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.gif"))); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.setFocusable(false);
        btn_exit.setRequestFocusEnabled(false);
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
                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_deldocno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_listdocno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_cancel)
                    .addComponent(btn_save)
                    .addComponent(btn_deldocno)
                    .addComponent(btn_listdocno)
                    .addComponent(btn_addnew)
                    .addComponent(btn_exit)
                    .addComponent(btn_print)))
        );

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
        jMenuItem8.setText("สรุปการรับสินค้าตามรหัสสินค้า");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jMenuItem9.setText("สรุปการรับสินค้าตามแผนกสินค้า");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        setSize(new java.awt.Dimension(1024, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btnDocnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocnoActionPerformed
    searchDocF1Dialog();
}//GEN-LAST:event_btnDocnoActionPerformed

private void txt6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyPressed
    try {
        Integer.parseInt(txt6.getText());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "กรุณาระบุลำดับรายการสินค้าให้เป็นตัวเลข !");
        txt6.requestFocus();
        return;
    }
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt6.setFocusable(false);
        txt7.setFocusable(true);
        txt7.requestFocus();
        btnProduct.setEnabled(true);
        txt6_OnExit();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        addNewDoc();
        txt1.requestFocus();
    }
}//GEN-LAST:event_txt6KeyPressed

private void txt7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_F1) {
        if (searchProF1Dialog()) {
            txt7OnExit();
        }
        txt7.requestFocus();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt7OnExit();
    }
}//GEN-LAST:event_txt7KeyPressed

private void txt9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_F1) {
        if (searchStkF1Dialog()) {
            txt9OnExit();
        }
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt9OnExit();
    }
}//GEN-LAST:event_txt9KeyPressed

private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        if (txt1.getText().equals("")) {
            txt1.requestFocus();
            return;
        }
        if (txt4.getText().equals("")) {
            txt4.requestFocus();
            return;
        } else if (txt7.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสินค้า");
            txt7.requestFocus();
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
        txt10_OnExit();
        //ตรวจสอบ flag ว่าให้กำหนดแจ้งเตือนหรือไม
        Db_company db = new Db_company();
        stock_update stk = new stock_update();
        stk.stock_update();
        boolean minimumchk = db.getCompanyDetail().getMinchk().equals("Y");

        if (txt10.getText().indexOf("-") != -1) {
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
        }
        cmdOk();
    }
//GEN-LAST:event_btnAddItemActionPerformed

private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
    if (searchProF1Dialog()) {
        txt7OnExit();
    }
    txt7.requestFocus();
}//GEN-LAST:event_btnProductActionPerformed

    boolean chkOrderEnable() {
        if (txt1.getText().equals("") || txt2.getText().equals("") || txt4.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

private void btn_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addnewActionPerformed
    addNewDoc();
}//GEN-LAST:event_btn_addnewActionPerformed

private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
    btn_addnewActionPerformed(null);
}//GEN-LAST:event_btn_cancelActionPerformed

private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
    if (txt1.getText().trim().equals("")) {
        JOptionPane.showMessageDialog(this, msgNotFoundDocno);
        txt1.requestFocus();
        return;
    }
    if (txt2_OnExit()) {
        cmdSaveUpdate();
    }
}//GEN-LAST:event_btn_saveActionPerformed
    private String msgNotFoundDocno = "กรุณาระบุเลขที่เอกสาร !";
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

private void tblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowMouseClicked
    if (!isPost) {
        if (evt.getClickCount() == 2) {
            int index = Integer.parseInt("" + tblShow.getValueAt(tblShow.getSelectedRow(), 0));
            System.out.println("index = " + index);
            GetDataRecord(index);
            txt6.setFocusable(false);
            txt7.setFocusable(true);
            txt7.requestFocus();
            btnProduct.setEnabled(true);
            try {
                int selected = tblShow.getSelectedRow();
                String value = "" + tblShow.getValueAt(selected, 4);
                System.out.println(value);
                double chkRow = Double.parseDouble(value);
                if (chkRow > 0) {
                    btnDelItem.setEnabled(false);
                } else {
                    btnDelItem.setEnabled(true);
                }
            } catch (Exception e) {
                PUtility.ShowError(e.getMessage());
                btnDelItem.setEnabled(false);
            }
        }
    }
}//GEN-LAST:event_tblShowMouseClicked

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

private void txt6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt6FocusGained
    GetLastQue();
    txt6.selectAll();
}//GEN-LAST:event_txt6FocusGained

private void mn_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_addnewActionPerformed
    btn_addnewActionPerformed(null);
}//GEN-LAST:event_mn_addnewActionPerformed

private void mn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_cancelActionPerformed
    btn_cancelActionPerformed(null);
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
}//GEN-LAST:event_btn_printActionPerformed

private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
    cmdExit();
}//GEN-LAST:event_btn_exitActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    cmdExit();
}//GEN-LAST:event_jMenuItem7ActionPerformed

private void txt4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt4FocusGained
    txt4.selectAll();
}//GEN-LAST:event_txt4FocusGained

private void btnProductFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnProductFocusGained
}//GEN-LAST:event_btnProductFocusGained

private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
    cmdDateChoose1();
}//GEN-LAST:event_btnCalendarActionPerformed

private void btnCalendarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCalendarKeyPressed
    escapeEvent(evt);
}//GEN-LAST:event_btnCalendarKeyPressed

private void btnProductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnProductKeyPressed
    escapeEvent(evt);
}//GEN-LAST:event_btnProductKeyPressed

private void btnAddItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddItemKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }
}//GEN-LAST:event_btnAddItemKeyPressed

    private void tblShowKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            if (!isPost) {
                txt6.requestFocus();
            } else {
                addNewDoc();
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!isPost) {
                int index = tblShow.getSelectedRow() + 1;
                GetDataRecord(index);
                txt7.requestFocus();
                try {
                    String value = "" + tblShow.getValueAt(index, 4);
                    System.out.println(value);
                    double chkRow = Double.parseDouble(value);
                    if (chkRow > 0) {
                        btnDelItem.setEnabled(false);
                    } else {
                        btnDelItem.setEnabled(true);
                    }
                } catch (Exception e) {
                    PUtility.ShowError(e.getMessage());
                    btnDelItem.setEnabled(false);
                }
            }
        }
    }

private void btnCalendarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCalendarFocusGained
}//GEN-LAST:event_btnCalendarFocusGained

private void mn_postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_postActionPerformed
    if (PublicVar.TempUser.Stock2.equals("Y")) {
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
        String msgError = "";
        if (minimumchk) {
            for (int i = 0; i < tblShow.getRowCount(); i++) {
                String r_no = txt1.getText();
                String pcode = "" + tblShow.getValueAt(i, 1);
                String stk2 = "" + tblShow.getValueAt(i, 3);

                if (stk.checkStock("recive", stk2, pcode, r_no)) {
                    posStock = true;
                } else {
                    msgError += pcode+",";
                    posStock = false;
                    break;
                }
            }
        }
        if(!posStock){
                PUtility.ShowError("ไม่สามารถตัดสต็อกสินค้าได้ รหัสสินค้า(" + msgError + " ) \n"
            + "ระบุจำนวนเกินสต็อกสินค้า ทำให้ยอดติดลบ กรุณาตรวจสอบ");
        }
        //ตัดสต็อก
        if (posStock) {
            String r_no = txt1.getText();
            if (txt2_OnExit()) {
                PostStock(txt1.getText());
                Db_Ordering dbSeek = new Db_Ordering();
                if (dbSeek.seek_FGDatabase()) {
                    setEnableReceiveOrder2(r_no);
                }
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "พนักงานรหัสนี้ ไม่สามารถเข้าทำงานรายการนี้ได้...");
    }
}//GEN-LAST:event_mn_postActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    cmdReportByCode();
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
    cmdReportByGroup();
}//GEN-LAST:event_jMenuItem9ActionPerformed
    Db_Ordering dd = new Db_Ordering();

    private void setEnableReceiveOrder(String order_no, String flag) {
        dd.enableFlag(order_no, flag, txt1.getText());
    }

    private void setEnableReceiveOrder2(String r_no) {
        dd.enableFlag(r_no);
    }

private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
    if (searchStkF1Dialog()) {
        txt9OnExit();
    }
    txt9.requestFocus();
}//GEN-LAST:event_btnStockActionPerformed

private void txt7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt7FocusGained
    txt7.setText(txt7.getText());
    txt7.selectAll();
}//GEN-LAST:event_txt7FocusGained

private void txt10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt10KeyReleased
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        txt10.setText("0.000");
    } else {
        try {
            Float.parseFloat(txt10.getText().trim());
            calculateValues();
        } catch (NumberFormatException ex) {
        }
    }
}//GEN-LAST:event_txt10KeyReleased

private void txt10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt10KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt10_OnExit();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }
}//GEN-LAST:event_txt10KeyPressed

private void txt10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt10FocusGained
    String bak = txt10.getText();
    txt10.setText("");
    txt10.setText(bak);
    txt10.requestFocus();
    txt10.selectAll();
}//GEN-LAST:event_txt10FocusGained

private void txt9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt9FocusGained
    txt9.selectAll();
}//GEN-LAST:event_txt9FocusGained

private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained
    txt2.setText(txt2.getText());
    txt2.selectAll();
}//GEN-LAST:event_txt2FocusGained

private void tblShowFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblShowFocusLost
    tblShow.clearSelection();
}//GEN-LAST:event_tblShowFocusLost

private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt2_OnExit();
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewDoc();
    }
}//GEN-LAST:event_txt2KeyPressed

private void txt4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txt4_OnExit();
    } else if (evt.getKeyCode() == KeyEvent.VK_F1) {
        //btnFactoryActionPerformed(null);
    } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewDoc();
    }
}//GEN-LAST:event_txt4KeyPressed

private void btnDelItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDelItemKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        addNewItem();
        txt6.setFocusable(true);
        txt6.requestFocus();
    }
}//GEN-LAST:event_btnDelItemKeyPressed

private void txt7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyReleased
    productAuto();
}//GEN-LAST:event_txt7KeyReleased

private void txt4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyReleased
    factoryAuto();
}//GEN-LAST:event_txt4KeyReleased

    private void txt17FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt17FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt17FocusGained

    private void txt17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt17KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt17KeyPressed

    private void txt17KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt17KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt17KeyReleased

    private void btnDocno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDocno1ActionPerformed

    private void txt18FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt18FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt18FocusGained

    private void txt18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt18KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt18KeyPressed

    private void txt18KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt18KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt18KeyReleased

    private void txt19FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt19FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt19FocusGained

    private void txt19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt19KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt19KeyPressed

    private void txt19KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt19KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt19KeyReleased

    private void txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1FocusGained

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
            btnDocnoActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            if (txt1.getText().equals("")) {
                dispose();
            } else {
                txt1.setText("");
            }
        }
    }//GEN-LAST:event_txt1KeyPressed

    private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1KeyReleased

    private void txt21FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt21FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt21FocusGained

    private void txt21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt21KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt21KeyPressed

    private void txt21KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt21KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt21KeyReleased

    private void txt20FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt20FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt20FocusGained

    private void txt20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt20KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt20KeyPressed

    private void txt20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt20KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt20KeyReleased

    private void txt22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt22FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt22FocusGained

    private void txt22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt22KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt22KeyPressed

    private void txt22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt22KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt22KeyReleased

    private void txt16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt16FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt16FocusGained

    private void txt16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt16KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt16KeyPressed

    private void txt16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt16KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt16KeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Main_Buy dialog = new Main_Buy(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel HeaderPanal;
    private javax.swing.JPanel ItemPanal;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnDelItem;
    private javax.swing.JButton btnDocno;
    private javax.swing.JButton btnDocno1;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btn_addnew;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_deldocno;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_listdocno;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel jPanel4;
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
    private javax.swing.JFormattedTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JFormattedTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JFormattedTextField txt22;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
    ///////////////////  Variable /////////////////////////////////////////////
    DefaultTableModel model;
    private int que;
    private boolean isDocnew;
    String user = PublicVar.TempUser.UserCode;
    //String userpost = "1001";
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    SimpleDateFormat timeFmtShow = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
    DecimalFormat doubleFmt = new DecimalFormat("##,###,##0.00");
    DecimalFormat integerFmt = new DecimalFormat("####0");
    DecimalFormat qtyFmt = new DecimalFormat("#,###,##0.000");

    //////////////////  Utility ////////////////////////////////////////////////
    private void addNewDoc() {
        checkDate = new CheckDate();
        btn_addnew.setEnabled(true);
        btn_cancel.setEnabled(true);
        btn_save.setEnabled(true);
        btn_deldocno.setEnabled(true);
        btn_listdocno.setEnabled(true);
        //btn_loadDocno.setEnabled(false);
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
        //lbl2.setText("รับสินค้าจากโรงงาน / การผลิต");
        txt2.setFocusable(false);
        txt2.setText(dateFmtShow.format(new Date()));
        txt2.setBackground(Color.WHITE);
        btnCalendar.setEnabled(false);

//        txt3.setFocusable(false);
//        txt3.setText("");
//        txt3.setBackground(Color.WHITE);
        
        txt4.setFocusable(false);
        txt4.setText("");
        txt4.setBackground(Color.WHITE);
//        btnFactory.setEnabled(false);
//        txt5.setText("");

        txt14.setText("");
        txt15.setText("");
        txt16.setText("");

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
        int[] colSize = {50, 100, 200, 60, 80, 80, 80, 80, 80, 100, 80};
        for (int i = 0; i < colSize.length; i++) {
            column = tblShow.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }
        DefaultTableCellRenderer d;
        TableColumnModel tcm = tblShow.getColumnModel();
        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.RIGHT);
        tcm.getColumn(4).setCellRenderer(d);
        tcm.getColumn(5).setCellRenderer(d);
        tcm.getColumn(6).setCellRenderer(d);
        tcm.getColumn(8).setCellRenderer(d);
        tcm.getColumn(9).setCellRenderer(d);

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.CENTER);
        tcm.getColumn(0).setCellRenderer(d);
        tcm.getColumn(3).setCellRenderer(d);
        tcm.getColumn(7).setCellRenderer(d);

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEFT);
        tcm.getColumn(1).setCellRenderer(d);
        tcm.getColumn(2).setCellRenderer(d);
        tcm.getColumn(10).setCellRenderer(d);
        tcm.getColumn(11).setCellRenderer(d);
        tcm.getColumn(12).setCellRenderer(d);
    }

    private void calculateValues() {
        float ans = Float.parseFloat(PUtility.ConvertReal(txt10.getText().trim())) * Float.parseFloat(PUtility.ConvertReal(txt11.getText().trim()));
        txt12.setValue(ans);
    }

    private Hrecive setHReciveBean() {
        Hrecive row = new Hrecive();
        row.setR_no(txt1.getText());
        try {
            row.setR_date(dateFmtShow.parse(txt2.getText().trim()));
        } catch (ParseException ex) {
            PUtility.ShowError(ex.getMessage());
        }
        row.setR_bran(txt4.getText());
//        row.setR_remark(txt3.getText());
        int total = tblShow.getRowCount();
        if (total == 0) {
            total = 1;
        }
        row.setR_total(total);
        row.setR_user(user);
        row.setR_post("N");
        //update fgordering
        Db_Ordering dbOrder = new Db_Ordering();
        if (!txt16.getText().equals("แสดงรายการเลขที่ใบรับสินค้าทั้งหมด")) {
            if (dbOrder.updateRno(txt1.getText(), txt16.getText().split(","))) {
                row.setDoctype(txt16.getText());
            } else {
                row.setDoctype("");
            }
        } else {
            row.setDoctype("");
        }

        return row;
    }
    //setReciveBean...

    private Recive setReciveBean() {
        Recive row = new Recive();
        row.setR_no(txt1.getText().trim());
        row.setR_que(Integer.parseInt(txt6.getText().trim()));
        row.setR_pcode(txt7.getText().trim());
        row.setR_stock(txt9.getText().trim());
        row.setR_pack(0);
        row.setR_qty(Float.parseFloat(PUtility.ConvertReal(txt10.getText())));
        row.setR_post("N");
        row.setR_unit(txt13.getText().trim());
        row.setR_cost(Float.parseFloat(PUtility.ConvertReal(txt11.getText())));
        row.setR_amount(Float.parseFloat(PUtility.ConvertReal(txt12.getText())));
        row.setR_user(user);
        Calendar now = Calendar.getInstance();
        row.setR_time(DateAndTime.getTimeStringFormat(now));
        row.setR_entrydate(now.getTime());
        row.setR_order("0");
        row.setR_send("0");
        row.getR_pono();
        row.setDt_receive("");

        return row;
    }

    private void insertHeader() {
        try {
            Db_hrecive hr = new Db_hrecive();
            hr.insert(setHReciveBean());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void updateHeader() {
        try {
            Db_hrecive hr = new Db_hrecive();
            hr.update(setHReciveBean());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void insertDetail() {
        try {
            Db_recive hr = new Db_recive();
            hr.insert(setReciveBean());
        } catch (Exception ex) {
        }
    }

    private void insertDetail(Recive row) {
        try {
            Db_recive hr = new Db_recive();
            hr.insert(row);
        } catch (Exception ex) {
        }
    }

    private void updateDetail() {
        try {
            Db_recive hr = new Db_recive();
            hr.update(setReciveBean());
        } catch (Exception ex) {
        }
    }

    private void updateDetail(Recive row) {
        try {
            Db_recive hr = new Db_recive();
            hr.update(row);
        } catch (Exception ex) {
        }
    }

    private boolean checkDocnew() {
        Db_hrecive hr = null;
        try {
            hr = new Db_hrecive();
        } catch (Exception ex) {
            PUtility.ShowError(ex.getMessage());
        }
        if (hr.seek(txt1.getText().trim())) {
            System.out.println("It is not new Doc.");
            return false;
        } else {
            System.out.println("It is new Doc.");
            return true;
        }
    }

    private boolean searchDocF1Dialog() {
        Jdi_browse_hrecive rsd = new Jdi_browse_hrecive(new NimbusFrame(), true);
        rsd.setLocation(btnDocno.getLocationOnScreen());
        rsd.setVisible(true);
        Hrecive hrb = rsd.getDataRecord();
        if (hrb != null) {
            txt1.setText(hrb.getR_no());
            txt1.requestFocus();
            return true;
        } else {
            txt1.requestFocus();
            return false;
        }
    }

    private boolean searchFacF1Dialog() {
        Jdi_show_factory rsd = new Jdi_show_factory(new NimbusFrame(), true);
//        rsd.setLocation(btnFactory.getLocationOnScreen());
        rsd.setVisible(true);

        FactoryBean hrb = rsd.getDataRecord();
        boolean RetVal = false;
        if (hrb != null) {
            txt4.setText(hrb.getFactorycode());
            RetVal = true;
        }
        return RetVal;
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
            return false;
        }
    }
    ////////////////////////////////////////////////////////////////////////////

    /////////////////////////////// Event //////////////////////////////////////
    private void txt1_OnExit() {
        String text = txt1.getText().trim();
        isPost = false;
        isDocnew = checkDocnew();
        //ถ้าเป็นเอกสารใหม่
        if (isDocnew) {
            txt1.setBackground(colorDisable);
            txt1.setFocusable(false);
            txt2.setFocusable(true);
            txt2.requestFocus();
            btnCalendar.setEnabled(true);
            btnDocno.setEnabled(false);
        } //ถ้าเป็นเอกสารเดิม
        else {
            isPost = loadHeader(text);
            txt1.setFocusable(false);
            txt1.setBackground(colorDisable);
            btnDocno.setEnabled(false);
            txt2.setEditable(true);
            txt2.setFocusable(true);
            txt2.setBackground(Color.WHITE);
//            txt3.setEditable(true);
//            txt3.setFocusable(true);
//            txt3.setBackground(Color.WHITE);
            txt2.setBackground(Color.WHITE);
            txt4.setFocusable(false);
            txt4.setBackground(Color.WHITE);
//            btnFactory.setEnabled(false);
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

    private boolean txt2_OnExit() {
        boolean isSave = false;
        String text = txt2.getText().trim();
        if (!text.equals("")) {
            //!
            SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date d = sim.parse(text);
                if (checkDate.validDate(d)) {
                    isSave = true;
//                    txt3.setFocusable(true);
//                    txt3.requestFocus();
                } else {
                    txt2.requestFocus();
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "รูปแบบวันที่ไม่ถูกต้อง ! \n"
                        + "รูปแบบ = (วัน/เดือน/ปี คศ.) (01/01/2000)");
                txt2.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่");
            txt2.requestFocus();
        }
        return isSave;
    }

    private void txt4_OnExit() {
        boolean b = false;
        //try {
        FactoryControl db = new FactoryControl();

        if (!db.seek(txt4.getText().trim())) {
            b = false;
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสโรงงานให้ถูกต้อง");
//            txt5.setText("");
            //lbl2.setText("รับสินค้าจากโรงงาน/การผลิต");
        } else {
            FactoryBean row = db.getRecordAt(txt4.getText().trim());
            txt4.setText(row.getFactorycode());
//            txt5.setText("รับสินค้าจาก " + row.getFactoryname());
            //lbl2.setText("รับสินค้าจาก " + row.getFactoryname());
            b = true;
        }
        if (b) {
            txt6.setFocusable(true);
            txt6.requestFocus();
            txt6.requestFocus();
            return;
        } else {
            txt4.requestFocus();
        }
    }

    private void factoryAuto() {
        FactoryControl db = new FactoryControl();
        FactoryBean row = db.getRecordAt(txt4.getText().trim());
        String faccode = row.getFactoryname();
        if(faccode!=null){
            txt4.setText(row.getFactorycode());
//            txt5.setText("รับสินค้าจาก " + row.getFactoryname());
            //lbl2.setText("รับสินค้าจาก " + row.getFactoryname());
        }
    }

    private void txt7OnExit() {
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
                    b = false;
                } else {
                    if (!db.seek(text, 'Y', 'Y')) {
                        JOptionPane.showMessageDialog(this, "รหัสสินค้านีกำหนดให้ไม่ต้องทำสต็อกสินค้า...");
                        b = false;
                    } else {
                        Product row = db.getRecordAt(text);
                        txt7.setText(row.getPcode());
//                        txt8.setText(row.getPdesc());
                        txt11.setValue(row.getPprice11());
                        txt13.setText(row.getPunit1());

                        b = true;
                    }
                }
            } catch (Exception ex) {
                PUtility.ShowError(ex.getMessage());
                txt7.setText("");
                b = false;
            }
            if (b) {
                txt9.setFocusable(true);
                btnStock.setEnabled(true);
                txt9.requestFocus();
            } else {
                txt7.requestFocus();
                return;
            }
        }
    }
    Db_product pauto = new Db_product();

    private void productAuto() {
        try {
            Product row = pauto.getRecordAt(txt7.getText());
//            txt8.setText(row.getPdesc());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    Db_product dbtxt7 = new Db_product();
    String stock = new Db_company().getCompanyDetail().getPosstock();

    private void txt7_OnExit(String r_no, String text, String qty, int i, String doctype) {
        //ตรวจสอบก่อนว่ามีข้อมูลอยู่แล้วหรือป่าว หากมีอยู่แล้ว ให้เพิ่ม index
        Db_recive r = new Db_recive();
        i += r.getRQue(r_no);
        Object[] data = new Object[13];
        data[0] = i;
        boolean b = false;
        if (!dbtxt7.seek(text, 'Y', 'Y')) {
            JOptionPane.showMessageDialog(this, text + " รหัสสินค้านีกำหนดให้ไม่ต้องทำสต็อกสินค้า...");
            return;
        } else {
            Product row = dbtxt7.getRecordAt(text);
            data[1] = row.getPcode();
            data[2] = row.getPdesc();
            data[3] = stock;
            data[4] = qtyFmt.format(Double.parseDouble("" + qty));//r_order
            data[5] = qtyFmt.format(Double.parseDouble("" + qty));//r_send
            data[6] = qtyFmt.format(Double.parseDouble("" + qty));//r_qty
            data[7] = row.getPunit1();
            //ราคาต่อหน่วย
            data[8] = doubleFmt.format(Double.parseDouble("" + row.getPprice11()));
            //คำนวณจำนวนเงิน
            data[9] = doubleFmt.format(Double.parseDouble(qty) * Double.parseDouble("" + data[8]));
            data[10] = user;
            data[11] = dateFmtShow.format(new Date());
            data[12] = timeFmtShow.format(new Date());

            b = true;
        }
        if (b) {
            Recive row = new Recive();
            row.setR_no(txt1.getText().trim());
            row.setR_que(i);
            row.setR_pcode("" + data[1]);
            row.setR_stock(stock);
            row.setR_pack(0);
            row.setR_qty(Float.parseFloat(PUtility.ConvertReal("" + data[5])));
            row.setR_post("N");
            row.setR_unit("" + data[7]);
            row.setR_cost(Float.parseFloat(PUtility.ConvertReal("" + data[8])));
            row.setR_amount(Float.parseFloat(PUtility.ConvertReal("" + data[9])));
            row.setR_user(user);
            Calendar now = Calendar.getInstance();
            row.setR_time(DateAndTime.getTimeStringFormat(now));
            row.setR_entrydate(now.getTime());
            row.setR_order("" + data[4]);
            row.setR_send("" + data[6]);
            row.getR_pono();
            row.setDt_receive(doctype);

            cmdOk(row);
        }
        //add to model
        model.addRow(data);
    }

    private void txt10_OnExit() {
        if (txt10.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุจำนวนสินค้า");
            txt10.requestFocus();
            return;
        } else {
            double qty = 0.00;
            try {
                qty = Double.parseDouble(txt10.getText());
                if (qty == 0) {
                    JOptionPane.showMessageDialog(this, "ระบุจำนวนสินค้าไม่ถูกต้อง \n"
                            + "จำนวนสินค้าไม่ควรเป็น 0");
                    txt10.requestFocus();
                    return;
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

    private void txt9OnExit() {
        String text = txt9.getText().trim();
        if (text.equals("") || text == null) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสคลัง");
            txt9.requestFocus();
        } else {
            boolean b = false;
            try {
                Db_stockfile db = new Db_stockfile();

                if (!db.seek(text)) {
                    JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสคลังสินค้าให้ถูกต้อง");
                    b = false;
                } else {
                    Stockfile row = db.getRecordAt(text);
                    txt9.setText(row.getStkcode());
                    b = true;
                }
            } catch (SQLException ex) {
                PUtility.ShowError("SQL: " + ex.getMessage());
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
            String sql = "SELECT * from hrecive jeft join "
                    + "factory on r_bran=factorycode where r_no ='" + text + "'";
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            if (!rs.next()) {
                return false;
            }
            txt1.setText(rs.getString("r_no"));
            txt2.setText(dateFmtShow.format(rs.getDate("r_date")));
//            txt3.setText(rs.getString("r_remark"));
            txt4.setText(rs.getString("r_bran"));
//            txt5.setText("รับสินค้าจาก " + rs.getString("factoryname"));
            //lbl2.setText("รับสินค้าจาก " + rs.getString("factoryname"));
            txt16.setText(rs.getString("dt_receive"));
            if (rs.getString("r_post").equals("Y")) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            PUtility.ShowError("SQL: " + ex.getMessage());
            return false;
        }
    }

    private void loadDetail(String text) {
        double amount = 0.0;
        clearModel();
        try {
            String sql = "SELECT r.*, p.pdesc FROM recive r , product p "
                    + "WHERE r.r_pcode=p.pcode AND r.r_no = '" + text + "'";
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            while (rs.next()) {
                Object[] input = {rs.getInt("r_que"),
                    rs.getString("r_pcode"),
                    rs.getString("pdesc"),
                    rs.getString("r_stock"),
                    rs.getString("r_order"),
                    rs.getString("r_send"),
                    rs.getString("r_qty"),
                    rs.getString("r_unit"),
                    rs.getString("r_cost"),
                    rs.getString("r_amount"),
                    rs.getString("r_user"),
                    dateFmtShow.format(rs.getDate("r_entrydate")),
                    rs.getString("r_time")
                };
                amount = amount + rs.getDouble("r_amount");
                model.addRow(input);
            }
            int RowCount = model.getRowCount();
            showCell(RowCount - 1, 0);
        } catch (SQLException ex) {
            PUtility.ShowError("SQL: " + ex.getMessage());
        }
        GetLastQue();
        txt14.setText(tblShow.getRowCount() + " รายการ");
        txt15.setText(doubleFmt.format(amount) + " บาท");
    }

    private void cmdSaveUpdate() {
        //check Values
        if (txt4.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสโรงงานให้ถูกต้อง");
            txt4.requestFocus();
        } else {
            FactoryControl fac = new FactoryControl();
            if (!fac.seek(txt4.getText().trim())) {
                JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสโรงงานให้ถูกต้อง");
                txt4.setText("");
                txt4.requestFocus();
                return;
            }

            Db_hrecive db = null;
            try {
                db = new Db_hrecive();
            } catch (Exception ex) {
                PUtility.ShowError(ex.getMessage());
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
        String sql = "SELECT * FROM hrecive "
                + "where r_no ='" + text + "' AND " + "r_post = 'N'";
        String sql2 = "SELECT * FROM hrecive "
                + "where r_no ='" + text + "' AND " + "r_post = 'Y'";
        boolean b;
        ResultSet rs = null;
        ResultSet rs2 = null;
        try {
            rs = MySQLConnect.con.createStatement().executeQuery(sql);
            rs2 = MySQLConnect.con.createStatement().executeQuery(sql2);
            if (rs2.next()) {
                JOptionPane.showMessageDialog(this, "เอกสารฉบับนี้ถูก Post ตัดสต็อกไปแล้วไม่สามารถลบข้อมูลได้ \n"
                        + "กรุณาตรวจสอบ");
                txt1.requestFocus();
                return;
            }
            try {
                if (!rs.next()) {
                    b = false;
                } else {
                    b = true;
                }
            } catch (SQLException ex) {
                PUtility.ShowError(ex.getMessage());
                b = false;
            }

            if (b) {
                int a = JOptionPane.showConfirmDialog(this, "คุณต้องการลบเอกสารเลขที่ " + text + " ใช่หรือไม่ ?");
                if (a != JOptionPane.YES_OPTION) {
                    txt1.requestFocus();
                    return;
                }
                sql = "DELETE FROM hrecive where r_no='" + text + "'";
                int result = MySQLConnect.con.createStatement().executeUpdate(sql);
                System.out.println(sql);
                System.out.println("Result = " + result);

                sql = "DELETE FROM recive where r_no='" + text + "'";
                result = MySQLConnect.con.createStatement().executeUpdate(sql);
                System.out.println(sql);
                System.out.println("Result = " + result);

                //set flag FG
                Db_Ordering dbSeek = new Db_Ordering();
                if (dbSeek.seek_FGDatabase()) {
                    dd.enableFlag(text, "N");
                }
                addNewDoc();
            } else {
                JOptionPane.showMessageDialog(this, "ไม่สามารถลบเอกสารเลขที่ " + text + "\n"
                        + " นี้ได้เนื่องจากไม่พบเลขที่เอกสารนี้ในฐานข้อมูล");
                txt1.requestFocus();
            }
        } catch (SQLException ex) {
            PUtility.ShowError(ex.getMessage());
        }
    }

    private void cmdOrderShow() {
        Jdi_report_recive dialog = new Jdi_report_recive(new NimbusFrame(), true);
        dialog.setVisible(true);
        if (!PublicVar.ReturnString.equals("")) {
            txt1.setText(PublicVar.ReturnString);
            txt1_OnExit();
        } else {
            txt1.requestFocus();
        }
    }

    private void cmdPrintOrder() {
        if (!txt1.getText().equals("")) {
            ViewReport vp = new ViewReport();
            vp.printReportReceive(txt1.getText());
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
            //try {
            FactoryControl db = new FactoryControl();
            String text = txt4.getText().trim();
            if (!db.seek(text)) {
                JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสโรงงานให้ถูกต้อง");
                txt4.requestFocus();
                return;
            }
            try {
                Db_product db2 = new Db_product();
                String text2 = txt7.getText().trim();
                if (!db2.seek(text2)) {
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
                Db_stockfile db2 = new Db_stockfile();
                String text2 = txt9.getText().trim();
                if (!db2.seek(text2)) {
                    JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสคลังสินค้าให้ถูกต้อง");
                    txt9.requestFocus();
                    return;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "กรุณาใส่รหัสคลังสินค้าให้ถูกต้อง");
                txt9.requestFocus();
                return;
            }
            isDocnew = checkDocnew();
            if (isDocnew) {
                insertHeader();
            } else {
                updateHeader();
            }
            if (SeekTransection()) {
                updateDetail();
            } else {
                insertDetail();
            }
            loadDetail(txt1.getText());
            calculateValues();
            addNewItem();
            txt4.setFocusable(false);
            txt4.setBackground(colorDisable);
//            btnFactory.setEnabled(false);
            txt6.setFocusable(true);
            txt6.requestFocus();
        }
    }

    private void cmdOk(Recive row) {
        if (SeekTransection("" + row.getR_que())) {
            updateDetail(row);
        } else {
            insertDetail(row);
        }
    }

    private void cmdDelete() {
        if (txt1.getText().trim().equals("")) {
            txt1.requestFocus();
            return;
        }

        int quedelete = Integer.parseInt(txt6.getText().trim());

        String r_no = txt1.getText().trim();
        try {
            Db_recive db = new Db_recive();
            if (db.delete(r_no, quedelete)) {
                loadDetail(txt1.getText());
                addNewItem();
                txt6.setFocusable(true);
                txt6.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "ไม่สามารถลบข้อมูลได้ กรุณาตรวจสอบความถูกต้องของการเลือกข้อมูลที่นำมาลบ");
            }
        } catch (Exception ex) {
            PUtility.ShowError(ex.getMessage());
            addNewItem();
            txt6.setFocusable(true);
            txt6.requestFocus();
        }
    }

    private void cmdDateChoose1() {
        utilities.DateChooser.DateChooserDialog dcd =
                new utilities.DateChooser.DateChooserDialog(null, true, btnCalendar.getLocationOnScreen());
        dcd.setVisible(true);
        txt2.setText(dateFmtShow.format(dcd.getSelectedDate().getTime()));
        txt2.requestFocus();
    }

    public void showCell(int row, int column) {
        Rectangle rect = tblShow.getCellRect(row, column, true);
        tblShow.scrollRectToVisible(rect);
        tblShow.clearSelection();
        if (row != -1) {
            tblShow.setRowSelectionInterval(row, row);
        }
    }

    private void cmdReportByCode() {
        new Jdi_report_sumRecivePLU(new NimbusFrame(), true).setVisible(true);
    }

    private void cmdReportByGroup() {
        new Jdi_report_sumReciveGroup(new NimbusFrame(), true).setVisible(true);
    }

    //////////////////////////// CheckFocus ////////////////////////////////////
    private void escapeEvent(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
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

//        txt8.setText("");

        txt9.setText("");
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

    void setActive(boolean active, Color color) {
        txt1.setBackground(color);
        txt2.setBackground(color);
//        txt3.setBackground(color);
        txt4.setBackground(color);
        txt6.setBackground(color);
        txt7.setBackground(color);
        txt9.setBackground(color);
        txt10.setBackground(color);
        txt1.setFocusable(active);
        txt2.setFocusable(active);
//        txt3.setFocusable(active);
        txt4.setFocusable(active);
        txt6.setFocusable(active);
        txt7.setFocusable(active);
        txt9.setFocusable(active);
        txt10.setFocusable(active);

        btnDocno.setEnabled(active);
        btnCalendar.setEnabled(active);
//        btnFactory.setEnabled(active);
        btnProduct.setEnabled(active);
        btnStock.setEnabled(active);
        btnAddItem.setEnabled(active);
        btnDelItem.setEnabled(active);
        btnAddItem.setFocusable(active);
        btn_save.setEnabled(active);
        btn_deldocno.setEnabled(active);
    }

    private void setReadOnly() {
        setActive(false, colorDisable);
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
            String SqlQuery = "update recive set r_post='Y' "
                    + "where r_no='" + TDoc + "' "
                    + "and r_que=" + TQue;
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    public void UpdateHeader(String TDoc, String user) {
        SimpleDateFormat SqlDateFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat FullTimeFmt = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        Date date = new Date();
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "update hrecive set r_post='Y',r_userpost='" + user + "',"
                    + "r_postdate='" + SqlDateFmt.format(date) + "',"
                    + "r_posttime='" + FullTimeFmt.format(date) + "' "
                    + "where r_no='" + TDoc + "'";
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private void PostStock(String doc) {
        if (isPost) {
            return;
        }
        if (ChkPasswordPost()) {
            String TDoc = doc;
            int totalRec = 0;
            int CurRec = 0;
            try {
                Statement stmt = (Statement) MySQLConnect.con.createStatement();
                String SQLQuery = "select recive.r_no,r_date,r_que,r_pcode,"
                        + "r_stock,r_qty,r_amount,recive.r_post "
                        + "from recive left join hrecive on recive.r_no=hrecive.r_no "
                        + "where recive.r_no='" + TDoc + "' ";
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
                        String T_Rem = "REC";
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
                JOptionPane.showMessageDialog(this, "จบการ POST สต็อกสินค้า เอกสารหมายเลข " + TDoc
                        + " จำนวน " + totalRec + " รายการ...");
                addNewDoc();
            }

        } else {
            JOptionPane.showMessageDialog(this, "รหัสพนักงานนี้ไม่สามารถ POST สต็อกสินค้าได้...");
        }
    }

    /////////////////////////Add on 08/07/2009 //////////////////////////
    private void GetLastQue() {
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select *from recive where r_no='" + txt1.getText() + "' order by r_que";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.last();
            if (rec.getRow() == 0) {
                txt6.setText("1");
                txt9.setText("");
            } else {
                DecimalFormat IntegerFmt = new DecimalFormat("####0");
                int que1 = rec.getInt("r_que") + 1;
                txt6.setText(IntegerFmt.format(que1));
                txt9.setText(rec.getString("r_stock"));
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            PUtility.ShowError(e.getMessage());
        }
    }

    private void GetDataRecord(int que) {
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select * from recive left join product on pcode=r_pcode "
                    + "where (r_no='" + txt1.getText() + "') and (r_que=" + que + ")";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.last();
            if (rec.getRow() == 0) {
                txt6.setText(integerFmt.format(que));
                txt7.setText("");
//                txt8.setText("");
                txt10.setText("0.000");
                txt11.setText("0.00");
                txt12.setText("0.00");
                txt13.setText("");
            } else {
                txt6.setText(integerFmt.format(que));
                txt7.setText(rec.getString("r_pcode"));
//                txt8.setText(rec.getString("pdesc"));
                txt9.setText(rec.getString("r_stock"));
                txt10.setText(qtyFmt.format(rec.getDouble("r_qty")));
                txt11.setText(doubleFmt.format(rec.getDouble("r_cost")));
                txt12.setText(doubleFmt.format(rec.getDouble("r_amount")));
                txt13.setText(rec.getString("punit1"));
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            PUtility.ShowError(e.getMessage());
        }
    }

    private Boolean SeekTransection() {
        boolean RetVal = false;
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select * from recive where (r_no='" + txt1.getText() + "') and (r_que=" + txt6.getText() + ")";
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

    private Boolean SeekTransection(String i) {
        boolean RetVal = false;
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select * from recive where (r_no='" + txt1.getText() + "') "
                    + "and (r_que=" + i + ")";
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
        }
        return RetVal;
    }

    private void txt6_OnExit() {
        GetDataRecord(Integer.parseInt(txt6.getText()));
    }
}
