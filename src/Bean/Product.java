/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;


import java.sql.Time;
import java.util.Date;


/**
 *
 * @author root
 */
public class Product {
    private String pcode;
    private String preferent;
    private String Paccno;
    private String pgroup;
    private String pvender;
    private String ptype;
    private String pnormal;
    private String premark;
    private String pdiscount;
    private String pservice;
    private String pstatus;
    private String pstock;
    private String pset;
    private String pvat;
    private String pdesc;
    private String punit1;
    private int ppack1;
    private String parea;
    private String pkic;
    private float pprice11;
    private float pprice12;
    private float pprice13;
    private float pprice14;
    private float pprice15;
    private String ppromotion1;
    private String ppromotion2;
    private String ppromotion3;
    private float pmax;
    private float pmin;
    private String pbunit;
    private float pbpack;
    private float plcost;
    private float pscost;
    private float pacost;
    private String plink1;
    private String plink2;
    private Date plastupdate;
    private Time plasttime;
    private String puserupdate;
    private String pactive;
    private String pbarcode;
    private String pfoodtype;

    public String getPaccno() {
        return Paccno;
    }

    public void setPaccno(String Paccno) {
        this.Paccno = Paccno;
    }

    public float getPacost() {
        return pacost;
    }

    public void setPacost(float pacost) {
        this.pacost = pacost;
    }

    public String getPactive() {
        return pactive;
    }

    public void setPactive(String pactive) {
        this.pactive = pactive;
    }

    public String getParea() {
        return parea;
    }

    public void setParea(String parea) {
        this.parea = parea;
    }

    public String getPbarcode() {
        return pbarcode;
    }

    public void setPbarcode(String pbarcode) {
        this.pbarcode = pbarcode;
    }

    public float getPbpack() {
        return pbpack;
    }

    public void setPbpack(float pbpack) {
        this.pbpack = pbpack;
    }

    public String getPbunit() {
        return pbunit;
    }

    public void setPbunit(String pbunit) {
        this.pbunit = pbunit;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public String getPdiscount() {
        return pdiscount;
    }

    public void setPdiscount(String pdiscount) {
        this.pdiscount = pdiscount;
    }

    public String getPfoodtype() {
        return pfoodtype;
    }

    public void setPfoodtype(String pfoodtype) {
        this.pfoodtype = pfoodtype;
    }

    public String getPgroup() {
        return pgroup;
    }

    public void setPgroup(String pgroup) {
        this.pgroup = pgroup;
    }

    public String getPkic() {
        return pkic;
    }

    public void setPkic(String pkic) {
        this.pkic = pkic;
    }

    public Time getPlasttime() {
        return plasttime;
    }

    public void setPlasttime(Time plasttime) {
        this.plasttime = plasttime;
    }

    public Date getPlastupdate() {
        return plastupdate;
    }

    public void setPlastupdate(Date plastupdate) {
        this.plastupdate = plastupdate;
    }

    public float getPlcost() {
        return plcost;
    }

    public void setPlcost(float plcost) {
        this.plcost = plcost;
    }

    public String getPlink1() {
        return plink1;
    }

    public void setPlink1(String plink1) {
        this.plink1 = plink1;
    }

    public String getPlink2() {
        return plink2;
    }

    public void setPlink2(String plink2) {
        this.plink2 = plink2;
    }

    public float getPmax() {
        return pmax;
    }

    public void setPmax(float pmax) {
        this.pmax = pmax;
    }

    public float getPmin() {
        return pmin;
    }

    public void setPmin(float pmin) {
        this.pmin = pmin;
    }

    public String getPnormal() {
        return pnormal;
    }

    public void setPnormal(String pnormal) {
        this.pnormal = pnormal;
    }

    public int getPpack1() {
        return ppack1;
    }

    public void setPpack1(int ppack1) {
        this.ppack1 = ppack1;
    }

    public float getPprice11() {
        return pprice11;
    }

    public void setPprice11(float pprice11) {
        this.pprice11 = pprice11;
    }

    public float getPprice12() {
        return pprice12;
    }

    public void setPprice12(float pprice12) {
        this.pprice12 = pprice12;
    }

    public float getPprice13() {
        return pprice13;
    }

    public void setPprice13(float pprice13) {
        this.pprice13 = pprice13;
    }

    public float getPprice14() {
        return pprice14;
    }

    public void setPprice14(float pprice14) {
        this.pprice14 = pprice14;
    }

    public float getPprice15() {
        return pprice15;
    }

    public void setPprice15(float pprice15) {
        this.pprice15 = pprice15;
    }

    public String getPpromotion1() {
        return ppromotion1;
    }

    public void setPpromotion1(String ppromotion1) {
        this.ppromotion1 = ppromotion1;
    }

    public String getPpromotion2() {
        return ppromotion2;
    }

    public void setPpromotion2(String ppromotion2) {
        this.ppromotion2 = ppromotion2;
    }

    public String getPpromotion3() {
        return ppromotion3;
    }

    public void setPpromotion3(String ppromotion3) {
        this.ppromotion3 = ppromotion3;
    }

    public String getPreferent() {
        return preferent;
    }

    public void setPreferent(String preferent) {
        this.preferent = preferent;
    }

    public String getPremark() {
        return premark;
    }

    public void setPremark(String premark) {
        this.premark = premark;
    }

    public float getPscost() {
        return pscost;
    }

    public void setPscost(float pscost) {
        this.pscost = pscost;
    }

    public String getPservice() {
        return pservice;
    }

    public void setPservice(String pservice) {
        this.pservice = pservice;
    }

    public String getPset() {
        return pset;
    }

    public void setPset(String pset) {
        this.pset = pset;
    }

    public String getPstatus() {
        return pstatus;
    }

    public void setPstatus(String pstatus) {
        this.pstatus = pstatus;
    }

    public String getPstock() {
        return pstock;
    }

    public void setPstock(String pstock) {
        this.pstock = pstock;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getPunit1() {
        return punit1;
    }

    public void setPunit1(String punit1) {
        this.punit1 = punit1;
    }

    public String getPuserupdate() {
        return puserupdate;
    }

    public void setPuserupdate(String puserupdate) {
        this.puserupdate = puserupdate;
    }

    public String getPvat() {
        return pvat;
    }

    public void setPvat(String pvat) {
        this.pvat = pvat;
    }

    public String getPvender() {
        return pvender;
    }

    public void setPvender(String pvender) {
        this.pvender = pvender;
    }

   

    
   
            
    
    
    
    
}
