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
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int n, sum , x;
        char conf = 'Y';
        sum=0;
        x=1;
        do {
            System.out.println("Ingrese un numero entero: ");
        n = input.nextInt();
        
        if (n > 1000) {
            System.out.println("El numero es mayor a 1000, podria tardar mas de lo esperado esta seguro? (Y/N).");
            conf = input.next().toUpperCase().charAt(0);
        }
        } while(n <= 0 || conf == 'N');
        
        for (int i=1 ; i<=n ; i++){
            if (i%2 != 0){
                continue;
            }
            while(x<=i){
                sum += x;
                x++;   
            }
            System.out.println("La suma de los " + i + " numeros es " + sum);
        }
    }
    
}
