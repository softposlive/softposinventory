package Main.viewreport;


import Bean.Product;
import DBcontrol.Db_product;
import DBcontrol.MySQLConnect;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import utilities.ThaiUtil;

public class Jdi_Inv_product extends javax.swing.JDialog {

    DefaultTableModel model;
    static SimpleDateFormat Datefmtshow = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private Product dataRecord;

    /** Creates new form FindMember */
    public Jdi_Inv_product(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        Font myfont = new Font("Norasi", Font.PLAIN, 14);
        UIManager.put("Label.font", myfont);
        UIManager.put("Button.font", myfont);
        initComponents();
        model = (DefaultTableModel) tblShowMember.getModel();
        tblShowMember.setShowGrid(true);
        tblShowMember.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblShowMember.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblShowMember.setRowSelectionAllowed(true);
        tblShowMember.setShowGrid(true);
        tblShowMember.setGridColor(Color.gray);

        JTableHeader header = tblShowMember.getTableHeader();
        header.setBackground(Color.yellow);
        header.setFont(new java.awt.Font("Norasi", java.awt.Font.PLAIN, 16));

        int[] ColSize = {50,80, 80, 250, 80, 80, 80, 80,80,80};
        for (int i = 0; i < 10; i++) {
            int vColIndex = 0;
            TableColumn col = tblShowMember.getColumnModel().getColumn(i);
            col.setPreferredWidth(ColSize[i]);
        }
        ActivateModule();
        bntShowMemberAllClick() ;
    }
    
    public void ActivateModule() {
        //Clear Variable
        TMemCode.setText("");
        TMemName.setText("");
        TMemTel.setText("");
        ClearGrid();
        TMemTel.requestFocus();
       
    }
   

    public void ClearGrid() {
        int RowCount = model.getRowCount();
        for (int i = 0; i <= RowCount - 1; i++) {
            model.removeRow(0);
        }
    }
    public String ChkValidDate(Date tdate) {
        String ReturnValue = "00/00/0000" ;
        try {
            ReturnValue = Datefmtshow.format(tdate) ; 
        } catch (Exception e) {
            ReturnValue = "00/00/0000" ;
        }
        return ReturnValue ;
    }
    public void bntShowMemberAllClick() {
        int LineCnt = 1 ;
        try { 
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String LoadTableFile = "select *from product where pstock='Y' and pactive='Y' " +
                    "order by pgroup,pcode ";
            ResultSet rec = stmt.executeQuery(LoadTableFile);
            Date dt = new Date();
            ClearGrid() ;
            rec.first();
            if (rec.getRow() == 0) {
                 JOptionPane.showMessageDialog(this,"ไม่พบข้อมูลสินค้า ตามที่ต้องการ...");
            } else {
                do {
                   try {
                    Object[] input = {
                        LineCnt,
                        rec.getString("pgroup"),
                        rec.getString("pcode"),
                        ThaiUtil.ASCII2Unicode(rec.getString("pdesc")),
                        ThaiUtil.ASCII2Unicode(rec.getString("punit1")),
                        rec.getDouble("pprice11"),
                        rec.getDouble("pprice12"),
                        rec.getDouble("pprice13"),
                        rec.getDouble("pprice14"),
                        rec.getDouble("pprice15")
                    };
                    model.addRow(input);
                   } catch (SQLException e) {
                   }
                   LineCnt++ ;
                } while (rec.next());
                int RowCount = model.getRowCount();
                showCell(0,0) ;
                tblShowMember.requestFocus(true);
                //ShowTableLogin.setRowSelectionInterval(0, 0);
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            //PUtility.ShowError(e.getMessage());
        }
        
    }
    public void ShowMemberByCode() {
        int LineCnt = 1 ;
         String TempStr = "%"+TMemCode.getText()+"%" ;
        try { 
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String LoadTableFile = "select *from product where (pstock='Y') and (pactive='Y') and (pcode like '"+TempStr+"') order by pcode";
            ResultSet rec = stmt.executeQuery(LoadTableFile);
            Date dt = new Date();
            ClearGrid() ;
            rec.first();
            if (rec.getRow() == 0) {
               JOptionPane.showMessageDialog(this,"ไม่พบข้อมูลสินค้า ตามที่ต้องการ...");
               TMemCode.requestFocus();
            } else {
                do {
                   try {
                    Object[] input = {
                         LineCnt,
                        rec.getString("pgroup"),
                        rec.getString("pcode"),
                        rec.getString("pdesc"),
                        rec.getString("punit1"),
                        rec.getDouble("pprice11"),
                        rec.getDouble("pprice12"),
                        rec.getDouble("pprice13"),
                        rec.getDouble("pprice14"),
                        rec.getDouble("pprice15")
                    };
                    model.addRow(input);
                   } catch (SQLException e) {
                   }
                   LineCnt++ ;
                } while (rec.next());
                int RowCount = model.getRowCount();
                showCell(0,0) ;
                tblShowMember.requestFocus(true);
                //ShowTableLogin.setRowSelectionInterval(0, 0);
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            //PUtility.ShowError(e.getMessage());
        }
    }
    
    public void ShowMemberByName() {
        int LineCnt = 1 ;
        String TempStr = "%"+TMemName.getText()+"%" ;
        try { 
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String LoadTableFile = "select *from product where (pstock='Y') and " +
                    "(pactive='Y') and (pdesc like '"+TempStr+"') order by pdesc";
            ResultSet rec = stmt.executeQuery(LoadTableFile);
            Date dt = new Date();
            ClearGrid() ;
            rec.first();
            if (rec.getRow() == 0) {
                JOptionPane.showMessageDialog(this,"ไม่พบข้อมูลสินค้า ตามที่ต้องการ...");
                TMemName.requestFocus();
            } else {
                do {
                   try {
                    Object[] input = {
                         LineCnt,
                        rec.getString("pgroup"),
                        rec.getString("pcode"),
                        rec.getString("pdesc"),
                        rec.getString("punit1"),
                        rec.getDouble("pprice11"),
                        rec.getDouble("pprice12"),
                        rec.getDouble("pprice13"),
                        rec.getDouble("pprice14"),
                        rec.getDouble("pprice15")
                    };
                    model.addRow(input);
                   } catch (SQLException e) {
                   }
                   LineCnt++ ;
                } while (rec.next());
                int RowCount = model.getRowCount();
                showCell(0,0) ;
                tblShowMember.requestFocus(true);
                //ShowTableLogin.setRowSelectionInterval(0, 0);
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            //PUtility.ShowError(e.getMessage());
        }
    }
    public void ShowMemberByTel() {
        int LineCnt = 1 ;
        String TempStr = "%"+TMemTel.getText()+"%" ;
        try { 
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String LoadTableFile = "select *from product where (pstock='Y') and (pactive='Y') and (pgroup like '"+TempStr+"') order by pdesc";
            ResultSet rec = stmt.executeQuery(LoadTableFile);
            Date dt = new Date();
            ClearGrid() ;
            rec.first();
            if (rec.getRow() == 0) {
                JOptionPane.showMessageDialog(this,"ไม่พบข้อมูลสินค้า ตามที่ต้องการ...");
                TMemTel.requestFocus();
            } else {
                do {
                   try {
                    Object[] input = {
                         LineCnt,
                        rec.getString("pgroup"),
                        rec.getString("pcode"),
                        rec.getString("pdesc"),
                        rec.getString("punit1"),
                        rec.getDouble("pprice11"),
                        rec.getDouble("pprice12"),
                        rec.getDouble("pprice13"),
                        rec.getDouble("pprice14"),
                        rec.getDouble("pprice15")
                    };
                    model.addRow(input);
                   } catch (SQLException e) {
                   }
                   LineCnt++ ;
                } while (rec.next());
                int RowCount = model.getRowCount();
                showCell(0,0) ;
                tblShowMember.requestFocus(true);
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            //PUtility.ShowError(e.getMessage());
        }
        
    }
    public void showCell(int row, int column) {
        Rectangle rect = tblShowMember.getCellRect(row, column, true);
        tblShowMember.scrollRectToVisible(rect);
        tblShowMember.clearSelection();
        tblShowMember.setRowSelectionInterval(row, row);
    }
    public void bntExitClick() {
        this.dispose();
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: 
     * NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblShowMember = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        bntShowMemAll = new javax.swing.JButton();
        bntOK = new javax.swing.JButton();
        bntExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TMemCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TMemName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TMemTel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงรายการสินค้า (Product List)");
        setAlwaysOnTop(true);
        setBackground(java.awt.Color.white);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tblShowMember.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblShowMember.setFont(new java.awt.Font("Norasi", 0, 16)); // NOI18N
        tblShowMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "กลุ่มสินค้า", "รหัสสินค้า (PLU Code)", "ชื่อสินค้า (Description)", "หน่วยนับ", "ราคา (1)", "ราคา (2)", "ราคา (3)", "ราคา (4)", "ราคา (5)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblShowMember.setOpaque(false);
        tblShowMember.setRowHeight(25);
        tblShowMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowMemberMouseClicked(evt);
            }
        });
        tblShowMember.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblShowMemberKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblShowMember);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bntShowMemAll.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        bntShowMemAll.setText("F2-แสดงทั้งหมด");
        bntShowMemAll.setFocusable(false);
        bntShowMemAll.setMargin(new java.awt.Insets(1, 1, 1, 1));
        bntShowMemAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntShowMemAllActionPerformed(evt);
            }
        });

        bntOK.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        bntOK.setText("F5-ตกลง (OK)");
        bntOK.setFocusable(false);
        bntOK.setMargin(new java.awt.Insets(1, 1, 1, 1));
        bntOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOKActionPerformed(evt);
            }
        });

        bntExit.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        bntExit.setText("ESC-ออก(Exit)");
        bntExit.setFocusable(false);
        bntExit.setMargin(new java.awt.Insets(1, 1, 1, 1));
        bntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExitActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray, 2));

        jLabel1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel1.setText("รหัสสินค้า");

        TMemCode.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        TMemCode.setText("jTextField1");
        TMemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TMemCodeActionPerformed(evt);
            }
        });
        TMemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TMemCodeKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("ชื่อสินค้า");

        TMemName.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        TMemName.setText("jTextField1");
        TMemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TMemNameActionPerformed(evt);
            }
        });
        TMemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TMemNameKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel3.setText("กลุ่มสินค้า");

        TMemTel.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        TMemTel.setText("jTextField1");
        TMemTel.setDragEnabled(true);
        TMemTel.setFocusCycleRoot(true);
        TMemTel.setFocusTraversalPolicyProvider(true);
        TMemTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TMemTelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TMemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TMemTel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TMemName, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TMemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TMemName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TMemTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(bntShowMemAll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntOK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntOK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntShowMemAll, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1024, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void bntShowMemAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntShowMemAllActionPerformed
     bntShowMemberAllClick() ;
}//GEN-LAST:event_bntShowMemAllActionPerformed

private void bntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExitActionPerformed
    bntExitClick() ;
}//GEN-LAST:event_bntExitActionPerformed

private void TMemCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TMemCodeKeyPressed
     if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
         if (TMemCode.getText().length()>0) {
            ShowMemberByCode() ;
         } else {
             TMemName.requestFocus();
         }
     }
     if (evt.getKeyCode()==KeyEvent.VK_F2) {
        bntShowMemberAllClick() ;
     }
     if (evt.getKeyCode()==KeyEvent.VK_F5) {
        bntOKClick() ;
     }
     if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
        bntExitClick() ;
     }
     
    
}//GEN-LAST:event_TMemCodeKeyPressed

private void TMemNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TMemNameKeyPressed
    if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
        if (TMemName.getText().length()>0) {
           ShowMemberByName() ;
        } else {
            TMemTel.requestFocus();
        }
     }
    if (evt.getKeyCode()==KeyEvent.VK_F2) {
        bntShowMemberAllClick() ;
     }
     if (evt.getKeyCode()==KeyEvent.VK_F5) {
        bntOKClick() ;
     }
     if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
        bntExitClick() ;
     }
    
}//GEN-LAST:event_TMemNameKeyPressed

private void TMemTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TMemTelKeyPressed
    if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
        if (TMemTel.getText().length()>0) {
           ShowMemberByTel() ;
        } else {
            TMemCode.requestFocus();
        }
     }
    if (evt.getKeyCode()==KeyEvent.VK_F2) {
        bntShowMemberAllClick() ;
     }
     if (evt.getKeyCode()==KeyEvent.VK_F5) {
        bntOKClick() ;
     }
     if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
        bntExitClick() ;
     }
   
}//GEN-LAST:event_TMemTelKeyPressed

private void tblShowMemberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblShowMemberKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        int index = tblShowMember.getSelectedRow();
        if (index != -1) {
            Db_product hr = null;
            try {
                hr = new Db_product();
                dataRecord = hr.getRecordAt((String) tblShowMember.getValueAt(index, 2));
                dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    } else
     if (evt.getKeyCode()==KeyEvent.VK_F2) {
        bntShowMemberAllClick() ;
     } else
     if (evt.getKeyCode()==KeyEvent.VK_F5) {
        bntOKClick() ;
     } else
     if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
         TMemCode.setText("") ;
         TMemName.setText("") ;
         TMemTel.setText("") ;
         ClearGrid() ;
         TMemTel.requestFocus();
     }
}//GEN-LAST:event_tblShowMemberKeyPressed

private void bntOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOKActionPerformed
       bntOKClick() ;
}//GEN-LAST:event_bntOKActionPerformed

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    tblShowMember.requestFocus();
}//GEN-LAST:event_formWindowActivated

private void tblShowMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowMemberMouseClicked
   if(evt.getClickCount()==2){
        int index = tblShowMember.getSelectedRow();
        Db_product hr = null;
            try {
                hr = new Db_product();
                dataRecord = hr.getRecordAt((String)tblShowMember.getValueAt(index, 2));
                dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }
}//GEN-LAST:event_tblShowMemberMouseClicked

    private void TMemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TMemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TMemCodeActionPerformed

    private void TMemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TMemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TMemNameActionPerformed
public void bntOKClick() {
    int index = tblShowMember.getSelectedRow();
    if (index != -1) {
        Db_product hr = null;
        try {
            hr = new Db_product();
            dataRecord = hr.getRecordAt((String) tblShowMember.getValueAt(index, 2));
            dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
public void GetSelectedRow() {
        int maxrow;
        int currow = 0;
        String TableSelected = "";
        maxrow = tblShowMember.getRowCount();
        for (int i = 0; i < maxrow; i++) {
            if (tblShowMember.isRowSelected(i)) {
                currow = i;
            }
        }
        if (maxrow>0) { 
           TableSelected = tblShowMember.getValueAt(currow, 1).toString();
           this.dispose();
        }
       
    }
public Product getDataRecord() {
        return dataRecord;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Jdi_Inv_product dialog = new Jdi_Inv_product(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField TMemCode;
    private javax.swing.JTextField TMemName;
    private javax.swing.JTextField TMemTel;
    private javax.swing.JButton bntExit;
    private javax.swing.JButton bntOK;
    private javax.swing.JButton bntShowMemAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblShowMember;
    // End of variables declaration//GEN-END:variables
}
