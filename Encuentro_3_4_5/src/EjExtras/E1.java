/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjExtras;
import java.util.Scanner;
/**
 *
 * @author lunaj
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos: ");
        int d=0,h,m;
        int n = input.nextInt();
        if (n>=1440){
            d = n/1440;
            m = n%1440;
            h = m/60;
        }else{
            h = n/60;
        }
        System.out.println("La cantidad de minutos ingresados equivale a " + d +" dias y " + h + " horas.");
        
    }
    
}
