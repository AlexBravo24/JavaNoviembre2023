package array;

import java.util.Scanner;

public class Arrays1_pogm {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		//Muestra por consola el índice y el valor al que corresponde.
		Scanner sc = new Scanner (System.in);
		int array [] = new int [10];
		int numero =0,posicion=0;
		
		System.out.println("Datos del array");
		
		for(int i=0; i<8;i++) {
			System.out.print((i+1)+"- Digite un numero: ");
			array[i]=sc.nextInt();
		}
			System.out.print("Nuevo numero: ");
			numero=sc.nextInt();
			System.out.println("----------");
			System.out.print("Posicion");
			posicion=sc.nextInt();
			
			for(int i=7; i>posicion;i--) {
				array[i+1]=array[i];
			}
			
			array[posicion]=numero;
			System.out.println("Nuevos valores del arreglo: ");
			for(int i=0;i<9;i++) {
				System.out.print(array[i]+" ");
			}
			
		}

	}


