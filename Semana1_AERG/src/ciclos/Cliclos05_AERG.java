package ciclos;

public class Cliclos05_AERG 
{
/*
5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
tendr� al cabo de un a�o si todo el dinero lo reinvierte?	 
*/
	public static void main(String[] args) 
	{
		float inv = 1000;
		//float inte = 0.02f;
		
		for (int i = 1; i <= 12; i++) 
		{
			//inv = inv + (inv*inte);
			inv = inv*1.02f;
			System.out.println("mes"+i+" - $"+inv);
		}
		
		System.out.println("tras 1 a�o tendras $"+inv);
		// $1268.2418 con variable
		// $1268.2415 sin variable
	}

}
