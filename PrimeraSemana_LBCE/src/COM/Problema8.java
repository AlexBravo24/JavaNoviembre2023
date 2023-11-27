package COM;

import java.util.Scanner;

public class Problema8 {
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el resultado del lanzamiento del dado
        System.out.print("Ingresa el resultado del lanzamiento del dado (entero entre 1 y 6): ");
        int resultadoDado = scanner.nextInt();

        // Verificar si el número del dado es válido
        if (resultadoDado >= 1 && resultadoDado <= 6) {
            // Mostrar el número en letras de la cara opuesta
            String numeroLetras = obtenerNumeroLetrasCaraOpuesta(resultadoDado);
            System.out.println("La cara opuesta al resultado " + resultadoDado + " es: " + numeroLetras);
        } else {
            // Mostrar mensaje de error si el número del dado es incorrecto
            System.out.println("ERROR: número incorrecto. Debe ser un entero entre 1 y 6.");
        }

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }

    // Método para obtener el número en letras de la cara opuesta al resultado del dado
    private static String obtenerNumeroLetrasCaraOpuesta(int resultadoDado) {
        switch (resultadoDado) {
            case 1:
                return "Seis";
            case 2:
                return "Cinco";
            case 3:
                return "Cuatro";
            case 4:
                return "Tres";
            case 5:
                return "Dos";
            case 6:
                return "Uno";
            default:
                return ""; // En caso de número incorrecto (no debería llegar aquí)
        }
    }

	
}
