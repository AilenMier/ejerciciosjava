package prueba;

import java.util.Scanner;

public class ejercicio32 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		int numero;
		
		System.out.println("ingrese un numero: ");
		numero = dato.nextInt();
		
		for(int i = 1; i<=20; i++) {
			
			int resultado = numero * i ;
			
			System.out.println(numero + " * " + i + " = " + resultado );

		}
	}

}
