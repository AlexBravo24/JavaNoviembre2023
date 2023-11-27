package condicionales;

import java.util.Scanner;

public class Condicionales1_IAGO {

	public static void main(String[] args) {
		// 1. Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		//Declarar las variables
		int numero1; 
		int numero2;
		// Crear un nuevo scanner de entrada
        Scanner entrada = new Scanner(System.in);

        //Pedir el ingreso del primer numero
        System.out.print("Ingresa el primer numero: ");
        numero1 = entrada.nextInt();

        // Pedir el segundo numero
        System.out.print("Ingresa el segundo numero: ");
        numero2 = entrada.nextInt();

        // Comparar los numeros
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero1 + " es menor " + numero2);
        } else {
            System.out.println("Los numeros son iguales.");
        }

       

	}

}
