package condicionales;

import java.util.Scanner;

public class Condicionales6_AERG {

//	6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo 
//	de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
//	Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se 
//	requiere determinar cu�nto recibir� un productor por la uva que entrega en un 
//	embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
//	c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de 
//	tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 
//	50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado
	
	public static void main(String[] args) 
	{
		float precio;
		//float cc = 0.10f;
		String tipo;
	    byte tama�o;
	    
		
		Scanner scn = new Scanner(System.in);
				
		
		System.out.println("Introdusca el precio inicial del Kilo de Uva...");		
		precio = scn.nextFloat();
		
		System.out.println("Introdusca el tipo de la Uva... ( A o B)");
		tipo = scn.next();
		tipo = tipo.toUpperCase();
		
		System.out.println("Introdusca el tama�o de la Uva... ( 1 o 2)");
		tama�o = scn.nextByte();
		

		switch (tipo) 
		{
			case "A": 
				switch (tama�o) 
				{				
					case 1:	precio = precio + 0.20f;				
					break;
					
					case 2:	precio = precio + 0.30f;				
					break;
	
					default: System.out.println("tama�o de Uva no valido. Ingrese tama�o 1 o 2");
					System.out.println("_______________________________________________________________________");
					System.out.println();
					main(null);
					break;
				}		
			break;
			
			case "B":
				switch (tama�o) 
				{				
					case 1:	precio = precio - .20f;				
					break;
					
					case 2:	precio = precio - .50f;				
					break;
	
					default: System.out.println("tama�o de Uva no valido. Ingrese tama�o 1 o 2");
					System.out.println("_______________________________________________________________________");
					System.out.println();
					main(null);
					break;
				}
			break;

		default: System.out.println("tipo de Uva no valido. Ingrese tipo A o B");
		System.out.println("_______________________________________________________________________");
		System.out.println();
		main(null);
		break;
		}
		
		
		System.out.println("Uva tipo "+tipo+", tama�o "+tama�o+", precio por Kilo "+precio);
		System.out.println("_______________________________________________________________________");
		
		
		
		

	}

}


