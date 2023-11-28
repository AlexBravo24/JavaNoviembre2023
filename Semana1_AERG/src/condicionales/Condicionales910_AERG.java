package condicionales;

import java.util.Scanner;

public class Condicionales910_AERG {
	
//	10.Realiza un programa que pida un número entero entre uno y doce e imprima 
//	el número de días que tiene el mes correspondiente.

	public static void main(String[] args) 
	{
		System.out.println("Que mes del año es del 1 al 12?...");
		
		Scanner scn = new Scanner(System.in);
		int mes = scn.nextInt();
		scn.close();
		
		System.out.print("Este mes tiene ");
		
		if (mes == 1 || mes == 3|| mes == 5|| mes == 7|| mes == 8|| mes == 10|| mes == 12) {System.out.println("31 días");} 
		else if (mes <=0 || mes >= 12) {System.out.println("Error");}
		else if (mes == 2) {System.out.println("28 o 29 días");}
		else {System.out.println("31 días");}
			
	}

}



//switch (mes) 
//{
//case 1:	System.out.println("Domingo");break;	
//
//case 2:	System.out.println("Lunes");break;		
//
//case 3:	System.out.println("Martes");break;		
//
//case 4:	System.out.println("Miercoles");break;		
//
//case 5:	System.out.println("Jueves");break;	
//
//case 6:	System.out.println("Viernes");break;	
//
//case 7:	System.out.println("Sabado");break;
//
//case 8:	System.out.println("Domingo");break;	
//
//case 9:	System.out.println("Lunes");break;		
//
//case 10: System.out.println("Martes");break;		
//
//case 11: System.out.println("Miercoles");break;		
//
//case 12: System.out.println("Jueves");break;	
//
//
//
//default:System.out.println("ERROR: número incorrecto");break;	
