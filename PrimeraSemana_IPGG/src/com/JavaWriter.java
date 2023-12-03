package com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class JavaWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Uso de la clase FileWriter, para poder escribir en un archivo 
		
		String texto = "\nPrimera semana curso Java ya vamonos alv";

        // La estructura try-catch es útil para manejar o controlar posibles excepciones
        try {
            // Intentar ejecutar el siguiente bloque de código

            // Primero, creamos una variable de la clase File con la ruta del archivo
            File archivo = new File("C:\\Users\\dell\\Desktop\\FICHERO.txt");

            // Creamos un objeto FileWriter que representa el archivo
            FileWriter writer = new FileWriter(archivo, true);
            System.out.println("Su archivo ha sido sobre-escrito");
            
            // Escribimos el texto en el archivo
            writer.write(texto);

            // Cerramos el FileWriter
            writer.close();

        } catch (IOException e) {
            // Si algo falla durante la escritura del archivo, mostramos un mensaje de error
            e.printStackTrace();
            
        }
    }
} 