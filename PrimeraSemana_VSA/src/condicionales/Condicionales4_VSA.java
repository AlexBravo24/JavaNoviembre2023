package condicionales;

import java.util.Scanner;

public class Condicionales4_VSA {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si
		// contiene letras mayúsculas.

		/*
		 * Variables a utilizar: cadena (string) ALGORITMO - LEER cadena - Cálculos si
		 * longitud cadena != 1 --> No es una letra mayúscula si cadena > A y <Z --> Es
		 * una letra mayúscula si no --> No es una letra mayúscula - MOSTRAR resultado
		 */
		Scanner entrada = new Scanner(System.in);
		String cadena;

		// Solicitud de datos al usuario
		System.out.println("Este programa nos pide una cadena y comprueba si es una letra mayúscula.");
		System.out.print("Introduce la cadena que desees: ");
		cadena = entrada.nextLine();

		// Realizamos Cálculos y mostramos en pantalla
		if (cadena.length() != 1) {
			System.out.println("La cadena no es una letra mayúscula");
		
		} else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z") <= 0)) {
			System.out.println("La cadena es una letra mayúscula.");
		} else {
			System.out.println("La cadena no es una letra mayúscula.");
		}
	}

}
