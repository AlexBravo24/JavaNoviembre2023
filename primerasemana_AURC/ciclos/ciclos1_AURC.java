package ciclos;

import java.util.Scanner;

public class ciclos1_AURC {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el número de la tabla de multiplicar: ");
        int num = input.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }
}
