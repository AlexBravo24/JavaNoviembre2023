package COM;

import java.util.Scanner;

public class Problema6 {
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tipo de uva (A o B)
        System.out.print("Ingresa el tipo de uva (A/B): ");
        char tipoUva = scanner.next().charAt(0);

        // Solicitar al usuario que ingrese el tamaño de uva (1 o 2)
        System.out.print("Ingresa el tamaño de uva (1/2): ");
        int tamanoUva = scanner.nextInt();

        // Solicitar al usuario que ingrese el precio inicial por kilo
        System.out.print("Ingresa el precio inicial por kilo: ");
        double precioInicial = scanner.nextDouble();

        // Calcular el precio final según las condiciones dadas
        double precioFinal = calcularPrecioFinal(tipoUva, tamanoUva, precioInicial);

        // Mostrar el resultado
        System.out.println("El productor recibirá " + precioFinal + " euros por kilo de uva.");

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }

    // Método para calcular el precio final de la uva
    private static double calcularPrecioFinal(char tipoUva, int tamanoUva, double precioInicial) {
        if (tipoUva == 'A') {
            if (tamanoUva == 1) {
                return precioInicial + 0.20;
            } else if (tamanoUva == 2) {
                return precioInicial + 0.30;
            }
        } else if (tipoUva == 'B') {
            if (tamanoUva == 1) {
                return precioInicial - 0.30;
            } else if (tamanoUva == 2) {
                return precioInicial - 0.50;
            }
        }

        // Si el tipo o tamaño de uva no es válido, devolver el precio inicial sin cambios
        return precioInicial;
    }

}
