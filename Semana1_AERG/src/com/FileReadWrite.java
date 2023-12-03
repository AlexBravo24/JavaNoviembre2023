package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadWrite 
{
//Metodos para Leer y Escribir archivos .txt
//esta accion coreponde a las clases BufferedReader y FileWrite
	
	
	public static void main(String[] args) 
	{
// Extraeremos un dato de un archivo de texto (ficharo.txt)
		String dato;		
				
		/*
		 * TRY and CATCH    -  metodo que se utiliza para manejar excepcione 
		 * a posibles error en un bloc de codigo.
		 */
		try //aisla el sig bloque de codigo
		{  
			//ubica el archivo de una direccion especifica
			//PUEDE SER REMPLASADO POR UN STRING CON LA DIRECCION
			File direccionAr = new File("C:\\Users\\Angel\\Documents\\Ceteq-Nov-23\\Fichero.txt");
			//String d = "C:\\Users\\Angel\\Documents\\Ceteq-Nov-23\\Fichero.txt"; 
			
			//lee el solo la linea 1 del archivo de la direccion señalada 
			FileReader archivo = new FileReader(direccionAr);
			
			//guarda lo leido por la funcion anterior 
			BufferedReader contenidoAr = new BufferedReader(archivo);
			
			dato=contenidoAr.readLine(); //guardamos lo leido en dato
				
			System.out.println(dato); // imprimimos dato
			System.out.println("------------------------------------");
			
			//Para leer varias lineas se puede usar un while
			while ((dato=contenidoAr.readLine()) !=null) 
			//el while anterio llena 'dato' con lo que 'contenidoAr' guardo
		    // del archivo. si el contenido el diferente de null pasara al bloque 
			// de aqui abajo y imprime 'dato'
			//mientra haya una siguinete linea de texto 
			//sigue leyendo e imprimiendo
			{
				System.out.println(dato);
			}
		} 
		catch (Exception e) //si algo falla atrapamis el error en la variable 'e' y ejecutamos el sig bloque 
		{ 
			System.out.println("No se encontro el archivo o no se pudo leer");
			e.printStackTrace(); //nos muestra en consola el error
		}
//________________________________________________________________________________________		
	}

}
