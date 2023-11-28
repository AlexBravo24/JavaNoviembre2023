package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras de decision - if - valores booleanos
		
		/*
		 * si (esto es verdadero){
		 * ejecuta esto 
		 * }si esto no lo es{
		 * ejecuta esto
		 * }
		 * 
		 */
		int x = 9;
		
		if (x<10) { //Si x es menor que 10
			//Ejecutamos este codigo
			System.out.println("Si");
		}else { // Si lo anterior no es cierto, o , de otro modo
			//Ejectuta lo siguiente
			System.out.println("No");
		}
		
		//OPERADORES LOGICOS para condiciones compuestas
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		System.out.println("Probando el operador AND");
			
		//AND - && - Devuelve el valor true cuando se cumplen TODAS
		//las condiciones 
		if (x<9 && x>5) {			
			System.out.println("Si");
		}else { 			
			System.out.println("No");
		}
		
		System.out.println("Probando el opeador OR");
		
		//OR - || - Devuelve True cuando se cumpla al menos una condicion
		
		if (x<9 || x>5) {			
			System.out.println("Si");
		}else { 			
			System.out.println("No");
		}
		
		System.out.println("Probando el operador NOT");
		
		//NOT - ! - Niega una condicion, o mas bien, cambia el valor
		//de la condicion True o False y viceversa
		if (!(x<15)) {			
			System.out.println("Si");
		}else { 			
			System.out.println("No");
		}
		
		System.out.println("Probando el operador DIFERENTE DE");
		
		//DIFERENTE DE - != - Compara los valores y manda True si son diferente
		if (x != 9) {			
			System.out.println("Si");
		}else { 			
			System.out.println("No");
		}
		
		System.out.println("Probando el operador de IGUALDAD");
		
		//IGUALDAD - == - Compara los valores y manda a TRUE cuando
		//son iguales
		//Un solo igual en una variable es una asignacion x=10;
		//Y el doble igual es para comparar valores
		if (x == 9) {			
			System.out.println("Si");
		}else { 			
			System.out.println("No");
		}
		
		//Estructura if - else anidado o if else concatenado
		
		int volado = 1;
		
		if (volado == 1) {
			System.out.println("Aguila");
		} else if(volado == 2){
				System.out.println("Sol");
		}else {
			System.out.println("Error");
		}
		
		//SWITCH CASE - Sirve para ejectuar diferentes lineas de codigo 
		//de acuerdo al cambio de valor de una variable
		
		System.out.println("Probando estructura SWITCH-CASE");
		
		switch (volado) { //La variable que se evalue segun cambie su valor
		
		case 1: //caso del valor que tenga asignado 
			//Ejecutamos codigo
			System.out.println("Aguila");
			break;
		case 2: 
			System.out.println("Sol");
			break;
		default:System.out.println("Error");
		    break;
		}
	}

}
