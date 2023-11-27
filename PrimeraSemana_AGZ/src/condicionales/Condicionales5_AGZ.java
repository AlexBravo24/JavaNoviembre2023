package condicionales;

import java.util.Scanner;

public class Condicionales5_AGZ {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a 
		//los siguientes parámetros: edad, nota y sexo.
		Scanner entrada = new Scanner (System.in);
		int edad;
		int nota;
		String sexo;
//		char sexo;      //usar char en lugar de string
		System.out.println("     SOLICITUD");
		System.out.println("Ingresa tu edad:");
		edad = entrada.nextInt();
		System.out.println("Ingresa tu nota:");
		nota = entrada.nextInt();
		System.out.println("Ingresa tu sexo M/F:");
	    //sexo = entrada.next().charAt(0);
		sexo=entrada.next();
		
		entrada.close();//cierro el scanner para ahorrar memoria		
//	    if (edad==18 && nota >= 5 && sexo=='m') {    // tambien podria hacerse asi? duda en la comparacion de char
//			System.out.println("POSIBLE");
//		}else {  //si lo anterior no es cierto o , de otro modo
//			//ejecuta lo siguiente
//			System.out.println("NO ACEPTADA");
//			}
	    if (sexo.equalsIgnoreCase("m")) {  //se evalua si es masculino
	    	
	    	if (edad==18 && nota >= 5) {
				System.out.println("POSIBLE");
			}else {   //sino entonces no cumple los requisitos para el sexo masculino
				System.out.println("NO ACEPTADA");
				}
			
		} else if (sexo.equalsIgnoreCase("F")) { //se evalua si es femenino 
			if (edad==18 && nota >= 5) {
				System.out.println("ACEPTADA");
			}else {  //sino entonces no cumple los requisitos para el sexo femenino
				System.out.println("NO ACEPTADA");
				}
            }
		
	}

}
