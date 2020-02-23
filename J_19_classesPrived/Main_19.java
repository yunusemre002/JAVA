package J_19_classesPrived;

public class Main_19 {

	public static void main(String[] args) {

	Car car1 = new Car();
	
	car1.setColor("Black");
	car1.setModel("Astra");
	car1.setEngine(1.5);
	car1.setDoors(5);
	
	System.out.println("Arabanın rengi  : " + car1.getColor());
	System.out.println("Arabanın modeli : " + car1.getModel());
	System.out.println("Arabanın motoru : " + car1.getEngine());
	System.out.println("Arabanın kapisi : " + car1.getDoors());
	car1.start();
	car1.stop();
	
	}
}
