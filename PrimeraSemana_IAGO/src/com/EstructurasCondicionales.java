package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras de desición -if- valores booleanos
		
		/*
		 * si (esto es verdadero)(ejecuta esto)
		 * si no lo es (ejecuta esto)
		 */
		
		int x = 9;
		
		if (x<10) {//si x es menor que 10 ejecuta este codigo
			System.out.println("si");
		}else {//si lo anterior no es cierto, o, de otro modo ejecuta lo siguiente
			System.out.println("no");
		}
		//Operadores logicos para condiciones compuestas
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		System.out.println("Probando el operador AND");
		System.out.println();
		
		//AND -&&- devuelve el valor true cuando se cumplen todas las condiciones
		
		
		if (x<10 && x>5) {//si x es menor que 10 ejecuta este codigo
			System.out.println("si");
		}else {//si lo anterior no es cierto, o, de otro modo ejecuta lo siguiente
			System.out.println("no");
		}
		
		System.out.println("Probando el operador OR");
		
		//OR -|| devuelve true cuando se cumple al menos una condición
		if (x<10 || x>5) {//si x es menor que 10 ejecuta este codigo
			System.out.println("si");
		}else {//si lo anterior no es cierto, o, de otro modo ejecuta lo siguiente
			System.out.println("no");
		}
		 System.out.println("Probando el operador NOT");
		 //NOT -!- Niega una condición, o cambia el valor de la condición de
		 //de true a false o viceversa
		 if (!(x<10)) {//si x es menor que 10 ejecuta este codigo
				System.out.println("si");
			}else {//si lo anterior no es cierto, o, de otro modo ejecuta lo siguiente
				System.out.println("no");
			}
	
		System.out.println("Probando el operador DIFERENTE DE");
		//Diferente de -!- compara valores y manda true si son diferente
		if (x!=20) {//si x es menor que 10 ejecuta este codigo
			System.out.println("si");
		}else {//si lo anterior no es cierto, o, de otro modo ejecuta lo siguiente
			System.out.println("no");
		}
		
		System.out.println("Probando el operador de IGAULDAD");
		//Igualdad - == - compara los valores y manda true cuando aun son iguales
		if (x==9) {//si x es menor que 10 ejecuta este codigo
			System.out.println("si");
		}else {//si lo anterior no es cierto, o, de otro modo ejecuta lo siguiente
			System.out.println("no");
		}
		
		//Estructuras if-else anidado o if-else concatenado
		
		int volado= 1;
		
		if(volado==1) {
				System.out.println("Aguila");
		}else if(volado == 2) {
			System.out.println("Sol");
		}else {System.out.println("Error");
		}
		
		//SWITCH CASE - Sirve para ejecutar diferente lienas de codigo
		//de acuerdo al cambio de valor de una variable 
		System.out.println("Probando estructura SWITCH-CASE");
		switch (volado) {
		
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
