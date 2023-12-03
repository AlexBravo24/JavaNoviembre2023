package ciclos;

import java.util.Scanner;

public class Ciclos_VRDV {

	public static void main(String[] args) {
		
		
		// 3. Realiza un programa para determinar si un String es palíndromo.

		String pali;
		String ilap = "";
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("introduce un texto para averiguar si es palindromo");
		
		pali = scn.nextLine();
		
		int tamaño = pali.length();
		for (int i = tamaño - 1; i >=0; i--) {
			ilap = ilap + pali.charAt(i);
		}
		System.out.println(pali);
		System.out.println(ilap);
		
		scn.close();
		
		if (pali.replace(" ", "").equalsIgnoreCase(ilap.replace(" ", ""))) {
			
			System.out.println("La palabra es un palindromo");
			
		}else {
			
			System.out.println("La palabra no es un palindromo");
			
		}
		
		
		
		
		
	}

}
