package prueba;

import java.util.Scanner;

public class ejercicio48 {
public static void main(String[] args) {
	Scanner dato = new Scanner(System.in);
	int[] numeroDni= new  int [8];
			
	System.out.println("Ingrese un conjunto de numero de DNI: ");
	int dni = dato.nextInt();
	
	for (int i = 0; i < (numeroDni.length - 1) /* i < 4 (5-1) */; i++) {
	
		for (int j = 0; j < (numeroDni.length - i - 1) ; j++) {
		
			if (numeroDni[j] > numeroDni[j + 1]) {
				
				int temporal = numeroDni[j];
				numeroDni[j] = numeroDni[j + 1];
				numeroDni[j + 1] = temporal;
			}
			
		}
		}
	}
	
}

