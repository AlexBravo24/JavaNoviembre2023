package condicionales;

import java.util.Scanner;

public class Condicionales8_JTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero obtenido:");
		num=entrada.nextInt();
		entrada.close();
		if(num<1 || num>6) {
			System.out.println("ERROR: numero incorrecto");
		} 
		else {
			switch (num) {
			case 1:
				System.out.println("SEIS");
				break;
			case 2:
				System.out.println("CINCO");
				break;	
			case 3:
				System.out.println("CUATRO");
				break;	
			case 4:
				System.out.println("TRES");
				break;	
			case 5:
				System.out.println("DOS");
				break;	
			case 6:
				System.out.println("UNO");
				break;	
			}
			
		}
	}

}
