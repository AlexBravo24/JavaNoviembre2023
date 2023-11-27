package com;

import java.util.Scanner; // aqui veo la clase que importe

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		
		// vamos a aprender a intruducir valores por teclado
		// para guardarlos en variables
		//apoyandonos del uso de la clase scanner
		
		//primero voy a declarar una variable donde quiera guardar mi dato
		
//		int edad;
//		
//		//para introducir ese valor recurro a una variable de la clase scanner
//		
//		Scanner entrada = new Scanner (System.in); //system in tiene la funcion especifica de leer la conosla
//		
//		//ahora ya puedo teclear mi edad y guardarla en la variable "edad"
//		//unicamente asignandola
//		
//		//antes de introducir el valor o asignarlo, puedo mandar una impresion en consola para saber 
//		// me solicita el programa
//		
//		System.out.println("introduce una edad");
//		
//		edad = entrada.nextInt();// next int es para solo poder guardar valores de tipo entero 
//		// ya que guardamos el valor podemos utilizarlo
//		
//		
//		
//		//si quiero ahora introducir un nombre, puedo hacerlo
//		//utilizando el mismo scanner y asignarlo a otra variable
//		
//		String nombre;
//		entrada.nextLine(); // consume el espacio volando 
//		System.out.println("introduce tu nombre");
//		nombre = entrada.nextLine();
//		
//		// si ya no voy a usar el scanner lo cierro para ahorrar memoria
//		entrada.close();
//	
//		System.out.println("hola " + nombre);
//		System.out.println("El proximo año tendras " + (edad + 1 )+ " años");
		
		//ctrl 7 comenta todo el codigo, podemos seleccionar de nuevo con ctrl 7 para descomentar.
		
		//operador modulo
		
		int x = 10;
		int y = 3;
		
		int resultado = x/y;
		int residuo = x%y;
		
		System.out.println("el resultado es " + resultado);
		System.out.println("el residuo de esa operacion es " + residuo);
		
		
	}

}
