package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estrcuturas de decisión - if - valores booleanos
		
		/*
		 * si (esto es verdadero){
		 * ejecuta esto
		 * }si no lo es{
		 * ejecuta esto
		 * }
		 * 
		 */
		
		int x = 9;
		
		if (x<10) { //Si x es menor que 10
			//Ejecutamos este codigo
			System.out.println("Sí");
		}else {//Si lo anterior no es cierto, o , de otro modo
			//Ejecuta lo siguiente
			System.out.println("No");
		}
		
		//OPERADORES LOGICOS para condiciones compuestas
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		System.out.println("Probando el operador AND");
		
		//AND - && - Devuelve el valor true cuando se cumplen TODAS
		//las condiciones
		if (x<9 && x>5) { 	
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		
		System.out.println("Probando el operador OR");
		
		//OR - || - Devuelve True cuando se cumpla al menos una condicion
		if (x<9 || x>5) { 	
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		
		System.out.println("Probando el operador NOT");
		
		//NOT - ! - Niega una condición, o más bien, cambia el valor
		//de la condición de True a False y viceversa
		if (!(x<15)) { 	
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		
		System.out.println("Probando el operador DIFERENTE DE");
		
		//DIFERENTE DE - != - Compara valores y manda True si son diferentes
		if (x != 9) { 	
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		
		System.out.println("Probando el operador de IGUALDAD");
		
		//IGUALDAD - == - Compara los valores y manda True cuando son
		//iguales
		//Un solo igual en una variable es asignacion int x=10;
		//Y el doble igual es para comparar los valores
		if (x == 9) { 	
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		
		//Estructura if - else anidado o if else concatenado
		
		System.out.println("Probando la estructura if-else anidada");
		int volado = 2;
		
		if (volado == 1) {
			System.out.println("Aguila");
		}else if(volado == 2) {
			System.out.println("Sol");
		}else {
			System.out.println("Error");
		}
		
		//SWITCH CASE - Sirve para ejecutar diferentes lineas de codigo
		//de acuerdo al cambio de valor de una variable
		
		System.out.println("Probando estructura SWITCH-CASE");
		
		switch (volado) { //La variable que se evalue segun cambien su valor
		
		case 1: //caso del valor que tenga asignado
			//Ejecutamos este codigo
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
