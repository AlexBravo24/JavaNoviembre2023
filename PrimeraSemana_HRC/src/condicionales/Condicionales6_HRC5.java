package condicionales;

import java.util.Scanner;

public class Condicionales6_HRC5 {

	public static void main(String[] args) {
		/* La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo
		de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
		Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se
		requiere determinar cu�nto recibir� un productor por la uva que entrega en un
		embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20
		c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de
		tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y
		50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado*/
		
		String tipo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el tipo (A/B):");
		tipo = entrada.nextLine();

		int tamano;
		entrada.nextLine(); // Consumir espacio volando
		System.out.println("Introduce el tamano (1/2):");
		tamano = entrada.nextInt();

		entrada.close(); // Cerrar scanner para ahorrar memoria
	
		if ((tipo.toUpperCase().equals("A")) && (tamano == 1)) {
			System.out.println("Se cargan 20 centimos");
		} else if ((tipo.toUpperCase().equals("A")) && (tamano == 2)) {
			System.out.println("Se cargan 30 centimos");
		} else if ((tipo.toUpperCase().equals("B")) && (tamano == 1))  {
			System.out.println("Se rebajan 30 centimos");
		}
		else {
			System.out.println("Se rebajan 50 centimos");
		}
	}

}
