package condicionales;

import java.util.Scanner;

public class Condicionales3_CRT {

	public static void main(String[] args) {
		
		// Crea un programa que pida al usuario dos números y 
		//muestre el resultado de su división. Si el segundo 
		//número es 0, debe mostrar un mensaje de error.
		
		int x;
		int y;
		int resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		x=entrada.nextInt();
		
		System.out.println("Introduce un segundo número");
		y=entrada.nextInt();
		
		if (y == 0) {
			System.out.println("Error, se capturo cero en el denominador");
		} else {
			resultado= x/y;
			System.out.println("La división es igual a: " + resultado);
		}

	}

}
