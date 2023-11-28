package condicionales;

import java.util.Scanner;

public class Condicionales4_VRDV {

	public static void main(String[] args) {
		
		
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas

		String cadena;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Escribe algo");
		
			cadena = entrada.nextLine();
			
			entrada.close();
		
		if (cadena.matches("A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z")) {
			
			System.out.println("El texto contiene mayusculas");
		}	else {
			
			System.out.println("El texto no contiene mayusculas");
			
		}
	}

}
