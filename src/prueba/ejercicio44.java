package prueba;

import java.util.Scanner;

public class ejercicio44 {
	
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		int [] dni = new int[4];
		
		for (int i = 0; i < dni.length; i++) {
			
			System.out.println("ingrese el numero de dni: ");
			dni[i] = dato.nextInt();
		
			
			if(dni[i] %2 == 0) {
				System.out.println(dni[i]);
				
			}
		
		
		
			
		}
		
		
	}

}
