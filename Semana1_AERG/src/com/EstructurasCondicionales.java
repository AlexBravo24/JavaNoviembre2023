package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// ESTRUCTURAS DE DECISION - IF (BOOLEANOS)
		// si (esto es verdadero)
		// has esto 
		// si no
		// esto
		
		int x = 12;
		
		if (x<10){ //si x es menor que 10
			System.out.println("Si");			
		}else { // si no
			System.out.println("No");
		}
			// OPERADORE LOGICOS 
//		AND - && - y
//		OR - || - o
//		NOT - ! - inverso
//		DIFERENTE DE - ¡= 
//		IGUALDAD - == 
		
		System.out.print("AND - "+x+" es menor que 15 y mayor que 5?= ");
		if (x<15 && x>5){System.out.println(" Si"); //si se cumplen las dos condiciones
		}else { System.out.println(" No");}// si no
		
		System.out.print("OR - "+x+" es menor que 15 o mayor que 5?= ");	
		if (x<15 || x>5){System.out.println(" Si"); //si se cumplen una de las dos condiciones
		}else { System.out.println(" No");}// si no
		
		System.out.print("NOT - "+x+" NO es menor que 15? ");
		if (!(x<15)){System.out.println("Si"); //si NO se cumplen la condiciones
		}else { System.out.println("No");}// si no
		
		System.out.print("DIFERENTE DE - "+x+" es diferente de 15? ");
		if (x!=15){System.out.println("Si"); //si NO se cumplen la condiciones
		}else { System.out.println("No");}// si no
		
		
		//ESTRUCTURAS IF - ELSE ANIMADO O IF ELSE CONCATENADO
		
		byte volado = 1;
		
		if (volado == 1) {
			System.out.println("Sol");
		}else if (volado ==2) {
			System.out.println("aguila");
		}else {System.out.println("error");}
			
		//SWITCH CASE - EJECUTA DIFERENTES LINEAS DE CODIGO DE
		
		
		// minuto 2:38
		switch (volado) {
		case 1:System.out.println("Aguila");
			break;
			
		case 2:System.out.println("Sol");
			break;

		default:System.out.println("Error");
			break;
			//atajo "switch + CTRL + ESPACI"
		}
		
	
	}
	

}
