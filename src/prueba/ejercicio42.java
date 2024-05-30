package prueba;

import java.util.Scanner;

public class ejercicio42 {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int numeroAleatorio = (int) ( Math.random() *50);
		int[] numero = new int[3];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Ingrese un numero entre 0 y 50, a ver si acertas.");
			numero[i] = dato.nextInt();
			
			if(numero[i] == numeroAleatorio) {
				System.out.println("Ganaste!!");
			}
			
			else {
				System.err.println("perdiste.");
			}
		}
		
		
		
	}
}
