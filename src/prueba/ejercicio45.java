package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio45 {
public static void main(String[] args) {
	Scanner dato = new Scanner(System.in);
	List<String> listaPaices = new ArrayList<>();
	
	listaPaices.add("Argentina");
	listaPaices.add("Bolivia");
	listaPaices.add("Brasil");
	listaPaices.add("Chile");
	listaPaices.add("Colombia");
	listaPaices.add("Ecuador");
	listaPaices.add("Guyana");
	listaPaices.add("Paraguay");
	listaPaices.add("Peru");
	listaPaices.add("Surinam");
	listaPaices.add("Uruguay");
	listaPaices.add("Venenzuela");
	
	
	
	System.out.println("Ingrese un Pais: " );
	String nombrePais = dato.nextLine();
	
	if(listaPaices.contains(nombrePais)) {
		System.out.println("El nombre del pais que ingreso es un pais sudamericano.");
		
	}
	else {
		System.out.println("El nombre del pais ingresado no es un pais sudamericano.");
	}
	
	
	System.out.println("La lista de paices sudamericanos son : " + listaPaices);
	
	
	
	
}
}
