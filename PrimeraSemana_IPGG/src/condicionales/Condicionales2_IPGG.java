package condicionales;
import java.util.Scanner;

public class Condicionales2_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		 Scanner entrada = new Scanner(System.in);

	        // Solicitar al usuario que ingrese un número
	        System.out.println("Introduce un número:");
	        int numero = entrada.nextInt();

	        // Verificar si el número es par o impar
	        if (numero % 2 == 0) {
	            System.out.println("El número ingresado es par.");
	        } else {
	            System.out.println("El número ingresado es impar.");
	        }

	        // Cerrar el scanner para evitar fugas de recursos
	        entrada.close();
	    }
	}
