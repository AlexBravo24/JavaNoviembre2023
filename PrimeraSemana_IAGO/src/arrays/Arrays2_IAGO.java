package arrays;

import java.util.Scanner;

public class Arrays2_IAGO {

	public static void main(String[] args) {
		
		// 2. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. 
		// Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.
		
        int numberOfProducts = 5;

        // Crea los arrays para los productos y sus precios 
        String[] products = new String[numberOfProducts];
        double[] prices = new double[numberOfProducts];

        // Crea el Scanner
        Scanner scanner = new Scanner(System.in);

        // Ingresa el nombre de los productos y los precios
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.print("Ingresa el nombre del producto " + (i + 1) + ": ");
            products[i] = scanner.nextLine();

            System.out.print("Ingresa el precio del producto " + products[i] + ": ");
            prices[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        // Muestra la lista de productos y precios
        System.out.println("\nProduct\t\tPrice");
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(products[i] + "\t\t$" + prices[i]);
        }
        scanner.close();

	}

}
