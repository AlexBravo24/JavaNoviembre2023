package com;

import java.io.File;
import java.io.FileWriter;

public class JavaWriter {
	
	public static void main(String[] args) {
		
		//Uso de la clase FileWriter
		//para poder escribir valores en un archivo
		
		//vamos a guardar en un string un valor a
		//escribir en nuestro archivo de prueba
		
		String texto = "\nPrimera semana java";
		
		//try and catch
		
		try {
			
			File archivo = new File("C:\\Users\\Ravad\\OneDrive\\Desktop\\fichero.txt.txt");
			
			//vamos a escribir en el el valor de nuestro string
			//el uso de la clase FileWritter
			// y le pasamos el valor de archivo a escribir
			FileWriter line= new FileWriter(archivo, true);
			
			
			//para escribir o almacenar el string en nuestro documento
			//utilizamos el metodo .write
			
			line.write(texto); //no lo confirma, como si no se tocara ctrl g
			// para guardar los cambios en el archivo de texto hay que cerrar el objeto line
			line.close();
			
		} catch (Exception e) {
			System.out.println("no se encuentra el archivo");
		}
	}

}
