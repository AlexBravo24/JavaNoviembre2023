package condicionales;
import java.util.Scanner;


public class Condicionales5_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
	    //* Otros casos -> NO ACEPTADA
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nota: ");
        int nota = scanner.nextInt();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().charAt(0); // El tipo de dato char en Java se utiliza para representar caracteres individuales.
        //En tu código específico, se utiliza char para representar el sexo del usuario (se espera que sea 'M' o 'F'):
        //En este caso, scanner.next().charAt(0) se utiliza para leer el primer carácter ingresado por el usuario y asignarlo a la variable sexo.
        //Esto asume que el usuario ingresará un único carácter (ya sea 'M' o 'F').
        //La función charAt(0) toma el primer carácter de la cadena ingresada.

        // Condición para verificar la aceptación de la solicitud
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA");
            } else {
                System.out.println("NO ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }

        // Cerrar el objeto Scanner
        scanner.close();
        

	}

}
