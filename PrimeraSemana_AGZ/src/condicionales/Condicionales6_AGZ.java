package condicionales;

import java.util.Scanner;

public class Condicionales6_AGZ {

	public static void main(String[] args) {
		/*6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo 
de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se 
requiere determinar cu�nto recibir� un productor por la uva que entrega en un 
embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de 
tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 
50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado
*/
		float precio, aumento, descuento,total;
		String tipo;
		int tama�o; 
		
       Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite el precio de la Uva: ");
		precio = entrada.nextFloat();
		
		System.out.println("digite el tipo de uva: ");
		tipo = entrada.next();
		
		System.out.println("Digite el tama�o de la uva:");
		tama�o = entrada.nextInt(); 
		
		if (tipo.equalsIgnoreCase("a")) {
			if (tama�o==1) {
				aumento=precio*.2f;
				total=precio+aumento;
				System.out.println("El precio final es de: "+ total);
			}else if(tama�o==2) {
				aumento=precio*.3f;
				total=precio+aumento;
				System.out.println("El precio final es de: "+ total);		
			}else {
				System.out.println("Digitaste un tama�o fuera de rango");
			}
		} else if(tipo.equalsIgnoreCase("b")){
			if(tama�o==1) { 
				descuento=precio*.2f;
				total=precio-descuento;
				System.out.println("el precio final es de: "+ total);
			} else if(tama�o ==2) {
				descuento = precio*.3f;
				total = precio - descuento;
				System.out.println("el precio final es de: "+ total);
			}
		} else {
			System.out.println("Digitaste un tipo incorrecto");
		}

	}

}
