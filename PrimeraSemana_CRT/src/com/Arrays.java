package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		
		// Los arrays, o arreglos o vectores
		//Son una estructura que nos permite
		//almacenar un tipo de datos en com�n 
		//Se puede decir que es una estructura similar
		//a una "tabla", pero de una sola fila
		//[dato][dato][dato][dato][dato][dato]
		//Ser�a como una colecci�n de datos
		
		//Un array en el que podemos almacenar 5 valores num�ricos
//		int [] numero;
//		
//		//Ejemplo de un array con su tama�o declarado
//		//Ejemplo de declarar un array de n�meros enteros
//		int [] numeros2 = new int[5];
//		
//		//Como guardar valores en cada posici�n de nuestro array
//		numeros2[0]=1;
//		numeros2[1]=2;
//		numeros2[2]=3;
//		numeros2[3]=4;
//		numeros2[4]=5;
//		//La desventaja de los arrays es que si quiero seguir
//		//almacenando datos, estos no pueden crecer
//		//en tiempo de ejecuci�n una vez declarado su tama�o
//
//		//Si quiero imprimir un determinado valor en consola
//		//necesito indicar que posici�n quiero imprimir
//		
//		System.out.println(numeros2[3]);
//		
//		//Vamos a crear un ejemplo en el que se solicite 
//		//declarar el tama�o de un array al usuario por teclado
//		Scanner entrada = new Scanner(System.in);
//		int tama�oArray;
//		System.out.println("Introduce el tama�o del array de enteros");
//		tama�oArray=entrada.nextInt();
//		
//		int [] arrayUsuario = new int[tama�oArray];
//		
//		//Proceso para llenar nuestro Array de Enteros
//		for (int i = 0; i < arrayUsuario.length; i++) {
//			System.out.println("Ingresa el valor de la posici�n " + i);
//			//Procedemos a llenar con valores ingresados por teclado 
//			//cada posici�n 
//			arrayUsuario[i]=entrada.nextInt();
//		}
//		//Una vez que esta lleno el array, mando a imprimir un valor
//		System.out.println(arrayUsuario[2]);
		
		//Otra forma de declarar los arrays es inicializando
//		//ya con datos
//		int [] numeros3 = {1,2,3,4,5};
//		
//		//Imprimir todos los valores de mi arreglo en consola
//		for (int i = 0; i < numeros3.length; i++) {
//			System.out.println(numeros3[i]);
//		}
//		
//		//Podemos ocupar los numeros una vez almacenados para
//		//realizar operaciones entre ellos si asi lo necesitamos
//		System.out.println("Resultado = " + (numeros3[4]+numeros3[0]));
//	
//	
//		//Imprimiendo en consola cada numero con un ciclo forEach
//	for (int i:numeros3) { //Para cada elemento entero del array
//		System.out.println(i); //mandamos a imprimir cada valor
//	}
	
	//�Puedo tener un array en el que pueda almacenar
	//tanto datos num�ricos, cadenas de texto, decimales, char, etc?
	//Se puede declarar un array que contenga m�s de un tipo de dato
	//gracias a la clase Object o creando un objeto propio
	
	Object [] variosDatos = new Object [5];
	
	variosDatos[0]=300;
	variosDatos[1]="Alex";
	variosDatos[2]='A';
	variosDatos[3]=1222.56;
	variosDatos[4]=true;
	
	System.out.println(variosDatos[1]);
	
	
	//Puedo tener datos num�ricos en un String y convertirlos
	//tanto datos numericos, cadenas de texto, decimales, char, etc?
	String num = "300";
	
	int z = Integer.parseInt(num);
	
	System.out.println(z);
	
	

	}

}