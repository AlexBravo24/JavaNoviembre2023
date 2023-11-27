package condicionales;

import java.util.Scanner;

public class Condicionales10_ARHB {

	public static void main(String[] args) {
		// 
		int diasEnMes;
		int numeroMes;
		
		Scanner entrada = new Scanner(System.in);
		
		
        // Solicitar al usuario que ingrese un n�mero entre 1 y 12
        System.out.print("Ingresa un n�mero entre 1 y 12 para representar un mes: ");
        numeroMes = entrada.nextInt();
        entrada.close();
        // Utilizar condicionales if-else para determinar el n�mero de d�as del mes
        if (numeroMes >= 1 && numeroMes <= 12) {
            

            // Evaluar el n�mero de d�as seg�n el mes ingresado
            
            if (numeroMes == 2) {
                diasEnMes = 28; // Febrero tiene 28 d�as 
            } else if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
                diasEnMes = 30; // Abril, junio, septiembre, noviembre tienen 30 d�as
            } else {
                diasEnMes = 31; // Los dem�s meses tienen 31 d�as
            }

            
            System.out.println("El mes " + numeroMes + " tiene " + diasEnMes + " d�as.");
        } else {
            System.out.println("N�mero inv�lido. Debe estar entre 1 y 12.");
        }

        
    }


	}


