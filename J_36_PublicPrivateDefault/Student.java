package J_36_PublicPrivateDefault;
/*
* public ve private
* public bir metoda farklı class ve packege lerden erişi myapılabili ama privae bir metoda sadece ilgili classtan erişim yapılabilir.
* Default ta ise classın başına hiçnbirşey yazılmaz class Student(){...} gibi BU default manasına gelir ve ilgili paket dışında
* kullanımı mümkün değildir.İmport etseniz bile çalışmaz.
*/
class Student {	//Default

	String name;	//default
	
	public Student(String name) {
		this.name = name;
	}
	
	public void Study() {
		System.out.println("Ben" + this.name + " okuyom ben yaa...");
	}
}
