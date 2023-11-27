package condicionales;

import java.util.Scanner;

public class Condicionales6_HVR {

	public static void main(String[] args) {
		// La asociacion de vinicultores tiene como politica fijar un precio inicial
		//al kilo de uva, la cual se clasifica en tipo (A y B), y ademas en tamanos 
		//(1 y 2). Cuando se realiza la venta del producto, esta es de un solo tipo
		//y tamano, se requiere determinar cuanto recibira un productor por la uva 
		//que entrega en un embarque considerando lo siguiente: Si es un tipo A, se
		//le cargan 20 centimos al precio inicial cuando es de tamano 1 y 30 centimos
		//si es de tamano 2. Si es tipo B, se rebajan 30 centimos cuando es de tamano 1
		//y 50 centimos cuando es de tamano 2. Precio inicial se recibe desde teclado
		
		int kilos;
		double precioInicial;
		String tipo;
		int tamano;
		 
		// Solicitud de datos al usuario
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Este programa calcula la ganancia según el tipo de uva, tamaño y cantidad vendida:");
		System.out.print("Introduce los Kg. de uva entregada: ");
		kilos = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introduce el precio por Kg. inicial: ");
        precioInicial = entrada.nextDouble();
        
        System.out.print("Uva de valor \"A\" ó \"B\": ");
        tipo = entrada.next(); entrada.nextLine();
        
        System.out.print("Tipo de uva \"1\" ó \"2\": ");
        tamano = entrada.nextInt();
        
        entrada.close();
        
     // Realizamos calculos y condicionantes
        
        if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
            (tamano == 1 || tamano == 2))) {
          System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
        } else {
          if (tipo.toUpperCase().equals("A") && tamano == 1) {
            System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
          } else if (tipo.toUpperCase().equals("A") && tamano == 2) {
            System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
          } else if (tipo.toUpperCase().equals("B") && tamano == 1) {
            System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
          } else if (tipo.toUpperCase().equals("B") && tamano == 2) {
            System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
          }
        }
      }
    

	}


