package prueba;
import java.util.Scanner;
public class ejercicio13 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		char talla;
		
		System.out.println("Ingrese una talla S M o L: ");
		talla = dato.next().charAt(0);
		
		if (talla == 'S' || talla == 's') {
			System.out.println("Quedan 5 remeras.");
		}
		
		else if (talla == 'M' || talla == 'm') {
			System.out.println("Quedan 2 remeras.");
		}
		
		else if (talla == 'L' ||talla == 'l') {
			System.out.println("No quedan remeras.");
		}

	}
 
}
