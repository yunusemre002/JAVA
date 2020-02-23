package J_28_Inheritance;
/* Maneger classı employee clasıını extends ediyor manager subclass
 * Employeee ise super class Super classa ait tüm özellikleri aldık
 * Inheritance yaparak hem kod yazma ameleliğinden kurtulmus oluyoruz.
 * Inheritance ile super classın ozelliklerine ayen sahip oluruz.
 */
public class Manager extends Employee {		//"extends Employee"

	public Manager(String name, String depname, int salary) {
		super(name, depname, salary);	//this yerine "super" kullanıyoruz ki super claası point etsin diye
	}
}
