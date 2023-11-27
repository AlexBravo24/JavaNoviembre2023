package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {
		/*atajo para main:
		 * escribir main + ctrl + espacio + enter
		 */
		
		//comentarios de una sola linea
		
		/*comentarios de 
		 * multiples 
		 * lineas
		 * Los comentarios no interfieren 
		 * con la ejecución de codigo
		 * y así podemos ir "documentando"
		 * nuestros programas
		 */
		
		//main es el punto de entrada principal para la ejecución de un programa
		/*es decir, todo lo que esté declarado dentro de este metodo
		 * se ejecutará
		 */
		
		//para guardar cambios puchamos el atajo ctrl + S
		
		
		
		//Declarar los tipos de datos
		
		//Tipos de datos primitivos (Números Enteros)
		
		//ejemplo de declarar un tipo de dato byte, sin valor asignado
		
		byte numero1;
		/*mas adelante se podra asignar valor a esta variable
		 * unicamente llamandola por su nombre
		 */
		numero1=127;//recordar que los valores de byte son en el intervalo -128,127
		/*hasta este momento numero1 vale 127, 
		 * si yo asigno posteriormente otro valor, este cambiará
		 * recordemos que en la programación todo el código 
		 * se va leyendo linea por línea
		 */
		numero1=120;
		
		
		//DECLARAR VARIABLES CON VALORES ASIGNADOS INICIALMENTE
		byte by = 110; 
		
		short sh = 32767; //emplea dos bytes de memoria y puede contener valores desde -32768 a 32767
		
		int i = 2147483647; // emplea 4 bytes de memoria
		
		long largo = 2147483649L; //emplea 8 bytes de memoria y puede almacenar valores mas alla de los int
		                          //siempre y cuando se le agregue el sufijo "L"
		
		//La variable mas utilizada (comodin) es la de tipo int
		
		//TIPOS DE DATOS PRIMITIVOS NUMÉRICOS
		//EN PUNTO O COMA FLOTANTE (decimales)
		
		float flotante = 900.78F; //emplea 4 bytes de memoria
		
		double decimal = 3.141612878789; //emplea 8 bytes de memoria
		
		//la variable más utilizada es double en el caso de decimales
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos
		 * Caracter
		 */
		
		boolean evalua = true; //solo admite estos valores
		                       //son utiles al evaluar condiciones o expresiones
		char caracter = '/'; //espacio, letra o simbolo son válidos siempre y cuando sea entre comillas simples
		
		
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * TIPOS DE DATOS OBJETO
		 * TIPOS DE DATOS REFERENCIALES
		 * 
		 * Encontramos a los declarados por elñ usuario, entre otros
		 * y por parte de Java, 
		 * encontramos principalmente a los String y Wrapper.
		 * Practicamente, los tipos de datos no primitivos son 
		 * "clases"
		 */
		
		
		//STRING-cadenas de texto
		String cadena = "Hola Generación 158";
		
		/*WRAPPER -Envoltorio
		 * son aquellas clases que van a "envolver" a los primitivos
		 * y otorgarles otras funcionalidades o comportamientos, 
		 * siempre inician con mayúscula
		 */
		
		Byte numeroByte = 127;
		Short numeroShort = 3000;
		Integer numeroInt = 20000000; 
		Long numeroLong = 20000000000000L;
		Double numeroDouble = 300.89;
		Float numeroFloat = 689.56F;
		Character simbolo = '$';
		
		
		//veamos la diferencia entre los primitivos y no primitivos
		//si llamo a mi variable numero1 que es de tipo byte
		//numero1. (no ocurre nada porque es dato primitivo),
		//una vez contenido en su clase Wrapper, esta puede
		
		cadena.chars();
		
		/*SALIDA EN CONSOLA
		 * UTILIZAMOS LA LINEA
		 * System.out.println
		 */
		System.out.println(cadena);
		//Atajo para escribir el system: syso o sysout+ ctrl+espacio
		System.out.println("Hola mundo, ");
		System.out.println(); //deja linea en blanco
		System.out.println(4+6);
		
		/*funcion concatenación:
		 * unir valores, sin sumarlos,
		 * se pueden unir  texto o numeros, ejemplo:
		 */
		System.out.println("La suma es "+ 4+6);
	} //cierre del main
	
	
	
	

}//cierre de la clase
