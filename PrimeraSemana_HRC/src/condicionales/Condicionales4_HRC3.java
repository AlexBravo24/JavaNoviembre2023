package condicionales;

import java.util.Scanner;

public class Condicionales4_HRC3 {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si
		// contiene letras mayúsculas.
		
		String cadena;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un texto:");
		cadena = entrada.nextLine();
		entrada.close(); // Cerrar scanner para ahorrar memoria
		
		boolean contieneMayusculas = cadena.matches(".*[A-Z].*"); // checa si la cadena tiene mayusculas
		
		System.out.println("La cadena tiene mayuscula: " + contieneMayusculas);

	}

}
