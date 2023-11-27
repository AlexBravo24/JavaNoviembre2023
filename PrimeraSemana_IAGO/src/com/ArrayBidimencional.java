package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		
		// Array de dos dimeciones 
		// Es una estructura que nos va a permitir pasar
		// a un concepto de "tabla", para poder almacenar
		//datos y presentarlos de forma tabular
		// tambien son conocidos como matrices
		
		//Entonces ahora contamos con 2 posiciones a declarar
		//en tamaño, una nos ayudara conel valor de 
		//la posicion de las filas y otra las columnas 
		
		//Ejemplo de como declarar un array de dos dimensiones
		// de numeros enteros
		
		int [][] matriz = new int [3][3]; //[F][C]
		
		matriz[0][0]= 100;
		matriz[0][1]= 200;
		matriz[0][2]= 300;
		
		matriz[1][0]= 100;
		matriz[1][1]= 200;
		matriz[1][2]= 300;
		
		matriz[2][0]= 100;
		matriz[2][1]= 200;
		matriz[2][2]= 300;
		
		//Para imprimir los valores se necesitan indicar ambas
		//posiciones.
		
		System.out.println(matriz[1][1]);
		
		//Ejemplo de declarar la matriz con valores definidos
		
		int [][] matriz2 = {{100,200,300},{400,500,600},{700,800,900}};
		
		//Ejemplo de imprimir todo los valores de nuestra matriz
		//con ciclos for anidados
		
		for (int i= 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println(matriz[i][j] + "");
			}
			System.out.println();
		}

	}

}
