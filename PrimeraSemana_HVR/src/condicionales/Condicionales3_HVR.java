package condicionales;

import java.util.Scanner;

public class Condicionales3_HVR {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos n�meros y muestre el resultado
		//de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error

	    int numerador;
	    int denominador;
	    
	    // Solicitud de datos al usuario
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Este codigo realiza la division entre dos n�meros:");
	    System.out.print("Introduce el primer n�mero: ");
	    numerador = entrada.nextInt();
	    System.out.print("Introduce el segundo n�mero: ");
	    denominador = entrada.nextInt();
	    
		if (denominador != 0){
	    System.out.println((double)numerador/(double)denominador);
	    }else {
	    System.out.println("El segundo n�mero introducido es 0. "
	            + "Reinicie el programa e introduzca un valor v�lido.");
	    }  
	  }
	}