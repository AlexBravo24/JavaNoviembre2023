package com;

public class EstructurasCondicionales {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // estructuras de decision - if - valores booleanos
        // si (esto es verdadero) ejecuta esto
        // y si no lo es, ejecuta esto

        int x = 9;
        if (x < 9) { // si x es menor a 9 ejecutamos este código
            System.out.println("SI");
        } else { // si lo anterior no es cierto, ejecuta este bloque de código
            System.out.println("NO");
        }

        // operador de igualdad, se caracteriza por ser == y manda true cuando son iguales
        // un solo igual en una variable es asignación, por ejemplo, x = 10, y cuando == es para comparar los valores

        if (x == 9) {
            System.out.println("Si");
        } else {
            System.out.println("NO");
        }

        // Estructuras if ELSE ANIDADO Y CONCATENADO 
        System.out.println("PROBANDO LA ESTRUCTURA IF-ELSE ANIDADA");

        int volado = 1; // Agrega un punto y coma al final de esta línea

        if (volado == 1) {
            System.out.println("Aguila");
        } else if (volado == 2) {
            System.out.println("Sol");
        } else {
            System.out.println("Error");
        }
        
        //switch case  
        if (condition) {
			
		} else {

		}
 
    }
}


