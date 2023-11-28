package com;

import java.io.File;
import java.io.FileWriter;

public class JavaWriter {

	public static void main(String[] args) {
		// Uso de la clase FileWriter
		// Para poder escribir valores en un archivo
		
		// Vamos a guardar en un String un valor a 
		// escribir en nuestro archivo de prueba
		
		String texto = "\nPrimera semana Curso Java";
		
		
		// try and catch
		try {
			File archivo = new File("C:\\Users\\Martin Viveros\\Desktop\\fichero.txt");
			
			//Vamos a escribir el valor de nuestra String con el uso de 
			// la clase FileWriter
			// y le pasamos el valor del archivo a escribir
			
			// Cuando pasamos el valor de archivo a escribir, debemos 
			//agregar un valor booleano "true" para que respete el contenido
			// escrito en el archivo original
			FileWriter line = new FileWriter (archivo, true);
			
			// Para escribir o almacenar el String en nuestro documento
			// Utilizamos el metodo .write
			
			line.write(texto);
			
			// Para guardar los cambios en el archivo de texto se tiene
			// que cerrar el objeto line
			line.close();
			
		} catch (Exception e) {
			System.out.println("no pudo encontrarse el archivo");
		}

	}

}
