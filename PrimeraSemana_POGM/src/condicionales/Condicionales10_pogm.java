package condicionales;

import java.util.Scanner;

public class Condicionales10_pogm {

	public static void main(String[] args) {
		// .Realiza un programa que pida un número entero entre uno y doce e imprima
		//el número de días que tiene el mes correspondiente. 
       Scanner leer = new Scanner(System.in);
       int n;
      
       System.out.println("Ingresar un numero: ");
       
       n = leer.nextInt();
       switch(n) {
       
       case 1:
    	   System.out.println( "enero");
    	   break;
    	   
       case 2:
    	   System.out.println( "febrero");
    	   break;
       case 3:
    	   System.out.println( "marzo");
    	   break;
    	   
       case 4:
    	   System.out.println( "abril");
    	   break;
       case 5:
    	   System.out.println( "mayo");
    	   break;
    	   
       case 6:
    	   System.out.println( "junio");
    	   break;
       case 7:
    	   System.out.println( "julio");
    	   break;
    	   
       case 8:
    	   System.out.println( "agosto");
    	   break;
       case 9:
    	   System.out.println( "septiempbre");
    	   break;
    	   
       case 10:
    	   System.out.println( "octubre");
    	   break;
       case 11:
    	   System.out.println( "noviembre");
    	   break;
    	   
       case 12:
    	   System.out.println( "diciembre");
    	   break;
    	   default:
    		   System.out.println("Ingresa un numero entre 1 y 12");
       }
       
	}

}
