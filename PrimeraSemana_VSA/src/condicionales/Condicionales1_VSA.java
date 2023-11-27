package condicionales;

import java.util.Scanner;

public class Condicionales1_VSA {

	    public static void main(String[] args) {
			
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales
		
		    Scanner scanner = new Scanner (System.in);
		    int numero1;
		    int numero2;

		// Solicitud de datos al usuario
		    System.out.println("Este programa pide dos números y calcula cual es mayor.");
		    System.out.print("Introduce el primer número: ");
		    numero1 = scanner.nextInt();
		    System.out.print("Introduce el segundo número: ");
		    numero2 = scanner.nextInt();
		    
		// Realizamos Cálculos y mostramos en pantalla
		    if (numero1 > numero2){
		        System.out.println("El primer número: " + numero1 + ", es mayor que el número dos," + numero2);
		    }else if (numero1 < numero2){
		        System.out.println("El segundo número: " + numero2 + ", es mayor que el primer número " + numero1);
		    }else {
		        System.out.println("Ambos números son iguales: " + numero1);
		    }    
		  }
		}

