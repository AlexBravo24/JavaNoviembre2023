package condicionales;

import java.util.Scanner;

public class Condicionales6_AGZ {

	public static void main(String[] args) {
		/*6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo 
de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se 
requiere determinar cuánto recibirá un productor por la uva que entrega en un 
embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de 
tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 
50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado
*/
		float precio, aumento, descuento,total;
		String tipo;
		int tamaño; 
		
       Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite el precio de la Uva: ");
		precio = entrada.nextFloat();
		
		System.out.println("digite el tipo de uva: ");
		tipo = entrada.next();
		
		System.out.println("Digite el tamaño de la uva:");
		tamaño = entrada.nextInt(); 
		
		if (tipo.equalsIgnoreCase("a")) {
			if (tamaño==1) {
				aumento=precio*.2f;
				total=precio+aumento;
				System.out.println("El precio final es de: "+ total);
			}else if(tamaño==2) {
				aumento=precio*.3f;
				total=precio+aumento;
				System.out.println("El precio final es de: "+ total);		
			}else {
				System.out.println("Digitaste un tamaño fuera de rango");
			}
		} else if(tipo.equalsIgnoreCase("b")){
			if(tamaño==1) { 
				descuento=precio*.2f;
				total=precio-descuento;
				System.out.println("el precio final es de: "+ total);
			} else if(tamaño ==2) {
				descuento = precio*.3f;
				total = precio - descuento;
				System.out.println("el precio final es de: "+ total);
			}
		} else {
			System.out.println("Digitaste un tipo incorrecto");
		}

	}

}
