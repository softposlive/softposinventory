package Main.browser;

import DBcontrol.Db_hadjstock;
import DBcontrol.Db_hconvert;
import Bean.Hconvert;
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


public class Jdi_browse_hconvert extends javax.swing.JDialog {

    public Jdi_browse_hconvert(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTableShow();
        
        loadDataToGrid();
        if(tblConvert.getRowCount()!=0){
            tblConvert.setRowSelectionInterval(0, 0);
        }else{
            tblConvert.requestFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblConvert = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงรายการสินค้าแปรรูปที่ยังไม่ได้บันทึกตัดสต็อก");
        setResizable(false);

        tblConvert.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่ (Date)", "เลขที่เอกสาร", "หมายเหตุ", "จำนวนรายการ", "ผู้บันทึก"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConvert.setRowHeight(25);
        tblConvert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConvertMouseClicked(evt);
            }
        });
        tblConvert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblConvertKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblConvert);

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

private void tblConvertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConvertMouseClicked
    if(evt.getClickCount()==2){
        int index = tblConvert.getSelectedRow();
        Db_hconvert hr = null;
            try {
                hr = new Db_hconvert();
                dataRecord = hr.getRecordAt((String)tblConvert.getValueAt(index, 1));
                dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
    }
}//GEN-LAST:event_tblConvertMouseClicked

private void tblConvertKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblConvertKeyPressed
    if(evt.getKeyCode() == evt.VK_ENTER){
        int index = tblConvert.getSelectedRow();
        if (index != -1) {
            Db_hconvert hr = null;
            try {
                hr = new Db_hconvert();
                dataRecord = hr.getRecordAt((String) tblConvert.getValueAt(index, 1));
                dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    if(evt.getKeyCode() == evt.VK_ESCAPE){
        dispose();
    }
}//GEN-LAST:event_tblConvertKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jdi_browse_hconvert dialog = new Jdi_browse_hconvert(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable tblConvert;
    // End of variables declaration//GEN-END:variables
    
    private DefaultTableModel model;
    private Hconvert dataRecord;
    private SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy" ,Locale.ENGLISH);

    public Hconvert getDataRecord() {
        return dataRecord;
    }
 
    private void setTableShow() {
        //Setting column size
        model = (DefaultTableModel) tblConvert.getModel();
        tblConvert.setShowGrid(true);
        tblConvert.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblConvert.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblConvert.setRowSelectionAllowed(true);
        tblConvert.setShowGrid(true);
        tblConvert.setGridColor(Color.black);
        
        JTableHeader header = tblConvert.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblConvert.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tblConvert.setRowHeight(25);
        
        //Setting column size
        TableColumn column = null;
        int[] colSize = {90, 130 , 250, 100, 100};
        //tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblConvert.getColumnModel().getColumn(i);
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
            sql = "SELECT * FROM hconvert WHERE r_post = 'N' Order by r_date desc";
            ResultSet rs = hr.getStmt().executeQuery(sql);
            
            if (rs != null) {
                
                Object[] row = new Object[tblConvert.getColumnCount()];
                while (rs.next()){                        
                    row[0] = dateFmtShow.format(rs.getDate("r_date"));                   
                    row[1] = rs.getString("r_no");
                    row[2] = rs.getString("r_remark");
                    row[3] = rs.getInt("r_total");
                    row[4] = rs.getString("r_userpost");
                    
                    model.addRow(row);
                }
            } else{}
            

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    
}
