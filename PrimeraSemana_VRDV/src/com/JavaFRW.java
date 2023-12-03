package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		
		// uso de las clases file, filereader
		//bufferReader y FileWriter
		
		//vamos a intentar realizar una lectura del archivo de 
		//prueba llamado fichero.txt
		
		//Primero vamos a declarar una variable donde guardar la linea
		//de texto que vamos a leer
		
		String linea;
		
		//la estructura try and catch es util para manejar o controlar
		//posibles excepciones que puedan surgir
		//esta es muy utilizada cuando se hacen conversioens de tipos de datos
		// o accedemos a programas externos para recuperar informacion
		// entre otros usos

		try { //intentar ejecura el siguiente bloque de codigo
				// primero creamos una variable de la clase file
			//que nos permita tener una representacion de la ubicacion
			//del archivo
			File archivo = new File("C:\\Users\\Ravad\\OneDrive\\Desktop\\fichero.txt.txt");
			//una vez que ubicamoes el archivo, hay que abrirlo para
			//preprararlo en modeo de lectura, con la ayuda de fileREader
			
			FileReader fr = new FileReader(archivo);
			//para poder leer el archivo o el contenido
			//necesitamos a la clase bufferedReader
			BufferedReader buffer = new BufferedReader(fr);
			
			//procedemos a leer el contenido del archivo
			//y guardamos la linea de prueba en nuestro String declarado
			//linea = buffer.readLine();
			//ahora una vez guardada esa info en el string podemos mostrala en consola
			
			while ((linea=buffer.readLine()) != null) {
				
				System.out.println(linea);
				
				
			}
			
			
			//System.out.println(linea);
			
		} catch (Exception e) { // si algo falla intentamos atrapar la excepcion aqui
			// y entonces ejecutamos el siguiente bloque
			e.printStackTrace();// aqui se guarda la falla
			System.out.println("no se encontro el archivo o no puede leerse");
			
		}
	}

}
