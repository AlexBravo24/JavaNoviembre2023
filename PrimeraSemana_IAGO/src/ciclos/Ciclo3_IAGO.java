package ciclos;

import java.util.Scanner;

public class Ciclo3_IAGO {

	public static void main(String[] args) {
		
		// 3. Realiza un programa para determinar si un String es palíndromo.
		
		Scanner scanner = new Scanner(System.in);

        // Pedir que se ingrese el texto
        System.out.print("Ingresa el texto: ");
        String input = scanner.nextLine();

        // Revisar si es un palidromo
        if (esPalindromo(input)) {
            System.out.println("El texto es un palidromo.");
        } else {
            System.out.println("El texto no es un palindromo.");
        }

        scanner.close();
    }

    // Funcion para revisar el palidromo
    public static boolean esPalindromo(String str) {
        
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Comparar los textos
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
	}

}
