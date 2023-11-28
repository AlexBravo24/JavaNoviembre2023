package condicionales;

import java.util.Scanner;

public class Condicionales7_JTR {

	public static void main(String[] args) {
		//

		double alumnos, reunido;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce numero de alumnos:");
		alumnos=entrada.nextFloat();
		entrada.close();
		if(alumnos>=100) {
			System.out.println("Cantidad a cobrar por alumno: 65 euros");
			System.out.println("Cantidad reunida = $"+(65*alumnos));
		} else if(alumnos>=50 && alumnos <=99) {
			System.out.println("Cantidad a cobrar por alumno: 70 euros");
			reunido=70*alumnos;
			System.out.println("Cantidad reunida = $"+(70*alumnos));
			System.out.println("Cantidad a pagar a la compañia: $"+(4000-reunido));
		} else if(alumnos>=30 && alumnos <=49) {
			System.out.println("Cantidad a cobrar por alumno: 95 euros");
			reunido=95*alumnos;
			System.out.println("Cantidad reunida = $"+(95*alumnos));
			System.out.println("Cantidad a pagar a la compañia: $"+(4000-reunido));
		}  else if(alumnos<30) {
			System.out.println("Cantidad a cobrar por alumno: $"+(4000/alumnos));
			System.out.println("Cantidad reunida = $"+((4000/alumnos)*alumnos));
		}
		
	}

}
