package condicionales;

import java.util.Scanner;

public class Condicionales9_AURC {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce un número del 1 al 7 para saber el día de la semana correspondiente:");
	        int num = sc.nextInt();
	        String dia;
	        switch (num) {
	            case 1:
	                dia = "Lunes";
	                break;
	            case 2:
	                dia = "Martes";
	                break;
	            case 3:
	                dia = "Miércoles";
	                break;
	            case 4:
	                dia = "Jueves";
	                break;
	            case 5:
	                dia = "Viernes";
	                break;
	            case 6:
	                dia = "Sábado";
	                break;
	            case 7:
	                dia = "Domingo";
	                break;
	            default:
	                dia = "Error";
	                break;
	        }
	        System.out.println("El día correspondiente es: " + dia);
	    }
	}

