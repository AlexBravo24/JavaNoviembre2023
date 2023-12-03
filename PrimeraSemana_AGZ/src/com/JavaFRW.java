package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		/*Uso de las clases File, FileReader,BuferedReader
		 * y FileWriter
		 * Vamos a intentar realizar una lectura del archivo de prueba 
		 * llamado fichero.txt
		 * 
		 * Declaramos una variable donde guardara la linea
		 * de texto que vamos a leer
		 */
		String linea;
		
		/*La estructura try and cath es util para manejar o controlar
		 * posibles excepciones que puedan surgir
		 * esta es muy utilizada cuando se hacen conversiones de tipos
		 * de datos o accedemos a programas externos para recuperar
		 * informacion entre otros usos
		 */
		
		try {// intentar ejecutar el siguiente bloque de codigo 
			//primero creamos una variable clase File, copiamos la ruta del archivo y agregamos su nombre \\nombre.doc
			/*permite tener una representacion de la ubicacion del archivo*/
			
			File archivo = new File("C:\\Users\\Angellin\\Desktop\\fichero.txt");
			/*una vez ubicado el archivo, hay que abrirlo para
			 * recuperarlo en modo lectura, con ayuda de FileReader
			 */
			FileReader fr= new FileReader(archivo);
			//para poder leer el archivo o el contenido	
			//necesitamos a la clase buferedReader
			BufferedReader buffer= new BufferedReader(fr);
			//procedemos a leer el contenido del archivo
			//y guardamos la linea de prueba en nuestro String declarado
			//Si nuestro archivo tiene mas de una linea podemos crear
			//un ciclo para leerlas
			while ((linea=buffer.readLine()) !=null) {
				System.out.println(linea);
			}
			//linea=buffer.readLine();
			//Ahora una vez guardada la info en el String podemos mostrarla en consola
			//System.out.println(linea);
			
		} catch (Exception e) { // y si algo falla, atrapamos la excepcion aqui
			// y entonces ejecutamos el siguiente bloque
			e.printStackTrace();//este metodo mos ayuda a ver el error que se atrapo se va a imprimir en consola
			System.out.println("No se encontro el archivo o no puede leerse");
		}

		
		
	}

}
