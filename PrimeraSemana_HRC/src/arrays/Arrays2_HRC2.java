package arrays;

import java.util.Scanner;

public class Arrays2_HRC2 {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		// respectivos precios.
		// Muestra en consola la lista de productos y sus precios. Por lo menos 5
		// productos o artículos.

		Scanner entrada = new Scanner(System.in);
		int cantidadArticulos;
		System.out.println("Cuantos productos va a ingresar?");
		cantidadArticulos = entrada.nextInt();
		
		String[] productos = new String[cantidadArticulos];
		double[] precios = new double[cantidadArticulos];

		if (cantidadArticulos < 5) {
			System.out.println("Error: tiene que ingresar mas de cinco productos");
		}

		else {
			for (int i = 0; i < cantidadArticulos; i++) {
				System.out.println("Ingrese el producto en la posicion " + i + ":");
				productos[i] = entrada.next();

			}

			for (int i = 0; i < cantidadArticulos; i++) {
				System.out.println("Ingrese el costo del producto en la posicion " + i + ":");
				precios[i] = entrada.nextDouble();

			}

			for (int i = 0; i < cantidadArticulos; i++) {
				System.out.println("El precio de/l " + productos[i] + " es de $" + precios[i]);

			}
			
			entrada.close(); // Cerrar scanner para ahorrar memoriat
		
		}

	}

}
