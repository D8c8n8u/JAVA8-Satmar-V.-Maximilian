/*
 * Open file
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author famili
 */
public class OpenFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader r;
        try {
            r = new BufferedReader(new FileReader("text.txt"));
            String firstLine = r.readLine();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
    
}
