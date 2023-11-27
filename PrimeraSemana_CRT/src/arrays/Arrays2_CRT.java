package arrays;

import java.util.Scanner;

public class Arrays2_CRT {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Crea dos arrays, uno para mostrar n productos y otro 
		 *  para mostrar sus respectivos precios. Muestra en consola 
		 *  la lista de productos y sus precios. Por lo menos 5 productos 
		 *  o artículos.
		 */
		
		Scanner entrada = new Scanner(System.in);
		int cantidadArticulos;
		System.out.println("Captura el número de artículos mayor a 4");
		cantidadArticulos=entrada.nextInt();
		if (cantidadArticulos <=4) {
			System.out.println("La cantidad debe ser mayor a 4");
		}else {
			String [] arrayProducto = new String [cantidadArticulos];
			double [] arrayPrecio = new double [cantidadArticulos];
			
			for (int j = 0; j < arrayProducto.length; j++) {
				System.out.println("Ingresa el producto de la posición " +j);
				arrayProducto[j]=entrada.next();
			}
			for (int j2 = 0; j2 < arrayPrecio.length; j2++) {
				System.out.println("Ingresa el precio del producto " + arrayProducto[j2]);
			arrayPrecio[j2]=entrada.nextDouble();
			}
			
			for (int i = 0; i < cantidadArticulos; i++) {
				
					System.out.print("El precio del artículo: " + arrayProducto[i] + " es de $" +arrayPrecio[i]);
				
				System.out.println();
			}
		
		}
		
	}

}
