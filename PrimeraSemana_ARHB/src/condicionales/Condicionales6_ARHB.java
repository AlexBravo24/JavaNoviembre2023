package condicionales;

import java.util.Scanner;

public class Condicionales6_ARHB {

	public static void main(String[] args) {
		/*6.-La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo 
			de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
			Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se 
			requiere determinar cu�nto recibir� un productor por la uva que entrega en un 
			embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
			c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de 
			tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 
			50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado.*/
		float precioUva;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el precio inicial de la uva:");
		precioUva = entrada.nextFloat();
		entrada.nextLine();
		entrada.close();
		
		System.out.println("Cuando es de tipo A y tama�o 1, el precio es: "+ (precioUva + .20));
		System.out.println("Cuando es de tipo A y tama�o 2, el precio es: "+ (precioUva + .30));
		System.out.println("Cuando es de tipo B y tama�o 1, el precio es: "+ (precioUva - .30));
		System.out.println("Cuando es de tipo B y tama�o 2, el precio es: "+ (precioUva - .50));
		

	}

}
