package condicionales;

import java.util.Scanner;

public class Condicionales9_VRDV {

	public static void main(String[] args) {
		
		// 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
		//correspondiente. Si introducimos otro número nos da un error.
		
		Scanner entrada = new Scanner(System.in);

		int dia;
		
		System.out.println("introduce un numero del 1 al 7");
		
		dia = entrada.nextInt();
		
		entrada.close();
		
		if (dia == 7) {
			
			System.out.println("Es Domingo");
			
		}
		else if (dia == 6) {
				
				System.out.println("Es Sabado");
				
			}
				
		else if (dia == 5) {
				
				System.out.println("Es Viernes");
				
			}
		else if (dia == 4) {
				
				System.out.println("Es Jueves");
				
			}	
		else if (dia == 3) {
				
				System.out.println("Es Miercoles");
				
			}
		else if (dia == 2) {
				
				System.out.println("Es martes");
				
			}
		else if (dia == 1) {
				
				System.out.println("es Lunes");
				
			}else {
				
				System.out.println("Error");
				
			}

	}

}
