package prueba;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		float n1, n2;
		float suma, resta, divis, multi;
		
		System.out.println("ingrese un numero: ");
		n1 = datos.nextFloat();
		
		System.out.println("ingrese otro numero: ");
		n2  = datos.nextFloat();
		
		suma = n1 + n2;
		int sumaint = (int) suma;
		resta = n1 - n2;
		int restaint = (int) resta;
		divis = n1 / n2;
	    int divisint = (int) divis;
		multi = n1 * n2;
		int multiint = (int) multi;
		
		System.out.println("El resultado de suma es: " + suma);
		System.out.println("El resultado de suma en int es: " + sumaint);
		System.out.println("El resultado de la resta es: " + resta);
		System.out.println("El resultado de la resta en int es: " + restaint);
		System.out.println("El resultadp de la division es: "+ divis);
		System.out.println("El resultadp de la division en int es: "+ divisint);
		System.out.println("El resultado de la multiplicacion es: " + multi);
		System.out.println("El resultado de la multiplicacion en int es: " + multiint);
	}

}
