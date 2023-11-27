package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class JavaFRW {

	public static void main(String[] args) {
		// File, Read, Write
		// 	Uso de la clases FileReader,BufferReader y FileWrite
		//Intentar una lectura de un archivo llamado fichero.txt
		
		//declarar uuna variable donde guardar la linea de texto que vamos a leer
		
		String linea;
		
		//La estrutura try and catch es util para manejar o controlar posibles excepciones que puedan 
		//surgir. Esta es muy utilizada cuando se hacen conversiones de tipos de dato
		//o accedemos a porgramas externos para recuperar informacion entre otros usos
		
		try {//intenta ejecutar el siguiente bloque de codigo
			//Pirmero creamos una variable de la clase file que nos permite tener una
			//ubicacion del archivo
			File archivo = new File("C:\\Users\\razie\\Desktop\\fichero.txt");
			//UNa vez ubicado el archivo, se tiene que abrir preparando en mido de lectura
			//con FileReader
			FileReader fr = new FileReader(archivo);
			//Para poder leer el archivo o el contenido, necesitamos la clase BufferReader
			BufferedReader buffer = new BufferedReader(fr);
			//Procedemos a leer el contenido del archivo
			//Y guaardamosla linea de prueba en nuestro String declarado
			//Si nuestro archivo tiene mas de una linea, se puede crear un ciclo para leer
			//para dos lineas
			
			while ((linea=buffer.readLine()) !=null){
			System.out.println(linea);
			}
			//configuracion para una sola linea
			//System.out.println(linea);
			
		} catch (IOException e) {// si algo falla, atrapos la excepcion aqui 
			// Y entonces ejecutamos el siguiente bloque, permite ejecutar el programa
			e.printStackTrace();
			System.out.println("NO PUEDE LEERSE O ABRIRSE EL ARCHIVO");
		}
		
		
	}

}
