/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 * 
 *@author Max
 */
public class Calculator {
    
    int rezultat = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public  int aduna (int a, int b){
        rezultat = a+b;
        return rezultat;
    }
    
    public  int scade (int a, int b) {
        rezultat = a-b;
        return rezultat;
    }
    
    public int inmulteste (int a, int b) {
        rezultat = a*b;
        return rezultat;
    }
    
    public int imparte (int a, int b) {
        rezultat = a/b;
        return rezultat;
    }
    
    
}
