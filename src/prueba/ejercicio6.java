package prueba;
import java.util.Scanner;
public class ejercicio6 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		float nota;
		
		System.out.println("ingrese nota de examen: ");
		nota = dato.nextFloat();
		
		int redondeo = (int) Math.round(nota);
		
		System.out.println("El redondeo de la nota del alumno es: " + redondeo);
	}

}
