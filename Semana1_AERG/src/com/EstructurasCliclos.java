package com;

public class EstructurasCliclos {
	// CICLOS. Tambien llamados bucles
	// Es la tercera estructura del paradigma de Programacon
	// Estructurada (Iteracion)
	// Es la repeticon determinada o indeterminada
	// de fraccmento de codigo

	public static void main(String[] args) {

		
		
		
		// while - Mientras....
		// Es un ciclo que ejecuta una acción mentras una condicional
		// se cumpla.
		
		System.out.println("Provando ciclo while");
		
		int x = 1; // inicialisacion varible

		while (x < 5) // cremos un while determindado al valor de x
		{
			System.out.println(x + ".- Hola mundo"); // la condicion a cumplir
			x++; // modificamos el valor del que depende el while
		}
		System.out.println();
		
		
		
		

		// do while - has esto mientras....
		// Es un ciclo que primero ejecuta una acción y despues evalua una condicional
		// para repetir o no la primera accion. Pero siempre se ejecitara minimo 1 vez
		// dicha accion.
		
		System.out.println("Provando ciclo do while");
		
		int y = 1; // inicialisacion varible

		do 
		{// Ejectura primero la siguiente accion
			System.out.println("hola do ");
		} 
		while (y < 2);// y depues evalua
		
		System.out.println();
		
		
		
		
		
		// for - para las siguientes....
		// Es un ciclo que se utiliza cuando sabemos cunatas veces queremos que se
		// ejecute una accion.
		//
		System.out.println("Provando ciclo for");
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("hola for " + i);
		}
		System.out.println();
	}

}
