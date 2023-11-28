package condicionales;

import java.util.Scanner;

public class Condicionales1_PRC {

	public static void main(String[] args) {
		
		
		// Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales.
		
		int x ;
		int y ;
		
		Scanner numeros =new Scanner(System.in);
		
		System.out.println("ingresa un numero");
		
		
		x=numeros.nextInt();
		
		System.out.println("ingresa otro numero");
		
		y= numeros.nextInt();
		
		if (x>y) {
			System.out.println("es mayor " + x);
		} if (y>x){
			System.out.println("es mayor " + y);
		} if( x==y ){
			System.out.println("es igual "+ x +" que "+ y);
		}
		
		numeros.close();
				

	}

}
