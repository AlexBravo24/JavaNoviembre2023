package ciclos;

public class Ciclos3_VRDV {

	public static void main(String[] args) {
		
		// 4. Simular el comportamiento de un reloj digital, imprimiendo la hora, 
//		minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
//		horas
		
		
		int seg = 0;
		int min = 0;
		int hora = 0;
		
		while (hora < 24) {
			
			if (seg == 60) {
				
				seg = 0;
				min = min +1;
			}
			if (min == 60) {
				
				min = 0;
				hora = hora + 1;
				
			}
			
			System.out.println(hora + ":" + min + ":" + seg);
			
			seg ++;
		}
		
		
		
		
	}
	

}
