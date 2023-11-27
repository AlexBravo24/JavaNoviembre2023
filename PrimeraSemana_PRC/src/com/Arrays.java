package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		// los arrays o arreglos o vectores son una estructura que nos permite un tipo de dato en comun 
		//se puede decir que es una estructura similar a una tabla pero de una sola fila
		//[dato] [dato] [dato] [dato] [dato] [dato]

		//ejemplo de declarar un array de numeros enteros
		
//		int [] numero;
//		
//		//ejemplo de array declarado con su tamaño declarado
//		
//		int [] numeros2=new int [5];
//		//como guardar valores en cada posicion de mi array 
//		numeros2[0]=1;
//		numeros2[1]=2;
//		numeros2[2]=3;
//		numeros2[3]=4;
//		numeros2[4]=5;
//		//la desventaja de los arrays es que si quiero seguir almacenando datos ,estos mo pueden crecer
//		//en tiempo de ejecucion una vez declarado
////		numeros2[5]=6;
////		numeros2[6]=11;
//		
//		//si quiero imprimir un determinado valor en consola 
//		// necesito indicar que posicion quiero imprimir
//		
//		System.out.println(numeros2[3]);
//		
//		//vamos a crear un ejemplo en el que se solicite 
//		//declarar el tamaño de un array al usuario por teclado
//		
//		Scanner entrada= new Scanner(System.in);
//		int tamañoArray;
//		System.out.println("introduce el tamaño del array de enteros");
//		tamañoArray=entrada.nextInt();
//		
//		int [] arrayUsuario= new int[tamañoArray];
//		
//		//proceso para llenar nuestro array de enteros
//		for (int i = 0; i < arrayUsuario.length; i++) {
//			System.out.println("ingresa el valor de la posicion "+ i );
//			//
//			//
//			arrayUsuario [i]=entrada.nextInt();
//		}
//		//una vez que esta lleno el array mando a imprimir un valor
//		
//		System.out.println(arrayUsuario[3]);
		
		
		//otra forma de declarar los arrays es inicializando ya con datos
		
		int [] numeros3 = {1,2,3,4,5,6,7,8};
		
		//imprimir todos los valores de mi arreglo en consola
		
		for (int i = 0; i < numeros3.length; i++) {
			System.out.println(numeros3[i]);
		}
		
		//podemos ocupar los numeros una vez alamcendado para realizar operacion entre ellos si asi lo necesitamos
		System.out.println();
		
		System.out.println("resultados = " + (numeros3[6]+numeros3[5]));
		
		//imprimindo en consola cada numero con un ciclo forEach
		 for(int i: numeros3) {// para cada elemento entro del array
			 System.out.println(i);//mandamos a imprimir cada valor
			 
		 }
		 
		 //¿puedo tener un array en el que pueda almacenar tanto datos numericos, cadenas de texto
		 //decimales, char, etc?
		 
		 Object [] variosDatos= new Object [5];
		 
		 variosDatos[0]=300;
		 variosDatos[1]="Alex";
		 variosDatos[2]='A';
		 variosDatos[3]=12000.56;
		 variosDatos[4]=true;
		 
		 System.out.println(variosDatos[1]);
		 
		 
		 //puedo tener datos numericos en un String y convertirlos
		 
		 String num= "300";
		 int z = Integer.parseInt(num);
		 
		 System.out.println(z);
		 
		 
		 
		 
	}

}
