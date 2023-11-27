package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		/*Aprendiendo a introducir valores por teclado
		*para guardarlos en variables
		*apoyandonos con el uso de la clase scanner
		*/
		
		//Declarando la variable donde se guardará mi dato
//		 ctrl + 7 comenta todo lo seleccionado, para descomentar otra vez ctrl + 7
//		int edad;
//		
//		//Recurriendo a una variable de la clase Scanner
//		 
//		Scanner entrada = new Scanner(System.in);
//		/*tecleando edad para guardar,
//		 * imprimiendo la petición
//		 */
//		System.out.println("Introduce tu"
//				+ " edad:");
//		edad = entrada.nextInt();
//		/*sin necesidad de introducir Scanner, se puede introducir otro string
//		 * asignandolo a otra variable
//		 */
//		String nombre;
//		entrada.nextLine(); //consume el espacio "volando" o entre los saltos de línea
//		System.out.println("Introduce tu nombre completo: ");
//		nombre = entrada.nextLine();
//		
//		/* una vez guardada la edad, 
//		 * ya se puede usar para el proyecto
//		 */
//		System.out.println("Hola "+ nombre);
//		System.out.println("El próximo año tendrás: " + (edad+1) + " años");
		
		/*OPERADOR MODULO
		 * 
		 */
		int x = 10;
		int y = 3;
		
		int resultado = x/y;
		
		int residuo = x%y;
		
		System.out.println("El resultado es " + resultado);
		System.out.println("El residuo de la operación es " + residuo);

	}

}
