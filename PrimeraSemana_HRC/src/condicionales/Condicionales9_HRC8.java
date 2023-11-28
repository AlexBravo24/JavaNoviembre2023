package condicionales;

import java.util.Scanner;

public class Condicionales9_HRC8 {

	public static void main(String[] args) {
		/*
		 * 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el
		 * día correspondiente. Si introducimos otro número nos da un error.
		 */

		int dia;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de dia:");
		dia = entrada.nextInt();
		entrada.close(); // Cerrar scanner para ahorrar memoria

		if (dia < 1 || dia > 7) {
			System.out.println("ERROR: numero incorrecto");
		} else {

			switch (dia) {

			case 1:
				System.out.println("LUNES");
				break;
			case 2:
				System.out.println("MARTES");
				break;
			case 3:
				System.out.println("MIERCOLES");
				break;
			case 4:
				System.out.println("JUEVES");
				break;
			case 5:
				System.out.println("VIERNES");
				break;
			case 6:
				System.out.println("SABADO");
				break;
			default:
				System.out.println("DOMINGO");
				break;
			}
		}
	}

}
