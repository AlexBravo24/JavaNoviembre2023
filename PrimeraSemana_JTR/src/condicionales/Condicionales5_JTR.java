package condicionales;

import java.util.Scanner;

public class Condicionales5_JTR {

	public static void main(String[] args) {
		/*
		 * . Realiza un programa que calcule la aceptación de una solicitud en base a 
		los siguientes parámetros: edad, nota y sexo. 
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		* Otros casos -> NO ACEPTADA
		 * 
		 */
		int nota, edad;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la nota:");
		nota=entrada.nextInt();
		System.out.println("Introduce tu edad:");
		edad=entrada.nextInt();
		String sexo;
		entrada.nextLine();//Consume los saltos de linea
		System.out.println("Introduce sexo (M o F)");
		sexo= entrada.nextLine();
		entrada.close();
		
		if(nota>=5 && edad >=18 && sexo.equals("M")) {
			System.out.println("POSIBLE");
		}
		else if(nota>=5 && edad >=18 && sexo.equals("F")) {
			System.out.println("ACEPTADA");
		}
		else {
			System.out.println("NO ACEPTADA");
		}
		

	}

}
