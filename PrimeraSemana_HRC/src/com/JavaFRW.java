package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader,
		// BufferedReader y File Writer
		
		//Lectura del archivo de prueba
		// Declaramos una varialbe donde guardar la linea de texto
		// que vamos a leer
		
		String linea;
		
		// La estructura try and catch es util para manejar o controlar
		// posibles excepciones que puedan surgir
		// Utilizada cuando hacemos conversiones de datos o accedemos a programas
		// externos para recuperar informacion 
		
		try {
			// Primero creamos una variable de la clase File que nos permite
			// tener una representacion de la ubicacion del archivo
			File archivo = new File("C:\\Users\\hrc_1\\Desktop\\fichero.txt");
			
			// vamos a preparar el archivo para leerlo
			FileReader fr = new FileReader(archivo);
			
					
			// Ahora vamos a leer el archivo o contenido
			@SuppressWarnings("resource")
			BufferedReader buffer = new BufferedReader(fr);
			
			// Procedemos a leer el contenido del archivo y lo gaurdamos en la linea de prueba
			// linea = buffer.readLine();
			
			//Si nuestro archivo tiene mas de una linea podemos crear un ciclo para leerlas
			
			while ((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			}
			
			// Imprimos en consola la linea
			// System.out.println(linea);
			
			
		} catch (Exception e) { // si algo falla, atrapamos la excepcion aqui
			// y entonces ejecutamos el siguiente bloque
			
			System.out.println("No se encontro el archivo");
		}
	

	}

}
