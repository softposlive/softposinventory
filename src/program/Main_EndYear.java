package program;

import DBcontrol.MySQLConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Main_EndYear extends javax.swing.JDialog {
    String user = PublicVar.TempUser.UserCode;
    SimpleDateFormat dateFmtShow = new SimpleDateFormat("dd/MM/yyyy" ,Locale.ENGLISH);
    SimpleDateFormat timeFmtShow = new SimpleDateFormat("HH:mm:ss" ,Locale.ENGLISH);
    SimpleDateFormat Sqldate = new SimpleDateFormat("yyyy-MM-dd" ,Locale.ENGLISH);
    SimpleDateFormat YearFmt = new SimpleDateFormat("yyyy" , Locale.ENGLISH) ;
    SimpleDateFormat MonthFmt = new SimpleDateFormat("MM" , Locale.ENGLISH) ;
    DecimalFormat doubleFmt = new DecimalFormat("##,###,##0.00");
    DecimalFormat qtyFmt = new DecimalFormat("##,###,##0.000");
    DecimalFormat YearToStr = new DecimalFormat("#####");
    String TempYear1 = "" ;
    String TempYear2 = "" ;
    Boolean ProcessStop  ;

    /** Creates new form Main_EndYear */
    public Main_EndYear(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        LoadVariable() ;
    }
    public void LoadVariable() {
        Date TempActDate = new Date();
        try {
            Statement stmt = (Statement) MySQLConnect.con.createStatement();
            String SqlQuery = "select *from company";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.first();
            if (rec.getRow() == 0) {
                JOptionPane.showMessageDialog(this, "กรุณาตรวจสอบไฟล์ข้อมูลบริษัท...");
                return ;
                //this.dispose();
            } else {
                TempActDate = rec.getDate("Accterm");
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        int intYear1 =  Integer.parseInt(YearFmt.format(TempActDate)) ;
        int intYear2 =  Integer.parseInt(YearFmt.format(TempActDate))+1 ;
        TempYear1 = YearToStr.format(intYear1) ;
        TempYear2 = YearToStr.format(intYear2) ;
        Year1.setText(TempYear1);
        Year2.setText(TempYear2);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Year1 = new javax.swing.JTextField();
        Year2 = new javax.swing.JTextField();
        bntOK = new javax.swing.JButton();
        bntExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("โปรแกรมประมวลผลข้อมูลสิ้นปี (End Of Year)");
        setBackground(new java.awt.Color(245, 247, 247));
        setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(245, 247, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setFont(new java.awt.Font("Norasi", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(22, 32, 111));
        jLabel7.setText("ข้อมูลงวดปีของข้อมูลในระบบได้แก่ปี");

        jLabel8.setFont(new java.awt.Font("Norasi", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(22, 32, 111));
        jLabel8.setText("โปรแกรมจะทำการเปลี่ยนงวดของข้อมูลเป็น ปี");

        Year1.setFont(new java.awt.Font("Norasi", 1, 18)); // NOI18N
        Year1.setForeground(new java.awt.Color(189, 17, 17));
        Year1.setText("jTextField1");
        Year1.setFocusable(false);

        Year2.setFont(new java.awt.Font("Norasi", 1, 18)); // NOI18N
        Year2.setForeground(new java.awt.Color(189, 17, 17));
        Year2.setText("jTextField2");
        Year2.setFocusable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Year2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Year1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Year1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Year2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        bntOK.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        bntOK.setText("ตกลง (OK)");
        bntOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOKActionPerformed(evt);
            }
        });

        bntExit.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        bntExit.setText("ออก (Exit)");
        bntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExitActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 17, 35));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 73, 18), 5, true));

        jLabel1.setFont(new java.awt.Font("Norasi", 1, 28)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("โปรแกรมประมวลผลสิ้นปี (End Of Year)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bntOK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntExit))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntExit)
                    .addComponent(bntOK))
                .addContainerGap(394, Short.MAX_VALUE))
        );

        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        TextArea.setRows(5);
        TextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        TextArea.setFocusable(false);
        TextArea.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(TextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1024, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void bntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExitActionPerformed
// TODO add your handling code here:
    bntExitClick() ;
}//GEN-LAST:event_bntExitActionPerformed

private void bntOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOKActionPerformed
// TODO add your handling code here:
    bntOKClick() ;
}//GEN-LAST:event_bntOKActionPerformed
   


public void bntOKClick() {
    String ChkYear = "" ;
    Date TempDate = new Date() ;
    int TempMonth = Integer.parseInt(MonthFmt.format(TempDate)) ;
    if ((TempMonth==1) | (TempMonth==12)) {
        if (TempMonth==1) {
            ChkYear = YearToStr.format(Integer.parseInt(YearFmt.format(TempDate))) ; 
        }  else {
            ChkYear = YearToStr.format(Integer.parseInt(YearFmt.format(TempDate))+1) ; 
        }  
    } else {
        JOptionPane.showMessageDialog(this, "การปิดยอดสิ้นปีจะต้องทำเมื่อสิ้นปี (เดือนธันวาคม หรือ เดือนมกราคม) เท่านั้น...");
        this.dispose();
    }
    if (TempYear2.equals(ChkYear)) {
        int option = JOptionPane.showConfirmDialog(null, "ยืนยันการประมวลผลสิ้นปี (End Of Year) (Yes/No)...", "Confirm Dialog...",JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
              JOptionPane.showMessageDialog(this, "Start End Of Year ...");   
              Thread EndOfYear = new Thread(new ProcessEndOfYear());
               EndOfYear.start();
        } else {
            this.dispose();
        }
    } else {
        JOptionPane.showMessageDialog(this,"มีการปิดยอดปีแล้ว...ไม่สามารถปิดได้อีก...");
    }
    
}
public void bntExitClick() {
    this.dispose();
}
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main_EndYear dialog = new Main_EndYear(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField Year1;
    private javax.swing.JTextField Year2;
    private javax.swing.JButton bntExit;
    private javax.swing.JButton bntOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    class ProcessEndOfYear extends javax.swing.JDialog implements Runnable {
        int maxValue;
        int minValue;
        JOptionPane Jop;

        public void run() {
            ProcessStop =false ;
            TextArea.selectAll();
            TextArea.cut();
            TextArea.append("***** Start Process *****\n");
            int intYear1 = Integer.parseInt(TempYear1) ;
            String StrClearDate = "31/12/"+YearToStr.format(intYear1-1) ;
            Date ClearDate = new Date() ;
            try {
                ClearDate = dateFmtShow.parse(StrClearDate);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                TextArea.append("Date Convert Error....\n");
                ProcessStop = true;
                //Logger.getLogger(Main_EndYear.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Backupdate
             
            
            //Clear Stcard
            if (!ProcessStop) {
                TextArea.append("Process Clear Stock Card ....\n");
                try {
                    Statement stmt = (Statement) MySQLConnect.con.createStatement();
                    String SqlQuery = "delete from stcard where s_date<='" + Sqldate.format(ClearDate) + "'";
                    stmt.executeUpdate(SqlQuery);
                    stmt.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                    TextArea.append("Clear Stock Card Error....\n");
                    ProcessStop = true;
                }
            }
            //Move StkFile
            if (!ProcessStop) {
                TextArea.append("Process Update StkFile ....\n");
                try {
                    Statement stmt = (Statement) MySQLConnect.con.createStatement();
                    String SqlQuery = "update stkfile set bqty0=bqty12,bqty1=bqty13,bqty2=bqty14," +
                            "bqty3=bqty15,bqty4=bqty16,bqty5=bqty17,bqty6=bqty18,bqty7=bqty19,bqty8=bqty20," +
                            "bqty9=bqty21,bqty10=bqty22,bqty11=bqty23,bqty12=bqty24,bqty13=bqty24,bqty14=bqty24," +
                            "bqty15=bqty24,bqty16=bqty24,bqty17=bqty24,bqty18=bqty24,bqty19=bqty24,bqty20=bqty24," +
                            "bqty21=bqty24,bqty22=bqty24,bqty23=bqty24," +
                            "bamt0=bamt12,bamt1=bamt13,bamt2=bamt14,bamt3=bamt15,bamt4=bamt16,bamt5=bamt17," +
                            "bamt6=bamt18,bamt7=bamt19,bamt8=bamt20,bamt9=bamt21,bamt10=bamt22,bamt11=bamt23," +
                            "bamt12=bamt24,bamt13=bamt24,bamt14=bamt24,bamt15=bamt24,bamt16=bamt24,bamt17=bamt24," +
                            "bamt18=bamt24,bamt19=bamt24,bamt20=bamt24,bamt21=bamt24,bamt22=bamt24,bamt23=bamt24";
                    stmt.executeUpdate(SqlQuery);
                    stmt.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                    TextArea.append("Update StkFile  Error....\n");
                    ProcessStop = true;
                }
            }
            //Update Company
            if (!ProcessStop) {
                TextArea.append("Process Update Company Table ....\n");
                int intYear2 = Integer.parseInt(TempYear2) ;
                String StrNewDate = "01/01/"+YearToStr.format(intYear2) ;
                Date NewDate = new Date() ;
                try {
                   NewDate = dateFmtShow.parse(StrNewDate);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                    TextArea.append("Date Convert Error....\n");
                    ProcessStop = true;
                }
                try {
                    Statement stmt = (Statement) MySQLConnect.con.createStatement();
                    String SqlQuery = "update company set accterm='"+Sqldate.format(NewDate)+"'";
                    stmt.executeUpdate(SqlQuery);
                    stmt.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                    TextArea.append("Update Company Error....\n");
                    ProcessStop = true;
                }
            }
            
            //any Error Chang ProcessStop-->true
            TextArea.append("----------------จบการทำงาน--------------------- \n");
            if (!ProcessStop) {
                JOptionPane.showMessageDialog(this, "การปรมวลผลสิ้นปี...สมบูรณ์");
            } else {
                JOptionPane.showMessageDialog(this, "การประมวลผลสิ้นปี...,มีปัญหาบางรายการ...กรุณาตรวจสอบ !!!");
                //Restore Bacup-db
                //Update Company
            }

        }
    }
}
