package condicionales;

import java.util.Scanner;

public class Condicionales7_IAGO {

	public static void main(String[] args) {
		
		// 7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto 
		//debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de 
		//cobrar es la siguiente: * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. * De 
		//50 a 99 alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 euros. * Menos de 
		//30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. Realiza 
		//un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
		
		//Abrir un nuevo Scanner 
		
		int alumnos;
		
		Scanner entrada= new Scanner (System.in);
		
		//Ingresar el numero de alumnos
		System.out.println("Ingresa el numero de alumnos que iran al viaje: ");
		alumnos = entrada.nextInt();
		entrada.close();
		
		if (alumnos>=100 ) {
			System.out.println("El costo del servicio de la compañia de viajes será: " + (alumnos * 65 ) + "euros");
		}  else if (alumnos <100 && alumnos>=50) {
			System.out.println("El costo del servicio de la compañia de viajes será: " + (alumnos * 70 ) + "euros");
		} else if (alumnos <50 && alumnos>=30) {
			System.out.println("El costo del servicio de la compañia de viajes será: " + (alumnos * 95 ) + "euros");
		} else {
			System.out.println("El costo del servicio de la compañia de viajes será: " + 4000 + "euros");
		}
		

	}

}
