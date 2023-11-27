package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Metodos o funcionalidades de la clase String 
		
		// Declarar una cadena de texto que servira como ejemplo
		
		String cadena = "Hoy es 21 de noviembre";
		// de vuelve en valor entero la cadena de texto
		System.out.println(cadena.length());
		
		/*.charAt() - devuelve el caracter encontrado*/
		System.out.println(cadena.charAt(21));
		System.out.println(cadena.charAt(cadena.length()-6));
		
		/*.substring()- devolver el valor de una subcadena
		 * apartir del indice especificado*/
		
		System.out.println(cadena.substring(6));
		System.out.println(cadena.substring(6, 16));
		
		/*.toLowerCase() -- .toUpperCase*/
		// minusculas o mayusculas
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		/*metodo .equals()  - comparar el valor de string contra otro */
		System.out.println(cadena.equals("Hoy es martes"));
		System.out.println(cadena.equals("Hoy es 21 de noviembre"));
		
		//.equalsIgnoreCase() - compara el valor entre 2 strings
		//y devuelve true cuando son iguales, ignorando el uso
		//de mayusculas y minusculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 21 de noviembre"));
		
		//Metodo .replace() - reemplaza las apariciones de un textoo caracter
		//con otro que indiquemos
		
		System.out.println(cadena.replace("21", "25"));
		System.out.println(cadena.replace("e", "x"));
		System.out.println(cadena.replace(" ", "_"));
		
	}

}
