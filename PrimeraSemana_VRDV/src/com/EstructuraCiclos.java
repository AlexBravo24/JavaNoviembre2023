package com;

public class EstructuraCiclos {

	public static void main(String[] args) {

		// ciclos, tambien llamados bucles
		// es la tercera estrucutra dle paradigma de programaci�n estrcuturada
		// en la cual vamos a hacer las iteracciones
		// que son la repetici�n indeterminada o determinada
		// de un bloque de codigo

		// generalmente en el caso de los cilcos nos apoyamos
		// de una variable numerica, porque de acuerdo al cambio
		// del valor de esas variables es como se va a ejecutar la accion

		// while - mientrass...
		// es un ciclo que va a ejecutar una accion mientras una condici�n se cumpla

//		mientras (esta condici�n se cumpla)
//		
//		ejecuta este bloque de codigo 
//		

		int x = 1;

//		while (x<5) {// mientras esta condicion se cumple
//			//ejecuta lo siguiente
//			
//			System.out.println(x + ".-" + "hola mundo");
//			
//			//while es un ciclo indeterminado pero puedo controlarlo
//			//si declaro un cambio en mi variable, en este casoi un incremento
//			
//			//x = x+1;
//			 x++; //significa mas 1

		// }

		// do-while (haz esto mientras se cumpla la condicion)
		// este ciclo nos ayuda a ejecutra un bloque de codigo
		// cuando pueda presentarse el caso de la condicion, no se llegue a cumplir
		// pero nos asegurarmos que el programa se ejecuta por lo menos una vez

		do {// ejecuta el siguiente bloque de codigo

			System.out.println("hola mundo");

		} while (x > 2); // se evalua lo condicion y si se cumple
		// se vuelve a bloque del do
		
		//ciclo for - para--- para las siguientes condiciones, ejecuta
		//el siguiente bloque
		//se utiliza cuando conocemos cuantas veces queremos que se realice una accion
		
		/* 
		 * para (una vaiable con un valor; mientras se cumplla esto; incremetamos)
		 * ejecutamos este bloque de codigo
		 */
		
		
		for (int i = 0; i < 5 ; i++) {
			
			System.out.println(i + ".-" + "hola mundo");
			
		}
		

	}

}
