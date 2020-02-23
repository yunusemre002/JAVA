package J_29_Inheritance_1;
/* Burada Manager claasımız exstra bir ozellge daha sahip oda calsan sayisi.
 * Bu ozelligide constructerin icine koyuyoruz.
 * 
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
}
