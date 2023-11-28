package condicionales;

import java.util.Scanner;

public class Condicionales3_JTR {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida al usuario dos números y muestre el resultado 
			de su división. Si el segundo número es 0, debe mostrar un mensaje de error
		 * 
		 */
		
		int num1, num2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");
		num1=entrada.nextInt();
		System.out.println("Introduce el segundo numero:");
		num2=entrada.nextInt();
		entrada.close();
		if(num2==0) {
			System.out.println("Error, no se puede dividir entre 0!");
		}
		else{
			System.out.println("Resultado: "+(num1/num2));
		}
		
	}

}
