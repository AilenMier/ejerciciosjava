package prueba;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ejercicio44nuevo {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		List<String> listaJugadores = new ArrayList<>();

		System.out.println("Ingrese un equipo de futbol:");
		String ingreso = dato.nextLine();

		while (!ingreso.equalsIgnoreCase("fin")) { // En strings NO se puede esto: ingreso == "fin"
			listaJugadores.add(ingreso); // add me permite agregar elementos a la lista
			ingreso = dato.nextLine();
		}

		//HashSet es una lista que eliminar duplicados
		HashSet<String> set = new HashSet<>(listaJugadores);

		listaJugadores.clear();

		listaJugadores.addAll(set);

		System.out.println("Lista sin duplicados: " + listaJugadores);

	}
}
