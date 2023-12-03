package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Los arrays, o arreglos, o vectores
		// son una estrcutura que nos permite
		//almacenar un tipo de datos en común
		//Se puede decir que es una estructura similar 
		// a una tabla, pero de una sola fila (coleccion de datos) 
		//[dato] [dato] [dato] [dato] [dato] [dato] 
		
		// Ejemplo de declarar un array de numeros enteros 
		 
int [] numero; 
// ejemplo de un array con su tamaño declarado 
//en el que podemos declarar 5 valores numericos
int [] numeros2 = new int [5];
//como guardar los valores en cada posicion de nuestro array
numeros2[0]=1;
numeros2[1]=2;
numeros2[2]=3;
numeros2[3]=4;
numeros2[4]=5;

//Si quiero imprimir un determinado valor en la consola
//necesito indicar que posicion quiero imprimir 
//la desventaja de los arrays es que si quiero seguir almacenando datos
//estos no pueden crecer
//en tiempo de ejecucion una vez declarado su tamaño 

System.out.println(numeros2[3]);
//vamos a crear un ejemplo en el que se solicite 
//declarar el tamanño de un array al usuario por teclado 
Scanner entrada = new Scanner (System.in);
int tamañoArray;

System.out.println("Introduce el tamaño del Array");
tamañoArray=entrada.nextInt();
int [] arrayUsuario = new int [tamañoArray];
//proceso para llenar nuestro array de enteros 
for(int i = 0; i < arrayUsuario.length;i++) {
	System.out.println("Ingresa la posicion" + i);
	//procedemos a llenar con los valores ingresados por teclado
	// cada posicion
	arrayUsuario[i]=entrada.nextInt();
	
	// Una ve que esta lleno el array, mando a imprimir un valor
	System.out.println(arrayUsuario[3])
	//otra forma de declarar los arrays es inicializando ya con datos

	
	
}

	}

}
