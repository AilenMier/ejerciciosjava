package prueba;
import java.util.Scanner;
public class ejercicio12 {
      public static void main(String[] args) {
    	  Scanner dato = new Scanner(System.in);
    	  
    	  int numero;
    	  
    	  System.out.println("Ingrese un numero del 1 al 10: ");
    	  numero = dato.nextInt();
    	  
    	  if (numero > 1 && numero <= 3) {
    		 System.out.println("Insufuciente.");
    	  }
    	  else if (numero> 3 && numero < 6) {
    		  System.out.println("No logrado.");
    	  }
    	  else if (numero > 6 && numero <= 7) {
    		  System.out.println("Suficiente.");
    	  }
    	  else if (numero >8 && numero >= 9 ) {
    		  System.out.println("Notable.");
    	  }
    	  else if (numero == 10 ) {
    		  System.out.println("Sobresaliente.");
    	  }
    	  else {
    		  System.out.println("Valor incorrecto.");
    	  }
}
}
