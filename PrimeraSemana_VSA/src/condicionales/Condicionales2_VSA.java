package condicionales;

import java.util.Scanner;

public class Condicionales2_VSA {
        // 2.Realiza un programa que pida un n�mero por teclado y nos indique si es par 
	   //o impar.
	
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    int numero;

	// Solicitud de datos al usuario
	    System.out.println("Este programa calcula si un n�mero es par o impar.");
	    System.out.print("Introduce un n�mero: ");
	    numero = scanner.nextInt();
	    
	// Realizamos C�lculos y mostramos en pantalla
	    if (numero % 2 == 0){
	        System.out.println("El n�mero, " + numero + " es par.");
	    }else {
	        System.out.println("El n�mero " + numero + " es impar.");
	    }  
	  }
	}

