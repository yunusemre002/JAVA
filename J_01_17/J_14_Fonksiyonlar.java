package J_01_17;
import java.util.Scanner;
/*	Erişim_Belirleyici(Opsionel) Ekstra_Özellikler Dönüş_tipi Fonksiyon_adi(Parametreler){
 *		 işlemler
 *	}
 *2 ayrı fonksiyon yazacağım ve bunları mainde çağıracağım.
 */
public class J_14_Fonksiyonlar {
	
	public static void selamlama() {
		System.out.println("Merhabalar...");
		System.out.println("Naıl gidiyor?");
		System.out.println("Eğleniyor muyuz?");
	}
	
	public static void faktoriyel() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi girin...");
		int sayi =scan.nextInt();
		int sonuc = 1;
		while(sayi>0) {
			sonuc *=sayi;
			sayi--;
		}
		System.out.println("Sonuc : " + sonuc);
	}
	
	public static void main(String[] args) {
		selamlama();
		faktoriyel();
	}
	
}
