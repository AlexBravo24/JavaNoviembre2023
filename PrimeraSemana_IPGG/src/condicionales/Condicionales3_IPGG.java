package condicionales;
import java.util.Scanner;

public class Condicionales3_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. 
		// Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		  Scanner entrada = new Scanner(System.in);

	        // Solicitar al usuario que ingrese el primer n�mero
	        System.out.println("Introduce el primer n�mero:");
	        int primero = entrada.nextInt();

	        // Solicitar al usuario que ingrese el segundo n�mero
	        System.out.println("Introduce el segundo n�mero:");
	        int segundo = entrada.nextInt();

	        // Verificar si el divisor (segundo n�mero) es cero
	        if (segundo == 0) {
	            System.out.println("Error: No se puede dividir entre cero.");
	        } else {
	            // Realizar la divisi�n si el segundo n�mero no es cero
	            double resultado = (double) primero / segundo;
	            System.out.println("El resultado de la divisi�n es: " + resultado);
	        }

	        // Cerrar el Scanner al final para evitar fugas de recursos
	        entrada.close();
     
	 }
}
