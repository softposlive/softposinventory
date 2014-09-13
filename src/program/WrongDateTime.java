/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package program;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author user
 */
public class WrongDateTime {
    public static Date dCurrent = new Date();

    public static boolean compareDateTime(Date d){
        if(dCurrent.compareTo(d)>0){
            return false;
        }else{
            return true;
        }
    }
    public static Date getDateCurrent(){
        return dCurrent;
    }
    public static boolean compareDateString(String date){
        Calendar dateManual = Calendar.getInstance();
        try {
            String []split = date.split("/");
            dateManual.set(Integer.parseInt(split[2]), Integer.parseInt(split[1])-1, Integer.parseInt(split[0]));
        } catch (Exception e) {
            dateManual = Calendar.getInstance();
        }
        return compareDateTime(dateManual.getTime());
    }
    public static void main(String[] args) {
        compareDateString("2010/01/01");
    }
}
