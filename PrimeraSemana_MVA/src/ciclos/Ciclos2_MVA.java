package ciclos;

import java.util.Scanner;

public class Ciclos2_MVA {
	
	public static void main(String[] args) {
//		 Programa un algoritmo que realice la tabla de multiplicar de un numero 
//		 introducido desde teclado, hasta la iteración deseada por el usuario. 
//		 Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		float tabla;
		int lim;
		double res;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("que tabla de multiplicar desea: ");
		tabla = entrada.nextInt();
		System.out.println("hasta que numero desea multiplicarlo: ");
		lim = entrada.nextInt();
		
		for (int i = 0; i <= lim; i++) {
			res= tabla *i;
			System.out.println(i + " X " + tabla + " = " + res);
		}
		
		
	}

}
