package condicionales;

import java.util.Scanner;

public class Condicionales6_AURC {

	public static void main(String[] args) {
		/* La asociación de vinicultores tiene como política fijar un precio inicial al kilo 
de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se 
requiere determinar cuánto recibirá un productor por la uva que entrega en un 
embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de 
tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 
50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado
 */
		Scanner scanner = new Scanner(System.in);

double precioInicialKiloUva;
double precioFinalKiloUva;
String tipoDeUva;
int tamano = 0;
double impuesto = 0;
// INTRODUCIENDO PRECIO INICIAL ANTES DE IMPUESTOS DE EMBARQUE
System.out.println("Introduce precio inicial :");
precioInicialKiloUva = scanner.nextDouble();
//SELECCION TIPO DE UVA
System.out.println("Introduce el tipo de Uva (A o B): ");
tipoDeUva = scanner.nextLine();
	if( tipoDeUva == "A") {
		System.out.println("Haz seleccionado el tipo de uva)" + tipoDeUva);
		}else if ( tipoDeUva == "B") {
			System.out.println("Haz seleccionado el tipo de uva" + tipoDeUva);
		}else {
			System.out.println("Error en tu seleccion, seleccion tipo de uva de nuevo");
			}
// SELECCION TAMANO DE UVA
System.out.println("Ahora debes seleccionar el tamano de tus uvas (1 o 2)");
tamano = scanner.nextInt();
			if(tamano == 1) {
				System.out.println("Haz seleccionado el tamano" + tamano);
			}else if(tamano == 2) {
				System.out.println("Haz seleccionado el tamano" + tamano);
			}else {
				System.out.println("Error en tu seleccion, ingresa tamano de nuevo");
				}
// COMPARATIVO E IMPRESION DE PRECIO FINAL DESPUES DE IMPUESTOS
if(tipoDeUva != null && tipoDeUva == "A" && tamano == 1) {
	impuesto = .20;
	System.out.println("El impuesto a cargo es de : " + impuesto);
	}else if(tipoDeUva != null && tipoDeUva == "A" && tamano == 2) {
		impuesto = .30;
		System.out.println("El impuesto a cargo es de : " + impuesto);
		}else if(tipoDeUva != null && tipoDeUva == "B" && tamano == 1) {
			impuesto = -.30;
			System.out.println("El impuesto a cargo es de : " + impuesto);
			}else if(tipoDeUva != null && tipoDeUva == "B" && tamano == 2) {
				impuesto = -.50;
				System.out.println("El impuesto a cargo es de : " + impuesto);
				}else {
					System.out.println("Error");
				}
	precioFinalKiloUva = precioInicialKiloUva + impuesto;
	System.out.println("Precio Final del Kilo de Uva es de :" + precioFinalKiloUva);
	scanner.close();
	}
}

