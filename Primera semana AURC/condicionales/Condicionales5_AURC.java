package condicionales;

import java.util.Scanner;

public class Condicionales5_AURC {
	/*Realiza un programa que calcule la aceptación de una solicitud en base a 
los siguientes parámetros: edad, nota y sexo. 
* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
* Otros casos -> NO ACEPTADA */

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce Nota");
		Integer nota = scanner.nextInt();
		System.out.println("Introduce Edad");
		Integer age = scanner.nextInt();
		System.out.println("Introduce Sexo");
		char sexoMasculino = 'M';
		char sexoFemenino = 'F';
		boolean sexo = scanner.hasNext();
	
		if(( nota == 5 && age == 18) && sexo){
			System.out.println("POSIBLE");
		}else if((nota == 5 && age == 18 ) && sexo){
			System.out.println("ACEPTADA");
			}else{
				System.out.println("NO ACEPTADA");
			}
		
	}

}
