package prueba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio59 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
	try {
		System.out.println("Ingrese su edad: ");
		int edad = dato.nextInt();
		
		if(edad<=0) {
			throw new ArithmeticException();
		}
	    }catch (ArithmeticException e) { 
            System.out.println("Error:numero negativo.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un dato valido.");
        } finally {
        	System.out.println("Programa finalizado.");
        }
        }
	
	
		
	}

	
	

