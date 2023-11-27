package condicionales;

import java.util.Scanner;

public class Condicionales3_AURC {

	public static void main(String[] args) {
		//.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		int x, y;
		Scanner result = new Scanner(System.in);

		System.out.println("Ingresa el primer numero :");
		x = result.nextInt();
		System.out.println("Ingresa el segundo numero :");
		y = result.nextInt();
		result.close();
			if(x == 0 | y == 0) {
				System.out.println("Error");
				}else{
					System.out.println("El resultado de la division entre el primer y segundo numero es :" + " " + x/y);
					}
			}
	}


