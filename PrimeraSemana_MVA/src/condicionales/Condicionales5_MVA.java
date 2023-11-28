package condicionales;

import java.util.Scanner;

public class Condicionales5_MVA {

	public static void main(String[] args) {
//		 Realiza un programa que calcule la aceptación de una solicitud en base a 
//		 los siguientes parámetros: edad, nota y sexo. 
//		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
//		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
//		 * Otros casos -> NO ACEPTADA

		int edad,nota;
		String sexo;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("digite edad");
		edad= entrada.nextInt();
		System.out.println("digite la nota");
		nota = entrada.nextInt();
		System.out.println("digite sexo");
		sexo = entrada.next();
		
		entrada.close();
		
		if (nota>=5 && nota <=10 && edad>=18 && edad <=80 && sexo.equalsIgnoreCase("M")){
			System.out.println("posible");
		}
		else if (nota>=5 && nota <=10 && edad>=18 && edad <=80 && sexo.equalsIgnoreCase("F")){
			System.out.println("Aceptada");
		}
		else if ((nota>0 && nota <5) || (edad>0 && edad<18) || (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))){
			System.out.println("NO ACEPTADA");
		}
	
		
	}

}
