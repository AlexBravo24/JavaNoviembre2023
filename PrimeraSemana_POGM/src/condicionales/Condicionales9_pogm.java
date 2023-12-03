package condicionales;

import java.util.Scanner;

public class Condicionales9_pogm {

	public static void main(String[] args) {
		//9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el díacorrespondiente. 
		//Si introducimos otro número nos da un error.

            Scanner leer =  new Scanner(System.in);
            int n;
            System.out.println("Ingresa un numero");
            n = leer.nextInt();
            if ( n == 1) {
            	System.out.println("Lunes");
            }
            else if (n == 2) {
            	System.out.println("Martes");
            	
            }
            else if (n == 3) {
            	System.out.println("Miercoles");
            	
            }
            else if (n == 4) {
            	System.out.println("jueves");
            	
            }
            else if (n == 5) {
            	System.out.println("Viernes");
            	
            }
            else if (n == 6) {
            	System.out.println("Sabado");
            	
            }
            else if (n == 7) {
            	System.out.println("Domingo");
            	
            }
            else {
            	System.out.println("El dia no existe");
            }
	}

}
