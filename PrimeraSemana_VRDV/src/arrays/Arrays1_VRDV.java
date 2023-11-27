package arrays;

import java.util.Scanner;

public class Arrays1_VRDV {

	public static void main(String[] args) {
		
		// Crea un array de 10 posiciones de números 
		//con valores pedidos por teclado. Muestra por 
		//consola el índice y el valor al que corresponde.
		
		
		Scanner sc = new Scanner(System.in);
		
		int array [] = new int [10];
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("introduce un valor");
			
			array [i] = sc.nextInt() ;
			
		}
		
		sc.close();
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("el indice " + i + " corresponde al valor " + array[i]);
		}
	}

}
