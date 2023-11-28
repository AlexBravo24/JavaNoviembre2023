package condicionales;

import java.util.Scanner;

public class Condicionales2_VRDV {

	public static void main(String[] args) {
		
		
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par 
		//o impar.
		
		int parimpar;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce un valor para averiguar si es par o impar");
		
		parimpar = entrada.nextInt();
		
			entrada.close();
		
		if (parimpar % 2 == 0) { // averiguo si hay residuo despues de dividirlo entre 2
			
			System.out.println("El numero es par");
			
		}else {
			
			System.out.println("El numero es impar");
			
		}


	}

}
