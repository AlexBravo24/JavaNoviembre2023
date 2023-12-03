package com;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		
		
		//ejemplo de declarar un array de numeros enteros
		int [] numero;
		
		// Ejemplo de un array con su tamaño declarado
		// Un array en el que podemos almacenar 5 valores numericos
		
		int [] num2 = new int [5];
		//Guardar valores en cada posicion de nuestro array
		num2 [0] = 1;
		num2 [1] = 2;
		num2 [2] = 3;
		num2 [3] = 4;
		num2 [4] = 5;
		
		//Si quiero imprimir un determinado valor en consola 
		//necesito indicar que posicion quiero imprimir
		System.out.println(num2[3]);
		
		// Ejemplo en el que se le solicite al usuario 
		//declarar el tamaño de un array por teclado
		
//		Scanner entrada = new Scanner (System.in);
//		int tamañoArray; 
//		System.out.println("Digite el tamaño del arreglo: ");
//		
//		tamañoArray = entrada.nextInt();
//		
//		int [] arrayUsuario = new int [tamañoArray];
//		
//		//Proceso para llenar un arreglo con ciclo for
//		for (int i = 0; i < arrayUsuario.length; i++) {
//			System.out.println("ingresa el valor de la posicion "+ i);
//			arrayUsuario [i]= entrada.nextInt(); 
//		}
//		
//		//una vez se lleno se va imprimir la posicion 3
//		System.out.println(arrayUsuario[3]);
//		
		
		// otra forma de declarar los arrays es inicializando 
		//  ya con datos
		int [] numeros3 = {1,2,3,4,5};
	
		// imprimir un arreglo
		for (int i = 0; i < numeros3.length; i++) {
			System.out.print(numeros3[i] +" ");
		
		}
		System.out.println();
		// podemos ocupar los numeros una vez almacenados para 
		//realizar operaciones entre ellos si asi lo necesitamos
		
		System.out.println("resultado: " + (numeros3[1]+numeros3[2]));
		
		
		//foreach
		for (int i : numeros3) { //para cada elemento entero del array
			System.out.print(numeros3[i-1]+" "); //mandamos a imprimir cada valor
		}
		
		//puedo tener un array de varios tipos de datos con la clase object
		
		Object [] variosDatos = new Object [5];
		
		variosDatos [0] = 100;
		variosDatos [1] = "HOLAAA";
		variosDatos [2] = 'a';
		variosDatos [3] = 12.3;
		variosDatos [4] = true; 
		
		// los datos estan en clase envoltorio
		
	}
}
