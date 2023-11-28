package condicionales;

import java.util.Scanner;

public class Condicionales10_PRC {

	public static void main(String[] args) {
		/*.Realiza un programa que pida un número entero entre uno y doce e imprima 
         el número de días que tiene el mes correspondiente*/

		Scanner meses= new Scanner(System.in);
		System.out.println("introduce un numero entre  1 y 12");
		int mes= meses.nextInt();
		
		
		
		switch(mes) {
		
		case 1:
			System.out.println(" es el mes de enero y tiene 31 dias ");
			break;
		case 2:
			System.out.println("es el mes de febrero y tiene 28 dias ");
			break;
		case 3:
			System.out.println(" es el mes de marzo y tiene 31 dias ");
			break;	
		case 4:
			System.out.println(" es el mes de abril y tiene 30 dias ");
			break;
		case 5:
			System.out.println(" es el mes de mayo y tiene 31 dias ");
			break;
		case 6:
			System.out.println(" es el mes de junio y tiene 30 dias ");
			break;
		
		case 7:
			System.out.println(" es el mes de julio y tiene 31 dias ");
			break;
		case 8:
			System.out.println(" es el mes de agosto y tiene 31 dias ");
			break;	
		case 9:
			System.out.println(" es el mes de septiembre y tiene 30 dias ");
			break;	
		case 10:
			System.out.println(" es el mes de octubre y tiene 31 dias ");
			break;	
		case 11:
			System.out.println(" es el mes de noviembre y tiene 30 dias ");
			break;	
		case 12:
			System.out.println(" es el mes de diciembre y tiene 31 dias ");
			break;		
		default:
			System.out.println("ERROR");
				
		}
		
		meses.close();
	}

}
