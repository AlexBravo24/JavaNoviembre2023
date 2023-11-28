package condicionales;

import java.util.Scanner;

public class Condicionales2_MVA {
	public static void main(String[] args) {
	
//		Realiza un programa que pida un número por teclado y nos indique si es par 
//		o impar.
	
		int num;
		
		Scanner entrada = new Scanner (System.in);
		
		num = entrada.nextInt();
		
		if ( num%2 == 0) {
			System.out.println("el numero es par" );
		}
		else {
			System.out.println("el numero es impar");
		}

		
	}

}
