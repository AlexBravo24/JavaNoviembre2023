package com;

import java.io.*;

public class javaWriter {

	public static void main(String[] args) {
		// Uso de la Clase FileWriter
		//para poder escribir valores en un archivo
		
		//vamos a guardar en un String un valor a escribir en nuestro archivo de prueba 
		String texto = "\nprimera semana en curso";
		try {
			File archivo = new File("C:\\Users\\PAUL\\Desktop\\fichero.txt.txt");
			
			//vamos a escribir en el valor de nuestro string con el uso de la clase FileWritwer
			//y le pasamos el valor del archivo a escribir
			//cuando le pasamos el valor al archivo a escribir debemos agregar un valor booleano "true" para que respete el contenido escrito
			//en el archivo
			FileWriter line = new FileWriter (archivo, true);
			//para escribir o almacenar el string en nuestro documento utilizamos en metoso .write
			line.write(texto);
			
			line.close();
		} catch (Exception e) {
			System.out.println("no puede encontrarse el archivo");
			// 
		}

	}

}
