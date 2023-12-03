package condicionales;

import java.util.Scanner;

public class Condicionales3 {

	public static void main(String[] args) {
		// 3 Crea un programa que pida al usuario dos números y muestre el resultado
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.

     Scanner obj=new Scanner (System.in);
     int a=0;
     int b=0;
     int c=0;
     System.out.println("ingresar el primer num:");
     a=obj.nextInt();
     System.out.println("ingresar el segundo num:");
     b=obj.nextInt();
     c= a-b;
     System.out.println(" resta :" +a+"-"+b+"="+c);
     
     
     
     if (b==0) {
     	System.out.println("error");
     }
    
	}

}
