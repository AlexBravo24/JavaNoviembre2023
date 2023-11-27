package condicionales;

import java.util.Scanner;

public class Condicionales3_ARHB {

	public static void main(String[] args) {
		/*3.-Crea un programa que pida al usuario dos números y muestre el resultado 
			de su división. Si el segundo número es 0, debe mostrar un mensaje de error*/
		
		int div1;
		int div2;
		
		
		System.out.println("Ingresa dos numeros para saber su division:");
		System.out.println("Ingresa el primer numero:");
		Scanner entrada = new Scanner(System.in);
		div1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Ingresa el segundo numero");
		div2 = entrada.nextInt();
		entrada.close();
		
		
		if(div2 == 0) {
			System.out.println("Error, el segundo numero es 0, imposible dividir");
		}else {
			System.out.println("El resultado de la divison es: "+ (div1/div2));
		}
		
		
	}

}
