package prueba;

import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		int hora, minuto, segundo;
		

		System.out.println("Ingrese una hora: ");
		hora = dato.nextInt();
		
		if(hora <= 23 || hora > 0) {
			System.out.println("La hora ingresada es valida. ");
		}
		else {
			System.out.println("La hora ingresada no es valida");
		}
		
		System.out.println("Ingrese minutos: ");
		minuto = dato.nextInt();
		
		if(minuto <= 59 || minuto >0) {
			System.out.println("El minuto ingresado es valido. ");
		}
		else {
			System.out.println("El minuto ingresado no es valido");
		}
		
		System.out.println("Ingrese segundos: ");
		segundo = dato.nextInt();
		
		if(segundo <=59 || segundo >0) {
			System.out.println("El segundo ingresado es valido. ");
		}
		else {
			System.out.println("El segundo ingresado no es valido ");
		}
	}
		
}


