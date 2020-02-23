package J_1_17;

import java.util.Locale;
import java.util.Scanner;

public class J_4 {
	
	
	static public void main(String[] args) {
	
	/* INPUT ALMA	*/
	//ctrl + shift + O olmayan paketi ekler
	//syso yazıp ctrl + space System.out.println(); yazar.
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Bir sayi giriniz...");
	int a3 = scan.nextInt();
	System.out.println("Girilen sayi: " + a3);
	
	scan.useLocale(Locale.US);
	System.out.println("Bir ondalikli sayi giriniz...");
	double b3 = scan.nextDouble();
	scan.nextLine();  					// Consume newline left-over -  Bundan sonra string alacağım için bunu yazmak önemli Not aşağıda [1]
	System.out.println("Ondalikli sayi: " + b3);
	
	System.out.println("Adınız?");
	String str3 = scan.nextLine();        //!!![2] Eğer [1] numaralı satır yazılmazsa buraya -  String str3 = scan.next(); yazarak sorunu çözebiliriz  
	System.out.println("Adınız: " + str3);
	
	/*Not:integer den sonra string almada sıkıntı yaşanıyor bu sıkıntıyı çözmenin iki yolu var 
	  	  integer alfıktan sonra entere basarız ve bu enter \n karakteridir aslında eğer bir sonraki satırda 
	  	  bir string scan i varsa bu \n karakterini alır ve işleme devam eder. Yani bir int scani olan yerden sonra 
	  	  string scani varsa ona benim karakter girmem engellenmiş olur. Bunuen ol
			[1]  \n karakterini yiyecek bir -- scan.nextLine(); --  satırı eklemek
			[2]	Veya String str3 = scan.nextLine();   yerine  String str3 = scan.next(); yazmak.
	*/
	
	
	}
}
