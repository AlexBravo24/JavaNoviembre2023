package condicionales;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Condicionales4_AURC {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.
String cadena;
System.out.println("Ingresa el texto a verificar :");
Scanner scanner = new Scanner(System.in);
cadena = scanner.nextLine();
scanner.close();
	if (cadena == cadena.toUpperCase()) {
		System.out.println("El texto :" + " " + cadena + " " + "si contiene letras mayusculas");
	}else{
		System.out.println("El texto :" + " " + cadena + " " + "no contiene letras mayusculas");;
	}
	}
}
