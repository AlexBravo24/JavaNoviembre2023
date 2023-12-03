package com;

public class EstructurasCiclos {

	public static void main(String[] args) {

		// CICLOS, también llamados bucles
		// Es la tercera estructura del paradigma de Programacion
		// Estructurada (Iteracion)
		// Es la repetición ya sea indeterminada o determinada
		// de un bloque de codigo

		// Generalmente en el caso de los ciclos nos apoyamos
		// en una variable numérica, porque de acuerdo al cambio
		// del valor de esa variable es como se va a ejecutar la
		// acción

		// while - Mientras.....
		// Es un ciclo que va a ejecutar una acción mientras una condición
		// se cumpla

		/*
		 * mientras (esta condicion se cumpla){
		 * 
		 * ejecuta este bloque de codigo
		 * 
		 * }
		 * 
		 */

		int x = 2;

//		while (x<5) {//mientras esta condicion se cumpla
//			//Ejecuta lo siguiente...
//			System.out.println(x + ".- " + "Hola mundo");
//			//While es un ciclo "indeterminado", pero puedo controlarlo
//			//Si declaro un cambio en mi variable, en este caso un incremento
//			//x=x+1; //Realizo un incremento de x en 1
//			x++; //Esta sintaxis tambien incrementa x en 1
//		}

		// do-while (haz esto, mientras se cumpla una condicion)
		// Este ciclo nos ayuda a ejecutar un bloque de codigo cuando
		// pueda presentarse el caso de que una condicion no se llegue a cumplir
		// pero nos aseguramos que el programa se ejecute por lo menos 1 vez

		// En este ciclo la condicion se evalua al final. Primero se ejecuta
		// luego evalua si puede hacerse de nuevo

		do {// Ejecuta el siguiente bloque de codigo
			System.out.println("Hola mundo");
		} while (x > 2); // Se evalua la condicion y si se cumple,
		// entonces volvemos al bloque del do{}
		
		
		//Ciclo FOR - Para... Para las siguientes condiciones, ejecuta
		//el siguiente bloque
		//Se utiliza cuando conocemos cuantas veces queremos que se
		//realice una acción
		
		/*
		 * para (una variable con un valor; mientras se cumpla esto; incrementamos){
		 *ejecutamos este bloque de codigo
		 *}
		 * 
		 */
		System.out.println("Probando el ciclo For");
		
		for (int i = 1; i < x; i++) {
			System.out.println(i + ".- "+ "Hola mundo");
		}
		
		
		
		

	}

}
