package prueba;

import java.util.Scanner;

public class ejercicio27 {

		public static void main(String[] args) {
			Scanner dato = new Scanner(System.in);

			int contrasena = 2007;
			int intentos = 3;
			boolean contra = false;
 
			do {
				
				if (contrasena != 2007) {
				System.err.println("Contrasena incorrecta.");
				}
				System.out.println("Ingrese una contrasena: ");
				contrasena = dato.nextInt();

				intentos--;

				System.out.println("Cantidad de intentos: " + intentos);

				if (contrasena == 2007) {
					contra = true;

					System.out.println("Contrasena coreccta.");
				} 

			} while (contrasena != 2007 && intentos > 0);


		}
	

		
	}


