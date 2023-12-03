package condicionales;

import java.util.Scanner;

public class Condicionales6_CRT {

	public static void main(String[] args) {
		
		/*
		 * La asociaci�n de vinicultores tiene como pol�tica fijar un 
		 * precio inicial al kilo de uva, la cual se clasifica en tipos 
		 * (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta 
		 * del producto, �sta es de un s�lo tipo y tama�o, se requiere 
		 * determinar cu�nto recibir� un productor por la uva que entrega 
		 * en un embarque considerando lo siguiente: * Si es de tipo A, 
		 * se le cargan 20 c�ntimos al precio inicial cuando es de tama�o
		 *  1 y 30 c�ntimos si es de tama�o 2. * Si es de tipo B, se rebajan 
		 *  30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
		 *  tama�o 2. Precio inicial se recibe desde teclado
		 * */
		
		int tamano;
		String tipo;
		
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("Tipo de uva que se entregar� en el embarque es A o B");
		tipo=entrada.nextLine();
		
		System.out.println("Introduce el tama�o de la uva 1 o 2");
		tamano=entrada.nextInt();
		
		entrada.close();
		
		if (tipo.equals("A") && tamano == 1 ) {
			System.out.println("En el embarque se le carga 20 centimos");
		} else if(tipo.equals("A") && tamano == 2 ) {
			System.out.println("En el embarque se le carga 30 centimos");
		} else if(tipo.equals("B") && tamano == 1 ) {
			System.out.println("En el embarque se le rebaja 30 centimos");
		} else if(tipo.equals("B") && tamano == 2 ) {
			System.out.println("En el embarque se le rebaja 50 centimos");
		} else {
			System.out.println("Datos mal capturados");
		}

	}

}
