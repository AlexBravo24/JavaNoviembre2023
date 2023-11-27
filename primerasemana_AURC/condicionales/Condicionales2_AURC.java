package condicionales;

import java.util.Scanner;

public class Condicionales2_AURC {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar
		int x;
		Scanner result = new Scanner(System.in);
		System.out.println("Ingresa un numero :");
		x = result.nextInt();
		result.close();
			if(x%2 == 0) {
				System.out.println("El numero ingresado es " + " " + x + " y es un numero par");
				}else{
					System.out.println("El numero ingresado es " + " " + x + " y  es un numero impar" );

					}
			return;
			}
	}


