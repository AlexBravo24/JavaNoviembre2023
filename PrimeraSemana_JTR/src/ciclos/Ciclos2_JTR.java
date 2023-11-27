package ciclos;

import java.util.Scanner;

public class Ciclos2_JTR {
	
	/*
	 *  Programa un algoritmo que realice la tabla de multiplicar de un numero 
introducido desde teclado, hasta la iteración deseada por el usuario. 
Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
	 */
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tabla de multiplicar\nIntroduce el numero de la tabla:");
		num1=entrada.nextInt();
		System.out.println("Cuantas iteraciones?");
		num2=entrada.nextInt();
		entrada.close();
		for (int i = 1; i <= num2; i++) {
			System.out.println(num1+"x"+i+"="+(num1*i));
		}
	}
}
