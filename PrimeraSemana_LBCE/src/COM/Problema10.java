package COM;

import java.util.Scanner;

public class Problema10 {
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero entre uno y doce
        System.out.print("Ingresa un número entero entre 1 y 12: ");
        int numeroMes = scanner.nextInt();

        // Verificar si el número del mes es válido
        if (numeroMes >= 1 && numeroMes <= 12) {
            // Mostrar el número de días del mes correspondiente
            int diasMes = obtenerDiasMes(numeroMes);
            System.out.println("El mes " + numeroMes + " tiene " + diasMes + " días.");
        } else {
            // Mostrar mensaje de error si el número del mes es incorrecto
            System.out.println("ERROR: Número incorrecto. Debe ser un entero entre 1 y 12.");
        }

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }

    // Método para obtener el número de días del mes según el número de mes
    private static int obtenerDiasMes(int numeroMes) {
        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; // En este caso, asumimos que febrero siempre tiene 28 días (sin tener en cuenta años bisiestos)
            default:
                return 0; // En caso de número incorrecto (no debería llegar aquí)
        }
    }

}
