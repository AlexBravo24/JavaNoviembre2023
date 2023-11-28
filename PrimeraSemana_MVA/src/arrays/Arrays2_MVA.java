package arrays;


public class Arrays2_MVA {
	public static void main(String[] args) {
//		Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios.
		//Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.
		
		String [] producto = {"licuadora", "bateria", "cama", "mesa", "silla"};
		float [] precio = {15.50f,99.99f,29.99f,40.23f,50.00f};	
		
		
		for (int i = 0; i < producto.length; i++) {
			System.out.println("el precio de: "+producto[i] +" es: $" +precio[i]);
		}
	
	}
}
