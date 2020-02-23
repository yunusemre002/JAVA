package J_20_Encapsulation;
/* Bir nesnenin fieldlerinin private tanımlanması Encapsulation demektir. Çünkü böylelikle Dışarıdan erişimi engellemiş
 * ve ilgili ilgili fielda uluorta erisilmenin onu tikanmis olur. Bazı kısıtlamalar  yapmak ta daha kolay hale gelir
 * bkz. Kapi fieldi
 */
public class Car {

	private String color;
	private String model;
	private double engine;
	private int doors;
	
	public void setColor(String color) {		//bu mevcut coloru deÄŸiÅŸtirecek. dÄ±ÅŸardan aldÄ±ÄŸÄ±yla
		this.color = color;
	}
	public String getColor() {					// Buda mevcut olanÄ± alacak. O kadar
		return this.color;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public void setDoors(int doors) {
		if( doors==2 || doors==4) {
			this.doors = doors;
		}else {
			System.err.println("Araba sadece 2 veya 4 kapiya sahip olabilir...");
		}
	}
	
	public void start() {
		System.out.println("\nThe Car started...");
	}
	
	public void stop() {
		System.out.println("The car stop...");
		
	}
	
}
