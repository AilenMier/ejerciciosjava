package prueba;
import java.util.*;
import java.util.Scanner;
public class ejercicio5 {
	public static void main(String[] args) {
		Scanner dato = new Scanner (System.in);
		int n1;
		
		System.out.println("Ingrese un numero: ");
		n1 =dato.nextInt();
		
		int raiz = (int) Math.sqrt(n1);
		System.out.println("El resultado de la raiz es: " + raiz);
	}

}
