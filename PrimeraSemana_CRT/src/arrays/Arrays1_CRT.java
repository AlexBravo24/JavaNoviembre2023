package arrays;

import java.util.Scanner;

public class Arrays1_CRT {

	public static void main(String[] args) {
		
		/*
		 * Crea un array de 10 posiciones de n�meros con valores 
         * pedidos por teclado. Muestra por consola el �ndice y 
         * el valor al que corresponde.
		 */
		
		int [] arrayUsuario = new int[10];
 		
		Scanner entrada = new Scanner(System.in);
 		
		for (int i = 0; i < arrayUsuario.length; i++) {
			System.out.println("Ingresa el valor de la posici�n " + i);
			arrayUsuario[i]=entrada.nextInt();
		}
		
		//Imprimir todos los valores de mi arreglo en consola
		for (int i = 0; i < arrayUsuario.length; i++) {
			System.out.println("N�mero "+arrayUsuario[i]+" guardado en la posici�n ["+i+"]");
		}

	}

}
