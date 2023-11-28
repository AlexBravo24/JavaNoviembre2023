package ciclos;

import java.util.Scanner;

public class Cliclos02_AERG {
/*
2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
introducido desde teclado, hasta la iteración deseada por el usuario. 
Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ??
*/
	public static void main(String[] args) 
	{			
		int lim;
		int tab;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("la tabla de que numero decea ver?...");		
		tab = sc.nextInt();
		
		System.out.println("hasta que numero decea ver?...");		
		lim = sc.nextInt();
		
		System.out.println();	
		sc.delimiter();
				
		for (int i = 0; i <= lim; i++) 
		{
			System.out.println(tab+" x "+i+" = "+tab*i);
		}

	}

}
