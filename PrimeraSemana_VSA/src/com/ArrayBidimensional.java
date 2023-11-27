package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		
		int [] [] matriz = new int [3] [3];  //[F] [C]
		
		matriz [0] [0] = 100;
		matriz [0] [1] = 200;   //[100] [200] [300]
		matriz [0] [2] = 300;
		
		
		matriz [1] [0] = 400;
		matriz [1] [1] = 500;   //[400] [500] [600]
		matriz [1] [2] = 600;
		
		
		matriz [2] [0] = 700;
		matriz [2] [1] = 800;   //[700] [800] [900]
		matriz [2] [2] = 900;
		
		System.out.println(matriz);  //así no lee correctamente la matriz...
		
		//Para imprimir un valor específico encontrado en la matriz, 
		//se indica el valor de ambas posiciones
		System.out.println(matriz [1] [1]);
		
		// ejemplo de declarar la matriz con valores definidos
		int [] [] matriz2 = {{100,200,300},{400,500,600},{700,800,900}};
		//ejemplo de imporimmir todos los valores de la matriz
		//con ciclos for anidados
		for (int i = 0; i<matriz.length; i++) {
			for()
		}
		
		// matriz de tres dimensiones
		int [] [] [] [] cubo = new int [3] [3] [3] [3];

	}

}
