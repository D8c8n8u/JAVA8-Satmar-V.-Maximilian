/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replacingvalue;

/**
 *
 * @author famili
 */
public class ReplacingValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int first = 7;
        int second = 19;
        int third;
        third = second;
        second = first;
        first = third;
        //Dysneiland
        System.out.println("first="+first+" second="+second);
    }
    
}
