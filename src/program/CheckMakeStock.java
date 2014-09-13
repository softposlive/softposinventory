/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package program;

import DBcontrol.Db_product;
import javax.swing.JOptionPane;

/**
 *
 * @author natee
 */
public class CheckMakeStock {
    public static boolean txt7_Stock(String text) {
        boolean b = false;
        try {
            Db_product db = new Db_product();
            if (!db.seek(text)) {
                JOptionPane.showMessageDialog(null, "ไม่พบรหัสสินค้า " + text + " ในแฟ้มข้อมูลหลัก กรุณาตรวจสอบ...");
                b = false;
            } else {
                if (!db.seek(text, 'Y', 'Y')) {
                    JOptionPane.showMessageDialog(null, "รหัสสินค้านีกำหนดให้ไม่ต้องทำสต็อกสินค้า...");
                    b = false;
                } else {
                    b = true;
                }
            }
        } catch (Exception ex) {
            b = false;
        }
        return b;
    }
}
