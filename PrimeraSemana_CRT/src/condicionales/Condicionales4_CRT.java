package condicionales;

import java.util.Scanner;

public class Condicionales4_CRT {

	public static void main(String[] args) {
		
		// Realiza un programa que lea una cadena por teclado y
		//compruebe si contiene letras mayúsculas.

		String text;
		String textMayus;
		
		System.out.println("Captura un texto");
		
		Scanner entrada = new Scanner(System.in);
		
		text = entrada.nextLine();
		textMayus = text.toLowerCase();
		
		if (text.equals(textMayus)) { 
			System.out.println("El texto no contiene mayusculas");
		}else {
			System.out.println("El texto si contiene mayusculas");
		}
		
	}

}
