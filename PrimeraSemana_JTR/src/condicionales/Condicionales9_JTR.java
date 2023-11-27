package condicionales;

import java.util.Scanner;

public class Condicionales9_JTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero:");
		num=entrada.nextInt();
		entrada.close();
		
			switch (num) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Lunes");
				break;	
			case 3:
				System.out.println("Martes");
				break;	
			case 4:
				System.out.println("Miercoles");
				break;	
			case 5:
				System.out.println("Jueves");
				break;	
			case 6:
				System.out.println("Viernes");
				break;	
			case 7:
				System.out.println("Sábado");
				break;		
			default:
				System.out.println("Error! Número no válido");
				break;
			}
			
		
	}

}
