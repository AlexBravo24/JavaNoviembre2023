package condicionales;

import java.util.Scanner;

public class Condicionales51_IAGO {

	public static void main(String[] args) {
		
		// Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA
		
		int nota = 5;
		int edad = 18;
		String sexo;
		
		// Crear un nuevo Scanner de entrada
        Scanner entrada = new Scanner(System.in);

        // Ingrsar la nota 
        System.out.print("Ingresa la nota: ");
        nota = entrada.nextInt();
        entrada.nextLine();

        // Ingresar el la edad
        System.out.print("Ingresa la edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        
     // Ingresar el sexo
        System.out.print("Ingresa el sexo: (f)Femenino o (m)Masculino ");
        sexo = entrada.next();
        entrada.close();
        
        if(nota>=5 && edad <=18 && sexo.equals("f")) {
        	System.out.println("ACEPTADA");
        }else if (nota <= 5 && edad >= 18 && sexo.equals("m")) {
        	System.out.println("POSIBLE");
        }else {
        	System.out.println("NO ACEPTADO");
        }

	}

}
