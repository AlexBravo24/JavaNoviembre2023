package condicionales;

import java.util.Scanner;

public class Condicionales1_VSA {

	    public static void main(String[] args) {
			
		// 1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es 
		//mayor o si son iguales
		
		    Scanner scanner = new Scanner (System.in);
		    int numero1;
		    int numero2;

		// Solicitud de datos al usuario
		    System.out.println("Este programa pide dos n�meros y calcula cual es mayor.");
		    System.out.print("Introduce el primer n�mero: ");
		    numero1 = scanner.nextInt();
		    System.out.print("Introduce el segundo n�mero: ");
		    numero2 = scanner.nextInt();
		    
		// Realizamos C�lculos y mostramos en pantalla
		    if (numero1 > numero2){
		        System.out.println("El primer n�mero: " + numero1 + ", es mayor que el n�mero dos," + numero2);
		    }else if (numero1 < numero2){
		        System.out.println("El segundo n�mero: " + numero2 + ", es mayor que el primer n�mero " + numero1);
		    }else {
		        System.out.println("Ambos n�meros son iguales: " + numero1);
		    }    
		  }
		}

