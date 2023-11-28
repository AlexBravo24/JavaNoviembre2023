package condicionales;
import java.util.Scanner;

public class Condicionales4_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4. Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        // Verificar si la cadena contiene letras mayúsculas
        if (contieneMayusculas(cadena)) {
            System.out.println("La cadena contiene letras mayúsculas.");
        } else {
            System.out.println("La cadena no contiene letras mayúsculas.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para verificar si una cadena contiene letras mayúsculas
    private static boolean contieneMayusculas(String cadena) {
        for (char caracter : cadena.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                return true;
            }
        }
        return false;
    }
}