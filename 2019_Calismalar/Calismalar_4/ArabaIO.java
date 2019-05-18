
// Calismalar_1 DE KI UYGULAMAYI KULLANICI GIRDISI ILE ALDIK
package Calismalar_4;

import java.util.Scanner;

public class ArabaIO {
	private String plaka;
	private String Sase;
	private static Scanner in;
	
	public ArabaIO() {}
	
	public ArabaIO (String plakaNo, String saseNo) {
		plaka=plakaNo;
		Sase= saseNo;
	}
	
	public String getPlaka() {return plaka;}
	public void setPlaka(String plaka) {this.plaka=plaka;}
	public String getSase() {return Sase;}
	public void setSase(String sase) {Sase = sase;}
	
	public void kendiniTanit() {
		System.out.println("Plakam : " + getPlaka()+ "\n"+ "Sase:" + getSase()+"\n");
	}
	
	public static void main(String[] args) {

		in = new Scanner(System.in); // BASINA SCANNER KONSA GUZEL GORUNUR AMA ARIZA VERIYOR DIYE SILDIM
		
		// ONCE BOS B�R NESNE YARATTIM SONRA NESNEYE PLAKA VE SASE NO EKLED�M
		ArabaIO opel= new ArabaIO(); 
			System.out.print("Opele bir plaka giriniz : ");
			String plakaNo = in.nextLine();
			opel.setPlaka(plakaNo); 
			System.out.print("Opele bir Sase giriniz : ");
			String SaseNo = in.nextLine();
			opel.setSase(SaseNo);
		
		// �NCE PLAKA VE SASE NOLARI ALDIM SONRA B�R NESNE YARATTIM BU B�LG�LER �LE
		System.out.print("Mersedese bir plaka giriniz : ");
		plakaNo = in.nextLine();
		System.out.print("Mersedese bir Sase giriniz : ");
		SaseNo = in.nextLine();
			
			ArabaIO Mercedes = new ArabaIO( plakaNo, SaseNo );
		
		System.out.println("Opel : ");
		opel.kendiniTanit();
		System.out.println("Mercedes : ");
		Mercedes.kendiniTanit();
		
	}

}

