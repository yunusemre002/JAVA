package J_01_17;
import java.util.Scanner;

public class J_09_SwitchCase {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("1 ile 4 arasi bir sayi giriniz...");
		int sayi = scan.nextInt();
		
		switch(sayi) {
			case 1: 
				System.out.println("bir");
				break;
			case 2:
				System.out.println("iki");
				break;
			case 3:
				System.out.println("üç");
				break;
			case 4:
				System.out.println("dört");
				break;
			default:
				System.out.println("Geçersiz bir say girdiniz..");
				break; // demesende olur.
		}
		*/
		
		int miktar= 1000;
		int para =0;
		System.out.println("1. Bakiye görüntüleme.");
		System.out.println("2. Para yatırma.");
		System.out.println("3. Para çekme");
		System.out.println("4. Sistemden çıkış");
		
		System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
		int islem = scan.nextInt();
		
		
		switch(islem) {
			case 1:
				System.out.println("Bakiyeniz : " + miktar);
				break;
			case 2:
				System.out.println("Gireceğiniz para mikrarını yaziniz");
				para = scan.nextInt();
				System.out.println("Eski Bakiyeniz :"+ miktar + " tl'dir." );
				miktar +=para;
				System.out.println("Para yatırma işleminiz Başarıyla yapilmistir \nYeni bakiyeniz :"+ miktar + " tl'dir." );
				break;
			case 3:
				System.out.println("Cekmek istediginiz para mikrarını yaziniz");
				para = scan.nextInt();
				if(para<miktar) {
					miktar -=para;
					System.out.println("Para çekme işleminiz Başarıyla yapilmistir. \n Kalan bakiyeniz :"+ miktar + " tl'dir." );
				}else {
					System.out.println("Girdiğiniz miktar bakiyeden küçük lütfen tekrar giriniz..");
				}
					break;
			case 4:
				System.out.println(" Sistemden çıkış yapılıyor. Iyi günler dileriz...");
				break;
			default:
				System.out.println("Yanlis bir seçim yaptiniz...");
				break;
		}
		
		
	}
}
