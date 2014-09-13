package program;

import DBcontrol.Db_employee;
import DBcontrol.MySQLConnect;
import Bean.Employee;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class jdi_employee extends javax.swing.JDialog {
    private DefaultTableModel tblProduct_model;

    public jdi_employee(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tblProduct_model = (DefaultTableModel) tblProduct.getModel();
        tblProduct.setShowGrid(true);
        tblProduct.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblProduct.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblProduct.setRowSelectionAllowed(true);
        tblProduct.setShowGrid(true);
        tblProduct.setGridColor(Color.gray);

        tblProduct.getColumnModel().getColumn(0).setPreferredWidth(130);
        tblProduct.getColumnModel().getColumn(1).setPreferredWidth(320);
        JTableHeader header = tblProduct.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 16));
        tblProduct.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblProduct.setRowHeight(25);
        displayMemberFile();
    }

    public void pcodeExit() {
        if (pcharge.getText() != null && !pcharge.getText().equals("")) {
            if (pcharge.getText().length() <= 13) {
                int rowCount = tblProduct_model.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    String search = tblProduct_model.getValueAt(i, 0).toString();
                    if (search.compareTo(pcharge.getText()) == 0) {
                        pname.setText(tblProduct_model.getValueAt(i, 1).toString());
                        displayMode.setText("  Edit Mode");
                        tblProduct.clearSelection();
                        tblProduct.setRowSelectionInterval(i, i);
                        tblProduct.scrollRectToVisible(tblProduct.getCellRect(i, 0, true));
                        break;
                    } else {
                        displayMode.setText("  Insert Mode");
                    }
                }
                pcharge.setEditable(false);
                pname.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสกลุ่ม (Code) ไม่เกิน 13 ตัว", "Mycps", JOptionPane.OK_OPTION);

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
        pcharge = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        displayMode = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btn_cancle = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_createNew = new javax.swing.JMenuItem();
        menuu_cancle = new javax.swing.JMenuItem();
        menu_save = new javax.swing.JMenuItem();
        menu_remove = new javax.swing.JMenuItem();
        menu_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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
        setTitle("กำหนดรายชื่อพนักงาน (Employee Charge)");
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
        jLabel1.setText("หมายเลขชาร์จ (Code)");

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("ชื่อพนักงาน (Name)");

        pcharge.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        pcharge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pchargeFocusGained(evt);
            }
        });
        pcharge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pchargeKeyPressed(evt);
            }
        });

        pname.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        pname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnameMouseClicked(evt);
            }
        });
        pname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnameKeyReleased(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(pcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(displayMode, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(pcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayMode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        tblProduct.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "หมายเลขชาร์จ(Code)", "ชื่อพนักงาน (Name)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduct.setRowHeight(20);
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        tblProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProductKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduct);
        if (tblProduct.getColumnModel().getColumnCount() > 0) {
            tblProduct.getColumnModel().getColumn(0).setResizable(false);
            tblProduct.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.gif"))); // NOI18N
        jButton1.setText("เพิ่ม");
        jButton1.setToolTipText("Create new item");
        jButton1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_cancle.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn_cancle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancle.gif"))); // NOI18N
        btn_cancle.setText("ยกเลิก");
        btn_cancle.setToolTipText("Cancel all change");
        btn_cancle.setMargin(new java.awt.Insets(1, 1, 1, 1));
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
        btn_save.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_remove.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        btn_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btn_remove.setText("ลบ");
        btn_remove.setToolTipText("Remove Item");
        btn_remove.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btn_remove.setRequestFocusEnabled(false);
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        jMenu1.setText("ฟังก์ชันการทำงาน");
        jMenu1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N

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
        menu_exit.setText("กลับสู่หน้าจอหลัก");
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        jMenu1.add(menu_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("รายงาน (Report)");
        jMenu2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jMenuItem1.setText("พิมพ์รายงานกลุ่มสินค้า");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btn_cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(491, 696));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
    String p_code = pcharge.getText().trim();
    String p_desc = pname.getText().trim();
    String mode = displayMode.getText();

    if (p_code == null || p_code.equals("")) {
        JOptionPane.showMessageDialog(this, "กรุณาระบุหมายเลขชาร์จ(Code)", "Mycps", JOptionPane.WARNING_MESSAGE);
        pcharge.requestFocus();
    } else if (p_desc == null || p_desc.equals("")) {
        JOptionPane.showMessageDialog(this, "กรุณาระบุชื่อพนักงาน (Name)", "Mycps", JOptionPane.WARNING_MESSAGE);
        pcharge.setEditable(false);
        pname.requestFocus();
    } else {

        Db_employee emp = new Db_employee();
        if (mode.trim().equals("Insert Mode")) {
            try {
                emp.isInsertMemberfile(p_code, p_desc);
            } catch (SQLException ex) {
                Logger.getLogger(jdi_employee.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (mode.trim().equals("Edit Mode")) {
            emp.isUpdateMemberfile(p_code, p_desc);
        }
        clearForm();
        displayMemberFile();
    }
}//GEN-LAST:event_btn_saveActionPerformed
    public static void main(String[] args) {
        jdi_employee emp = new jdi_employee(null, true);
        emp.setVisible(true);
    }
private void pnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnameMouseClicked
}//GEN-LAST:event_pnameMouseClicked

private void btn_cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancleActionPerformed
    clearForm();
    displayMode.setText("  Insert Mode");
}//GEN-LAST:event_btn_cancleActionPerformed

private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
    int rowSelect = tblProduct.getSelectedRow();
    if (rowSelect > -1) {
        int confirm = JOptionPane.showConfirmDialog(this, "คุณต้องการลบข้อมูลรายการนี้หรือไม่...?", "Confirm", JOptionPane.YES_NO_OPTION);
        String pcode_remove = tblProduct_model.getValueAt(rowSelect, 0).toString();

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String sql = "delete from employee where emp_code='"+pcode_remove+"'";
                String sql_chk = "select emp_code from hcharge " +
                        "where emp_code='"+pcode_remove+"'";
                Statement stmtRemove = MySQLConnect.con.createStatement();
                ResultSet rsChk = stmtRemove.executeQuery(sql_chk);
                if(!rsChk.next()){
                    int iRemove = stmtRemove.executeUpdate(sql);
                    if(iRemove>0){                        
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "ข้อมูลถูกนำไปใช้งานแล้ว ไม่สามารถลบข้อมูลได้ !");
                }
                rsChk.close();
                stmtRemove.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        clearForm();
        displayMemberFile();
    } else {
        JOptionPane.showMessageDialog(this, "คุณยังไม่ได้เลือกข้อมูลที่ต้องการลบ", "Mysps", JOptionPane.OK_OPTION);
    }
}//GEN-LAST:event_btn_removeActionPerformed

private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked

    if (evt.getClickCount() == 2) {
        int rowSelect = tblProduct.getSelectedRow();
        String pcode_display = tblProduct_model.getValueAt(rowSelect, 0).toString();
        String pdesc_display = tblProduct_model.getValueAt(rowSelect, 1).toString();
        if (pcharge.getText().equals("")) {
            pcharge.setText(pcode_display);
            pname.setText(pdesc_display);
        } else {
            if (!pcode_display.equals(pcharge.getText())) {
                int confirm = JOptionPane.showConfirmDialog(this, "คุณมีการแก้ไข หรือมีการเพิ่มข้อมูลอยู่.. คุณต้องการยกเลิกการเพิ่มหรือการแก้ไขนี้หรือไม่", "Confirm", JOptionPane.OK_CANCEL_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    pcharge.setText(pcode_display);
                    pname.setText(pdesc_display);
                }
            }
        }

        pcharge.setEditable(false);
        displayMode.setText("  Edit Mode");

    }
}//GEN-LAST:event_tblProductMouseClicked

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

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    clearForm();
    displayMode.setText("  Insert Mode");
}//GEN-LAST:event_jButton1ActionPerformed

private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_menu_exitActionPerformed

private void pnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyReleased
// TODO add your handling code here:
}//GEN-LAST:event_pnameKeyReleased

private void tblProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductKeyReleased
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        dispose();
    }
}//GEN-LAST:event_tblProductKeyReleased

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    if (pcharge.isEnabled()) {
        pcharge.requestFocus();
    }
}//GEN-LAST:event_formWindowActivated

private void pnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        btn_save.requestFocus();
    }
}//GEN-LAST:event_pnameKeyPressed

private void pchargeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pchargeKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        if(!pcharge.getText().equals("")){
            try {
                String sql = "select * from employee " +
                        "where emp_code='"+pcharge.getText()+"'";
                Statement stmt = MySQLConnect.con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){
                    pname.setText(rs.getString("emp_name"));
                    displayMode.setText("  Edit Mode");
                    pname.requestFocus();
                    for(int i=0;i<tblProduct.getRowCount();i++){
                        String emp_code=tblProduct.getValueAt(i, 0).toString();
                        if(pcharge.getText().equals(emp_code)){
                            tblProduct.setRowSelectionAllowed(true);
                            tblProduct.setColumnSelectionAllowed(false);
                            tblProduct.setRowSelectionInterval(i, i);
                            break;
                        }
                    }
                }else{
                    pname.requestFocus();
                }
                rs.close();
                stmt.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(this, "กรุณาระบุหมายเลขชาร์จด้วย");
            pcharge.requestFocus();            
        }
    }
}//GEN-LAST:event_pchargeKeyPressed

private void pchargeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pchargeFocusGained
    if(pcharge.getText().equals("")){
        displayMode.setText("  Insert Mode");
    }
}//GEN-LAST:event_pchargeFocusGained

    public void displayMemberFile() {
        Db_employee db_emp = new Db_employee();
        List emp = db_emp.displayMemberfile();
        int cnt = tblProduct_model.getRowCount();
        if (cnt > 0) {
            for (int i = 0; i < cnt; i++) {
                tblProduct_model.removeRow(0);
            }
        }
        for (int i = 0; i < emp.size(); i++) {
            Employee data = (Employee) emp.get(i);
            String[] aa = {data.getEmpCode(), data.getEmpName()};
            tblProduct_model.addRow(aa);
        }
        displayMode.setText("  Normal Mode");
        pcharge.requestFocus();
    }

    public void clearForm() {
        pcharge.setEnabled(true);
        pcharge.setEditable(true);
        pcharge.setText("");
        pname.setText("");
        pcharge.requestFocus();
        displayMode.setText("  Normal Mode");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancle;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField displayMode;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
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
    private javax.swing.JTextField pcharge;
    private javax.swing.JTextField pname;
    private javax.swing.JTable tblProduct;
    // End of variables declaration//GEN-END:variables
}
