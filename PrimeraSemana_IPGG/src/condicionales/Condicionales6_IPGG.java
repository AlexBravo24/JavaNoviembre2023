package condicionales;
import java.util.Scanner;

public class Condicionales6_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
		//la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
		//Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, 
		//se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque 
		//considerando lo siguiente: * Si es de tipo A, se le cargan 20 céntimos al precio inicial 
		//cuando es de tamaño 1 y 30 céntimos si es de tamaño 2. * Si es de tipo B, 
		//se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
		//Precio inicial se recibe desde teclado
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el precio inicial de la uva
        System.out.print("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = scanner.nextDouble();

        // Solicitar al usuario el tipo de uva (A o B)
        System.out.print("Ingrese el tipo de uva (A o B): ");
        char tipoUva = scanner.next().charAt(0);

        // Solicitar al usuario el tamaño de la uva (1 o 2)
        System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
        int tamanoUva = scanner.nextInt();

        // Calcular el precio final de la uva
        double precioFinal = calcularPrecioFinal(precioInicial, tipoUva, tamanoUva);

        // Imprimir el resultado
        System.out.println("El precio final por kilo de uva es: " + precioFinal);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para calcular el precio final de la uva
    private static double calcularPrecioFinal(double precioInicial, char tipoUva, int tamanoUva) {
        // Verificar el tipo y tamaño de la uva y aplicar los ajustes correspondientes
        if (tipoUva == 'A') {
            if (tamanoUva == 1) {
                return precioInicial + 0.20; // Se le cargan 20 céntimos al precio inicial
            } else if (tamanoUva == 2) {
                return precioInicial + 0.30; // Se le cargan 30 céntimos al precio inicial
            }
        } else if (tipoUva == 'B') {
            if (tamanoUva == 1) {
                return precioInicial - 0.30; // Se le rebajan 30 céntimos al precio inicial
            } else if (tamanoUva == 2) {
                return precioInicial - 0.50; // Se le rebajan 50 céntimos al precio inicial
            }
        }

        // Si no coincide con ninguno de los casos anteriores, devolver el precio inicial sin cambios
        return precioInicial;
	}

}
