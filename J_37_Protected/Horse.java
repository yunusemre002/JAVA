package J_37_Protected;

public class Horse extends Animal {

	public Horse(String name) {
		super(name);
	}
	
	public void speak() {
		System.out.println(this.name + " konuşuyor..."); //protecdet old. cin ulasabildik direkt this ile
	}
	
}
