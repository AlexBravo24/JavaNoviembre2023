package condicionales;
import java.util.Scanner;
public class Condicionales7_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// El director de una escuela est� organizando un viaje de estudios y requiere determinar
		//cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio.
		//La forma de cobrar es la siguiente: * Si son 100 alumnos o m�s, el costo por cada alumno es 
		//de 65 euros. * De 50 a 99 alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, 
		//el costo es de 95 euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000
		//euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita determinar el pago 
		// a la compa��a de autobuses y lo que debe pagar cada alumno por el viaje.
		   Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario el n�mero de alumnos
	        System.out.print("Ingrese el n�mero de alumnos: ");
	        int numeroAlumnos = scanner.nextInt();

	        // Calcular el costo por alumno y el costo total para la compa��a de autobuses
	        double costoPorAlumno = calcularCostoPorAlumno(numeroAlumnos);
	        double costoTotalCompania = calcularCostoTotalCompania(numeroAlumnos);

	        // Imprimir los resultados
	        System.out.println("Costo por alumno: " + costoPorAlumno + " euros");
	        System.out.println("Costo total para la compa��a de autobuses: " + costoTotalCompania + " euros");

	        // Cerrar el objeto Scanner
	        scanner.close();
	    }

	    // M�todo para calcular el costo por alumno
	    private static double calcularCostoPorAlumno(int numeroAlumnos) {
	        if (numeroAlumnos >= 100) {
	            return 65.0;
	        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
	            return 70.0;
	        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
	            return 95.0;
	        } else {
	            return 4000.0 / numeroAlumnos; // Costo total dividido por el n�mero de alumnos
	        }
	    }

	    // M�todo para calcular el costo total para la compa��a de autobuses
	    private static double calcularCostoTotalCompania(int numeroAlumnos) {
	        return calcularCostoPorAlumno(numeroAlumnos) * numeroAlumnos;
	}

}
