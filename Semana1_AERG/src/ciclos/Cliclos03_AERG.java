package ciclos;

public class Cliclos03_AERG 
{
/*
3. Realiza un programa para determinar si un String es palíndromo.
*/
	public static void main(String[] args) 
	{
		String palabra = "ASDD";   //String a determinar
		
		String palabraInv = "";
		char x ='a';
		int l = palabra.length();
		
		
		
		while (l>0) 
		{
			x = palabra.charAt(l-1);
			palabraInv = palabraInv+x;
			l--;			
		}
	
		if (palabra.equalsIgnoreCase(palabraInv)) 
		{
			System.out.println(palabra+" y "+palabraInv+" SI son palíndromo ");	
		}
		else
		{
			System.out.println(palabra+" y "+palabraInv+" NO son palíndromo ");
		}
		

		
	}

}
