package condicionales;
import java.util.Scanner;

public class Condicionales9_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//9.Realiza un programa que pida el día de la semana (del 1 al 7) 
		//y escriba el día correspondiente. Si introducimos otro número nos da un error.
		
		 Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario el día de la semana
	        System.out.print("Ingrese un número del 1 al 7 para representar el día de la semana: ");
	        int numeroDia = scanner.nextInt();

	        // Utilizar switch para asociar el número con el día de la semana
	        String diaSemana = obtenerDiaSemana(numeroDia);

	        // Imprimir el resultado
	        System.out.println("El día correspondiente al número " + numeroDia + " es: " + diaSemana);

	        // Cerrar el objeto Scanner
	        scanner.close();
	    }

	    // Método para obtener el día de la semana
	    private static String obtenerDiaSemana(int numeroDia) {
	        switch (numeroDia) {
	            case 1:
	                return "Lunes";
	            case 2:
	                return "Martes";
	            case 3:
	                return "Miércoles";
	            case 4:
	                return "Jueves";
	            case 5:
	                return "Viernes";
	            case 6:
	                return "Sábado";
	            case 7:
	                return "Domingo";
	            default:
	                return "Error: El número debe estar entre 1 y 7";
	        }
	    }
}
