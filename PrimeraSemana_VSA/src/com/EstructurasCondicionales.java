package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// ESTRUCTURAS DE DECISIÓN -if - valores booleanos

		/*
		 * si (esto es verdadero){ ejecuta esto } si no lo es{ ejecuta esto }
		 * 
		 */

		int x = 9;

		if (x < 10) {
			// ejecutamos este codigo
			System.out.println("SI"); // hasta aqui se puede ejecutar (completar)
		} else { // si lo anterior no es cierto, o de otro modo
			// ejecuta lo siguiente
			System.out.println("NO");
		}

		/*
		 * OPERADORES LOGICOS PARA CONDICIONES COMPUESTAS AND, OR, NOT, DIFERENTE DE,
		 * IGUALDAD
		 */
		System.out.println();
		System.out.println("Probando el operador AND - &&");

		// AND -&& - devuelve el valor true cuando se cumplen TODAS las condiciones

		if (x < 9 && x > 5) {

			System.out.println("SI");
		} else {

			System.out.println("NO");
		}

		System.out.println();
		System.out.println("Probando el operador OR- ||");
		// devuelve true cuando se cumpla al menos una condicion

		if (x < 9 || x > 5) {

			System.out.println("SI");
		} else {

			System.out.println("NO");
		}

		System.out.println();
		System.out.println("Probando el operador NOT - !");
		// NOT - ! Niega una condición, o mas bien, cambia el valor de
		// la condición de True a False y viceversa

		if (!(x < 8)) {

			System.out.println("SI");
		} else {

			System.out.println("NO");
		}

		System.out.println();
		System.out.println("Probando el operador DIFERENTE DE - != ");
		// DIFERENTE DE -!= - COMPARA VALORES Y MANDA True si son diferentes

		if (x != 9) {

			System.out.println("SI");
		} else {

			System.out.println("NO");
		}

		System.out.println();
		System.out.println("Probando el operador IGUALDAD - == ");
		// IGUALDAD - == - Compara los valores y manda True cuando son iguales
		// un solo igual en una variable es asignación int x=10;

		if (x == 9) {

			System.out.println("SI");
		} else {

			System.out.println("NO");
		}

		System.out.println();

		/*
		 * ESTRUCTURA if - else anidado o if else concatenado
		 */
		System.out.println("Probando la estructura if-else anidada");
		int volado = 1;

		if (volado == 1) {
			System.out.println("AGUILA");
		} else if (volado == 2) {
			System.out.println("SOL");
		} else {
			System.out.println("ERROR");
		}

		System.out.println();

		/*
		 * SWITCH CASE - SIRVE PARA EJECUTAR DIFERENTES LINEAS DE CODIGO DE ACUERDO AL
		 * CAMBIO DE VALOR DE UNA VARIABLE
		 */
		System.out.println("PROBANDO ESTRUCTURA SWITCH-CASE");

		switch (volado) { // switch + ctrl + espacio
		case 1:
			System.out.println("AGUILA");
			break;
		case 2:
			System.out.println("SOL");
			break;
		default:
			System.out.println("ERROR");
			break;
		}
		
		

	}

}
