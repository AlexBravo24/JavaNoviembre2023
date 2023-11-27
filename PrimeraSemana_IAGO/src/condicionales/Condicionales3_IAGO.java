package condicionales;

import java.util.Scanner;

public class Condicionales3_IAGO {

	public static void main(String[] args) {
		
		// 3. Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		int numero1;
		int numero2;
		// Crear un nuevo Scanner de entrada
        Scanner entrada = new Scanner(System.in);

        // Ingrsar el primer numero 
        System.out.print("Ingresa el primer numero: ");
        numero1 = entrada.nextInt();

        // Ingresar el segundo numero
        System.out.print("Ingresa el segundo numero: ");
        numero2 = entrada.nextInt();


        // Check if the second number is not zero before performing division
        if (numero2 != 0) {
            // Realizar la division
            int result = numero1 / numero2;
            System.out.println("Resultado de la division: " + result);
        } else {
            // Mostrar el error en pantalla
            System.out.println("Error: No se puede dividir entre 0.");
        }

	}

}
