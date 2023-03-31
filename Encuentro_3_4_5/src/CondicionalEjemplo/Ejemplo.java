/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CondicionalEjemplo;

import java.util.Scanner;

/**
 *
 * @author lunaj
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opinion;
        
        System.out.println("Ingrese un puntaje para la pelicula: ");
        opinion = input.nextInt();
        
        if (opinion > 0 && opinion <= 5){
            switch (opinion) {
                case 1:
                case 2: System.out.println("La pelicula te parecio horrible");
                break;
                case 3: System.out.println("La pelicula te parecio mala");
                break;
                case 4: System.out.println("La pelicula te parecio buena");
                break;
                case 5: System.out.println("La pelicula te parecio muy buena");
                break;
            }         
        }else if (opinion <= 0 || opinion > 5 ){
            System.out.println("Puntaje no valido.");
        }
            
        
              
    }
    
}
