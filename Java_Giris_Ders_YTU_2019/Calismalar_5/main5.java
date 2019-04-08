package Calismalar_5;
//BURADA ARABA VE INSAN ADINDA ÝKÝ AYRI CLASS VAR INSAN CLASI ARABA CLASINDA SAHÝP OLABÝLÝR(0/1)
import java.util.Scanner;

public class main5 {
	
	public static void main(String[] args) {
	
	Scanner in= new Scanner(System.in);
	
	System.out.println("What is your name?");
	String name =in.nextLine();
	Insan pers1 = new Insan(name);
	
	System.out.print("Kiþinin arabasý var mý (e/h)");
	String secim = in.nextLine();
	if (secim.contains("e") || secim.contains("E")) {
		System.out.println("What is your PlakaNo?");
		String plakaNo =in.nextLine();
		Araba5 opel= new Araba5(plakaNo);
		
		///////////////////////////
		pers1.setAraba5(opel);/////ISTE BURASI COK ONEMLI
		///////////////////////////
	}
	System.out.println(pers1.kendiniTanit());
	in.close();
	}
}
