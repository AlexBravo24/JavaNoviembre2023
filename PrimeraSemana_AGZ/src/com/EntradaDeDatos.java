package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Aprende a introducir valores por teclado para guardarlos
		//en variables apoyandonos con el uso de la clase Scanner
		
		//primero como ejemplo voy a declarar una variable
		//donde guardar mi dato
	/*	int edad;
		
		//para introducir ese valor recurro a una variable
		//de la clase Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Ahora ya puedo teclear mi edad y guardarla en la variable 
		//"edad", unicamente asignandola
		//Antes de introducir el valor o asignarlo con el teclado
		//puedo mandar impresion a consola para saber que show
		System.out.println("Introduce tu edad ");
		
		edad=entrada.nextInt();
		//si quiero ahora introducir un nombre, puedo hacerlo
		//utilizando el mismo Scanner y asignandolo a otra variable
		String nombre;
		entrada.nextLine(); //consumir el espacio "volando de la instruccion" anterior (el espacio)
		
		System.out.println("introduce tu nombre ");
		nombre= entrada.nextLine(); //el . next solo reconoce una palabra
		
		//si ya no requiero introducir mas valores por teclado
		//cierro el scanner para ahorrar memoria
		entrada.close();
		
		//una vez guardada la edad podemos hacer uso de ella en la variable
		System.out.println("Hola "+ nombre);
		System.out.println("El proximo año tendras " + (edad+1)+ " años");
*/
		// para comentar varias lineas puedo seleccionarlas y presionar 
		//ctrl + 7 y se comentan automaticamente, para descomentar en igual
		//o utilizar las llaves (/*  */)
		
		
		//OPERADOR MODULO ---  %
		
		int x = 10;
		int y =3;
		
		int resultado = x/y;
		
		int residuo = x%y;
		
		System.out.println("el resultado es " + resultado);
		System.out.println("El residuo de la operacion es " + residuo);
	}

}
