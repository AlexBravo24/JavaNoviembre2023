package condicionales;

import java.util.Scanner;

public class Condicionales6_PRC {

	public static void main(String[] args) {
		/*  La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo 
		de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
		Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se 
		requiere determinar cu�nto recibir� un productor por la uva que entrega en un 
		embarque considerando lo siguiente: 
		* Si es de tipo A, se le cargan 20 
		c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de 
		tama�o 2.
		 * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 
		50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado
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
		 
//		 System.out.println("ingresa un tama�o: \n a: tama�o A \n b: tama�o B ");
//		 
//		 String tama�o= Double.parseDouble(cantidades.next());
//		
//		 switch (tama�o) {
//		 case "1":
//             
//			
//			 
//				System.out.println("precio para uva A1 es:" +(A1*tama�o));
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
