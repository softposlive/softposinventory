package Main.browser;

import Bean.Hadjstock;
import DBcontrol.Db_hadjstock;
import DBcontrol.MySQLConnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;


public class Jdi_browse_hadjstock extends javax.swing.JDialog {

    public Jdi_browse_hadjstock(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTableShow();

        loadDataToGrid();
        if(tblShow.getRowCount()!=0){
            tblShow.setRowSelectionInterval(0, 0);
        }else{
            tblShow.requestFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงรายการใบรับสินค้าจากโรงงานที่ยังไม่ได้บันทึกตัดสต็อก");
        setResizable(false);

        tblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่ (Date)", "เลขที่เอกสาร", "คลัง", "หมายเหตุ", "จำนวนรายการ", "ผู้บันทึก"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblShow.setRowHeight(25);
        tblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowMouseClicked(evt);
            }
        });
        tblShow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblShowKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblShow);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-934)/2, (screenSize.height-427)/2, 934, 427);
    }// </editor-fold>//GEN-END:initComponents

private void tblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowMouseClicked
    if(evt.getClickCount()==2){
        int index = tblShow.getSelectedRow();
        Db_hadjstock hr = null;
            try {
                hr = new Db_hadjstock();
                dataRecord = hr.getRecordAt((String)tblShow.getValueAt(index, 1));
                dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
    }
}//GEN-LAST:event_tblShowMouseClicked

private void tblShowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblShowKeyPressed
    if(evt.getKeyCode() == evt.VK_ENTER){
        int index = tblShow.getSelectedRow();
        if (index != -1) {
            Db_hadjstock hr = null;
            try {
                hr = new Db_hadjstock();
                dataRecord = hr.getRecordAt((String) tblShow.getValueAt(index, 1));
                dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    if(evt.getKeyCode() == evt.VK_ESCAPE){
        dispose();
    }
}//GEN-LAST:event_tblShowKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jdi_browse_hadjstock dialog = new Jdi_browse_hadjstock(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblShow;
    // End of variables declaration//GEN-END:variables
    
    private DefaultTableModel model;
    private Hadjstock dataRecord;
    private SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy" ,Locale.ENGLISH);

    public Hadjstock getDataRecord() {
        return dataRecord;
    }
 
    private void setTableShow() {
        //Setting column size
        model = (DefaultTableModel) tblShow.getModel();
        tblShow.setShowGrid(true);
        tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblShow.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblShow.setRowSelectionAllowed(true);
        tblShow.setShowGrid(true);
        tblShow.setGridColor(Color.black);
        
        JTableHeader header = tblShow.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblShow.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tblShow.setRowHeight(25);
        
        //Setting column size
        TableColumn column = null;
        int[] colSize = {90, 130 ,60, 250, 100, 100};
        //tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblShow.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }
        DecimalFormat DoubleFmt = new DecimalFormat("##,###,##0.00");
        DecimalFormat IntegerFmt = new DecimalFormat("##,###,##0");
        DecimalFormat PersentFmt = new DecimalFormat("#,##0.00%");
        
        
        
    }
    
    private void loadDataToGrid() {
        
        Db_hadjstock hr = null;
        String sql = null;
        
        try {
            hr = new Db_hadjstock ();
            sql = "SELECT * FROM hadjstock WHERE r_post = 'N' Order by r_date desc";
            ResultSet rs = hr.getStmt().executeQuery(sql);
            
            if (rs != null) {
                
                Object[] row = new Object[tblShow.getColumnCount()];
                while (rs.next()){    
                    
                    row[0] = dateFmtShow.format(rs.getDate("r_date"));                   
                    row[1] = rs.getString("r_no");  
                    row[2] = rs.getString("r_stk");
                    row[3] = rs.getString("r_remark");
                    row[4] = rs.getInt("r_total");
                    row[5] = rs.getString("r_userpost");    
                    
                    model.addRow(row);
                }
            } else{}
            

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    
}
