package prueba;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		 Scanner dato = new Scanner(System.in);
		 
		 int costotal;
		 
		 System.out.println("Ingrese el costo total: ");
		 costotal = dato.nextInt();
		 
		 if (costotal > 15000) {
			 float descuento = (float) ((costotal)* 0.9);
			 System.out.println("Se aplico un 10% de descuento: " + descuento);
		 }
		 else {
			 System.out.println("El costo total es : " + costotal);
		 }
	}
}
