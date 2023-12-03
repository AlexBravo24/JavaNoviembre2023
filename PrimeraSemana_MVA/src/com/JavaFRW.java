package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		// USO DE LAS CLASES File, FileReader
		//BufferedReader y FileWriter
		
		//Vamos a intentar realizar una lectura del archivo
		// de prueba llamado .txt
		
		//Declarar una variable donde guardar la linea
		// de texto que vamos a leer
		
		String linea;
		
		// la estructura try and catch es util para manejar o 
		//controlar posibles excepciones que puedan surgir
		
		// Esta es muy utilizada cuando se hacen conversionesde tipos 
		// de datos o accedemos a programas externos para recuperar
		//informacion, entre otros usos
		
		try {//intenta ejecutar el siguiente bloque de codigo
			//PRIMERO CREAMOS UNA VARIABLE DE LA CLASE file
			File archivo = new File("C:\\Users\\Martin Viveros\\Desktop\\fichero.txt");
			
			// Una vez ubicamos el archivo, hay que abrirlo para prepararlo en modo
			// lectura con ayuda de FileReader
			FileReader fr = new FileReader (archivo);
			
			// Para poder leer el contenido o el archivo
			//necesitamos a la clase BufferredReader
			
			BufferedReader buffer = new BufferedReader (fr);
			
			//procedemos a leer el contenido del archivo y lo guardamos en nuestro
			// string declarado
			// Si nuestro arcivo tiene mas de una linea 
			//Podemos crear un ciclo para leerlas
			
			
			//linea = buffer.readLine())
			
			while ((linea = buffer.readLine()) != null ) {
				System.out.println(linea);
			}
			
			//Ahora ya una vez guardada esa info en el String podemos 
			//mostrarla en consola
			
			
			
			
		} catch (Exception e) { //Si algo falla, atrapamos la excepcion
			// y entonces ejecutamos el siguiente bloque
			e.printStackTrace(); // nos ayuda a visualizar el error en consola
			System.out.println("No se encontro el archivo o no puede leerse");
			
		}

	}

}
