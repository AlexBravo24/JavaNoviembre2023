package com;

public class EstructurasCiclos {

	public static void main(String[] args) {

		// CICLOS, también llamados bucles
		// Es la tercera estructura del paradigma de Programación
		// Estructurada (Iteración)
		// Es la repetición ya sea indeterminada o determinada
		// de un bloque de código

		// Generalmente en el caso de los ciclos nos apoyamos
		// en una variable numérica, porque de acuerdo al cambio
		// del valor de esa variable es como se va a ejecutar la
		// acción

		// while - Mientras
		// Es un ciclo que va a ejecutar una acción mientras una condición
		// se cumpla

		/*
		 * Mientras (esta condicion se cumpla){ ejecuta este bloque de código }
		 */

		int x = 1;

//		while (x<=5) { //mientas esta condición se cumpla
//			//Ejecuta lo siguiente...
//			System.out.println(x + ".-" + "Hola mundo");
//			//while es un ciclo "indeterminado", pero puedo controlarlo
//			//si declaro un cambio en mi variable, en este caso un incremento
//			//x=x+1 se incrementa x en 1
//			//x=x+1; //realizó un incremento de x en 1
//			x++;
//		}

		// do-while (haz esto, mientras se cumpla una condicion)
		// este ciclo nos ayuda a ejecutar un bloque de codigo cuando
		// pueda presentarse el caso de que una condición no se llegue a cumplir
		// pero nos aseguramos que el programa se ejecute por lo menos una vez

		// en este ciclo la condición se evalua al final. Primero se ejecuta
		// luego evalua si puede hacerse de nuevo

		do {// ejecuta el siguiente bloque de código
			System.out.println("Hola mundo");
		} while (x > 3); // se evalua la condición y si se cumple,
		// entonces volvemos al bloque del do{}
		
		//Ciclo FOR - Para... Para las siguientes condiciones, ejecuta
		//el siguiente bloque
		//Se utiliza cuando conocemos cuantas veces queremos que se
		//realice una acción
		
		/*
		 * para (una variable con un valor; mientras se cumpla esto; incrementamos){
		 * ejecutamos este bloque de código 
		 * }
		 * 
		 */
		System.out.println("Probando el ciclo For");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ".- " + "Hola mundo");
		}
		
	}

}
