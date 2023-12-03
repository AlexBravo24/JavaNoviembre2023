package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		//Los arrays, o arreglos, o vectores
		//Son una estructura que nos permite
		//almacenar un tipo de datos en común
		//Se puede decir que es una estructura similar
		//a una "tabla", pero de una sola fila
		//[dato][dato][dato][dato][dato][dato][dato]
		//Sería como una colección de datos
		
		//Ejemplo de declarar un array de numeros enteros
		int [] numero;
		
		//Ejemplo de un array con su tamaño declarado
		//Un array en el que podemos almacenar 5 valores numericos
		int [] numeros2 = new int[5];
		
		//Como guardar valores en cada posicion de nuestro array
		numeros2[0]=1;
		numeros2[1]=2;
		numeros2[2]=3;
		numeros2[3]=4;
		numeros2[4]=5;
		//La desventaja de los arrays es que si quiero seguir
		//almacenando datos, estos no pueden crecer
		//en tiempo de ejecución una vez declarado su tamaño
//		numeros2[5]=6;
//		numeros2[6]=11;
		//Si quiero imprimir un determinado valor en consola
		//necesito indicar que posicion quiero imprimir
		System.out.println(numeros2[3]);
		
		//Vamos a crear un ejemplo en el que se solicite
		//declarar el tamaño de un array al usuario por teclado
//		Scanner entrada = new Scanner(System.in);
//		int tamañoArray;
//		System.out.println("Introduce el tamaño del array de enteros");
//		tamañoArray=entrada.nextInt();
//		
//		int [] arrayUsuario = new int[tamañoArray];
//		
//		//Proceso para llenar nuestro Array de Enteros
//		for (int i = 0; i < arrayUsuario.length; i++) {
//			System.out.println("Ingresa el valor de la posicion " + i);
//			//Procedemos a llenar con valores ingresados por teclado
//			//cada posicion
//			arrayUsuario[i]=entrada.nextInt();
//		}
//		//Una vez que esta lleno el array, mando a imprimir un valor
//		System.out.println(arrayUsuario[3]);
		
		//Otra forma de declarar los arrays es inicializado
		//ya con datos
		int [] numeros3 = {1,2,3,4,5,7,8};
		
		//Imprimir todos los valores de mi arreglo en consola
		for (int i = 0; i < numeros3.length; i++) {
			System.out.print(numeros3[i]);
		}
		System.out.println();
		//Podemos ocupar los numeros una vez almacenados para
		//realizar operaciones entre ellos si asi lo necesitamos
		System.out.println("Resultado = " + (numeros3[6]+numeros3[5]));
		
		//Imprimiendo en consola cada numero con un ciclo forEach
		for (int i:numeros3) { //Para cada elemento entero del array
			System.out.println(i); //mandamos a imprimir cada valor
		}
		
		
		//¿Puedo tener un array en el que pueda almacenar
		//tanto datos numericos, cadenas de texto, decimales, char, etc?
		//Se puede declarar un array que contenga más de un tipo de dato
		//gracias a la clase Object o creando un objeto propio
		
		Object [] variosDatos = new Object [5];
		
		variosDatos[0]=300; //Integer
		variosDatos[1]="Alex"; //String
		variosDatos[2]='A'; //Character
		variosDatos[3]=12000.56; //Double
		variosDatos[4]=true; //Boolean
		
		System.out.println(variosDatos[1]);
		
		
		//Puedo tener datos numericos en un String y convertirlos
		String num = "300";
		
		int z = Integer.parseInt(num);
		
		System.out.println(z);
		
		
		
	}

}
