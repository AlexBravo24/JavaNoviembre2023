package condicionales;

import javax.swing.JOptionPane;

public class Condicionales6_pogm {

	public static void main(String[] args) {
		// 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo
		//de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
		//Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se
		//requiere determinar cu�nto recibir� un productor por la uva que entrega en un
		//embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20
		//c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de
		//tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y
		//50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado
		 
		 String tipo_uva;
		 int tama�o_uva;
		 double precio_ini = 7, pago_total=0;
		 double compra;
		 tipo_uva = JOptionPane.showInputDialog("ingrese rl tipo de uva");
		 tama�o_uva = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tama�o 1 o 2"));
		 compra = Double.parseDouble(JOptionPane.showInputDialog("cuantos kilos desea comprar"));
		 
		 if (tipo_uva.equals("A") || tipo_uva.equals("a")) {
			  if(tama�o_uva == 1) {
				  precio_ini = precio_ini + 0.2;
			  }else {
				  precio_ini = precio_ini + 0.3;
			  }
			  
			 
		 }else{
			 if (tama�o_uva == 1 ) {
				 precio_ini = precio_ini - 0.3;
			 }else {
				 precio_ini = precio_ini - 0.5;
			 }
			 
		 }
		 pago_total = precio_ini * compra;
		 
		 System.out.println("Usted pagara lo siguiente" +pago_total+" soles");
		 

	}

}
