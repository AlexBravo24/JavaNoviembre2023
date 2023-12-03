package com;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		
//		// los arrays o arregles o vectores
////		son una estructura que nos permite
////		almacenar un tipo de datos en comun
////		se puede decir que es una estructura similar
////		a una tabla pero de una sola fila
////		[dato [dato [dato 
//		
//		//ejemplo de declarar un array de numeros enteros
//		
//		int [ ] numero;
//		
//		//ejemplo de un array con su tamaño declarado
//		// un array en el que podemos almacenar 5 valores numericos
//		
//		int [] numeros2 = new int [5];
//		
//		//como guardar los valores en cada posicion
//			numeros2 [0] = 1;
//			numeros2 [1] = 2;
//			numeros2 [2] = 3;
//			numeros2 [3] = 4;
//			numeros2 [4] = 5;
//			
//		// si quiero imprimir un determinado valor en consola
//			// tengo que indicar que posicione quiero imprimir
//			
//			System.out.println(numeros2 [3]);
//			
//			
//			//ejemplo  vamos a crear en el que se solicite
//			//declarar el tamaño de un array al ysarlo por teclado
//			
//			Scanner entrada = new Scanner(System.in);
//			
//			int tamañoArray;
//			System.out.println("introduce el tamaño del array de enteros");
//			
//			tamañoArray = entrada.nextInt();
//			
//			int [  ] arrayUsuario = new int [tamañoArray];
//			
//			//proceso de llenar un array de enteros
//			
//			for (int i = 0; i < arrayUsuario.length; i++) {
//				System.out.println("ingresa el valor de la posicion " + i);
//			
//				
//				//procedemos a llenar con valores indicados por teclado
//				//cada posicion
//				
//				arrayUsuario [i] = entrada.nextInt();
//			
//			}
//			
//			
//			System.out.println(arrayUsuario[3]);
//			
//			
		// otra forma de delcarar arrays es la inicializacion ya con datos
		
		int [] numeros3 = {1,2,3,4,5,7,8};
		
		
		// imprimir todos los valores de mi arreglo en consola
		
		for (int i = 0; i < numeros3.length; i++) {
			
			System.out.println(numeros3[i]);
			
		}
		
		
		// podemos ocupar los numeros almacenados
		//para operaciones entre ellos si lo necesitamos
		
		System.out.println("resultado = "+ (numeros3[6 ] + numeros3 [5]));
		
		//ciclo for each
		
		
		for (int i : numeros3) {// para cada elemento entero del array
			
			System.out.println(i);//para imprimir cada valor;
			
		}
		
		// puedo tenener un array en el que pueda almacenar
		// tanto datos numericos, cadenas de texto, decimales, char, etc?
		
		
		//se puede gracias a a la clase Object o creando un objeto propio
		// se puede pero con envoltorios
		
		Object []variosDatos = new Object [5];
		
		variosDatos[0] = 300; //integer
		variosDatos[1] = "300"; // string
		variosDatos[2] = 'a';// character
		variosDatos[3] = 300.56; // double
		variosDatos[4] = 300; // Boolean
		
		// puedo tener un datos numericos en un string y convertirlos
		
		String num = "399";
		
		int z = Integer.parseInt(num); // parse int para convertir, uso metodos staticos de los envotorios
		
		
		
		
	}

}
