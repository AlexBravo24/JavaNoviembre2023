package com;

public class MetodosString {

	public static void main(String[] args) {
		// metodos o funcionabilidades de la clase String

		//declarar una cadena de texto que nos servira como ejemplo
		
		String cadena = "Hoy es 21 de Noviembre de 2023";
		
		//.length() - devolver en valor entero
		//el tamaño de nuestra cadena de texto
		System.out.println(cadena.length());
		
		//.charAt() - devuelve el caracter encontrado 
		//en la posicion en la que indiquemos
		//ejemplo imprimiendo en consola el ultimo caracter
		//cuando conosco la longitud
		System.out.println(cadena.charAt(29));
		//ejemplo imprimeindo el primer caracter
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring()-devolver el valor de una subcadenaa partir del indice espesificado
		
		System.out.println(cadena.substring(5));
		System.out.println(cadena.substring(7, 28));
		
		//.toLowerCase() / .toUpperCase()- convertela cadena de texto completamente a minusculas o MAYUSCULAS 
		
		System.out.println(cadena);
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals()- compara el valor de un String con otro String
		System.out.println(cadena.equals("hoy es lunes"));
		
		System.out.println(cadena.equals("Hoy es 21 de Noviembre de 2023"));
		
		//.equalsIgnoreCase()- comapra el valor de dos Strings  y devuelve true si son iguales ignorando 
		//las mayusculas o minusculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 21 de noViemBre de 2023"));
		
		//.replace ()- reemplaza las apariciones de un texto o caracter que le indiquemos
		
		System.out.println(cadena.replace("2023", "2024"));
		
		System.out.println(cadena.replace("e", "$"));
		
		System.out.println(cadena.replace(" ", "_"));
		
		System.out.println(cadena.replace(" ", ""));
		
	}

}
