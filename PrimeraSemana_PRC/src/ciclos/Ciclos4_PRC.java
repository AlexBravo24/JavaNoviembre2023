package ciclos;

public class Ciclos4_PRC {

	public static void main(String[] args) throws InterruptedException {
		
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		//minutos y segundos de un d�a desde las 00:00:00 horas hasta las 23:59:59 horas
		
		for (int hora = 0; hora <=23; hora++) {
			for (int min = 0; min <=60; min++) {
				for (int seg = 0; seg <=60; seg++) {
					System.out.printf( "%02d:%02d:%02d",hora,min,seg);
					Thread.sleep(1000);
				}
			}
		}
			



	}

}
