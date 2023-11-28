package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS tambien llamados bucles
		//Es la tercera estructura del paradigma de programacion
		//estructurada (iteracio)
		//es la repeticion ya sea indeterminada o determinada de un bloque de codigo
		
		//Generalmente en el caso de los ciclos nos apoyamos en una variable
		// numerica, porque de acuerdo al cambio del valor de esa varible 
		// es como se va a ejecutar la accion 
		
		//El ciclo WHILE= mientras
		// Va a ejecutar una accion mientras una condicion se cumpla
		
		/* mientras esta condicion se cumpla ejecuta este bloque de codigo
		 * 
		 */
		int x=1;
		
//		while (x<5) {//mientras esta condicion se cumpla se ejecuta lo siguiente 
//			//System.out.println(x +".-"+"hola mundo");
//			while es un ciclo indeterminado pero puedo controlarlo
			//si declaro un cambio en mi variable, en este caso  un incremento
			//x=x+1; //Realizo un incremento en x+1 
			//x++; //tambien incrementa x en 1
		
	    //do-while (haz esto mientrsa se cumpla una condicion)
	//este ciclo nos ayuda a ejecutar un bloque de codigo cuando
	//pueda presentarse el caso de que una condicion no se llegue a cumplir
	//pero nos aseguramos que el programa se ejecuta por lo menos 1 vez
	
	// en este ciclo la condicion se evalua al final primero se ejecuta y 
	// luego evalua si puede hacerse mas veces
	
	do {//ejecuta el siguiente bloque de codigo
		System.out.println("hola mundo");
	}while(x>2);//se evalua la condicion y si se cumple
	//entonces volvemos al ciclo de do
	
	
	//Ciclo for-para... para las siguientes condiciones, ejecutar
	//el siguiente bloque 
	//Se utiliza para cuando conocemos cuantas veces queremos que se  
	//realice una accion 
	
	/*para (una variable con un valor; mientras se cumpla esto; incrementamos){
	 * ejecutamos este bloque de codigo
	 * }
	 */
	
	for (int i=1; i<5; i++) {
		System.out.println(i+".-"+"Hola mundo");
	}

	}

}
