package arrays;

public class Arrays2_AGZ {

	public static void main(String[] args) {
		/*Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. 
		 * Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.
		 */
		System.out.println("   Lista de papeleria");
		System.out.println("Producto | precio");
		String[] productos = {"Lapiz", "Goma", "Tijeras", "Pegamento", "Lapicero"};
		int[] precios = {10,15,25,20,12};
		
		for (int i = 0; i < 5; i++) {
			System.out.println(productos[i]+" - $"+precios[i]);
		}
	}

}
