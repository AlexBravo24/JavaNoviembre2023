package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Etructuras de decision - if - valores booleanos
		
		/*
		 * si (esto es verdadero){
		 * ejecuta esto
		 * }
		 * si no lo es{
		 * ejecuta esto
		 * }
		 * 
		 */
		
		int x=9;
		if(x<10) {
			//Se ejecuta este codigo
			System.out.println("Si");
		}
		else {//Si lo anterior no es cierto
			//Ejecuta lo siguiente
			System.out.println("No");
		}
		
		
		//OPERADORES LOGICOS 
		System.out.println("Probando operador AND");
		
		//AND - && - Devuelve true cuando se cumplent TODAS 
		//las condiciones
		
		if(x<9 && x>5) {
			System.out.println("Si");
		}
		else {
			System.out.println("No");
		}
		
		System.out.println("Probando operador OR");
		
		//OR - || - Devuelve true cuando se cumple al menos
		//una condicion
		if(x<9 || x>5) {
			System.out.println("Si");
		}
		else {
			System.out.println("No");
		}
		System.out.println("Probando operador IGUALDAD");
		
		//IGUALDAD - == - Devuelve true cuando se son iguales los numeros
		//
		if(x==9) {
			System.out.println("Si");
		}
		else {
			System.out.println("No");
		}
		
		//Estructura if-else anidado o if else concatenado
		int volado=1;
		
		if(volado==1) {
			System.out.println("Aguila");
		}
		else if(volado==2) {
			System.out.println("Sol");
		}
		else {
			System.out.println("Error");
		}
		
		//SWITCH CASE - Para ejecutar diferentes lineas de codigo
		//de acuerdo al cambio de valor de una variable
		
		System.out.println("Probando estructura SWITCH-CASE");
		
		switch(volado) {
		case 1:
			System.out.println("Aguila");
			break;
		case 2:
			System.out.println("Sol");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}

}
