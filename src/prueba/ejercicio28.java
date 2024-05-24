package prueba;

import java.util.Scanner;

public class ejercicio28 {
	public static void main(String[] args)  throws InterruptedException {
		Scanner dato = new Scanner(System.in);
		
		int  bateria = 100;
		
		while (bateria > 0) {
		bateria--;
		
	    System.out.println("Tenes " + bateria + "%");
	    Thread.sleep(20);
	    
	    if(bateria == 20) {
	    	System.err.println("BATERIA BAJA!");
	    	Thread.sleep(1000);
	   	
	    }
	    if(bateria == 0) {
	    	
	    	System.err.println("Bateria agotada.");
	    }
	    
	    
		}
	}

}
