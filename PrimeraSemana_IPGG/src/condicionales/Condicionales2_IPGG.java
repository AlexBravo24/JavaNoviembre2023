package condicionales;
import java.util.Scanner;

public class Condicionales2_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
		 Scanner entrada = new Scanner(System.in);

	        // Solicitar al usuario que ingrese un n�mero
	        System.out.println("Introduce un n�mero:");
	        int numero = entrada.nextInt();

	        // Verificar si el n�mero es par o impar
	        if (numero % 2 == 0) {
	            System.out.println("El n�mero ingresado es par.");
	        } else {
	            System.out.println("El n�mero ingresado es impar.");
	        }

	        // Cerrar el scanner para evitar fugas de recursos
	        entrada.close();
	    }
	}
