package prueba;

import java.util.Scanner;

public class ejercicio36 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		int maximo = 0;
		int minimo = 10000;
		int suma = 0;
		
		for(int hora = 9; hora <= 17; hora++) {
			
			System.out.println("Ingrese el monto de las hs: ");
		    hora = dato.nextInt();
		    
			if (hora > maximo) {

				maximo = hora;
			}

			if (hora < minimo) {

				minimo = hora;

		}
		suma += hora;	
		
	}
		
		System.out.println("El ingreso maximo es :" + maximo);

		System.out.println("El ingreso minimo es: " + minimo);

		System.out.println("El ingreso total es: " + suma);
		
		
	}
}

