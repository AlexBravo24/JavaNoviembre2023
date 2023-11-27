package condicionales;

import java.util.Scanner;

public class Condicionales4_AGZ {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.
		Scanner entrada = new Scanner(System.in);
		String palabra; 
		String minuscula;
		System.out.println("Ingresa una oracion o palabra");
		palabra = entrada.nextLine();
		minuscula=palabra.toLowerCase();
		if(palabra.equals(minuscula)) {
			System.out.println("No contiene letras mayusculas");
		} else {
			System.out.println("Contiene letras mayusculas");
		}
		

	}

}
