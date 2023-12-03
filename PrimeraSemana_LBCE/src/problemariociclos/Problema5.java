package problemariociclos;

public class Problema5 {
	public static void main(String[] args) {
        // Datos iniciales
        double capitalInicial = 1000.00;
        double tasaInteresMensual = 0.02; // 2% en decimal
        int numeroMeses = 12; // 12 meses en un año

        // Calcular el monto final con reinversión mensual
        double montoFinal = capitalInicial;

        for (int i = 0; i < numeroMeses; i++) {
            montoFinal += montoFinal * tasaInteresMensual;
        }

        // Imprimir el resultado
        System.out.println("Después de " + numeroMeses + " meses, el monto final es: $" + montoFinal);
    }

}
