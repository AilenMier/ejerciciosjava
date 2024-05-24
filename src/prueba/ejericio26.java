package prueba;

import java.util.Scanner;

public class ejericio26 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		int contrasena = 2007;
		int intentos = 3;

		do {
			
			if (contrasena != 2007) {
			System.err.println("Contrasena incorrecta.");
			}
			System.out.println("Ingrese una contrasena: ");
			contrasena = dato.nextInt();

			intentos--;

			System.out.println("Cantidad de intentos: " + intentos);
			

		} while (contrasena != 2007 && intentos > 0);

		if (contrasena == 2007) {

			System.out.println("Contrasena coreccta.");
		} else {

			System.err.println("Contrasena incorrecta.");
		}

	}
}
