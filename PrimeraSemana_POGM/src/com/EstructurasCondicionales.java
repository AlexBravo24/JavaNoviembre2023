package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructura de decision - if - valores booleanos 
		/*
		 * si (esto es verdadero){
		 * ejecuta esto
		 * }si no lo es{
		 * ejecuta esto
		 * 
		 */
          int x = 9;
          
          if (x<10) { //si x es menor que 10 
        	  //Ejecuta este codigo 
        	  System.out.println("SI");
        	  
        	  
          }else {
        	  //si lo anterior no es cierto, o . de otro modo //Ejecuta lo siguiente 
        	  System.out.println("No");
          }
          
          //OPERADORES LOGICOS para condiciones compuestas 
          //AND, OR , NOT diferente de, igualdad
          System.out.println("Probando el operador AND");
          if (x<9 && x>5) { //si x es menor que 10 
        	  //Ejecuta este codigo 
        	  System.out.println("SI");
        	  
        	  
          }else {
        	  //si lo anterior no es cierto, o . de otro modo //Ejecuta lo siguiente 
        	  System.out.println("No");
          }
          
          System.out.println("Probando el operador OR");
          if (x<9 || x>5) { //si x es menor que 10 
        	  //Ejecuta este codigo 
        	  System.out.println("SI");
        	  
        	  
          }else {
        	  //si lo anterior no es cierto, o . de otro modo //Ejecuta lo siguiente 
        	  System.out.println("No");
          }
          System.out.println("Probando el operador NOT");
          
         //nIEGA UNA CONDICION, O MAS BIEN, CAMBIA EL VALOR
          //DE LA CONDICION DE TRUE A FALSE Y VICEVERSA
          if (!(x<15)) { //si x es menor que 10 
        	  //Ejecuta este codigo 
        	  System.out.println("SI");
        	  
        	  
          }else {
        	  //si lo anterior no es cierto, o . de otro modo //Ejecuta lo siguiente 
        	  System.out.println("No");
          }
          
         
          if (x !=9) { //si x es menor que 10 
        	  //Ejecuta este codigo 
        	  System.out.println("SI");
        	  
        	  
          }else {
        	  //si lo anterior no es cierto, o . de otro modo //Ejecuta lo siguiente 
        	  System.out.println("No");
          
          
	}
          System.out.println("Probando el operador IGUALDAD");
          
          //IGUALDAD - == compara los valores y manda True cuando son
          //iguales
          //Un solo igual en una variable es asignacion int x=10;
          //Y el doble igual es para comparar los valores
          if (x ==9) { //si x es menor que 10 
        	  //Ejecuta este codigo 
        	  System.out.println("SI");
        	  
        	  
          }else {
        	  //si lo anterior no es cierto, o . de otro modo //Ejecuta lo siguiente 
        	  System.out.println("No");
        	
          
	}
          
          //Estructuras if - else anidado o is else concatenado
          //System.out.println("Probando la estructura if-else anidada");
    
          int volado = 2;
          
          if (volado ==2) {
        	  System.out.println("Aguila");
          }else if(volado == 2);{
        	  System.out.println("Sol");
           {
      System.out.println("Error");
          }
        	  
        	//System.out.println("Probando estructura SWITCH-CASE");
        	
        	switch (volado) {
        	case 1:
        		
        		System.out.println("Aguila");
        		break;
        	case 2:
        		System.out.println("Sol");
        		
        	default :
        		System.out.println("Error");
        	}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	}
        	  
        	  
	}}
       
	
	
