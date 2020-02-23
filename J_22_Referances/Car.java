package J_22_Referances;

public class Car {
	
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	public Car() {
	}
	
	public Car(String color, String model) {
		this(color, model, 0, 0);
	}
	
	public Car(String color, String model, double engine, int doors) {
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
	
	public void showInfos() {
		System.out.println("Arabanin rengi  : " + this.color);
		System.out.println("Arabanin modeli : " + this.model);
		System.out.println("Arabanin motoru : " + this.engine);
		System.out.println("Arabanin kapisi : " + this.doors + "\n");
		
	}
	
}

