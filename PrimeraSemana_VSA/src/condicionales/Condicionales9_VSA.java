package condicionales;

import java.util.Scanner;

public class Condicionales9_VSA {

	/*9.
	Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
	correspondiente.
	Si introducimos otro número nos da un error.
	*/

	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int dia;

	// Solicitud de datos al usuario
	    System.out.println("Selecciona el día de la semana, escribe su número del 1 al 7:");
	    dia = entrada.nextInt();

	// Realizamos comparaciones y mostramos el resultado
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
