package condicionales;

import java.util.Scanner;

public class Condicionales7_AURC {

	public static void main(String[] args) {
		/* 7. El director de una escuela está organizando un viaje de estudios y requiere 
determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 
alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 
euros, sin importar el número de alumnos. Realiza un algoritmo que permita 
determinar el pago a la compañía de autobuses y lo que debe pagar cada 
alumno por el viaje.*/
		Scanner scanner = new Scanner(System.in);

		Integer numeroAlumnos;
		int costoViaje;
		Integer i;
System.out.println("Introduce el numero de alumnos que asistiran al viaje de de estudios: ");
numeroAlumnos = scanner.nextInt();

	for(i=0; i <= 100; i++) {
		costoViaje = numeroAlumnos * 65;
		if ( i >= 50 && i <= 99) {
			costoViaje = numeroAlumnos * 70;
			}else if(i >= 30 && i <= 49){
				costoViaje = numeroAlumnos * 95;
			}else{
				costoViaje = 4000;
			}
		scanner.close();
		System.out.println("El numero de alumnos que realizara el viaje es de :" + i +
				" " + " " + "El costo total del viaje de estudios es de :" + " " + costoViaje) ;
	}return;
	
 }

}
