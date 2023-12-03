package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		
		/*A rray de dos dimenciones:
		 * es una estructura que nos va  ahcer pasar a un consepto de "TABLA", para almacenar datos y presentarlos de forma tabular 
		 * tambien son conocidos como matrices.
		 * 
		 * Entonces ahora contamos con 2 posiciones a declarar en tamaño, una nos ayudara con el valor de la posicion 
		 * de las "FILAS" y otra las "COLUMNAS"
		 * 
		 * Ejemplo de como declarar un array de dos dimenciones de numeros enteros
		 * 
		 */

		
		int [][] matriz = new int [3] [3];// [F] [C]
		
		matriz[0][0]=100;
		matriz[0][1]=200;
		matriz[0][2]=300;
		
		matriz[1][0]=400;
		matriz[1][1]=500;
		matriz[1][2]=600;
		
		matriz[2][0]=700;
		matriz[2][1]=800;
		matriz[2][2]=900;
		//para imprimir un valor espesifico encontrado en la matriz necesitamos indicar el valor de ambas posiciones
		System.out.println(matriz [1][1]);
		//ejemplo de declarar matriz con valores ya asignados
		
		int[][] matriz2= {{100,200,300},{400,500,600},{700,800,900}};
		
		//Ejemplo de imprimir todos los valores de nuestra matriz con ciclos for anidados
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j] + "  ");
			}
			System.out.println();
			System.out.println();
		}
	}

}
