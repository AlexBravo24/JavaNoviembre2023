package condicionales;

import java.util.Scanner;

public class Condicionales10_CRT {

	public static void main(String[] args) {
		
		/*
		 * 10.Realiza un programa que pida un n�mero entero entre uno y doce e 
		 * imprima el n�mero de d�as que tiene el mes correspondiente.
		 */
		
		int mes;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un d�a de la semana del 1 al 7");
		mes=entrada.nextInt();
		
		entrada.close();
		
		if (mes == 1 ) {
			System.out.println("El mes tiene 31 d�as");
		} else if( mes == 2 ) {
			System.out.println("El mes tiene 28 d�as");
		} else if( mes == 3 ) {
			System.out.println("El mes tiene 31 d�as");
		} else if( mes == 4 ) {
			System.out.println("El mes tiene 30 d�as");
		} else if( mes == 5 ) {
			System.out.println("El mes tiene 31 d�as");
		} else if( mes == 6 ) {
			System.out.println("El mes tiene 30 d�as");
		} else if( mes == 7 ) {
			System.out.println("El mes tiene 31 d�as");
		} else if( mes == 8 ) {
			System.out.println("El mes tiene 31 d�as");
		} else if( mes == 9 ) {
			System.out.println("El mes tiene 30 d�as");
		} else if( mes == 10 ) {
			System.out.println("El mes tiene 31 d�as");
		} else if( mes == 11 ) {
			System.out.println("El mes tiene 30 d�as");
		} else if( mes == 12 ) {
			System.out.println("El mes tiene 31 d�as");
		} else {
			System.out.println("Error");
		}

	}

}
