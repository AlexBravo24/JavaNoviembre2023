package condicionales;

import java.util.Scanner;

public class Condicionales10_AGZ {

	public static void main(String[] args) {
		// 10.Realiza un programa que pida un número entero entre uno y doce e imprima 
		//el número de días que tiene el mes correspondiente
		Scanner entrada = new Scanner(System.in);
		int mes;
		System.out.println("    Dias del Mese");
		System.out.println("Ingresa un numero del 1 - 12");
		mes = entrada.nextInt();
		
		switch (mes) {  //utiliza un case para seleccionar entre la variable el mes que se pide
		case 1:
			System.out.println("Enero 31 dias");
			break;
		case 2:
			System.out.println("Febrero 28 dias");
			break;
		case 3:
			System.out.println("Marzo 31 dias");
			break;
		case 4:
			System.out.println("Abril 30 dias");
			break;
		case 5:
			System.out.println("Mayo 31 dias");
			break;
		case 6:
			System.out.println("Junio 30 dias");
			break;
		case 7:
			System.out.println("Julio 31 dias");
			break;
		case 8:
			System.out.println("Agosto 31 dias");
			break;
		case 9:
			System.out.println("Septiembre 30 dias");
			break;
		case 10:
			System.out.println("Octubre 31 dias");
			break;
		case 11:
			System.out.println("Noviembre 30 dias");
			break;
		case 12:
			System.out.println("Diciembre 31 dias");
			break;
			
		default: System.out.println("ERROR");
			break;
		}
		
		
	}

}
