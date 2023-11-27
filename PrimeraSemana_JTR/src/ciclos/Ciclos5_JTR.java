package ciclos;

public class Ciclos5_JTR {

	public static void main(String[] args) {
		/*
		 * 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
tendrá al cabo de un año si todo el dinero lo reinvierte
		 * 
		 */
		double acumulado=1000;
		for(int mes=1;mes<13;mes++) {
			
			double montoInteres=acumulado*.02;
			acumulado=acumulado+montoInteres;
			System.out.println("Dinero despues de "+mes+" mes(es): $"+String.format("%.2f", acumulado));
		}
	}

}
