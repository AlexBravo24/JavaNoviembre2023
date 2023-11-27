package com;

public class TiposDeDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//metodo main
		// main es el punto de entrada principal para lae ejecución de un programa
		// todo lo que este declaradado dentro de el, el sistema
		// va a buscar este metodo y lo ejecutara
		
		// Ctrl S para guardar cambios 
		
		// declarar los tipods de datos
		
		// tipos de datos primitivos (numericos enteros)
		
		// ejemplo de delcarar un valor de tipo byte sin valor assignado
		
		byte numero1; 
		
		// mas adelante podemos asiganar un valor a esta variable
		// unicamente llamandola por su nombre
		numero1=127;
		
		// hasta este momento numero 1 vale 127, si se a asigna  otro valor
		
		numero1=120; 
		// ahora vale 120
		
		// recordar que el codigo se va leyendo linea por linea
		
		//-------------declarar variable con valor asignado inidicalmente 
		
		byte by = 110;  // byte emplea 1 byte de memoria y contiene valores de -128 a 127
		short sh = 32767; // emplea 2 bytes de memoria 
		//usa valores de -32760 a 32767
		int i = 2147483647;// emplea  4 bytes de memoria
		long largo = 21474836479L;
		// necesita el sufijo "L" para guardar valores mas altos que  la variable int
		
		// l Variable mas utilizada es la tipo int
		
		// tipos de datos primitivos 
		// numericos en punto o coma flotante(decimal)
		
		float flotante = 9000.78f;// emplea 4 bytes de memoria
		
		double decimal= 3.1416184654; // emplea 8 bytes, sin sufijo
		
		// la variable mas utilizada es double para el caso de los decimales 
		
		
		/* tipos de datos primitivos
		 * booleanos
		 * caracter
		 */
		
		boolean evalua = true;
		// son utiles para evaluar condiciones o expresiones
		
		char caracter = 'a'; // puede contener un solo caracter
		// y se asigna su valor entre comillas simples
		
		
		/* TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * TIPOS DE DATOS DE OBJETOS
		 * TIPOS DE DATOS REFERENCIALES
		 * 
		 * encontramos los declarados por el usuario, entre otros
		 *por parte de JAva encontramos principalmente los sting
		 * y wrapper
		 *
		 */

		
		// String - cadena de texto, String empieza con mayuscula como no es primitivo
		
		String cadena = "Hola generación 158";
		
		// wraper son los que "envuelven" a los primitivos
		// para otorgarle  otra funcionalidad o comportambiento
		
		Byte numeroByte = 10;
		Short numeroshort = 3000;
		Integer numeroInt = 2000000000; // el wrapper de int es integer
		Long numeroLong = 22222222200000L;
		Double numberoDouble =22.89;
		Character simbolo = 's'; // el wrapper de char es character
		
		// la diferencia entre los primitivos y no primitivos
		// si llamo a la variable y pongo . 
		// al estar contenido en una clase wrapper, podemos agregarle otros metodos
		
		cadena.chars();
		
		/* 
		 * los datos no primitivos 
		 * son clases, las cuales proporciones otros metodos
		 * a nuestras variables.
		 */
		
		// para darle salida en sonsola a nuestros datos
		// utilizamos la linea System.printLn
		
		// puedo darle salida a un dato especifico, es decir una variable
		System.out.println(cadena);
		// a parte del boton de play puedo darle click izquierdo y uso run class
		
		
		
		//puedo imprimir directamente una cadena de texto sin guardarla
		// antes en una variable
		System.out.println("rafael dominguez vargas");
		
		System.out.println(4+6);
		
		//concatenacion - unir los valores sin sumarlos, ya sea uniendo texto
		//texto y numeros, por ejemplo
		System.out.println("la suma es " + (4 + 6)); // usa parenc+tesis para que se sumen 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//cierre del main
	
}// cierre de la clase
