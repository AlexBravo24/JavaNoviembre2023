package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// METODOS O FUNCIONALIDADES DE LA CLASE STRING
		
		//declarar una cadena de texto como ejemplo
		String cadena = "Hoy es 21 de noviembre de 2023";
		//.lenght () - devuelve en valor entero 
		//tamaño de la cadena de texto
		
		System.out.println(cadena.length());
		
		//.charAt () - devuelve el caracter encontrado 
		// en la posicion que indiquemos
		// Ejemplo: imprimiendo en consola el ultimo caracter
		//cuando conozco la longitud del String (30)
		System.out.println(cadena.charAt(29));
		//Ejemplo: imprimiendo el primer caracter
		System.out.println(cadena.charAt(0));
		
		//si no conociera la longitud del String
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring () -devuelve el valor de una subcadena a partir
		//del indice especificado
		System.out.println(cadena.substring(5));
		
		System.out.println(cadena.substring(7,28));
		
		//toLowerCase() / toUpperCase
		//convertir completamente el texto a
		//MAYUSCULAS O minusculas
		
		System.out.println(cadena);
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals() - comparar el valor de un String contra otro
		System.out.println(cadena.equals("Hoy es lunes"));
		
		System.out.println(cadena.equals("Hoy es 21 de noviembre de 2023"));
		
		// .equalsIgnoreCase () - compara el valor entre dos cadenas
		//ignorando mayusculas y minusculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 21 de noviembre de 2023"));
		
		
		//.replace() - remplaza las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println(cadena.replace("2023", "2024"));
		System.out.println(cadena.replace("e", "$"));
		System.out.println(cadena.replace(" ", "_"));
		System.out.println(cadena.replace(" ", ""));
	}

}
