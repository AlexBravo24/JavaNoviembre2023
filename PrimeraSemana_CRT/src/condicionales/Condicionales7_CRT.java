package condicionales;

import java.util.Scanner;

public class Condicionales7_CRT {

	public static void main(String[] args) {
		
		/*
		 * 7. El director de una escuela está organizando un viaje de 
		 * estudios y requiere determinar cuánto debe cobrar a cada 
		 * alumno y cuánto debe pagar a la compañía de viajes por el 
		 * servicio. La forma de cobrar es la siguiente: * Si son 100 
		 * alumnos o más, el costo por cada alumno es de 65 euros. * 
		 * De 50 a 99 alumnos, el costo es de 70 euros. * De 30 a 49 
		 * alumnos, el costo es de 95 euros. * Menos de 30 alumnos, el 
		 * costo de la renta del autobús es de 4000 euros, sin importar 
		 * el número de alumnos. Realiza un algoritmo que permita 
		 * determinar el pago a la compañía de autobuses y lo que debe 
		 * pagar cada alumno por el viaje.
		 */
		
		int alumnos;
		int pago;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Captura el número de alumnos para el viaje de estudios");
		alumnos=entrada.nextInt();
		
		entrada.close();
		
		if ( alumnos > 100 ) {
			pago = alumnos*65;
			System.out.println("El cobro de cada alumno es de 65 euros");
			System.out.println("El pago a la compañia es de " + pago);
		} else if(alumnos >= 50 && alumnos <= 99 ) {
			pago = alumnos*70;
			System.out.println("El cobro de cada alumno es de 70 euros");
			System.out.println("El pago a la compañia es de " + pago);
		} else if(alumnos >= 30 && alumnos <= 49 ) {
			pago = alumnos*95;
			System.out.println("El cobro de cada alumno es de 95 euros");
			System.out.println("El pago a la compañia es de " + pago);
		} else if(alumnos <= 30 && alumnos > 0) {
			pago = 4000;
			System.out.println("El cobro a la compañia es de " + pago);
		} else {
			System.out.println("No se registraron alumnos para el viaje de estudios");
		}		
		
	}

}
