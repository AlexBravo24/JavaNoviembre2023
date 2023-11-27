package com;

public class TiposDeDatos {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Se puede agregar comentario sencillo
		/*O tipo de comentario mas largo
		 * 
		 * */
		// no se puede repetir el nombre de la variable aunque sea distinto tipo de dato
		
		/*Rango de valor +-*/
		byte numero1;
		numero1 = 127;
		
		/*Rango de valor +-*/
		short decimalCorto;
		decimalCorto = 32727;
		
		/*Rango de valor +-, emplea solo 4 bytes de memoria*/
		int entero;
		entero = 2147483647;
		
		/*Rango de valor +-, emplea 8 bytes, se debe agregar L al final
		 * para definir el tipo de dato*/
		long enteroLargo;
		enteroLargo = 2147483650L;
		
		/*Numeros con punto decimal, valor de 4 bytes*/
		float numeroDecimal;
		numeroDecimal = 900.7812345667F;
		
		/*Numeros punto flotante mas largos, rango de 8 bytes*/
		double numdoble = 3.141612878789;
		
		/*Tipo de datos boolenos solo se puede emplear la palabra true o false*/
		// Utiles para evaluar condiciones o expresiones
		boolean evaluar = true;
		
		/*Tipo de dato caracter, puede ser espacio, letra o caracter especial*/
		//solo entre comillas simples
		char caracter = 'a';
		
		//TIPO DE DATO NO PRIMITIVO, se inicia con mayuscula ya que es un tipo de dato mas complejo
		//Requerido para almacenar cadenas de caracteres
		
		String cadena = "Hola generacion 158";
		
		/*WRAPPER,envoltorio, son aquellos que van a envolver a los primitivos 
		 * y otorgarles otras funcionalidades o comportamientos*/
		Byte numeroByte = 127;
		Short numeroShort = 3000;
		Integer numeroInt = 200000;
		Long numeroLong = 20000000L;
		Double numeroDouble = 300.25;
		Float numeroFloat = 689.25F;
		Character simbolo = '$';
		
		/*Si se llama el numero primitivo no pasa nada
		 * Pero si se pasa el llamado de un dato Wrapper aparecen varios metodos distintos 
		 * para ese tipo de dato 
		 * Se le agrega el punto para desplagar las funciones que contiene cada WRAPPER
		 * ejemplo- String. - despues del punto se despliega las funciones (metodos o comportamientos) */

		/*Se le puede dar salida a los datos en especifico */
		// syso ctrl+ espacio
		System.out.println(cadena); 
		System.out.println("Puede ser directa la cadena a imprimir");
		System.out.println("o una suma: "+ (4+6));
		
		
	}

}
