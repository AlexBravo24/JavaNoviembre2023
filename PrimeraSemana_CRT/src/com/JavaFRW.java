package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;

public class JavaFRW {

	public static void main(String[] args) {
		
		
		// Uso de las clases File, FileReader
		//BufferedReader y FileWrinter
		
		//Vamos a intentar realizar una lectura del archivo
		//de prueba llamado fichero.txt
		
		//Declarar una variable donde guardar la linea
		//de texto que vamos a leer
		
		String linea;
		
		//La estructura try and cathc es util para manejra y controlar
		//posivbles excepciones que puedan surgir
		//Esta es muy utilizada cuando se hacen conversiones de tipos de 
		//dato o accedemos a programar externos para recupera información
		//entre otros usos
		
		try {//intentar ejecutar el siguiente bloque de código
			//Primro creamos una variable de la clase File
			//que nos permite tener una representación de la ubivación del archivo
			File archivo = new File("C:\\Users\\User2023\\Desktop\\fichero.txt");
			//Una vez que ubicamos el archivo hay que abrirlo para prepararlo en modo de lectura 
			//con ayuda con FileReader
			FileReader fr = new FileReader(archivo);
			//para poder leer el archivo o el contenido
			//necesitamos a la clase BufferReader
			BufferedReader buffer = new BufferedReader(fr);
			
			//Procedemos a leer el contenido del archivo 
			//y guardamos la linea de prueba en nuestro string
			//declarado
			//Si nuestro archivo tiene más de una linea creamos un ciclo
			//para leerlas
			
			
			while ((linea=buffer.readLine()) !=null){
				System.out.println(linea);
			}
			//Una ves guardada la info en el string se puede mostrar
			//en la consola
//			System.out.println(linea);
		} catch (Exception e) {//Si algo falla, atrapamos la excepción aqui
			//Y entonces ejecutamos el siguiente bloque
			System.out.println("No se encontró el archivo o no puede leerse");
		}

	}

}
