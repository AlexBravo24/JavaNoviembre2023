package condicionales;

import java.util.Scanner;

public class Condicionales7_AERG {
	
//	7. El director de una escuela está organizando un viaje de estudios y requiere 
//	determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
//	compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//	100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 
//	alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//	euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 
//	euros, sin importar el número de alumnos. Realiza un algoritmo que permita 
//	determinar el pago a la compañía de autobuses y lo que debe pagar cada 
//	alumno por el viaje.

	public static void main(String[] args) 
	{
		float alum;
		float cost;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Cauntos alumnos van al viaje?...");
		
		alum = scn.nextInt();
		
		scn.close();
		
		if (alum >= 100) 					{System.out.println("El costo por alumno es de 65 EU");}
		else if (alum >= 50 && alum <= 99) 	{System.out.println("El costo por alumno es de 70 EU");}
		else if (alum >= 30 && alum <= 49) 	{System.out.println("El costo por alumno es de 95 EU");}
		else if (alum < 30 && alum >= 1) 	
		{
			cost = 4000 / alum; 
			System.out.println("El costo por alumno es de "+cost+" EU");		
		}
		else 
		{
			System.out.println("nuemero invalido");
		}
	}

}
