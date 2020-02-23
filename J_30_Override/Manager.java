package J_30_Override;
/* OVERRIDE employeden aligim yazma isini degilde kendi yazma isimi yapmak istiyorum. So 
 * kendi showInfomu yazdim. Bunu yazmanın kolay yolu da var.
 * 
 */
public class Manager extends Employee {		//"extends Employee"
	
	private int num_of_emp;
	public Manager(String name, String depname, int salary, int num_of_emp) {
		super(name, depname, salary);
		this.num_of_emp=num_of_emp;	// new attribute
	}
	
	public void raiseSalary(int amount) {
		System.out.println("Tum maaslar "+ amount + " tl arttirildi.");
	}
	/*// 1. yol
	public void showInfo() {
		System.out.println("Name :   : " + this.getName());
		System.out.println("Department : " + this.getDepname());
		System.out.println("Salary : " + this.getSalary());
		System.out.println("Number of eployees : "+ this.num_of_emp + "\n");
	}*/

	//2. yol sag tik source/override/ select metods and finish.
	@Override
	public void showInfos() {
		super.showInfos();		// it comes from employees
		System.out.println("Number of eployees : "+ this.num_of_emp + "\n");
	}
	
	
}
