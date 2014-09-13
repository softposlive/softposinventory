package Main.browser;

import DBcontrol.MySQLConnect;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import utilities.TableTestFormatRenderer;


public class Jdi_browse_vender extends javax.swing.JDialog {
    Frame parent;
    /** Creates new form ShowDialog */
    public Jdi_browse_vender(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTableShow();
        this.parent = parent;
        Thread t = new Thread(){
            public void run(){
                loadDataToGrid(0);
                
            }
        };
        t.start();
         
        txt1.setText("");
        txt2.setText("");
        
        
    }

    public Jdi_browse_vender(java.awt.Frame parent, boolean modal,boolean b) {
        super(parent, modal);
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception e){
            e.printStackTrace();
        }
        initComponents();
        setTableShow();
        
        loadDataToGrid(0);
        
        txt1.setText("");
        txt2.setText("");
        if(tblShow.getRowCount()!=0)
            tblShow.setRowSelectionInterval(0, 0);
        
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        cb = new javax.swing.JComboBox();
        cmdExit = new javax.swing.JButton();
        cmdOk = new javax.swing.JButton();
        txtRowCount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงรายการสินค้า (Product List)");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        tblShow.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        tblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส (Code)", "บริษัท / ชื่อผู้จัดจำหน่าย", "ที่อยู่เลขที่", "ตำบล / แขวง", "อำเภอ / เขต", "จังหวัด", "รหัสไปษณีย์", "email address", "โทรศัพท์", "โทรสาร (Fax)", "ประเภทธุรกิจ", "ผู้ติดต่อ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel1.setText("หาตามรหัสสินค้า");

        txt1.setFont(new java.awt.Font("Norasi", 0, 14));
        txt1.setText("txt1");
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt1FocusGained(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Norasi", 1, 14));
        jLabel2.setText("หาตามชื่อสินค้า");

        txt2.setFont(new java.awt.Font("Norasi", 0, 14));
        txt2.setText("txt2");
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

        cb.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "แสดงเรียงตามรหัสผู้จัดจำหน่าย", "แสดงเรียงตามชื่อผู้จัดจำหน่าย" }));
        cb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbItemStateChanged(evt);
            }
        });
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        cb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cmdExit.setFont(new java.awt.Font("Norasi", 1, 14));
        cmdExit.setText("ออก (Exit)");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });
        cmdExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdExitKeyPressed(evt);
            }
        });

        cmdOk.setFont(new java.awt.Font("Norasi", 1, 14));
        cmdOk.setText("ตกลง (OK)");
        cmdOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOkActionPerformed(evt);
            }
        });
        cmdOk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdOkKeyPressed(evt);
            }
        });

        txtRowCount.setEditable(false);
        txtRowCount.setFont(new java.awt.Font("Norasi", 0, 14));
        txtRowCount.setForeground(new java.awt.Color(44, 0, 255));
        txtRowCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRowCount.setText("จำนวนทั้งหมด 9,000,000 รายการ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                .addComponent(cmdOk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cmdOk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-900)/2, (screenSize.height-475)/2, 900, 475);
    }// </editor-fold>//GEN-END:initComponents

private void tblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowMouseClicked
    if(evt.getClickCount()==2){
        cmdOkActionPerformed(new ActionEvent(new Object(),0,""));
    }
}//GEN-LAST:event_tblShowMouseClicked

private void tblShowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblShowKeyPressed
    cmdOkActionPerformed(new ActionEvent(new Object(),0,""));
    
}//GEN-LAST:event_tblShowKeyPressed

private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
    if(evt.getKeyCode() == evt.VK_ENTER){
        tblShow.requestFocus();
    }
    escapeEvent(evt);  
    
}//GEN-LAST:event_txt1KeyPressed

private void cbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbItemStateChanged
    
}//GEN-LAST:event_cbItemStateChanged

private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
    SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                loadDataToGrid(cb.getSelectedIndex());
                clearTable();
                if(tblShow.getRowCount()!=0)
                    tblShow.setRowSelectionInterval(0, 0);
            }
    });
    
}//GEN-LAST:event_cbActionPerformed

private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
 
}//GEN-LAST:event_txt1ActionPerformed

private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased

    setSelectSearch(0, txt1.getText());

}//GEN-LAST:event_txt1KeyReleased

private void txt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyReleased
    setSelectSearch(1,txt2.getText());
}//GEN-LAST:event_txt2KeyReleased

private void cmdOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOkActionPerformed
    int index = tblShow.getSelectedRow();
        if (index != -1) {
            vcode = (String) tblShow.getValueAt(index, 0);
            vname = (String) tblShow.getValueAt(index, 1);
            dispose();
        }

}//GEN-LAST:event_cmdOkActionPerformed

private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
    dispose();
}//GEN-LAST:event_cmdExitActionPerformed

private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
    if(evt.getKeyCode() == evt.VK_ENTER){
        tblShow.requestFocus();
    }
    escapeEvent(evt);  
}//GEN-LAST:event_txt2KeyPressed

private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    escapeEvent(evt);  
}//GEN-LAST:event_formKeyPressed

private void cbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbKeyPressed
    escapeEvent(evt);  
    if(evt.getKeyCode() == evt.VK_ENTER){
        tblShow.requestFocus();
    }
}//GEN-LAST:event_cbKeyPressed

private void cmdOkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdOkKeyPressed
    escapeEvent(evt);  
}//GEN-LAST:event_cmdOkKeyPressed

private void cmdExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdExitKeyPressed
    escapeEvent(evt);  
}//GEN-LAST:event_cmdExitKeyPressed

private void txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1FocusGained
    txt1.selectAll();
}//GEN-LAST:event_txt1FocusGained

private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained
    txt2.selectAll();
}//GEN-LAST:event_txt2FocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jdi_browse_vender dialog = new Jdi_browse_vender(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cb;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblShow;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txtRowCount;
    // End of variables declaration//GEN-END:variables
    
    private DefaultTableModel model;
    private String vcode;
    private SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy" ,Locale.ENGLISH);
    private DecimalFormat IntegerFmt = new DecimalFormat("##,###,##0");
    private String vname;
    public void clearTable(){
        for(int i=0; i<tblShow.getRowCount(); i++){
            model.removeRow(0);
        }
    }
    
    public String getVcode() {
        return vcode;
    }
    public String getVname() {
        return vname;
    }
    
    private void setTableShow() {
        //Setting column size
        model = (DefaultTableModel) tblShow.getModel();
        tblShow.setShowGrid(true);
        tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblShow.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblShow.setRowSelectionAllowed(true);
        tblShow.setShowGrid(true);
        tblShow.setBackground(Color.WHITE);
        tblShow.setGridColor(Color.LIGHT_GRAY);
        
        JTableHeader header = tblShow.getTableHeader();
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 14));
        tblShow.setFont(new java.awt.Font("Norasi" , java.awt.Font.PLAIN ,14));
        tblShow.setRowHeight(25);
        
        //Setting column size
        TableColumn column = null;
        int[] colSize = {90, 300, 300, 150, 150,150,100,250,200,200,300,150};
        tblShow.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < colSize.length; i++) {
            column = tblShow.getColumnModel().getColumn(i);
            column.setPreferredWidth(colSize[i]);
        }
        DecimalFormat DoubleFmt = new DecimalFormat("##,###,##0.00");
        DecimalFormat IntegerFmt = new DecimalFormat("##,###,##0");
        DecimalFormat PersentFmt = new DecimalFormat("#,##0.00%");
        
        TableColumnModel tcm = tblShow.getColumnModel();
        
        TableTestFormatRenderer r;
        DefaultTableCellRenderer d;
        
        d = new DefaultTableCellRenderer();
        d.setHorizontalAlignment(SwingConstants.LEADING);
        tcm.getColumn(0).setCellRenderer(d);
        tcm.getColumn(1).setCellRenderer(d);
        tcm.getColumn(2).setCellRenderer(d);
        tcm.getColumn(3).setCellRenderer(d);
        tcm.getColumn(4).setCellRenderer(d);
        tcm.getColumn(5).setCellRenderer(d);
        tcm.getColumn(6).setCellRenderer(d);
        tcm.getColumn(7).setCellRenderer(d);
        tcm.getColumn(8).setCellRenderer(d);
        tcm.getColumn(9).setCellRenderer(d);
        tcm.getColumn(10).setCellRenderer(d);
        tcm.getColumn(11).setCellRenderer(d);
    }
    
    private String getSQL(String sort){
        return "SELECT * FROM vender Order by "+sort;
    }
    
    
    private void loadDataToGrid(int index){
        switch (index){
            case 0:
                loadDataToGrid(getSQL("vcode"));
                break;
                
            case 1:
                loadDataToGrid(getSQL("vname"));
                break;
                
            
        }
        
        
    }
    private void loadDataToGrid(String sql) {
  
        System.out.println(sql);
     
        try {
            ResultSet rs = MySQLConnect.con.createStatement().executeQuery(sql);
            
            if (rs != null) {
                
                Object[] row = null;
                row = new Object[14];
                int i = 0;
                while (rs.next()){    
                    
                    row[0] = rs.getString("vcode");                   
                    row[1] = rs.getString("vname");  
                    row[2] = rs.getString("vaddress");
                    row[3] = rs.getString("vsubprovince");
                    row[4] = rs.getString("vprovince");
                    row[5] = rs.getString("vcity");
                    row[6] = rs.getString("vpost");
                    row[7] = rs.getString("vemail");
                    row[8] = rs.getString("vtel");
                    row[9] = rs.getString("vfax");
                    row[10] = rs.getString("vbustype");
                    row[11] = rs.getString("vcontack");
                    model.addRow(row);
                    txtRowCount.setText("จำนวดทั้งหมด "+IntegerFmt.format(++i)+" รายการ");
                    if(model.getRowCount() == 1)
                        tblShow.setRowSelectionInterval(0, 0); 
                }
            } else{}
            

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        
    }
    
    private void setSelectSearch(int col,String text) {
        //System.out.println(text);
        int rowcount = tblShow.getRowCount();
        for (int i = 0; i < rowcount; i++) {
            String field = (String) tblShow.getValueAt(i, col);
            
            if (searchRow(field,text)) {
                //System.out.println("Found " + i);
                try{
                    tblShow.setRowSelectionInterval(i, i); 
                    tblShow.scrollRectToVisible(tblShow.getCellRect(i, 0, true));
                }catch(Exception ex){
                    
                }
                break;
            }
        }

    }
    private boolean searchRow(String f, String t){
        String temp = "";       
        for(int i=0; i<f.length(); i++){
            char ch = f.charAt(i);
            temp += ch;
            temp = temp.toLowerCase();
            t = t.toLowerCase();
            if(temp.equals(t)){
                //JOptionPane.showMessageDialog(this, f+".\n"+t+".");
                return true;
            }            
        }
        return false;
    }
    
    private void escapeEvent(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == evt.VK_ESCAPE) {
            dispose();
        }

    }
    private void escapeProEvent(java.awt.event.KeyEvent evt){
        if (evt.getKeyCode() == evt.VK_ESCAPE) {
            txt1.requestFocus();
            
        }
    }
}