package ciclos;

public class Ciclo4_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		//for anidados??
			
		 for (int horas = 0; horas < 24; horas++) {
	            for (int minutos = 0; minutos < 60; minutos++) {
	                for (int segundos = 0; segundos < 60; segundos++) {
	                    // Imprimir el tiempo en formato de 24 horas
	                    System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
	                    //aqui esta printf - formato con el que nosotros brindemos por eso se puso el  entre % es el formato y los 02 digitos: para separar %02 digitos%
	                    // Simular el tiempo transcurrido (puedes ajustar la velocidad cambiando el valor de sleep) - salto de linea dado por la letra n despues del formato
	                    try {
	                        Thread.sleep(1000); // Espera 1 segundo (1000 milisegundos)
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }
	}
