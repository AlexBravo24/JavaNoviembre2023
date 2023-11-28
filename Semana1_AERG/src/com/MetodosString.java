package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Metodos y funcionalidades del metodo string
		
		//Ejemplo con cadena de texto
		
		String cadena = "Hoy es 21 Nov 2023";//tiene 18 caracteres
		
		System.out.println("cadena: "+ cadena);
		
		//.length()  -  devuelve en entero el tamaño de nuestro texto
		System.out.println("tamaño de la cadena: " + cadena.length()); //imprime en consola el numero de caracteres

		
		//.charAt()  -  busca un caracter en espesifico de una cadena
		System.out.println("primer caracter: " + cadena.charAt(0)); // imprime el primer caracter 		
		System.out.println("ultimo caracter: " + cadena.charAt(17)); // imprime el ultimo caracter 
		
		//.substring - devuelve el valor de una parte de la cadena segun el indice espacificado
		System.out.println(cadena.substring(7)); //imprime la cadena posterior a los primeros 7 caracters
		System.out.println(cadena.substring(0,13)); //imprime la cadena entre los indices indicados
	
		//.toLowerCase() - Convierte todos los caracteres a minuscualas
		//.toUpperCase() - Convierte todos los caracteres a Mayus
		System.out.println(cadena.toLowerCase()); //conviete a minus
		System.out.println(cadena.toUpperCase()); // convierte a MAYUS
		
		//.equals()  -  comapara si dos String son exactamente iguales o no (icluyendo mayusculas y minusculas)
		System.out.println(cadena.equals("Hoy lunes es 1 Dic 2023")); // false
		System.out.println(cadena.equals("HOY ES 21 NOV 2023")); //false
		System.out.println(cadena.equals("hoy es 21 nov 2023")); //false
		System.out.println(cadena.equals("Hoy es 21 Nov 2023")); //true
		
		//.equalsIgnoreCase()  -  Compara dos Strings ignorando mayusculas y minusculas 
		System.out.println(cadena.equalsIgnoreCase("hoy es 21 nov 2023")); //true
		System.out.println(cadena.equalsIgnoreCase("HOY ES 21 NOV 2023")); //true
		
		//.replace()  -  remplasa una parte de la cadena que indiquemos por otro 
		System.out.println(cadena.replace("2023", "2024")); //remplaza 2023 por 2024
		System.out.println(cadena.replace("o", "0")); //remplaza o por 0
		System.out.println(cadena.replace(" ", "")); //remplaza espacio por nada  (borra espacios)
		
		//convertir un Strings a Int
		String dato ="300";
		int num = Integer.parseInt(dato);
		System.out.println(num*2);
	}

}
