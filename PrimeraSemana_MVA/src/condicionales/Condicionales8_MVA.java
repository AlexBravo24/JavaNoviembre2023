package condicionales;

import java.util.Scanner;

public class Condicionales8_MVA {

	public static void main(String[] args) {
//		 Realiza un programa que pida por teclado el resultado (dato entero) 
//		 obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en 
//		 letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
//		 caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4. 
//		 Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se 
//		 mostrar� el mensaje: �ERROR: n�mero incorrecto�

		int res;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite el resultado del dado:");
		res= entrada.nextInt();	
		
		
		switch (res) {
		case 1:
			System.out.println("seis");
			break;
		case 2: 
			System.out.println("cinco");
			break;
		case 3: 
			System.out.println("cuatro");
			break;
		case 4: 
			System.out.println("tres");
			break;
		case 5: 
			System.out.println("dos");
			break;
		case 6: 
			System.out.println("uno");
			break;
		default:
			System.out.println("Digitaste un numero fuera del rango  ---ERROR---");
			break;
		}
	}

}
