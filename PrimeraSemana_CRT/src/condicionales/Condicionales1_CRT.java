package condicionales;

import java.util.Scanner;

public class Condicionales1_CRT {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que reciba dos n�meros por teclado e 
		 * indique cu�l es mayor o si son iguales.
		 */
		int x;
		int y;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		x=entrada.nextInt();
			
		System.out.println("Introduce un segundo n�mero");
		y=entrada.nextInt();
		
		if (x > y) {
			System.out.println("El primer n�mero es mayor que el segundo");
		} else if(y > x) {
			System.out.println("El segundo n�mero es mayor que el primero");
		} else {
			System.out.println("Los dos n�mero son iguales");
		}
		
	}

}
