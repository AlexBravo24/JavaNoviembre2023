package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		//Array de dos dimensiones 
		// Estructura que nos va permitir pasar a un concepto de tabla 
		// para poder almacenar datos y presentarlos de forma tabular
		// tambien son conocidos como matrices
		
		//Entonces ahora contamos con dos posicions a declarar
		//en tamaño, una nos ayuda con el valor de "filas" y la otra de columnas
		
		//Ejemplo de como declarar un arreglo de dos dimensiones
		// de numero esteros
		
		int[][] matriz = new int [3][3]; //[F] [C]
		
		matriz [0][0]=100;
		matriz [0][1]=200;
		matriz [0][2]=300;
		
		matriz [1][0]=400;
		matriz [1][1]=500;
		matriz [1][2]=600;
		
		matriz [2][0]=700;
		matriz [2][1]=800;
		matriz [2][2]=900;
		
		//Para imprimir un valor especifico encontrando en la matriz 
		// necesitamos identificar el valor de ambas posiciones
		
		System.out.println(matriz[1][1]);
		System.out.println();
		// Ejemplo declarando la matriz con valores definidos
		
		int [][] matriz2 = {{100,200,300},{400,500,600},{700,800,900}};
		
		// Ejemplo para imprimir todos los valores de nuestra matriz 
		// con ciclos for anidados
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print (matriz2 [i][j] + " ");
			}
			System.out.println();
		}
	}

}
