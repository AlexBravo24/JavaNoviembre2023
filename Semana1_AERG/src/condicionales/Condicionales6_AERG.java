package condicionales;

import java.util.Scanner;

public class Condicionales6_AERG {

//	6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo 
//	de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
//	Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se 
//	requiere determinar cuánto recibirá un productor por la uva que entrega en un 
//	embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
//	céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de 
//	tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 
//	50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado
	
	public static void main(String[] args) 
	{
		float precio;
		//float cc = 0.10f;
		String tipo;
	    byte tamaño;
	    
		
		Scanner scn = new Scanner(System.in);
				
		
		System.out.println("Introdusca el precio inicial del Kilo de Uva...");		
		precio = scn.nextFloat();
		
		System.out.println("Introdusca el tipo de la Uva... ( A o B)");
		tipo = scn.next();
		tipo = tipo.toUpperCase();
		
		System.out.println("Introdusca el tamaño de la Uva... ( 1 o 2)");
		tamaño = scn.nextByte();
		

		switch (tipo) 
		{
			case "A": 
				switch (tamaño) 
				{				
					case 1:	precio = precio + 0.20f;				
					break;
					
					case 2:	precio = precio + 0.30f;				
					break;
	
					default: System.out.println("tamaño de Uva no valido. Ingrese tamaño 1 o 2");
					System.out.println("_______________________________________________________________________");
					System.out.println();
					main(null);
					break;
				}		
			break;
			
			case "B":
				switch (tamaño) 
				{				
					case 1:	precio = precio - .20f;				
					break;
					
					case 2:	precio = precio - .50f;				
					break;
	
					default: System.out.println("tamaño de Uva no valido. Ingrese tamaño 1 o 2");
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
		
		
		System.out.println("Uva tipo "+tipo+", tamaño "+tamaño+", precio por Kilo "+precio);
		System.out.println("_______________________________________________________________________");
		
		
		
		

	}

}


