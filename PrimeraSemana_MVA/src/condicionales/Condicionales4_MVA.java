package condicionales;

import java.util.Scanner;

public class Condicionales4_MVA {
	public static void main(String[] args) {
		
//		Realiza un programa que lea una cadena por teclado y compruebe si 
//		contiene letras mayúsculas.

		String cadena, compara;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite la frase");
		cadena = entrada.nextLine();
		
		compara= cadena.toLowerCase();
		
		if (cadena.equals(compara)) {
			System.out.println("la frase no contiene mayusculas");
			
		}
		else {
			System.out.println("la frase contiene mayusculas");
		}
		

	}
	}

