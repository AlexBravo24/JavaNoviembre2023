package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		//vamos a aprender a introducir valores por teclado 
		//para guardar en variables
		//Apoyandonos con el uso de la clase Scanner
		
		//Primero como ejemplo coy a declarar una variable
		//donde guardar mi dato 
				int edad;
				//Para introducior ese valor recurro a una variable
				//de la clase Scanner
				Scanner entrada = new Scanner(System.in);
				
				//Ahora ya puedo teclear mi edad y guardarla en la variable
				//"edad", unicamente asignandola
				//antes de introducir el valor o asignarlo con el teclado 
				//que me solicito el programa
				System.out.println("Introduce una edad");
				edad=entrada.nextInt();
				//Si quiero a hora introducior un nombre, puedo hacerlo
				//utilizando el mismo Scanner y asignandolo a otra variable
				String nombre;
				entrada.nextLine(); //Consumir el espacio "volando" de le instruccion  anterior 
				System.out.println("Introduce tu nombreb completo");
				nombre = entrada.nextLine();
				
				//Si ya no quiero introducir mas valores por teclado 
				//cierro el scaneer para ahorrar memoria
				
				entrada.close();
				
				// Unaves guardamos la edad, pues podemos hacer uso
				// de ese valor para lo que necesitamos
				System.out.println("Hola " + nombre);
				System.out.println("El proximo año tendras"+ (edad+1)+ "años");
				
		
		//Para comentar varias lineas puedo seleccionarlas y
		//presionar Ctrol + 7 y se comentan automaticamente
		//O  utilizar las llaves de comentarios de multiples lineas 
       
		//Operador Modulo 
		
		int x = 10;
		int y = 3;
		
		int resultado = x/y;
		
		int residuo = x%y;
		
		System.out.println("El resultado es " + resultado);
		System.out.println("El residuo de la operacion es  " + residuo );
		
		
	}

}
