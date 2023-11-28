package condicionales;
import java.util.Scanner;

public class Condicionales9_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//9.Realiza un programa que pida el d�a de la semana (del 1 al 7) 
		//y escriba el d�a correspondiente. Si introducimos otro n�mero nos da un error.
		
		 Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario el d�a de la semana
	        System.out.print("Ingrese un n�mero del 1 al 7 para representar el d�a de la semana: ");
	        int numeroDia = scanner.nextInt();

	        // Utilizar switch para asociar el n�mero con el d�a de la semana
	        String diaSemana = obtenerDiaSemana(numeroDia);

	        // Imprimir el resultado
	        System.out.println("El d�a correspondiente al n�mero " + numeroDia + " es: " + diaSemana);

	        // Cerrar el objeto Scanner
	        scanner.close();
	    }

	    // M�todo para obtener el d�a de la semana
	    private static String obtenerDiaSemana(int numeroDia) {
	        switch (numeroDia) {
	            case 1:
	                return "Lunes";
	            case 2:
	                return "Martes";
	            case 3:
	                return "Mi�rcoles";
	            case 4:
	                return "Jueves";
	            case 5:
	                return "Viernes";
	            case 6:
	                return "S�bado";
	            case 7:
	                return "Domingo";
	            default:
	                return "Error: El n�mero debe estar entre 1 y 7";
	        }
	    }
}
