package J_30_Override;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
