package J_32_Polymorphism;
/*	Polymorphism Bir referansın farklı sınıflarıda refere edebilmesidir.
 *  Mesela bir employee referansı bir manager objesini refere edebilir.
 * 
 * 
 */
public class Main_32 {

	public static void main(String[] args) {

		Employee calisan = new Employee("Recep CULHA", "Kesimhane", 5000);
		Manager mng = new Manager("Ibrahim KORKMAZ", "Computer", 7500, 100);
	
		Employee eml = new Manager("Yunus emre", "IT", 8000, 10);		//Referans Employee ama Obje Manager olabilir ve manager metodlarını kllanabilir.
		eml.showInfos();
		
	}
}
