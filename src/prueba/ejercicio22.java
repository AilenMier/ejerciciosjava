package prueba;

import java.util.Scanner;

public class ejercicio22 {
 public static void main(String[] args) {
	 Scanner dato = new Scanner(System.in);
		
		String nombre, apellido;
		int numero;
		int numRandom;
	
		System.out.println("ingrese su nombre: ");
			nombre = dato.next();
			System.out.println("Ingrese su apellido: ");
			apellido = dato.next();
		
		do {
			
			System.out.println("Ingrese un numero del 0 al 99: ");
			numero = dato.nextInt();
			
	       numRandom = (int) (Math.random()*100+1);
	       
		}while(numero != numRandom); {
			
			if (numero == numRandom ) {
				System.out.println("ganaste!!");
			}
			else {
				System.out.println("perdiste.");
			}
		}
		
		
}
}
