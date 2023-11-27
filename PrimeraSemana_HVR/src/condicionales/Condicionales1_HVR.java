package condicionales;

import java.util.Scanner;

public class Condicionales1_HVR {

	public static void main(String[] args) {
		// // Realiza un programa que reciba dos numeros por teclado 
		// e indique cual es mayor o si son iguales
		
		//Ingresar el primer digito
		
		int x = 0;
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Introduce un primer numero");
		x = entrada.nextInt();
		
		//Ingresar el segundo digito		
				
		int y;
		System.out.println("Introduce un segundo numero");
		y = entrada.nextInt();
		
		entrada.close();
		
		if (x>y) {
			System.out.println("Primer digito es mayor");
		}else if (x<y){
			System.out.println("El segundo digito es mayor");
		}else {
			System.out.println("Los dos numeros son iguales");
		}
	
	}

}


	
