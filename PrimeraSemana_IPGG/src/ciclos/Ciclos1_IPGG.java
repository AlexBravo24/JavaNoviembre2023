package ciclos;

public class Ciclos1_IPGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.- Programa un algoritmo que realice la tabla de multiplicar del 12
		int numero = 12;

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 50; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
	
	}

}
