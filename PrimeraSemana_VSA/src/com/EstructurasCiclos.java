package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		/*Ciclos, tambi�n llamados bucles
		 * es la tercera estructura del paradigma de Programaci�n estructurada (iteraci�n)
		 * es la repetici�n ya sea determinada o indeterminada
		 * de un bloque de c�digo.
		 * 
		 * Generalmente en el caso de los ciclos nos apoyamos en una variable num�rica
		 * porque de acuerdo al cambio del valor de esa variable es como se va a ejecutar 
		 * la accion.
		 */
		
		//WHILE - mientras...
		//es un ciclo que va a ejecutar una acci�n mientras UNA 
		//condici�n se cumpla.
		
		/*ALGORITMO WHILE
		 * mientras (esta condici�n se cumpla){
		 * 
		 * ejecuta este bloque de c�digo
		 * 
		 * }
		 */
		 int x = 2;
		 
//		 while (x<5) { //mientras esta condici�n se cumpla
//			 //ejecuta lo siguiente...
//			 //System.out.println("Hola mundo"); //hasta aqu� ser� un bucle infinito
//			 System.out.println(x + "._" + "Hola mundo"); 
//			 //While es un ciclo indeterminado, pero se puede controlar
//			 //si se declara un cambio en la variable, en este caso, un incremento
//			 //x=x+1; // realiza un incremento de x en 1
//			 x++; //sintaxis tambien incrementa x en 1 
//           }
		 
		 /*DO-WHILE
		  * haz esto, mientras se cumpla una condici�n
		  * falta
		  * 
		  * 
		  * en ese ciclo la condici�n la condici�n se evalaua al final.
		  * Primero se ejecuta, luego evalua
		  */
		 
		 
//		 do {//ejecuta el siguiente bloque de codigo
//			 System.out.println("Hola mundo");
//		 }while (x>2); //se evalua la condicion, y si se cumple,
//		               //entonces volvmos al bucle del do { }
		 
		 
		 /*CICLO FOR -  para...
		  * para las siguientes condiciones, ejecuta el siguiente bloque
		  * Se utiliza cuando conocemoscuantas veces queremos que 
		  * se realice una accion
		  *
		  ALGORITMO FOR
		  para (una variable con un valor; mientras se cumpla esto; incrementamos){
		 * ejecutamos este bloque de codigo
		 * }
		 */
		 
		 for (int i=1; i<x; i++) {
			 System.out.println(i + "._ " + "Hola mundo");
		 }
		
	}

}
