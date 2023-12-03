package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		// Array de dos dimenciones 
		// Es una ESTRUCTURA QUE NOS VA A PERMITISR PASAR
		//A UN CONCEPTO DE TABLA,  PARA PODER ALAMCENAR
		//DATOS Y PRECENTARLOS DE FORMA TABULAR
		// TANBIEN SON CONOCIDOS COMO MATRICES
		
		
		//ENTONCES AHORA CONTAMOS CON 2 POSICIONES A DECLARAR
		//EL TAMAÑO UNA NOS AYUDARA COMO EL VALOR DE 
		//LA POSICION DE LAS FILAS Y OTRO LAS COLUMNAS 
		//EJEMPLO DE COMO DECLARAMOS UN ARRAY DE DOS DIMENCIONES 
		//DE NUMEROS ENTEROS
		
		int [] [] matriz = new int [3] [3];
		
		matriz[0] [0] = 100;
		matriz[0] [1] = 200;//[100] [200] [300]
		matriz[0] [2] = 300;
		
		
		matriz[1] [0] = 400;
		matriz[1] [1] = 500;//[400] [500] [600]
		matriz[1] [2] = 600;
		
		matriz[2] [0] = 700;
		matriz[2] [1] = 800;//[700] [800] [900]
		matriz[2] [2] = 900;
		 
		//para imprimir un valor especifico encontramos en la matriz
		//necesitamos indicar en valor de ambas posiciones
		System.out.println(matriz[1] [1]);
		
		//Ejemplo de declara la matriz con valore definidos
		
		int [] [] matriz2 = {{100,200,300},
				             {400,500,600},
				             {700,800,900}};
		
		//Ejemplo de imprimir todos los valores de nuestra matriz
		//con ciclos for anidados
		
		for (int i = 0; i < matriz2.length; i++) {
			for(int j = 0; j < matriz2.length; j++) {
				System.out.println(matriz2[i] [j] + " ") ;
			}
			System.out.println();
			
		}
		
	}

}
