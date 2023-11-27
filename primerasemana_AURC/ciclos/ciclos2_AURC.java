package ciclos;
import java.util.Scanner;


public class ciclos2_AURC {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Introduce el número para la tabla de multiplicar: ");
	        int numero = input.nextInt();
	        System.out.print("Introduce el número de iteraciones: ");
	        int iteraciones = input.nextInt();
	        for (int i = 1; i <= iteraciones; i++) {
	            System.out.println(numero + " x " + i + " = " + numero * i);
	        }
	    }
	}

