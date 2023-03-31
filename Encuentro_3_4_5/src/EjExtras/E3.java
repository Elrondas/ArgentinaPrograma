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
public class E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una letra: ");
        String n = input.nextLine().toLowerCase();
        
        if (n.equals("a")||n.equals("e")||n.equals("i")||n.equals("o")||n.equals("u")){
            System.out.println("Es una vocal");
        }else{
            System.out.println("Es consonante");
        }
        
    }
    
}
