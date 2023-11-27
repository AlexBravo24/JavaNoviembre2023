package com;

import java.io.File;
import java.io.FileWriter;

public class JavaWritter {

	public static void main(String[] args) {
		
		//Uso de la clase FileWritter
		
		String texto="\nPrimera Semana";
try {
		
			File archivo= new File("C:\\Users\\jtina\\OneDrive\\Escritorio\\fichero.txt");
			
			FileWriter line = new FileWriter(archivo, true);
			
			line.write(texto);
			line.close();
			
		}catch(Exception e) {
			System.out.println("No se encontró el archivo o no puede leerse");
		}
		
	}

}
