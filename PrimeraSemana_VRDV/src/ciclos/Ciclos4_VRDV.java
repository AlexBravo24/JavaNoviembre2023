package ciclos;

public class Ciclos4_VRDV {

	public static void main(String[] args) {
		
		// 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
//		de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
//		tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		
		float banco = 10000; // dinero  invertido
		
		for (int i = 0; i < 13 ; i++) {
			
			
			banco = banco + (banco * 0.02f );
			 
		}
		
		System.out.println("Si reinverte todo su dinero al final de un a�o tendra " +  banco  + " en el banco");

		//
		
	}

}
