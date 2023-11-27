package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		
		// Uso de las clases  File, FileReader 
		//BufferedReader y FileWriter
		
		//Vamos a intentar realizar una lectura del archivo 
		//de prueba llamado fichero.txt
		
		//Declarar una variable donde guardar la linea 
		//de texto que vamos a leer
		String linea; 
		
		//La estructura try and catch es util para manejar o controlar 
		//posibles excepciones que puedan surgir 
		//Esta es  muy utilizada cuando se hacen conversiones de tipos de 
		//dato o accedemos a programas externos para recuperar informacion
		//entre otros usos
		
		try {//Intentar ejecutar el siguiente bloque de codigo 
			//Primero creamoa una variable de la clase file que nos permite tener una
			//ubicacion del archivo
			File archivo = new File ("C:\\Users\\humbe\\OneDrive\\Escritorio\\fichero.txt.txt");
			//Una vez ubicamos el archivo, hay que abrirlo para 
			//prepararlo en modo de lectura, con la ayuda de FileReader
			
			FileReader fr = new FileReader (archivo);
			
			//Una vez ubicado el archivo o el contenido, necesitamos la clase BufferReader
			BufferedReader buffer = new BufferedReader(fr);
			//Procedemos a leer el contenido del archivo
			//y guardasmos la linea de prueba en nuestro String declarado
//			linea=buffer.readLine();
			//Si nuestro archivo tiene mas de una linea podemos crar un ciclo para leerlas
			
			while ((linea=buffer.readLine())!=null){
		    System.out.println(linea);
     }
			
//			System.out.println(linea);
			} catch (Exception e) {//Si algo falla, atrapamos la excepcion aqui 
			//Y entonces ejecutamos el siguiente bloque
			e.printStackTrace();//Este metodo nos ayuda a visualizar el erros en consola
			System.out.println("El archivo no se encontro no puede leerse");
		}

	}

}
