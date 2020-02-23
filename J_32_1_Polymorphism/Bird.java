package J_32_1_Polymorphism;

public class Bird extends Animal {
	
	public Bird(String name) {
		super(name);
	}
	
	public void speak() {
		System.out.println( getName() + " oter...");
	}
}
