package condicionales;

import java.util.Scanner;

public class Condicionales1_JTR {

	public static void main(String[] args) {
		//1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales.
		int num1, num2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");
		num1=entrada.nextInt();
		System.out.println("Introduce el segundo numero:");
		num2=entrada.nextInt();
		entrada.close();
		if(num1>num2) {
			System.out.println("El mayor es "+num1);
		} else if(num1<num2) {
			System.out.println("El mayor es "+num2);
		} else if(num1==num2) {
			System.out.println("Los numeros son iguales");
		}
	}

}
