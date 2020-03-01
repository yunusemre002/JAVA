package J_01_17;
import java.util.Scanner;

public class J_10 {
	public static void main(String[] args) {
		
		// while(kosul){
		// 		islem 1,2,3...
		// 		kosulu arttırma veya azaltma
		// }			
		
		int sayi=0;
		
		while(sayi<10) {
			System.out.println(sayi+1 + " YTU");	//islem
			sayi++;									//arttırma
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nFaktöriyel islemi icin bir sayi giriniz : ");
		int verilen = scan.nextInt();
		int faktoriyel = 1;
		System.out.print( verilen + "!: ");
		
		while(verilen>=1) {
			faktoriyel= faktoriyel*verilen;
			verilen--;
		}
		System.out.println(faktoriyel);
		
	}
}
