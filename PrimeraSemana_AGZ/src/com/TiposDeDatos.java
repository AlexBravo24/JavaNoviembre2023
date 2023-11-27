package com;

public class TiposDeDatos {

	public static void main(String[] args) {
		//TIPOS DE DATOS PRIMITIVOS
		byte numero1;
		//podemos asignar adelante un valor a esta variable
		//unicamente llamandola por su nombre
		numero1=127;
		//hasta este momento numero 1 vale 127
		//si posterior asignamos otro valor en programacion el codigo
		//se va leyendo linea por linea
		numero1=120; 
		
		//declarar variables con valores asignados inicialmente
		byte by=110; //byte emplea 1 byte de memoria y puede contener
		//valores de -128 a 127
		short sh=32767; //short emplea 2 bytes de memoria y puede contener
		//valores desde -32768 a 32767
		int  i = 2147483647;   //emplea 4 bytes de memoria
		long largo = 214748364744L; //Emplea 8 bytes, puede almacenar valores
		//mas alla de los int siempre y cuando se agregue el
		//sufijo "L"
		
		//La variable mas utilizada (comodin) es la tipo int
		
		
		//TIPOS DE DATOS PRIMITIVOS NUMERICOS EN 
		//PUNTO O COMA FLOTANTE(DECIMALES)
		float flotante = 900.78f;//emplea 4 bytes de memoria
		
		double decimal = 3.141673838; //emplea 8 bytes de memoria sin sufijo
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos
		 * caracter
		 */
		boolean evalua = true;//solo admiten true o false
		//son utiles al evaluar condiciones o expresiones
		
		char caracter ='p'; //puede contener un solo caracter y asignamos
		//el valor del mismo entre comilla simple(' ')
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * Tipos de datos estructurados
		 * tipos de datos objeto
		 * tipos de datos referenciales
		 * 
		 * 
		 * encontramos a los declarados por el usuario, entre otros
		 * y por otra parte de java, encontramos principalmete
		 * a los string y wrapper
		 * practicamente los tipos de datos no primitivos son "clases" las cuales van a proporcionarnos metodos
		 * y otras funcionalidades en nuestras variables
		 */
	String cadena = "Hola generacion 158 ";//String cadena de texto
	//Wrapper - Envooltorio
	//son aquellas clases que van a "envolver" a los primitivos
	//y otorgarles otras funcionalidades o comportamientos
	
	Byte numeroByte = 10;
	Short numeroShort= 3000;
	Integer numeroInt = 20000000;
	Long numeroLong= 200000000000l;
	Double numeroDouble= 300.89;
	Character simbolo = '3';
	
	/*veamos la diferencia entre los primitivos y los no primitivos
	 * Si llamo a mi variable numero1 que es tipo byte
	 * numero1., no ocurre nada, porque es un dato primitivo
	 * pero una vez contenido en su clase wrapper, esta
	 * puede otorgarle otros metodos
	 */
	numeroByte.doubleValue(); //con esta clase podemos cambiar el dato byte a double
	
	//Lo mismo con tipos de datos string
	//si llamo a mi variable cadena
	cadena.chars();
	
	//para darle salida en consola a nuestros datos
	//utilizamos la linea System.out.println
	//puedo darle salida a un dato especifico, es decir una variable
	System.out.println(cadena);
	//puedo imprimir directamente una cadena de texto sin guardarla
	//antes en una variable
	System.out.println("Antonio Gomez Zarate");
	
	//Atajo para System.out.println
	//syso + ctrl + espacio
	
	//imprimir una suma de dos numeros directamente en una impresion en consola
	
	System.out.println(4+6);
	//concatenacion- unir los valores, sin sumarlos, ya sea uniendo
	//texto y numeros, por ejemplo
	
	System.out.println("la suma es " + 4+6);
	System.out.println("la suma es " + (4+6));
		
	
	
	}//cierre del main
}//cierre de la clase
