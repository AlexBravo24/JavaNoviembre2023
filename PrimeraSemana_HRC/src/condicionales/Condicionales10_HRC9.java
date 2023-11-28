package condicionales;

import java.util.Scanner;

public class Condicionales10_HRC9 {

	public static void main(String[] args) {
		/*
		 * 10.Realiza un programa que pida un número entero entre uno y doce e imprima
		 * el número de días que tiene el mes correspondiente.
		 */

		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero entre 1 y 12:");
		num = entrada.nextInt();
		entrada.close(); // Cerrar scanner para ahorrar memoria

		if (num < 1 || num > 12) {
			System.out.println("ERROR: numero incorrecto");
		} else {

			switch (num) {

			case 1:
				System.out.println("31 dias");
				break;
			case 2:
				System.out.println("28 dias");
				break;
			case 3:
				System.out.println("31 dias");
				break;
			case 4:
				System.out.println("30 dias");
				break;
			case 5:
				System.out.println("31 dias");
				break;
			case 6:
				System.out.println("30 dias");
				break;
			case 7:
				System.out.println("31 dias");
				break;
			case 8:
				System.out.println("31 dias");
				break;
			case 9:
				System.out.println("30 dias");
				break;
			case 10:
				System.out.println("31 dias");
				break;
			case 11:
				System.out.println("30 dias");
				break;
			default:
				System.out.println("31 dias");
				break;
			}
		}
	}

}
