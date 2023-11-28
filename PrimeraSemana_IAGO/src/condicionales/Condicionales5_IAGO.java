package condicionales;

import java.util.Scanner;

public class Condicionales5_IAGO {

	public static void main(String[] args) {
		
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
		String texto;
		 // Crear un nuevo Scanner de entrada
        Scanner entrada = new Scanner(System.in);

        // Pedir que se ingrese el texto
        System.out.println("Ingresa un texto: ");
        texto = entrada.nextLine();
        entrada.close();

        boolean mayusculas = texto.matches(".*[A-Z].*");/*la funcionalidad matches debe
        delimitarse entre el punto y los asteriscos por si al menos una letra en el texto es mayuscula*/
        System.out.println("El texto contiene letras mayusculas:"+ mayusculas);

	}

}
