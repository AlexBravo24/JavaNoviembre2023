package condicionales;

import java.util.Scanner;

public class Condicionales6_CRT {

	public static void main(String[] args) {
		
		/*
		 * La asociación de vinicultores tiene como política fijar un 
		 * precio inicial al kilo de uva, la cual se clasifica en tipos 
		 * (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta 
		 * del producto, ésta es de un sólo tipo y tamaño, se requiere 
		 * determinar cuánto recibirá un productor por la uva que entrega 
		 * en un embarque considerando lo siguiente: * Si es de tipo A, 
		 * se le cargan 20 céntimos al precio inicial cuando es de tamaño
		 *  1 y 30 céntimos si es de tamaño 2. * Si es de tipo B, se rebajan 
		 *  30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
		 *  tamaño 2. Precio inicial se recibe desde teclado
		 * */
		
		int tamano;
		String tipo;
		
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("Tipo de uva que se entregará en el embarque es A o B");
		tipo=entrada.nextLine();
		
		System.out.println("Introduce el tamaño de la uva 1 o 2");
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
