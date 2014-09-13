package Bean;

public class CheckReceiveDetail {
    private String product_id = "";
    private int orderdetail_qty = 0;
    private String product_desc = "";
    private String unit = "";
    private String reserve = "";
    private String price = "0.000";
    private String priceConvert = "0.000";
    private String doctype="";

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    public String getPriceConvert() {
        return priceConvert;
    }

    public void setPriceConvert(String priceConvert) {
        this.priceConvert = priceConvert;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public int getOrderdetail_qty() {
        return orderdetail_qty;
    }

    public void setOrderdetail_qty(int orderdetail_qty) {
        this.orderdetail_qty = orderdetail_qty;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }
    
}
