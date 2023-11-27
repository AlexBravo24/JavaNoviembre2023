package com;

public class TiposDeDatos {

	public static void main(String[] args) {
		
		byte numero1;
		numero1=127;
		numero1=120;
		
		byte by=110;//emplea 1 byte de memoria y puede contener
		//valores de -128 a 127 
		
		
		short sh=32767;//emplea 2 bytes de memoria y
		//puede contener valores desde -32768 a 32767
		
		int i = 2147483647; //emplea 4 bytes de memoria
		
		long largo = 2147483650L; //emplea 8 bytes de memoria
		//puede contener numeros mayores a int, siempre y cuando
		// se le agregue el sufijo "L"
		
		//la variable mas utilizada es int
		
		// Numericos en puto o coma flotante
		
		float flotante = 900.3458573F;//emplea 4 bytes de memoria
		
		double decimal= 3.151592;//emplea 8 bytes de memroia
		
		//La variable mas usada para decimales es double
		
		
		
		/*
		 * Booleanos
		 * Caracter 
		 */
		
		boolean evalua = true; //solo admiten valores true o false
		//son utiles al evaluar condiciones o expresiones
		
		char caracter= 'a'; //Pueden contener un solo caracter y se
		//asigna el valor del mismo entre comillas simple('')
		
		
		/*
		 * 
		 * TIPOS DE DATOS NO PRIMITIVOS
		 * ESTRUCTURADOS
		 * OBJETO
		 * REFERENCIALES
		 * 
		 * Declarados por el usuario, entro otros
		 * y por parte de Java, encontramos principalmente a los
		 * String y Wrapper
		 */
		
		//String - Cadenas de texto
		
		String cadena= "Hola Mundo!";
		
		//Wrapper - Envoltorio
		//Clases que van a envolver a los primitivos
		//se les otorga otras funcionalidades o comportamientos
		
		Byte numeroByte= 120;
		Short numeroShort = 300;
		Integer numeroInt = 200000;
		Long numeroLong= 20000000000L;
		Double numeroDouble= 300.68;
		Float numerofloat= 123.54F;
		Character simbolo= '$';
		
		//Diferencia entre primitivos y no primitivos
		//Si se llama a la variable numero1 que es de tipo byte
		//numero1., no ocurre nada, porque es un dato primitivo
		//Pero una vez contenido en su clase Wrapper, esta
		//puede otorgarle otros metodos
		
		numeroByte.doubleValue();
		
		//Lo mismo ocurre con los datos de tipo String
		//Si se llama a la variable cadena
		cadena.chars();
		
		//para darle salida a consola a los datos
		//Utilizamos la linea System.out.println
		
		System.out.print(cadena);
		
		//Se puede imprimir directamente una cadena de texto sin haberla guardado 
		
		System.out.println("\nJoel Tinajero Rizo");
		
		//Imprimir una suma de dos numeros directamente en consola
		System.out.println(4+6);
		
		//Concatenacion - Unir lops valores sin sumarlos
		
		System.out.println("La suma es " + (4+6));
		
		}
	
	
}
