package ciclos;

import java.util.Scanner;

public class Ciclo2_IAGO {

	public static void main(String[] args) {
		
		// Programa un algoritmo que realice la tabla de multiplicar de un numero
		// introducido desde teclado, hasta la iteración deseada por el usuario. 
		// Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		Scanner scanner = new Scanner(System.in);

        // Obtener el nuemro del usuario
        System.out.print("Ingresa un numero: ");
        int number = scanner.nextInt();

        // Obtener el numero hasta el que se quiere mutiplicar
        System.out.print("Ingresa el numero hasta el cual se multiplicara: ");
        int iterationLimit = scanner.nextInt();

        System.out.println("La tabla de multiplicar de " + number + " hasta " + iterationLimit + " es " + ":");
        for (int i = 1; i <= iterationLimit; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

		
		

	}

}
