package prueba;

import java.util.Scanner;

public class ejercicio55 {

	static Scanner dato = new Scanner(System.in);
	public static int[] numeroDni = new int[3];

	public static void ingresosDeDatos() {

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese  numero de DNI: ");
			numeroDni[i] = dato.nextInt();

		}

	}

	public static int datos() {
		for (int i = 0; i < (numeroDni.length - 1) /* i < 4 (5-1) */; i++) {

			for (int j = 0; j < (numeroDni.length - i - 1); j++) {

				if (numeroDni[j] > numeroDni[j + 1]) {

					int temporal = numeroDni[j];
					numeroDni[j] = numeroDni[j + 1];
					numeroDni[j + 1] = temporal;
				}

				System.out.println("\nArreglo ordenado: ");
				for (int num : numeroDni) {
					System.out.println(num + "");

				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		ingresosDeDatos();
		datos();
	}

}
