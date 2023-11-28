package com;

public class Arrays {

	public static void main(String[] args) {
		// Los arrays , o arreglos, o vectores
		// son estructuras que nos permiten
		// almacenar un tipo de datos en común
		// se puede decir que es una estructura similar
		// a una tabla, pero de una sola fila
		// [dato] [dato] [dato] [dato] [dato]
		// sería como una colleccion de datos
		// Ejemplo:
		// Declarar un array de numeros enteros

		int[] numero;

		// Array con su tamaño declarado, en el que podemos almacenar 5 valores
		// numericos
		int[] numeros2 = new int[5];

		// como guardar valores en cada posicion de nuestro array
		numeros2[0] = 1;
		numeros2[1] = 2;
		numeros2[2] = 3;
		numeros2[3] = 4;
		numeros2[4] = 5;

		System.out.println(numeros2[3]);
		
		
		/*Puedo tener un array en el que pueda almacenar tanto datos numericos,
		 * cadenas de texto, decimales, char, etc?
		 */
		//Puedo tener datos numéricos en un tring y convertirlos
		String num = "300";
		
		int z = Integer.parseInt(num);
		
		
		System.out.println(z);

	}

}
