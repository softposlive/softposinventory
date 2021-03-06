package program;

import Bean.FactoryBean;
import DBcontrol.FactoryControl;
import DBcontrol.MySQLConnect;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import log.control.Log;

public class jdi_factory extends javax.swing.JDialog {

    DefaultTableModel tblFactory_model;

    public jdi_factory(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        tblFactory_model = (DefaultTableModel) tblFactory.getModel();
        tblFactory.setShowGrid(true);
        tblFactory.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblFactory.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblFactory.setRowSelectionAllowed(true);
        tblFactory.setShowGrid(true);


        tblFactory.getColumnModel().getColumn(0).setPreferredWidth(130);
        tblFactory.getColumnModel().getColumn(1).setPreferredWidth(320);
        JTableHeader header = tblFactory.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 16));
        tblFactory.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblFactory.setRowHeight(25);

        loadData();
    }

    public void fcodeExit() {
        if (txtCode.getText() != null && !txtCode.getText().equals("")) {
            if (txtCode.getText().length() <= 3) {
                int rowCount = tblFactory_model.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    String search = tblFactory_model.getValueAt(i, 0).toString();
                    if (search.compareTo(txtCode.getText()) == 0) {
                        txtDesc.setText(tblFactory_model.getValueAt(i, 1).toString());
                        tblFactory.clearSelection();
                        tblFactory.setRowSelectionInterval(i, i);
                        break;
                    }
                }
                txtCode.setEditable(false);
                txtDesc.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสกลุ่ม (Code) ไม่เกิน 3 ตัว", "Mycps", JOptionPane.OK_OPTION);

            }

        }

    }
    public void bntExitClick() {
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFactory = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_createNew = new javax.swing.JMenuItem();
        menuu_cancle = new javax.swing.JMenuItem();
        menu_save = new javax.swing.JMenuItem();
        menu_remove = new javax.swing.JMenuItem();
        menu_exit = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("กำหนดรายการรหัสโรงงาน (Factory setting)");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(213, 205, 200));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(234, 230, 237));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel1.setText("รหัสโรงงาน (Code)");

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("ชื่อโรงงาน (Description)");

        txtCode.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodeKeyPressed(evt);
            }
        });

        txtDesc.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });
        txtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        tblFactory.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tblFactory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสโรงงาน (Code)", "ชื่อโรงงาน (Description)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFactory.setRequestFocusEnabled(false);
        tblFactory.setRowHeight(20);
        tblFactory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFactoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFactory);
        if (tblFactory.getColumnModel().getColumnCount() > 0) {
            tblFactory.getColumnModel().getColumn(0).setResizable(false);
            tblFactory.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAdd.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.gif"))); // NOI18N
        btnAdd.setText("เพิ่ม");
        btnAdd.setToolTipText("Create new item");
        btnAdd.setRequestFocusEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancle.gif"))); // NOI18N
        btnCancel.setText("ยกเลิก");
        btnCancel.setToolTipText("Cancel all change");
        btnCancel.setRequestFocusEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.gif"))); // NOI18N
        btnSave.setText("บันทึกข้อมูล");
        btnSave.setToolTipText("Save or Update Item");
        btnSave.setRequestFocusEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btnDel.setText("ลบ");
        btnDel.setToolTipText("Remove Item");
        btnDel.setRequestFocusEnabled(false);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        jMenu1.setText("ฟังก์ชันการทำงาน");
        jMenu1.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N

        menu_createNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menu_createNew.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menu_createNew.setText("เพิ่ม (Create New)");
        menu_createNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_createNewActionPerformed(evt);
            }
        });
        jMenu1.add(menu_createNew);

        menuu_cancle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuu_cancle.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menuu_cancle.setText("ยกเลิก (Cancle)");
        menuu_cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuu_cancleActionPerformed(evt);
            }
        });
        jMenu1.add(menuu_cancle);

        menu_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menu_save.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menu_save.setText("บันทึก (Save)");
        menu_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_saveActionPerformed(evt);
            }
        });
        jMenu1.add(menu_save);

        menu_remove.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menu_remove.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menu_remove.setText("ลบ (Remove)");
        menu_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_removeActionPerformed(evt);
            }
        });
        jMenu1.add(menu_remove);

        menu_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menu_exit.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menu_exit.setText("ออกจากระบบ");
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        jMenu1.add(menu_exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(494, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    saveData();
}//GEN-LAST:event_btnSaveActionPerformed

private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    clearForm();
}//GEN-LAST:event_btnCancelActionPerformed

private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
    String code = txtCode.getText();
    int confirm = JOptionPane.showConfirmDialog(this, "คุณต้องการลบข้อมูลโรงงาน ("+code+") ใช่หรือไม่...?", "Confirm", JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.YES_OPTION) {
        FactoryControl factory = new FactoryControl();
        if(factory.checkFactory_HRecive(code)){
            Log.m("รหัสโรงงานนี้ถูกนำไปใช้งานในระบบแล้วไม่สามารถลบออกจากระบบได้ !!!");
        }else{
            if(factory.seek(code)){
                if(factory.remove(code)){
                    Log.m("ลบข้อมูลเรียบร้อยแล้ว");
                    loadData();
                }else{
                    Log.m("ไม่สามารถมารถลบข้อมูลนี้ได้");
                }
            }else{
                Log.m("ไม่พบข้อมูลโรงงานนี้ในระบบ");
            }
        }
    }
    
    clearForm();
}//GEN-LAST:event_btnDelActionPerformed

private void tblFactoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFactoryMouseClicked

    if (evt.getClickCount() == 2) {
        int rowSelect = tblFactory.getSelectedRow();
        String code = tblFactory_model.getValueAt(rowSelect, 0).toString();
        String name = tblFactory_model.getValueAt(rowSelect, 1).toString();
        txtCode.setText(code);
        txtDesc.setText(name);
        
        txtCode.setEditable(false);

    }
}//GEN-LAST:event_tblFactoryMouseClicked

private void menu_createNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_createNewActionPerformed
// TODO add your handling code here:
    clearForm();
}//GEN-LAST:event_menu_createNewActionPerformed

private void menuu_cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuu_cancleActionPerformed
// TODO add your handling code here:
    clearForm();
}//GEN-LAST:event_menuu_cancleActionPerformed

private void menu_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_saveActionPerformed
// TODO add your handling code here:
    btnSaveActionPerformed(evt);
}//GEN-LAST:event_menu_saveActionPerformed

private void menu_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_removeActionPerformed
// TODO add your handling code here:
    btnDelActionPerformed(evt);
}//GEN-LAST:event_menu_removeActionPerformed

private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
// TODO add your handling code here:
    clearForm();
}//GEN-LAST:event_btnAddActionPerformed

private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
// TODO add your handling code here:
    bntExitClick() ;
}//GEN-LAST:event_menu_exitActionPerformed

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    if (txtCode.isEditable()) {
        txtCode.requestFocus();
    }
}//GEN-LAST:event_formWindowActivated

    private void txtCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(txtCode.getText().trim().equals("")){
               txtCode.requestFocus();
           }else{
               txtCode.setEditable(false);
               FactoryControl factory = new FactoryControl();
               FactoryBean f = factory.getRecordAt(txtCode.getText());
               if(f!=null){
                   txtDesc.setText(f.getFactoryname());
               }
               txtDesc.requestFocus();
           }
        }
    }//GEN-LAST:event_txtCodeKeyPressed

    private void txtDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(txtDesc.getText().trim().equals("")){
                txtDesc.requestFocus();
            }else{
                btnSave.requestFocus();
            }
        }
    }//GEN-LAST:event_txtDescKeyPressed

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            saveData();
        }
    }//GEN-LAST:event_btnSaveKeyPressed

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        saveData();
    }//GEN-LAST:event_txtDescActionPerformed

    void loadData() {
        FactoryControl factory = new FactoryControl();
        List faclist = factory.getFactoryData();
        int cnt = tblFactory_model.getRowCount();
        int facSize = faclist.size();
        if (cnt > 0) {
            for (int i = 0; i < cnt; i++) {
                tblFactory_model.removeRow(0);
            }
        }
        for (int i = 0; i < facSize; i++) {
            FactoryBean data = (FactoryBean) faclist.get(i);
            String[] aa = {data.getFactorycode(), data.getFactoryname()};
            tblFactory_model.addRow(aa);
        }
        txtCode.requestFocus();
    }

    public void clearForm() {
        txtCode.setEnabled(true);
        txtCode.setEditable(true);
        txtCode.setText("");
        txtDesc.setText("");
        txtCode.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new MySQLConnect();
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                jdi_factory dialog = new jdi_factory(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem menu_createNew;
    private javax.swing.JMenuItem menu_exit;
    private javax.swing.JMenuItem menu_remove;
    private javax.swing.JMenuItem menu_save;
    private javax.swing.JMenuItem menuu_cancle;
    private javax.swing.JTable tblFactory;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDesc;
    // End of variables declaration//GEN-END:variables

    private void saveData() {
        String f_code = txtCode.getText().trim();
        String f_desc = txtDesc.getText().trim();

        if (f_code == null || f_code.equals("")) {
            Log.m("กรุณาระบุรหัสโรงงาน (Code)");
            txtCode.requestFocus();
        } else if (f_code.length() > 3) {
            Log.m("กรุณาระบุรหัสกลุ่ม (Code) ไม่เกิน 3 ตัว");
        } else if (f_desc == null || f_desc.equals("")) {
            Log.m("กรุณาระบุชื่อชื่อโรงงาน (Description)");
            txtCode.setEditable(false);
            txtDesc.requestFocus();
        } else {
            FactoryControl factory = new FactoryControl();
            FactoryBean bean = new FactoryBean();
            bean.setFactorycode(f_code);
            bean.setFactoryname(f_desc);

            factory.insert(bean);

            clearForm();
            loadData();
        }
    }
}
