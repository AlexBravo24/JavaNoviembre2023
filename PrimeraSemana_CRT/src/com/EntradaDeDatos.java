package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Vamos a aprender a introducir valors por teclado 
		//para guardarlos en variables
		//Apoyandonos con el uso de la clase Scanner
		
		//Primero como ejemplo voy a declarar una variable
		//donde guardar mi dato
//		int edad;
//		
//		//Para introducir ese valor recurro a una variable
//		//de la clase Scanner
//		Scanner entrada = new Scanner(System.in);
//		
//		//Ahora ya puedo teclear mi edad y guardarla en la variable
//		//"edad", unicamente asignandola
//		//Antes de introducir el valor o asignarlo con el teclado
//		//PUedo mandar una impresi�n en consola para saber
//		//que me solicita el programa
//		System.out.println("Introduce una edad");
//		edad=entrada.nextInt();
//		//Si quiero ahora introducir un nombre, puedo hacerlo
//		//utilizando el mismo Scanner y asignarlo a otra variable
//		String nombre;
//		entrada.nextLine(); //Consumir el espacio "volando" de la instrucci�n anterior
//		
//		System.out.println("Introduce tu nombre");
//		nombre = entrada.nextLine();
//		
//		//Si ya no requiero introducir m�s valores por teclado
//		//cierro el scanner para ahorrar memoria
//		entrada.close();
//		
//		
//		//Una vez guardamos la edad, pues podemos hacer uso
//		//de ese valor para lo que se necesitemos
//		System.out.println("Hola " + nombre);
//		System.out.println("El proximo a�o tendr�s " + (edad+1) + " a�os");
//		
//		//Para comentar varias lineas, puedo seleccionarlas y
//		//presionar Ctrl + 7 y se comentan automaticamente
//		//o utilizar las llaves de comentarios de multiples l�neas (/* - */)
		
		//Operador Modulo
		
		int x = 10;
		int y = 3;
		
		int resultado = x/y;
		
		int residuo = x%y;
		
		System.out.println("El resultado es " + resultado);
		System.out.println("El residuo de la operaci�n es " + residuo);
	}

}
