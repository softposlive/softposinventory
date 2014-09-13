/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;


import java.util.Date;


/**
 *
 * @author root
 */
public class Hcharge {
    private String r_no;
    private Date r_date;
    private String r_remark;
    private int r_total;
    private String r_user;
    private String r_post;
    private String r_userpost;
    private Date r_postdate;
    private String r_posttime;
    private String emp_code;
    private String emp_name;

    public String getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Date getR_date() {
        return r_date;
    }

    public void setR_date(Date r_date) {
        this.r_date = r_date;
    }

    public String getR_no() {
        return r_no;
    }

    public void setR_no(String r_no) {
        this.r_no = r_no;
    }

    public String getR_post() {
        return r_post;
    }

    public void setR_post(String r_post) {
        this.r_post = r_post;
    }

    public Date getR_postdate() {
        return r_postdate;
    }

    public void setR_postdate(Date r_postdate) {
        this.r_postdate = r_postdate;
    }

    public String getR_posttime() {
        return r_posttime;
    }

    public void setR_posttime(String r_posttime) {
        this.r_posttime = r_posttime;
    }

    public String getR_remark() {
        return r_remark;
    }

    public void setR_remark(String r_remark) {
        this.r_remark = r_remark;
    }

    public int getR_total() {
        return r_total;
    }

    public void setR_total(int r_total) {
        this.r_total = r_total;
    }

    public String getR_user() {
        return r_user;
    }

    public void setR_user(String r_user) {
        this.r_user = r_user;
    }

    public String getR_userpost() {
        return r_userpost;
    }

    public void setR_userpost(String r_userpost) {
        this.r_userpost = r_userpost;
    }

    
    
}
