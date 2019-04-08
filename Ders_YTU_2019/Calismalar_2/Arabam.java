
// //NON-DEFAULT CONSTRUCTURE KULLANIMI

package Calismalar_2;

public class Arabam {
	private String plaka;
	private String Sase;
	

	public Arabam (String plakaNo, String saseNo) {
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

	//ASAGIDAKILERI BURADA YAZACAGIMIZ GÝBÝ AYRI BIR CLASS TA DA YAZABILIRIZ SORUNSUZ CALISIR.
	
	public static void main(String[] args) {
		
		Arabam opel;
		opel= new Arabam("34 kl 9956", "9895415422");
		opel.setPlaka("Plaka degisti");  // BUNU AKTÝF EDERSEM PLAKAYI DEGISTIRIR.
		
		
		Arabam Mersedes;
		Mersedes = new Arabam("25 AL 9878","45413454543");

		opel.kendiniTanit();
		Mersedes.kendiniTanit();
		
	}

}

