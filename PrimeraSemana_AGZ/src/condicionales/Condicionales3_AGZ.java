package condicionales;

import java.util.Scanner;

public class Condicionales3_AGZ {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error
		Scanner entrada = new Scanner(System.in);//variable de la clase Scanner("system.in" pide las variables desde teclado)
		int x;  //variables
		int y;
		System.out.println("    DIVISION");
		System.out.println("Ingresa el Dividendo");
		x=entrada.nextInt();  // se asigna a variable x el primer dato ingresado
	    System.out.println("ingeresa el Divisor");
		y=entrada.nextInt(); // se asigna a variable x el segundo dato ingresado
		
		if (y==0) {  //se evalua si el segundo numero es 0 sino se ejecuta la division
			System.out.println("ERROR");
		} else {
			int resultado=x/y;
			System.out.println(x+" Entre "+y+" = "+resultado);
		}
		
	}

}
