package condicionales;

import java.util.Scanner;

public class Condicionales4_PRC {

	public static void main(String[] args) {
		//  Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.
		
		Scanner palabra= new Scanner(System.in);
		
		 System.out.println("escribe alguna palabra");
		
		String frase= palabra.nextLine();
		
		for( int i=0; i<frase.length(); i++) {
			
			if(Character.isUpperCase(frase.charAt(i))) {
				
				System.out.println("TIENE MAYUSCULAS");
			} else {
				
				System.out.println("no tiene mayusculas");
			}
			
		}
		
		palabra.close();
	}

}			
	
		
			
	

	
		
		

