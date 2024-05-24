package prueba;

import java.util.Scanner;

public class ejercicio38 {
    public static void main(String[] args) {
    	Scanner dato = new Scanner(System.in);
    	
    	int maximo = 0;
    	int minimo = 100000;
    	
    	for(int hora = 9;  hora <= 19; hora+=2) {
    		
    		System.out.println("Ingrese la cantidad de clientes cada 2hs: ");
		    hora = dato.nextInt();
		    
			if (hora > maximo) {

				maximo = hora;
			}

			if (hora < minimo) {

				minimo = hora;
    	}
	}
    	
    	System.out.println("La cantidad de clientes maxima es :" + maximo);

		System.out.println("La cantidad de clientes minima es: " + minimo);
}
}
