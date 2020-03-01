package J_01_17;
public class J_05_AritmatikOperators {
	static public void main(String[] args) {
	
	/*Aritmatik operatorler */
		
	int x = 10;
	int	y = 4;
	
	System.out.println("10 + 4 : " + (x + y));
	System.out.println("10 - 4 : " + (x - y));
	System.out.println("10 / 4 : " + (x / y));			// iki int sonuc int:2
	System.out.println("10 / 4 : " + ((double)x / y));  // isleme girenlerden birisi double ise sonuç double:2.5
	System.out.println("10 / 4 : " + (x / (double)y));	// isleme girenlerden birisi double ise sonuc double:2.5
	System.out.println("10 / 4 : " + (double)(x / y));	// iclme iki int girdi sonuc int cikti:2 sonra bunu double a cevirdim : 2.0
	System.out.println("10 % 4 : " + (x % y));
	System.out.println("27+ 10 * 20 - 7 : " + (27+10*20-7));
	System.out.println("27 + 10 * (20 - 7) : " + (27+10*(20-7)));
	
	}
}
