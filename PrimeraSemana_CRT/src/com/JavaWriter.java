package com;
import java.io.File;
import java.io.FileWriter;

public class JavaWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vamos a guardar en un string un valor a
		//escrivier en nuestro archivo de prueba
		String texto = "\nPrimera Semama Curso Java";
		
		//try and catch 
		try {
			File archivo = new File("C:\\Users\\User2023\\Desktop\\fichero.txt");
			//Vamos a escribir en el valor de nustro stringo con
			//el uso de la clase FileWriter
			//y le pasamos el valor del archivo a escribir
			//Cuando pasamos el valor del archivo a escribir, debemos
			//agregar un valor booleano
			FileWriter line = new FileWriter(archivo, true);
			
			//Para escribir o almacenar el String en nuestro ducumento
			//Utilizamos el metodo .write
			line.write(texto);
			//Para guardar los cambios en el archivo de texto
			//hay que cerrar el objeto line
			line.close();
			
			System.out.println("Su archivo ha sido modificado");
		} catch (Exception e) {//Si algo falla, atrapamos la excepción aqui
			//Y entonces ejecutamos el siguiente bloque
			System.out.println("No se encontró el archivo o no puede leerse");
		}
		
		
		

	}

}
