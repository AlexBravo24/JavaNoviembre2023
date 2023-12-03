package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Los arrays, o arreglos, o vectores
		//Son una estructura que nos permite 
		//almacenar un tipo de datos en comun 
		// Se pueden decir que es una  estructura similar 
		// a una tabla per de una sola fila 
		//dato, dato , dato
		//Seria como una coleccion de datos 
		
		//Ejemplo de  declarar un array de numeros enteron 
		int [] numero;
		//Ejemp´lo de un array  con su tamaño declarado 
		//Un ARRAT EN EL QUE PODEMOS ALMACENAR 5 VALORES NUMERICOSA
		
		int [] numero2 = new int [5];
		
		// Como guardar valores en cada posicion de nuestro array 
		numero2[0]=1;
		numero2[1]=2;
		numero2[2]=3;
		numero2[3]=4;
		numero2[4]=5;
		//La desventaja de los arrays es que si quiero seguir
		//almacenando datos, estos no pueden crecer
		//en tiempo de ejecucion una vez declarado su tamaño
//		numero2[5]=6;
//		numero2[6]=11;
//		
		//Si quiero imprimir un determinado valor en consola
		//necesito indicar que posicion quiero imprimir
          System.out.println(numero2[3]);
		
//		Scanner entradas = new Scanner (System.in);
//		int tamañoArray;
//		System.out.println("Introduce el tamaño del array de enteros");
//		tamañoArray=entradas.nextInt();
//		
//		int [] arrayUsuario = new int [tamañoArray];
//		
//		for (int i = 0; i < arrayUsuario.length; i++) {
//			System.out.println("Ingresar el valor de la posicion " + i);
//			
//			arrayUsuario[i] = entradas.nextInt();
//			System.out.println(arrayUsuario[3]);
          
          
          // otra forma de declarar los arrays es inicializado
          //ya con datos 
          
          int [] numero3 = {1,2,3,4,5,7,8};
          
         System.out.println(numero3);
//			
         
         for (int i:numero3) {
        	 System.out.println(i);
         }
         
         //¿Puedo tener un array en el que pueda almacenar
         //tanto datos numericos, cadena de texto, decimales,char, etc?
         //Sepuede declarar un array que contenga mas de un tipo de dato
         //gracias a la clase Objeto o creando un objeto propio
         
         Object [] variosDatos = new Object [5];
         variosDatos[0]=300;//Integer
         variosDatos[1]="Alex"; //String
         variosDatos[2]="A";//character
         variosDatos[3]=12000.56;//doblue
         variosDatos[4]=true;//boolean
         
         System.out.println(variosDatos[1]);
         //Puedo tener datos numericos en un string y convertirlos 
         
         String num = "300";
         int z = Integer.parseInt(num);
         
         System.out.println(z);
		}
	
		

	}


