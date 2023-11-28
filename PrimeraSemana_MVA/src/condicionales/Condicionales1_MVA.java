package condicionales;

import java.util.Scanner;

public class Condicionales1_MVA {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos números por teclado e indique cuál es 
		// mayor o si son iguales.

		int num1, num2;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite el primer numero: ");
		num1 = entrada.nextInt();
		System.out.println("Digite el segundo numero: ");
		num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println("el numero mayor es: "+num1);
		}
		else if (num1 == num2) {
			System.out.println("los numeros son iguales");
		}
		else {
			System.out.println("el numero mayor es: "+num2);
		}
		
	}

}
