package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class javaFRW {

	public static void main(String[] args) {
		
		// Uso de las Clases File, FileReader, BufferedReader y FileWriter
		
		//vsmos a intentar realizar la lectura del archivo de prueba llamdo fichero.txt
		//declarar una variable donde guardar la linea de texto que vamos a leer 
		String linea;
		
		/*la estructura try and catch es utili para manejar o controlar posibles que pueda ocurrir
		 * esta es muy utilizada cuando se hacen converisones de tipos de datos o accedemos a programas externos 
		 * para recuperar informacion entre otros usos
		 * 
		 */
		try {//intenta ejecutar el siguiente bloque de codigo primero creamos una variable de la clase file
			//que nos permite tener una representacion del archivo 
			File archivo = new File("C:\\Users\\PAUL\\Desktop\\fichero.txt.txt");
			//una vez ubicamos el archivo, ahi que abrirlo para preparlo en modo lectura , con la ayuda de Fileread
			FileReader fr = new FileReader(archivo);
			//para poder leer el archivo o el contenido 
			//necesitamos a la clase BufferedReader
			BufferedReader buffer = new BufferedReader (fr);
			
			//procedemos a leer el contenido del archivo y guardamos la linea de preba en nuestro String declarado
			//si nuestro archivo tiene mas lineas podemos crear un ciclo para leerlas
			while((linea=buffer.readLine()) !=null) {
				System.out.println(linea);
			}
			//ahora ya guardada es ainfo en el String podemos mostrar la en el archivo en la consola
			//System.out.println(linea);
					
		} catch (Exception e) {//si algo falla ztrapamos la excepcion 
			// y entonces ejecutamos el siguiente bloque
			e.printStackTrace();// este metodo nos ayuda a visualisar el error en consola
			System.out.println("no se encontro el archivo o no puede leerse");
			
		}

	}

}
