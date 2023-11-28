package condicionales;

import java.util.Scanner;

public class Condicionales1_HRC {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es
		// mayor o si son iguales.
		
		
		int num1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		num1 = entrada.nextInt();
		
		int num2;
		entrada.nextLine(); //Consumir espacio volando
		System.out.println("Introduce otro numero:");
		num2 = entrada.nextInt();
		
		entrada.close(); // Cerrar scanner para ahorrar memoria
		
		if (num1 > num2) {
			System.out.println(num1 + " el es mayor");
		}
		else if (num2 > num1) {
			System.out.println(num2 + " el es mayor");
		}
		else {
			System.out.println("Los numeros son iguales");
		}
	}

}
