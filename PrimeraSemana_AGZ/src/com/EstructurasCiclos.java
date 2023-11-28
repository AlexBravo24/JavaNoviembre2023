package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Ciclos o bucles
		//Es la tercera estructura del paradigma de programacion
		//generalmente en el caso de los ciclos nos apoyamos
		/*en una variable numerica, porque de acuerdo al cambio
		 * del valor de esa variable es como se va a ejecutsr la accion
		 * 
		 * while// mientras
		 * es un ciclo que va a ejecutar una accion mientras una condicion
		 * se cumpla
		 * Es un ciclo indeterminado
		 * 
		 * mientras (esta condicion se cumpla)´ejecuta este bloque
		 * de codigo
		 */
		int x=2;
		/*	while (x<5) {//mientras esta conndicion se cumpla //ejecuta lo siguiente
			System.out.println(x+".- Hola mundo");
			//while es un ciclo indeterminado, pero puedo controlarlo
			//si declaro un cambio en mi variable en esta caso incremento
			//x=x+1;
			x++;//incrementamos en 1
		}*/
		
		/* do- while(haz esto, mientras cumpla la condicion)
		 * este ciclo nos ayuda a ejecutar un bloque de codigo cuando
		 * puede presentarse el caso de que una condicion llegue a cumplirse
		 * pero nos aseguramos que el programa se ejecute por lo menos una vez
		 * 
		 */
		
		/*	do{//ejecuta el siguiente bloque de codigo
			System.out.println("Hola mundo");		
		}while(x>2); //se evalua la condicion y si se cumple,
		//entonces volvemos al bloque del do{}
		*/
		
		/*Ciclo FOR.. para las sigioentes condiciones, ejecuta el siguiente
		 * bloque, Se utiliza cuando conocemos cuantas veces queremos que se 
		 * realice la accion.
		 * 
		 * para(una variable con un valor; mientras se cumpla esto; incrementamos){
		 * ejecutamos bloque de codigo}
		 * 
		 */
		
		
		for (int i = 0; i < x; i++) {
			System.out.println(i+ ".- Hola mundo");
		}
		 
	}

}
