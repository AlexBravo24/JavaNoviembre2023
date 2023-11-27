package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Introducir valores por teclado y guadarlos en variables 
		//con el uso de Scanner
		
		int edad;
		int x = 10;
		int y = 2;
		int resultado = x/y;
		int residuo = x%y;
		
		// variable de la clase Scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introuce tu edad:");
		
		//guardar en la variable edad
		 edad = entrada.nextInt();
		 // se puede usar la misma funcion scanner para introducir otro dato como el nombre
		 String nombre;
		 entrada.nextLine();
		 System.out.println("Introduce tu nombre:");
		 
		 nombre = entrada.nextLine();
		 entrada.close(); // Para ya no introducir nada por scanner, finalizar la entrada
		 
		 System.out.println("tu nombre completo es:"+ nombre);
		 System.out.println("Edad:"+ edad + " años");
		 System.out.println("El proximo año tendras "+ (edad+1) + " años");
		 System.out.println("El resultado es: "+ resultado);
		 System.out.println("El modulo es "+ residuo);
		 
	}

}
