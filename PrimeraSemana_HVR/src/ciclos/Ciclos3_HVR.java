package ciclos;

import java.util.Scanner;

public class Ciclos3_HVR {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		System.out.println("    Palindromo");
		System.out.println("Ingresa una palabra");
		Scanner entrada = new Scanner(System.in);
		String palabra;
		String alreves = "";
		
		palabra=entrada.nextLine();
		
		int tamaño = palabra.length();
		
		for (int i=tamaño-1; i>=0; i--) {
			alreves=alreves+palabra.charAt(i);
			
		}
		System.out.println(palabra);
		System.out.println(alreves);
		
		if(palabra.replace(" ", "").equalsIgnoreCase(alreves.replace(" ",""))) {
			
			System.out.println("LA PALABRA SI ES UN PALINDROMO");
		}else {
			System.out.println("LA PALABRA NO ES UN PALINDROMO");
		}
		
		
		

	}

}
