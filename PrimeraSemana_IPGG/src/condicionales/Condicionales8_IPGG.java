package condicionales;
import java.util.Scanner;
public class Condicionales8_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el número
		//en letras (dato cadena) de la cara opuesta al resultado obtenido.
		//Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
		//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el 
		//mensaje: “ERROR: número incorrecto”.
		Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario que ingrese el resultado del dado
        System.out.println("Introduce el resultado obtenido al lanzar un dado de seis caras:");
        int resultadoDado = entrada.nextInt();

        // Verificar si el resultado del dado es válido (entre 1 y 6)
        if (resultadoDado >= 1 && resultadoDado <= 6) {
            // Determinar el número en la cara opuesta
            int numeroOpuesto = determinarNumeroOpuesto(resultadoDado);

            // Mostrar el resultado en letras
            String resultadoEnLetras = convertirNumeroEnLetras(numeroOpuesto);
            System.out.println("El número en la cara opuesta es: " + resultadoEnLetras);
        } else {
            // Mostrar mensaje de error si el resultado del dado es incorrecto
            System.out.println("ERROR: Número incorrecto. Debe ser un valor entre 1 y 6.");
        }

        // Cerrar el Scanner al final para evitar fugas de recursos
        entrada.close();
    }

    // Método para determinar el número en la cara opuesta del dado
    private static int determinarNumeroOpuesto(int resultadoDado) {
        int numeroOpuesto = 0;

        switch (resultadoDado) {
            case 1:
                numeroOpuesto = 6;
                break;
            case 2:
                numeroOpuesto = 5;
                break;
            case 3:
                numeroOpuesto = 4;
                break;
            case 4:
                numeroOpuesto = 3;
                break;
            case 5:
                numeroOpuesto = 2;
                break;
            case 6:
                numeroOpuesto = 1;
                break;
        }

        return numeroOpuesto;
    }

    // Método para convertir el número en letras
    private static String convertirNumeroEnLetras(int numero) {
        switch (numero) {
            case 1:
                return "Uno";
            case 2:
                return "Dos";
            case 3:
                return "Tres";
            case 4:
                return "Cuatro";
            case 5:
                return "Cinco";
            case 6:
                return "Seis";
            default:
                return "Número no válido";
    }
		
	}

}
