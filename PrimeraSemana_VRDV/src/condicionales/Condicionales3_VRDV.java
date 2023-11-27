package condicionales;

import java.util.Scanner;

public class Condicionales3_VRDV {

	public static void main(String[] args) {
		
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error
		
		
		int num1;
		int num2;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¡Vamos a dividir!");
		
		System.out.println("Introduce el primer valor");
		
			num1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo valor");
		
			num2 = entrada.nextInt();
			
				entrada.close();
				
				if((num2) == 0) {
					
					System.out.println("ERROR");
				}
			
			System.out.println("el resultado de dividir " + num1 + " y " + num2 + " es " + (num1/num2));
		
			

	}

}
