package arrays;

public class Arrays2_VRDV {

	public static void main(String[] args) {
		
		// Crea dos arrays, uno para mostrar n productos 
//		y otro para mostrar sus respectivos precios. 
//		Muestra en consola la lista de productos y sus precios. 
//		Por lo menos 5 productos o artículos.
		
		String [] productos = {	"ropaA","ropaB","ropaC","ropaD","ropaE"};
		int [] precios = {420, 690, 888, 169, 229} ;
		
		for (int i = 0; i < precios.length; i++) {
			
			System.out.println(productos[i] + " Tiene un costo de " + precios [i]);
			
		}

	}

}
