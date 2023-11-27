package problemariociclos;

public class Problema4 {
	public static void main(String[] args) {
        // Simular el comportamiento de un reloj desde las 00:00:00 hasta las 23:59:59
        for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    // Formatear la hora, minutos y segundos
                    String horaFormateada = formatearNumero(hora);
                    String minutoFormateado = formatearNumero(minuto);
                    String segundoFormateado = formatearNumero(segundo);

                    // Imprimir la hora actual
                    System.out.println(horaFormateada + ":" + minutoFormateado + ":" + segundoFormateado);

                    // Esperar un breve momento (simulando el tiempo real)
                    try {
                        Thread.sleep(1000); // Dormir durante 1000 milisegundos (1 segundo)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Método para formatear un número agregando un cero si es menor que 10
    private static String formatearNumero(int numero) {
        return (numero < 10) ? "0" + numero : String.valueOf(numero);
    }

}
