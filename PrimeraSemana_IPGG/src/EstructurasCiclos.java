
public class EstructurasCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ciclos, tambien llamados bucles, 
//		es la tercera estructura del paradigma de programacion
//		Estructurada (iteracion)
//		Es la repeticion ya sea indeterminada o determinada de un bloque de codigo
//
//		Generalmente en el caso de los ciclos nos apoyamos en una variable numerica
//		porque de acuerdo al cambio de valor de esa variable es como se va ejecutar la accion
//
//		while - mientras
//		es un ciclo que va a ejecutar una accion mientras una condicion se cumpla
// mientras esta condicion se cumpla, ejecuta este bloque de codigo 

		int x = 1;
//		while (x<5) {
//			System.out.println("Hola mundo");
//			//while es in ciclo "indeterminado" pero puedo controlarlo si si declaro un cambio en mi variable, 
//			//en este caso un incremento
//			//x=x+1; //realizo el incremento aqui 
//			x++;}
		// en este ciclo la condición se evalua al final, primero se ejecuta y despues
		// evalua si puede hacerse de nuevo
		// do-while (haz esto mientras se cumpla una condición
		// este ciclo nos ayuda a ejecutar un bloque de codigo cuando
		// pueda presentarse el caso de que una condicion no se llegue a cumplir
		// pero nos aseguramos que el programa ejecute por lo menos una vez
//		do {// ejecuta el siguiente bloque de codigo
//			System.out.println("Hola mundo");
//		} while (x > 2);// se evalua la condición , entonces evaluamos la parte do
//	}
	//Ciclo FOR  ´para las siguientes condiciones
	//el siguiente bloque
	// se utiliza cuando conocemos cuantas veces queremos que se
	//realice una accion 
	/* para una variable con un valor; mientras se cumpla esto; incrementamos la variable
	//entonces ejecutamos el bloque de codigo 
	 * */
	System.out.println("Probando ciclo for");
	for (int i = 1; i < 5; i++) {
	    System.out.println(i + ".-" + "Hola Mundo");
	}
	}
}
