package condicionales;

import java.util.Scanner;

public class Condicionales6_JTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio, tamaño;
		String tipo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el precio inicial:");
		precio=entrada.nextFloat();
		
		entrada.nextLine();//Consume los saltos de linea
		System.out.println("Introduce tipo de uva (A o B)");
		tipo= entrada.nextLine();
		System.out.println("Introduce tamaño de uva (1 o 2)");
		tamaño= entrada.nextInt();
		entrada.close();
		
		if(tipo.equals("A") && tamaño==1) {
			System.out.println("Precio final = $"+(precio+.2));
		} else if(tipo.equals("A") && tamaño==2) {
			System.out.println("Precio final = $"+(precio+.3));
		} else if(tipo.equals("B") && tamaño==1) {
			System.out.println("Precio final = $"+(precio-.3));
		} else if(tipo.equals("B") && tamaño==2) {
			System.out.println("Precio final = $"+(precio-.5));
		}
	}

}
