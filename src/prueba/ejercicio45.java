package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio45 {
public static void main(String[] args) {
	Scanner dato = new Scanner(System.in);
	List<String> listaPaises = new ArrayList<>();
	
	listaPaises.add("Argentina");
	listaPaises.add("Bolivia");
	listaPaises.add("Brasil");
	listaPaises.add("Chile");
	listaPaises.add("Colombia");
	listaPaises.add("Ecuador");
	listaPaises.add("Guyana");
	listaPaises.add("Paraguay");
	listaPaises.add("Peru");
	listaPaises.add("Surinam");
	listaPaises.add("Uruguay");
	listaPaises.add("Venenzuela");
	
	System.err.println(listaPaises);
	
	System.out.println("Ingrese un Pais: " );
	String nombrePais = dato.nextLine();
	
	if(listaPaises.contains(nombrePais)) {
		System.out.println("El nombre del pais que ingreso es un pais sudamericano.");
		
	}
	else {
		System.out.println("El nombre del pais ingresado no es un pais sudamericano.");
	}
	
	
	System.out.println("La lista de paices sudamericanos son : " + listaPaises);
	
	
	
	
}
}
