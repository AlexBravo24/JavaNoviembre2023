package condicionales;
import java.util.Scanner;

public class Condicionales3_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
		// Si el segundo número es 0, debe mostrar un mensaje de error.
		  Scanner entrada = new Scanner(System.in);

	        // Solicitar al usuario que ingrese el primer número
	        System.out.println("Introduce el primer número:");
	        int primero = entrada.nextInt();

	        // Solicitar al usuario que ingrese el segundo número
	        System.out.println("Introduce el segundo número:");
	        int segundo = entrada.nextInt();

	        // Verificar si el divisor (segundo número) es cero
	        if (segundo == 0) {
	            System.out.println("Error: No se puede dividir entre cero.");
	        } else {
	            // Realizar la división si el segundo número no es cero
	            double resultado = (double) primero / segundo;
	            System.out.println("El resultado de la división es: " + resultado);
	        }

	        // Cerrar el Scanner al final para evitar fugas de recursos
	        entrada.close();
     
	 }
}
