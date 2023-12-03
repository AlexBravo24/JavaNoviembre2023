package ciclos;

import java.util.Scanner;

public class Ciclos3_JTR {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo

		Scanner entrada = new Scanner(System.in);
		String cadena;
		System.out.println("Introduce una cadena de texto");
		cadena= entrada.nextLine();
		entrada.close();
		int j=cadena.length()-1;
		boolean condicion=true;
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) != cadena.charAt(j)) {
				System.out.println("No es palindromo!");
				condicion=false;
				break;
			}
			j--;
		}
		if(condicion==true) {
			System.out.println("Es palindromo!");
		}
		
	}

}
