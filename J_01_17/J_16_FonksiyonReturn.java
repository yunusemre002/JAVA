package J_01_17;

public class J_16_FonksiyonReturn {
	// sayilari alıyor işlenmiş halini bana geri veriyor.
	
	public static int toplama(int a, int b, int c){
		return (a+b+c);
	}
	
	public static int ucIleCarp(int a) {
		return (a*3);
	}
	
	public static int ikiEkle(int a) {
		return (a+2);
	}
	
	public static int dortCikar(int a) {
		return (a-4);
	}
	
	public static void main(String[] args){
		System.out.println("1. Fonksiyondan dönen : " + toplama(5,8,3));
		System.out.println("(5)*3+2-4 :"+ dortCikar(ikiEkle(ucIleCarp(5))));
			
	}	
}
