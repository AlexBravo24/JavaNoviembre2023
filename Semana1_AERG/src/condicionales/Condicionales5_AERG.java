package condicionales;

import java.util.Scanner;

public class Condicionales5_AERG {

//	5. Realiza un programa que calcule la aceptación de una solicitud en base a 
//	los siguientes parámetros: edad, nota y sexo. 
//	* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
//	* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
//	* Otros casos -> NO ACEPTADA
	
	public static void main(String[] args) {
		
		int nota;
		int edad;
		String sexo;
		boolean wom;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introdusca Nota...");		
		nota = scn.nextInt();
		
		System.out.println("Introdusca Edad...");
		edad = scn.nextInt();
		
		System.out.println("Introdusca Sexo...(M/F)");
		sexo = scn.next();
		
		wom = sexo.equalsIgnoreCase("f");
				
		if (nota >= 5 && edad >= 18 && wom == true) {
			System.out.println("ACEPTADA");
			}else if(nota >= 5 && edad >= 18 && wom == false) {
				System.out.println("POSIBLE");
			}else {System.out.println("NO ACEPTADA");} 
		//System.out.println(nota+", "+edad+", "+sexo+".");

	}

}
