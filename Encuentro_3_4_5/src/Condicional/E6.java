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
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int opt;
       char conf = 'N';
       do {
           System.out.println("Ingrese el primer numero: ");
           int x = input.nextInt();
           System.out.println("Ingrese el segundo numero: ");
           int y = input.nextInt();
           System.out.println("1.Sumar");
           System.out.println("2.Restar");
           System.out.println("3.Multiplicar");
           System.out.println("4.Dividir");
           System.out.println("5.Salir");
           opt = input.nextInt();
           switch(opt){
               case 1:
                   System.out.println("La suma de los numeros es: " + (x+y));
                   break;
               case 2:
                   System.out.println("La resta de los numeros es: " + (x-y));
                   break;
               case 3:
                   System.out.println("La multiplicacion de los numeros es: " + (x*y));
                   break;
               case 4:
                   System.out.println("La division de los numeros es: " + (x/y));
                   break;
               case 5:
                   System.out.println("Seguro desea salir? (Y/N)");
                   conf = input.next().toUpperCase().charAt(0);
                   break;
           }
       }while(conf !='Y');
    }
    
}
