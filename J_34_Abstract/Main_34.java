package J_34_Abstract;

public class Main_34 {
	
	public static void main(String[] args) {
		
		// İt cant create an object of abstract but it can be a pointer
		 AbstarctDatabase abs1 = new MongoDb();
		 AbstarctDatabase abs2 = new PostgreSql();
		 
		 abs1.add();
		 abs2.add();
		 
		 abs1.delete();
		 abs2.delete();

		 abs1.update();
		 abs2.update();
		 
		 abs1.get();
		 abs2.get();
		
		
		
		
	}
}
