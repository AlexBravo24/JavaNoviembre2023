package ciclos;

import java.util.Scanner;

public class Ciclo1_VSA {
	//1. Programa un algoritmo que realice la tabla de multiplicar del 12

	public static void main(String[] args) {

		int Multiplicando;
		System.out.println("¿Que tabla de multiplicar desea realizar?");
		Scanner valor1 = new Scanner(System.in);
		Multiplicando = valor1.nextInt();

		int multiplicador;
		for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println(Multiplicando + " X " + multiplicador + " = " + Multiplicando * multiplicador);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	//TODAS LAS TABLAS DE MULTIPLICAR DEL 1 AL 10
	//
//		for (int contador = 0; contador <= 10; contador++) {
//
//			for (int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
//
//				// System.out.println(contador * multiplicacion); //da un formato en vertical
//
//				// PARA FORMATO HORIZONTAL
//				System.out.print(contador * multiplicacion); // el puro print necesita el argumento,
//																// no soprota el vacío
//				System.out.print(" "); // imprime en una sola línea TODOS los resultados hasta terminar
//			}
//			// FUERA DEL CICLO ANIDADO
//			System.out.println(); // da un salto de línea, rompe la línea
//		}

	/*
	 * salida: 0 0 0 0 0 0 0 0 0 0 0 0 1 2 3 4 5 6 7 8 9 10 0 2 4 6 8 10 12 14 16 18
	 * 20 0 3 6 9 12 15 18 21 24 27 30 0 4 8 12 16 20 24 28 32 36 40 0 5 10 15 20 25
	 * 30 35 40 45 50 0 6 12 18 24 30 36 42 48 54 60 0 7 14 21 28 35 42 49 56 63 70
	 * 0 8 16 24 32 40 48 56 64 72 80 0 9 18 27 36 45 54 63 72 81 90 0 10 20 30 40
	 * 50 60 70 80 90 100
	 */
}
