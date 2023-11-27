package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		// Array de dos dimensiones
		//Es una estructura que nos va a permitir pasar
		//a un concepto de "tabla" para poder almacenar 
		//datos y presentarlos de forma tabular
		//Tambien son conocidos como matrices
		
		//Entonces ahora contamos con 2 posiciones a declarar 
		//en tamano , una nos ayudara con el valor de
		//la posicion de las "filas" y otra las "columnas"
		
		//Ejemplo de como declarar un array de dos dimensiones 
		//De numeros enteros
		
		int [][] matriz = new int [3][3];//[F][C]
		
		matriz[0][0]= 100;
		matriz[0][1]= 200; //[100][200][300]
		matriz[0][2]= 300;
		
		matriz[1][0]= 400;
		matriz[1][1]= 500; //[400][500][600]
		matriz[1][2]= 600;
		
		matriz[2][0]= 700;
		matriz[2][1]= 800; //[700][800][900]
		matriz[2][2]= 900;
		
		//Para imprimir un valor especifico encontrado en la matriz 
		//necesitamos indicar el valor de ambas posiciones
		System.out.println(matriz[1][1]);
		
		//Ejemplo de declarar la matriz con valores definidos
		
		int [][] matriz2 = {{100,200,300},
				            {400,500,600},
				            { 700,800,900}};
		
		//Ejemplo de imprimir todos los valores de nuestra matriz
		//con ciclos for anidados 
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
			
			}
		}
		
		
		
		
		
		
	}


