package condicionales;

import java.util.Scanner;

public class Condicionales2_HVR {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par
		//o impar.


	    int numero;
	 // Solicitud de datos al usuario
	    Scanner entrada = new Scanner(System.in);
	     System.out.println("Este codigo identifica si un número es par o impar.");
	     System.out.print("Introduce un número: ");
	     numero = entrada.nextInt();
	     
		     if (numero % 2 == 0){
	         System.out.println("El número, " +numero + " es par.");
	     }else {
	         System.out.println("El número " +numero + " es impar.");
	     }  
	   }
	 }
