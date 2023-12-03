package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		
		// Uso de las clases File, FileReader
		//BufferedReader y FileWriter
		
		// Vamos a intentar realizar una lectura del archivo
		// de prueba llamado fichero txt.
		
		//Declarar una variable donde guardar la linea
		//de texto que vamos a leer
		
		String linea;
		
		//La estructura try and catch es util para manejar o controlar
		//posibles excepciones que puedan surgir
		//Esta es muy utilizada cuando se hacen conversiones de tipos de
		//datos o accedemos a programas externos para recuperar infromacion
		//entre otros usos
		
		try {//Intentar ejecutar el siguiente bloque de codigo
			 //Primero creamos una varible de la clase File
			//que nos permite tener una rapresentacionde la ubicacion
			//del archivo
			File archivo = new File ("C:\\Users\\Iván González\\Desktop\\Fichero.txt");
			//Una vez que ya ubicamos el archivo, hay que abrirlo para
			//prepararlo en modo de lectura, con la ayuda de FileReader
			FileReader fr = new FileReader (archivo);
			//Para poder leer el archivo o el contenido
			//necesitamos a la clase BufferedReader
			BufferedReader buffer = new BufferedReader(fr);
			
			//Procedemos a leer el contenido del archivo
			//y guardamos la linea de prueba en nuestro String declarado
			//Si nuestro archivo tiene mas de una linea 
			//podemos crear un ciclo para leerlas
			while ((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
			}
			//Ahora ya ina vez guardada esa info en el Strign podemos mostrar 
			//en consola
			//System.out.println(linea);
		} catch (Exception e) {//Si algo falla, atrapamos la excepcion 
			//y entonces ejecutamos el siguiente bloque
			e.printStackTrace();
			System.out.println("No se encontro el archivo o no puede leerse");
			
		}

	}

}
