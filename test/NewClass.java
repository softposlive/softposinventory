
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natee
 */
public class NewClass {
    public static void main(String[] args) {
        SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println(sim.parse("02/11/2010"));
        } catch (ParseException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
