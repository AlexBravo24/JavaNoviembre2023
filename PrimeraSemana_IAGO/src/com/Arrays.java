package com;

public class Arrays {

	public static void main(String[] args) {
		
		// Los arrays o arreglos o vectores
		//son una estructura que nos permite 
		//almacenar un tipo de datos en comun
		//se puede decir que es una estructura similar
		// a una "tabla" per de una sola fila
		//[dato][dato][dato][dato]
		
		//Ejemplo de declarar un array de numeros enteros
		int [] numero;
		
		//Ejemplo de un arrary con su tamaño declarado
		//Un array en el que podemos almacenar 5 valores numericos
		
		int [] numeros2 = new int [5];
		
		//Como guardar valores en cada posicion en nuestro array 
		 numeros2[0]=1;
		 numeros2[1]=2;
		 numeros2[2]=3;
		 numeros2[3]=4;
		 numeros2[4]=5;
		 // La desventaja de los arrays es que si quiero
		 //almacenar datos estos no pueden crecer 
		 //en tiempo de ejecucion una vez declarado de su tamaño
		//Si quiero imprimir un determinado valor en consola 
		// necesito indicar que posicion quiero imprimir 
		 //System.out.println(numeros2[4]);
		 
		 int [] numeros3 = {1,2,3,4,5};
		 
		 //Imprimir todos los valores de mi arreglo en consola
		 for(int i = 0; i<numeros3.length; i++) {
			 //System.out.println(numeros3[i]);
		 }
		 
		 //Ciclo ForEcha
		 for (int i:numeros3) {//Para cada elemento entero del array 
			 System.out.println(i);//mandamos a imprimir cada valor 
			 
		 
	     //¿Puedo tener una array en el que pueda alamacenar tanto datos
		 // tanto datos numericos, cadena de texto, decimales, char, etc? 
		 
		 //Puedo tener datos numericos en un String y convertirlos
		 //Puedo declarar un array de contenga mas de un tipo de dato
		 //gracias a la clase Object o creando un objeto propio
			 String num="300";
			 
			 int z = Integer.parseInt(num);
			 System.out.println(z);
			 
			 Object [] variosDatos = new Object [5];
			 
			 variosDatos [0]=300;
			 variosDatos [1]="Alex";
			 VariosDatos [2]="A";
			 
		
			 
		 }
		

	}

}
