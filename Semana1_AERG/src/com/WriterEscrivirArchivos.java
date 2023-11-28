package com;

import java.io.File;
import java.io.FileWriter;

public class WriterEscrivirArchivos 
{
/*FileWriter
 * Esta clase se usa para escribir archivos 
 */
	public static void main(String[] args) 
	{
		//Ejempo: escribir en el archivo fichero2		
		String text ="\n Semana 555 "; // "\n" indica un salto de linea desde el String
		
		try 
		{		
			//ubicamos el archivo que querimos escribir 
			// se puede remplazar por un String
			File direccion = new File("C:\\Users\\Angel\\Documents\\Ceteq-Nov-23\\Fichero2.txt");
			//String c = "C:\\Users\\Angel\\Documents\\Ceteq-Nov-23\\Fichero2.txt";
			
			//iniciamos el objeto FileWriter con el nombre escritor en la direccion anterior
			FileWriter escritor = new FileWriter(direccion,true);//la ",true" le indica no borra el texto que ya contiene 
		//   variable   objetp 		accion 												//el archivo. si lo quitamos borra todo el archivo y luego escribe
			
			//le damos la instruccion a 'escritor' de escribir lo que haya en 'text'			
			escritor.write(text);
			
			//para guardar lo cambios en el archivo hay que cerrar el objeto 'escritor'.
			escritor.close();
			
		} 
		catch (Exception e) 
		{
			System.out.println("No se encontro el archivo o no se pudo leer");
		}

	}

}
