package condicionales;

import java.util.Scanner;

public class Condicionales7_AGZ {

	public static void main(String[] args) {
		/* 7. El director de una escuela est� organizando un viaje de estudios y requiere 
		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la 
		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 
		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 
		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
		determinar el pago a la compa��a de autobuses y lo que debe pagar cada 
		alumno por el viaje
		*/
		
		Scanner entrada = new Scanner(System.in);
		int x;
		int total;
		System.out.println("  �Cuanto pagara Cada alumno?");
		System.out.println("Ingresa el numero de Alumnos");
		x=entrada.nextInt(); //Asigno el numero de alumnos a variable x
		entrada.close(); //cierro el scanner para ahorrar memoria
	
		
		if (x>=100) { //evaluo cual es la condicion
			System.out.println("Los alumnos deben pagar $65");
			total=65*x;
			System.out.println("El total que debe pagar a la empresa es de $"+total);	
		} else if(x>=50 && x<=99) {
			System.out.println("Los alumnos deben pagar $70");
			total=70*x;
			System.out.println("El total que debe pagar a la empresa es de $"+total);
		} else if(x>=30 && x<= 49) {
			System.out.println("Los alumnos deben pagar $95");
			total=95*x;
			System.out.println("El total que debe pagar a la empresa es de $"+total);
		} else if(x<30) { 
			total=4000/x;
			System.out.println("Los alumnos deben pagar $"+total);
			System.out.println("El total que debe pagar a la empresa es de $4000");
		} else {
			System.out.println("ERROR");
		}
		
	}

}
