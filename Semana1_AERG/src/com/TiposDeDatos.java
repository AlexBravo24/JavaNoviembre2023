package com;

public class TiposDeDatos {
	
	/*metodo main: es el punto de entrada principal
	 * para la execuncion de un programa.
	 * todo lo que este declarado dentro de el se ejecutara
	 *  */
	
	public static void main(String[] args) {
		
		
		byte numero1; //declaracion de variable sin asinar
		
		numero1 = 127; //asignando valos a la variable
		
		numero1 = 120; //sustituimos el valor anterior de l avariable
		
		byte numero2 = 110; //declaracion de variable con valor inicial
		
	
		//tipos de variables
		//Datos primitivos enteros: Los datos primitimos solo almacenana 
		
		byte by = 110; // tamaño: 1byte, rango: -128 a 127
		
		short sh = 32755; // tamaño: 2bytes, rango: -32768 a 32767
		
		int i = 21477545; //tamaño: 4bytes, rango: -
		
		long l = 21227568454L; //tamaño: 8bytes, rango;
		// la variable long requiere el sufijo "L" cuando exede el valor maximo de una int.
		
		//Datos primitivos decimales:
		
		float f = 900.054545454F; //tamaño 4bytes, requiere sufija F al final
		
		/*Tipos de datos primitivos
		 * Booleanos
		 * Caracter
		 */
		boolean evalua = true; //solo admite dos valores: verdadero o falso
		char caracter = 'a'; //Puede contener solo un caracter
				
		
		
	/*TIPO DE DATOS NO PRIMITIVOS 
	 * ESTRUCTURADOS
	 * OBJETO
	 * REFERENCIALES
	 * 
	 * Son datos en su malloria declarados por el usuario y por parte de java
	 * principalmente String y Wrapper. No solo almacenan datos 
	 * sino que tambien se consideran clases
	 */
		
		//String = Cadena de texto
		String cadena = "hola mundo";
		
		//Wrapper = Envoltorio
		/*Son clases que envuelven a la vatiable primitivas
		 * y otorga otras funciones, metodos o comportamientos
		 * Para ser Wrapper las variable se declaran con Mayuscula
		 * al principio
		 */
		Byte numeroBy = 123;
		Short numeroSh = 3000;
		Integer numareoI = 456546545;
		Long nuemroL = 200000000000000L;
		Double numeroD = 555.55;
		Float numeroF = 4455.22F;
		Character simbolo = '$';
		
		//ejsmplo:
		numeroBy.byteValue();//agragamos un metodo a numerBY
		//si utilizaramos una variable simple esto no seria posible
	
		/*
		 * Para darle salida en consola a nuestros datos
		 * utilizamos la linea: System.out.println
		 * sele debe dar salida a datos especifico 
		 */
		System.out.println(cadena);
		/*
		 * para correr una clase en especifico puedes usar click derecho
		 * sobre la clase y seleccionar Run As
		 */
		System.out.println("Angel Rosario");
		//atajo para System.out.println
		// syso + Ctrl + Espacio
		System.out.println();
		//Podemos imprimir una suma directamente a la consola 
		System.out.println(4+5);
		// Tambien podemos concatenar, que es unir valores sin sumarlos
		System.out.println("la suma de 4 + 6 es : "+ (4+6) );
	}//cierre del main

}//cierr de la clase 
