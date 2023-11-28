package condicionales;

import java.util.Scanner;

public class Condicionales2_CRT {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida un número por teclado 
		 * y nos indique si es par o impar.
		 */
		int x;
		int y;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		x=entrada.nextInt();
		
		y = x%2;
		
		if (y == 0) { //Si x es menor que 10
			//Ejecutamos el codigo
			System.out.println("Es un número par");
		}else {
			//Ejecuta lo siguiente
			System.out.println("Es un número impar");
		}
		

	}

}
