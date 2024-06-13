package prueba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ejercicio47 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		int opcion;
		
		List<String> listaNombre = new ArrayList<>();
		
		listaNombre.add("Enrique");
		listaNombre.add("Liliana");
		listaNombre.add("Lucas");
		listaNombre.add("Juan");
		listaNombre.add("Fiorella");
		listaNombre.add("Ariel");
		listaNombre.add("Daiana");
		
		
		
		List<Integer> listaCodigo = new ArrayList<>();
		
		listaCodigo.add(1011);
		listaCodigo.add(2367);
		listaCodigo.add(8748);
		listaCodigo.add(9121);
		listaCodigo.add(817);
		listaCodigo.add(6423);
		listaCodigo.add(2034);

		
		System.out.println("Si quiere borrar presione 1, si quiere modificar presione 2");
		opcion = dato.nextInt();
		
		
		if(opcion == 1 ) {
			System.out.println("Ingrese el numero de socio a borrar: ");
			System.out.println(listaCodigo);
			int numeroAborrar = dato.nextInt();
			
			int posicionEnLaLista = listaCodigo.indexOf(numeroAborrar);

			listaCodigo.remove(posicionEnLaLista);
			listaNombre.remove(posicionEnLaLista);

			System.out.println("Listado de numeros de socios: " + listaCodigo);
			System.out.println("Listado de nombres de socios: " + listaNombre);
			
		}else if(opcion == 2 ) {
			System.out.println("Ingrese el numero de socio a modificar: ");
			System.out.println(listaCodigo);
			int numeroAmodificar = dato.nextInt();
			
			
			int posicionEnlaLista = listaCodigo.indexOf(numeroAmodificar);
			
			System.out.println("Ingrese el nuevo nombre: ");
			String nuevoNombre = dato.next();
			
			System.out.println("Ingrese el nuevo numero: ");
			int nuevoNumero = dato.nextInt();
			
			listaNombre.set(posicionEnlaLista, nuevoNombre );
			listaCodigo.set(posicionEnlaLista, nuevoNumero);
			
		}
		boolean encontrado = false;

		int nro_Encontrado = 0;
		String nombreEncontrado = "";
		
		System.out.println("Ingrese un socio a buscar: ");
		int codigoBuscado = dato.nextInt();
		
		for (int i = 0; i < listaNombre.size(); i++) {

			if (codigoBuscado == listaCodigo.get(i)) {
				// PARA LISTAS codigoBuscad == nro_de_socio.get(i)
				nro_Encontrado = listaCodigo.get(i);
				nombreEncontrado = listaNombre.get(i);
				encontrado = true;
				break;
			}

		}
		if (encontrado == true) {
			System.out.println("El codigo ingresado fue encontrado.");
			System.out.println("El numero de socio ingresado es: " + nro_Encontrado);
			System.out.println("El nombre es: " + nombreEncontrado);

		}



	}


}
