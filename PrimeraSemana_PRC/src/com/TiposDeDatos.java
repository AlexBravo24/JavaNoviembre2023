package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {//vatajo para main class es main + ctrl + espacio
		
		byte numero1;//variable declarad sin valor asignado
		
		numero1=127;
		// hasta este punto numero1 vale 127
		
		
		//aqui  numero1 valdira 120 por la secuencia del programa
		numero1=120;
		
		byte by=110;//valor declarada con valor asignado inicialmente
		
		short sh= 32767; // emplea 2 bytes en memoria
		
		int i=2147483647;// emplea 4bytes en memoria
		
		long largo= 147483650L;// emplea 8bytes de memoria
		//puede almacenar numero mas grandes del integer siempre y cuando se le agrege el subfijo "L"
		
		//tipos de datos primitivos 
		//numericos en punto o como flotsnte
		float flotante= 900.78f;//float emplea 4 bytes de memoria
		double decimal=3.1416; // double emplea 8 bytes en memoria
		//la variable mas utilizada en es double en el caso decimales
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * booleanos 
		 * caracteres
		 */
		boolean evalua= true; //solo admiten valores true o false 
		// son utiles al evaluar condiciones o expresiones
		
		char caracter = 'a'; //pueden contener un solo caracter y asignamos 
		//el valor del mismo entre comillas simples ('')
		
		
		/*
		 * TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS NO ESTRUCTURADOS
		 * TIPOS DE DATOS OBJETO
		 * TIPOS DE DATOS REFERENCIALES
		 * 
		 * 
		 *Encontramos a los declarados por el usuario, entre otros y por parte de java 
		 *encontramos a los String y Wrapper
		 *
		 *practicamente los tipos de datos no primitivos son "clases", las cuales van aproporcionar
		 *metodos y otras funcionalidades en nuestras variables 
		 *
		 */
		// String - cadenas de texto
		String cadena = "hola generacio 158";
		
		// Wrapper - envoltorio		
		// son aquellas clases que van a "envolver" a los datos primitivos 
		//y otorgarles otras funcionalidades o comportamientos 
		
		Byte  numeroByte = 127;
		Short numeroShort= 3000;
		Integer numeroInt=20000000;
		Long numeroLong= 2000000000000L;
		Double numeroDouble=300.00;
		Float numeroFloat= 689.56f;
		Character simbolo = '$';
		
		//diferencia entre los primitivos y los no primitivos 
		// si llamo a mi variable que es tip byte
		
		numeroByte.doubleValue();
		
		// lo mismo ocurre con los tipos de dato String
		//si llamo a mi varable cadena
		cadena.chars();
		
		//para darle salida en consola a nuestros datos
		//utilizamos la linea System.out.println
		
		//puedo darle salida a un dato especificos, es decir una variable
		System.out.println(cadena);
		//puedo imprimir directamente una cadena de texto sin antes guardarla 
		//antes en una variable
		System.out.println("Jorge Alejandro Bravo Ramirez");
		
		//atajo para escribir system.out.println
		//syso+Ctrl+ espacio
		System.out.println();
		
		//imprimir una suma de dos numeros directamente en una imprecion en consola
		System.out.println(4+6);
		
		//concatenacion-unir los valores,sin sumarlos ya sea uniendo texto y numeros; por ejemplo
		System.out.println("la suma es "+ (4+6));
		
		
		
		
		
		
		
		
	} // cierre del main

}//cierre de la clase
