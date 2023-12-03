package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		//Uso de las clases file,filereader
		//BufferedReader y FileWriter
		
		//Vamos a intentar realizar una lectura del archivo
		//de prueba llamado fichero
		
		//Declaramos una variable donde guardamos la linea 
		//de texto que vamos a leer 
		String linea;
		
		//Lestructura try and catch en util para manejar o controlar
		//posibles excepciones que puedan surgir
		//dato o accedemos a programar externos para recuperar informacion
		//entre otros usos
        
		
		try {//Intentar ejecutar el siguiente bloque de condigo
			//Primero creamos una variable de la clase file
			//que nos permite tener una representacion de la ubicasion
			//del archivo
		  File archivo= new File("C:\\Users\\Usuario\\Desktop\\FICHERO.txt");
		  //Una ves ubicado el archivo hay que abrir para 
		  //prepárarlo en modo de lectura con la ayuda del FileReasde
		  FileReader fr = new FileReader(archivo);
		  //para poder leer el archivo se tiene que abrir preparando en modo de lectura 
		  //con FileReader
		  
		  BufferedReader buffer = new BufferedReader(fr);
		  //Procedemos a leer el contenido del archivo o el contenido
		  //y guardamos linea de prueba en nuestro String declarando
		  //si nuestro archivo tiene mas de una linea
		  //podemos crear un ciclo para leerlas
		  while((linea=buffer.readLine())!=null) {
			  System.out.println(linea);
		  }
		  
		  linea=buffer.readLine();
		  //ahora ya una vez guardada la informacion EN EL String podemos mostrar 
		  //en consola
		  //System.out.println(linea);
		
		} catch(Exception e) {//Si algo falla atrapamos la excepcion 
			//y entonces ejecutamos el siguiente bloque 
			e.printStackTrace();//Este metodo nos ayuda a visualizar el error en consola
			System.out.println("No se encontro el archivo o no puede leerse");
		}
		}
	}


