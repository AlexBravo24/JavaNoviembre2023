package condicionales;

import java.util.Scanner;

public class Condicionales7_PRC {

	public static void main(String[] args) {
		/*. El director de una escuela está organizando un viaje de estudios y requiere 
            determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
            compañía de viajes por el servicio. 
            La forma de cobrar es la siguiente:
             * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
             * De 50 a 99 alumnos, el costo es de 70 euros. 
             * De 30 a 49 alumnos, el costo es de 95 euros. 
             * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, 
               sin importar el número de alumnos. 
               Realiza un algoritmo que permita  determinar el pago a la compañía de autobuses 
               y lo que debe pagar cada alumno por el viaje.
		 */
		
		Scanner datos= new Scanner(System.in);
		
		System.out.println("ingresa la cantidad de alumnos");
		
		double alumnos = datos.nextDouble();
		
		
		if (alumnos>=100) {
			System.out.println("alumnos pagan "+ (4000/alumnos)+ " euros a la compañia se le paga "+ (65*alumnos));
		} else if (alumnos<=99 && alumnos>=50) {
			System.out.println("alumnos pagan "+ (4000/alumnos)+ " euros a la compañia se le paga "+ (70*alumnos));
		}else if (alumnos<=49 && alumnos<=30) {
			System.out.println("alumnos pagan "+ (4000/alumnos)+ " euros a la compañia se le paga "+ (95*alumnos));
		}else if (alumnos<30) {
			System.out.println("alumnos pagan "+ (4000/alumnos)+ " euros a la compañia se le paga "+ (4000));
			
		}
		
		datos.close();

	}

}
