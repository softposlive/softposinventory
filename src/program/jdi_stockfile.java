package program;

import Bean.Stockfile;
import DBcontrol.Db_stockfile;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import utilities.ThaiUtil;

public class jdi_stockfile extends javax.swing.JDialog {

    DefaultTableModel tblStock_model;

    public jdi_stockfile(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        tblStock_model = (DefaultTableModel) tblStock.getModel();
        tblStock.setShowGrid(true);
        tblStock.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblStock.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblStock.setRowSelectionAllowed(true);
        tblStock.setShowGrid(true);
        tblStock.setGridColor(Color.gray);

        tblStock.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblStock.getColumnModel().getColumn(1).setPreferredWidth(300);
         JTableHeader header = tblStock.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 16));        
        tblStock.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tblStock.setRowHeight(25);
        displayStockFile();
    }
    public void stockCodeExit() {
       if (stockCode.getText() != null && !stockCode.getText().equals("")) {
        if (stockCode.getText().length() <= 2) {
            int rowCount = tblStock_model.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                String search = tblStock_model.getValueAt(i, 0).toString();
                if (search.compareTo(stockCode.getText()) == 0) {
                    stockDesc.setText(tblStock_model.getValueAt(i, 1).toString());
                    displayMode.setText("  Edit Mode");
                    tblStock.clearSelection();
                    tblStock.setRowSelectionInterval(i, i);
                    break;
                } else {
                    displayMode.setText("  Insert Mode");
                }
            }
            stockCode.setEditable(false);
            stockDesc.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสกลุ่ม (Code) ไม่เกิน 2 ตัว", "Mycps", JOptionPane.OK_OPTION);

        }

    } 
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
        stockCode = new javax.swing.JTextField();
        stockDesc = new javax.swing.JTextField();
        displayMode = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        btn_createNew = new javax.swing.JButton();
        btn_cancle = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menu_createNew1 = new javax.swing.JMenuItem();
        menuu_cancle1 = new javax.swing.JMenuItem();
        menu_save1 = new javax.swing.JMenuItem();
        menu_remove1 = new javax.swing.JMenuItem();
        menu_exit1 = new javax.swing.JMenuItem();

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
        setTitle("แฟ้มข้อมูลสต็อกสินค้า (Stock Code)");
        setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
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
        jLabel1.setText("รหัสสต็อก (Code)");

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("ชื่อสต็อก (Description)");

        stockCode.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        stockCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                stockCodeFocusLost(evt);
            }
        });
        stockCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stockCodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockCodeKeyReleased(evt);
            }
        });

        stockDesc.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        stockDesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockDescMouseClicked(evt);
            }
        });
        stockDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockDescKeyReleased(evt);
            }
        });

        displayMode.setBackground(new java.awt.Color(244, 250, 203));
        displayMode.setEditable(false);
        displayMode.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        displayMode.setForeground(new java.awt.Color(239, 8, 8));
        displayMode.setText("  display mode");
        displayMode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(stockCode, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayMode, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(stockDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(stockCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayMode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        tblStock.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสสต็อก(Code)", "ชื่อสต็อก(Description)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStock.setRowHeight(20);
        tblStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStockMouseClicked(evt);
            }
        });
        tblStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblStockKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblStock);
        if (tblStock.getColumnModel().getColumnCount() > 0) {
            tblStock.getColumnModel().getColumn(0).setResizable(false);
            tblStock.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_createNew.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn_createNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.gif"))); // NOI18N
        btn_createNew.setText("เพิ่ม");
        btn_createNew.setToolTipText("Create new item");
        btn_createNew.setRequestFocusEnabled(false);
        btn_createNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createNewActionPerformed(evt);
            }
        });

        btn_cancle.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn_cancle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancle.gif"))); // NOI18N
        btn_cancle.setText("ยกเลิก");
        btn_cancle.setToolTipText("Cancel all change");
        btn_cancle.setRequestFocusEnabled(false);
        btn_cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancleActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.gif"))); // NOI18N
        btn_save.setText("บันทึกข้อมูล");
        btn_save.setToolTipText("Save or Update Item");
        btn_save.setRequestFocusEnabled(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_remove.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btn_remove.setText("ลบ");
        btn_remove.setToolTipText("Remove Item");
        btn_remove.setRequestFocusEnabled(false);
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        jMenu2.setText("ฟังก์ชันการทำงาน");
        jMenu2.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N

        menu_createNew1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menu_createNew1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menu_createNew1.setText("เพิ่ม (Create New)");
        menu_createNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_createNewActionPerformed(evt);
            }
        });
        jMenu2.add(menu_createNew1);

        menuu_cancle1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuu_cancle1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menuu_cancle1.setText("ยกเลิก (Cancle)");
        menuu_cancle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuu_cancleActionPerformed(evt);
            }
        });
        jMenu2.add(menuu_cancle1);

        menu_save1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menu_save1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menu_save1.setText("บันทึก (Save)");
        menu_save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_saveActionPerformed(evt);
            }
        });
        jMenu2.add(menu_save1);

        menu_remove1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menu_remove1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menu_remove1.setText("ลบ (Remove)");
        menu_remove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_removeActionPerformed(evt);
            }
        });
        jMenu2.add(menu_remove1);

        menu_exit1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menu_exit1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        menu_exit1.setText("ออกจากระบบ");
        menu_exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        jMenu2.add(menu_exit1);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_createNew, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btn_cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_createNew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btn_createNew.getAccessibleContext().setAccessibleName("");
        btn_cancle.getAccessibleContext().setAccessibleName("");
        btn_save.getAccessibleContext().setAccessibleName("");
        btn_remove.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(493, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

    String stk_code = stockCode.getText().trim();
    String stk_desc = stockDesc.getText().trim();
    String mode = displayMode.getText();

    if (stk_code == null || stk_code.equals("")) {
        JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสสต็อก (Code)", "Mycps", JOptionPane.WARNING_MESSAGE);
        stockCode.requestFocus();
    } else if (stk_desc == null || stk_desc.equals("")) {
        JOptionPane.showMessageDialog(this, "กรุณาระบุชื่อชื่อสต็อก (Description)", "Mycps", JOptionPane.WARNING_MESSAGE);
        stockCode.setEditable(false);
        stockDesc.requestFocus();
    } else {
        Stockfile bean = new Stockfile();
        Db_stockfile stkfile = null;
        try {
            stkfile = new Db_stockfile();
        } catch (SQLException ex) {
            Logger.getLogger(jdi_stockfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        bean.setStkcode(stk_code);
        bean.setStkname(stk_desc);

        if (mode.trim().equals("Insert Mode")) {
            if (stkfile.insert(bean)) {
                System.out.print("@@@ insert stock is success @@");
            } else {
                System.out.print("@@@ insert stock is error @@");
            }

        } else if (mode.trim().equals("Edit Mode")) {
            if (stkfile.update(bean)) {
                System.out.print("@@@ update stock is success @@");
            } else {
                System.out.print("@@@ update stock is error @@");
            }
        }
        clearForm();
        try {
            displayStockFile();
        } catch (SQLException ex) {
            Logger.getLogger(jdi_stockfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//GEN-LAST:event_btn_saveActionPerformed

private void stockDescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockDescMouseClicked

    

}//GEN-LAST:event_stockDescMouseClicked

private void btn_cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancleActionPerformed
    clearForm();
}//GEN-LAST:event_btn_cancleActionPerformed

private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed

    int rowSelect = tblStock.getSelectedRow();
    if (rowSelect > 0) {

        if (tblStock_model.getRowCount() == 1) {
            JOptionPane.showMessageDialog(this, "ไม่สามารถลบข้อมูลนี้ได้เนื่องจากมีการกำหนดจำนวนสต็อกสินค้าอย่างน้อย 1 สต็อก", "Mycps warning", JOptionPane.ERROR_MESSAGE);
        } else {

            int confirm = JOptionPane.showConfirmDialog(this, "คุณต้องการลบข้อมูลรายการนี้หรือไม่...?", "Confirm", JOptionPane.YES_NO_OPTION);
            String stkcode_remove = tblStock_model.getValueAt(rowSelect, 0).toString();

            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    Db_stockfile stkFile = new Db_stockfile();
                    if (!stkFile.remove(stkcode_remove)) {
                        JOptionPane.showMessageDialog(this, "ไม่สามารถลบข้อมูลนี้ได้เนื่องจากมีการนำไปใช้งานแล้ว", "Mycps warning", JOptionPane.ERROR_MESSAGE);
                    } else {
                        tblStock_model.removeRow(rowSelect);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(jdi_stockfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            clearForm();
        }


    } else {
        JOptionPane.showMessageDialog(this, "คุณยังไม่ได้เลือกข้อมูลที่ต้องการลบ", "Mysps warning", JOptionPane.WARNING_MESSAGE);
    }
}//GEN-LAST:event_btn_removeActionPerformed

private void tblStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStockMouseClicked

    if (evt.getClickCount() == 2) {
        int rowSelect = tblStock.getSelectedRow();
        String stkcode_display = tblStock_model.getValueAt(rowSelect, 0).toString();
        String stkdesc_display = tblStock_model.getValueAt(rowSelect, 1).toString();
        if (stockCode.getText().equals("")) {
            stockCode.setText(stkcode_display);
            stockDesc.setText(stkdesc_display);
        } else {
            if (!stkcode_display.equals(stockCode.getText())) {
                int confirm = JOptionPane.showConfirmDialog(this, "คุณมีการแก้ไข หรือมีการเพิ่มข้อมูลอยู่.. คุณต้องการยกเลิกการเพิ่มหรือการแก้ไขนี้หรือไม่", "Confirm", JOptionPane.OK_CANCEL_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    stockCode.setText(stkcode_display);
                    stockDesc.setText(stkdesc_display);
                }
            }
        }
        stockCode.setEditable(false);
        displayMode.setText("  Edit Mode");

    }
}//GEN-LAST:event_tblStockMouseClicked

private void stockCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockCodeKeyPressed
}//GEN-LAST:event_stockCodeKeyPressed

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
    btn_saveActionPerformed(evt);
}//GEN-LAST:event_menu_saveActionPerformed

private void menu_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_removeActionPerformed
// TODO add your handling code here:
    btn_removeActionPerformed(evt);
}//GEN-LAST:event_menu_removeActionPerformed

private void btn_createNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createNewActionPerformed
// TODO add your handling code here:
    clearForm();
}//GEN-LAST:event_btn_createNewActionPerformed

private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_menu_exitActionPerformed

private void stockCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockCodeKeyReleased
// TODO add your handling code here:
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           stockDesc.requestFocus();
        }
}//GEN-LAST:event_stockCodeKeyReleased

private void stockDescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockDescKeyReleased

}//GEN-LAST:event_stockDescKeyReleased

private void tblStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblStockKeyReleased

}//GEN-LAST:event_tblStockKeyReleased

private void stockCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stockCodeFocusLost
   stockCodeExit() ;
}//GEN-LAST:event_stockCodeFocusLost

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   if (stockCode.isEnabled()) {
       stockCode.requestFocus();
   }
}//GEN-LAST:event_formWindowActivated

    public void displayStockFile() throws SQLException {

        Db_stockfile stockfile = new Db_stockfile();
        List stock_list = stockfile.displayStockFile();
        int cnt = tblStock_model.getRowCount();
        if (cnt > 0) {
            for (int i = 0; i < cnt; i++) {
                tblStock_model.removeRow(0);
            }
        }
        for (int i = 0; i < stock_list.size(); i++) {
            Stockfile data = (Stockfile) stock_list.get(i);
            String[] aa = {data.getStkcode(), data.getStkname()};
            tblStock_model.addRow(aa);
        }
        displayMode.setText("  Normal Mode");
        stockCode.requestFocus();
    }

    public void clearForm() {
        stockCode.setEnabled(true);
        stockCode.setEditable(true);
        stockCode.setText("");
        stockDesc.setText("");
        stockCode.requestFocus();
        displayMode.setText("  Normal Mode");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    jdi_stockfile dialog = new jdi_stockfile(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(jdi_stockfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancle;
    private javax.swing.JButton btn_createNew;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField displayMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem menu_createNew1;
    private javax.swing.JMenuItem menu_exit1;
    private javax.swing.JMenuItem menu_remove1;
    private javax.swing.JMenuItem menu_save1;
    private javax.swing.JMenuItem menuu_cancle1;
    private javax.swing.JTextField stockCode;
    private javax.swing.JTextField stockDesc;
    private javax.swing.JTable tblStock;
    // End of variables declaration//GEN-END:variables
}
