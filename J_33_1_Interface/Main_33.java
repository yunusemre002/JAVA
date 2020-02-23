package J_33_1_Interface;

class databaseManager{
	public void addDatabase(IDatabase db) {
		db.add();
	}
	
	public void updateDatabase(IDatabase db) {
		db.update();
	}
	
	public void getDatabase(IDatabase db) {
		db.get();
	}
	
	public void deleteDatabase(IDatabase db) {
		db.delete();
	}
}


public class Main_33 {
	
	public static void main(String[] args) {
		
		databaseManager manager = new databaseManager();
		
		manager.addDatabase(new Oracle());	
		manager.deleteDatabase(new Postgrsql());
		manager.updateDatabase(new Mysql());
		
		
	}
}
