package arrays;

import java.util.Scanner;

public class Arrays1_HRC {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		// Muestra por consola el índice y el valor al que corresponde.
		
		Scanner entrada = new Scanner(System.in);
		int tamanoArray = 10; // Declaramos tamano del array
		
		int [] arrayUsuario = new int[tamanoArray]; // seteamos el tamano del array
		
		//Proceso para llenar nuestro array
		
		for (int i = 0; i < arrayUsuario.length; i++) {
			System.out.println("Ingrese el valor en la posicion " + i + ":");
			
			arrayUsuario[i] = entrada.nextInt(); //Pedimos ingreso de valores al usuario
		}
		
		entrada.close(); // Cerrar scanner para ahorrar memoria
		
		for (int i = 0; i < arrayUsuario.length; i++) {
			System.out.println("El indice es: " + i + " y el valor es: " + arrayUsuario[i]);
			
		}
		

	}

}
