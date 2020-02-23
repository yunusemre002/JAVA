package J_18_ClassesPublic;

public class Main_18 {

	public static void main(String[] args) {
		/* Car car1 = //bu referas oluşturmak demektir
		 * new Car(); // Yeni bir obje oluşturmak istiyorum. Car() türünden
		 */
		
		Car car1 = new Car();
		
		car1.color="Blue";
		car1.model="Megane";
		car1.engine=1.6;
		car1.doors=4;
		
		System.out.println("Arabanın rengi  : " + car1.color);
		System.out.println("Arabanın modeli : " + car1.model);
		System.out.println("Arabanın motoru : " + car1.engine);
		System.out.println("Arabanın kapisi : " + car1.doors);
		
	}
	
}
