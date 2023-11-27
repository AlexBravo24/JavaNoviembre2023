package condicionales;

import java.util.Scanner;

public class Condicionales2_AGZ {

	public static void main(String[] args) {
		//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar	
		Scanner digito = new Scanner(System.in); //variable de la clase Scanner("system.in" pide las variables desde teclado)
		System.out.println("    ¿PAR O IMPAR?");
		int numero;    //variable donde se va a guardar el numero
		System.out.println("Digita un numero");
		numero = digito.nextInt();   //asignamos el digito tecleado (entero) a variable numero
		int residuo = numero%2; //sacamos el modulo para saber si es par o impar
		
		if (residuo==0) { //deccide si es par o no con el valor del residuo
			System.out.println("Ingresaste un numero par");
		} else {
			System.out.println("Ingresaste un numero impar");

		}
		

	}

}
