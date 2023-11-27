package condicionales;

import java.util.Scanner;

public class Condicionales5_VRDV {

	public static void main(String[] args) {
		
		//5. Realiza un programa que calcule la aceptación de una solicitud en base a 
//		los siguientes parámetros: edad, nota y sexo. 
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
//		* Otros casos -> NO ACEPTADA
		
		int edad;
		int nota;
		String sexo;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce tu edad");
			edad = entrada.nextInt();
			
		
		System.out.println("Introduce tu nota");
		
			nota = entrada.nextInt();
		
		
		System.out.println("escribe M para masculino o F para femenino");
			
		entrada.nextLine();
			sexo = entrada.nextLine();
			
			entrada.close();
			
				if (edad > 17 && nota > 5 && sexo.equals("m")) {
					
					System.out.println("posible candidato");
					
				}
				
				if(edad > 17 && nota > 4 && sexo.equals("f")) {
					
					System.out.println("Aprobada");
					
				}
				
				if(edad < 18 && nota <5) {
					
					System.out.println("no Aprobada");
					
				}

	}

}
