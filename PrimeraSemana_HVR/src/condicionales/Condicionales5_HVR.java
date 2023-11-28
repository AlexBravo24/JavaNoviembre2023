package condicionales;

import java.util.Scanner;

public class Condicionales5_HVR {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptaci�n de una solicitud en base a
		//los siguientes par�metros: edad, nota y sexo.
		// M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
		// M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
		// Otros casos -> NO ACEPTADA
		
		int nota;
		int edad;
		String sexo;
		
		System.out.println("Ingresa tus datos para realizar tu solicitud");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu nota");
        nota = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingresa tu edad");
        edad = entrada.nextInt();
        entrada.nextLine();
                
        System.out.println("Sexo (f) femenino o (m) masculino");
        sexo = entrada.next();
        entrada.close();
        
               
        if (nota >= 5 && edad >= 18 && sexo.equals("f")) {
        	System.out.println("ACEPTADA");
        }else if(nota >= 5 && edad >= 18 && sexo.equals("m")) {
        	System.out.println("POSIBLE");
        }else {
        	System.out.println("NO ACEPTADO");
        }
        	
        }
        
        
	}


