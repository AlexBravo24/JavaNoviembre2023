package ciclos;

public class Ciclos5_PRC {

	public static void main(String[] args) {
		
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		//tendrá al cabo de un año si todo el dinero lo reinvierte?

		double dinero=1000;
		double inter=0.2;
		double resultado = 0;
		
		 
		for (double mes = 1; mes <=12; mes++) {
			
			resultado=dinero*Math.pow(1+inter, mes);
			
			//System.out.println(mes + "dinero es igual: " + resultado);
			
		}
		System.out.println("la cantidad final es = " + resultado);
	}

}
