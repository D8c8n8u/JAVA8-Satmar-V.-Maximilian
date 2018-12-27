/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author famili
 */
public class Temperature {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give in the Celsiu value");
        Scanner sc = new Scanner(System.in);
        double Celsius = sc.nextDouble();
        double fahrenheit = 9.0 / 5.0 *Celsius + 32.0;
        System.out.println("Fahrenheit:"+fahrenheit);
    }
    
}

