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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese una secuencia de caracteres terminada en punto: ");
        String x = input.nextLine();
        x = conver(x);
        System.out.println(x);
    }
    public static String conver(String a){
        String frase="";
        String fraseConver;
        fraseConver = a.replace("a","@");
        fraseConver = fraseConver.replace("e","#");
        fraseConver = fraseConver.replace("i","$");
        fraseConver = fraseConver.replace("o","%");
        fraseConver = fraseConver.replace("u","*");
        
        /*for(int i=1;i<=a.length();i++){
            switch(a.substring(i-1,i)){
                case "a":
                    frase = frase + "@";
                    break;
                case "e":
                    frase = frase + "#";
                    break;
                case "i":
                   frase = frase + "$";
                   break;
                case "o":
                    frase = frase + "%";
                    break;
                case "u":
                    frase = frase + "*";
                    break;
                default :
                    frase = frase + a.substring(i-1,i);
                    break;
                    
            }
        }*/
        return fraseConver;
}
}