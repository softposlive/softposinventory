package Main.browser;

import DBcontrol.Db_employee;
import Bean.Employee;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import utilities.ThaiUtil;

public class jdi_browse_mem extends javax.swing.JDialog {
    public DefaultTableModel model=null;

    public jdi_browse_mem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);     
        initComponents();
        setTableShow();

        loadMember();
    }
    private void setTableShow() {
        //Setting column size
        model = (DefaultTableModel) tbl_member.getModel();
        model.addTableModelListener(new TableModelListener() {

            public void tableChanged(TableModelEvent e) {
                count.setText("สมาชิก : "+model.getRowCount());
            }
        });
        tbl_member.setShowGrid(true);
        tbl_member.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbl_member.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbl_member.setRowSelectionAllowed(true);
        tbl_member.setShowGrid(true);
        tbl_member.setGridColor(Color.black);
        JTableHeader header = tbl_member.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tbl_member.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tbl_member.setRowHeight(25);
        //Setting column size
        TableColumn column = null;
        int[] colSize = {150, 350};
        //tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tbl_member.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_member = new javax.swing.JTable();
        count = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbl_member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "หมายเลขชาร์จ", "ชื่อพนักงาน"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_memberMouseClicked(evt);
            }
        });
        tbl_member.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_memberKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_member);
        tbl_member.getColumnModel().getColumn(0).setMinWidth(80);
        tbl_member.getColumnModel().getColumn(0).setMaxWidth(80);
        tbl_member.getColumnModel().getColumn(1).setMinWidth(200);
        tbl_member.getColumnModel().getColumn(1).setMaxWidth(200);

        count.setFont(new java.awt.Font("Norasi", 0, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(count))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-357)/2, (screenSize.height-503)/2, 357, 503);
    }// </editor-fold>//GEN-END:initComponents

    private String m_code = "";
    private String m_name = "";

    public String[] getEmployee(){
        return new String[]{m_code,m_name};
    }
    private void setEmployee(String m_code, String m_name){
        this.m_code=m_code;
        this.m_name=m_name;
    }

    private void tbl_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_memberMouseClicked
        if(evt.getClickCount()==2){
            int rowSelect = tbl_member.getSelectedRow();
            if(rowSelect!=-1){
                String mc = ""+tbl_member.getValueAt(rowSelect, 0);
                String mn = ""+tbl_member.getValueAt(rowSelect, 1);
                setEmployee(mc, mn);
            }
            dispose();
        }
    }//GEN-LAST:event_tbl_memberMouseClicked

    private void tbl_memberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_memberKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            int rowSelect = tbl_member.getSelectedRow();
            if(rowSelect!=-1){
                String m_code = ""+tbl_member.getValueAt(rowSelect, 0);
                String m_name = ""+tbl_member.getValueAt(rowSelect, 1);
                setEmployee(m_code, m_name);
            }
            dispose();
        }else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            dispose();
        }
    }//GEN-LAST:event_tbl_memberKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdi_browse_mem dialog = new jdi_browse_mem(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel count;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_member;
    // End of variables declaration//GEN-END:variables

    private void loadMember() {
        model = (DefaultTableModel) tbl_member.getModel();
        Db_employee db = new Db_employee();
        ArrayList<Employee> arr = db.loadEmployee();
        for(int i=0;i<arr.size();i++){
            Employee bean = (Employee)arr.get(i);
            model.addRow(new Object[]{bean.getEmpCode(), ThaiUtil.ASCII2Unicode(bean.getEmpName())});
        }
    }

}
