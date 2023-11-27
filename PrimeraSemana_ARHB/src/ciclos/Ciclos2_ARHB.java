package ciclos;

import java.util.Scanner;

public class Ciclos2_ARHB {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
			
		int x;
		int y;
		int resultado;
		
		System.out.println("Ingresa la tabla que quieres realizar:");
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Ingresa hasta que numero deseas multipicar:");
		y = entrada.nextInt();
		entrada.close();
		
		for (int i = x; i < y+1; i++) {
			resultado = x * i;
			System.out.println(x + " * "+ i + " = " + resultado);
		}
	}

}
