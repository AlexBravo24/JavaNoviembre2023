package ciclos;

public class Ciclos4_JTR {

	public static void main(String[] args) {
		/*
		 * 4. Simular el comportamiento de un reloj digital, 
		 * imprimiendo la hora, minutos y segundos de un d�a desde las
		 *  00:00:00 horas hasta las 23:59:59 horas
		 */

		for(int horas=0;horas<24;horas++) {
			for(int minutos=0;minutos<60;minutos++) {
				for(int segundos=0;segundos<60;segundos++) {
					System.out.println(String.format("%02d", horas)+":"+String.format("%02d", minutos)+":"+String.format("%02d", segundos));
				}
			}
		}
	}

}
