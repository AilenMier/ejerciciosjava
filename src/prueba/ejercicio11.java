package prueba;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		int numero;
		
		System.out.println("ingrese un numero: ");
		numero = dato.nextInt();
		
		if (numero > 0) {
			
			System.out.println("El numero es positivo.");
		}
		
		else if (numero < 0) {
			
			System.out.println("El numero es negativo.");
		}
		
		else {
			
			System.out.println("El numero es cero.");
		}
	}

}
