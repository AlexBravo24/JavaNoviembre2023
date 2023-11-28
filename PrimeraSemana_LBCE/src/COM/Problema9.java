package COM;

import java.util.Scanner;

public class Problema9 {
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el día de la semana
        System.out.print("Ingresa el día de la semana (1 al 7): ");
        int diaSemana = scanner.nextInt();

        // Verificar si el número del día de la semana es válido
        if (diaSemana >= 1 && diaSemana <= 7) {
            // Mostrar el día correspondiente
            String nombreDia = obtenerNombreDia(diaSemana);
            System.out.println("El día correspondiente al número " + diaSemana + " es: " + nombreDia);
        } else {
            // Mostrar mensaje de error si el número del día de la semana es incorrecto
            System.out.println("ERROR: Número incorrecto. Debe ser un entero entre 1 y 7.");
        }

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }

    // Método para obtener el nombre del día de la semana según el número
    private static String obtenerNombreDia(int diaSemana) {
        switch (diaSemana) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return ""; // En caso de número incorrecto (no debería llegar aquí)
        }
    }

}
