package condicionales;

import java.util.Scanner;

public class Condicionales9_AERG {

//	9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a 
//	correspondiente. Si introducimos otro n�mero nos da un error.
	
	public static void main(String[] args) 
	{
		System.out.println("Que dia de la semana es del 1 al 7?...");
		
		Scanner scn = new Scanner(System.in);
		int dia = scn.nextInt();
		scn.close();
		
		System.out.print("Hoy es ");
		
		switch (dia) 
		{
		case 1:	System.out.println("Domingo");break;	
		
		case 2:	System.out.println("Lunes");break;		
	
		case 3:	System.out.println("Martes");break;		
		
		case 4:	System.out.println("Miercoles");break;		

		case 5:	System.out.println("Jueves");break;	

		case 6:	System.out.println("Viernes");break;	
		
		case 7:	System.out.println("Sabado");break;
	

		default:System.out.println("ERROR: n�mero incorrecto");break;		
		}

	}

}
