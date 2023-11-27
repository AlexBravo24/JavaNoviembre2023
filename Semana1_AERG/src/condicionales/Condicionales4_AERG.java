package condicionales;

import java.util.Scanner;

public class Condicionales4_AERG {

//	4. Realiza un programa que lea una cadena por teclado y compruebe si 
//	contiene letras mayúsculas.
	
	public static void main(String[] args) 
	{
		String text;
		String textM;
		boolean mayus;
		
		System.out.println("Escriba cualquier texto");
		
		Scanner scn = new Scanner(System.in);
		
		text = scn.nextLine();		
		textM = text.toLowerCase();
		mayus = text.equals(textM);
		
		if (mayus == true) {
			System.out.println("El texto no contiene mayuscualas");	
		} else {	
			System.out.println("El texto si contiene mayuscualas");
		}
		
		

	}

}
////Forma 2
//String text;
//String textM;
////boolean mayus;
//
//System.out.println("Escriba cualquier texto");
//
//Scanner scn = new Scanner(System.in);
//
//text = scn.nextLine();		
//textM = text.toLowerCase();
////mayus = text.equals(textM);
//
//if (text.equals(textM)) {
//	System.out.println("El texto no contiene mayuscualas");	
//} else {	
//	System.out.println("El texto si contiene mayuscualas");
//}