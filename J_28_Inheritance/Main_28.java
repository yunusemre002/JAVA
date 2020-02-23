package J_28_Inheritance;

public class Main_28 {

	public static void main(String[] args) {
		
		Employee empl = new Employee("Lale CİCEKCİ", "Sales department", 5500);
		empl.showInfos();
		
		Manager mng = new Manager("İbrahim KORKMAZ", "Computer", 7500);
		mng.showInfos();
	}
}
