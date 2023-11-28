package condicionales;

import java.util.Scanner;

public class Condicionales5_HRC4 {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a
		// los siguientes parámetros: edad, nota y sexo.

		int nota;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la nota:");
		nota = entrada.nextInt();

		int edad;
		entrada.nextLine(); // Consumir espacio volando
		System.out.println("Introduce la edad:");
		edad = entrada.nextInt();

		String sexo;
		entrada.nextLine(); // Consumir espacio volando
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Introduce el sexo (M/F):");
		sexo = entrada1.nextLine();
		entrada.close(); // Cerrar scanner para ahorrar memoria
		entrada1.close(); // Cerrar scanner para ahorrar memoria

		if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
			System.out.println("POSIBLE");
		} else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
			System.out.println("ACEPTADA");
		} else {
			System.out.println("NO ACEPTADA");
		}
	}

}
