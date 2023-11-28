package condicionales;

import java.util.Scanner;

public class Condicionales4_VSA {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si
		// contiene letras may�sculas.

		/*
		 * Variables a utilizar: cadena (string) ALGORITMO - LEER cadena - C�lculos si
		 * longitud cadena != 1 --> No es una letra may�scula si cadena > A y <Z --> Es
		 * una letra may�scula si no --> No es una letra may�scula - MOSTRAR resultado
		 */
		Scanner entrada = new Scanner(System.in);
		String cadena;

		// Solicitud de datos al usuario
		System.out.println("Este programa nos pide una cadena y comprueba si es una letra may�scula.");
		System.out.print("Introduce la cadena que desees: ");
		cadena = entrada.nextLine();

		// Realizamos C�lculos y mostramos en pantalla
		if (cadena.length() != 1) {
			System.out.println("La cadena no es una letra may�scula");
		
		} else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z") <= 0)) {
			System.out.println("La cadena es una letra may�scula.");
		} else {
			System.out.println("La cadena no es una letra may�scula.");
		}
	}

}
