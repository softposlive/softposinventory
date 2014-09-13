package program;

import Main.browser.Jdi_show_stockfile;
import Bean.Company;
import DBcontrol.Db_company;
import DBcontrol.Db_stockfile;
import DBcontrol.MySQLConnect;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.awt.Point;
import java.util.Date;
import java.util.Locale;

public class jdi_comanysetup extends javax.swing.JDialog {

    DecimalFormat doubleFmt = new DecimalFormat("##,###,##0.00");
    SimpleDateFormat dateFmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    SimpleDateFormat dateFmt1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    private int statusMode = 0;
    private Company bean;

    public jdi_comanysetup(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        getDataToForm();
        if (code.getText().length() < 5) {
            code.requestFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_cancle = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        subprovince = new javax.swing.JTextField();
        province = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        fax = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        post = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        tax = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btn_Calendar = new javax.swing.JButton();
        accterm = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        pos = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        stockName = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        cb_minchk = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        menu_Cancle3 = new javax.swing.JMenuItem();
        menu_Save3 = new javax.swing.JMenuItem();
        menu_exit3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("กำหนดรายละเอียดข้อมูลบริษัท (Company Setup)");
        setBackground(new java.awt.Color(236, 236, 236));
        setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_cancle.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn_cancle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancle.gif"))); // NOI18N
        btn_cancle.setText("ยกเลิก");
        btn_cancle.setToolTipText("ยกเลิก");
        btn_cancle.setRequestFocusEnabled(false);
        btn_cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancleActionPerformed(evt);
            }
        });
        btn_cancle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_cancleFocusGained(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.gif"))); // NOI18N
        btn_save.setText("บันทึกข้อมูล");
        btn_save.setToolTipText("บันทึกข้อมูล/แก้ไขข้อมูล");
        btn_save.setRequestFocusEnabled(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.gif"))); // NOI18N
        btn_exit.setText("Exit");
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
                .addComponent(btn_cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 673, Short.MAX_VALUE)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_cancle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray, 5));

        jPanel8.setBackground(new java.awt.Color(234, 230, 237));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel11.setText("เบอร์โทรศัพท์");

        jLabel6.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel6.setText("เขต/อำเภอ");

        jLabel12.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel12.setText("เบอร์โทรสาร");

        code.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codeKeyReleased(evt);
            }
        });

        name.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel1.setText("รหัสบริษัท (Code)");

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("ชื่อร้าน / บริษัท");

        jLabel17.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel17.setText("ที่อยู่เลขที่");

        jLabel5.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel5.setText("ตำบล/แขวง");

        jLabel8.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel8.setText("จังหวัด");

        no.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                noKeyReleased(evt);
            }
        });

        subprovince.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        subprovince.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subprovinceKeyReleased(evt);
            }
        });

        province.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        province.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                provinceKeyReleased(evt);
            }
        });

        city.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        city.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cityKeyReleased(evt);
            }
        });

        tel.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telKeyReleased(evt);
            }
        });

        fax.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        fax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                faxKeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel18.setText("รหัสไปรษณีย์");

        post.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        post.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                postKeyReleased(evt);
            }
        });

        email.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel28.setText("อีเมล์");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel17)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(subprovince, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fax, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGap(6, 6, 6))))
                .addGap(115, 115, 115))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel17)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subprovince, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fax, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(10, 10, 10))
        );

        jPanel7.setBackground(new java.awt.Color(234, 230, 237));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel19.setText("เลขประจำตัวผู้เสียภาษี");

        tax.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                taxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel19)
                    .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel21.setText("วันที่ต้นงวดบัญชี");

        btn_Calendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btn_Calendar.setEnabled(false);
        btn_Calendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CalendarMouseClicked(evt);
            }
        });
        btn_Calendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalendarActionPerformed(evt);
            }
        });

        accterm.setEditable(false);
        accterm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                acctermFocusGained(evt);
            }
        });
        accterm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acctermKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accterm, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel21)
                    .addComponent(accterm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Calendar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel20.setText("การตัดสต็อกสินค้าจากเครื่อง POS ให้ตัดที่คลัง");

        pos.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        pos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                posKeyPressed(evt);
            }
        });

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying glass.jpg"))); // NOI18N
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        stockName.setEditable(false);
        stockName.setBackground(new java.awt.Color(254, 254, 230));
        stockName.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        stockName.setForeground(new java.awt.Color(253, 60, 30));
        stockName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockNameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stockName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind)
                    .addComponent(stockName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, 0, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(234, 230, 237));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel22.setText("ตรวจสอบสินค้าคงเหลือก่อนทำรายการหรือไม่");

        cb_minchk.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        cb_minchk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N" }));

        jLabel23.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel23.setText("ํY = ต้องการให้ตรวจสอบ, N = ไม่ต้องการตรวจสอบ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_minchk, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cb_minchk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, 0, 743, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jMenu10.setText("ฟังก์ชัน (Function)");
        jMenu10.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N

        menu_Cancle3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menu_Cancle3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menu_Cancle3.setText("ยกเลิก (Cancle)");
        menu_Cancle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CancleActionPerformed(evt);
            }
        });
        jMenu10.add(menu_Cancle3);

        menu_Save3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menu_Save3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menu_Save3.setText("บันทึก (Save)");
        menu_Save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_SaveActionPerformed(evt);
            }
        });
        jMenu10.add(menu_Save3);

        menu_exit3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menu_exit3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menu_exit3.setText("ออกจากระบบ");
        menu_exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        jMenu10.add(menu_exit3);

        jMenuBar4.add(jMenu10);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1024, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void menu_CancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CancleActionPerformed
// TODO add your handling code here:
    clearForm();
}//GEN-LAST:event_menu_CancleActionPerformed

private void menu_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_SaveActionPerformed
// TODO add your handling code here:
    btn_saveActionPerformed(evt);
}//GEN-LAST:event_menu_SaveActionPerformed

private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_menu_exitActionPerformed

private void codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyReleased

    String branchCodeValue = code.getText();
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        name.requestFocus();
    }

}//GEN-LAST:event_codeKeyReleased

private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
// TODO add your handling code here:
    String branchCodeValue = code.getText().trim();
    String name = this.name.getText().trim();
    if (name.equals("")) {
        if (branchCodeValue.length() == 3) {
            //getDataToForm(branchCodeValue);
        }
    }

}//GEN-LAST:event_nameMouseClicked

private void noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        subprovince.requestFocus();
    }
}//GEN-LAST:event_noKeyReleased

private void subprovinceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subprovinceKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        province.requestFocus();
    }
}//GEN-LAST:event_subprovinceKeyReleased

private void provinceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_provinceKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        city.requestFocus();
    }

}//GEN-LAST:event_provinceKeyReleased

private void cityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        post.requestFocus();
    }
}//GEN-LAST:event_cityKeyReleased

private void telKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        fax.requestFocus();
    }
}//GEN-LAST:event_telKeyReleased

private void faxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_faxKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        email.requestFocus();
    }
}//GEN-LAST:event_faxKeyReleased

private void postKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_postKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        tel.requestFocus();
    }
}//GEN-LAST:event_postKeyReleased

private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        tax.requestFocus();
    }
}//GEN-LAST:event_emailKeyReleased

private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_btn_exitActionPerformed

private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
// TODO add your handling code here:

    if (code.getText().trim().length() > 3 || code.getText().trim().length() < 3) {
        JOptionPane.showMessageDialog(this, "รหัสสาขาไม่ถูกต้อง กรุณาระบุรหัสสาขาจำนวน 3 หลัก", "Mycps", JOptionPane.WARNING_MESSAGE);
        code.requestFocus();
    } else if (name.getText().trim().equals("")) {
        JOptionPane.showMessageDialog(this, "กรุณาระบุชื่อชื่อสาขา", "Mycps", JOptionPane.WARNING_MESSAGE);
        name.requestFocus();
    } else if ((post.getText().trim().length() > 1) && (post.getText().trim().length() != 5)) {
        JOptionPane.showMessageDialog(this, "รหัสไปรษณีย์ไม่ถูกต้อง", "Mycps", JOptionPane.WARNING_MESSAGE);
        post.requestFocus();

    } else {

        Company company = new Company();
        company.setCode(code.getText());
        company.setName(name.getText());
        company.setAdress(no.getText());
        company.setSubprovince(subprovince.getText());
        company.setProvince(province.getText());
        company.setCity(city.getText());
        company.setPost(post.getText());
        company.setTel(tel.getText());
        company.setFax(fax.getText());
        company.setTax(tax.getText());
        company.setEmail(email.getText());
        company.setAccterm(accterm.getText());
        company.setPosstock(pos.getText());
        company.setMinchk(""+cb_minchk.getSelectedItem());

        Db_company dc = new Db_company();
        if (dc.insertCompany(company, statusMode)) {
            if (statusMode == 0) {
                JOptionPane.showMessageDialog(this, "ระบบบันทึกข้อมูลบริษัทแล้ว");
            } else {
                JOptionPane.showMessageDialog(this, "ระบบแก้ไขข้อมูลบริษัทแล้ว");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ระบบบันทึกข้อมูลบริษัท error");
        }
    }
}//GEN-LAST:event_btn_saveActionPerformed

private void btn_cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancleActionPerformed
// TODO add your handling code here:
    if (statusMode == 0) {
        clearForm();
    } else {
        stockName.setText(stockName.getText());
        code.setText(bean.getCode());
        name.setText(bean.getName());
        no.setText(bean.getAdress());
        subprovince.setText(bean.getSubprovince());
        province.setText(bean.getProvince());
        city.setText(bean.getCity());
        post.setText(bean.getPost());
        tel.setText(bean.getTel());
        fax.setText(bean.getFax());
        tax.setText(bean.getTax());
        email.setText(bean.getEmail());
        // accterm.setSelectedIndex(0);
        pos.setText(bean.getPosstock());
        statusMode = 1;
    }
}//GEN-LAST:event_btn_cancleActionPerformed

private void stockNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockNameKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        code.requestFocus();
    }
}//GEN-LAST:event_stockNameKeyReleased

private void btn_cancleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_cancleFocusGained
// TODO add your handling code here:
}//GEN-LAST:event_btn_cancleFocusGained

private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
// TODO add your handling code here:
    escExit(evt);

}//GEN-LAST:event_formKeyReleased

private void btn_CalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CalendarMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_btn_CalendarMouseClicked

private void btn_CalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalendarActionPerformed
// TODO add your handling code here:

    Point point = btn_Calendar.getLocation();
    point.setLocation(point.getX() + 1, point.getY() + 1);
    utilities.DateChooser.DateChooserDialog dcd = new utilities.DateChooser.DateChooserDialog(null,true,point);
    dcd.setVisible(true);
    accterm.setText(dateFmt.format(dcd.getSelectedDate().getTime()));

}//GEN-LAST:event_btn_CalendarActionPerformed

private void acctermFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_acctermFocusGained
// TODO add your handling code here:
    accterm.selectAll();
}//GEN-LAST:event_acctermFocusGained

private void acctermKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acctermKeyPressed
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_F1) {
        btn_CalendarActionPerformed(null);
    } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        code.requestFocus();
    }
}//GEN-LAST:event_acctermKeyPressed

private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        no.requestFocus();
    }
}//GEN-LAST:event_nameKeyReleased

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    code.requestFocus();
}//GEN-LAST:event_formWindowActivated

private void taxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taxKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        pos.requestFocus();
    }
}//GEN-LAST:event_taxKeyReleased

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        Jdi_show_stockfile stock = new Jdi_show_stockfile(new Frame(), true);
        stock.setVisible(true);
        Bean.Stockfile dbean = stock.getDataRecord();
        if(dbean!=null){
            stockName.setText(dbean.getStkname());
            pos.setText(dbean.getStkcode());
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void posKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_posKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            code.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_F1) {
            btnFindActionPerformed(null);
        } else {
            String stkcode = pos.getText();
            if (!stkcode.trim().equals("")) {
                Bean.Stockfile bean = new Bean.Stockfile();
                bean.setStkcode(stkcode);
                try {
                    Db_stockfile stk = new Db_stockfile();
                    bean = stk.getRecordAt(stkcode);
                    if (bean != null) {
                        stockName.setText(bean.getStkname());
                    }
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_posKeyPressed
    private void escExit(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }

    public void clearForm() {
        code.setText("");
        name.setText("");
        no.setText("");
        subprovince.setText("");
        province.setText("");
        city.setText("");
        post.setText("");
        tel.setText("");
        fax.setText("");
        tax.setText("");
        email.setText("");
       // accterm.setSelectedIndex(0);
        pos.setText("");
    }

    void getDataToForm() {
        Db_company company = new Db_company();
        bean = (Company) company.getCompanyDetail();
        if (bean == null) {
            JOptionPane.showMessageDialog(this, "ยังไม่มีข้อมูลบริษัท");
        } else {
            try {
                Db_stockfile stk = new Db_stockfile();
                Bean.Stockfile stkbean = stk.getRecordAt(bean.getPosstock());
                stockName.setText(stkbean.getStkname());
            } catch (Exception e) {
            }
            code.setText(bean.getCode());
            name.setText(bean.getName());
            no.setText(bean.getAdress());
            subprovince.setText(bean.getSubprovince());
            province.setText(bean.getProvince());
            city.setText(bean.getCity());
            post.setText(bean.getPost());
            tel.setText(bean.getTel());
            fax.setText(bean.getFax());
            tax.setText(bean.getTax());
            email.setText(bean.getEmail());
            //accterm.setText(dateFmt1.format(bean.getAccterm()));
            try {
                Date date = dateFmt1.parse(bean.getAccterm()); 
                accterm.setText(dateFmt.format(date));
                accterm.setEditable(false);             
            } catch (Exception e) {
                e.printStackTrace();
            }           
          
            pos.setText(bean.getPosstock());
            cb_minchk.setSelectedItem(bean.getMinchk());
            statusMode = 1;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new MySQLConnect();
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                jdi_comanysetup dialog = new jdi_comanysetup(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField accterm;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btn_Calendar;
    private javax.swing.JButton btn_cancle;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox cb_minchk;
    private javax.swing.JTextField city;
    private javax.swing.JTextField code;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JMenuItem menu_Cancle3;
    private javax.swing.JMenuItem menu_Save3;
    private javax.swing.JMenuItem menu_exit3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField no;
    private javax.swing.JTextField pos;
    private javax.swing.JTextField post;
    private javax.swing.JTextField province;
    private javax.swing.JTextField stockName;
    private javax.swing.JTextField subprovince;
    private javax.swing.JTextField tax;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
