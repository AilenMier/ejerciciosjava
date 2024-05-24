package prueba;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		int año;
		int mes;
		int semana; 
		int dia;
		
		System.out.println("Ingrese año: ");
		año= datos.nextInt();
		System.out.println("Ingrese mes: ");
		mes= datos.nextInt();
		System.out.println("Ingrese semana: ");
		semana= datos.nextInt();
		
		dia = año*365 + mes*30 + semana*7;
		// PERFECTO
		System.out.println("en valor en dias: " + dia);
	}

}
