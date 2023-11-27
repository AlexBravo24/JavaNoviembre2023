package condicionales;

import java.util.Scanner;

public class Condicionales10_CRT {

	public static void main(String[] args) {
		
		/*
		 * 10.Realiza un programa que pida un número entero entre uno y doce e 
		 * imprima el número de días que tiene el mes correspondiente.
		 */
		
		int mes;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un día de la semana del 1 al 7");
		mes=entrada.nextInt();
		
		entrada.close();
		
		if (mes == 1 ) {
			System.out.println("El mes tiene 31 días");
		} else if( mes == 2 ) {
			System.out.println("El mes tiene 28 días");
		} else if( mes == 3 ) {
			System.out.println("El mes tiene 31 días");
		} else if( mes == 4 ) {
			System.out.println("El mes tiene 30 días");
		} else if( mes == 5 ) {
			System.out.println("El mes tiene 31 días");
		} else if( mes == 6 ) {
			System.out.println("El mes tiene 30 días");
		} else if( mes == 7 ) {
			System.out.println("El mes tiene 31 días");
		} else if( mes == 8 ) {
			System.out.println("El mes tiene 31 días");
		} else if( mes == 9 ) {
			System.out.println("El mes tiene 30 días");
		} else if( mes == 10 ) {
			System.out.println("El mes tiene 31 días");
		} else if( mes == 11 ) {
			System.out.println("El mes tiene 30 días");
		} else if( mes == 12 ) {
			System.out.println("El mes tiene 31 días");
		} else {
			System.out.println("Error");
		}

	}

}
