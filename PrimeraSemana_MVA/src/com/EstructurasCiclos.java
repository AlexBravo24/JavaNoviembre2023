package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS O BUCLES
		//es la tercera estructura del paradigma de programacion
		//Estructura (Iteracion)
		//es la repeticion ya sea indeterminada o determinada de un 
		//bloque de codigo
		
		//Generalmente nos apoyamos de una variable numerica, porque de 
		// acuerdo al cambio del valor de esa variable es como se va a 
		//ejecutar la accion 

		// While - Mientras....
		// Es un ciclo que va a ejecutar una accion mientras una 
		//condicion se cumpla.
		
		/*mientras (esta condicion se cumpla){
		 * 
		 * ejecuta este bloque de codigo
		 * 
		 * }
		 * 
		 */
		
		int x = 1;
		
//		while (x<5) {// mientras esta condicion se cumpla 
//			//Ejecuta lo siguiente...
//			System.out.println(x + ".- "+"hola mundo");
//			//While es un ciclo "indeterminado" pero puedo 
//			// controlarlo si declaro un cambio en mi variable 
//			// en este caso un incremento
//			x+=1; // realizo un incremento en 1 
//		}
		
		//do-while (Haz esto- mientras se cumpla una condicion)
		//Este ciclo nos ayuda a ejecutar un bloque de codigo cuando
		//pueda presentarse el caso de que una condicion no se llegue a 
		//cumplir, pero nos aseguramos de que el codigo se ejecute al 
		// menos una vez
		
		do { //Ejecuta el siguiente bloque de codigo
			System.out.println("hola mundo");
		}while(x>2);  // Se evalua la condicion y si se cumple,
		// entonces volvemos al bloque del do{}
		
		
		//FOR - para---- Para las siguientes condiciones, ejecuta el siguiente
		//bloque 
		// Se utiliza cuando conocemos cuantas veces queremos que se realice
		//una accion
		
		/*para (una variable con un valor;mientras se cumpla esto; incrementamos){
		 * 
		 * ejecutamos este bloque de codigo...
		 * 
		 * }
		 */
		System.out.println("probando el ciclo for: ");
		for (int i = 1; i < 5 ; i++) { 
			System.out.println(i + ".- "+ "hola mundo");
		}
	}

}
