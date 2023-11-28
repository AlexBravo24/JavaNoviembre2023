package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		/*Array de dos dimensiones es una estructura que nos va a permitrir
		 * pasar a un concepto de "Tabla", para poder almacenar datos y 
		 * presentarlos de forma tabular mejor conocido como Matrices
		 */
		/*Entonces ahora contamos con dos pociciones a declarar
		 * en tamaño, una nos ayudata con el valor de la posicion de las "filas"
		 * y otra las "columnas"
		 * 
		 * Ejemplo de como declarar un array de dos dimensiones de numeros
		 * enteros:
		 */
		int [][]matriz=new int [3][3]; // [Filas] [columnas]
        matriz [0][0]=100;
        matriz [0][1]=200; //[100][200][300]
        matriz [0][2]=300;
        
        matriz [1][0]=400;
        matriz [1][1]=500; //[400][500][600]
        matriz [1][2]=600;
        
        matriz [2][0]=600;
        matriz [2][1]=800;//[700][800][900]
        matriz [2][2]=900;
        
        /*Para imprimir un valor especifico encontrado en la matriz
         * necesitamos indicar el valor de ambas posiciones
         */
		System.out.println(matriz[1][1]);
	//	int [][][][] cubo = new int [3][3][3][3];
        
        /*ejemplo de declarar la matriz con valores definidos
         * 
         */
		int [][]matriz2= {{100,200,300},{400,500,600},{700,800,900}};
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
