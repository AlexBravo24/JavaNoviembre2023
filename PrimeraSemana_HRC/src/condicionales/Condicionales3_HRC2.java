package condicionales;

import java.util.Scanner;

public class Condicionales3_HRC2 {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado
		// de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		double num1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		num1 = entrada.nextInt();
		
		double num2;
		entrada.nextLine(); //Consumir espacio volando
		System.out.println("Introduce otro numero:");
		num2 = entrada.nextInt();
		
		entrada.close(); // Cerrar scanner para ahorrar memoria
		
		if (num2 == 0 ) {
			System.out.println("Error");
		}
		else {
			double div = (num1 / num2);
			System.out.println("El resultado de la division es " + div);

		}
		

	}

}
