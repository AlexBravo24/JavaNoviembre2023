package ciclos;

public class Ciclos4_HRC3 {

	public static void main(String[] args) {

		int hora = 0;
		int minuto = 0;
		int segundo = 0;

		for (hora = 0; hora < 24; hora++) {
			for (minuto = 0; minuto < 60; minuto++) {
				for (segundo = 0; segundo < 60; segundo++) {
					System.out.println(hora + ":" + minuto + ":" + segundo);
				}
			}
		}

	}
}
