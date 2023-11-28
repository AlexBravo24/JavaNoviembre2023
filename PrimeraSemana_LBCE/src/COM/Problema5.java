package COM;

import java.util.Scanner;

public class Problema5 {
	 public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario que ingrese la edad, nota y sexo
	        System.out.print("Ingresa la edad: ");
	        int edad = scanner.nextInt();

	        System.out.print("Ingresa la nota: ");
	        double nota = scanner.nextDouble();

	        System.out.print("Ingresa el sexo (M/F): ");
	        char sexo = scanner.next().charAt(0);

	        // Verificar la aceptación de la solicitud
	        if (nota >= 5 && edad >= 18) {
	            if (sexo == 'M') {
	                System.out.println("La solicitud es POSIBLE.");
	            } else if (sexo == 'F') {
	                System.out.println("La solicitud es ACEPTADA.");
	            } else {
	                System.out.println("La solicitud NO es ACEPTADA.");
	            }
	        } else {
	            System.out.println("La solicitud NO es ACEPTADA.");
	        }

	        // Cerrar el scanner para evitar fugas de recursos
	        scanner.close();
	    }
	
}
