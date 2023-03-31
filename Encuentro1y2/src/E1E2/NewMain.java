/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1E2;

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
        String nombre;
        
        System.out.println("Ingrese su nombre: ");
        nombre = input.next();
        
        System.out.println("Su nombre es: " + nombre);
    }
    
}
