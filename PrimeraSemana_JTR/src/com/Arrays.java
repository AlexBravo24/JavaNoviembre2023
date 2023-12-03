package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int tamañoArray;
		System.out.println("Introduce el tamaño del array");
		tamañoArray= entrada.nextInt();
		
		int[] arrayUsuario = new int[tamañoArray];
		
		for (int i = 0; i < arrayUsuario.length; i++) {
			System.out.println("Ingrese el valor de la posicion "+i);
			arrayUsuario[i]=entrada.nextInt();
		}
		for (int i = 0; i < arrayUsuario.length; i++) {
			System.out.println("Numero guardado en la posicion "+i+": "+arrayUsuario[i]);
		}
		
		for(int i:arrayUsuario) {
			System.out.println(i);
		}
		
		/*
		 * Guardar en un array diferentes tipos de datos
		 * Se usa clase Object[]
		 * 
		 */
		
		Object [] variosDatos = new Object[5];
		
		variosDatos[0]=300;
		variosDatos[1]="Joel";
		variosDatos[2]='J';
		variosDatos[3]=1222.489;
		variosDatos[4]=true;
	}

}
