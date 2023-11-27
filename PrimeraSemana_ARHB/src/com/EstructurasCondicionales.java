package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
	
	// Estructuras d decision if - valores booleanos
	// si es verdadero o es falso
	// && - AND - si ambas son correctas (x < 8 &&  x <5)
	// || - OR - que alguna de las dos condiciones se cumple (x < 9 || x <10)
	// !  - NOT - cambia la condicion a la inversa !(x < 9)
	// != - diferente de ... (x != 9)
	// == - si es igual ( x == 9)
		
		int x = 9;
		
		if (x < 10 && x > 5) {
		System.out.println("si");
	}else {
		System.out.println("no");
	}
		
		
		/*estructura if -else anidado o if else concatenado*/
		
		int volado = 1;
		if(volado == 1) {
			System.out.println("Aguila");
		}else if(volado == 2) {
			System.out.println("Sol");
		}else {
			System.out.println("Error");
}
		
		//SWITCH CASE - Sirve para ejecutar diferentes lineas de codigo
		// de acuerdo con el valor de una variable
		
	// switch ctrl+espacio enter
		
		switch (volado) {
		case 1:
			System.out.println("Aguila");
			break;
		case 2:
			System.out.println("Sol");
			break;
		default:
			System.out.println("Error");
	}
	}
	}