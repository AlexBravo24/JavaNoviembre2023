package condicionales;

import java.util.Scanner;

public class Condicionales3_MVA {
	public static void main(String[] args) {
//		Crea un programa que pida al usuario dos números y muestre el resultado 
//		de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		float num1, num2, resultado;
		
		Scanner entrada =new Scanner (System.in);
		
		System.out.println("digite el primer numero: ");
		num1 = entrada.nextFloat();
		System.out.println("digite el segundo numero: ");
		num2 = entrada.nextFloat();
		
		if (num2 != 0) {
			resultado = num1/num2;
			System.out.println("el resultado es: "+resultado);
		}
		else {
			System.out.println("error: El segundo numero es 0");
		}
		
	}
}
