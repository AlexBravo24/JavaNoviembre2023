package condicionales;

import java.util.Scanner;

public class Condicionales3_CRT {

	public static void main(String[] args) {
		
		// Crea un programa que pida al usuario dos n�meros y 
		//muestre el resultado de su divisi�n. Si el segundo 
		//n�mero es 0, debe mostrar un mensaje de error.
		
		int x;
		int y;
		int resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		x=entrada.nextInt();
		
		System.out.println("Introduce un segundo n�mero");
		y=entrada.nextInt();
		
		if (y == 0) {
			System.out.println("Error, se capturo cero en el denominador");
		} else {
			resultado= x/y;
			System.out.println("La divisi�n es igual a: " + resultado);
		}

	}

}
