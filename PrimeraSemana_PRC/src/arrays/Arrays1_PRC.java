package arrays;

import java.util.Scanner;

public class Arrays1_PRC {

	public static void main(String[] args) {
		
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde

		
		Scanner entrada= new Scanner(System.in);
		
				
		int [] arrayUsuario= new int[10];
		
		System.out.println("introduce 10 numeros enteros: ");	
		for (int i = 0; i < arrayUsuario.length; i++) {
			 
			 arrayUsuario[i]=entrada.nextInt();
			}
		
		for (int i = 0; i < arrayUsuario.length; i++) {
			System.out.println("la posicion en el array es: "+ i  + " y su valor es: "+ arrayUsuario[i]);
			}
		
		entrada.close();
			
		       
	
			
			
			 
		 
		
	}

}

		
			
			
		
		
	