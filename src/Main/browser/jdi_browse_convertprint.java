package Main.browser;

import DBcontrol.Db_convert;
import DBcontrol.Db_hconvert;
import DBcontrol.MySQLConnect;
import Bean.Convert;
import Bean.Hconvert;
import program.PublicVar;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import report.SnpReport;
import utilities.DateChooser.DateChooserDialog;

public class jdi_browse_convertprint extends javax.swing.JDialog {
    private SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
    private Color colorBlue = new Color(154,219,242);
    private Color colorRed = new Color(253,138,129);

    public jdi_browse_convertprint(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTableConvert();
        setTableDeatail1();
        setTableDeatail2();
        txt1.setText(sim.format(new Date()));
        txt2.setText(sim.format(new Date()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JFormattedTextField();
        txt2 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHeader = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        txt3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงรายงานการแปรรูปสินค้า");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "กำหนดช่วงวันที่", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Norasi", 0, 14))); // NOI18N

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

        jLabel1.setFont(new java.awt.Font("Norasi", 0, 14));
        jLabel1.setText("ถึง");

        b1.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SandClock.png"))); // NOI18N
        b1.setText("F5 - ประมวลผล");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar.png"))); // NOI18N
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });

        d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar.png"))); // NOI18N
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Norasi", 0, 14));
        jCheckBox1.setText("แสดงรายละเอียดรายงาน");

        b2.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        b2.setText("พิมพ์");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.gif"))); // NOI18N
        b3.setText("ออก");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(d1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(d2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(d2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(d1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbHeader.setAutoCreateRowSorter(true);
        tbHeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่เอกสาร", "วันที่เอกสาร", "หมายเหตุ", "จำนวน", "ผู้บันทึก", "POST", "Post User", "วันที่ Post", "เวลา Post"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHeaderMouseClicked(evt);
            }
        });
        tbHeader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbHeaderKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbHeaderKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbHeader);

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14));
        jLabel2.setText("จำนวนรายการทั้งหมด");

        jLabel12.setFont(new java.awt.Font("Norasi", 1, 20));
        jLabel12.setForeground(new java.awt.Color(19, 25, 77));
        jLabel12.setText("รับเข้าจากการแปรรูป");

        jLabel11.setFont(new java.awt.Font("Norasi", 1, 20));
        jLabel11.setForeground(new java.awt.Color(247, 16, 11));
        jLabel11.setText("จ่ายออกเพื่อการแปรรูป");

        tb1.setAutoCreateRowSorter(true);
        tb1.setBackground(new java.awt.Color(166, 208, 219));
        tb1.setModel(new javax.swing.table.DefaultTableModel(
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
        tb1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(tb1);

        tb2.setAutoCreateRowSorter(true);
        tb2.setBackground(new java.awt.Color(236, 180, 218));
        tb2.setModel(new javax.swing.table.DefaultTableModel(
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
        tb2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(tb2);

        txt3.setFont(new java.awt.Font("Norasi", 0, 14));
        txt3.setText("จำนวนรายการ 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(898, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, 0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1024)/2, (screenSize.height-768)/2, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        PublicVar.ReturnString = "";
        dispose();
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        SnpReport snp = new SnpReport();
        snp.convertPrintReport(txt1.getText().trim(), txt2.getText().trim(),
                jCheckBox1.isSelected(), true);
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try {
            clearModel();
            Db_hconvert convert = new Db_hconvert();
            ArrayList<Hconvert> arr = convert.getListConvert(changeDate(txt1.getText()),
                    changeDate(txt2.getText()));
            for(int i=0;i<arr.size();i++){
                Hconvert bean = (Hconvert)arr.get(i);
                modelHeader.addRow(bean.getAll());
            }
        } catch (SQLException ex) {
            Logger.getLogger(jdi_browse_convertprint.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbHeader.requestFocus();
        txt3.setText("จำนวนรายการ "+tbHeader.getRowCount());
    }//GEN-LAST:event_b1ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        cmdDateChoose(txt1);
        txt2.requestFocus();
    }//GEN-LAST:event_d1ActionPerformed

    private void clearModel(){
        int size = tbHeader.getRowCount();
        for(int i=0;i<size;i++){
            modelHeader.removeRow(0);
        }
        jLabel2.setText("จำนวนรายการทั้งหมด 0 รายการ");
    }
    private void clearModel2(){
        int size = tb1.getRowCount();
        for(int i=0;i<size;i++){
            model1.removeRow(0);
        }
        jLabel2.setText("จำนวนรายการทั้งหมด 0 รายการ");
    }

    private void cmdProcess() {
        clearModel();
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

        showRecordToTableHeader(getRecordHeader(date1, date2));

        if (tbHeader.getRowCount() != 0) {
            tbHeader.setRowSelectionInterval(0, 0);
            loadDetail((String) tbHeader.getValueAt(0, 1));
        }else{
            clearModel();
        }
    }
    private DecimalFormat doubleFmt = new DecimalFormat("##,###,##0.00");
    private void loadDetail(String text) {
        clearModel();
        String sql = "SELECT r.*, p.* FROM `convert` r, product p "
                + "WHERE (r.r_pcode = p.pcode) AND r.r_no = '" + text + "'";
        try {
            System.out.println("Detail := " + sql);
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            while (rs.next()) {
                String[] row = new String[tbHeader.getColumnCount()];
                row[0] = intFmt.format(rs.getInt("r_que"));
                row[1] = rs.getString("r_pcode");
                row[2] = rs.getString("pdesc");
                row[3] = doubleFmt.format(rs.getFloat("r_onhand"));
                row[4] = doubleFmt.format(rs.getFloat("r_inhand"));
                row[5] = doubleFmt.format(rs.getFloat("r_adj"));
                row[6] = doubleFmt.format(rs.getFloat("r_price"));
                row[9] = dateFmtShow.format(rs.getDate("r_entrydate"));
                row[8] = rs.getString("r_time");
                row[7] = rs.getString("r_user");
                modelHeader.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (tbHeader.getRowCount() != 0) {
            tbHeader.setRowSelectionInterval(0, 0);
        }
    }
    private DecimalFormat intFmt = new DecimalFormat("##,###,##0");
    private void showRecordToTableHeader(ResultSet rs) {
        if (rs != null) {
            try {
                while (rs.next()) {
                    String[] row = new String[tbHeader.getColumnCount()];
                    row[0] = dateFmtShow.format(rs.getDate("r_date"));
                    row[1] = rs.getString("r_no");
                    row[2] = rs.getString("r_stk");
                    row[3] = rs.getString("r_remark");
                    row[4] = intFmt.format(rs.getInt("r_total"));
                    row[5] = rs.getString("r_user");
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
                ex.printStackTrace();
            }
        }
    }
    private ResultSet getRecordHeader(Calendar date1, Calendar date2) {
        String sql = "SELECT * FROM hconvert "
                + "WHERE (r_date BETWEEN '" + dateFmtShow.format(date1.getTime()) + "' "
                + "AND '" + dateFmtShow.format(date2.getTime()) + "')";
        sql += " ORDER BY r_date ";
        try {
            System.out.println(sql);
            return MySQLConnect.con.createStatement().executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    private SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private void cmdDateChoose(JFormattedTextField txt) {
        Point point = d1.getLocationOnScreen();
        DateChooserDialog dcd = new DateChooserDialog(null, true, point);
        dcd.setVisible(true);
        txt.setText(dateFmtShow.format(dcd.getSelectedDate().getTime()));
    }
    private void cmdDateChoose2(JFormattedTextField txt) {
        Point point = d2.getLocationOnScreen();
        DateChooserDialog dcd = new DateChooserDialog(null, true, point);
        dcd.setVisible(true);
        txt.setText(dateFmtShow.format(dcd.getSelectedDate().getTime()));
    }

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        cmdDateChoose2(txt2);
    }//GEN-LAST:event_d2ActionPerformed

    private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txt2.requestFocus();
        }else if(evt.getKeyCode()==KeyEvent.VK_F1){
            d1ActionPerformed(null);
        }else if(evt.getKeyCode()==KeyEvent.VK_F5){
            b1ActionPerformed(null);
        }else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            dispose();
        }
    }//GEN-LAST:event_txt1KeyPressed

    private void txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1FocusGained
        txt1.select(0, 2);
    }//GEN-LAST:event_txt1FocusGained

    private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained
        txt2.select(0, 2);
    }//GEN-LAST:event_txt2FocusGained

    private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_F1){
            d2ActionPerformed(null);
        }else if(evt.getKeyCode()==KeyEvent.VK_F5){
            b1ActionPerformed(null);
        }else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            dispose();
        }
    }//GEN-LAST:event_txt2KeyPressed

    private void tbHeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHeaderMouseClicked
        if(evt.getClickCount()==2){
            int index = tbHeader.getSelectedRow();
            String text = (String) tbHeader.getValueAt(index, 0);
            PublicVar.ReturnString = text;
            this.dispose();
        }else{
            int rows = tbHeader.getSelectedRow();
            if(rows!=-1){
                clearModel2();
                try {
                    String r_no = "" + tbHeader.getValueAt(rows, 0);
                    loadDetail2(r_no);
                } catch (Exception ex) {
                    Logger.getLogger(jdi_browse_convertprint.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabel2.setText("จำนวนรายการทั้งหมด "+model1.getRowCount()+" รายการ");
            }
        }
    }//GEN-LAST:event_tbHeaderMouseClicked
    void resetTableModel(){
        int size = model1.getRowCount();
        for(int i=0;i<size;i++){
            model1.removeRow(0);
        }
        size = model2.getRowCount();
        for(int i=0;i<size;i++){
            model2.removeRow(0);
        }
    }
    private DecimalFormat qtyFmt = new DecimalFormat("##0.000");
    private void loadDetail2(String rno) {
        try {
            resetTableModel();
            String sql = "SELECT r.*, pdesc, PUnit1, PPrice11 "
                    + "FROM `convert` r inner join product p "
                    + "on r.r_pcode=p.pcode "
                    + "WHERE r.r_pcode=p.pcode AND r.r_no = '" + rno + "' order by r_que";
            System.out.println(sql);
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            String[] row = new String[tb1.getColumnCount()];
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
                if(rs.getString("r_type").indexOf("-")==-1){
                    model1.addRow(row);
                }else{
                    model2.addRow(row);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private void tbHeaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbHeaderKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            txt1.requestFocus();
            txt1.select(0, 2);
            PublicVar.ReturnString = "";
        }else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            int index = tbHeader.getSelectedRow();
            String text = ""+tbHeader.getValueAt(index, 0);
            PublicVar.ReturnString = text;

            this.dispose();
        }
    }//GEN-LAST:event_tbHeaderKeyPressed

    private void tbHeaderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbHeaderKeyReleased
        int rows = tbHeader.getSelectedRow();
        if(rows!=-1){
            clearModel2();
            try {
                String r_no = "" + tbHeader.getValueAt(rows, 0);
                loadDetail2(r_no);
            } catch (Exception ex) {
                Logger.getLogger(jdi_browse_convertprint.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabel2.setText("จำนวนรายการทั้งหมด "+model1.getRowCount()+" รายการ");
        }
    }//GEN-LAST:event_tbHeaderKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        PublicVar.ReturnString = "";
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton d1;
    private javax.swing.JButton d2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tbHeader;
    private javax.swing.JFormattedTextField txt1;
    private javax.swing.JFormattedTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel modelHeader;
    private DefaultTableModel model1;
    private DefaultTableModel model2;
    
    private void setTableConvert() {
        modelHeader = (DefaultTableModel) tbHeader.getModel();
        tbHeader.setShowGrid(true);
        tbHeader.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbHeader.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbHeader.setRowSelectionAllowed(true);
        tbHeader.setShowGrid(true);
        tbHeader.setBackground(Color.WHITE);
        tbHeader.setGridColor(Color.LIGHT_GRAY);

        JTableHeader header = tbHeader.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tbHeader.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tbHeader.setRowHeight(25);

        //Setting column size
        TableColumn column = null;
        int[] colSize = {100, 120, 220, 80, 100, 80, 100, 100, 100};
        //tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tbHeader.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }

        DecimalFormat DoubleFmt = new DecimalFormat("##,###,##0.00");
        DecimalFormat IntegerFmt = new DecimalFormat("##,###,##0");
        DecimalFormat PersentFmt = new DecimalFormat("#,##0.00%");

        TableColumnModel tcm = tbHeader.getColumnModel();
        DefaultTableCellRenderer d;

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        tcm.getColumn(1).setCellRenderer(d);
        tcm.getColumn(2).setCellRenderer(d);

        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.CENTER);
        tcm.getColumn(0).setCellRenderer(d);
        tcm.getColumn(6).setCellRenderer(d);
        tcm.getColumn(7).setCellRenderer(d);
        tcm.getColumn(8).setCellRenderer(d);
        tcm.getColumn(3).setCellRenderer(d);
        tcm.getColumn(5).setCellRenderer(d);
        tcm.getColumn(4).setCellRenderer(d);
    }
    private void setTableDeatail1() {
        model1 = (DefaultTableModel) tb1.getModel();
        tb1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb1.setRowSelectionAllowed(true);
        tb1.setShowGrid(true);
        tb1.setBackground(Color.WHITE);
        tb1.setGridColor(Color.LIGHT_GRAY);

        JTableHeader header = tb1.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tb1.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tb1.setRowHeight(25);

        //Setting column size
        TableColumn column = null;
        int[] colSize = {50, 100, 200, 80, 100, 50, 80};
        //tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tb1.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }

        TableColumnModel tcm = tb1.getColumnModel();
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
    private void setTableDeatail2() {
        model2 = (DefaultTableModel) tb2.getModel();
        tb2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb2.setRowSelectionAllowed(true);
        tb2.setShowGrid(true);
        tb2.setBackground(Color.WHITE);
        tb2.setGridColor(Color.LIGHT_GRAY);

        JTableHeader header = tb2.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tb2.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tb2.setRowHeight(25);

        //Setting column size
        TableColumn column = null;
        int[] colSize = {50, 100, 200, 80, 100, 50, 80};
        //tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tb2.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }

        TableColumnModel tcm = tb2.getColumnModel();
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

    private String changeDate(String date) {
        String []d = date.split("/");
        return d[2]+"-"+d[1]+"-"+d[0];
    }
}