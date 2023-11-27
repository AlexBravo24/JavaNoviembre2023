package com;

import java.io.File;
import java.io.FileWriter;

public class JavaWriter {

	public static void main(String[] args) {
		
		// Uso de la clase FileWriter
		//Para poder escribir valores en un archivo
		
		//Vamos a guardar en un String un valor a 
		//escribir en nuestro archivo de prueba 
		String texto = "\nPrimera semana Curso Java";
		
		//try and catch
		
		try {
			File archivo = new File ("C:\\Users\\Iván González\\Desktop\\Fichero.txt");
			
			//Vamos a escribir en el el valor de nuestro String con
			//el uso de la clase FileWriter
			//y le pasamos el valor del archivo a escribir
			FileWriter line = new FileWriter (archivo, true);
			
			//Para escribir se ocupa lo siguiente
			line.write(texto);
			
			//Para escribir o almacenar el string en nuestro documento
			//utilizamos el metodo .write
			line.close();
		} catch (Exception e) {
			System.out.println("No puede encontrarse el archivo");
		}
		

	}

}
