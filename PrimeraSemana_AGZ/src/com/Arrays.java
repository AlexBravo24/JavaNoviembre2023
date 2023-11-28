package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Los arrays, o arreglos, o vectores son una estructura
		//que nos permite almacenar un tipo de datos en comun
		//se puede decir que es una estructura similar a una "tabla"
		//pero de una sola fila
		//[dato][dato][dato][dato]
		
		//ejemplo declarar un array de numeros enteros
		int[] numero;
		
		//ejemplo de un array con su tamaño declarado
		//un array en el que podemos almacenar 5 valores numericos
		int[] numeros2=new int[5];
		
		//como guardar valores en cada posicion de nuestro array
		numeros2[0]=1;
		numeros2[1]=2;
		numeros2[2]=3;
		numeros2[3]=4;
		numeros2[4]=5;
		
		//si quiero imprimir un determinado valor en consola
		//necesito indicar que posicion quiero imprimir
		System.out.println(numeros2[3]);
		
//		//Vamos a crear un ejemplo donde solicite declarar el tamaño 
//		//de un array al usuario por teclado
//		
//		Scanner entrada=new Scanner(System.in);
//		int tamañoArray;
//		System.out.println("Introduce el tamaño del array de enteros");
//		tamañoArray=entrada.nextInt();
//		
//		int[]arrayUsuario = new int [tamañoArray];
//		
//		//proceso para llenar el array
//		for (int i = 0; i < arrayUsuario.length; i++) {
//			System.out.println("Ingresa el valor de la pocision "+i );
//			//procedemos a llenar con valores ingresados por teclado
//			//cada posicion
//			arrayUsuario[i]=entrada.nextInt();
//		}
//		//una vez que este lleno el array mando a imprimir un valor
//System.out.println(arrayUsuario[3]);
		
		
		
		//otra forma de declarar los arrays es inicializando ya con datos
		
		int[] numeros3 = {1,2,3,4,5};
		
		//imprimir todos los valores de mi arreglo en consola
		for (int i = 0; i < numeros3.length; i++) {
			System.out.print(numeros3[i]);
		}
		System.out.println();
		
		//podemos ocupar los numros una vez almacenados para realizar 
		//operaciones entre ellos si asi se necesita
		System.out.println("Resultado= "+ (numeros3[3]+numeros3[4]));
		
		
		//forEach
		for(int i:numeros3) { //para cada elemento entero del array
			System.out.println(i); //mandamos a imprimir cada valor
		}
		
		//¿Puedo tener un array en el que pueda almacenar
		//tanto datos numericos, cadenas de texto, decimales, char, etc?
		
		/*Se puede declarar un array que contenga mas de un tipo de dato
		 * gracias a la clase Object o creando un objeto propio
		 */
		
		Object[] variosDatos = new Object [5];
		//no serian datos primitivos
		variosDatos[0]=300;   //Integer
		variosDatos[1]="Antonio";  //String  siii es un objeto de clase string
		variosDatos[2]='A';		//Character
		variosDatos[3]=120.34;  //Double
		variosDatos[4]=true;	//Boolean
		
		//puedo tewner datos numericos en un string y convertirlos
		
		String num="300";
		int z = Integer.parseInt(num);
		System.out.println(z);
		
		System.out.println(variosDatos[4]);
		System.out.println(variosDatos[3]);
		System.out.println(variosDatos[1]);
		
		
		
	}

}
