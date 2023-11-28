package condicionales;

import java.util.Scanner;

public class Condicionales2_IAGO {

	public static void main(String[] args) {
		
		// 2. Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		 // Crear un Scanner de entrada
        Scanner entrada = new Scanner(System.in);

        // Pedir que se ingrese el numero
        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();

        // Revisar si el numero es par o impar 
        if (numero % 2 == 0) {
            System.out.println(numero + " es un numero par.");
        } else {
            System.out.println(numero + " es un numero impar.");
        }

	}

}
