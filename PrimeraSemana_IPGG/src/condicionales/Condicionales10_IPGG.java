package condicionales;
import java.util.Scanner;
public class Condicionales10_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza un programa que pida un n�mero entero entre uno y doce
		//e imprima el n�mero de d�as que tiene el mes correspondiente.
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un n�mero entre 1 y 12
        System.out.print("Ingrese un n�mero entre 1 y 12 para representar el mes: ");
        int numeroMes = scanner.nextInt();

        // Validar que el n�mero est� en el rango correcto
        if (numeroMes >= 1 && numeroMes <= 12) {
            // Llamar al m�todo para obtener el n�mero de d�as del mes
            int diasDelMes = obtenerDiasDelMes(numeroMes);

            // Imprimir el resultado
            System.out.println("El mes " + numeroMes + " tiene " + diasDelMes + " d�as.");
        } else {
            System.out.println("Error: El n�mero debe estar entre 1 y 12.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // M�todo para obtener el n�mero de d�as del mes
    private static int obtenerDiasDelMes(int numeroMes) {
        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; // Considerando un a�o no bisiesto
            default:
                return -1; // En caso de un n�mero de mes no v�lido
        }
	}

}
