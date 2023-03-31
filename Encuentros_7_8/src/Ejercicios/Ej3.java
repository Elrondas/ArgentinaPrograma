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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros: ");
        float eur = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese a que moneda convertir (Yenes/Dolares/Libras)");
        String exchange = input.nextLine();
        arbolito(eur,exchange);
        
    }
   
    public static void arbolito(float cant,String mon){
        
        switch(mon.toLowerCase()){
            case "yenes":
                System.out.println("El cambio a Yenes es de: " + cant*129.852);
                break;
            case "dolares":
                System.out.println("El cambio a Dolares es de: " + cant*1.28611);
                break;
            case "libras":
                System.out.println("El cambio a Yenes es de: " + cant*0.86);
                break;
            default:
                System.out.println("Error");                       
        }
    }
}
