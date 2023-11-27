package ciclos;

import java.util.Scanner;

public class Ciclos2_AGZ {

	public static void main(String[] args) {
	/*2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
		introducido desde teclado, hasta la iteración deseada por el usuario. 
		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
	*/
		System.out.println("    Tabla de multiplicar");
		System.out.println("Ingresa el numero que quieres multiplicar");
		int x;
		int multi;
		int numero;
		Scanner entrada= new Scanner(System.in);
		x=entrada.nextInt();
		System.out.println("ahora ingresa las iteraciones que deseas");
		multi=entrada.nextInt();
		for (int i = 0; i <= multi; i++) {
			numero=i*x;
			System.out.println(x+" x "+ i+ " = "+ numero );
			
		}
		
		
	}

}
