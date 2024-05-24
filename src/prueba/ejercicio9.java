package prueba;
import java.util.Scanner;
public class ejercicio9 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
	String nombre, apellido;
		int numero;
		System.out.println("ingrese su nombre: ");
		nombre = dato.next();
		System.out.println("Ingrese su apellido: ");
		apellido = dato.next();
		
		
       int numRandom = (int) (Math.random()*100+1);
		
		
		System.out.println("su numero es: "+numRandom);
	}

}
