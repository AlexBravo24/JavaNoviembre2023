package ciclos;
import java.util.Scanner;

public class Ciclos2_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado,
		//hasta la iteraci�n deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario que ingrese el n�mero
        System.out.println("Introduce un n�mero para la tabla de multiplicar:");
        int numero = entrada.nextInt();

        // Solicitar al usuario que ingrese la iteraci�n deseada
        System.out.println("Introduce la iteraci�n deseada:");
        int iteracionDeseada = entrada.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + " hasta la iteraci�n " + iteracionDeseada + ":");

        for (int i = 1; i <= iteracionDeseada; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Cerrar el Scanner al final para evitar fugas de recursos
        entrada.close();

	}

}
