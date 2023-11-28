package ciclos;

import java.util.Scanner;

public class Ciclos2_PRC {
	
	public static void main(String[] args) {
		
		// Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("ingresa un numero para multiplicar");
		
		int num= entrada.nextInt();
		
		System.out.println("hasta que numero lo vas a multiplicar");
		
		int multiplo= entrada.nextInt();
		
		for (int i = 0; i <= multiplo; i++) {
			
			System.out.println(num + " * "+ i + "= " + (num*i));
			
		}
		
		entrada.close();
	}

}
