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
public class Promotion {

    private String code = "";
    private String description = "";
    private Date startDate = null;
    private Date endDate = null;
    private String strDay = "";

    public Promotion() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStrDay() {
        return strDay;
    }

    public void setStrDay(String strDay) {
        this.strDay = strDay;
    }
}
