package J_20_Encapsulation;

public class Main_20 {

	public static void main(String[] args) {

	Car car1 = new Car();
	
	car1.setColor("Black");
	car1.setModel("Astra");
	car1.setEngine(1.5);
	car1.setDoors(8);			// Bak sınırladık sadece 2 or 4 yazabilirsin.
	
	System.out.println("Arabanin rengi  : " + car1.getColor());
	System.out.println("Arabanin modeli : " + car1.getModel());
	System.out.println("Arabanin motoru : " + car1.getEngine());
	System.out.println("Arabanin kapisi : " + car1.getDoors());
	car1.start();
	car1.stop();
	
	}
}
