package ciclos;

public class Ciclos4_VRDV {

	public static void main(String[] args) {
		
		// 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
//		de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
//		tendrá al cabo de un año si todo el dinero lo reinvierte?
		
		float banco = 10000; // dinero  invertido
		
		for (int i = 0; i < 13 ; i++) {
			
			
			banco = banco + (banco * 0.02f );
			 
		}
		
		System.out.println("Si reinverte todo su dinero al final de un año tendra " +  banco  + " en el banco");

		//
		
	}

}
