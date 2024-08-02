package prueba;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repasoexamen {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		 
		// Crear la lista
		List<Integer> listaDni = new ArrayList<>();
		
		// Definir cuantos DNI se van a ingresar (cuantos elementos tendra la lista)
		System.out.println("Cuantos DNI ingresara?");
		int cantElementos = dato.nextInt();
		
		for(int i=0; i < cantElementos; i++) {
			
			System.out.println("Ingrese un numero de DNI: ");
			int numeroDNI = dato.nextInt();
			listaDni.add(numeroDNI);
		
		}
		
		List<String> listaApellido = new ArrayList<>();
		
		for(int i=0; i < cantElementos ; i++) {
			
			System.out.println("Ingrese los apellidos: ");
			String apellidos =dato.next();
			listaApellido.add(apellidos);
			
		}
		
		for(int i=0; i< (listaDni.size() -1); i++) {
			
			for(int j=0; j<(listaDni.size() -i -1);  j++) {
				
				if(listaDni.get(j) > listaDni.get(j+1)) {
					int temporalDni = listaDni.get(j);
					
					int segundoDni = listaDni.get(j+1);
					
					listaDni.set(j, segundoDni);
					listaDni.set(j+1,temporalDni);
					
					String temporalApellido = listaApellido.get(j+1);
					
					String segundoApellido = listaApellido.get(j);
					
					
					listaApellido.set(j, segundoApellido);
				    listaApellido.set(j+1, temporalApellido);
				}	
			}
		}
		System.out.println("lista de DNI ordenada: ");
				for(int i =0; i<listaDni.size(); i++) {
				System.out.println("El DNI "+ (i +1)+ "es "+ listaDni.get(i) + "pertenece a: "+ listaApellido.get(i));	
		}
		
		
 		

		
		
	}

}
