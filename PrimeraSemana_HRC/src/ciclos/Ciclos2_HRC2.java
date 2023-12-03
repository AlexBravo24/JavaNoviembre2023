package ciclos;

import java.util.Scanner;

public class Ciclos2_HRC2 {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero
		// introducido desde teclado, hasta la iteración deseada por el usuario.

		int num1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero a multiplicar:");
		num1 = entrada.nextInt();
		
		int num2;
		entrada.nextLine(); //Consumir espacio volando
		System.out.println("Introduce hasta que numero quieres multiplicar:");
		num2 = entrada.nextInt();
		entrada.close(); // Cerrar scanner para ahorrar memoria

		for (int i = 0; i <= num2; i++) {
			System.out.println(num1 + " x " + i + " = " + (num1 * i));

		}

	}

}
