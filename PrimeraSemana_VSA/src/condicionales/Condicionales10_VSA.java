package condicionales;

import java.util.Scanner;

public class Condicionales10_VSA {

	/*
	 * 10. Escribe un programa que pida un n�mero entero entre uno y doce e imprima
	 * el n�mero de d�as que tiene el mes correspondiente.
	 */

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int mes;

	// Solicitud de datos al usuario
	    System.out.println("Devoluci�n del n�mero de d�as seg�n el mes seleccionado: ");
	    mes =entrada.nextInt();

	
	    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
	      System.out.println("El mes seleccionado tiene 31 d�as");
	    } else if (mes ==2){
	      System.out.println("Febrero tiene 28 d�as");
	    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
	      System.out.println("El mes seleccionado tiene 30 d�as");
	    } else {
	      System.out.println("Error, el mes debe estar entre 1-12.");
	    } 
	  }
}
