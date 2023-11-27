package arrays;

import java.util.Scanner;

public class Arrays2_JTR {

	public static void main(String[] args) {
		/*
		 * Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios.
		 *  Muestra en consola la lista de productos y sus precios. 
		 *  Por lo menos 5 productos o artículos.
		 */
		Scanner entrada = new Scanner(System.in);
		int cantidadArticulos;
		System.out.println("Ingrese el numero de articulos a guardar (mayor a 4)");
		cantidadArticulos=entrada.nextInt();
		if(cantidadArticulos<=4) {
			System.out.println("Deben ser mas de 4!");
		}else {
			String[] arrayProductos = new String [cantidadArticulos];
			double[] arrayPrecios = new double[cantidadArticulos];
			for (int i = 0; i < cantidadArticulos; i++) {
				System.out.println("Ingrese el producto de la posicion "+i);
				arrayProductos[i]=entrada.next();

			}
			for (int i = 0; i < cantidadArticulos; i++) {
				
				System.out.println("Ingrese el precio del producto de la posicion "+i);
				arrayPrecios[i]=entrada.nextDouble();
				
			}
			for(int i=0; i<cantidadArticulos;i++) {
				System.out.println("Producto "+i+ ": "+arrayProductos[i]+"  Precio: $"+arrayPrecios[i]);
			}
		}
	}

}
