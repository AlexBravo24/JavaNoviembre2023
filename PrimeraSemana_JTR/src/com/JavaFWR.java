package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;

public class JavaFWR {

	public static void main(String[] args) {
		/*
		 * Uso de las clases File, FileReader
		 * BufferedReader y FileWriter
		 * 
		 * Lectura del archivo de prueba fichero.txt
		 * 
		 * Declarar una variable donde guardar la linea
		 * de texto que vamos a leer
		 * 
		 */

		String linea;
		
		try {
			
			//Declaracion de la variable File para ubicar al archivo
			File archivo= new File("C:\\Users\\jtina\\OneDrive\\Escritorio\\fichero.txt");
			//una vez ubicado el archivo, hay que abrirlo para
			//prepararlo en modo lectura, con FileReader
			
			FileReader fr = new FileReader(archivo);
			
			//Para poder lerr el contenido del archio se necesita
			//a la clase BufferedReader
			
			BufferedReader buffer= new BufferedReader(fr);
			
			//Procedemos a leer el contenido del archivo
			//y guardamos la linea de prueba en String declarado
			
			while((linea=buffer.readLine())!=null) {
				System.out.println(linea);
			}
			
			
			
			
		}catch(Exception e) {
			System.out.println("No se encontró el archivo o no puede leerse");
		}
		
	}

}
