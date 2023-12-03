package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS, tambien llamados bucles
		//Es la tercera estructura del paradigma de programacion
		//Estructura (Iteracion)
		//Es la repeticion ya sea indeterminada o determinada
		//de un bloque de codigo
		
		//Generalmente en el caso de los ciclos nos apoyamos
		//en una variable numerica, porque de acuerdo al cambio
		//del valor de esa variable es como se va a ejecutar la accion
		
		//while - Mientras...
		//Es un ciclo que va a ejecutar una accion mientras una condicion 
		//se cumpla
		
		/* mientras (esta condicion se cumpla) {
		 * 
		 * ejecuta este bloque de codigo
		 * 
		 * }
		 * 
		 */
		
		int x = 1;
		
//		while (x<5) {//mientras esta condicion se cumpla
//			//Ejecuta lo siguiente...
//			System.out.println(x + ".-" + "Hola mundo");
//			//While es un ciclo "indeterminado", pero puedo controlarlo
//			//Si declaro un cambio en mi variable, en este caso un incremento
//			x=x+1; //Realizo el incremento de x en 1
//			
//		}
		
		//do-while (haz esto, mientras se cumpla una condicion)
		//Este ciclo nos ayuda a ejecutar un bloque de codigo cuando
		//pueda presentarse el caso de que una condicion no se llegue a cumplir
		//pero nos aseguremos que el programa se ejecute por lo menos una vez
		
		//En este ciclo la condicion se evalua al final. Primero se ejecuta 
		//luego evalua si puede hacerse de nuevo 
		
//		do {//Ejectuta el siguiente bloque de codigo 
//			System.out.println("Hola mundo");
//		}while(x>2); 
		//Se evalua la condicion y si se cumple,
		//entonces volvemos al bloque do{}
		
		//Ciclo FOR - Para... Para las siguientes condiciones, ejecuta
		//el siguiente bloque
		//Se utiliza cuando conocemos cuantas veces queremos que se 
		//realice una accion 
		
		/*
		 *  para (una variable; mientras se cumpla esto; incrementamos){
		 *  ejecutamos este bloque de codigo
		 *  }
		 *  
		 */
		System.out.println("Probando el ciclo FOR");
		
		for (int i = 1; i < x; i++) {
			System.out.println(i + "." + "Hola mundo");
			
		}
		}
	
	}
	

