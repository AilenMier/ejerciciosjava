package prueba;
import java.util.Scanner;
public class ejercicio7 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Que calificacion tendras este año en la asignatura Lab.de algoritmo y estructura de datos?");
		
		double numRandom = Math.random()*10;
		
		
		System.out.println("La calificacion que tendras en el año es: " + numRandom);
	}

}
