package ciclos;

import java.util.Scanner;

public class ciclos2_VRDV {

	public static void main(String[] args) {
		
		
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
//		introducido desde teclado, hasta la iteración deseada por el usuario. 
//		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		int numero;
		int itera;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce un numero para multiplicar");
		
		numero = scn.nextInt();
		
		System.out.println("ahora introduce hasta que numero lo quieres multiplicar ");
		
		itera = scn.nextInt();
		
		scn.close();
		
		for (int i = 0; i < itera; i++) {
			
			
			
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
			
		}

	}

}
