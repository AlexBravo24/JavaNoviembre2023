package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Metodos o funcionalidades de la clase string

		// declarar una cadena de texto que nos servira como ejemplo
		
		String cadena ="Hoy es 21 de Noviembre de 2023";
		
		System.out.println(cadena.length());
		//lenght devuelve el tamaño de nuestra cadena de texto
	
	
		//.charat () - devuelve el caracter encontrado
		// en la posicion deseada
		//string es un array de caracteres
		//ejemplo imprimiendo en consola el ultimo caracter
		// cuando conozco la longitud del string(30)
		System.out.println(cadena.charAt(29));
		
		System.out.println(cadena.charAt(0));
		
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//substring () - devolver el varlo de una sub cadena a partir del index
		//especificado
		
		System.out.println(cadena.substring(5));
		System.out.println(cadena.substring(7, 28)); // define hasta de donde a donde imprime la cadena
		
		
		//. toLowerCase ()  .toUpperCase()
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals () compara el valor de un string con otro
		
		System.out.println(cadena.equals("Hoy es lunes"));
		
		// .equalignore case() - compara el valor entre 2 strings,
		// y devuelve tru cuando son iguales ignorando las mayusculas
		
		System.out.println(cadena.equalsIgnoreCase("hoy es 21 de noviembre de 2023"));
		
		
		//.replace() - reemplaza las apariciones de un texto o caracter con otro
		
		System.out.println(cadena.replace("Noviembre", "Diciembre"));
		
		System.out.println(cadena.replace("e", "$"));
		
		//investigar mas metodos de strings
		
		
	}
	

}
