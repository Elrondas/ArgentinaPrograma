/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1E3;

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
        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = input.nextLine();
        
        System.out.println (frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
