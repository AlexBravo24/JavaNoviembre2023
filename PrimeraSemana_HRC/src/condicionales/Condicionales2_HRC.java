package condicionales;

import java.util.Scanner;

public class Condicionales2_HRC {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par
		// o impar.
		
		int num1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		num1 = entrada.nextInt();
		
		entrada.close(); // Cerrar scanner para ahorrar memoria
		
		if (num1 % 2 == 0 ) {
			System.out.println("El numero es PAR");
		}
		else {
			System.out.println("El numero es IMPAR");

		}
		

	}

}
