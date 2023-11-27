package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS
		
		//while -  mientras...
		// es un ciclo que se va a ejecutar mientras una condicion
		//se cumpla
		
		int x=1;
		
//		while (x<5) {
//			System.out.println(x+".- Hola mundo");
//			x+=1;
//		}
		
		//do-while (haz esto, mientras  se cumpla una condicion)
		//El bloque de codigo dentro del do-while se ejecutara al menos
		//una vez antes de hacer la coimparacion
		
		do {
			System.out.println("Hola mundo");
		}while(x>2);
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i+".- Hola mundo");
		}
	}

}
