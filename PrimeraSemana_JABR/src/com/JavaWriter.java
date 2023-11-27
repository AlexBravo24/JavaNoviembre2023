package com;

import java.io.File;
import java.io.FileWriter;

public class JavaWriter {

	public static void main(String[] args) {
		//Uso de la clase FileWriter
		//Para poder escribir valores en un archivo
		
		//Vamos a guardar en un String un valor a
		//escribir en nuestro archivo de prueba
		String texto = "\nPrimera Semana Curso Java";
		
		//try and catch
		try {
			File archivo = new File("C:\\Users\\Jorge Alejandro\\Desktop\\fichero.txt");
			
			//Vamos a escribir en el el valor de nuestro String con
			//el uso de la clase FileWriter
			//y le pasamos el valor del archivo a escribir
			//Cuando pasamos el valor del archivo a escribir, debemos
			//agregar un valor booleano "true" para que respete el contenido
			//escrito en el archivo original
			FileWriter line = new FileWriter(archivo, true);
			
			//Para escribir o almacenar el String en nuestro documento
			//utilizamos el método .write
			line.write(texto);
			//Para guardar los cambios en el archivo de texto
			//hay que cerrar el objeto line
			line.close();
			
			System.out.println("Su archivo ha sido sobreescrito");
		} catch (Exception e) {
			System.out.println("No puede encontrarse el archivo");
		}

	}

}
