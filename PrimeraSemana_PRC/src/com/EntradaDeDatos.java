package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// vamos a aprender a introduccir datos por teclado
		//para guardarlos en variables
		//apoyandonos de uso de la clase scanner
		
		//primero como ejemplovoy a declarar una variable donde guardar mi dato
		/*
		int edad;
		
		//para introducir ese valor recurro a una variable 
		// de la clase scanner
		Scanner entrada = new Scanner (System.in);
		
		//ahora ya puedo teclear mi edad  y guardarla en la variable "edad",unicamente asignandola
		//antes de introducir o asignar el valor con el tecladopuedo mandar una impresion
		// a la consola para saber lo queme solicta 
		System.out.println("introduce una edad");
		edad=entrada.nextInt();
		// una vez guardamos la edad, podemos hacer uso de ese valor para lo que necesitemos
		
		// si quiero introducir un nombre puedo hacer lo usando el mismo scanner
		String nombre;
		entrada.nextLine();
		
		System.out.println("introduce tu nombre");
		nombre = entrada.nextLine();
		
		//si ya no quiero introduccir mas valores por teclado
		//cierro el scanner para ahorrar memoria
		entrada.close();
		
		
		System.out.println("hola "+ nombre);
		System.out.println("el proximo año tendras "+ (edad+1)+ " años");
		*/
		
		//para comentar varias lineas, puedo seleccionar las y precionar Ctrl + 7 y se comentan automaticamente
		// o utilizar las llaves de comentarios de multiples lineas ( /*  ,  */ )
		
		int x=10;
		int y=3;
	    int resultado = x/y;
	    
	    int residuo = x%y;
	    
	    System.out.println("el resultado es "+ resultado);
	    System.out.println("el residuo de la operacion es "+ residuo);
		
		
	}

}
