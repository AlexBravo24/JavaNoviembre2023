package condicionales;

import java.util.Scanner;

public class Condicionales9_PRC {

	public static void main(String[] args) {
		/*Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
         correspondiente. Si introducimos otro número nos da un error.
        */
		
		Scanner dias= new Scanner(System.in);
		System.out.println("introduce un numero entre  1 y 7");
		int dia= dias.nextInt();
		
		
		
		switch(dia) {
		
		case 1:
			System.out.println("es dia lunes");
			break;
		case 2:
			System.out.println("es dia martes");
			break;
		case 3:
			System.out.println("es dia mIercoles");
			break;	
		case 4:
			System.out.println("es dia jueves");
			break;
		case 5:
			System.out.println("es dia viernes");
			break;
		case 6:
			System.out.println("es dia sabado");
			break;
		
		case 7:
			System.out.println("es dia domingo");
			break;
		default:
			System.out.println("ERROR");
				
		}
		
		dias.close();
	}

}
