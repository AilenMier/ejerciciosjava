package prueba;

import java.util.Scanner;

public class ejercicio50 {
	static Scanner entrada = new Scanner(System.in);
	static String nombre ;
	public static void ingresarNombre() {
		
		System.out.println("Ingrese su nombre: ");
		 nombre = entrada.nextLine();
	}

	public static void mostrarDatos() {
		
		System.out.println("El nombre de la persona es: " + nombre);
	}

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
		ingresarNombre();
		mostrarDatos();
	
		}
		
	}

}
