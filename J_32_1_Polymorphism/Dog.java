package J_32_1_Polymorphism;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	
	public void speak() {
		System.out.println(getName() + " havlar...");
	}

	
}
