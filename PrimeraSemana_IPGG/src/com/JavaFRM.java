package com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFRM {

	public static void main(String[] args) {
		  // Uso de las clases File, FileReader, BufferedReader y FileWriter
        // Vamos a intentar la lectura del archivo de prueba llamado fichero.txt

        // Declarar una variable donde guardar la l�nea de texto que vamos a leer
        String linea;

        // La estructura try-catch es �til para manejar o controlar posibles excepciones
        try {
            // Intentar ejecutar el siguiente bloque de c�digo

            // Primero, creamos una variable de la clase File con la ruta del archivo
            File archivo = new File("C:\\Users\\dell\\Desktop\\FICHERO.txt");

            // Creamos un objeto FileReader que representa el archivo
            FileReader fr = new FileReader(archivo);

            // Creamos un objeto BufferedReader para leer l�neas de texto de manera eficiente
            BufferedReader br = new BufferedReader(fr);
            
            // Leemos la primera l�nea del archivo
            // si nuestro archivo tiene mas de una linea, pdoemos crear un ciclo para leerlas 
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            // Ahora ya una vez guardada esa informaci�n en una cadena, podemos mostrar en consola
            // la l�nea le�da del archivo //
            	//System.out.println(linea);
            	
            // Cerramos el BufferedReader y FileReader
            br.close();
            fr.close();

        } catch (IOException e) {
            // Si algo falla durante la lectura del archivo, mostramos un mensaje de error
            e.printStackTrace();
        } catch (Exception e) {
            // Si algo falla y no es una excepci�n espec�fica de E/S, mostramos un mensaje de error
            System.out.println("No se encuentra nombre");
        }
    }
}