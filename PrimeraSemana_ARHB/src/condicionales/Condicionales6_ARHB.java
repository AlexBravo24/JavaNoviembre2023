package condicionales;

import java.util.Scanner;

public class Condicionales6_ARHB {

	public static void main(String[] args) {
		/*6.-La asociación de vinicultores tiene como política fijar un precio inicial al kilo 
			de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
			Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se 
			requiere determinar cuánto recibirá un productor por la uva que entrega en un 
			embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
			céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de 
			tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 
			50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado.*/
		float precioUva;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el precio inicial de la uva:");
		precioUva = entrada.nextFloat();
		entrada.nextLine();
		entrada.close();
		
		System.out.println("Cuando es de tipo A y tamaño 1, el precio es: "+ (precioUva + .20));
		System.out.println("Cuando es de tipo A y tamaño 2, el precio es: "+ (precioUva + .30));
		System.out.println("Cuando es de tipo B y tamaño 1, el precio es: "+ (precioUva - .30));
		System.out.println("Cuando es de tipo B y tamaño 2, el precio es: "+ (precioUva - .50));
		

	}

}
