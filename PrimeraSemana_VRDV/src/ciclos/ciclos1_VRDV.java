package ciclos;

public class ciclos1_VRDV {

	public static void main(String[] args) {
		
		
		// 1.- Programa un algoritmo que realice la tabla de multiplicar del 12

		int numero = 12;
		
		

        System.out.println("Tabla de multiplicar del " + numero + ":");

        // Calcular e imprimir la tabla de multiplicar
        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
	
	
	
	

}
