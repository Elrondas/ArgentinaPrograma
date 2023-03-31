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
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        int n = input.nextInt();
        int j = 0;
        float aux;
        float prom1=0,prom2=0;       
        
        for (int i=1;i<=n;i++){
            System.out.println("Ingrese la medida de la persona n° "+i);
            aux=input.nextFloat();
            prom1 = prom1 + aux;
            if (aux<1.60){
                prom2=prom2+aux;
                j++;
            }
        }
        
        System.out.println("El promedio de estatura general es: " + prom1/n);
        System.out.println("El promedio de estatura de personas por debajo de 1.6m es de: " + prom2/j );
    }
    
}
