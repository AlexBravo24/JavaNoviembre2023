package condicionales;

import java.util.Scanner;

public class Condicionales7_MVA {

	public static void main(String[] args) {
//		El director de una escuela está organizando un viaje de estudios y requiere 
//		determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
//		compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//		100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//		euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 
//		euros, sin importar el número de alumnos. Realiza un algoritmo que permita 
//		determinar el pago a la compañía de autobuses y lo que debe pagar cada 
//		alumno por el viaje.
		
		int alumnos, pago, boleto;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite el numero de alumnos:");
		alumnos = entrada.nextInt();
		
		if (alumnos >= 100) {
			System.out.println("el precio por boleto es de 65 euros ");
			pago = 65 * alumnos;
			System.out.println("se le pagara a la empresa de viajes un total de: "+pago);
		}
		else if (alumnos < 100 && alumnos >=50) {
			System.out.println("el precio por boleto es de 70 euros ");
			pago = 70 * alumnos;
			System.out.println("se le pagara a la empresa de viajes un total de: "+pago);
		}
		else if (alumnos < 50 && alumnos >=30) {
			System.out.println("el precio por boleto es de 95 euros ");
			pago = 95 * alumnos;
			System.out.println("se le pagara a la empresa de viajes un total de: "+pago);
		}
		else if (alumnos < 30) {
			pago =  4000;
			boleto =pago / alumnos;
			System.out.println("el precio por boleto es de: " +boleto+" euros ");
			
			System.out.println("se le pagara a la empresa de viajes un total de: "+pago);
			
			}
		else if (alumnos <= 0) {
			System.out.println("no hay alumnos");
		
		}
		}

	}

