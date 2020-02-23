package J_32_1_Polymorphism;

public class Animal {

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("Animal speak...");
	}
	
	
}
