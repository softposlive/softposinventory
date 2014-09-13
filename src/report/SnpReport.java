
package report;

import DBcontrol.MySQLConnect;
import program.LoginDialog;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class SnpReport extends Report {
    private Branch branch;
    private Company company;

    public SnpReport() {
        super();
        branch = new Branch();
        company = new Company();
    }
    public void sumConvertAddPrintReport(String humanDate1, String humanDate2,
            String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }

        Map parm = new HashMap();
        parm.put("load_header", "รหัสสาขา "+LoginDialog.BranchCode);
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);

        this.viewReport("sumConvertAdd", parm);
    }
    public void sumConvertPayPrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }

        Map parm = new HashMap();
        parm.put("load_header", "รหัสสาขา "+branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);

        this.viewReport("sumConvertPay", parm);
    }

    public void chargePrintReport(String humanDate1, String humanDate2, boolean showDetail, boolean showView,
            String empcode1, String empcode2) {
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("sql_date1", convertDateToSQL(humanDate1));
        parm.put("sql_date2", convertDateToSQL(humanDate2));
        parm.put("sql_empcode1", "%"+empcode1+"%");
        parm.put("sql_empcode2", "%"+empcode2+"%");
        if (showView) {
            if (showDetail) {
                this.viewReport("chargeDetailReport", parm);
            } else {
                this.viewReport("chargeReport", parm);
            }
        } else {
            if (showDetail) {
                this.printReport("chargeDetailReport", parm);
            } else {
                this.printReport("chargeReport", parm);
            }
        }
    }

    public void prolostPrintReport(String humanDate1, String humanDate2, boolean showDetail, boolean showView) {
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("sql_date1", convertDateToSQL(humanDate1));
        parm.put("sql_date2", convertDateToSQL(humanDate2));
        if (showView) {
            if (showDetail) {
                this.viewReport("prolostDetailReport", parm);
            } else {
                this.viewReport("prolostReport", parm);
            }
        } else {
            if (showDetail) {
                this.printReport("prolostDetailReport", parm);
            } else {
                this.printReport("prolostReport", parm);
            }
        }
    }

    public void convertPrintReport(String humanDate1, String humanDate2, boolean showDetail, boolean showView) {
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("sql_date1", convertDateToSQL(humanDate1));
        parm.put("sql_date2", convertDateToSQL(humanDate2));
        if (showView) {
            if (showDetail) {
                this.viewReport("convertDetailReport", parm);
            } else {
                this.viewReport("convertReport", parm);
            }
        } else {
            if (showDetail) {
                this.printReport("convertDetailReport", parm);
            } else {
                this.printReport("convertReport", parm);
            }
        }
    }

    public void tranoutPrintReport(String humanDate1, String humanDate2, String branch1, String branch2, boolean showDetail, boolean showView) {
        String sql;
        
        if((branch1.trim().equals("")||branch1==null) && (branch2.trim().equals("")||branch2==null)){
            sql = "";
        }else if(!(branch1.trim().equals("")||branch1==null) && (branch2.trim().equals("")||branch2==null)) {
            sql = " AND (r_bran ='"+branch1+"')";
        }else{
            sql = " AND r_bran BETWEEN '"+branch1.trim()+"' AND '"+branch2.trim()+"'";
        }
        
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("sql_date1", convertDateToSQL(humanDate1));
        parm.put("sql_date2", convertDateToSQL(humanDate2));
        parm.put("load_branch1", branch1);
        parm.put("load_branch2", branch2);
        parm.put("sql_condition", sql);
        
        if (showView) {
            if (showDetail) {
                this.viewReport("tranoutDetailReport", parm);
            } else {
                this.viewReport("tranoutReport", parm);
            }
        } else {
            if (showDetail) {
                this.printReport("tranoutDetailReport", parm);
            } else {
                this.printReport("tranoutReport", parm);
            }
        }
    }
public void adjstockPrintReport(String humanDate1, String humanDate2, boolean showDetail, boolean showView) {
        String sql="";

        if(!(humanDate1.trim().equals("")||humanDate1==null) && (humanDate2.trim().equals("")||humanDate2==null)) {
            sql = " R_Date BETWEEN '"+humanDate1.trim()+"' AND '"+humanDate2.trim()+"'";
        }

        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("sql_date1", convertDateToSQL(humanDate1));
        parm.put("sql_date2", convertDateToSQL(humanDate2));
        parm.put("sql_condition", sql);

        if (showView) {
            if (showDetail) {
                this.viewReport("adjstockDetailReport", parm);
            } else {
                this.viewReport("adjstockReport", parm);
            }
        } else {
            if (showDetail) {
                this.printReport("adjstockDetailReport", parm);
            } else {
                this.printReport("adjstockReport", parm);
            }
        }
    }
    public void traninPrintReport(String humanDate1, String humanDate2, String branch1, String branch2, boolean showDetail, boolean showView) {
        String sql;
        
        if((branch1.trim().equals("")||branch1==null) && (branch2.trim().equals("")||branch2==null)){
            sql = "";
        }else if(!(branch1.trim().equals("")||branch1==null) && (branch2.trim().equals("")||branch2==null)) {
            sql = " AND (r_bran ='"+branch1+"')";
        }else{
            sql = " AND r_bran BETWEEN '"+branch1.trim()+"' AND '"+branch2.trim()+"'";
        }
        
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("sql_date1", convertDateToSQL(humanDate1));
        parm.put("sql_date2", convertDateToSQL(humanDate2));
        parm.put("load_branch1", branch1);
        parm.put("load_branch2", branch2);
        parm.put("sql_condition", sql);
        
        if (showView) {
            if (showDetail) {
                this.viewReport("traninDetailReport", parm);
            } else {
                this.viewReport("traninReport", parm);
            }
        } else {
            if (showDetail) {
                this.printReport("traninDetailReport", parm);
            } else {
                this.printReport("traninReport", parm);
            }
        }
    }
    public void recivePrintReport(String humanDate1, String humanDate2, String factory1, String factory2, boolean showDetail, boolean showView) {
        String sql;
        
        if((factory1.trim().equals("")||factory1==null) && (factory2.trim().equals("")||factory2==null)){
            sql = "";
        }else if(!(factory1.trim().equals("")||factory1==null) && (factory2.trim().equals("")||factory2==null)) {
            sql = " AND (r_bran ='"+factory1+"')";
        }else{
            sql = " AND r_bran BETWEEN '"+factory1.trim()+"' AND '"+factory2.trim()+"'";
        }
        
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("sql_date1", convertDateToSQL(humanDate1));
        parm.put("sql_date2", convertDateToSQL(humanDate2));
        parm.put("load_branch1", factory1);
        parm.put("load_branch2", factory2);
        parm.put("sql_condition", sql);
        
        if (showView) {
            if (showDetail) {
                this.viewReport("reciveDetailReport", parm);
            } else {
                this.viewReport("reciveReport", parm);
            }
        } else {
            if (showDetail) {
                this.printReport("reciveDetailReport", parm);
            } else {
                this.printReport("reciveReport", parm);
            }
        }
    }

    public void sumTranoutPLU1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);
        
        if (showView) {
            this.viewReport("sumTranoutPLU1", parm);
        } else {
            this.printReport("sumTranoutPLU1", parm);
        }
    }
public void sumAdjstockPLU1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }

        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);

        if (showView) {
            this.viewReport("sumAdjstockPLU", parm);
        } else {
            this.printReport("sumAdjstockPLU", parm);
        }
    }
    public void sumTraninPLU1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);
        
        if (showView) {
            this.viewReport("sumTraninPLU1", parm);
        } else {
            this.printReport("sumTraninPLU1", parm);
        }
    }
    public void sumRecivePLU1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);
        
        if (showView) {
            this.viewReport("sumRecivePLU1", parm);
        } else {
            this.printReport("sumRecivePLU1", parm);
        }
    }
    public void sumProlostPLU1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }

        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        
        if (showView) {
            this.viewReport("sumProlostPLU1", parm);
        } else {
            this.printReport("sumProlostPLU1", parm);
        }
    }
    public void sumChargePLU1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }

        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        
        if (showView) {
            this.viewReport("sumChargePLU1", parm);
        } else {
            this.printReport("sumChargePLU1", parm);
        }
    }
    
    public void sumTranoutPLU2PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);
        
        if (showView) {
            this.viewReport("sumTranoutPLU2", parm);
        } else {
            this.printReport("sumTranoutPLU2", parm);
        }
    }
public void sumAdjstockPLU2PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }

        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);

        if (showView) {
            this.viewReport("sumAdjstockPLU2", parm);
        } else {
            this.printReport("sumAdjstockPLU2", parm);
        }
    }
    public void sumTraninPLU2PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);
        
        if (showView) {
            this.viewReport("sumTraninPLU2", parm);
        } else {
            this.printReport("sumTraninPLU2", parm);
        }
    }
    public void sumRecivePLU2PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);
        
        if (showView) {
            this.viewReport("sumRecivePLU2", parm);
        } else {
            this.printReport("sumRecivePLU2", parm);
        }
    }
    
    public void sumTranoutGroup1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        System.out.println(humanDate1 +" , "+ humanDate2+" , "+ pcode1);
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);
        
        if (showView) {
            this.viewReport("sumTranoutGroup1", parm);
        } else {
            this.printReport("sumTranoutGroup1", parm);
        }
    }
    public void sumTraninGroup1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        System.out.println(humanDate1 +" , "+ humanDate2+" , "+ pcode1);
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);

        if (showView) {
            this.viewReport("sumTraninGroup1", parm);
        } else {
            this.printReport("sumTraninGroup1", parm);
        }
    }
    public void sumConvertGroup1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2,boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        System.out.println(humanDate1 +" , "+ humanDate2+" , "+ pcode1);
        Map parm = new HashMap();
        parm.put("load_header", "รหัสสาขา "+branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        
        if (showView) {
            this.viewReport("sumConvertGroup", parm);
        } else {
            this.printReport("sumConvertGroup", parm);
        }
    }
    public void sumReciveGroup1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        System.out.println(humanDate1 +" , "+ humanDate2+" , "+ pcode1);
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);
        
        if (showView) {
            this.viewReport("sumReciveGroup1", parm);
        } else {
            this.printReport("sumReciveGroup1", parm);
        }
    }
    public void sumProlostGroup1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }

        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        
        if (showView) {
            this.viewReport("sumProlostGroup1", parm);
        } else {
            this.printReport("sumProlostGroup1", parm);
        }
    }
    public void sumChargeGroup1PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }

        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        
        if (showView) {
            this.viewReport("sumChargeGroup1", parm);
        } else {
            this.printReport("sumChargeGroup1", parm);
        }
    }
    
    public void sumTranoutGroup2PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        System.out.println(humanDate1 +" , "+ humanDate2+" , "+ pcode1);
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);
        
        if (showView) {
            this.viewReport("sumTranoutGroup2", parm);
        } else {
            this.printReport("sumTranoutGroup2", parm);
        }
    }
    public void sumTraninGroup2PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        System.out.println(humanDate1 +" , "+ humanDate2+" , "+ pcode1);
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);
        
        if (showView) {
            this.viewReport("sumTraninGroup2", parm);
        } else {
            this.printReport("sumTraninGroup2", parm);
        }
    }
    public void sumReciveGroup2PrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String pbran1, String pbran2, boolean showView) {

        if(pcode1.equals("")||pcode1==null){
            pcode1="0";
        }
        if(pcode2.equals("")||pcode2==null){
            pcode2="ZZZZZZZZZZ";
        }
        if(pbran1.equals("")||pbran1==null){
            pbran1="0";
        }
        if(pbran2.equals("")||pbran2==null){
            pbran2="ZZZZZZZZZZ";
        }
        System.out.println(humanDate1 +" , "+ humanDate2+" , "+ pcode1);
        Map parm = new HashMap();
        parm.put("load_header", branch.getName());
        parm.put("load_date1", humanDate1);
        parm.put("load_date2", humanDate2);
        parm.put("date1", convertDateToSQL(humanDate1));
        parm.put("date2", convertDateToSQL(humanDate2));
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("pbran1", pbran1);
        parm.put("pbran2", pbran2);
        
        if (showView) {
            this.viewReport("sumReciveGroup2", parm);
        } else {
            this.printReport("sumReciveGroup2", parm);
        }
    }
    
    public void adjstockGroupPrintReport(String pgroup1, String pgroup2, boolean showView) {

        if(pgroup1.equals("")||pgroup1==null){
            pgroup1="0";
        }
        if(pgroup2.equals("")||pgroup2==null){
            pgroup2="ZZZZZZZZZZ";
        }
        Map parm = new HashMap();
        parm.put("branchName", branch.getName());
        parm.put("groupCode1", pgroup1);
        parm.put("groupCode2", pgroup2);

        
        if (showView) {
            this.viewReport("checkProduct", parm);
        } else {
            this.printReport("checkProduct", parm);
        }
    }
    
    public void stockMovementPrintReport(String humanDate1, String humanDate2, String pcode1, String pcode2, String group1, String group2, String stock,boolean showView) {
        Map parm = new HashMap();
        parm.put("companyName", company.getName());
        parm.put("tax", company.getTax());
        parm.put("branchname", branch.getName());
        parm.put("date1", humanDate1);
        parm.put("date2", humanDate2);
        parm.put("pcode1", pcode1);
        parm.put("pcode2", pcode2);
        parm.put("group1", group1);
        parm.put("group2", group2);
        parm.put("stock", stock);
        
        if (showView) {
            this.viewReport("stockMovement", parm);
        } else {
            this.printReport("stockMovement", parm);
        }
    }
    
    private class Branch {

        private String code;
        private String name;

        Branch() {
            String sql = "SELECT * FROM branch";
            try {
                ResultSet rs = MySQLConnect.getResultSet(sql);
                if (rs.next()) {
                    code = rs.getString("code");
                    name = rs.getString("name");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }

    private class Company {

        private String tax;
        private String name;

        Company() {
            String sql = "SELECT * FROM company";
            try {
                ResultSet rs = MySQLConnect.getResultSet(sql);
                if (rs.next()) {
                    name = rs.getString("name");
                    tax = rs.getString("tax");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        public String getName() {
            return name;
        }

        public String getTax() {
            return tax;
        }

        
    }

}
