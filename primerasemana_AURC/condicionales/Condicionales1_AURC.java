package condicionales;

import java.util.Scanner;

public class Condicionales1_AURC {

	public static void main(String[] args) {
// 1.Realiza un programa que reciba dos números por teclado
// e indique cuál es mayor o si son iguales.

int x, y;
Scanner result = new Scanner(System.in);

System.out.println("Ingresa el primer numero :");
x = result.nextInt();
System.out.println("Ingresa el segundo numero :");
y = result.nextInt();
	if(x > y) {
		System.out.println("El primer numero es igual a" + " " + x + " Y es mayor que el segundo numero que es igual a  " + y);
		}else if(x == y) {
			System.out.println("Tanto el primer numero ingresado cuyo valor es de " + " "+ x + " "+ "como el segundo numero ingresado cuyo valor es de " + " " + y + " "+ "son iguales.");
			}else{
			System.out.println("El segundo numero es igual a" + " " + y + " Y es mayor que el primer numero que es igual a " + x );

			}
	}
}