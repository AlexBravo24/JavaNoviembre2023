package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// Métodos o funcionalidades de la clase String
		
		//Declarar cadena de texto que nos servirá
		//como ejemplo
		
		String cadena = "Hoy es 21 de Noviembre de 2023";
		
		//.lenght() - devolver en valor entero 
		//el tamaño de nuestra cadena de texto 
		//Syso(30)
		System.out.println(cadena.length());
		
		//charAt() - devuelve el caracter encontrado en la posicion
		//en la que indiquemos 
		//Ejemplo imprimiendo en consola el ultimo caracter 
		//Cuando conozco la longitud del String(30)
		System.out.println(cadena.charAt (29));
		
		//Ejemplo imprimiendo el primer caracter 
		System.out.println(cadena.charAt(0));
		
		//Si no conociera la longitud del String 
		//Syso (cadena.charAt (30-1);
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring () - devolver el valor de una subcadena
		//a partir del indice especificado 
		System.out.println(cadena.substring(5));
		
		System.out.println(cadena.substring(7, 28));

		//.toLowerCase()/.toUpperCase -
		//Convertir la cadena de texto completamente a
		//MAYUSCULAS o minusculas 
		System.out.println(cadena);
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals() - comparar el valor de un String contra otro
		System.out.println(cadena.equals("Hoy es lunes"));
		
		System.out.println(cadena.equals("Hoy es 21 de Noviembre de 2023"));

		//.equalsIgnoreCase() - compara el valor entre dos Strings,
		//y devuelve true cuando son iguales, ignorando el uso
		//de mayusculas o minusculas 
		System.out.println(cadena.equalsIgnoreCase("hoy es 21 de noviembre de 2023"));

		//.replace() - remplazar las apariciones de un texto o un caracter
		//con otro que indiquemos 
		System.out.println(cadena.replace("2023", "2024"));
		
		System.out.println(cadena.replace("e", "$"));
		
		System.out.println(cadena.replace(" ", "_"));
		
		System.out.println(cadena.replace(" ", ""));
		

	}

}
