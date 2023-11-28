package condicionales;

import java.util.Scanner;

public class Condicionales6_IAGO {

	public static void main(String[] args) {
		
		/* La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, 
		 * la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, 
		 * ésta es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un 
		 * embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 
		 * céntimos si es de tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. 
		 * Precio inicial se recibe desde teclado
		 */
		String tipo;
		int tamaño; 
		double precio;
		double pa1=.20;
		double pa2=.30;
		double pb2=.50;
		//Crear un nuevo Scanner de entrada
		Scanner entrada = new Scanner (System.in);
		
		//Ingresar el tipo de uva
		System.out.print("Ingresa el tipo de uva: A o B ");
        tipo = entrada.next();
        
		
        //Ingresa el tamaño de la uva
        System.out.println("Ingresa el tamaño de la uva: 1 o 2");
        tamaño = entrada.nextInt();
        
        
        
        //Ingresar el precio de la uva
        System.out.println("Ingresa el precio de la uva: ");
        precio = entrada.nextDouble();
       
        
        if(tipo.equals("A") && tamaño ==1 ) {
        	System.out.println("Su pago por kilo de uva será de: " + (precio-pa1));
        } else if (tipo.equals("A") && tamaño==2) {
        	System.out.println("Su pago por kilo de uva será de: " + (precio-pa2));
        } else if(tipo.equals("B") && tamaño ==1) {
        	System.out.println("Su pago por kilo de uva será de: " + (precio-pa2));
        } else if (tipo.equals("B") && tamaño ==1) {
        	System.out.println("Su pago por kilo de uva será de: " + (precio-pb2));
        }
        
        

	}

}
