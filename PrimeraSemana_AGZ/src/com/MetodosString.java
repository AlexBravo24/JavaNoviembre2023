package com;

public class MetodosString {

	public static void main(String[] args) {
		//Metodos o funcionalidades de la clase string
		//Declarar una cadena de texto que nos servira como ejemplo
		String cadena = "Hoy es 21 de Noviembre de 2023";
		
		//.lenght()- devolver en valor entero
		//el tama�o de nuestra cadena de texto
		System.out.println(cadena.length());
		
		//otro metodo: .charAt() - devuelve el caracter
		//encontrado en la posicion en la que indiquemos
		
		System.out.println(cadena.charAt(29));
		//imprimiendo el primer caracter
		System.out.println(cadena.charAt(0));
		
		//si no conociera la longitud del string
		//syso(cadena.charAt(30-1);
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring()- devuelve el valor de una subcadena a partir
		//del indice especificado
		System.out.println(cadena.substring(5));
		
		System.out.println(cadena.substring(7, 28));
		
		//.toLowerCase()/ .toUpperCase()
		//Convertir la cadena a MAYUSCULAS o minusculas
		
		System.out.println(cadena);
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//Metodo .equals()- compara el valor de un String contra oto
		System.out.println(cadena.equals("hoy es lunes"));
		
		System.out.println(cadena.equals("Hoy es 21 de Noviembre de 2023"));
		
		//.equalsIgnoreCase() - compara el valor entre 2 strings,
		//y devuelve true cuando son iguales ignorando si son mayusculas o minusculas
		
		System.out.println(cadena.equalsIgnoreCase("hoy es 21 de NOVIEMBRE DE 2023"));
		
		//.replace()- remplazar las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println(cadena.replace("2023", "2024"));
		
		System.out.println(cadena.replace("e", "#"));
		System.out.println(cadena.replace(" ", "_"));
		System.out.println(cadena.replace(" ", ""));
	}

}
