package condicionales;

import java.util.Scanner;

public class Condicionales5 {

	public static void main(String[] args) {
		/*5. Realiza un programa que calcule la aceptaci�n de una solicitud en base a
		los siguientes par�metros: edad, nota y sexo. 
		* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE 
		* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		Otros casos -> NO ACEPTADA*/ 

         Scanner tec = new Scanner(System.in);
         System.out.print("Ingresar el nombre: ");
         String nombre = tec.nextLine();
         System.out.print("Ingresar la nota: ");
         int nota = tec.nextInt();
         System.out.print("Ingresar la edad: ");
         int edad = tec.nextInt();
         System.out.print("Ingresar el sexo: ");
         String sexo = tec.nextLine();
         
         
         
         if (nota >5) {
        	 System.out.println("\t\t\t\t"+nombre + " ACEPTADA");
         }else {
        	 System.out.println("\t\t\t\t"+nombre + " NO ACEPTADA");
        	 
         }
         if (edad  >= 18) {
        	 System.out.println("\t\t\t\t"+edad + " ACEPTADA");
         }else {
        	 System.out.println("\t\t\t\t"+edad + " NO ACEPTADA");
        	 
         }
	}
	}


