package condicionales;

import java.util.Scanner;

public class Condicionales9_MVA {
	public static void main(String[] args) {
		/*Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
		correspondiente. Si introducimos otro número nos da un error*/
		
		int dia;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite el dia de la semana en numero: (1-7)");
		dia= entrada.nextInt();	
		
		
		switch (dia) {
		case 1:
			System.out.println("LUNES");
			break;
		case 2: 
			System.out.println("MARTES");
			break;
		case 3: 
			System.out.println("MIERCOLES");
			break;
		case 4: 
			System.out.println("JUEVES");
			break;
		case 5: 
			System.out.println("VIERNES");
			break;
		case 6: 
			System.out.println("SABADO");
			break;
		case 7: 
			System.out.println("DOMINGO");
			break;
		default:
			System.out.println("Digitaste un numero fuera del rango  ---ERROR---");
			break;
		}
	}

}
