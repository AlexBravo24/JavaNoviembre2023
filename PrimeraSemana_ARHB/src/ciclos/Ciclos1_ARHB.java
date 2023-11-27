package ciclos;

public class Ciclos1_ARHB {

	public static void main(String[] args) {
		// 1.-Programa un algoritmo que realice la tabla de multiplicar del 12
		
		int x = 12;
		int y = 11;
		int resultado;
		
		for (int i = 1; i < y ; i++) {
			resultado = x * i;
			System.out.println(x + " * " + i + " = " + resultado);
		}
		
	}

}
