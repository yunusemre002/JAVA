package J_37_Protected;

public class Main {
	public static void main(String[] args) {
		
		Animal anm = new Animal("Prens");
		System.out.println(anm.name); //direkt this ile ulaştım eğer private olsaydı setter getter ile ulaşırdım.
		
		Horse a = new Horse("Katir");
		System.out.println(a.name);
		a.speak();
	}
}
