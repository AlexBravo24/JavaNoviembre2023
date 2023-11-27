package condicionales;

import java.util.Scanner;

public class Condicionales2_ARHB {

	public static void main(String[] args) {
		/*2.- Realiza un programa que pida un número por teclado y nos indique si es par 
			o impar*/
		int number;
		
		
		System.out.println("Escribe un numero para saber si es PAR o IMPAR:");
		Scanner entrada = new Scanner(System.in);
		number = entrada.nextInt();
		entrada.close();
		
		int i = number % 2;
		
		if(i == 0) {
			System.out.println("Es un numero PAR");
		}else {
			System.out.println("Es un numero IMPAR");
		}
		
		

	}

}
