package prueba;

import java.util.Scanner;

public class ejercicio33 {
public static void main(String[] args) {
	Scanner dato = new Scanner(System.in);
	
	String [] nombre = new String [11];
	int []  edad = new int [11];
	
	for(int i= 0;  i<=10; i++) {
		
		System.out.println("Ingrese su nombre: ");
		nombre[i] =  dato.next();
		System.out.println("Ingrese su edad: ");
		edad[i] = dato.nextInt();
	}
	for(int i= 0;  i<=10; i++) {
		System.out.println("Mostrar todos los nombres: "+ nombre[i]);
		System.out.println("mostrar todas las edades: "+ edad[i]);
	}
	}
}
