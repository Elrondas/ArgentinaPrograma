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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name,conftxt;
        int age;
        boolean first=true,conf=true;
        do{
            if(!first){
                System.out.println("Ingrese el nombre: ");
                name = input.nextLine();
                System.out.println("Ingrese la edad: ");
                age = input.nextInt();
                data(name,Integer.toString(age));
                
                System.out.println("Desea seguir ingresando datos? (Si/No)");
                input.nextLine();
                conftxt = input.nextLine();
                if (conftxt.equalsIgnoreCase("no")){
                    conf = false;
                }
            }else{
                System.out.println("Desea ingresar datos? (Si/No)");
                first=false;
                conftxt = input.nextLine();
                if (conftxt.equalsIgnoreCase("no")){
                    conf=false;
                }
            }        
        }while(conf);
        
    }
    
    /*System.out.println("Ingrese el nombre: ");
                name = input.nextLine();
                System.out.println("Ingrese la edad: ");
                age = input.nextInt();
                data(name,Integer.toString(age));
                
                System.out.println("Desea seguir Ingresando datos? (Si/No)");
                System.out.println("");
                conftxt = input.nextLine();
                if (conftxt.equalsIgnoreCase("si")){
                    conf = false;
                }
    
    
    System.out.println("Desea ingresar datos? (Si/No)");
                first=false;
                conftxt = input.nextLine();
                if (conftxt.equalsIgnoreCase("no")){
                    conf=false;
                }
    */
    
    
    public static void data(String name,String age){
        
        System.out.println("La persona llamada "+name+" tiene: "+age+" años.");
        
    }
}
