package condicionales;

import java.util.Scanner;

public class Condicionales5_ARHB {

	public static void main(String[] args) {
		/* 5.-Realiza un programa que calcule la aceptación de una solicitud en base a 
			los siguientes parámetros: edad, nota y sexo. 
		 	* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		 	* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		 	* Otros casos -> NO ACEPTADA */
		int nota;
		int edad;
		String sexo;
		
		System.out.println("INGRESA TUS DATOS PARA REALIZAR LA SOLICITUD");
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu Nota:");
		nota = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Ingresa tu edad:");
		edad = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Sexo: (f) Femenino ó (m) Masculino:");
		sexo = entrada.next();
		entrada.close();
		
		if (nota >= 5 && edad >= 18 && sexo.equals("f")) {
			System.out.println("ACEPTADA");
		}else if(nota >= 5 && edad >= 18 && sexo.equals("m")) {
			System.out.println("POSIBLE");
		}else {
			System.out.println("NO ACEPTADO");
		}

	}

}
