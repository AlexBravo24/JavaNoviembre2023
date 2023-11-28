package condicionales;

import java.util.Scanner;

public class Condicionales9_AGZ {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
		//correspondiente. Si introducimos otro número nos da un error
		Scanner entrada = new Scanner(System.in);
		int dia;
		System.out.println("    Dias de la semana");
		System.out.println("Ingresa un numero del 1 - 7");
		dia = entrada.nextInt();
		entrada.close();//cierro el scanner para ahorrar memoria
		switch (dia) {  //utiliza un case para seleccionar entre la variable
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			
		default: System.out.println("ERROR");
			break;
		}
		

	}

}
