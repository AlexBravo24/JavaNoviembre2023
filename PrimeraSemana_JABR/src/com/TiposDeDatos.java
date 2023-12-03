package com;

public class TiposDeDatos {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	// Comentarios de una sola linea
		
	/*Comentarios de
	 * multiples
	 * lineas
	 * Los comentarios no interfieren con
	 * la ejecucion de codigo
	 * y asi podemos ir "documentando" nuestros programas
	 * 
	 */
	//M�todo Main
	//Es el punto de entrada principal para la ejecuci�n de un programa
	//Es decir, todo lo que est� declarado dentro de �l, el sistema
	//va a buscar este m�todo y lo ejecutar�
		
	//Para guardar cambios presionamos el atajo Ctrl + S
	
		
	//Declarar los tipos de datos
		
	//Tipos de Datos Primitivos (Num�ricos Enteros)
		
	//Ejemplo de declarar un tipo de dato byte, sin valor asignado
	
		byte numero1;
	
		//M�s adelante podemos asignar un valor a esta variable
		//unicamente llamandola por su nombre
		numero1=127;
	
		//Hasta este momento numero1 vale 127, si yo asigno posteriormente
		//otro valor, recordemos que en la programaci�n
		//todo el codigo se va leyendo linea por linea
		numero1=120;
		
		//Declarar variables pero con valores asignados inicialmente
		byte by = 110; //byte emplea 1 byte de memoria y puede contener
		//valores de -128 a 127
		short sh = 32767; //short emplea 2 bytes de memoria y puede
		//contener valores desde -32768 a 32767
		int i = 2147483647; //emplea 4 bytes de memoria
		long largo = 2147483650L; //emplea 8 bytes de memoria
		//y puede almacenar valores m�s alla de los int, siempre y cuando
		//se le agregue el sufijo "L"
		
		//La variable m�s utilizada (comod�n) es la de tipo int
		
		//Tipos de datos primitivos
		//Num�ricos en punto o coma flotante (decimales)
		
		float flotante = 900.7812345667F; //emplea 4 bytes de memoria
		
		double decimal = 3.141612878789; //emplea 8 bytes de memoria
		
		//La variable m�s utilizada es double en el caso de decimales
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos
		 * Caracter
		 */
		
		boolean evalua = true; //Solo admiten valores true o false
		//Son utiles al evaluar condiciones o expresiones
		
		char caracter = 'a'; //Pueden contener un solo caracter y asignamos
		//el valor del mismo entre comilla simple (' ')
		
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * TIPOS DE DATOS OBJETO
		 * TIPOS DE DATOS REFERENCIALES
		 * 
		 * Encontramos a los declarados por el usuario, entre otros
		 * y por parte de Java, encontramos principalmente a los String
		 * y Wrapper
		 * 
		 * Practicamente, los tipos de datos no primitivos
		 * son "clases", las cuales van a proporcionarnos m�todos
		 * y otras funcionalidades en nuestras variables
		 * 
		 */
		
		//String - Cadenas de texto
		String cadena = "Hola Generacion 158";
		
		//Wrapper - Envoltorio
		//Son aquellas clases que van a "envolver" a los primitivos
		//y otorgarles otras funcionalidades o comportamientos
		Byte numeroByte = 127;
		Short numeroShort = 3000;
		Integer numeroInt = 20000000;
		Long numeroLong = 200000000000000L;
		Double numeroDouble = 300.89;
		Float numeroFloat = 689.56F;
		Character simbolo = '$';
		
		//Veamos la diferencia entre los primitivos y los no primitivos
		//Si llamo a mi variable numero1 que es de tipo byte
		//numero1., no ocurre nada, porque es un dato primitivo
		//Pero una vez contenido en su clase Wrapper, esta
		//puede otorgarle otros m�todos
		numeroByte.doubleValue();
		
		byte variable = 100;
		
		//Lo mismo ocurre con los tipos de dato String
		//Si llamo a mi variable cadena
		cadena.chars();
		
		//Para darle salida en consola a nuestros datos
		//utilizamos la linea System.out.println
		
		//Puedo darle salida a un dato especifico, es decir, una variable
		System.out.println(cadena);
		
		//Puedo imprimir directamente una cadena de texto sin guardarla
		//antes en una variable
		System.out.println("Jorge Alejandro Bravo Ramirez");
		
		//Atajo para escribir System.out.println
		//syso + Ctrl + espacio
		System.out.println();
		
		//Imprimir una suma de dos numeros directamente en una impresion
		//en consola
		System.out.println(4+6);
		
		//Concatenacion - unir los valores, sin sumarlos, ya sea uniendo
		//texto y numeros, por ejemplo
		System.out.println("La suma es " + (4+6));
		
	}//Cierre del main

}//Cierre de la clase
