package ciclos;

public class Ciclos4_JABR {

	public static void main(String[] args) throws InterruptedException {
		// 4. Simular el comportamiento de un reloj
		
		//Funciona bien con ciclos for anidados
		
		for (int hora = 0; hora <= 23; hora++) {
			for (int min = 0; min < 60; min++) {
				for (int seg = 0; seg < 60; seg++) {
					System.out.printf("%02d:%02d:%02d%n",hora, min, seg);
					Thread.sleep(1000);
				}
			}
		}

	}

}
