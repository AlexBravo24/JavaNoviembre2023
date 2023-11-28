package condicionales;

import java.util.Scanner;

public class Condicionales3_AERG {
	
	//3.Crea un programa que pida al usuario dos números y muestre el resultado 
	//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.

	public static void main(String[] args) 
	{
		float den;
		float sor;
		
		Scanner scn = new Scanner(System.in);//Iniciamos Scanner
		
		System.out.println();
		System.out.println("Digita dos numeros para saber su divicion"); //Escrbimos intruccion 
		System.out.println("Digita el numero que quieres dividir"); //Escrbimos instruccion 
		
		den = scn.nextFloat();
		
		if(den == 0 ){
			System.out.println("Error: 0 no es un numero divisible... ");
			main(null); 
		}else {
			System.out.println("Entre que numero quieres dividir?");
			sor = scn.nextFloat();
			
			if (sor == 0) {
				System.out.println("Error: 0 no es un numero con el que puedas dividir... ");
				main(null);
			} else {
				System.out.println("El resultado es: "+den/sor);
			}
			main(null);
		}
		

	}

}
