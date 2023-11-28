package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Metodos o funcionalidades de la clase String
		
		//Declarar una cade de texto que nos servira como ejemplo
		
		String cadena= "Hoy es 21 de Noviembre de 2023";
		
		//.length() = devover en valor entero 
		//el tamaño de nuestra cadena de texto
		System.out.println(cadena.length());
		
		//.chartAT () - devuelve el caracter encontrado
		// en la posicion en la que indiquemos 
		//Ejemplo imprimiendo en consola el ultimo caracter 
		//cuando conozcola longitud del String (30)
		System.out.println(cadena.charAt(29));
		
		//Ejemplo imprimeindo el primer caracter 
		System.out.println(cadena.charAt(0));
		
		//Si no conociera la longitud d4l String
		//Syso (cadena.charAT (30-1);
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring()= devolver el valor de una subcadena
		//a partir del indice especificado
		
		System.out.println(cadena.substring(5));
		
		System.out.println(cadena.substring(7,28));
		
		
		//.tolowercase()/.toUpperCase()= Convertir cadena de texto completamente a
		// MAYUSCULAS o minusculas
		
		System.out.println(cadena);
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		
		//.equals()= compara el valor de un String contra otro
		System.out.println(cadena.equals("Hoy es lunes"));
		System.out.println(cadena.equals("Hoy es 21 de Noviembre de 2023"));
		
		//.equalsIgnoreCase= compara el valor entre 2 strings,
		// y devuelve true cuando son iguales, ignorando el uso
		// de mayusculas o minusculas
		
		System.out.println(cadena.equalsIgnoreCase("hoy es 21 de noviembre de 2023"));
		
		//.replace()= reemplazar las apariciones de un texto o caracter por otro que indiquemos
		
		System.out.println(cadena.replace("2023", "2024"));
		
		System.out.println(cadena.replace("e", "$"));
		System.out.println(cadena.replace(" ", "_"));
		System.out.println(cadena.replace(" ", ""));

	}

}
