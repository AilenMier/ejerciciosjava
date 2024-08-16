package prueba;

import java.util.Scanner;

public class ejercicio54 {

	static Scanner dato = new Scanner(System.in);
	public static int[] nro_de_socio = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };
	public static String[] nombres = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };
	public static int codigoBuscado;
	public static int nro_Encontrado;
	public static String nombreEncontrado;
	public static boolean encontrado;

	public static int ingresosDeDatos() {

		System.out.println("Para encontrar a un individuo, ingrese el numero de socio: ");
		int codigoBuscado = dato.nextInt();

		encontrado = false;
		nro_Encontrado = 0;
		nombreEncontrado = "";

		return codigoBuscado;
		//CodigoBuscado = ingresosDeDatos()
	}

	public static void busquedaDeNombre(int CodigoBuscadoEsperado) {

		for (int i = 0; i < nombres.length; i++) {

			if (CodigoBuscadoEsperado == nro_de_socio[i]) {
				// PARA LISTAS codigoBuscad == nro_de_socio.get(i)
				nro_Encontrado = nro_de_socio[i];
				nombreEncontrado = nombres[i];
				encontrado = true;
				break;
			}
			
			

		}

	}

	public static void main(String[] args) {
				
		busquedaDeNombre( ingresosDeDatos() );
		
		// Este if lo podés colocar abajo de la línea 38
		if (encontrado == true) {
			System.out.println("El codigo ingresado fue encontrado.");
			System.out.println("El numero de socio ingresado es: " + nro_Encontrado);
			System.out.println("El nombre es: " + nombreEncontrado);

		}
	}

}
