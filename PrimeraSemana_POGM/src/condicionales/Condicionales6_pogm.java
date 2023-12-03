package condicionales;

import javax.swing.JOptionPane;

public class Condicionales6_pogm {

	public static void main(String[] args) {
		// 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo
		//de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2).
		//Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se
		//requiere determinar cuánto recibirá un productor por la uva que entrega en un
		//embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20
		//céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de
		//tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y
		//50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado
		 
		 String tipo_uva;
		 int tamaño_uva;
		 double precio_ini = 7, pago_total=0;
		 double compra;
		 tipo_uva = JOptionPane.showInputDialog("ingrese rl tipo de uva");
		 tamaño_uva = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño 1 o 2"));
		 compra = Double.parseDouble(JOptionPane.showInputDialog("cuantos kilos desea comprar"));
		 
		 if (tipo_uva.equals("A") || tipo_uva.equals("a")) {
			  if(tamaño_uva == 1) {
				  precio_ini = precio_ini + 0.2;
			  }else {
				  precio_ini = precio_ini + 0.3;
			  }
			  
			 
		 }else{
			 if (tamaño_uva == 1 ) {
				 precio_ini = precio_ini - 0.3;
			 }else {
				 precio_ini = precio_ini - 0.5;
			 }
			 
		 }
		 pago_total = precio_ini * compra;
		 
		 System.out.println("Usted pagara lo siguiente" +pago_total+" soles");
		 

	}

}
