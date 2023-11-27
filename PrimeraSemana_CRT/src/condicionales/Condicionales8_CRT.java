package condicionales;

import java.util.Scanner;

public class Condicionales8_CRT {

	public static void main(String[] args) {
		
		/*
		 * 8. Realiza un programa que pida por teclado el resultado (dato entero) 
		 * obtenido al lanzar un dado de seis caras y muestre por pantalla el 
		 * n�mero en letras (dato cadena) de la cara opuesta al resultado 
		 * obtenido. Nota 1: En las caras opuestas de un dado de seis caras 
		 * est�n los n�meros: 1-6, 2-5 y 3-4. Nota 2: Si el n�mero del dado 
		 * introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: 
		 * �ERROR: n�mero incorrecto�.
		 */
		
		int resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el resultado al lanzar un dado");
		resultado=entrada.nextInt();
		
		entrada.close();
		
		if (resultado == 1 ) {
			System.out.println("La cara opuesta al resultado es seis");
		} else if( resultado == 2 ) {
			System.out.println("La cara opuesta al resultado es cinco");
		} else if( resultado == 3 ) {
			System.out.println("La cara opuesta al resultado es cuatro");
		} else if( resultado == 4 ) {
			System.out.println("La cara opuesta al resultado es tres");
		} else if( resultado == 5 ) {
			System.out.println("La cara opuesta al resultado es dos");
		} else if( resultado == 6 ) {
			System.out.println("La cara opuesta al resultado es uno");
		} else {
			System.out.println("Error: n�mero incorrecto");
		}
		
	}

}
