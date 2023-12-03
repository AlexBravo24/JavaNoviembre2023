package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {
    // Metodo Main
	//Es el punto de entrada principal para la ejecucion de un programa 	
	// Es decir, todo lo que este declarado dentro de el, el sitema 
    // va a buscar el metodo y lo ejecutara 
		
    // para guar dar cambios presionamos el atajo Ctrl + s
	
	 byte numero1;
	 //Mas adelante podemos asignar un valor a esta variable 
	 //unicamente llamandola por su nombre 
	 
	 numero1=127;
	 //Hasta este momento numero1 vale 127, si yo asigno posteriormente 
	 //otro valor, recordemos que en la programacion
	 //todo el codigo se va leyendo linea por linea
	 
	 numero1=120;
	 
	  //Como declarar variables con valores asignados inicialmente 
	  byte by = 110;// byte emplea 1 byte de memoria y pude contener 
	  //valores de -128 a 127
	  short sh = 32767; //short emplea 2 bytes de memoria y puede 
	  //contener valores desde -32768 a 32767
	  int i =2147483647;//emplea 4 bytes de memoria
	  long largo = 2147483650L;//EMPLEA 8 BYTES DE MEMORIA 
	  //y pude almacenar valores mas alla de los int, simpre y cuando 
	  //se le agregeue el sufijo "L"
	   
	  //La variable mas utilizada (comodin) es la de tipo int
	  //Tipos de datos primitivos 
	  //Numericos en punto o coma flotante (decimal)
	  
	  float flotante = 900.78F;//emplea 4 bytes de memoria 
	  
	  double decimal= 3.14162878789; //emplea 8 bytes de memoria
	  
	  //La variable mas utilizada es double en el caso de decimales 
	  
	  /*TIPOS DE DATOS PRIMITIVOS 
	   * Booleanos
	   * Caracter
	   */
	  boolean evalua = true;//Solo admite valores true o false
	  // S on utiles al evaluar condiciones o expreciones 
	  
	  char caracter = 'a'; //Pueden contener un solo caracter y asignamos 
	  //el valor del mismo entre comilla somple ('')
	  
	  /*TIPOS DE DATOS NO PRIMITIVOS
	   * TIPOS DE DATOS ESTRUCTURADO
	   * TIPOS DE DATOS OBJETO
	   * TIPOS DE DATOS REFERENCIALES 
	   * 
	   * Encontramos a los declarados por el usuario, entre otros 
	   * y por parte Java, entramos principalmente a los String
	   * y Wrapper
	   * 
	   * Practicamente, los tipos de datos no primitivos
	   * son "clases", las cuales van a proporcionar metodos 
	   * y otra funciones en nuestra variable
	   */
	  String cadena = "Hola Generacion 158";
	  
	  //Wrapper - Envoltorio
	  //Son aquellas clases que van a "envolver" a los primitivos
	  //y otorgarles otras funcionalidades o compórtamiento 
	  Byte numeroByte = 127;
	  Short numeroShort = 3000;
	  Integer numeroInt = 20000000;
	  Long numeroLong =200000000000000L;
	  Double numeroDouble = 300.89;
	  Float numeroFloat = 689.56F;
	  Character simbolo = '$';
	  
	  numeroByte.doubleValue();
	  
	  
	  byte variable ;
	  
	  cadena.chars () ;
	  // Para darle salida en consola a nuestros datos 
	  //utilizamos la linea System.out.println
	  
	  //Puede darle salida a un dato especifico, es decir una variable
	  
	  System.out.println(cadena);
	  
	  //Puedo imprimir directamente una cadena de texto sin guardarla
	  //antes de una variable 
	  
	  System.out.println("MARCO PONCE");
	  //Atajo para escribir System.out.println
	  //syso + Ctrl + espacio
	  System.out.println();
	  
	  System.out.println(4+6);
	  
	  // Concatenacion - unir los valores, sin sumarlos, ya sea uniendo
	  //texto y numero, por ejemplo
	  System.out.println("Lasuma es " + (4+6));
	  
	  
	   
	
	
	}


}
