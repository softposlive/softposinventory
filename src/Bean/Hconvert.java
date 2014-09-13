
package Bean;

import java.util.Date;

public class Hconvert{
    private String rNo;
    private Date rDate;
    private String rRemark;
    private String rStk;
    private int rTotal;
    private String rUser;
    private String rPost;
    private String rUserpost;
    private Date rPostDate;
    private String rPostTime;

    public Hconvert() {
    }

    public Object[] getAll(){
        return new Object[]{rNo, rDate, rRemark, rTotal, rUser, rPost, rUserpost, rPostDate, rPostTime};
    }

    public Hconvert(String rNo) {
        this.rNo = rNo;
    }

    public Hconvert(String rNo, Date rDate, int rTotal, String rPost, String rUserpost) {
        this.rNo = rNo;
        this.rDate = rDate;
        this.rTotal = rTotal;
        this.rPost = rPost;
        this.rUserpost = rUserpost;
    }

    public String getRNo() {
        return rNo;
    }

    public void setRNo(String rNo) {
        this.rNo = rNo;
    }

    public Date getRDate() {
        return rDate;
    }

    public void setRDate(Date rDate) {
        this.rDate = rDate;
    }

    public String getRRemark() {
        return rRemark;
    }

    public void setRRemark(String rRemark) {
        this.rRemark = rRemark;
    }

    public String getRStk() {
        return rStk;
    }

    public void setRStk(String rStk) {
        this.rStk = rStk;
    }

    public int getRTotal() {
        return rTotal;
    }

    public void setRTotal(int rTotal) {
        this.rTotal = rTotal;
    }

    public String getRUser() {
        return rUser;
    }

    public void setRUser(String rUser) {
        this.rUser = rUser;
    }

    public String getRPost() {
        return rPost;
    }

    public void setRPost(String rPost) {
        this.rPost = rPost;
    }

    public String getRUserpost() {
        return rUserpost;
    }

    public void setRUserpost(String rUserpost) {
        this.rUserpost = rUserpost;
    }

    public Date getRPostDate() {
        return rPostDate;
    }

    public void setRPostDate(Date rPostDate) {
        this.rPostDate = rPostDate;
    }

    public String getRPostTime() {
        return rPostTime;
    }

    public void setRPostTime(String rPostTime) {
        this.rPostTime = rPostTime;
    }
}
