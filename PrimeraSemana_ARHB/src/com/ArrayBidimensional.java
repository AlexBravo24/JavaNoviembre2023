package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array de dos dimensiones 
		//Es una estructura que nos va a permitir pasar a un concepto de tabla, para poder almacenar
		//datos y presentarlos de forma tabular
		//tambien son conocidos como matrices 
		
		//Entonces ahora contamos con 2 posiciones a declarar en tamaño, una nos ayudara
		//con el valor de la posicion de las filas y otras en las columnas
		
		int [] [] matriz = new int [3] [3];//el primer valor indica la fila y el segundo la columna
		
		//para guardar el primer valor se llama al nombre de la variable
		matriz [0][0]= 100;
		matriz [0][1]= 200;
		matriz [0][2]= 300;
		
		matriz [1][0]= 400;
		matriz [1][1]= 500;
		matriz [1][2]= 600;
		
		matriz [2][0]= 700;
		matriz [2][1]= 800;
		matriz [2][2]= 900;
		System.out.println(matriz[2][1]);
		System.out.println();
		
		int [][] matriz2 = {{100,200,300},{400,500,600},{700,800,900}};
		
		for(int i =0; i<matriz2.length; i++) {
			for(int j=0; j<matriz2.length; j++) {
				System.out.println(matriz2[i][j]);
			}
			System.out.println();// para mostrar en lineas difenrentes
		}
	}

}
