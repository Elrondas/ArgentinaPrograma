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
public class E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Que tipo de socio es?: ");
        char opt = input.next().toUpperCase().charAt(0);
        float val;
        switch(opt){
            case 'A':
                System.out.println("Ingrese el valor del tratamiento: ");
                val = input.nextInt();
                System.out.println("Debera pagar :$"+ val*0.50);
                break;
            case 'B':
                System.out.println("Ingrese el valor del tratamiento: ");
                val = input.nextInt();
                System.out.println("Debera pagar :$"+ (val-(val*0.35)));
                break;
            case 'C':
                System.out.println("Ingrese el valor del tratamiento: ");
                val = input.nextInt();
                System.out.println("Debera pagar :$"+ val);
                break;
        }
        
    }
    
}
