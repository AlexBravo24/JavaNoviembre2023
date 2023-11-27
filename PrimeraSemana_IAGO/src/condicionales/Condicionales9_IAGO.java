package condicionales;

import java.util.Scanner;

public class Condicionales9_IAGO {

	public static void main(String[] args) {
		
		// 7. Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
		// Si introducimos otro número nos da un error.
		
		Scanner scanner = new Scanner(System.in);
	    int dia;
	// Solicitud de datos al usuario
	    
	    System.out.println("1.- Lunes.");
	    System.out.println("2.- Martes.");
	    System.out.println("3.- Miércoles.");
	    System.out.println("4.- Jueves.");
	    System.out.println("5.- Viernes.");
	    System.out.println("6.- Sábado.");
	    System.out.println("7.- Domingo.");
	    dia = scanner.nextInt();
	// Se realiza el procedimiento para saber dia 
	    switch (dia) {
	    case 1:
	      System.out.println("El día seleccionado es LUNES");
	      break;
	    case 2:
	      System.out.println("El día seleccionado es MARTES");
	      break;
	    case 3:
	      System.out.println("El día seleccionado es MIÉRCOLES");
	      break;
	    case 4:
	      System.out.println("El día seleccionado es JUEVES");
	      break;
	    case 5:
	      System.out.println("El día seleccionado es VIERNES");
	      break;
	    case 6:
	      System.out.println("El día seleccionado es SÁBADO");
	      break;
	    case 7:
	      System.out.println("El día seleccionado es DOMINGO");
	      break;
	    default:
	      System.out.println("ERROR: número incorrecto.");
	    }

	}

}
