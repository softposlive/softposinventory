
package Bean;

import java.util.Date;

public class Convert {
    private String r_no;
    private String r_que;
    private String r_pcode;
    private String r_type;
    private float r_qty;
    private String r_post;
    private float r_price;
    private float r_amount;
    private String r_user;
    private String r_time;
    private Date r_entrydate;
    //other
    private String r_stock;
    private String r_unit;

    public String getR_stock() {
        return r_stock;
    }

    public void setR_stock(String r_stock) {
        this.r_stock = r_stock;
    }

    public String getR_unit() {
        return r_unit;
    }

    public void setR_unit(String r_unit) {
        this.r_unit = r_unit;
    }
    
    public Object[] getAll(){
        return new Object[]{r_no, r_que, r_pcode, r_type, r_qty, r_post,
        r_price, r_amount, r_user, r_time, r_entrydate};
    }
    
    public String getR_que() {
        return r_que;
    }

    public void setR_que(String r_que) {
        this.r_que = r_que;
    }

    public String getR_type() {
        return r_type;
    }

    public void setR_type(String r_type) {
        this.r_type = r_type;
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

    public float getR_qty() {
        return r_qty;
    }

    public void setR_qty(float r_inhand) {
        this.r_qty = r_inhand;
    }

    public String getR_no() {
        return r_no;
    }

    public void setR_no(String r_no) {
        this.r_no = r_no;
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
