package condicionales;
import java.util.Scanner;


public class Condicionales8_AURC {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Introduce el número obtenido al lanzar el dado: ");
		        int num = scanner.nextInt();
		        String result;
		        switch (num) {
		            case 1:
		                result = "Seis";
		                break;
		            case 2:
		                result = "Cinco";
		                break;
		            case 3:
		                result = "Cuatro";
		                break;
		            case 4:
		                result = "Tres";
		                break;
		            case 5:
		                result = "Dos";
		                break;
		            case 6:
		                result = "Uno";
		                break;
		            default:
		                result = "ERROR: número incorrecto";
		                break;
		        }
		        System.out.println(result);
		    }

	}


