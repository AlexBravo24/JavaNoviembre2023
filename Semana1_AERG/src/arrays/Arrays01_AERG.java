package arrays;

import java.util.Scanner;

public class Arrays01_AERG 
{
	/*Crea un array de 10 posiciones de números con valores pedidos 
	  por teclado. Muestra por consola el índice y el valor al que 
	  corresponde.*/
	public static void main(String[] args) 
	{
		int [] num = new int [10]; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digita uno por uno el numero entero que guardaras");
		
		for (int i = 0; i < num.length; i++) 
		{
			System.out.println("valor "+i);
			num[i] = sc.nextInt();
		}
		
		System.out.println("los valores guardados son:");
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+" - "+num[i]);
		}
		
	}

}
