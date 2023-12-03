package condicionales;

import java.util.Scanner;

public class Condicionales2 {

	public static void main(String[] args) {
		// 2 Realiza un programa que pida un número por teclado y nos indique si es par
		//o impar.

     Scanner teclado = new Scanner(System.in);
     
     int n;
     
     System.out.print("Ingresar el numero a evaluar: ");
     
     n = teclado.nextInt();
     
     if (n % 2 == 0 ) {
    	 System.out.println(n+" numero par." );
    	 
     }else {
    	 System.out.println(n+" numero inpar. ");
     }
	}

}
