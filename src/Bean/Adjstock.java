/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author root
 */
public class Adjstock {
    private String r_no;
    private int r_que;
    private String r_pcode;
    private float r_onhand;
    private float r_inhand;
    private String r_post;
    private float r_adj;
    private float r_price;
    private float r_amount;
    private String r_remark;
    private String r_user;
    private String r_time;
    private Date r_entrydate;

    public float getR_adj() {
        return r_adj;
    }

    public void setR_adj(float r_adj) {
        this.r_adj = r_adj;
    }

    public float getR_amount() {
        return r_amount;
    }

    public void setR_amount(float r_amount) {
        this.r_amount = r_amount;
    }

    public Date getR_entrydate() {
        return r_entrydate;
    }

    public void setR_entrydate(Date r_entrydate) {
        this.r_entrydate = r_entrydate;
    }

    public float getR_inhand() {
        return r_inhand;
    }

    public void setR_inhand(float r_inhand) {
        this.r_inhand = r_inhand;
    }

    public String getR_no() {
        return r_no;
    }

    public void setR_no(String r_no) {
        this.r_no = r_no;
    }

    public float getR_onhand() {
        return r_onhand;
    }

    public void setR_onhand(float r_onhand) {
        this.r_onhand = r_onhand;
    }

    public String getR_pcode() {
        return r_pcode;
    }

    public void setR_pcode(String r_pcode) {
        this.r_pcode = r_pcode;
    }

    public String getR_post() {
        return r_post;
    }

    public void setR_post(String r_post) {
        this.r_post = r_post;
    }

    public float getR_price() {
        return r_price;
    }

    public void setR_price(float r_price) {
        this.r_price = r_price;
    }

    public int getR_que() {
        return r_que;
    }

    public void setR_que(int r_que) {
        this.r_que = r_que;
    }

    public String getR_remark() {
        return r_remark;
    }

    public void setR_remark(String r_remark) {
        this.r_remark = r_remark;
    }

    public String getR_time() {
        return r_time;
    }

    public void setR_time(String r_time) {
        this.r_time = r_time;
    }

    public String getR_user() {
        return r_user;
    }

    public void setR_user(String r_user) {
        this.r_user = r_user;
    }
    
}
