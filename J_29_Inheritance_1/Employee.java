package J_29_Inheritance_1;

public class Employee {

	private String name;
	private String depname;
	private int salary;
	
	public Employee(String name, String depname, int salary) {
		this.name = name;
		this.depname = depname;
		this.salary = salary;
	}
	
	public void showInfos() {
			System.out.println("Name :   : " + this.name);
			System.out.println("Department : " + this.depname);
			System.out.println("Salary : " + this.salary + "\n");
	}
	
}
