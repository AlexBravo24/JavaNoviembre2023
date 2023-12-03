package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {
		//El metodo main es el punto de entreda para la ejecución de un programa
		//Es decir, todo lo que esté declarado dentro dentro de el sistema 
		//va a buscar este metodo y lo ejecutara
	
	//Tipo de datos primitivos (Numericos enteros)
		
	//Ejemplo de declarar un tipo de dato byte sin valor asignado
		
		byte numero1; 
		
		//Mas adelnate podemos asignar valor a esta variable
		//unicamente llamandola por su nombre
		numero1=127;
		//Hasta este momento numero1 vale 127, si yo asigno porteriormente
		// otro valor, recordemos que en la rpgramación todo el codigo
		//se va leyendo linea por linea 
		numero1=120;
		
		//Declarar variables pero con valores asignados iniciamente
		byte by=110; //byte emplea 1 byte de memoria y puede contener 
		//valores de -128 a 127
		short sh=32767; //short emplea 2 bytes de memoria y puede contener
		// valores desde -32768 a 32767
		int i=2147483647; //emplea 4 bytes de memoria
		long largo =2147483650L; //emplea 8 bytes de memoria
		//y puede almacenar valores mas alla de los int, siempre y cuando
		//se le agregue el sufijo "L"
		
		//La variable más utilizada (comodin) es la de tipo int 
		
		//Tipos de datos primitivos 
		//Numericos en punto o coma flotante (decimales)
		
		float flotante=900.7812345F; //emplea 4 bytes de memoria 
		
		double decimal=3.1416124587; //emplea 8 bytes de memoria y es la variable mas utilizada
		//para el uso de decimales 
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos 
		 * Caracter
		 */
		
		boolean evalua=true; //solso admienten valores true o false
		//Son utiles al evaluar condiciones o expresiones 
		
		char caracter = 'a'; //Pueden contener un solo caracter y asignamos
		//el valor del mismo entre comilla simple ('')
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * TIPOS DE DATOS OBJETO
		 * TIPOS DE DATOS REFERENCIALES
		 * 
		 * Econtramos  a los declarados por el usuario, entre otro
		 * y por parte de java, encontramos principalmente a los String
		 * y Wrapper
		 * 
		 * Practicamente los tipos de datos no primitivos 
		 * son "clases", las cuales van a proporcionar metodos
		 * y otras funcionalidades en nuestras variables 
		 * 
		 */
		
		//String = cadenas de texto
		String cadena="Hola Generacion 158";
		
		//Wrapper = tipos de dato envoltorio
		//Son aquellas clases que van a "envolver" a los primitivos 
		//y otorgarles otras funcionalidades o comportamientos
		
		Byte numeroByte= 127; 
		Short numeroShort= 3000;
		Integer numeroInt= 200000000;
		Long numeroLong= 200000000000000L;
		Double numeroDouble =300.89;
		Float numeroFloat= 689.56F;
		Character simbolo='$';
		
		//Veamos la diferencia entre los primitivos y los no primitivos
		//Si llamo a mi variable numero1 que es de tipo byte
		// numero1., no courre nada, porque es un dato primitivo
		//Pero una vez contenido en su clase Wrapper, esta
		//puede otorgarle otros metodos
		numeroByte.byteValue();
		
		
		//Lo mismo ocurre  con los tipos de dato String
		//Si llamo a mi varibale cadena 
		cadena.chars();
		
		//Para darle alida en consola a nuestros datos
		//utilizamos la linea System.out.println
		
		//Puedo darle salida a un dato especifico, es decir, una variable
		System.out.println(cadena);
		
		//Puedo imprimir directamente una cadena de texto sin guardarla 
		//antes en una variable 
		System.out.println("Iván Alejandro Gozález");
		
		//El atajo para escribir System.out.println es
		//syso+Ctrl+espacio
		
		// Imprimir una sume de dos numeros directamente en una impresión 
		//en consola
		System.out.println(4+6);
		
		//Concatenacion = unir los numeros sin sumarlos, ya sea uniendo
		//texto y numeros, por ejemplo
		System.out.println("La suma es" + (4+6));
		
		
		
		
		
	}//Cierre del main

}//Cierre de la clase
