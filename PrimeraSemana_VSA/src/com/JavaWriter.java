package com;

import java.io.File;
import java.io.FileWriter;

public class JavaWriter {

	public static void main(String[] args) {
		// Uso de la clase FileWriter
		//Para poder escribir valores en un archivo
		
		//Guardamos en un string un valor a escribir en nuestro archivo de prueba
		
		String texto = "\nCETEQ. Primera semana Curso Java";
		System.out.println();
		
		try {
			File archivo = new File ("C:\\Users\\HP\\Desktop\\fichero.txt");
			
			FileWriter line = new FileWriter (archivo, true); //con true no sobreescribe, respeta lo ya escrito
			
			line.write(texto);
			
			line.close();
			
		}	catch  (Exception e) {
		
		}
		
		}
		
	}


