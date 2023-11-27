package arrays;

public class Arrays02_AERG 
{
/*Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
  respectivos precios. Muestra en consola la lista de productos y sus precios. 
  Por lo menos 5 productos o artículos.*/
	
	public static void main(String[] args) 
	{
		//String [] prod = {"p1","p2","p3","p4","p5"};
		String [] prod = new String[5];
		int [] cost = {10,15,18,3,5};
		
		prod[0] = "jabon";
		prod[1] = "queso";
		prod[2] = "leche";
		prod[3] = "huevo";
		prod[4] = "pan";
		
		System.out.println("  PRODUCTOS:");
		for (int j = 0; j < cost.length; j++) {
			System.out.println(j+1+".- "+prod[j]+" - $"+cost[j]);	
		}
		
		


	}

}
