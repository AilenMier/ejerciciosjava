package prueba;

import java.util.Scanner;

public class ejercicio35 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		int notas;
		int maximocal = -78;
		int minimocal = 100;
		int suma = 0;
		int divi;

		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese una calificacion del alumno: ");
			notas = dato.nextInt();

			if (notas > maximocal) {

				maximocal = notas;
			}

			if (notas < minimocal) {

				minimocal = notas;

			}
			suma += notas;
			

		}
		
		divi = suma / 5;
		System.out.println("La nota maxima es :" + maximocal);

		System.out.println("La nota minima de luis es: " + minimocal);

		System.out.println("El promedio de las notas es: " + divi);
	}

}
