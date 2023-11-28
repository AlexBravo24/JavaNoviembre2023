package condicionales;

import java.util.Scanner;

public class Condicionales4_HVR {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si
		//contiene letras mayúsculas

		String cadena;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Este codigo identifica si un texto contiene letras mayusculas");
		System.out.println("Ingresa un texto");
		cadena = entrada.nextLine();
		entrada.close();
		
		boolean mayusculas = cadena.matches(".*[A-Z].*");
		//La funcionalidad matches debe delimitarse entre el punto y los asteriscos por
		//si al menos una letra en el texto es mayuscula
		
		System.out.println("El texto contiene letras mayusculas: " + mayusculas);
		
	    
	}
}