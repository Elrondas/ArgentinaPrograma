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
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=1,b=2,c=3,d=4,x;
        x=b;
        b=c;
        c=a;
        a=d;
        d=x;
        
        System.out.println("A="+a+" B="+b+" C="+c+" D="+d);
    }
    
}
