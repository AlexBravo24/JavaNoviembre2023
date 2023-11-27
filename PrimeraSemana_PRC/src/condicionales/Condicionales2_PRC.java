package condicionales;

import java.util.Scanner;

public class Condicionales2_PRC {

	public static void main(String[] args) {
		
		//.Realiza un programa que pida un número por teclado y nos indique si es par 
		//o impar.
		
		Scanner parImpar = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		double numero;
		
		numero=parImpar.nextDouble();
		
		if (numero%2 ==0) {
			System.out.println("el " + numero + " es par");
		}else {
			System.out.println("el "+ numero +" es impar" );
		}
		
		parImpar.close();
										
	}
}
