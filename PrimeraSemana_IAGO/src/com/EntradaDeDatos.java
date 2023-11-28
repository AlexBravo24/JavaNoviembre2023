package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		/*Vamos a aprender a introducir valores por teclado
		 * apoyandonos con el uso de la clase Scanner
		 */
		/*Primero como ejemplo voy a declarar una variable donde guardar
		 * mi dato
		 */
		int edad;
		
		//Para introducir ese valro recurro a una variable 
		// de la clase Scanner
		
		Scanner entrada = new Scanner (System.in);
		
		//Ahora ya puedo teclear mi edad y guardarla en la variable "edad" asignandola
		System.out.println("Introduce una edad");
		edad=entrada.nextInt(); 
		//Si quiero ahora introducir un nombre, puedo hcerlo utilizando
		// el mismo Scanner y asignandolo a otra veriable
		String nombre;
		entrada.nextLine();//Consumir el espacio "volando" de la instrucción anterior 
		System.out.println("Introduce tu nombre");
		nombre= entrada.nextLine();
		
		//Si ya no requiere introducir mas valores por teclado
		//cierro el scanner para ahorrar memoria
		entrada.close();
		
		//Una vez gaurdamos la edad, podemos hacer uso
		// de ese valor para lo que necesitemos
		System.out.println("Hola " + nombre);
		System.out.println("El proximo año tendrás " +(edad+1)+ " años");
		
		//Operador modulo
		
		int x=10;
		int y=2;
		
		int resultado = x/y;
		
		int residuo= x % y; 
		
		System.out.println("El resultado es " + resultado);
		System.out.println("El resultado es " + residuo);

	}

}
