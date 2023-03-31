/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1E5;

import java.util.Scanner;

/**
 *
 * @author lunaj
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		final Scanner input = new Scanner(System.in);
		int num, doble, triple;
		double raiz;
		System.out.println("Ingrese un numero entero");
		num = Integer.parseInt(input.nextLine());
		
		doble = num * 2;
		triple = num * 3;
		raiz = Math.sqrt(num);
		
		System.out.println("El doble de: " + num + " es: " + doble);
		System.out.println("El triple de: " + num + " es: " + triple);
		System.out.println("La raiz de: " + num + " es: " + raiz);
		
		
		input.close();

	}
    }
    

