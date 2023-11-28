package com;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cadena = "Hoy es 21 de Noviembre 2023";
// .lenght () devolver valor entero 
// el tamaño de nuestra cadena de texto
System.out.println(cadena.length());
// .charAt () devuelve el caracter encontrado 
// en la posicion que le indiquemos
//ejemplo imprimiendo en consola el ultimo caracter cuando conozco la longitud del string 
//ejemplo imprimiendo el primer caracter
System.out.println(cadena.charAt(0));
//syso(cadena.chart(30-1);
System.out.println(cadena.charAt(cadena.length()-1));
//substring() devolver el valor de una subcadena 
//apartir de un indice especificado
System.out.println(cadena.substring(5));
System.out.println(cadena.substring(7, 27));
//.toLowerCase() /. toUpperCase
// Convertir la cadena de texto completamente a mayusculas o minusculas
System.out.println(cadena);
System.out.println(cadena.toLowerCase());
System.out.println(cadena.toUpperCase());
//metodo Equals () comparar el valor de un String con otro 
System.out.println(cadena.equals("Hoy es lunes"));
System.out.println(cadena.contentEquals("Hoy es 21 de Noviembre 2023"));
//equalisignorecase() copara valores entre dos strings ignorando mayusculas o minusculas
System.out.println(cadena.equalsIgnoreCase("hoy es 21 de noviembre 2023"));
// metodo .replace() remplazar las apariciones de un texto o caracter con otro que indiquemos
System.out.println(cadena.replace("2023", "2024"));
System.out.println(cadena.replace("e", "$"));
System.out.println(cadena.replace(" ", ""));









}

}
