/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicional;
import java.util.Scanner;
/**
 *
 * @author lunaj
 */
public class E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=0,i;
        System.out.println("Ingrese el limite: ");
        int n = input.nextInt();
        
        while(x<=n){
            System.out.println("Ingrese un numero: ");
            i = input.nextInt();
            x=x+i;
        }
        
        System.out.println("La suma de los numeros es: "+ x);
    }
    
}
