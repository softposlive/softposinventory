/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities.zip;

import java.awt.Frame;
import java.io.File;
import javax.swing.JOptionPane;
import utilities.directory.DirectoryUtility;

public class ZipUnzip extends ZipUtility {
    
    public boolean zip(String sourcePath , String destinationPath ){
        try {
            File srcFile = new File(sourcePath.trim());
            if (!srcFile.exists()) {
                JOptionPane.showMessageDialog(new Frame(), "Can not find file or directory : \n" +sourcePath);
//                System.out.println("Can not find file or directory : " + sourcePath);
                return false;
            }
            
            DirectoryUtility du = new DirectoryUtility();
            File desFile = du.getFileAndCreateDir(destinationPath.trim());
            
            if(srcFile.isFile())
                zipFile(srcFile, desFile);
            else if(srcFile.isDirectory())
                zipDirectory(srcFile, desFile);           
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            
            //zip not complete
            return false;
        }
        
    }
    
    public boolean unzip(String zipPath , String extractToPath ){
        try {
            File srcFile = new File(zipPath.trim());
            if (!srcFile.exists()) {
                JOptionPane.showMessageDialog(new Frame(), "Can not find file or directory : \n" +zipPath);
//                System.out.println("Can not find file or directory : " + zipPath);
                return false;
            }
            
            DirectoryUtility du = new DirectoryUtility();
            File desFile = du.getFileAndCreateDir(extractToPath.trim());
            
            unzip(srcFile, desFile);
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            
            //unzip not complete
            return false;
        }
        
    }
}
