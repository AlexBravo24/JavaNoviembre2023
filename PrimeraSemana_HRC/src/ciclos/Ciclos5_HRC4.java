package ciclos;

public class Ciclos5_HRC4 {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		// de interés mensual. ¿Cuál será la cantidad de dinero que esta persona
		// tendrá al cabo de un año si todo el dinero lo reinvierte?
		double inversionInicial = 1000;
		double interesMensual = 0.02;
		double capitalFinal = 0;
		
		

		for (int i = 0; i <= 11; i++) {
	
			capitalFinal = (inversionInicial + (inversionInicial * interesMensual));
			inversionInicial = capitalFinal;
			capitalFinal ++;
			
		}
		System.out.println(capitalFinal);
	}

}
