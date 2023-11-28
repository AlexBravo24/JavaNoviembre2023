package condicionales;

import java.util.Scanner;

public class Condicionales3_HVR {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error

	    int numerador;
	    int denominador;
	    
	    // Solicitud de datos al usuario
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Este codigo realiza la division entre dos números:");
	    System.out.print("Introduce el primer número: ");
	    numerador = entrada.nextInt();
	    System.out.print("Introduce el segundo número: ");
	    denominador = entrada.nextInt();
	    
		if (denominador != 0){
	    System.out.println((double)numerador/(double)denominador);
	    }else {
	    System.out.println("El segundo número introducido es 0. "
	            + "Reinicie el programa e introduzca un valor válido.");
	    }  
	  }
	}