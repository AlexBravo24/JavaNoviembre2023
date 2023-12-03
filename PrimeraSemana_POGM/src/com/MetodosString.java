package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// Metodos o funcionalidades de la clase String
		
		//Declarar una cadena de texto que nos servira
		//como ejemplo
		String cadena = "Hoy es 21 de Nobiembre del 2023";
		
		//.lenght() - devolver en valor entero
		// el tamaño de nuestra cadena de texto
		//Syso(30);
		System.out.println(cadena.length());
		int longitud = cadena.length();
		
		//.charAt() - devuelve el cararcter encontrado en la posicion
		//en la posicion en la indiquemos
		//Ejemplo imprimiendo en conzola el ultimo caracter
		//cuando la longitud del String (31)
		
		System.out.println(cadena.charAt(29));
		//Ejemplo imprimiendo el primer caracter
		System.out.println(cadena.charAt(0));
		
		//sino conociera la longitud del string
		//Syso(cadena.charAt(30-1);)
		System.out.println(cadena.charAt(cadena.length()-1));
		//.subtring() -devolver el valor de una subcadena
		//a partir del indice espesificado 
		System.out.println(cadena.substring(5));
	
		
		//.toLowerCase()/.toUpperCase()-
		//Convertir la cadena de texto completamente a 
		//MAYUSCULAS o minusculas 
		
		System.out.println(cadena);
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equeals() - comprar el valor de un String contra otro 
		System.out.println(cadena.equals("Hoy es lunes"));
		System.out.println(cadena.equals("Hoy es 21 de Noviembre de 2023"));
		System.out.println(cadena.equalsIgnoreCase("hoy es 21 de noViemBre de 2023"));
		//.replace() - remplaza las apariciones de texto 
		System.out.println(cadena.replace("2023","2024"));
		
		System.out.println(cadena.replace("e","$"));
		System.out.println(cadena.replace(" ","_"));
		System.out.println(cadena.replace(" ",""));
		

	}

}
