package condicionales;

import java.util.Scanner;

public class Condicionales6_PRC {

	public static void main(String[] args) {
		/*  La asociación de vinicultores tiene como política fijar un precio inicial al kilo 
		de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se 
		requiere determinar cuánto recibirá un productor por la uva que entrega en un 
		embarque considerando lo siguiente: 
		* Si es de tipo A, se le cargan 20 
		céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de 
		tamaño 2.
		 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 
		50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado
        */
		
		Scanner cantidades= new Scanner(System.in);
		
		System.out.println("introduce un precio $");
		
		 double precio=cantidades.nextDouble();
		 //int cantidad =cantidades.nextInt();
		 
		// double A1,A2,B1,B2;
		 System.out.println("escoge una opcion: \n a: tipo A \n b: tipo B");
		 
		 String tipos= cantidades.next();
		 
		 switch (tipos) {

		 case "a":
             
			
			 
			System.out.println("precio para uva A1 es:" +(precio+.20));
			//double a1= precio+.20;
			//A1=a1;
			System.out.println("precio para uva A2 es:" +(precio+.30));
			//double a2= precio+.30;
			//A2=a1;
			break;
			
		 case "b":
			System.out.println("precio para uva B1 es:" +(precio-.30));
			//double b1= precio-.30;
			System.out.println("precio para uva B2 es:" +(precio-.50));
			//double b2= precio-.50;
			break;
			
		default:
			System.out.println("introduce 'a' o 'b' en minusculas");
		    break;
			 
			 
		 }
		 
//		 System.out.println("ingresa un tamaño: \n a: tamaño A \n b: tamaño B ");
//		 
//		 String tamaño= Double.parseDouble(cantidades.next());
//		
//		 switch (tamaño) {
//		 case "1":
//             
//			
//			 
//				System.out.println("precio para uva A1 es:" +(A1*tamaño));
//				double A1= precio+.20;
//				System.out.println("precio para uva A2 es:" +(precio+.30));
//				double A2= precio+.30;
//				break;
//				
//			 case "2":
//				System.out.println("precio para uva B1 es:" +(precio-.30));
//				double B1= precio-.30;
//				System.out.println("precio para uva B2 es:" +(precio-.50));
//				double B2= precio-.50;
//				break;
//				
//			default:
//				System.out.println("introduce 'a' o 'b' en minusculas");
//			    break;
//		 }
		 cantidades.close();
		 
		 
		
		 
		 
	}

}
