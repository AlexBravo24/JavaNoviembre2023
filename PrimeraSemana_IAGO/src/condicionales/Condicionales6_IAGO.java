package condicionales;

import java.util.Scanner;

public class Condicionales6_IAGO {

	public static void main(String[] args) {
		
		/* La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, 
		 * la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, 
		 * �sta es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que entrega en un 
		 * embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 
		 * c�ntimos si es de tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2. 
		 * Precio inicial se recibe desde teclado
		 */
		String tipo;
		int tama�o; 
		double precio;
		double pa1=.20;
		double pa2=.30;
		double pb2=.50;
		//Crear un nuevo Scanner de entrada
		Scanner entrada = new Scanner (System.in);
		
		//Ingresar el tipo de uva
		System.out.print("Ingresa el tipo de uva: A o B ");
        tipo = entrada.next();
        
		
        //Ingresa el tama�o de la uva
        System.out.println("Ingresa el tama�o de la uva: 1 o 2");
        tama�o = entrada.nextInt();
        
        
        
        //Ingresar el precio de la uva
        System.out.println("Ingresa el precio de la uva: ");
        precio = entrada.nextDouble();
       
        
        if(tipo.equals("A") && tama�o ==1 ) {
        	System.out.println("Su pago por kilo de uva ser� de: " + (precio-pa1));
        } else if (tipo.equals("A") && tama�o==2) {
        	System.out.println("Su pago por kilo de uva ser� de: " + (precio-pa2));
        } else if(tipo.equals("B") && tama�o ==1) {
        	System.out.println("Su pago por kilo de uva ser� de: " + (precio-pa2));
        } else if (tipo.equals("B") && tama�o ==1) {
        	System.out.println("Su pago por kilo de uva ser� de: " + (precio-pb2));
        }
        
        

	}

}
