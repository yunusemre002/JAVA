package J_33_Interface;

public class Main_33 {
 public static void main(String[] args) {
	
	//IDatabase db = new IDatabase();  // Interfacede nobje yaratılmaz!
	 
	Customer cst = new Customer();
	Student std = new Student();
	
	cst.log();
	std.log();
	 
	// POLYMORPHİSM
	IDatabase db1 = new Customer();
	IDatabase db2 = new Student();

	db1.log();
	db2.log();
 }
}
