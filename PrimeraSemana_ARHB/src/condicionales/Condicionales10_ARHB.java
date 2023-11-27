package condicionales;

import java.util.Scanner;

public class Condicionales10_ARHB {

	public static void main(String[] args) {
		// 
		int diasEnMes;
		int numeroMes;
		
		Scanner entrada = new Scanner(System.in);
		
		
        // Solicitar al usuario que ingrese un número entre 1 y 12
        System.out.print("Ingresa un número entre 1 y 12 para representar un mes: ");
        numeroMes = entrada.nextInt();
        entrada.close();
        // Utilizar condicionales if-else para determinar el número de días del mes
        if (numeroMes >= 1 && numeroMes <= 12) {
            

            // Evaluar el número de días según el mes ingresado
            
            if (numeroMes == 2) {
                diasEnMes = 28; // Febrero tiene 28 días 
            } else if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
                diasEnMes = 30; // Abril, junio, septiembre, noviembre tienen 30 días
            } else {
                diasEnMes = 31; // Los demás meses tienen 31 días
            }

            
            System.out.println("El mes " + numeroMes + " tiene " + diasEnMes + " días.");
        } else {
            System.out.println("Número inválido. Debe estar entre 1 y 12.");
        }

        
    }


	}


