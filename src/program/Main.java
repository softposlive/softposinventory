package program;

import Main.browser.SaveCostDialog;
import Main.viewreport.Jdi_report_adjstockGroup;
import Main.viewreport.Jdi_report_tranin;
import Main.viewreport.Jdi_report_recive;
import Main.viewreport.Jdi_report_stockcard_all;
import Main.viewreport.Jdi_report_charge;
import Main.viewreport.Jdi_report_stockmovement;
import Main.viewreport.Jdi_report_tranout;
import Main.viewreport.Jdi_report_stockinhand;
import Main.viewreport.Jdi_report_prolost;
import Main.viewreport.Jdi_report_sumChargeGroup;
import Main.viewreport.Jdi_report_sumChargePLU;
import Main.viewreport.Jdi_report_sumProlostGroup;
import Main.viewreport.Jdi_report_sumProlostPLU;
import Main.viewreport.Jdi_report_sumReciveGroup;
import Main.viewreport.Jdi_report_sumRecivePLU;
import Main.viewreport.Jdi_report_sumTraninGroup;
import Main.viewreport.Jdi_report_sumTraninPLU;
import Main.viewreport.Jdi_report_sumTranoutGroup;
import Main.viewreport.Jdi_report_sumTranoutPLU;
import Main.viewreport.Report_In;
import Main.viewreport.Report_InGroup;
import Main.viewreport.Report_Profit;
import Main.viewreport.Report_Profit_Id;
import Main.viewreport.Report_Profit_Poss;
import Main.viewreport.Report_Vat;
import Main.viewreport.Report_VatS;
import Main.viewreport.View_BProduct_Group;
import Main.viewreport.View_Bproduct;
import Main.viewreport.View_Bproduct_PLU;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import report.ViewReport;
import utilities.NimbusFrame;

public class Main extends javax.swing.JFrame {

    UserRecord Inv_UserRec = new UserRecord();
    public static boolean ChangeInventoryDate = true;

    public Main() {
        LoadLoginForm();
        initComponents();
        String TempStr = Inv_UserRec.UserCode + " " + Inv_UserRec.UserName + "  (" + Inv_UserRec.LoginTime + ")";
        txtUser.setText(TempStr);
        PublicVar.TempUser = Inv_UserRec;
    }

    public void LoadLoginForm() {
        this.setVisible(false);
        LoginDialog frm = new LoginDialog(this, true);
        frm.setVisible(true);
        this.setVisible(true);
        String User = frm.getLoinUser();
        Inv_UserRec.GetUserAction(User);
    }

    public void ShowUserError() {
        JOptionPane.showMessageDialog(this, "พนักงานรหัสนี้ ไม่สามารถเข้าทำงานรายการนี้ได้...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        menu_tranout = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JSeparator();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JSeparator();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem63 = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JSeparator();
        jMenu23 = new javax.swing.JMenu();
        jMenuItem76 = new javax.swing.JMenuItem();
        jMenuItem64 = new javax.swing.JMenuItem();
        jMenuItem77 = new javax.swing.JMenuItem();
        jMenu24 = new javax.swing.JMenu();
        jMenuItem79 = new javax.swing.JMenuItem();
        jMenuItem80 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem65 = new javax.swing.JMenuItem();
        jMenuItem59 = new javax.swing.JMenuItem();
        jMenuItem60 = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem58 = new javax.swing.JMenuItem();
        jMenuItem66 = new javax.swing.JMenuItem();
        jMenuItem67 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenuItem68 = new javax.swing.JMenuItem();
        jMenuItem69 = new javax.swing.JMenuItem();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenuItem70 = new javax.swing.JMenuItem();
        jMenuItem71 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem72 = new javax.swing.JMenuItem();
        jMenuItem73 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem43 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JSeparator();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JSeparator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem61 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem51 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftPOS for Inventory version 0.1");

        jPanel1.setBackground(new java.awt.Color(230, 221, 221));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 15, true));
        jPanel1.setForeground(new java.awt.Color(98, 18, 18));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(245, 247, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(192, 7, 18));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ระบบจัดการคลังสินค้า (Stock Control)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ผู้ใช้งาน (User)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Copyright @2014 SoftPOS Co,.LTD All Right Reserved");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Register To : SoftPOS Co,LTD. (02-8013843-6)");

        txtUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUser.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(41, 41, 41))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 480, 190));

        jMenuBar3.setFocusCycleRoot(true);

        jMenu11.setText("ระบบคลังสินค้า (Inventory)");
        jMenu11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem35.setText("รับโอนสินค้าจากโรงงาน/การผลิต");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem35);

        jMenuItem36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem36.setText("รับโอนสินค้าเข้า");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem36);

        menu_tranout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        menu_tranout.setText("โอนสินค้าออก");
        menu_tranout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_tranoutActionPerformed(evt);
            }
        });
        jMenu11.add(menu_tranout);

        jMenuItem38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem38.setText("บันทึกรายการของเสีย & ชำรุด");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem38);

        jMenuItem39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem39.setText("บันทึกรายการแจกฟรี");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem39);

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setText("โอนสินค้าระหว่างคลัง (Stock)");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem1);
        jMenu11.add(jSeparator11);

        jMenuItem40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem40.setText("แฟ้มข้อมูลสินค้า (PLU Setup)");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem40);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem2.setText("แฟ้มข้อมูลวัตถุดิบ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem2);
        jMenu11.add(jSeparator12);

        jMenuItem41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem41.setText("รายการตรวจนับสินค้าสต็อกสินค้า");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem41);

        jMenuItem42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem42.setText("พิมพ์ใบรายการสำหรับตรวจนับสินค้า");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem42);
        jMenu11.add(jSeparator6);

        jMenuItem16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem16.setText("ระบบการสั่งสินค้า e-Ordering");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem16);

        jMenuBar3.add(jMenu11);

        jMenu1.setText("ระบบการซื้อสินค้า/ค่าใช้จ่าย");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem3.setText("ซื้อสินค้า/ใบแจ้งหนี้/ใบกำกับภาษี");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed1(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem4.setText("บันทึกค่าใช้จ่ายอื่นๆ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed1(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem5.setText("ใบลดหนี้ & ส่งคืนสินค้า");
        jMenu1.add(jMenuItem5);
        jMenu1.add(jSeparator1);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem6.setText("แฟ้มข้อมูลผู้ขาย & เจ้าหนี้");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem7.setText("แฟ้มข้อมูลค่าใช้จ่ายอื่นๆ");
        jMenu1.add(jMenuItem7);

        jMenuBar3.add(jMenu1);

        jMenu12.setText("รายงานต่าง ๆ");
        jMenu12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem52.setText("บัญชีคุมสินค้าพิเศษ (Stock Card)");
        jMenuItem52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem52ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem52);

        jMenuItem53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem53.setText("รายงานสินค้าคงเหลือ (Stock Inhand)");
        jMenuItem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem53ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem53);

        jMenuItem54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem54.setText("รายงานความเคลื่อนไหวสินค้า (Stock Movement)");
        jMenuItem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem54ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem54);

        jMenuItem63.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem63.setText("รายงานสินค้าที่ไม่เคลื่อนไหว (Non Movement)");
        jMenuItem63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem63ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem63);
        jMenu12.add(jSeparator16);

        jMenu23.setText("รายงานการซื้อสินค้า");
        jMenu23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem76.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem76.setText("แสดงรายการซื้อสินค้า (ตามเอกสารการซื้อ)");
        jMenuItem76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem76ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem76);

        jMenuItem64.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem64.setText("สรุปการซื้อสินค้าตามรหัสสินค้า (PLU Code)");
        jMenuItem64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem64ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem64);

        jMenuItem77.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem77.setText("สรุปการซื้อสินค้าตามกลุ่มสินค้า (Group)");
        jMenuItem77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem77ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem77);

        jMenu12.add(jMenu23);

        jMenu24.setText("รายงานการบันทึกค่าใช้จ่าย");
        jMenu24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem79.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem79.setText("แสดงรายการการบันทึกค่าใช้จ่าย (Voucher)");
        jMenuItem79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem79ActionPerformed(evt);
            }
        });
        jMenu24.add(jMenuItem79);

        jMenuItem80.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem80.setText("สรุปรายการค่าใช้จ่าย (ตามรหัสค่าใช้จ่าย)");
        jMenuItem80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem80ActionPerformed(evt);
            }
        });
        jMenu24.add(jMenuItem80);

        jMenu12.add(jMenu24);
        jMenu12.add(jSeparator4);

        jMenu16.setText("รายงานแสดงการรับสินค้าจากโรงงาน");
        jMenu16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem65.setText("แสดงรายการใบรับสินค้าจากโรงงาน");
        jMenuItem65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem65ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem65);

        jMenuItem59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem59.setText("สรุปรายงานการรับสินค้าจากโรงงานตามรหัสสินค้า (PLU)");
        jMenuItem59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem59ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem59);

        jMenuItem60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem60.setText("สรุปรายงานการรับสินค้าจากโรงงานตามแผนกสินค้า (Dept)");
        jMenuItem60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem60ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem60);

        jMenu12.add(jMenu16);

        jMenu17.setText("รายงานการรับใบโอนสินค้า (เข้า)");
        jMenu17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem58.setText("แสดงรายการโอนสินค้า (เข้า)");
        jMenuItem58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem58ActionPerformed(evt);
            }
        });
        jMenu17.add(jMenuItem58);

        jMenuItem66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem66.setText("สรุปรายการรับโอนสินค้า(เข้า)ตามรหัสสินค้า (PLU)");
        jMenuItem66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem66ActionPerformed(evt);
            }
        });
        jMenu17.add(jMenuItem66);

        jMenuItem67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem67.setText("สรุปรายการรับโอนสินค้า(เข้า)ตามแผนกสินค้า(Dept)");
        jMenuItem67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem67ActionPerformed(evt);
            }
        });
        jMenu17.add(jMenuItem67);

        jMenu12.add(jMenu17);

        jMenu18.setText("รายงานการจ่ายโอนสินค้า (ออก)");
        jMenu18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem57.setText("แสดงรายการใบโอนสินค้า (ออก)");
        jMenuItem57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem57ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem57);

        jMenuItem68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem68.setText("สรุปรายการโอนสินค้า(ออก)ตามรหัสสินค้า (PLU)");
        jMenuItem68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem68ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem68);

        jMenuItem69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem69.setText("สรุปรายการโอนสินค้า(ออก)ตามแผนกสินค้า(Dept)");
        jMenuItem69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem69ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem69);

        jMenu12.add(jMenu18);

        jMenu19.setText("รายงานการบันทึกรายการของเสีย");
        jMenu19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem56.setText("แสดงรายการใบบันทึกรายการของเสีย");
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem56);

        jMenuItem70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem70.setText("สรุปรายการบันทึกของเสียตามรหัสสินค้า(PLU)");
        jMenuItem70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem70ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem70);

        jMenuItem71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem71.setText("สรุปรายการบันทึกของเสียตามแผนกสินค้า(Dept)");
        jMenuItem71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem71ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem71);

        jMenu12.add(jMenu19);

        jMenu20.setText("รายงานการบันทึกรายการแจกฟรี (Charge)");
        jMenu20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem55.setText("แสดงรายการใบบันทึกรายการแจกฟรี (Charge)");
        jMenuItem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem55ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem55);

        jMenuItem72.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem72.setText("สรุปรายการแจกฟรี(Charge)ตามรหัสสินค้า(PLU)");
        jMenuItem72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem72ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem72);

        jMenuItem73.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem73.setText("สรุปรายการแจกฟรี(Charge)ตามแผนกสินค้า(Dept)");
        jMenuItem73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem73ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem73);

        jMenu12.add(jMenu20);
        jMenu12.add(jSeparator2);

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem8.setText("รายงานการใช้วัตถุดิบ");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed1(evt);
            }
        });
        jMenu12.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem9.setText("รายงานการใช้วัตถุดิบแยกตามรหัสสินค้า");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed1(evt);
            }
        });
        jMenu12.add(jMenuItem9);
        jMenu12.add(jSeparator3);

        jMenuItem10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem10.setText("รายงานภาษีซื้อ");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed1(evt);
            }
        });
        jMenu12.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem11.setText("รายงานภาษีขาย (จาก POS)");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed1(evt);
            }
        });
        jMenu12.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem12.setText("งบกำไรขาดทุนจากการดำเนินงาน");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem12);

        jMenuBar3.add(jMenu12);

        jMenu13.setText("ระบบช่วยงาน/แฟ้มข้อมูลระบบ");
        jMenu13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem43.setText("กำหนดรายละเอียดบริษัท (Company File)");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem43);
        jMenu13.add(jSeparator13);

        jMenuItem44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem44.setText("แฟ้มข้อมูลกลุ่มสินค้า (Group File)");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem44);

        jMenuItem45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem45.setText("แฟ้มข้อมูลสต็อกสินค้า (Stock File)");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem45);

        jMenuItem46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem46.setText("แฟ้มข้อมูลโรงงาน (Factory File)");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem46);

        jMenuItem47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem47.setText("แฟ้มข้อมูลสาขา (Branch File)");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem47);

        jMenuItem48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem48.setText("แฟ้มข้อมูลหน่วยสินค้า (Unit File)");
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem48);
        jMenu13.add(jSeparator17);

        jMenuItem13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem13.setText("กำหนดรหัสกลุ่มผู้ใช้งาน (User Group Setup)");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed1(evt);
            }
        });
        jMenu13.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem14.setText("กำหนดสิทธิ์การใช้งานของพนักงาน (User Setup)");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed1(evt);
            }
        });
        jMenu13.add(jMenuItem14);
        jMenu13.add(jSeparator5);

        jMenuItem61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem61.setText("ประมวลผลสิ้นปี (End of year)");
        jMenuItem61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem61ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem61);

        jMenuItem15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem15.setText("คำนวณยอดคงเหลือยกมาต้นงวดใหม่");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem15);

        jMenuBar3.add(jMenu13);

        jMenu15.setText("ออกจากระบบ");
        jMenu15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem51.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem51.setText("ออกจากระบบ (Exit)");
        jMenuItem51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem51);

        jMenuBar3.add(jMenu15);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1024, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    System.exit(0);
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    if (Inv_UserRec.Stock35.equals("Y")) {
        jdi_comanysetup frm = new jdi_comanysetup(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    if (Inv_UserRec.Stock37.equals("Y")) {
        jdi_groupfile frm = new jdi_groupfile(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem5ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    if (Inv_UserRec.Stock38.equals("Y")) {
        try {
            jdi_stockfile frm = new jdi_stockfile(this, true);
            frm.setVisible(true);//GEN-LAST:event_jMenuItem6ActionPerformed
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            ShowUserError();
        }
    }

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    if (Inv_UserRec.Stock39.equals("Y")) {
        jdi_factory frm = new jdi_factory(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem7ActionPerformed

private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
    if (Inv_UserRec.Stock40.equals("Y")) {
        jdi_unit frm = new jdi_unit(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem9ActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    if (Inv_UserRec.Stock41.equals("Y")) {
        jdi_branch frm = new jdi_branch(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
    if (Inv_UserRec.Stock1.equals("Y")) {
        Main_recive frm = new Main_recive(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem10ActionPerformed

private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
    if (Inv_UserRec.Stock6.equals("Y")) {
        Main_tranin frm = new Main_tranin(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem11ActionPerformed

private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
    if (Inv_UserRec.Stock11.equals("Y")) {
        Report_Profit_Poss frm = new Report_Profit_Poss(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem12ActionPerformed

private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
    if (Inv_UserRec.Stock16.equals("Y")) {
        Main_prolost frm = new Main_prolost(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem13ActionPerformed

private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
    if (Inv_UserRec.Stock21.equals("Y")) {
        Main_charge frm = new Main_charge(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem14ActionPerformed

private void jMenuItem52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem52ActionPerformed
    if (Inv_UserRec.Stock31.equals("Y")) {
        Jdi_report_stockcard_all frm = new Jdi_report_stockcard_all(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }


}//GEN-LAST:event_jMenuItem52ActionPerformed

private void jMenuItem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem53ActionPerformed
    if (Inv_UserRec.Stock32.equals("Y")) {
        Jdi_report_stockinhand frm = new Jdi_report_stockinhand(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem53ActionPerformed

private void jMenuItem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem54ActionPerformed
    if (Inv_UserRec.Stock33.equals("Y")) {
        Jdi_report_stockmovement frm = new Jdi_report_stockmovement(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem54ActionPerformed

private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
    if (Inv_UserRec.Stock26.equals("Y")) {
        Main_Count_Stock frm = new Main_Count_Stock(this, true);
        frm.setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem41ActionPerformed

private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock0.equals("Y")) {
        JPluMaster jdi = new JPluMaster(new Frame(), true);
        jdi.setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem40ActionPerformed

private void jMenuItem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem55ActionPerformed
    if (Inv_UserRec.Stock23.equals("Y")) {
        Jdi_report_charge jrc = new Jdi_report_charge(null, true);
        jrc.setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem55ActionPerformed

private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
    if (Inv_UserRec.Stock18.equals("Y")) {
        Jdi_report_prolost jrc = new Jdi_report_prolost(null, true);
        jrc.setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem56ActionPerformed

private void jMenuItem57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem57ActionPerformed
    if (Inv_UserRec.Stock13.equals("Y")) {
        Jdi_report_tranout jrc = new Jdi_report_tranout(null, true);
        jrc.setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem57ActionPerformed

private void jMenuItem65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem65ActionPerformed
    if (Inv_UserRec.Stock3.equals("Y")) {
        Jdi_report_recive jrc = new Jdi_report_recive(null, true);
        jrc.setVisible(true);
    } else {
        ShowUserError();
    }


}//GEN-LAST:event_jMenuItem65ActionPerformed

private void jMenuItem58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem58ActionPerformed
    if (Inv_UserRec.Stock8.equals("Y")) {
        Jdi_report_tranin jrc = new Jdi_report_tranin(null, true);
        jrc.setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem58ActionPerformed

private void jMenuItem59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem59ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock4.equals("Y")) {
        new Jdi_report_sumRecivePLU(new NimbusFrame(), true).setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem59ActionPerformed

private void jMenuItem60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem60ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock5.equals("Y")) {
        new Jdi_report_sumReciveGroup(new NimbusFrame(), true).setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem60ActionPerformed

private void jMenuItem66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem66ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock9.equals("Y")) {
        new Jdi_report_sumTraninPLU(new NimbusFrame(), true).setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem66ActionPerformed

private void jMenuItem67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem67ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock10.equals("Y")) {
        new Jdi_report_sumTraninGroup(new NimbusFrame(), true).setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem67ActionPerformed

private void jMenuItem68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem68ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock14.equals("Y")) {
        new Jdi_report_sumTranoutPLU(new NimbusFrame(), true).setVisible(true);
    } else {
        ShowUserError();
    }


}//GEN-LAST:event_jMenuItem68ActionPerformed

private void jMenuItem69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem69ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock15.equals("Y")) {
        new Jdi_report_sumTranoutGroup(new NimbusFrame(), true).setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem69ActionPerformed

private void jMenuItem70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem70ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock19.equals("Y")) {
        new Jdi_report_sumProlostPLU(new NimbusFrame(), true).setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem70ActionPerformed

private void jMenuItem71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem71ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock20.equals("Y")) {
        new Jdi_report_sumProlostGroup(new NimbusFrame(), true).setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem71ActionPerformed

private void jMenuItem72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem72ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock24.equals("Y")) {
        new Jdi_report_sumChargePLU(new NimbusFrame(), true).setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem72ActionPerformed

private void jMenuItem73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem73ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock25.equals("Y")) {
        new Jdi_report_sumChargeGroup(new NimbusFrame(), true).setVisible(true);
    } else {
        ShowUserError();
    }

}//GEN-LAST:event_jMenuItem73ActionPerformed

private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
    new Jdi_report_adjstockGroup(this, true).setVisible(true);
}//GEN-LAST:event_jMenuItem42ActionPerformed

private void jMenuItem61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem61ActionPerformed
// TODO add your handling code here:
    if (Inv_UserRec.Stock45.equals("Y")) {
        new Main_EndYear(this, true).setVisible(true);
    } else {
        ShowUserError();
    }
}//GEN-LAST:event_jMenuItem61ActionPerformed

private void menu_tranoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_tranoutActionPerformed
    Main_tranout frm = new Main_tranout(this, true);
    frm.setVisible(true);
}//GEN-LAST:event_menu_tranoutActionPerformed

    private void jMenuItem63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem63ActionPerformed
        JNoneMovement d = new JNoneMovement(this, true);
        d.setVisible(true);
    }//GEN-LAST:event_jMenuItem63ActionPerformed

    private void jMenuItem76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem76ActionPerformed
        if (Inv_UserRec.Stock41.equals("Y")) {
            View_Bproduct frm = new View_Bproduct(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem76ActionPerformed

    private void jMenuItem64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem64ActionPerformed
        if (Inv_UserRec.Stock41.equals("Y")) {
            View_Bproduct_PLU frm = new View_Bproduct_PLU(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem64ActionPerformed

    private void jMenuItem77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem77ActionPerformed
        if (Inv_UserRec.Stock41.equals("Y")) {
            View_BProduct_Group frm = new View_BProduct_Group(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem77ActionPerformed

    private void jMenuItem79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem79ActionPerformed
        if (Inv_UserRec.Stock41.equals("Y")) {
            Report_Profit frm = new Report_Profit(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem79ActionPerformed

    private void jMenuItem80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem80ActionPerformed
        if (Inv_UserRec.Stock41.equals("Y")) {
            Report_Profit_Id frm = new Report_Profit_Id(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem80ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        GetPassword frm = new GetPassword(this, true);
        frm.setVisible(true);
        if (frm.ValidPassword) {
            new Main_ProcessNewStock(this, true).setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (Inv_UserRec.Stock21.equals("Y")) {
            Main_StockTran frm = new Main_StockTran(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (Inv_UserRec.Stock21.equals("Y")) {
            JINGMaster frm = new JINGMaster(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        if (Inv_UserRec.Stock21.equals("Y")) {
            JEOrdering frm = new JEOrdering(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem3ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed1
        if (Inv_UserRec.Stock21.equals("Y")) {
            Main_Buy m = new Main_Buy(this, true);
            m.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed1

    private void jMenuItem4ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed1
        if (Inv_UserRec.Stock21.equals("Y")) {
            SaveCostDialog s = new SaveCostDialog(this, true);
            s.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed1

    private void jMenuItem10ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed1
        if (Inv_UserRec.Stock41.equals("Y")) {
            Report_Vat frm = new Report_Vat(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed1

    private void jMenuItem11ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed1
        if (Inv_UserRec.Stock41.equals("Y")) {
            Report_VatS frm = new Report_VatS(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed1

    private void jMenuItem9ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed1
        if (Inv_UserRec.Stock41.equals("Y")) {
            Report_InGroup frm = new Report_InGroup(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed1

    private void jMenuItem8ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed1
        if (Inv_UserRec.Stock41.equals("Y")) {
            Report_In frm = new Report_In(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed1

    private void jMenuItem13ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed1
        if (Inv_UserRec.Stock41.equals("Y")) {
            Main_User_Group_SetUP frm = new Main_User_Group_SetUP(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed1

    private void jMenuItem14ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed1
        if (Inv_UserRec.Stock41.equals("Y")) {
            Main_User_SetUP frm = new Main_User_SetUP(this, true);
            frm.setVisible(true);
        } else {
            ShowUserError();
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed1

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem60;
    private javax.swing.JMenuItem jMenuItem61;
    private javax.swing.JMenuItem jMenuItem63;
    private javax.swing.JMenuItem jMenuItem64;
    private javax.swing.JMenuItem jMenuItem65;
    private javax.swing.JMenuItem jMenuItem66;
    private javax.swing.JMenuItem jMenuItem67;
    private javax.swing.JMenuItem jMenuItem68;
    private javax.swing.JMenuItem jMenuItem69;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem70;
    private javax.swing.JMenuItem jMenuItem71;
    private javax.swing.JMenuItem jMenuItem72;
    private javax.swing.JMenuItem jMenuItem73;
    private javax.swing.JMenuItem jMenuItem76;
    private javax.swing.JMenuItem jMenuItem77;
    private javax.swing.JMenuItem jMenuItem79;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem80;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuItem menu_tranout;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void TestPrint() {
        ViewReport view = new ViewReport();
        view.printCompile();
    }
}
