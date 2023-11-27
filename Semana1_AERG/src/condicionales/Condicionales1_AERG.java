package condicionales;

import java.util.Scanner;

public class Condicionales1_AERG {

	// EJERCICIO 1. Realiza un programa que reciba dos números  
	//				por teclado e indique cuál es mayor o si son iguales.
	
	public static void main(String[] args) {
		
		int X; //en esta variable se guarda el primer numero
		int Y; //en esta variable se guarda el segundo numero
		
		Scanner num = new Scanner (System.in); //iniciamos scanner con nombre num
		
//------------------------------------------------------------------------------------------------------------------------------		
		System.out.println("Digite el primer numero..."); //Escribimos en la consola la instruccion
		
		X = num.nextInt();// guardamos el numero digitado en la consola en la variable X
				
		System.out.println("Tu primer numero es: "+X); //Imprime un mesaje con el numero guardado en X		
//------------------------------------------------------------------------------------------------------------------------------		
		System.out.println("Digite el sugundo numero..."); //Escribimos en la consola la instruccion
		
		Y = num.nextInt();// guardamos el numero digitado en la consola en la variable Y
		
		System.out.println("Tu segundo numero es: "+Y); //Imprime un mesaje con el numero guardado en Y
//------------------------------------------------------------------------------------------------------------------------------		
		System.out.println("..."); //imprumimos ... en consola 
		
		if 		(X>Y) 	{System.out.println(X+" es mayar que "+Y);} // condicionas para X mayor que Y
		else if (X<Y) 	{System.out.println(Y+" es mayar que "+X);} // condicionas para Y mayor que X
		else 			{System.out.println(X+" y "+Y+" son iguales");} // condicional para cualquiel caso que no sea nunguno de los anteriores 
//------------------------------------------------------------------------------------------------------------------------------		
		num.close(); //Cerramos Scanner 
	}

}
