package arrays;

import java.util.Scanner;

public class Arrays1_AGZ {

	public static void main(String[] args) {
		/*Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		 * Muestra por consola el índice y el valor al que corresponde.
		 */
		System.out.println("    Arreglo de 10 numeros");
		int[] numeros=new int[10];
		Scanner entrada=new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("introduce el valor de la posicion "+i);
			numeros[i]=entrada.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("["+i+"]"+" = "+numeros[i]);	
		}

	}

}
