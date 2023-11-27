package com;

public class TiposDeDatos {

	public static void main(String[] args) {
		// Es el punto de entrada principal para la ejecución de un programa
		// Todo lo que este declarado dentro de este método el sistema va buscar este método y lo ejecutará
		
		//Declarar los tipos de datos
		//Tipos de Datos primitivos (númericos enteros)
		
		// Ejemlo de declarar un tipo de dato byte, sin valor asignado
		
			byte numero1;
			
			// Más adelante podemos asignar un valor a esta variable unicamente llamandola por su nombre
			numero1=127;
			// Hasta este momento numero1 vale 127, si se asigna otro valor
			// otro valor, en la programación el código se va leyendo línea por línea
			numero1=120;
			
			// Declarar variables pero con valores asignados inicialmente
			byte by = 110;  // byte emplea 1 byte de memoria y puede contener valores de -128 a 127
			short sh = 32767; // short emplea 2 bytes de memoria y puede 
			//contener valores desde -32768 a 32767
			int i = 2147483647; //emplea 4 bytes de memoria
			long largo = 2147483650L; // emplea 8 bytes de memoria
			//y puede almacenar valors más alla de los int, siempre y cuendo
			//se agregue el sufijo "L"
			
			//La variable más utilizada (comodin) es la de tipo int
			
			//Tipos de datos primitivos
			//Numéricos en punto o coma flotante (decimales)
			
			float flotante = 900.78F; // emplea 4 bytes de memoria
			
			double decimal = 3.14161245654654; //emplea 8 bytes de memoria
			
			//La variable más utilizada es double en el caso de decimales
			
			/*TIPOS DE DATOS PRIMITIVOS
			 *  Boleanos
			 *  Caracter
			 */
			
			boolean evalua = true; //Solo admiten valores true o fals
			//Son utiles al evaluar condiciones o expresiones
			
			char caracter = 'a'; //Pueden contener un solo caracter y asignamos
			//el valor del mismo entre comilla simple (' ')
			
			/*TIPOS DE DATOS NO PRIMITIVOS
			 * TIPOS DE DATOS ESTRUCTURADOS
			 * TIPOS DE DATOS OBJETO
			 * TIPOS DE DATOS REFERENCIALES
			 * 
			 * Encontramos a los declarados por el usuario, entre otros
			 * y por parte de Java, encontramos principalmente los String
			 * y Wrapper
			 * 
			 */
			
			//String - Cadenas de texto
			String cadena = "Hola Generación 158";
			
			//Wrapper - Envoltorio 
			//Son aquellas clases que van a "envolver" a los primitivos
			//y otorgarles otras funcionalidades o comportamientos
			Byte numeroByte = 127;
			Short numeroShort = 3000;
			Integer numeroInt = 20000000;
			Long numeroLong = 200000000000000L;
			Double numeroDoble = 300.89;
			Float numeroFloat = 689.56F;
			Character simbolo = '$';
			
			//Veamos la diferencia entre los primitivos y los no primitivos
			//Si llamo a mi varialbe numero1 que es de tipo byte
			//numero., no ocurre nada porque es un dato primitovo
			//Pero una vez contenido en su clase Wrapper, esta
			//puede otorgarle otros métodos
			numeroByte.doubleValue();
			
			//Lo mismo ocurre con los tipos de datos String
			//Si llamo a mi variable cadena
			cadena.chars();
			
			//Para darle salida en consola a nuestros datos
			//utilizamos la linea Sustem.out.println
			
			//Puedo darle salida a un dato especifico , es decir una variable
			System.out.println(cadena);
			// Puedo imprimi directamente una cadena de texto sin guardarla
			//antes de una variable
			System.out.println("Cuauhtémoc Rodríguez Tzompantzi");
			
			//Atajo para escribir System.out.print.lk
			// syso + Ctrl + espacio
			System.out.println();
			
			//Imprimir una suma de dos numeros desde consola
			System.out.println(4+6);
			
			//Concatenación - unir los valores, sin sumarlos, ya sea uniendo 
			//texto y números
			System.out.println("La suma es " + (4+6));
			
	} // Cierre del main
	
} // Cierre de la clase
