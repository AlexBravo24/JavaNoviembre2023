package ciclos;

import java.util.Scanner;

public class Ciclos_VRDV {

	public static void main(String[] args) {
		
		
		// 3. Realiza un programa para determinar si un String es pal�ndromo.

		String pali;
		String ilap = "";
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("introduce un texto para averiguar si es palindromo");
		
		pali = scn.nextLine();
		
		int tama�o = pali.length();
		for (int i = tama�o - 1; i >=0; i--) {
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
