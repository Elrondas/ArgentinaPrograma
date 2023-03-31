/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author lunaj
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        //nombre = input.nextLine();
        saludo(nombre=input.nextLine());
    }
   
    
    
    
    public static void saludo(String a){
        System.out.println("Hola, "+a);
} 
   
}
