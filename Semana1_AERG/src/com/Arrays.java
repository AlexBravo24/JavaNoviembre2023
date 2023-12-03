package com;

public class Arrays 
{

/*ARRAYS: 
tambien llamados arrelos o vectrore 
son estructuras que nos permite almacenar multiples datos
de un solo tipo. Es como una lista:
[dato][dato][dato][dato][dato][dato][dato][dato]	  
*/
	public static void main(String[] args) 
	{
		//Array de numeros enteros
		int [] numEnt;
		
		//Array de numeros enteros con tamaño declarado 5
		//puede almacenar 5 datos de tipo int
		int [] numEnt2 = new int[5];
		
		//Como guardar valores en cada posicion de nuestro array
		numEnt2[0]=1;
		numEnt2[1]=2;
		numEnt2[2]=3;
		numEnt2[3]=444;
		numEnt2[4]=5;
		
		//para llamara un valor de un array debemos usar un indice que
		//empieza siempre en 0 y sigue hasta el tamaño indicado -1
		
		//Seleccionar un solo valor
		System.out.println(numEnt2[3]);
		
		//No se pude agregar mas valores a un array de los que se especifico 
		//en su inicialisacion 
		
//			int [] numEnt2 = new int[3]; // declaramos un array de 3 espacios
//		
//			numEnt2[0]=1;
//			numEnt2[1]=2;
//			numEnt2[2]=3;
//			numEnt2[3]=4;
//			numEnt2[4]=5;

		// esto daria un error al exeder el numero de espacios declarado
		//aunque no se usen los esacios no declarados
		
	
		// Tambien es posibli inicialisar el array con valore ya definidos
		//seria de la sig forma
		
		int [] numEnt3 = {1,2,3,4};
		
		//imprimir todos los valores de mi arreglo 
		
		for (int i = 0; i < numEnt3.length; i++) 
		{
			System.out.print(numEnt3[i]+", ");
			System.out.println();
		}
		//otra forma de imprimir es con forEach
		
		for (int i : numEnt3) //para cada elemnteo entero del array
		{
			System.out.println(i);
		}
	
		//puedo tener un array que pueda alamacenar tanto datos 
		//tipo String como int?
		//R= si, usando Object []

		Object[] dato = new Object [5];
		
				dato[0]= 100; 
				dato[1]= "ANGEL";
				dato[2]= 50;
				dato[3]= true;
				
				for (int i = 0; i < dato.length; i++) 
				{
					System.out.println(dato[i]);
				} 
	}

}
