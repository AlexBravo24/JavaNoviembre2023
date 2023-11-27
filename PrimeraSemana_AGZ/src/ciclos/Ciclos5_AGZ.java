package ciclos;

public class Ciclos5_AGZ {

	public static void main(String[] args) {
		/*
		 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
            de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
            tendrá al cabo de un año si todo el dinero lo reinvierte?
            */
		
		System.out.println("   Interes ANUAL");
		float interes=0.02f;
		float inversion=1000;
		int cont=1;
		float intmensual;
		
		int total;
		
		
		
		while(cont<=12) {
			intmensual=interes*inversion;
			inversion=intmensual+inversion;
			cont++;
		}
		System.out.println("Tu total de dinero sera: " + inversion);
	}

}
