package ciclos;

import java.util.Scanner;

public class Ciclos3_PRC {

	public static void main(String[] args) {
		
		// Realiza un programa para determinar si un String es palíndromo.
		
		Scanner pali=new Scanner(System.in);
		System.out.println("introduce un texto");

		int inc = 0;
		String sPalabra=pali.next();
		
		int des = sPalabra.length()-1;
		boolean bError = false;
		while ((inc<des) && (!bError)){
			
			if (sPalabra.charAt(inc)==sPalabra.charAt(des)){				
				inc++;
				des--;
			} else {
				bError = true;
			}

			if (!bError) {
			System.out.println(sPalabra + " es un PALINDROMO");
			}else {
			System.out.println(sPalabra + " NO es un palindromo");
			}
			
			pali.close();
			
    }
  }
}

		
		
	
