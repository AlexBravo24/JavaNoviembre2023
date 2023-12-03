package condicionales;

import java.util.Scanner;

public class Condicional4 {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si
		//contiene letras mayúsculas.
		
		String text;
		String text1;
		
		
		
		
		System.out.println("Ingresar un texto: " );
		Scanner cs = new Scanner(System.in);
	    
		text = cs.nextLine();
		text1 = text.toLowerCase();
		
		if (text.equals(text1)) {
			System.out.println("No Contiene Mayusculas");
		} else {
			System.out.println("Si Contiene Mayusculas");
		}
		

	}

}
