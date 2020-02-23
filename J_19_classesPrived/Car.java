package J_19_classesPrived;
/* Bu sefer fieldlarımızı private belirlerdik yani sadece bu class içinde kullanılabilecekler.
 * Eğer başka classlarda da kullanmak istiyorsak eğer bu classta oluşturulan setterve getter metodları kullanılacaktır.
 * Setter ve getter metodlarını otomatik oluşturmak için: Sağ click/source/ generate setter getter.
 */
public class Car {

	private String color;
	private String model;
	private double engine;
	private int doors;
	
	public void setColor(String color) {		//bu mevcut coloru değiştirecek. dışardan aldığıyla
		this.color = color;
	}
	public String getColor() {					// Buda mevcut olanı alacak. O kadar
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
		this.doors = doors;
	}
	
	public void start() {
		System.out.println("\nThe Car started...");
	}
	
	public void stop() {
		System.out.println("The car stop...");
		
	}
	
}
