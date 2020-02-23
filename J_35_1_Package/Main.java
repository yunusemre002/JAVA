package J_35_1_Package;

import J_35_0_Package.Student;	// BU paketi J_35_0_Package paketi içinden import etti.

/*
import java.util.ArrayList;		//java paketinin util package tinin altında arraylisti dahil ediyoruz. 
import java.util.Scanner;		//java paketinin util package tinin altında Scanner dahil ediyoruz.
import javax.swing.JFrame;		//javax paketinin swing package'tinin altında Jframe dahil ediyoruz.
*/

public class Main {
	
	public static void main(String[] args) {
	
		/* Aşağıdaki 3 fonksiyonda farklı paketlerdeler ve bunları projemize dahil / import ediyoruz.
		Scanner scan = new Scanner(System.in);
		ArrayList<String> dizi = new ArrayList<String>();
		JFrame jframe = new JFrame("Naber");
		
		*/
		
		Student std = new Student("Ali DEMIR");
		
		std.study();
		
		
	}
}
