package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		int edad;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una edad:");
		edad = entrada.nextInt();
		
		String nombre;
		entrada.nextLine(); //Consumir espacio volando
		System.out.println("Introduce tu nombre:");
		nombre = entrada.nextLine();
		
		entrada.close(); // Cerrar scanner para ahorrar memoria
		System.out.println("El proximo ano tendras " + (edad +1));
		System.out.println("Tu nombre es: " + nombre);

	}
}

