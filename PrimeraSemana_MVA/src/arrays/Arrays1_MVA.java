package arrays;

import java.util.Scanner;

public class Arrays1_MVA {
	public static void main(String[] args) {
//		Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.

		
		int [] array = new int [10];
		
		Scanner entrada = new Scanner (System.in);
		
		for (int i=0; i<array.length ; i++) {
			System.out.println("digite un numero:");
			array[i] = entrada.nextInt();
		}
		
		System.out.println("ARREGLO:");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("indice: " + i + ".- " +array[i] );
		}
//		for (int i : array) {
//			System.out.println(i);
//		}
	}

}
