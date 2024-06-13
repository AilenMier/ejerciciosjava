package prueba;

import java.util.Scanner;

public class ejercicio42nuevo {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		int[] nro_de_socio = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };

		String[] nombres = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };

		System.out.println("Para encontrar a un individuo, ingrese el numero de socio: ");
		int codigoBuscado = dato.nextInt();

		boolean encontrado = false;

		int nro_Encontrado = 0;
		String nombreEncontrado = "";

		for (int i = 0; i < nombres.length; i++) {

			if (codigoBuscado == nro_de_socio[i]) {
				// PARA LISTAS codigoBuscad == nro_de_socio.get(i)
				nro_Encontrado = nro_de_socio[i];
				nombreEncontrado = nombres[i];
				encontrado = true;
				break;
			}

		}
		if (encontrado == true) {
			System.out.println("El codigo ingresado fue encontrado.");
			System.out.println("El numero de socio ingresado es: " + nro_Encontrado);
			System.out.println("El nombre es: " + nombreEncontrado);

		}
	}

}
