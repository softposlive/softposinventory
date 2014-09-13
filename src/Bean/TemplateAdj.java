package Bean;

public class TemplateAdj {
    private String pcode = "";
    private String pname = "";
    private String group_code = "";
    private String group_name = "";
    private String unit = "";
    private String price = "0.000";
    private String remark = "";
    private String rinhand = "-";
    private boolean isStock = false;

    public boolean isIsStock() {
        return isStock;
    }

    public void setIsStock(boolean isStock) {
        this.isStock = isStock;
    }

    public String getRinhand() {
        return rinhand;
    }

    public void setRinhand(String rinhand) {
        this.rinhand = rinhand;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getGroup_code() {
        return group_code;
    }

    public void setGroup_code(String group_code) {
        this.group_code = group_code;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

}
