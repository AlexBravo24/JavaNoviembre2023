package condicionales;

import java.util.Scanner;

public class Condicionales4_ARHB {
	public static void main(String[] args) {
		/*Realiza un programa que lea una cadena por teclado y compruebe si 
			contiene letras may�sculas*/
		
		String cadena;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un texto para saber si contiene letras mayusculas:");
		cadena = entrada.nextLine();
		entrada.close();
		
		
		boolean mayusculas = cadena.matches(".*[A-Z].*");/*la funcionalidad matches debe delimitarse 
		entre el punto y los asteriscos por si al menos una letra en el texto es mayuscula*/
		
		System.out.println("La cadena contiene letras mayusculas:"+ mayusculas);
		
		
	}
}
