package ciclos;

import java.util.Scanner;

public class Ciclos2_pogm {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero
		//introducido desde teclado, hasta la iteración deseada por el usuario.
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
Scanner num = new Scanner(System.in);
		
		
		
		
		int n;
		System.out.println ("----Ingresar el numero  ------");
		
		n = num.nextInt();
		
		if (n> 0) {
			
			for(int i = 1; i <= 95; i++) {
				System.out.println(n+ "por"+i+" es igual a: " +n*i);
			}

		}
		}
	}


