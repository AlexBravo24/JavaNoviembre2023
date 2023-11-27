package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		
		// Array de dos dimensiones 
		//es una estructura que nos va a permitir pasar 
		// a un concepto de "tabla" para poder almacenar 
		// datos y presentarlos de forma tabular
		//tambien son conocidos como matrices
		
		// entonces ahora contamos con 2 posiciones a declarar
		// en tamaño, una nos ayudara con el valor de la posicion de las filas y 
		// la otra con el valor de las columnas
		
		//ejemplo de como declarar un array de dos dimensiones
		// de numeors enteros
		
		int [] [] matriz = new int [3] [3]; // [fila [ [colummna[
		
		matriz [0] [0] = 100;
		matriz [0] [1] = 200; // |100| |200| |300|
		matriz [0] [2] = 300;

		matriz [1] [0] = 400;
		matriz [1] [1] = 500; // |400| |500| |600|
		matriz [1] [2] = 600;
		
		matriz [2] [0] = 700;
		matriz [2] [1] = 800; // |700| |500| |600|
		matriz [2] [2] = 900;
		
		
		// para imprimir un valor especifico encontra en la matriz
		// necesitamos indicar el valor de ambas posiciones
		
		System.out.println(matriz [1] [1]);
		
		// ejemplo de declarar la matriz con valores definidos
		
		int [] [] matriz2 = {{200,100,300}, {400,500,600}, {700,800,900} };
		
		//ejemplo de imprimir todos los valores de nuestra matriz
		// con ciclos for anidados
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print("| "+ matriz2 [i]  [j]  + " | ");
			}
			System.out.println();
		}
	}

}
