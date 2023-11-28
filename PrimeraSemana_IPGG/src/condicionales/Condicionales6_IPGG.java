package condicionales;
import java.util.Scanner;

public class Condicionales6_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva,
		//la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
		//Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, 
		//se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque 
		//considerando lo siguiente: * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial 
		//cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. * Si es de tipo B, 
		//se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
		//Precio inicial se recibe desde teclado
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el precio inicial de la uva
        System.out.print("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = scanner.nextDouble();

        // Solicitar al usuario el tipo de uva (A o B)
        System.out.print("Ingrese el tipo de uva (A o B): ");
        char tipoUva = scanner.next().charAt(0);

        // Solicitar al usuario el tama�o de la uva (1 o 2)
        System.out.print("Ingrese el tama�o de la uva (1 o 2): ");
        int tamanoUva = scanner.nextInt();

        // Calcular el precio final de la uva
        double precioFinal = calcularPrecioFinal(precioInicial, tipoUva, tamanoUva);

        // Imprimir el resultado
        System.out.println("El precio final por kilo de uva es: " + precioFinal);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // M�todo para calcular el precio final de la uva
    private static double calcularPrecioFinal(double precioInicial, char tipoUva, int tamanoUva) {
        // Verificar el tipo y tama�o de la uva y aplicar los ajustes correspondientes
        if (tipoUva == 'A') {
            if (tamanoUva == 1) {
                return precioInicial + 0.20; // Se le cargan 20 c�ntimos al precio inicial
            } else if (tamanoUva == 2) {
                return precioInicial + 0.30; // Se le cargan 30 c�ntimos al precio inicial
            }
        } else if (tipoUva == 'B') {
            if (tamanoUva == 1) {
                return precioInicial - 0.30; // Se le rebajan 30 c�ntimos al precio inicial
            } else if (tamanoUva == 2) {
                return precioInicial - 0.50; // Se le rebajan 50 c�ntimos al precio inicial
            }
        }

        // Si no coincide con ninguno de los casos anteriores, devolver el precio inicial sin cambios
        return precioInicial;
	}

}
