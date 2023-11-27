package condicionales;

import java.util.Scanner;

public class Condicionales2_AERG {
	
	// EJERCICIO 2. Realiza un programa que pida un número por teclado y   
	//				nos indique si es par o impar.
	
	public static void main(String[] args) {
		
		
		System.out.println("Digita un numero para saber si es par o impar..."); //Imprimimos la orden en la consola
		
		Scanner ent = new Scanner(System.in); // iniciamos un scanner con nombre ent y leemos la consola
		
		int num = ent.nextInt(); //guardamos el valor que lee es sacaner en la variable num
		int res = num%2; // guardamos el residuo de la divicion del numero leido entre 2 en la variable res
		
		switch (res) { //creamos un switch para evaluar res
		case 0: System.out.println("El numero "+num+" es par");	//en caso de que res sea 0 imprimimos el mensaje 	
			break;

		default: System.out.println("El numero "+num+" es impar"); //en caso de que res sea cualquier otra cosa imprimimos el mensaje 
			break;
		}
		
		
	}

}
