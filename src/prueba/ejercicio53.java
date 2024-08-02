package prueba;

import java.util.Scanner;

public class ejercicio53 {
	static Scanner entrada = new Scanner(System.in);
	public static int [] notas = new int [5];
	public static int maximocal = 0;
	public static int minimocal = 10;
	public static int suma = 0;
	public static int divi;
	
	public static int ingresoDeDatos() {
		
		for (int i = 0; i < 5; i++) {
			
		System.out.println("Ingrese una calificacion del alumno: ");
		notas[i]  = entrada.nextInt();
		suma+=notas[i];

		}
		return divi;
	}
	
	public static int notasMaxMin() {
		for (int i = 0; i < 5; i++) {
		
	if (notas[i] > maximocal) {
            maximocal = notas[i];
		}
		if (notas[i] < minimocal) {
			minimocal = notas[i];
		}
	
	divi = suma / 5;	
	}
		return divi;
	}
    public static int mostrarDatos() {
	
	System.out.println("La nota maxima es :" + maximocal);

	System.out.println("La nota minima de luis es: " + minimocal);

	System.out.println("El promedio de las notas es: " + divi);
	return divi;
	
	}
    
    
    public static void main(String[] args) {
		ingresoDeDatos();
		System.out.println("");
		notasMaxMin();
		System.out.println("");
		mostrarDatos();
		
	}
}
