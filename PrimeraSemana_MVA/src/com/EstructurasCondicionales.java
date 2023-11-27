package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//estructuras de decision - if - valores booleanos
		/*si (esto es verdadero){
		 *ejecuta esto
		 *} 
		 *si no lo es{
		 *ejecuta esto
		 *}
		 *
		 */
		int x = 9;
		
		if (x>10) {//si x es mayor que 10
			//ejecutamos este codigo
			System.out.println("si");
		}
		else {// Si lo anterior no es cierto o de otro modo
			//Ejecuta lo siguiente
			
			System.out.println("no");
		}
		
		//OPERADORES LOGICOS PARA CONDICIONES COMPUESTAS
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD 
		
		//AND  &&
		System.out.println("PROBANDO OPERADOR AND");
		if (x<9 && x>5) {
			System.out.println("si");
		}
		else {
			System.out.println("no");
		}
		
		//OR || - Devuelve true cuando se cumpla al menos una condicion
		System.out.println("PROBANDO OPERADOR OR");
		if (x<9 || x>5) {
			System.out.println("si");
		}
		else {
			System.out.println("no");
		}
		System.out.println("PROBANDO EL OPERADOR NOT");
		// NOT - ! - Niega una condicion o la invierte
		if (!(x<15)) {
			System.out.println("si");
		}
		else {
			System.out.println("no");
		}
		
		System.out.println("PROBANDO EL OPERADOR DIF DE ");
		//DIFERENTE DE != - Compara los valores y manda true si es diferente
		if (x!=9) {
			System.out.println("si");
		}
		else {
			System.out.println("no");
		}
		System.out.println("PROBANDO EL OPERADOR IGUALDAD ");
		// IGUALDAD  == - Compara los valores y manda true si es IGUAL
		if (x==9) {
			System.out.println("si");
		}
		else {
			System.out.println("no");
		}
		
		//IF ELSE ANIDADA
		System.out.println("probando la estructura if - else");
		int volado = 2;
		
		if (volado ==1) {
			System.out.println("Aguila");
		}
		else if (volado == 2) {
			System.out.println("sol");
		}
		else {
			System.out.println("error");
		}
		
		//SWITCH CASE
		//SIRVE PARA EJECUTAR DIFERENTES LINEAS DE CODIGO DE ACUERDO 
		//AL CAMBIO DE VALOR DE UNA VARIABLE
		System.out.println("PROBANDO SWITCH CASE");
		
		switch (volado) {
		case 1:
			System.out.println("aguila");
			break;
		case 2: 
			System.out.println("sol");
			
		default:
			System.out.println("error");
			break;
		}
		
		
	} //llave de main
}//llave de clase
