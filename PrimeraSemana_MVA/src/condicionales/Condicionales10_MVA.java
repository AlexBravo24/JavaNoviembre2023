package condicionales;

import java.util.Scanner;

public class Condicionales10_MVA {

	public static void main(String[] args) {
//		Realiza un programa que pida un número entero entre uno y doce e imprima 
//		el número de días que tiene el mes correspondiente.
		
		int mes;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite el mes en numero: (1-12)");
		mes= entrada.nextInt();	
		
		
		switch (mes) {
		case 1:
			System.out.println("el mes de ENERO tiene 31 dias");
			break;
		case 2: 
			System.out.println("el mes de FEBRERO tiene 28 dias");
			break;
		case 3: 
			System.out.println("el mes de MARZO tiene 31 dias");
			break;
		case 4: 
			System.out.println("el mes de ABRIL tiene 30 dias");
			break;
		case 5: 
			System.out.println("el mes de MAYO tiene 31 dias");
			break;
		case 6: 
			System.out.println("el mes de JUNIO tiene 30 dias");
			break;
		case 7: 
			System.out.println("el mes de JULIO tiene 31 dias");
			break;
		case 8: 
			System.out.println("el mes de AGOSTO tiene 31 dias");
			break;
		case 9: 
			System.out.println("el mes de SEPTIEMBRE tiene 30 dias");
			break;
		case 10: 
			System.out.println("el mes de OCTUBRE tiene 31 dias");
			break;
		case 11: 
			System.out.println("el mes de NOVIEMBRE tiene 30 dias");
			break;
		case 12: 
			System.out.println("el mes de DICIEMBRE tiene 31 dias");
			break;
		default:
			System.out.println("Digitaste un numero fuera del rango  ---ERROR---");
			break;
		}
		

	}

}
