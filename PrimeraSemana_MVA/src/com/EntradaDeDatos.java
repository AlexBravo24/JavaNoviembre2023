package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		//introducir datos para guardarlos
		//en variables
		
		int edad;
		//para introducir este valor recurro a una variable 
		// de la clase Scanner
		Scanner entrada = new Scanner (System.in);
		
		//Ahora ya puedo teclear mi edad y guardarla en la
		//variable "edad" unicamente asignandola
		/*
		 * antes de introducir el valor se puede comentar la instruccion
		 * para saber lo que esta solicitando el programa
		 */
		System.out.println("Introduce tu edad: ");
		edad = entrada.nextInt();
		
		
		//si queremos introducir un nombre, puedo hacerlo utilizando
		// el mismo scanner y asignandolo a otra variable
		
		String nombre;
		entrada.nextLine();
		System.out.println("Introduce tu nombre :");
		nombre = entrada.nextLine();
		
		// si ya no requiero introducir mas valores por teclado
		// Cierro el scanner para ahorrar memoria
		entrada.close();
		
		//una vez guardados los datos en las variables, 
		//podemos hacer uso de esta:
		System.out.println("Hola "+nombre);
		System.out.println("El proximo año tendras: " + (edad+1) + " años");
		
		//para comentar varia lineas, puedo seleccionarlas y 
		//presionar Ctrl + 7 y se comentan automaticamente
		//o utilizar las llaves de comentarios de multiples lineas ( /* */)
		
		
		//OPERADOR MODULO
		int x = 10;
		int y = 2;
		
		int resultado = x/y;
		int residuo = x%y;
		
		System.out.println("El resultado es " + resultado);
		System.out.println("el residuo es: " +residuo);

	}

}
