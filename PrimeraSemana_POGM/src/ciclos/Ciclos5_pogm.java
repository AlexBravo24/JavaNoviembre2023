package ciclos;

import java.util.Scanner;

public class Ciclos5_pogm {

	public static void main(String[] args) {
		// . Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona
		//tendrá al cabo de un año si todo el dinero lo reinvierte? 
        float capitalIn, interesAnl, interesTotal, capitalFinal;
        int años;
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduce la invercion");
        capitalIn = teclado.nextFloat();
        System.out.print("Introduce el interes anual(%): ");
        interesAnl = teclado.nextFloat();
        System.out.print("Introduce el numero de años");
        años = teclado.nextInt();
        interesTotal = capitalIn * interesAnl / 100 * años; 
        capitalFinal = interesTotal + capitalIn;
        
        System.out.println("El capital final es: " + capitalFinal );
        System.out.println("El interes generado sera: " + interesTotal);
	}

}
