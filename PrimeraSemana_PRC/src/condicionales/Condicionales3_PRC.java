package condicionales;

import java.util.Scanner;

public class Condicionales3_PRC {

	public static void main(String[] args) {
		
		// Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner numeros = new Scanner(System.in);
		
		System.out.println("introduce un numero ");

		double numero1;
		numero1=numeros.nextDouble();
		System.out.println("introduce otro numero");
		
		double numero2;
		numero2=numeros.nextDouble();
		
		 if (numero2 ==0 ) {
			 System.out.println("ERORR");
		 }
		 double division= numero1/numero2;
		 
		 System.out.println("el resultado de la division es: " + division);
		 
		 numeros.close();

	}

}
