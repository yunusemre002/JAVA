package J_29_Inheritance_1;

public class Main_29 {

	public static void main(String[] args) {
		
		Employee empl = new Employee("Zinnure SOYUGUZEL", "Sales department", 5500);
		empl.showInfos();
		
		Manager mng = new Manager("R. Doga SIYLI", "Computer", 7500, 100);  // artık manager ekstra bir ozellige sahip
		mng.showInfos();
		mng.raiseSalary(1500);
	}
}
 