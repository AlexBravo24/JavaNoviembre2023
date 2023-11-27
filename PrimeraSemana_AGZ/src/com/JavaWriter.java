package com;import java.io.File;
import java.io.FileWriter;

public class JavaWriter {

	public static void main(String[] args) {
		/*El uso de la clase FileWriter para poder escribir en un
		 * archivo
		 * Vamos a guardaren un String un valor a esctribir en 
		 * el archivo de prueba
		 */
		String texto ="\nPrimera semana Curso de Java";
		try {
			File archivo = new File("C:\\Users\\Angellin\\Desktop\\fichero.txt");
			//escribir en el el valor del String con el uso de la clase FileWriter
			/*y le pasamos el valor del archivo a escribir
			 * 
			 * cuando pasamos el valor del archivo a escribir, debemos agregar un 
			 * valor booleanno"true" para que respete el contenido escrito en el 
			 * archivo original
			 */
			//FileWriter line = new FileWriter(archivo);
			FileWriter line = new FileWriter(archivo,true);
			
			//para escribir o almacenar el String en nuestro documento
			//Utilizamos el metodo .write
			line.write(texto);
			//Para guardar los cambios en el archivo de txt hay que cerrar
			//el objeto line
			line.close();
			
		} catch (Exception e) {
			System.out.println("No se encontro el archivo o no puede leerse");
		}
		
		
		
	}

}
