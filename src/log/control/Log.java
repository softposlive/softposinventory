package log.control;

import javax.swing.JOptionPane;

public class Log {
    
    public static void p(String str){
        System.out.println(str);
        //JOptionPane.showMessageDialog(null, str);
    }
    
    public static void e(String ex){
        System.out.println(ex);
        JOptionPane.showMessageDialog(null, ex);
    }
    
    public static void m(String msg){
        System.out.println(msg);
        JOptionPane.showMessageDialog(null, msg);
    }
}
