package prueba;

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Ingrese un numero: ");
		n1 = dato.nextInt();
		
		System.out.println("Ingrese otro numero: ");
		n2 = dato.nextInt();
		
		System.out.println("Ingrese otro numero: ");
		n3 = dato.nextInt();
		
		if(n1>n2 && n2>n3) {
			System.out.println("El numero mayor es: " + n1);
			System.out.println("El numero intermedio es: " + n2);
			System.out.println("El numero mas chico es: " + n3); 
		}
		else if(n1>n3 && n3>n2) {
			System.out.println("El numero mayor es: " + n1);
			System.out.println("El numero intermedio es: " + n3);
			System.out.println("El numero mas chico es: " + n2); 
		}
		else if(n2>n1 && n1>n3) {
			System.out.println("El numero mayor es: " + n2);
			System.out.println("El numero intermedio es: " + n1);
			System.out.println("El numero mas chico es: " + n3); 
		}
		else if(n2>n3 && n3>n1) {
			System.out.println("El numero mayor es: " + n2);
			System.out.println("El numero intermedio es: " + n3);
			System.out.println("El numero mas chico es: " + n1); 
		}
		else if(n3>n1 && n1>n2) {
			System.out.println("El numero mayor es: " + n3);
			System.out.println("El numero intermedio es: " + n1);
			System.out.println("El numero mas chico es: " + n2); 
		}
		else if(n3>n2 && n2>n1) {
			System.out.println("El numero mayor es: " + n3);
			System.out.println("El numero intermedio es: " + n2);
			System.out.println("El numero mas chico es: " + n1); 
		}
			
	}

}
