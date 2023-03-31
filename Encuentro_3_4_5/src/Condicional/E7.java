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
public class E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x;
        int cor=0,incor=0;
        do {
            System.out.println("Ingrese una frase de 5 caracteres, que inicie con X y finalize con O");
            
            x = input.nextLine();
            
            if (x.equals("&&&&&")){
                break;
            }else if(x.length()!= 5){
                incor++;
            }else if(!(x.substring(0,1).equals("X"))){
                incor++;
            }else if(!(x.substring(4,5).equals("O"))){
                incor++;
            }else{
                cor++;
            }              
        }while(!(x.equals("&&&&&")));
        
        System.out.println("La cantidad de correctas es :" + cor);
        System.out.println("La cantidad de incorrectas es: " + incor);
    }
    
}
