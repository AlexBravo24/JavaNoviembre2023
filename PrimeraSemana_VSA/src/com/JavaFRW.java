package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, File Reader, FileWriter
		// Realizando prueba con archivo fichero.txt
		// Declarar una variable donde guardar la linea de textoi que se va a leer

		String linea;

		/*
		 * la estructura try and catch es util para manejar o controlar posibles
		 * excepciones que puedan surgir esta es muy utilizada....
		 * 
		 */
		try { // intentar ejecutar el siguiente bloque de código
			File archivo = new File("C:\\Users\\HP\\Desktop\\fichero.txt");

			// ubicando el archivo, es hora de abrirlo para prepararlo en modo lectura:...
			FileReader fr = new FileReader(archivo);

			// para poder leer el contenido del archivo, se necesita la clase BufferedReader
			BufferedReader buffer = new BufferedReader(fr);

			// leyendo el contenido del archivo y guardamos en el String llamado línea
			//linea = buffer.readLine(); 
			
			

			// una vez guardarda la info en String abrimos consola
			//System.out.println(linea);  //solo devuelve el valor de la primera linea
			
			while ((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
			}

		} catch (Exception e) { // si algo falla, atrapamos la excepcion aqui
								// y entonces ejecutamos el siguiente bloque
			
			e.printStackTrace(); // aqui se guarda la falla

			System.out.println("El archivo no se encontró o no puede leerse");
		}

	}

}
