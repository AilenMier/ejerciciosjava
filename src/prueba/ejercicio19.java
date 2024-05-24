package prueba;

import java.util.Scanner;

public class ejercicio19 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		int opciones;
		
		System.out.println("1.Cafe cortado");
		System.out.println("2.Cafe latte");
		System.out.println("3.Cafe solo");
		System.out.println("4.Cafe lagrima");
		System.out.println("5.Salir del programa.");
		System.out.println("¿Cual desea?");
		opciones = dato.nextInt();
		
		
		switch(opciones) {
		
		case 1:
			System.out.println("Cafe cortado. ");
			break;
			
		case 2:
			System.out.println("Cafe latte. ");
			break;
			
		case 3: 
			System.out.println("Cafe solo. ");
			break;
		
		case 4: 
			System.out.println("Cafe lagrima. ");
			break;
			
		case 5:
			System.out.println("Usted salio del programa.");
			break;
			
		default:
			System.err.println("No esta entre las opciones. ");
	
		}
		
		
		
	}

}
