package condicionales;

import java.util.Scanner;

public class Condicionales7_VRDV {

	public static void main(String[] args) {

		// 7. El director de una escuela est� organizando un viaje de estudios y
		// requiere
//		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la 
//		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 
//		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
//		determinar el pago a la compa��a de autobuses y lo que debe pagar cada 
//		alumno por el viaje.

		int alumno;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la cantidad de estudiantes que asistiran al viaje escolar");

		alumno = entrada.nextInt();

		entrada.close();

		if (alumno > 101) {

			System.out.println("Cada alumno deberia pagar " + "65 euros y a la compa�ia se le pagaria " + (alumno * 65));

		}

		if (alumno < 100 && alumno > 49) {
			
			System.out.println("Cada alumno deberia pagar " + "70 euros y a la compa�ia se le pagaria " + (alumno * 70));

		}
		if (alumno < 50 && alumno > 29) {

			System.out.println("Cada alumno deberia pagar " + "95 euros y a la compa�ia se le pagaria " + (alumno * 95));
			
		}
		if (alumno < 50 && alumno > 29) {

			System.out.println("Cada alumno deberia pagar " + (4000 / alumno));

		}

	}

}
