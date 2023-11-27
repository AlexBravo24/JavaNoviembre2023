package com;

public class TiposDeDatos {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Este es el punto de entrada principal para la ejecucion de un programa
		//el cual sera el que siempre se va ejecutar.
		//guardar Ctrl + S
		
		byte numero1;
		
		//Mas adelante podemos asignar un valor a esta variable
		//unicamente llamandola por su nombre
		
		numero1 = 127;
		//Hasta este momento num1 vale 127, si yo asigno posteriormente
		// otro valor recordemos que en la programacion 
		// todo el codigo se va leyendo linea por linea
		numero1 = 120; 
		
		//declarar variables con valores asignados inicialmente
		byte by = 110; //byte emprea 1 byte de memeoria y puede contener 
		// valores de -128 al 127 
		
		short sh = 32767; // short; 2bytes; Valores de -32768 al 32767
		int i = 2147483647;  // 4bytes de memoria
		long largo = 2147483648L; //8bytes de memoria; puede almacenar valores 
		//mas alla de int agregando el sufijo "L, l"
		
		//La variable mas utilizada es la int (comodin)
		
		//TIPOS DE DATOS PRIMITIVOS NUMERICOS EN PUNTO O COMA FLOTANTE 
		//DECIMALES
		
		float flotante = 900.78f; //4 bytes; necesita el sufijo "f,F" 
		
		double decimal = 3.14151846374; //8 bytes; no necesita sufijo
		// la variable mas usada es la double
		
		//TIPOS DE DATOS PRIMITIVOS
		//BOOLEANOS 
		//CARACTER
		
		boolean evalua = true; //solo admiten valores true o false 
		//son utiles al evaluar condiciones o expresiones
		
		char letra ='a'; // pueden contener un solo caracter que
		//asignamos el valor del mismo entre comilla simple ( ' ' )
		
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * ESTRUCTURADOS
		 * OBJETO
		 * REFERENCIALES
		 * 
		 * Encontramos a los declarados por el usuario, entre otros
		 * y por otra parte de Java, encontramos principalmente a 
		 * los String y Wrapper  
		 * 
		 * Practicamente los tipos de datos no primitivos son "clases",
		 *  las cuales van a proporcionarnos acceder a metodos y otras 
		 *  funcionalidades en nuestras variables.
		 */
		
		//Sting - cadenas de texto
		String cadena = "hola gen 158";
		
		// Wrapper - Envoltorio
		//Son aquellas clases que van a "envolver" a los primitivos 
		// y otorgarles otras funcionalidades o comportamientos
		
		Byte num =127;
		Short numShort =3000;
		Integer numInt = 3450605;
		Long numLong =200000000000l;
		Float numf = 123.32f;
		Character sim = '$';
		
		//veamos la diferencia entre los primitivos y no primitivos 
		//si llamo a mi variable num1 que es de tipo byte 
		//numero1. , no ocurre nada, porque es un dato primitivo 
		//pero una vez contenido en su clase Wrapper, esta 
		//puede otorgarle otros metodos
		
		byte variable = 100; 
		//lo mismo ocurre con los tipos de dato String 
		//Si llamo a mi variable cadena
		cadena.chars();
		
		//para darle salida a los datos
		// utilizamos la linea System.out.println();
		
		//puedo darle salida a un dato especifico, es decir, una variable
		System.out.println(cadena);
		//puedo imprimir una cadena de texto sin guardarla 
		//antes un una variable
		System.out.println("HOLA MUNDO");
		
		
		
		
	} //cierre del main
}//cierre de la clase
