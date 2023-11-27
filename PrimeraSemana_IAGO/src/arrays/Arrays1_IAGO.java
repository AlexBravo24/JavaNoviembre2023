package arrays;

import java.util.Scanner;

public class Arrays1_IAGO {

	public static void main(String[] args) {
		
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		//Muestra por consola el índice y el valor al que corresponde.
		
		// Crear el array de 10 posiciones
        int[] numbers = new int[10];

        // Crear el Scanner 
        Scanner scanner = new Scanner(System.in);

        // Poner los valores del Scanner en el array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Ingresa el numero para posicion " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // MOstrar los valores del array
        System.out.println("Index\tValue");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "\t" + numbers[i]);
        }

        scanner.close();

	}

}
