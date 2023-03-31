/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1E1;

import java.util.Scanner;

/**
 *
 * @author lunaj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num1, num2;
       
        System.out.println("Ingrese primer numero");
        num1 =  input.nextInt();
        
        System.out.println("Ingrese segundo numero");
        num2 =  input.nextInt();
        
        
        
        System.out.println("El resultado de la suma es: " + (num1 + num2));
       
    }
    
}
