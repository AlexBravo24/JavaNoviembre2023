package condicionales;
import java.util.Scanner;

public class Condicionales1_IPGG {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
        // se tiene que importar el java util scanner para poder usar esa funcion. 
       // vamos a escribir para imprimir para introducir el primer numero 
        Scanner entrada = new Scanner(System.in);
        int primero;
        System.out.println("Introduce primer numero");
        primero=entrada.nextInt();
        int segundo;
        System.out.println("Introduce segundo numero");
        segundo = entrada.nextInt();  // Corregido para asignar la entrada a la variable "segundo"
        
        if (primero > segundo) {
            System.out.println("El primer n�mero es mayor.");
        } else if (primero < segundo) {
            System.out.println("El segundo n�mero es mayor.");
        } else {
            System.out.println("Ambos n�meros son iguales.");
        }

        // Recuerda cerrar el objeto Scanner al final para evitar posibles fugas de recursos
        entrada.close();
    }
}   

        
    
