package J_1_17;

import java.util.Scanner;

public class J_13_breakContinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//q karakter girilene kadar girilen herşeyi ekrana yazan program.
		while(true) {
			
			System.out.println(" BirKarakter giriniz : ");
			String krktr = scan.nextLine();
			
			if(krktr.equals("q")){
				System.out.println("Çıkış yapılıyor...");
				break;
			}
			
			System.out.println("karakter : " + krktr);
		}
		
		
		
		// 1- 10 arası 4 ve 7 yi yazmayan program
		int i=0;
		
		while(i<10) {
			if(i==4 || i==7) {
				i++;		// eğer bunu yapmazsan sonsuz döngüye girer. Çünkü i hep kalır. 
				continue;
			}
			System.out.println("i :" + i );
			i++;
		}
		
		
	}
}
