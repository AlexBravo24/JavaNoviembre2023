package ciclos;

public class Ciclos4_VSA {

	public static void main(String[] args) throws InterruptedException {
		// 4. Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		//minutos y segundos de un d�a desde las 00:00:00 horas hasta las 23:59:59 
		//int hora;
		//int min;
		//int seg;
		for (int hora = 0; hora <= 23; hora++) {
			for (int min = 0; min <60; min++) {
				for (int seg = 0; seg <60; seg++){
					System.out.println(hora + " : " + min + " : "+ seg);
					Thread.sleep(1000);
				}
			}
		}
	}
}
