package com;

public class MetodosString {

	public static void main(String[] args) {
		// METODOS O FUNCIONALIDADES DE LA CLASE STRING
		//Declarar una cadena de texto que nos servirá como ejemplo
		String cadena = "Hoy es 21 de noviembre de 2023";
		// METODO .lenght() - devolver en valor entero el tamaño de nuestra cadena de texto
		//syso(30);
		System.out.println(cadena.length());
		
		/*METODO .charArt() -devuelve el caracter
		 * encontrado en la posición en la que indiquemos
		 */
		System.out.println(cadena.charAt(29));
		
		//imprimiendo el primer caracter
		System.out.println(cadena.charAt(0));
		//si no conociera la longitud del string
		//syso(cadena.charAt(30-1);
		System.out.println(cadena.charAt(cadena.length()-1));
		
		
		/*METODO .substring() -devolver el valor de una subcadena
		 * a partir del indece especificado
		 */
		System.out.println(cadena.substring(5));
		
		System.out.println(cadena.substring(7, 28));
		
		/*METODO .toLowerCase ()/ .toUperCase -
		 * Convertir completamente a MAYUSCULAS O minusculas
		 */
		System.out.println(cadena);
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		/*METODO .equals() - comparar el valor de un string contra otro
		 */
		System.out.println(cadena.equals("Hoy es lunes"));
		
		System.out.println(cadena.equals("hoy es 21 de noviembre de 2023"));
		
		System.out.println(cadena.equals("Hoy es 21 de noviembre de 2023"));
		
		/*METODO .equalsIgnoreCase() - compara el valor entre dos strings,
		 * y devuelve true cuando son iguales, ignorando el uso de 
		 * mayusculas
		 */
		System.out.println(cadena.equalsIgnoreCase("Hoy es 21 de noViembre de 2023"));
		
		/*METODO .replace() -reemplaza las apariciones de un texto o caracter
		 * con otro que indiquemos
		 */
		System.out.println(cadena.replace("2023", "2024"));
		
		System.out.println(cadena.replace("e", "$"));
		
		System.out.println(cadena.replace(" ", "_"));
		
		System.out.println(cadena.replace(" ", ""));
		

	}

}
