package condicionales;

import java.util.Scanner;

public class Condicionales4_JTR {

	public static void main(String[] args) {
		/*
		 *  Realiza un programa que lea una cadena por teclado y compruebe si 
			contiene letras mayúsculas
		 */
		Scanner entrada = new Scanner(System.in);
		String cadena;
		System.out.println("Introduce una cadena de texto");
		cadena= entrada.nextLine();
		entrada.close();
		
		if(cadena.equals(cadena.toLowerCase())) {
			System.out.println("La cadena no contiene mayusculas");
		}else {
			System.out.println("La cadena si contiene mayusculas");
		}
		
		
	}

}
