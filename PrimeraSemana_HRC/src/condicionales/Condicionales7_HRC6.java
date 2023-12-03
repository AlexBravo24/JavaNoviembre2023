package condicionales;

import java.util.Scanner;

public class Condicionales7_HRC6 {

	public static void main(String[] args) {
		/*
		 * El director de una escuela est� organizando un viaje de estudios y requiere
		 * determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la compa��a
		 * de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 100
		 * alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 alumnos,
		 * el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 euros. *
		 * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin
		 * importar el n�mero de alumnos. Realiza un algoritmo que permita determinar el
		 * pago a la compa��a de autobuses y lo que debe pagar cada alumno por el viaje.
		 */
		int autobus = 4000;
		int alumnos;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de alumnos:");
		alumnos = entrada.nextInt();
		entrada.close(); // Cerrar scanner para ahorrar memoria

		if (alumnos >=100) {
			System.out.println("Cargo de 65 por alumno");
			System.out.println("Total a pagar = " + ((alumnos*65)+ autobus));
			
		} else if (alumnos ==50 && alumnos <=99) {
			System.out.println("Cargo de 70 por alumno");
			System.out.println("Total a pagar = " + ((alumnos*70)+ autobus));
			
		} else if (alumnos ==30 && alumnos <=49) {
			System.out.println("Cargo de 95 por alumno");
			System.out.println("Total a pagar = " + ((alumnos*95)+ autobus));
		} else {
			System.out.println("Cargo de 100 por alumno");
			System.out.println("Total a pagar = " + ((alumnos*100)+ autobus));
		}
	}
	}


