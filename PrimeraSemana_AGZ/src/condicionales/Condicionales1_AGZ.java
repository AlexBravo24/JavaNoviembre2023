package condicionales;

import java.util.Scanner;

public class Condicionales1_AGZ {

	public static void main(String[] args) {
		//1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales
		Scanner datos = new Scanner(System.in); //variable de la clase Scanner ("system.in" pide las variables desde teclado)
		System.out.println("EJ 1. COMPARADOR DE NUMEROS");
		
		int x; //utilizamos dos variables para 
		int y; //guardar los numeros
		
		System.out.println("Ingresa un numero");  //pedimos al usuario que ingrese un numero
		x = datos.nextInt();    //guardamos el numero en variable x
		System.out.println("Ingresa otro numero");  // pedimos al us. que ingrese otro numero
		y = datos.nextInt();  //guardamos el numero en variable x
		
		datos.close();//cierro el scanner para ahorrar memoria
		if (x > y) {  //evaluamos las variables para ver si son mayor, menor o igual.
			System.out.println("El primer numero que ingresaste es mayor");
			System.out.println(x + " Es mayor que " + y);
			
		} else if (x < y) {
			System.out.println("El segundo numero que ingresaste es mayor");
			System.out.println(y +" Es mayor que " + x);
		} else {
			System.out.println("Los dos numeros que ingresaste son iguales");
		}

	}

}
