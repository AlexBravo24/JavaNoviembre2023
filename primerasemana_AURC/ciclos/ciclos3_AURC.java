package ciclos;

import java.util.Scanner;

public class ciclos3_AURC {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        cadena = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        if (cadena.equals(cadenaInvertida)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }
}
