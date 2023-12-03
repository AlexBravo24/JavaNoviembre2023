package condicionales;

import java.util.Scanner;

public class Condicionales1_pogm {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos números por teclado e indique cuál es
		//mayor o si son iguales.

        int num1, num2;
        
        Scanner n=new Scanner(System.in);
        
        System.out.println("Ingresar el primer numero: ");
        num1=n.nextInt();
        System.out.println("Ingresar el segundo numero: ");
        num2=n.nextInt();
        
        
        if (num1>num2) {
        	System.out.println(num1+ " Mayor " + num2);
        }
        else {
        	System.out.println(num2+ " Mayor " + num1);
        }
	    }

}
