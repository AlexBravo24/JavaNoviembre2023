package problemariociclos;

public class Problema1 {
	public static void main(String[] args) {
        // Número para el cual se generará la tabla de multiplicar
        int numero = 12;

        // Imprimir la tabla de multiplicar del 12
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

}
