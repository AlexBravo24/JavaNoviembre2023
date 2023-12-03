package COM;

import java.util.Scanner;

public class Problema7 {
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de alumnos
        System.out.print("Ingresa el número de alumnos: ");
        int numeroAlumnos = scanner.nextInt();

        // Calcular el costo por alumno y el pago a la compañía de autobuses
        double costoPorAlumno = calcularCostoPorAlumno(numeroAlumnos);
        double pagoCompania = calcularPagoCompania(numeroAlumnos);

        // Mostrar los resultados
        System.out.println("Cada alumno debe pagar " + costoPorAlumno + " euros por el viaje.");
        System.out.println("El pago a la compañía de autobuses es de " + pagoCompania + " euros.");

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }

    // Método para calcular el costo por alumno según el número de alumnos
    private static double calcularCostoPorAlumno(int numeroAlumnos) {
        if (numeroAlumnos >= 100) {
            return 65.0;
        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
            return 70.0;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
            return 95.0;
        } else {
            return 4000.0 / numeroAlumnos;
        }
    }

    // Método para calcular el pago a la compañía de autobuses según el número de alumnos
    private static double calcularPagoCompania(int numeroAlumnos) {
        return numeroAlumnos * calcularCostoPorAlumno(numeroAlumnos);
    }

}
