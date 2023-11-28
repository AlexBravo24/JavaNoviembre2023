package ciclos;

import java.util.Scanner;

public class Ciclos3_MVA {

	public static void main(String[] args) {
		//Realiza un programa para determinar si un String es palíndromo
		
		String frase;
		String sCadenaInvertida= "";
		Scanner entrada = new Scanner (System.in);
		
		frase = entrada.nextLine();
		
		
		for (int i = frase.length()-1; i>=0 ; i--) {
			sCadenaInvertida = sCadenaInvertida + frase.charAt(i);
		}

//		StringBuilder sb = new StringBuilder(frase); // creamos un stringbuilder
//		// que contiene string frase
//
//		String sCadenaInvertida= sb.reverse().toString();
//		// creo una cadena invertida usando el metodo .reverse de stringbuilder y 
//		// lo convierto a cadena con .toString ()
		
		sCadenaInvertida = sCadenaInvertida.replace(" ", ""); //quito espacios
		frase = frase.replace(" ", "");// a ambas cadenas (original y reverse)
		
		
		if(frase.equalsIgnoreCase(sCadenaInvertida)) {//comparo si son iguales
			System.out.println("La frase es un palindromo");
		
		}
		else {
			System.out.println("La frase no es un palindromo");
		}
	}

}
