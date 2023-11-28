package condicionales;

import java.util.Scanner;

public class Condicionales7_VSA {
	
	/**
	7.
	El director de una escuela est� organizando un viaje de estudios, y requiere determinar
	cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio.
	La forma de cobrar es la siguiente: 
	*si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros; 
	*de 50 a 99 alumnos, el costo es de 70 euros, 
	*de 30 a 49, de 95 euros, 
	*y si son menos de 30, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de alumnos. 
	Realice un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe
	pagar cada alumno por el viaje.
	*/

	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int numeroAlumnos;

	// Solicitud de datos al usuario
	    System.out.println("Presupuesto para el viaje de estudios, de acuerdo a la cantidad de alumnos "
	        );
	    System.out.print("N�mero de alumnos: ");
	    numeroAlumnos = entrada.nextInt();

	// iniciando las condiciones
	    if (numeroAlumnos >= 100) {
	      System.out.println("El pago a la agencia es de " + numeroAlumnos*65 + " "
	          + "euros y cada alumno debe pagar 65 euros");
	    } else if (numeroAlumnos <100 && numeroAlumnos >= 50) {
	      System.out.println("El pago a la agencia es de " + numeroAlumnos*70 + " "
	          + "euros y cada alumno debe pagar 70 euros");
	    } else if (numeroAlumnos < 50 && numeroAlumnos >= 30) {
	      System.out.println("El pago a la agencia es de " + numeroAlumnos*95 + " "
	          + "euros y cada alumno debe pagar 95 euros");
	    } else {
	      System.out.println("El coste del autob�s es de 4000 euros y cada alumno "
	          + "debe pagar " + (4000/numeroAlumnos) + " euros.");
	    } 
	  }
	}
	
