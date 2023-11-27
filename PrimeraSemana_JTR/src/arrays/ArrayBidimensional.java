package arrays;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz = new int [3][3];
		
		matriz[0][0]=100;
		matriz[0][1]=200;
		matriz[0][2]=300;
		
		matriz[1][0]=400;
		matriz[1][1]=500;
		matriz[1][2]=600;
		
		matriz[2][0]=700;
		matriz[2][1]=800;
		matriz[2][2]=900;
		
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
