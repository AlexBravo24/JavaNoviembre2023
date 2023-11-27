package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		//Clase Escaner: Introduciir valores para variables 
		//atraves del teclado
		
		byte edad;
		
		System.out.println("introduce tu edad"); //imprime en la consola
		
		//Para darle una valor recurrimos a la clase Scanner
		// le damos el nombre "entrada" a este Scaner
		 Scanner entrada = new Scanner(System.in);
		 //System.in  -  lee el valor en la consola 
		 //Scanner entrada = new Scanner() - inicia el Scaner "entrada" y le da el valor que lee en la consola

		 
		 edad = entrada.nextByte(); //asignamos a edad el valor que se guardo en "Scanner entrada"
		 
		System.out.println("tu edad es " + edad + " años");
		
		String nombre;
		
		entrada.nextLine(); //importante minutos 1:37 - consumir el enter 
		
		System.out.println("introduce tu nombre"); //imprime mensaje en consola
		
		nombre = entrada.nextLine();
		
		System.out.println("tu nombre es: "+nombre);
		
		entrada.close();//se cierra el escaner
		
		
//		//CTRL + 7 combierte en comentario todo lo que seleccionaste 
//		
//		
//		//Operador Modulo %
//		
//		int x = 10;
//		int y = 5;
//		
//		int resultado = x/y;
//		
//		int residuo = x%y;
//		
//		System.out.println("resultado: "+resultado);
//		System.out.println("residuo: "+residuo);
	}
	

}
