package arrays;

public class Arrays2_PRC {

	public static void main(String[] args) {
		
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios.
		//Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos

		

		String [] productos = new String[5];
		productos[0]= "galletas";
		productos[1]= "huevo";
		productos[2]= "gelatinas";
		productos[3]= "carne";
		productos[4]= "fruta";
		
		int [] costos = {20, 50, 10, 80, 30 };
		
		for (int i = 0; i < costos.length; i++) {
			System.out.println("los productos son :"+ productos[i] + "precio"+ costos[i]);
		}
		    	 
	}
}
