package J_32_Polymorphism;

public class Manager extends Employee {		//"extends Employee"
	
	private int num_of_emp;
	public Manager(String name, String depname, int salary, int num_of_emp) {
		super(name, depname, salary);
		this.num_of_emp=num_of_emp;	// new attribute
	}
	
	public void raiseSalary(int amount) {
		System.out.println("Tum maaslar "+ amount + " tl arttirildi.");
	}
	
	//2. yol sag tik source/override/ select metods and finish.
	@Override
	public void showInfos() {
		super.showInfos();		// it comes from employees
		System.out.println("Number of eployees : "+ this.num_of_emp + "\n");
	}
	
	public String toString() {		//halihazırda Object sınıfının bir metodu olan tostring metodunu override ettik.
		return "Manager objesi toString fonksiyonudur...";
	}
	
}
