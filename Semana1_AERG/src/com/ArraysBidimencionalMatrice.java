package com;

public class ArraysBidimencionalMatrice 
{
/*Arrays de dos dimenciones o matrices
 * pasamos de guardar datos en formato lista como los arrays de una dimencion
 * a guardar en formato tabla. por ende ahora requerimos 2 indices en lugar de 1.
 * el index 1 corresponde a filas y el index 2 a columnas. 
 */
	
	
	public static void main(String[] args) 
	{
		//Array int de 2 dimencionnes (3x3)
		int [][] matriz = new int [3][3]; //[F][C]
		
		matriz[0][0]= 100;
	    matriz[0][1]= 200; // [100][200][300]
	    matriz[0][2]= 300;
	    											 //	   0	1	 2
	    matriz[1][0]= 100;							 //0 [100][200][300]
	    matriz[1][1]= 200; // [400][500][600]   =    //1 [400][500][600]
	    matriz[1][2]= 300;					 		 //2 [700][800][900]
	    
	    matriz[2][0]= 100;
	    matriz[2][1]= 200; // [700][800][900]
	    matriz[2][2]= 300;
	    
	    System.out.println(matriz[1][1]); // imprimimos en datos de la cordenada 1,1
	    								  // que es 500
	    System.out.println();
	    
	    //crear una matriz con los valores definidos.
	    int [][] matriz2 = {{100,200,300},{400,500,600},{700,800,900}};
	  
	    //imprimir todos los datos de la matriz don ciclos for 
	    for (int i = 0; i < matriz2.length; i++) 
	    {
			for (int j = 0; j < matriz2.length; j++) 
			{
				System.out.println(matriz2[i][j]);
			}
		}
	    
	    //imprimir todos los datos de la matriz don ciclos for en form tabla
	    for (int f = 0; f < matriz2.length; f++) 
	    {
			for (int c = 0; c < matriz2.length; c++) 
			{
				System.out.print(matriz2[f][c]+","); //usamos solo print
			}
			System.out.println(); // un salto de linea cada que cambiamos de fila
		}
	}
}
