package ciclos;

public class Cliclos04_AERG 
{
/*
4. Simular el comportamiento de un reloj digital, imprimiendo la hora, 
minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
horas 
*/
	public static void main(String[] args) throws InterruptedException 
	{
		byte h=0,m=0,s=0;
		
		while (s<60 && h<24) 
		{
			s++;
			while (s==60)
			{
				m++;
				s=0;
			}
			while (m==60)
			{
				h++;
				m=0;
			}
			//System.out.println(h+":"+m+":"+s);
			System.out.printf("%02d:%02d:%02d%n",h,m,s);
			Thread.sleep(100);
		}

	}
		
		
}

//while (m < 60) 
//{
//	System.out.println(h+":"+m+":"+s);
//	m++;
//	while (s < 60) 
//	{
//		System.out.println(h+":"+m+":"+s);
//		s++;
//	}
//}




//do 
//{
//	do 
//	{
//		do 
//		{
//			System.out.println(h+":"+m+":"+s);
//			s++;
//		} 
//		while (s <= 60);
//		m++;				
//		System.out.println(h+":"+m+":"+s);
//	} 
//	while (s == 60 && m>=60);
//	h++;
//	m=0;
//	
//} 
//while (m == 60 && h>=60);
 



//while (s == 60 && m>=60) 
//{
//	while (s < 60)
//	{
//		System.out.println(h+":"+m+":"+s);
//		s++;
//	}
//	m++;
//	s=0;
//}


