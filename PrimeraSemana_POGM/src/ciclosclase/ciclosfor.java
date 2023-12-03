package ciclosclase;

public class ciclosfor {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method System.out.println("Simulacion de relog digital");
		
		for (int h = 00; h <= 23; h++){
		
			for (int m = 00; m <= 59; m++) {
		
			
			for (int s = 00; s <= 59; s++) {
		
			
			System.out.printf("%02d;%02d:%02d%n",h,m,s);
			Thread.sleep(1000);
			}
			}
		    }

	}

}
