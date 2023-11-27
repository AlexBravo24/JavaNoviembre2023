package condicionales;

import java.util.Scanner;

public class Condicionale8_AGZ {

	public static void main(String[] args) {
		//Realiza un programa que pida por teclado el resultado (dato entero) 
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el número en 
		//letras (dato cadena) de la cara opuesta al resultado obtenido
		
		Scanner entrada = new Scanner(System.in);
		int dado;
		System.out.println("    Cara opuesta del dado");
		System.out.println("Ingresa el numero de la cara del dado");
		dado = entrada.nextInt();
		
		switch (dado) {  //utiliza un case para seleccionar entre la variable
		case 1:
			System.out.println("La cara opuesta es SEIS");
			break;
		case 2:
			System.out.println("La cara opuesta es CINCO ");
			break;
		case 3:
			System.out.println("La cara opuesta es CUATRO");
			break;
		case 4:
			System.out.println("La cara opuesta es TRES");
			break;
		case 5:
			System.out.println("La cara opuesta es DOS");
			break;
		case 6:
			System.out.println("La cara opuesta es UNO");
			break;
			
		default: System.out.println("ERROR: numero incorrecto");
			break;
		}
	}

}
