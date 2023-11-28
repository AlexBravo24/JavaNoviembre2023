package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaWriter {

	public static void main(String[] args) {
		// 	Uso de la clase file Writer para poder escribir valores
		// en un archivo
		
		// Vamos a guardar un String un valor a escribir en nuestro texto
		// \n salto de linea en un string
		String texto = "\nPrimera Semana Curso Java";
		
		try {
			
			File archivo = new File("C:\\Users\\hrc_1\\Desktop\\fichero.txt");
			
			//Vamos a escribir en el el valor de nuestro String
			// Cuando pasamos el valor del archivo a escribir, debemos
			// agregar un valor booleano true para que se respete el contenido escrito
			// en el archivo principal
			FileWriter line = new FileWriter(archivo, true);
			
			// Para escribir o almacenar el String en nuestro documento utilizamo. write
			line.write(texto);

			//Para guardar los cambios en el archivo, hay que cerrar el objeto line
			line.close();
			
		} catch (Exception e) {
			
			// TODO: handle exception
			System.out.println("No se encontro el archivo");
		}

	}

}
