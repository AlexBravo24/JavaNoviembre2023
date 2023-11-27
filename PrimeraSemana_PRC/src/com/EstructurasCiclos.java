package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS , tambien llamados bucles
		//es la tercera estructura del paradigma de programacion estructurada (interacion)
		//es la repeticion ya sea indeterminada o determinadade un bloque de codigo
		
		//generalmente en el caso de ciclos nos apoyamos en una variable numerica, porque de acuerdo al cambio
		//del valor de esa variable es como se va a ejecutar la accion
		
		// WHILE - mientras .....
		//es un ciclo que va a ejecutar una accion mientras una condicion se cumpla
		
		/*mientras (esta condicion se cumpla){
		 * 
		 * ejecuta este codigo
		 * }
		 */

		int x =1;
//		
//		while (x<5) {//mientras esta condicion se cumpla
//			// ejecuta lo sigueinte...
//			System.out.println(x + ".-" +" hola mundo");
//			
//			//While es un ciclo "indeterminado", pero puedo controlarlo si declaro un cambio en mi variable
//			//en este caso un incremento
//			//x=x+1;//realizo un incremento de x en 1
//			x++;//esta sintaxis tambien incrementa en 1 a x
//		}
		
		/*do-while (haz esto, mientras se cumpla esta condicion)
		 * este ciclo nos ayuda a ejecutar un bloque de codigo cuando pueda presentarse el caso 
		 * de una condicion no se llega a cumplir pero nos aseguramos de que se ejecute por lo menos una vez
		 * 
		 */
		 do { //ejecuta el siguiente bloque de codigo
			 System.out.println("hola mundo");
		 
		 }while(x>2); //se evalua lo condiccion y  si se cumple entonces volvemos al bloque del do {}
		 
		 // Ciclo FOR - Para... para las sigueintes condiciones ejecuta el siguiente bloque
		 // se utiliza cuando conocemos cuantas veces queremos que se realice una accion
		 
		 
		  /*
		   * para (una variable con un valor; mientras se cumpla esto; incrementamos){
		   * 
		   * ejecutamos este bloque de codigo
		   * }
		   * 
		   * atajo para FOR : for+ctrl+ espacio
		   */ 
		
		 System.out.println("probando el ciclo FOR");
		 
		 for (int i = 1; i < 5; i++) {
			 
			 System.out.println(i+ ".-"+"hola mundo");
			
		}
	}

}
