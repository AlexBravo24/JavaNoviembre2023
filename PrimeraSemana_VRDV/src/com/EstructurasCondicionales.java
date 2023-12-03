package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de decisión - if valores booleanos
		
		
		/* 
		 * si esto es verdadero
		 * ejecuta esto
		 * si no lo es 
		 * ejecuta esto
		 */

		int x = 9;
		
		if (x<9) {
			System.out.println("si");
		} else
			System.out.println("no");
		
		
		
		//operadores logicos para condiciones compuestas
		//AND, OR, NOT, DIFFERENTE DE , IGUALDAD
		
		System.out.println("probando operador and");
		System.out.println();
		
		// and  = && = devuelve el valor true cuando, todas las condiciones se cumpla
		
		if (x<10 && x>5) {
			System.out.println("si");
		} else
			System.out.println("no");
		
		
		System.out.println("probando el operador or");
		
		
		// or se regresa tru si se cumple alguna de las condiciones or =||
		
		if (x<10 || x>5) {
			System.out.println("si");
		} else
			System.out.println("no");
		
		System.out.println("probando el operador not");
		// not = ! niega una condicion
		// cambia el valor de true a folse y visceversa
		
		
		if (!(x<8)) {  // usa parentesis para poner el not
			System.out.println("si");
		} else
			System.out.println("no");
		
		
		System.out.println("probando el operador diferente de ");
		
		// diferente de  != 
		
		
		if (x != 9) {
			System.out.println("si");
		} else
			System.out.println("no");
		
		
		
		System.out.println("probando el operador de igualdad");
		
		//igualdad == compara los valores y manda true cuando son iguales.
		// un solo igual en una variable es asignacción
		
		if (x == 9) {
			System.out.println("si");
		} else
			System.out.println("no");
		
		
		
		// estructura if  - else anidado ,o if else concatenado
		
		System.out.println("probando la esctructura if else anidada");
		
		int volado = 1;
		
		if (volado == 1)   {
			System.out.println("aguila");
		
		}else if (volado == 2) {
			System.out.println("sol");
		}else
			System.out.println("error");
		
		
		//switch case sirve para ejecutar diferentes linead de codigo
			// de acuerdo  al cambio de valor de una variable
		
		System.out.println("probando la esctructura switch case");
		
		//switch ctrl espacio para que se ponga solito como syso
		
		switch (volado) {
		
		case 1:
		System.out.println("aguila");
			break;
		case 2:
			System.out.println("sol");
			break;
			
			default:
				System.out.println("error");
				break;
		
		}
		
		
		
		
		
		
	}

}
