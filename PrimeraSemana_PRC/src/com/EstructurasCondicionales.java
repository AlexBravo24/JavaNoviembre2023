package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// estructuras de decision - if - valores booleanos
		
		/*
		 * si (esto es verdadero){
		 * ejecuta esto
		 * }si no lo es {
		 * ejecuta esto
		 * }
		 */
		
		int x = 9;
		
		if(x<10) {// si x es menor que 10 
			//ejecutamos este codigo
			System.out.println("Si");
		}else {//si lo anterior no es cierto, o, de otro modo ejecuta lo siguiente
			System.out.println("No");
		}

		
		//OPERADORES LOGICOS para condiciones compuestas 
		// AND, OR, NOT DIFERENTE DE, IGUALDAD
		System.out.println("probando operador AND");
		System.out.println();
		
		// AND - && - devuelve el valor true cuando se cumplen todas las condiciones
		if(x<9 && x>5) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}

		System.out.println("probando el operador OR");
		// OR -||- devuelve true cuando se cumple almenos una condicion
		
		if(x<9 || x>5) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		System.out.println("probando el operador NOT");
		//NOT- ! - niega una condicion o mas bien cambia el valor de la condicion de true a false y vicebersa
		
		if(!(x<15)) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		System.out.println("probando el operador DIFERENTE DE");
		// DIFERENTE DE - != - compara valores y manda true si son diferentes 
		
		if(x != 9) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		System.out.println("probando el operador de IGUALDAD");
		
		// IGUALDAD - == - Compara los valores y manda true cuando son igules
		// un solo igual en una variable es una asignacion int x=10 ,  y el doble == es para comparar
		
		if(x == 9) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		// Estructura if - else anidado o if else concatenado
		System.out.println("pribando estructura if-else anidada");
		
		int volado = 2;
		
		if (volado == 1) {
			System.out.println("aguila");
		}else if (volado == 2) {
			System.out.println("sol");
		}else {
			System.out.println("ERROR");
		}
		
		//SWITCH CASE - sirve para ejecutar distintas lineas de codigo de acuerdo al cambio de 
		//valor de nuestra variable
		
		System.out.println("probando la estructura SWITCH-CASE");
		
		switch (volado) { //la variable que se evalue segun cambien su valor 
		
		case 1: // caso del valor que tenga asignado , ejecutamos este codigo
			System.out.println("aguila");
			break;
			
		case 2: 
			System.out.println("sol");
			break;
			
		case 3: 
			System.out.println("ERROR");
			break;
			
			
			
			
		}
		
	}

}
