package array;

import java.util.Scanner;

public class Array2_pogm {

	public static void main(String[] arg) {
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios.
		//Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.
		
		int  articulos;
		
		
		Scanner articulosscan = new Scanner(System.in);
		
		
		  System.out.println("Ingresar el articulos");
		  articulos=articulosscan.nextInt();
		  if (articulos<=4);{
			  System.out.println("Deve ingresar 5 articulos");
			  
		  } else
		  {
			  String[] arrayProductos = new String [articulos];
			  double[] arrayPrecios =new double[articulos];
			  for (int i = 0; i < articulos; i++) {
			  System.out.println("Ingresar producto"+i);
			  }
			  
			  for (int i =0; i < articulos; i++ ) {
				  System.out.println("Ingresar precio");
				  arrayPrecios[i]=articulosscan.nextDouble();
				  
			  }
			  
			  for (int i =0; i < articulos; i++ ) {
				  System.out.println("Producto "+i+": "+arrayProductos[i]+"Precio: $"+arrayPrecios[i]);
				  
				  
		  }
	     
	
	}
	}
	
}
		
		
		
	


