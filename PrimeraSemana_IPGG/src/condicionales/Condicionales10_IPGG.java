package condicionales;
import java.util.Scanner;
public class Condicionales10_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza un programa que pida un número entero entre uno y doce
		//e imprima el número de días que tiene el mes correspondiente.
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entre 1 y 12
        System.out.print("Ingrese un número entre 1 y 12 para representar el mes: ");
        int numeroMes = scanner.nextInt();

        // Validar que el número esté en el rango correcto
        if (numeroMes >= 1 && numeroMes <= 12) {
            // Llamar al método para obtener el número de días del mes
            int diasDelMes = obtenerDiasDelMes(numeroMes);

            // Imprimir el resultado
            System.out.println("El mes " + numeroMes + " tiene " + diasDelMes + " días.");
        } else {
            System.out.println("Error: El número debe estar entre 1 y 12.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para obtener el número de días del mes
    private static int obtenerDiasDelMes(int numeroMes) {
        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; // Considerando un año no bisiesto
            default:
                return -1; // En caso de un número de mes no válido
        }
	}

}
