package prueba;

import java.util.Scanner;

public class ejercicio58 {

	static Scanner dato = new Scanner(System.in);
	static String nombre, apellido, nomRestate, apeRestante;
	static char primeraLetraNombre, primeraLetraApellido;

	public static void ingresoDatos() {
	System.out.println("Ingrese nombre:");
	nombre = dato.next();

	System.out.println("Ingrese apellido:");
	apellido = dato.next();
	}

	public static void pasarAMinuscula() {
	nombre.toLowerCase();
	apellido.toLowerCase();
	}

	public static void primeraLetra() {
	primeraLetraNombre = nombre.toUpperCase().charAt(0);
	primeraLetraApellido = apellido.toUpperCase().charAt(0);
	}

	public static void nomApeRestante() {
	nomRestate = nombre.substring(1);
	apeRestante = apellido.substring(1);
	}

	public static void mostrarDatos() {
	System.out.println("Su nombre es: " + primeraLetraNombre + nomRestate);
	System.out.println("Su apellido es: " + primeraLetraApellido + apeRestante);
	}

	public static void controlarNombre() {
	ingresoDatos();
	pasarAMinuscula();
	primeraLetra();
	nomApeRestante();
	mostrarDatos();
	}

	public static void main(String[] args) {
	controlarNombre();
	}

}
