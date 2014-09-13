package Main.browser;

import Bean.Groupfile;
import DBcontrol.GroupFileControl;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import utilities.ThaiUtil;

public class jdi_showgroupfile extends javax.swing.JDialog {

    DefaultTableModel model;
    String[] valueSelect;

    public jdi_showgroupfile(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        model = (DefaultTableModel) tblProduct.getModel();
        JTableHeader header = tblProduct.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 16));
        tblProduct.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblProduct.setRowHeight(25);
        displayData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        btn_Ok = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงรายการกลุ่มสินค้า (Group)");
        setFont(new java.awt.Font("Norasi", 0, 14));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        tblProduct.setFont(new java.awt.Font("Norasi", 0, 14));
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสสินค้า", "ชื่อสินค้า"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        tblProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblProductKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProductKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);
        tblProduct.getColumnModel().getColumn(0).setResizable(false);
        tblProduct.getColumnModel().getColumn(1).setResizable(false);

        btn_Ok.setFont(new java.awt.Font("Norasi", 0, 14));
        btn_Ok.setText("ตกลง (OK)");
        btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OkActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Norasi", 0, 14));
        jButton2.setText("ออก (Exit)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Ok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_Ok)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-350)/2, (screenSize.height-440)/2, 350, 440);
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_jButton2ActionPerformed

private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
// TODO add your handling code here:
}//GEN-LAST:event_formWindowGainedFocus

private void btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OkActionPerformed
// TODO add your handling code here:
    int rowSelect = tblProduct.getSelectedRow();
    if (rowSelect < 0) {
        JOptionPane.showMessageDialog(this, "กรุณาเลือกข้อมูลที่ต้องการก่อน");
    } else {
        setValueFromShowGroupFile();
    }
}//GEN-LAST:event_btn_OkActionPerformed
    public String[] getValueFromShowGroupFile() {
        return valueSelect;
    }
private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
// TODO add your handling code here:
    if (evt.getClickCount() == 2) {
        setValueFromShowGroupFile();
    }
}//GEN-LAST:event_tblProductMouseClicked

private void tblProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductKeyReleased
// TODO add your handling code here:
    
}//GEN-LAST:event_tblProductKeyReleased

private void tblProductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductKeyPressed
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        int rowSelect = tblProduct.getSelectedRow();
        valueSelect = new String[2];
        valueSelect[0] = model.getValueAt(rowSelect, 0).toString();
        valueSelect[1] = model.getValueAt(rowSelect, 1).toString();
        dispose();
    } 
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        valueSelect = new String[2];
        valueSelect[0] = "";
        valueSelect[1] = "";
        dispose() ;
    }
}//GEN-LAST:event_tblProductKeyPressed
    public void setValueFromShowGroupFile() {
        int rowSelect = tblProduct.getSelectedRow();
        valueSelect = new String[2];
        valueSelect[0] = model.getValueAt(rowSelect, 0).toString();
        valueSelect[1] = model.getValueAt(rowSelect, 1).toString();
        dispose();
    }

    public void displayData() {
        try {
            GroupFileControl gf = new GroupFileControl();
            //Groupfile gp = new Groupfile();
            List list = gf.displayGroupfile();
            for (int i = 0; i < list.size(); i++) {
                Groupfile gp = (Groupfile) list.get(i);
                String[] data = {gp.getGroupCode(), ThaiUtil.ASCII2Unicode(gp.getGroupName())};
                model.addRow(data);
            }

        } catch (Exception e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                jdi_showgroupfile dialog = new jdi_showgroupfile(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Ok;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduct;
    // End of variables declaration//GEN-END:variables
}
