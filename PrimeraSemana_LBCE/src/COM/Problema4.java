package COM;

import java.util.Scanner;

public class Problema4 {
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        // Verificar si la cadena contiene letras mayúsculas
        if (contieneMayusculas(cadena)) {
            System.out.println("La cadena contiene letras mayúsculas.");
        } else {
            System.out.println("La cadena no contiene letras mayúsculas.");
        }

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }

    // Método para verificar si una cadena contiene letras mayúsculas
    private static boolean contieneMayusculas(String cadena) {
        for (char caracter : cadena.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                return true; // Si encuentra al menos una mayúscula, devuelve true
            }
        }
        return false; // Si no encuentra ninguna mayúscula, devuelve false
    }
	
}
