package J_30_Override;

public class Main_30 {

	public static void main(String[] args) {
		
		Employee empl = new Employee("Lale KORKMAZ°", "Sales department", 5500);
		empl.showInfos();
		
		Manager mng = new Manager("Ibrahim KORKMAZ", "Computer", 7500, 100);
		mng.showInfos();
	}
}
