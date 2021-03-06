package Main.browser;

/*
 * jdi_browseBranchFile.java
 *
 * Created on June 8, 2009, 11:33 AM
 */


import DBcontrol.Db_promotion;
//import masterfile.*;
import Bean.Branchfile;
import Bean.Promotion;
import DBcontrol.Db_branchfile;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author  root
 */
public class jdi_browsePromotion extends javax.swing.JDialog {

    /** Creates new form jdi_browseBranchFile */
    DefaultTableModel model;
    SimpleDateFormat thFmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    SimpleDateFormat enFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    private String promotioncode = "";
    private String promotionDesc = "";

    public jdi_browsePromotion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        model = (DefaultTableModel) tblPromotion.getModel();
        tblPromotion.setShowGrid(true);
        tblPromotion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblPromotion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblPromotion.setRowSelectionAllowed(true);
        tblPromotion.setShowGrid(true);

        tblPromotion.getColumnModel().getColumn(0).setPreferredWidth(140);
        tblPromotion.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblPromotion.getColumnModel().getColumn(2).setPreferredWidth(170);
        tblPromotion.getColumnModel().getColumn(3).setPreferredWidth(170);
        tblPromotion.getColumnModel().getColumn(4).setPreferredWidth(200);
        JTableHeader header = tblPromotion.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 16));
        tblPromotion.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tblPromotion.setRowHeight(25);
        getPromotion();
        tblPromotion.setRowSelectionInterval(0,0);
    }

    private void getPromotion() {
        Db_promotion pro = new Db_promotion();
        List list = pro.getPromotion();        
        int cnt = list.size();
        for (int i = 0; i < cnt; i++) {
            Promotion bean = (Promotion) list.get(i);           
            String[] data = {bean.getCode(), bean.getDescription(),thFmt.format(bean.getStartDate()),thFmt.format(bean.getEndDate()), bean.getStrDay()};
            model.addRow(data);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPromotion = new javax.swing.JTable();
        btn_ok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงรายการโปรโมชั่น (Promotion List)"); // NOI18N
        setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(228, 220, 212));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N

        tblPromotion.setFont(new java.awt.Font("Norasi", 0, 14));
        tblPromotion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Code", "ชื่อโปรโมชั่น/รายการ", "วันที่เริมต้น", "วันที่สิ้นสุด", "วันที่ให้ส่วนลดตามโปรโมชั่น"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPromotion.setRowHeight(20);
        tblPromotion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPromotionMouseClicked(evt);
            }
        });
        tblPromotion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblPromotionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPromotionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblPromotion);
        tblPromotion.getColumnModel().getColumn(0).setResizable(false);
        tblPromotion.getColumnModel().getColumn(1).setResizable(false);
        tblPromotion.getColumnModel().getColumn(2).setResizable(false);
        tblPromotion.getColumnModel().getColumn(3).setResizable(false);
        tblPromotion.getColumnModel().getColumn(4).setResizable(false);

        btn_ok.setFont(new java.awt.Font("Norasi", 0, 14));
        btn_ok.setText("ตกลง (OK)"); // NOI18N
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Norasi", 0, 14));
        jButton1.setForeground(new java.awt.Color(177, 18, 0));
        jButton1.setText("ออก (Exit)"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(703, Short.MAX_VALUE)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(439, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ok)
                    .addComponent(jButton1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_jButton1ActionPerformed

private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
// TODO add your handling code here:
    int row = tblPromotion.getSelectedRow();
    if (row < 0) {
        JOptionPane.showMessageDialog(this, "ไม่มีข้อมูลที่เลือกกรุณาตรวจสอบข้อมูล", "Mycps", JOptionPane.OK_OPTION);
    } else {
       promotioncode = model.getValueAt(row, 0).toString();
       promotionDesc = model.getValueAt(row, 1).toString();        
       dispose();
    }

}//GEN-LAST:event_btn_okActionPerformed

private void tblPromotionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPromotionMouseClicked
// TODO add your handling code here:
    if (evt.getClickCount() == 2) {
        btn_okActionPerformed(null);
    }
}//GEN-LAST:event_tblPromotionMouseClicked

private void tblPromotionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPromotionKeyPressed
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        btn_okActionPerformed(null);
    }
}//GEN-LAST:event_tblPromotionKeyPressed

private void tblPromotionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPromotionKeyReleased
// TODO add your handling code here:
     if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
       dispose();
    }
}//GEN-LAST:event_tblPromotionKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                jdi_browsePromotion dialog = new jdi_browsePromotion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPromotion;
    // End of variables declaration//GEN-END:variables

    public String getPromotioncode() {
        return promotioncode;
    }

    public String getPromotionDesc() {
        return promotionDesc;
    }
}
