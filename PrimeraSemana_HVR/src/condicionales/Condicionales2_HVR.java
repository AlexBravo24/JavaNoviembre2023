package condicionales;

import java.util.Scanner;

public class Condicionales2_HVR {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero por teclado y nos indique si es par
		//o impar.


	    int numero;
	 // Solicitud de datos al usuario
	    Scanner entrada = new Scanner(System.in);
	     System.out.println("Este codigo identifica si un n�mero es par o impar.");
	     System.out.print("Introduce un n�mero: ");
	     numero = entrada.nextInt();
	     
		     if (numero % 2 == 0){
	         System.out.println("El n�mero, " +numero + " es par.");
	     }else {
	         System.out.println("El n�mero " +numero + " es impar.");
	     }  
	   }
	 }
