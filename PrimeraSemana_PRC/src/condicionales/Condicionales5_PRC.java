package condicionales;

import java.util.Scanner;

public class Condicionales5_PRC {

	public static void main(String[] args) {
		
//		//  Realiza un programa que calcule la aceptación de una solicitud en base a 
//		los siguientes parámetros: edad, nota y sexo. 
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
//		* Otros casos -> NO ACEPTADA

		Scanner datos = new Scanner(System.in);
		
		System.out.println("ingresa la nota");
		int nota= datos.nextInt();
		
		System.out.println("ingresa tu edad");
		int edad= datos.nextInt();
		 
		System.out.println("ingresa tu sexo 'm' / 'f'");
		String sexo= datos.next();
		 
		if(nota>=5 && edad>=18 && sexo.equals("f")) {
			System.out.println("aceptado");
		} else if(nota>=5 && edad>=18 && sexo.equals("m")){
			System.out.println("posible");
		} else {
			System.out.println("no aceptada");
		}
			
		
		 
		 
		
		
		
		
		 
		
		
		datos.close();
	}

}
