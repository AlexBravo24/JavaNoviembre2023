package condicionales;

import java.util.Scanner;

public class Condicionales1_ARHB {

	public static void main(String[] args) {
		/*1.- Realiza un programa que reciba dos números por teclado e indique cuál es 
		mayor o si son iguales*/
		
		int number1;
		int number2;
		
		System.out.println("Escribe dos numeros para compararlos:");
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Ingresa el primer numero:");
		number1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Ingresa el segundo numero:");
		number2 = entrada.nextInt();
		entrada.close();
		
		if(number1 > number2) {
			System.out.println("El numero mayor es:"+ number1);
		}else if(number2 > number1) {
			System.out.println("El numero mayor es:"+ number2);
		}else {
			System.out.println("Los dos numeros son iguales");
		}
		
	}

}
