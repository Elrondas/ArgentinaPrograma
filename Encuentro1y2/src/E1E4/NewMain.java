/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1E4;

import java.util.Scanner;

/**
 *
 * @author lunaj
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C,F;
        
        System.out.println("Ingrese la temperatura en Centigrados: ");
        C = input.nextDouble();
        
        F = 32 + (9 * C / 5); 
        
        System.out.println("La temperatura en farenheits es de: " + F);
    }
    
}
