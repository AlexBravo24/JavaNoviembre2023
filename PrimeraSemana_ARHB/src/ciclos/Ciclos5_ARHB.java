package ciclos;

public class Ciclos5_ARHB {

	public static void main(String[] args) {
		// 
		double inversionInicial = 1000.00;
        double interesMensual = 0.02;
        
	 
	for (int mes = 1; mes <= 12; mes++) {
        inversionInicial = inversionInicial + (inversionInicial * interesMensual);
    }

    System.out.println("Después de un año, la cantidad de dinero será: $" + inversionInicial);
}
}


