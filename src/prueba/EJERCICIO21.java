package prueba;

public class EJERCICIO21 {

	public static void main(String[] args) throws InterruptedException {
		
		int i = 35;
		
		while (i<=100) {
			
			i+= 2;
			
			if (i <=100) {
			System.out.println("Temperatura: "+i+"°");
			}
			Thread.sleep(20);
			
			if(i==85) {
				System.out.println("CUIDADO!! TEMPERATURA PELIGROSA!");
				Thread.sleep(1000);
			}
			
			
			
		}
	
			System.err.println("VALOR EXTREMO. APAGANDO PC.");
	
	}
}
