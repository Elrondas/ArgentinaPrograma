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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean resp;
        System.out.println("Ingrese un numero: ");
        int n = input.nextInt();
        resp=primo(n);
        System.out.println(resp);
    }
    
    public static boolean primo(int n){
        int cont=0;
        boolean prm  = false;
        for (int i=1;i<=n;i++){
            if((n%i)==0){
                cont++;
            }
        }
        if (cont==2){
            prm = true;
        }
        return prm;
    }
    
}
