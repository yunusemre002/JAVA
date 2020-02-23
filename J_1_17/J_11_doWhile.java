package J_1_17;

import java.util.Scanner;

public class J_11_doWhile {

	public static void main(String[] args) {
		int n=10;
		
		do {
			System.out.println("n :" + n);
			n--;
	
		}while(n>0);
		
		//Verilen sayının basamakları toplamaını bulan programı yazınız.
		// Örn: sayi =1234 ise sonuç=1+2+3+4=10 gibi
		Scanner scan = new Scanner(System.in);
		
		System.out.println("sayi giriniz : ");
		int sayi = scan.nextInt();
		int sonuc = 0;
		
		do {
			sonuc += sayi % 10;
			sayi = sayi/10;
			System.out.println("sayi : " + sayi +"/ sonuc : " + sonuc);
		}while(sayi>0);
		
		System.out.println("Sonuc : " + sonuc);
		
		
	}
}
