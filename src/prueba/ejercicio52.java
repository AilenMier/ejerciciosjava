package prueba;

import java.util.Scanner;

public class ejercicio52 {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void analizaDescuento(float costo) {
	 
	 if (costo > 15000) {
		 float descuento = (costo)* 0.10f;
		 System.out.println("Se aplico un 10% de descuento: " + descuento);
		 float costotal = costo - descuento; 
		 System.out.println("El monto total es: "+ costotal);
		
	 }
	 else {
		 System.out.println("El costo total es : " + costo);
	 }
}
	public static float ingresarCosto ( ) {
		System.out.println("Ingrese el monto de dinero: ");
		float costoInicial = entrada.nextFloat();
		
		return costoInicial;
	
	}
	
	public static void main(String[] args) {
		
		analizaDescuento( ingresarCosto());
		
	}
}
