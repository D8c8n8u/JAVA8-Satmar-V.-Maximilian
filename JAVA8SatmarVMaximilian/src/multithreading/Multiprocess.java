/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author famili
 */
public class Multiprocess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         
        ProcessBuilder pb; 
        pb = new ProcessBuilder( 
                "Notepad.exe"); 
               
       
                Process p1 = pb.start();
                Process p2 = pb.start();
            

    }
    
}


