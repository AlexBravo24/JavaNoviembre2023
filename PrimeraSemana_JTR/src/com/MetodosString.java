package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase String
		//.length() devuelve valor entero del largo de la cadena de texto
		String cadena="Hoy es 21 de noviembre de 2023";
		System.out.println(cadena.length());
		
		// .charAt() devuelve el caracter encontrado en la
		//posicion indicada
		
		System.out.println(cadena.charAt(29));
		
		System.out.println(cadena.charAt(0));
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//,substring() - Devuelve el valor de una subcadena
		// a partir del valor del indice indicado
		
		System.out.println(cadena.substring(5));
		
		System.out.println(cadena.substring(7, 28));
		
		//.toLowerCase() / .toUpperCase
		//Convertir la cadena de texto a MAYUSCULAS o minusculas
		
		System.out.println(cadena);
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
		
		//.equals - Permite comparar el valor de un String con otro
		//devolviendo un valor boolean
		
		System.out.println(cadena.equals("Hoy es 21 de noviembre de 2023"));
		
		// .equalsIgnoreCase() - compara dos cadenas y verifica si son iguales
		//ignorando el uso de mayusculas o minusculas
		
		System.out.println(cadena.equalsIgnoreCase("hoy es 21 de noViembre de 2023"));
		
		//.replace() - reemplazar las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println(cadena.replace("2023", "2024"));
		System.out.println(cadena.replace("e", "$"));
		System.out.println(cadena.replace(" ", "_"));
		System.out.println(cadena.replace(" ", ""));
	}

}
