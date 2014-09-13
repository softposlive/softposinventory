package program;

import DBcontrol.Db_Ordering;
import Bean.CheckReceive;
import Bean.CheckReceiveDetail;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class Jdi_recive_order extends javax.swing.JDialog {

    public Jdi_recive_order(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadDate();
        setTableHeader();
        setTableDetail();
        txt1.requestFocus();
        txt1.selectAll();
    }
    public void loadDataInit(){
        txt_faccode.setText(getFactoryCode());
        txt_facdesc.setText(getFactoryDesc());
        loadData();
        txt5.setText("จำนวนรวมทั้งหมด "+tblHeader.getRowCount()+" บิล");
    }
    private String factoryCode = "";
    private String factoryDesc = "";

    public String getFactoryDesc() {
        return factoryDesc;
    }

    public void setFactoryDesc(String factoryDesc) {
        this.factoryDesc = factoryDesc;
    }

    public JTextField getTxt_facdesc() {
        return txt_facdesc;
    }

    public void setTxt_facdesc(JTextField txt_facdesc) {
        this.txt_facdesc = txt_facdesc;
    }
    
    public void setFactoryCode(String factoryCode){
        this.factoryCode=factoryCode;
    }
    public String getFactoryCode(){
        return factoryCode;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_faccode = new javax.swing.JTextField();
        txt_facdesc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        date2 = new javax.swing.JButton();
        txt2 = new javax.swing.JFormattedTextField();
        date1 = new javax.swing.JButton();
        txt1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHeader = new javax.swing.JTable();
        txt5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetail = new javax.swing.JTable();
        txt6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงรายการรับสินค้าจากโรงงาน");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(147, 202, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_faccode.setEditable(false);
        txt_faccode.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt_faccode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_faccode.setFocusable(false);
        txt_faccode.setRequestFocusEnabled(false);
        txt_faccode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_faccodeKeyPressed(evt);
            }
        });

        txt_facdesc.setBackground(new java.awt.Color(246, 248, 215));
        txt_facdesc.setEditable(false);
        txt_facdesc.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txt_facdesc.setFocusable(false);
        txt_facdesc.setRequestFocusEnabled(false);

        jButton1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jButton1.setText("ตกลง");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        date2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar.png"))); // NOI18N
        date2.setFocusable(false);
        date2.setRequestFocusEnabled(false);
        date2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date2ActionPerformed(evt);
            }
        });
        date2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                date2FocusGained(evt);
            }
        });
        date2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                date2KeyPressed(evt);
            }
        });

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2KeyReleased(evt);
            }
        });

        date1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar.png"))); // NOI18N
        date1.setFocusable(false);
        date1.setRequestFocusEnabled(false);
        date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1ActionPerformed(evt);
            }
        });
        date1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                date1FocusGained(evt);
            }
        });
        date1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                date1KeyPressed(evt);
            }
        });

        txt1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
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

        jLabel1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel1.setText("วันที่รับ");

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("ถึง");

        jLabel3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel3.setText("รับสินค้าจาก");

        jButton2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jButton2.setText("แสดงผล(F5)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_faccode, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_facdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_faccode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_facdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        tblHeader.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblHeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่เอกสาร", "คำขอ", "รอบจัดส่ง", "ผู้จัดทำ", "วันที่สั่ง", "รหัสสาขา", "วันที่รับ", "สถานะใบคำขอ", "สถานะตัดสต็อก", "ดึงเพื่อรับสินค้า", "เอกสารรับ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
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
        txt5.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5.setText("จำนวนรวมทั้งหมด 0 บิล");

        tblDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblDetail.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tblDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่เอกสาร", "รหัสสินค้า", "ชื่อสินค้า", "จำนวนที่สั่ง", "หน่วย", "การจอง"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDetailKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblDetail);

        txt6.setBackground(new java.awt.Color(175, 251, 209));
        txt6.setEditable(false);
        txt6.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setText("จำนวน 0 รายการ");

        jLabel5.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(230, 62, 62));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("N = ปกติ,   L = รับใบคำขอแล้ว,   Y = จัดทำ Stock สินค้าแล้ว");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
                    .addComponent(txt6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1024, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void tblHeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHeaderMouseClicked
    int rowSelected = tblHeader.getSelectedRow();
    if(rowSelected!=-1){
        String order_no = ""+tblHeader.getValueAt(rowSelected, 0);
        loadDataDetail(order_no);
        txt6.setText("จำนวน "+tblDetail.getRowCount()+" รายการ");
    }
}//GEN-LAST:event_tblHeaderMouseClicked

public ArrayList<String> getDataOrder(){
   ArrayList<String> arr = new ArrayList<String>();
   for(int i=0;i<tblHeader.getRowCount();i++){
       boolean check = (Boolean)tblHeader.getValueAt(i, 9);
       if(check){
           String str = ""+tblHeader.getValueAt(i, 0);
           String chk = ""+tblHeader.getValueAt(i, 8);
           if(!chk.equals("L")&&!chk.equals("Y")){
                arr.add(str);
           }
       }
   }
   return arr;
}
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    dispose();
}//GEN-LAST:event_jButton1ActionPerformed

private void date2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date2ActionPerformed
    cmdDateChoose2();
    loadData();
    txt2.requestFocus();
}//GEN-LAST:event_date2ActionPerformed
private void cmdDateChoose1(){
    Point point = date1.getLocationOnScreen();
    utilities.DateChooser.DateChooserDialog dcd = new utilities.DateChooser.DateChooserDialog(null,true,point);
    dcd.setVisible(true);
    txt1.setText(dateFmtShow.format(dcd.getSelectedDate().getTime()));
}
private void cmdDateChoose2(){
    Point point = date2.getLocationOnScreen();
    utilities.DateChooser.DateChooserDialog dcd = new utilities.DateChooser.DateChooserDialog(null,true,point);
    dcd.setVisible(true);
    txt2.setText(dateFmtShow.format(dcd.getSelectedDate().getTime()));
}
private void date2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_date2FocusGained

}//GEN-LAST:event_date2FocusGained

private void date2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date2KeyPressed

}//GEN-LAST:event_date2KeyPressed

private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        jButton2.requestFocus();
    }else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        txt1.requestFocus();
    }else if(evt.getKeyCode() == KeyEvent.VK_F1){
        cmdDateChoose2();
        txt2.requestFocus();
    }else if(evt.getKeyCode()==KeyEvent.VK_F5){
        jButton2ActionPerformed(null);
        tblHeader.requestFocus();
    }
}//GEN-LAST:event_txt2KeyPressed

private void txt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyReleased

}//GEN-LAST:event_txt2KeyReleased

private void date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1ActionPerformed
    // TODO add your handling code here:
    cmdDateChoose1();
    loadData();
    txt1.requestFocus();
}//GEN-LAST:event_date1ActionPerformed

private void date1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_date1FocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_date1FocusGained

private void date1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date1KeyPressed
    // TODO add your handling code here:
}//GEN-LAST:event_date1KeyPressed

private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        dispose();
    }else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        txt2.requestFocus();
        txt2.selectAll();
    }else if(evt.getKeyCode()==KeyEvent.VK_F1){
        cmdDateChoose1();
        loadData();
        txt1.requestFocus();
    }else if(evt.getKeyCode()==KeyEvent.VK_F5){
        jButton2ActionPerformed(null);
        tblHeader.requestFocus();
    }
}//GEN-LAST:event_txt1KeyPressed

private void tblHeaderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblHeaderKeyReleased
    int rowSelected = tblHeader.getSelectedRow();
    if(rowSelected!=-1){
        String order_no = ""+tblHeader.getValueAt(rowSelected, 0);
        loadDataDetail(order_no);
        txt6.setText("จำนวน "+tblDetail.getRowCount()+" รายการ");
    }
}//GEN-LAST:event_tblHeaderKeyReleased

private void tblHeaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblHeaderKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        txt1.requestFocus();
    }
}//GEN-LAST:event_tblHeaderKeyPressed

private void tblDetailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDetailKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        dispose();
    }
}//GEN-LAST:event_tblDetailKeyPressed

private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        dispose();
    }
}//GEN-LAST:event_formKeyPressed

private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        dispose();
    }
}//GEN-LAST:event_jButton1KeyPressed

private void txt_faccodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_faccodeKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        dispose();
    }
}//GEN-LAST:event_txt_faccodeKeyPressed

private void txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1FocusGained
    txt1.setText(txt1.getText());
    txt1.selectAll();
}//GEN-LAST:event_txt1FocusGained

private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained
    txt2.setText(txt2.getText());
    txt2.selectAll();
}//GEN-LAST:event_txt2FocusGained

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    loadData();
    tblHeader.requestFocus();
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        tblHeader.requestFocus();
    }
}//GEN-LAST:event_jButton2KeyPressed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jdi_recive_order dialog = new Jdi_recive_order(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton date1;
    private javax.swing.JButton date2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDetail;
    private javax.swing.JTable tblHeader;
    private javax.swing.JFormattedTextField txt1;
    private javax.swing.JFormattedTextField txt2;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt_faccode;
    private javax.swing.JTextField txt_facdesc;
    // End of variables declaration//GEN-END:variables

    SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy" ,Locale.ENGLISH);
    SimpleDateFormat dateFmtSql = new SimpleDateFormat("yyyy-MM-dd" ,Locale.ENGLISH);
    SimpleDateFormat timeFmtShow = new SimpleDateFormat("hh:mm:ss" ,Locale.ENGLISH);
    DecimalFormat doubleFmt = new DecimalFormat("##,###,##0.00");
    DecimalFormat intFmt = new DecimalFormat("##,###,##0");
    DecimalFormat qtyFmt = new DecimalFormat("##,###,##0.000");
    
    DefaultTableModel modelHeader;
    DefaultTableModel modelDetail;

    private void loadData() {
        Db_Ordering db = new Db_Ordering();
        //clear model
        clearModel(modelHeader);
        ArrayList<CheckReceive> arr = db.getDataReceive(txt_faccode.getText(), 
                txt1.getText().split("/")[2]+"-"+txt1.getText().split("/")[1]+"-"+txt1.getText().split("/")[0],
                txt2.getText().split("/")[2]+"-"+txt2.getText().split("/")[1]+"-"+txt2.getText().split("/")[0]);
        for(int i=0;i<arr.size();i++){
            CheckReceive bean = (CheckReceive)arr.get(i);
            boolean received = false;
            received = bean.getDt_receive().equalsIgnoreCase("Y");
            if(!received){
                 received = bean.getDt_receive().equalsIgnoreCase("L");
            }
            modelHeader.addRow(new Object[]{bean.getOrder_no(), bean.getDoctype_desc(), bean.getOrder_round(),
            bean.getOrder_user(), bean.getOrder_date(), bean.getBranch_code(),bean.getOrder_receivedate(),
            bean.getOrder_status(), bean.getDt_receive(),received, bean.getRno()});
        }
        txt5.setText("จำนวนรวมทั้งหมด "+modelHeader.getRowCount()+" บิล");
    }
    private void loadDataDetail(String order_no) {
        clearModel(modelDetail);
        Db_Ordering db = new Db_Ordering();
        ArrayList<CheckReceiveDetail> arr = db.getDataReceiveDetail(order_no);
        for(int i=0;i<arr.size();i++){
            CheckReceiveDetail bean = (CheckReceiveDetail)arr.get(i);
            modelDetail.addRow(new Object[]{order_no, bean.getProduct_id(), bean.getProduct_desc(), 
            bean.getOrderdetail_qty(), bean.getUnit(), bean.getReserve()});
        }
    }
    void clearModel(DefaultTableModel model){
        int size = model.getRowCount();
        for(int i=0;i<size;i++){
            model.removeRow(0);
        }
    }
    private void setTableHeader(){
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
        tblHeader.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tblHeader.setRowHeight(25);
        
        TableColumn column = null;
        int[] colSize = {100, 250, 80, 80, 80, 80, 100, 90, 50, 100, 120};
        tblHeader.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblHeader.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }
        
        TableColumnModel tcm = tblHeader.getColumnModel();
        DefaultTableCellRenderer d;
        
        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        for(int i=0;i<colSize.length;i++){
            if(i!=9)
            tcm.getColumn(i).setCellRenderer(d);
        }
        
    }    
    private void setTableDetail(){
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
        tblDetail.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tblDetail.setRowHeight(25);
        
        TableColumn column = null;
        int[] colSize = {100, 100, 250, 100, 100, 100};
        tblDetail.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblDetail.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }
        
        TableColumnModel tcm = tblDetail.getColumnModel();
        DefaultTableCellRenderer d;
        
        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        for(int i=0;i<colSize.length;i++){
            tcm.getColumn(i).setCellRenderer(d);
        }
    }

    private void loadDate() {
        SimpleDateFormat simp = new SimpleDateFormat("dd/MM/yyyy");
        txt1.setText(simp.format(new java.util.Date()));
        txt2.setText(simp.format(new java.util.Date()));
    }

}
