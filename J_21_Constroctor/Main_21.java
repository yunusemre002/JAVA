package J_21_Constroctor;

public class Main_21 {

	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car("Blue", "Focus", 1.9, 3);
		Car car3 = new Car("Red", "qashqai");
		
		car1.showInfo();
		car2.showInfo();
		car3.showInfo();
		
	}
}
