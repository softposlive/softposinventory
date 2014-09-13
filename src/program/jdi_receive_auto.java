package program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import utilities.zip.ZipUnzip;
import utilities.zip.ZipUtility;

public class jdi_receive_auto extends javax.swing.JDialog {
    private DefaultTableModel model = null;
    /** Creates new form jdi_receive_auto */
    public jdi_receive_auto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_browse = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_receive = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_docno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_receivedate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        msgCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Browse...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tb_receive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "เลขที่เอกสาร", "รหัสสินค้า", "จำนวนสั่ง", "จำนวนส่ง", "จำนวน"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_receive);

        jLabel1.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel1.setText("เลขที่เอกสาร");

        txt_docno.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("วันที่รับ");

        txt_receivedate.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel3.setText("เลือกไฟล์");

        msgCount.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        msgCount.setText("จำนวนรายการทั้งหมด");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_docno, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_receivedate, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                        .addGap(208, 208, 208))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(msgCount)
                .addContainerGap(749, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_browse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_docno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_receivedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgCount))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    JFileChooser file = new JFileChooser("Desktop");
    int returnVal = file.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File f = file.getSelectedFile();
        //This is where a real application would open the file.
        txt_browse.setText(f.getName());
        //แตก zipfile
        ZipUtility zip = new ZipUnzip();
        try {
            zip.unzip(f, new File("/tmp/" + f.getName()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String []files = new File("/tmp/" + f.getName()).list();
        String fileRead = "";
        for(String ff:files){
            fileRead = ff;
        }
        //อ่านข้อมูลในไฟล์
        ArrayList<String[]> arr = readData("/tmp/"+f.getName()+"/"+fileRead);
        //แสดงบน GUI
        String filename = f.getName();
        filename = filename.substring(0, filename.indexOf("_"));
        txt_docno.setText(filename);
        model = (DefaultTableModel) tb_receive.getModel();
        for(int i=0;i<arr.size();i++){
            String []data = (String[])arr.get(i);
            model.addRow(new Object[]{i+1,data[0],data[5],Integer.parseInt(data[6])
                    ,Integer.parseInt(data[6]),Integer.parseInt(data[6])});
            txt_receivedate.setText(data[4]);
        } 
        msgCount.setText("จำนวนรายการทั้งหมด "+model.getRowCount()+" รายการ");
    }
}//GEN-LAST:event_jButton1ActionPerformed
    public ArrayList<String []> readData(String path){
        ArrayList<String []> arr = new ArrayList<String []>();
        try {
            BufferedReader in = new BufferedReader(
            new java.io.InputStreamReader(
                    new FileInputStream(path), "UTF8"));
            String str = "";
            while((str = in.readLine())!=null){
                String []data = str.split("\t",str.length());
                arr.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdi_receive_auto dialog = new jdi_receive_auto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msgCount;
    private javax.swing.JTable tb_receive;
    private javax.swing.JTextField txt_browse;
    private javax.swing.JTextField txt_docno;
    private javax.swing.JTextField txt_receivedate;
    // End of variables declaration//GEN-END:variables

}
