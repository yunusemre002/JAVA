package J_01_17;
import java.util.Scanner;
/* Koşullar */
public class J_07_Kosullar {
	public static void main (String[] args) {
		
	System.out.println( "5 == 5 ? : " +  (5==5));
	System.out.println( "5 == 4 ? : " +  (5==4));
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Notunuzu giriniz : ");
	int not = scan.nextInt();
	
	if(not>40) {
		System.out.println("Tebrikler Geçtiniz...");
	}
	else {
		System.out.println("Üzgünüz kaldınız...");
	}
	
	if(not>80)
		System.out.println("Notunuz AA");
	else if(not>70)
		System.out.println("Notunuz BA");
	else if(not>60)
		System.out.println("Notunuz BB");
	else
		System.out.println("Notunuz FF");
			
	}
}
