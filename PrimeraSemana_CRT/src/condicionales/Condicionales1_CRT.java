package condicionales;

import java.util.Scanner;

public class Condicionales1_CRT {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que reciba dos números por teclado e 
		 * indique cuál es mayor o si son iguales.
		 */
		int x;
		int y;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		x=entrada.nextInt();
			
		System.out.println("Introduce un segundo número");
		y=entrada.nextInt();
		
		if (x > y) {
			System.out.println("El primer número es mayor que el segundo");
		} else if(y > x) {
			System.out.println("El segundo número es mayor que el primero");
		} else {
			System.out.println("Los dos número son iguales");
		}
		
	}

}
