package prueba;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
    	Scanner dato = new Scanner(System.in);
    	
    	char talle;
    	
    	System.out.println("Ingrese una talla S M o L: ");
		talle = dato.next().charAt(0);
		
		switch (talle) {

		case 'S':
		case 's':
			
			System.out.println("Quedan 5 remeras.");
			break;
			
		case 'M':
		case 'm':
			
			System.out.println("Quedan 2 remeras. ");
			break;
			
		case 'L':
		case 'l':
			
			System.out.println("No quedan remeras. ");
			break;
			
		default:
			
			System.err.println("No esta entre las opciones.");
		
		}
}
}
