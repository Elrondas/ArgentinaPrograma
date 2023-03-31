/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
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
       
        int opt;
        do {
            System.out.println("Ingrese el primer numero: ");
            int n1 = input.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            int n2 = input.nextInt();
            System.out.println("1.Sumar");System.out.println("2.Restar");
            System.out.println("3.Multiplicar");System.out.println("Dividir.Sumar");
            opt = input.nextInt();
            switch(opt){
                case 1:
                    System.out.println(sumar(n1,n2));
                    break;
                case 2:
                    System.out.println(restar(n1,n2));
                    break;
                case 3:
                    System.out.println(multi(n1,n2));
                    break;
                case 4:
                    System.out.println(divi(n1,n2));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(opt!=5);
    }
    public static int sumar(int a,int b){
        int c = a + b;
        return c;
    }
    
    public static int restar(int a,int b){
        int c = a - b;
        return c;
    }
    
    public static int multi(int a,int b){
        int c = a * b;
        return c;
    }
    
    public static int divi(int a,int b){
        int c = a / b;
        return c;
    }
}
