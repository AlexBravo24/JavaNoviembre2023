package com;

import java.io.File;
import java.io.FileWriter;

public class JavaWrite {

	public static void main(String[] args) {
		//Uso de la clase FileWriter
		//Para poder escribir valores en un archivo
		
		//Vamos a guardar en un String un valor a
		//Para poder escribir valores en un archovo 
		
		//Vamos a guardar en un String un valor
		//ESCRIBIR NUESTRO ARCHIVO DE PRUEVA
		 
		String texto = "\nPrimera Semana Curso Java";
		
		//try and catch
		try {
			File archivo = new File ("C:\\Users\\Usuario\\Desktop\\FICHERO.txt");
			
			FileWriter line = new FileWriter(archivo);
			 
			line.write(texto);
			
			line.close();
		
		} catch (  Exception e ) 
		{
			
			System.out.println("No puede encontrar el archivo");
		}

	}

}
