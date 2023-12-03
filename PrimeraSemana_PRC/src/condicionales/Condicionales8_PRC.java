package condicionales;

import java.util.Scanner;

public class Condicionales8_PRC {

	public static void main(String[] args) {
		/* Realiza un programa que pida por teclado el resultado (dato entero) 
		obtenido al lanzar un dado de seis caras y muestre por pantalla el número en 
		letras (dato cadena) de la cara opuesta al resultado obtenido. 
		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se 
		mostrará el mensaje: “ERROR: número incorrecto”.
		*/
		
		Scanner dado= new Scanner(System.in);
		System.out.println("introduce un numero entre  1 y 6");
		String numeros= dado.nextLine();
		
		
		
		switch (numeros) {
		
		case "1":
			System.out.println(numeros.replace("1", "seis"));
			break;
		case "2":
			System.out.println(numeros.replace("2", "cinco"));
			break;
		case "3":
			System.out.println(numeros.replace("3", "cuatro"));
			break;	
		case "4":
			System.out.println(numeros.replace("4", "tres"));
			break;
		case "5":
			System.out.println(numeros.replace("5", "dos"));
			break;
		case "6":
			System.out.println(numeros.replace("6", "uno"));
			break;
		default:
			System.out.println("ERROR");
				
		}
		
		dado.close();

	}

}
