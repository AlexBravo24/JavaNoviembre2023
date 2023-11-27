package com;

import java.io.File;
import java.io.FileWriter;

public class JavaWriter {

	public static void main(String[] args) {
		// Uso de la clase FileWriter
		//Uso para escribir en los archivos
		
		String texto = "\nPrimera Semana del curso";
		
		//Try an Catch
		try {
			File archivo = new File("C:\\Users\\razie\\Desktop\\fichero.txt");
			//Vamos escribir el valor de nuestro String 
			//con el uso de la clase FileWrite
			//Para respetar los datos del archivo original se puede agregar un valor boolean
			//true para no modificarlo 
			FileWriter line = new FileWriter(archivo, true);
			
			//Para escribir o almacenar el String en nuestro documento
			//utilizmaos el metodo .write
			line.write(texto);
			line.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No puede encontrarse el archivo");
		}
	}

}
