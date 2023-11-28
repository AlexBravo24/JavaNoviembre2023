package condicionales;

import java.util.Scanner;

public class Condicionales2_VSA {
        // 2.Realiza un programa que pida un número por teclado y nos indique si es par 
	   //o impar.
	
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    int numero;

	// Solicitud de datos al usuario
	    System.out.println("Este programa calcula si un número es par o impar.");
	    System.out.print("Introduce un número: ");
	    numero = scanner.nextInt();
	    
	// Realizamos Cálculos y mostramos en pantalla
	    if (numero % 2 == 0){
	        System.out.println("El número, " + numero + " es par.");
	    }else {
	        System.out.println("El número " + numero + " es impar.");
	    }  
	  }
	}

