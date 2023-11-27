package condicionales;

import java.util.Scanner;

public class Condicionales9_VSA {

	/*9.
	Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a 
	correspondiente.
	Si introducimos otro n�mero nos da un error.
	*/

	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int dia;

	// Solicitud de datos al usuario
	    System.out.println("Selecciona el d�a de la semana, escribe su n�mero del 1 al 7:");
	    dia = entrada.nextInt();

	// Realizamos comparaciones y mostramos el resultado
	    switch (dia) {
	    case 1:
	      System.out.println("El d�a seleccionado es LUNES");
	      break;
	    case 2:
	      System.out.println("El d�a seleccionado es MARTES");
	      break;
	    case 3:
	      System.out.println("El d�a seleccionado es MI�RCOLES");
	      break;
	    case 4:
	      System.out.println("El d�a seleccionado es JUEVES");
	      break;
	    case 5:
	      System.out.println("El d�a seleccionado es VIERNES");
	      break;
	    case 6:
	      System.out.println("El d�a seleccionado es S�BADO");
	      break;
	    case 7:
	      System.out.println("El d�a seleccionado es DOMINGO");
	      break;
	    default:
	      System.out.println("ERROR: n�mero incorrecto.");
	    }
	  }
	}
