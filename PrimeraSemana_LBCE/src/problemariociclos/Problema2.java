package problemariociclos;

import java.util.Scanner;

public class Problema2 {
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número para la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Solicitar al usuario que ingrese la iteración deseada
        System.out.print("Ingresa la iteración deseada: ");
        int iteracionDeseada = scanner.nextInt();

        // Imprimir la tabla de multiplicar hasta la iteración deseada
        System.out.println("Tabla de multiplicar del " + numero + " hasta la iteración " + iteracionDeseada + ":");

        for (int i = 1; i <= iteracionDeseada; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }

}
