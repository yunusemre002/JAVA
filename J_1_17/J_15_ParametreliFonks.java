package J_1_17;

public class J_15_ParametreliFonks {

	public static void selamlama(String isim) {
		System.out.println("Merhabalar " + isim );
	}
	
	public static void toplama(int a, int b, int c) {
		System.out.println(a + "+" + b + "+" + c + "= " + (a+b+c));
	}
	
	public static void main(String[] args) {
		selamlama("Yunus");
		toplama(1,5,9);
	}
}
