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
public class E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado: ");
        int x = input.nextInt();
        
        for (int i=1 ; i<=x ; i++) {
            for (int j=1 ; j<=x ; j++){
                if(j==x || j==1 || i==x || i==1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
            System.out.println(" ");
        }
    }
    
}
