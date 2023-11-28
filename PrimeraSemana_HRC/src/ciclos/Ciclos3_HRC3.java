package ciclos;

import java.util.Scanner;

public class Ciclos3_HRC3 {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.

		String cadena;
		char [] palindromo;
		int izquierdo, derecho;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la palabra:");
		cadena = entrada.nextLine();
		entrada.close(); // Cerrar scanner para ahorrar memoria
		
		palindromo = cadena.toCharArray();
		izquierdo = 0;
		derecho = palindromo.length - 1;;

		while (izquierdo < derecho) {
			if (palindromo[izquierdo] == palindromo[derecho]) {
				derecho --;
				izquierdo ++;
			}
			else {
				System.out.println("No es PALINDROMO");
				break;
			}

		}
		
		if (izquierdo == derecho ) {
			System.out.println("ES PALINDROMO");
		}
		

	}

}
