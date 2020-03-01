package J_01_17;
//Overloading ile aynı fonksiyonu(isminde) farklı parametreler ile tanımlayabilirsin 
//toplama fonksiyonu 2-3-4 parametre alan versiyonları beraberce çalışabilirler	
public class J_17_MethodOverloading {
	
	public static int toplama(int a, int b, int c) {
		return (a+b+c);
	}
	
	public static int toplama(int a, int b) {
		return (a+b);
	}
	
	public static int toplama(int a, int b, int c, int d) {
		return (a+b+c+d);
	}
	
//------------------------------------------------------------------
	
	public static void skorHesapla(String a, int b) {
		System.out.println( a + " isimli kisinin skoru :" + b);
	}
	public static void skorHesapla(int b) {
		System.out.println("isimsiz kisinin skoru :" + b);
	}
	public static void skorHesapla(String a) {
		System.out.println( a + " isimli kisinin skoru : 0" );
	}
//------------------------------------------------------------------

	public static void main(String[] args) {
		System.out.println("10+5+20 = " + toplama(10,5,20));
		System.out.println("10+5 = " +toplama(10,5));
		System.out.println("10+5+20+15 = " + toplama(10,5,15,20) );
		System.out.println();
		
		skorHesapla("Yunus",1000);
		skorHesapla("Neriman");
		skorHesapla(1000);
		
	}
	
	
}
