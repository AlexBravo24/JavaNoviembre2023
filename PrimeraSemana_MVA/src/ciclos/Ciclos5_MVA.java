package ciclos;

public class Ciclos5_MVA {

	public static void main(String[] args) {
		
//		 Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
//		de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
//		tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		
		float inversion = 1000;
		
		for (int i = 0; i < 12; i++) {
			inversion += (inversion*0.02); 
			
		}
		System.out.println("tu saldo es de: "+inversion);
		
		
		
	}
}
