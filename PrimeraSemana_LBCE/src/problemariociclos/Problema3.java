package problemariociclos;

import java.util.Scanner;

public class Problema3 {
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        // Verificar si la cadena es un palíndromo
        if (esPalindromo(cadena)) {
            System.out.println("La cadena \"" + cadena + "\" es un palíndromo.");
        } else {
            System.out.println("La cadena \"" + cadena + "\" no es un palíndromo.");
        }

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }

    // Método para verificar si una cadena es un palíndromo
    private static boolean esPalindromo(String cadena) {
        // Eliminar espacios y convertir a minúsculas para una comparación sin distinción de mayúsculas y minúsculas
        String cadenaSinEspacios = cadena.replaceAll("\\s", "").toLowerCase();

        // Comparar la cadena original con su reverso
        String cadenaReversa = new StringBuilder(cadenaSinEspacios).reverse().toString();

        return cadenaSinEspacios.equals(cadenaReversa);
    }

}
