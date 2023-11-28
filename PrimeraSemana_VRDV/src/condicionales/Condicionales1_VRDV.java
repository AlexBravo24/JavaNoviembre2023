package condicionales;

import java.util.Scanner;

public class Condicionales1_VRDV {

	public static void main(String[] args) {
		
		
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales.

		int num1;
		int num2;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el primer valor");
		
			num1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo valor");
		
			num2 = entrada.nextInt();
			
				entrada.close();
			
			if (num1 == num2 ){
				
				System.out.println("Los dos numeros son iguales");
				
			}else if (num1 > num2) {
				
				System.out.println("El primer valor es mayor");
				
			}else {
				
				System.out.println("El segundo valor es mayor");
				
			}
		

	}

}
