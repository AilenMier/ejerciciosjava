package prueba;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingrese un numero: ");
		numero = dato.nextInt();
		
		if (numero != 0) {
			System.out.println("se puede realizar la division.");
		}
		else {
			System.out.println("No se puede hacer la division.");
		}
	}

}
