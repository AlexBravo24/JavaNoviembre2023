package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de decision if evaluan Valores booleanos
		/*
		 * Si (esto es verdadero){ejecuta esto]
		 * si no lo es {ejecuta esto}
		 */
		
		int x = 9;
		
		if (x<10) {//si x es menor que 10 Ejecutamos:
			System.out.println("Si");
		}else {  //si lo anterior no es cierto o , de otro modo
			//ejecuta lo siguiente
			System.out.println("No");
			}
		
		//OPERADORES LOGICOS para condiciones compuestas
		//AND,OR,NOT, DIFERENTE DE, IGUALDAD
		
		System.out.println("Probando el operador AND");
		
		//AND - && Devuelve el valor true cuando se cumplen TODAS
		//las condiciones
		
		if (x<9 && x>5) {//si x es menor que 10 y x es menor a 5
			System.out.println("Si");
		}else {  //si lo anterior no es cierto o , de otro modo
			//ejecuta lo siguiente
			System.out.println("No");
			}
		
		System.out.println("Probando el operador OR");
		
		// OR - || devuelve True cuando se cumpla al menos una condicion

		if (x<9 || x>5) {//si x es menor que 10 o x es menor a 5
			System.out.println("Si");
		}else {  //si lo anterior no es cierto o , de otro modo
			//ejecuta lo siguiente
			System.out.println("No");
			}
		
		System.out.println("Probando el operador NOT");
		//NOT - ! Niega una condicion o mas bien, cambia la condicion de true a false
		// y viceversa
		
		
		if (!(x<8)) {//Una condicion que no es cierta la volvemos verdadera(o al reves)
			System.out.println("Si");
		}else {  //si lo anterior no es cierto o , de otro modo
			//ejecuta lo siguiente
			System.out.println("No");
			}
		
		System.out.println("Probando el operador diferente de");
		
		//DIFERENTE DE-  !=  Compara valores y manda True si son diferentes
		
		if (x!=20) {//si x es diferente de 
			System.out.println("Si");
		}else {  //si lo anterior no es cierto o , de otro modo
			//ejecuta lo siguiente
			System.out.println("No");
			}
		
		System.out.println("Probando el operador de igualdad");
		
		// IGUALDAD - == Compara dos valores y manda True cuando son iguales
		// Un solo igual en una variable es asignacion int x =10;
		// y el doble == es para comparar
		
		
		if (x==9) {//si x es igual a 
			System.out.println("Si");
		}else {  //si lo anterior no es cierto o , de otro modo
			//ejecuta lo siguiente
			System.out.println("No");
			}
				
		// Estructura if - else anidado o if else concatenado
		System.out.println("Probando una estructura if else anidada");
		int volado = 1;
		
		if (volado == 1) {
			System.out.println("AGUILA");
		}else if (volado==2) {
			System.out.println("SOL");
		} else {
			System.out.println("ERROR");
		}
		
		//SWITCH CASE - Sirve para ejecutar diferentes lineas de codigo
		// de acuerdo al cambio de valor de una variable
		
		System.out.println("Probando estructura SWITCH- CASE");
		switch (volado) { //la variable que se evalua segun cambie su valor
		case 1: System.out.println("Aguila"); //caso del valor que tenga asignado  
			      break;//ejecutamos el codigo	
		case 2:
			System.out.println("SOL");
			break;

		default:
			System.out.println("Error");
			break;
		}
		
		
	}

}
