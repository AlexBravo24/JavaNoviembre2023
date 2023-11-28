package condicionales;

import java.util.Scanner;

public class Condicionales5_CRT {

	public static void main(String[] args) {
		
		// Realiza un programa que calcule la aceptación de una solicitud  
		// en base a los siguientes parámetros: edad, nota y sexo.
		// Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		// Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		// Otros casos -> NO ACEPTADA
		
		int edad;
		int nota;
		String sexo;
		String textM;
		String textF;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la edad");
		edad=entrada.nextInt();
		
		System.out.println("Introduce la nota");
		nota=entrada.nextInt();
		
		sexo=entrada.nextLine();
		
		System.out.println("Introduce M para masculino y F para femenino");
		sexo=entrada.nextLine();
		
		textM = "M";
		textF = "F";
		
		entrada.close();
		
		if (nota == 5 && edad == 18 && sexo.equals(textM) ) {
			System.out.println("Solicitud POSIBLE");
		} else if( nota == 5 && edad == 18 && sexo.equals(textF) ) {
			System.out.println("Solicituf ACEPTADA");
		} else {
			System.out.println("NO ACEPTADA");
		}
		
	}

}
