package ciclos;

import java.util.Scanner;

public class Cuclos3_pogm {
	public static boolean Palidromo(String palabra) {
		
		
		palabra = palabra.toLowerCase();
		palabra = palabra.replace(" "," ");
		palabra = palabra.replace(" ","a ");
		palabra = palabra.replace(" ","e ");
		palabra = palabra.replace(" ","i ");
		palabra = palabra.replace(" ","o ");
		palabra = palabra.replace(" ","u ");
		
		int a =0;
		int b = palabra.length() - 1;
		
		for(int i=0; i<palabra.length(); i++) {
			if(palabra.charAt(a) == palabra.charAt(b)) {
				a++;
				b--;
			}
			else 
				return false;
			
		}
		return true;
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		//3. Realiza un programa para determinar si un String es palíndromo.
		
		Scanner lector = new Scanner(System.in);
		
		String palabra;
		
		System.out.println("Ingresar una palabra: ");
		palabra = lector.nextLine();
		
		if (Palidromo(palabra)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
		
		


	}

}
