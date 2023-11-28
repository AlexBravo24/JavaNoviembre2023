package COM;

import java.util.Scanner;

public class Problema3 {
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Verificar si el segundo número es 0 antes de realizar la división
        if (numero2 != 0) {
            // Calcular y mostrar el resultado de la división
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            // Mostrar mensaje de error si el segundo número es 0
            System.out.println("Error: No se puede dividir por cero.");
        }

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }

}
