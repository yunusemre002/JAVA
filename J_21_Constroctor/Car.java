package J_21_Constroctor;
/*Construtor yapıcı metod
 * 		Public olmalı
 * 		Class name ile aynı name e sahip olmalı. Yani Car
 * 		Class yazısı yok bak dikkatli ol!
 */


public class Car {

	private String color;
	private String model;
	private double engine;
	private int doors;

	// 3 tane constructer tanımlayabilirim bunların üçününde ismi aynı bunaOverloading diyoruz.
	
	//public Car() {}

	/*public Car() {
		this.color = "No info";
		this.model = "No info";
		this.engine= 0;
		this.doors=0;
	}*/
	
	// Bu usttekinin daha kisa yazimi asagidaki gibidir. Kendine ait diğer constructureyi cagirir :) 
	public Car() {
		this("No info", "No info", 0, 0); // Burada aşağıdaki 4 parametreli kendi constructuremi çağırdim.
	}
	
	// 2 parametreli Constructure buda 4 parametre alanı kullandı. 
	public Car(String color, String model) {
		this(color, model, 0, 0); 	//Kendine gelen iki bilgiyi color ve model 
									//ona gönderdi diğer bilgileriise 0 olark gönderdi.
	}
	
	public Car(String color, String model, double engine, int doors){
		this.color = color;
		this.model = model;
		this.engine = engine;
		this.doors = doors;
	}
		
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
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
	
	public void showInfo() {
		System.out.println("Arabanin rengi  : " + this.color);
		System.out.println("Arabanin modeli : " + this.model);
		System.out.println("Arabanin motoru : " + this.engine);
		System.out.println("Arabanin kapisi : " + this.doors + "\n");
		
	}
	
	
}
