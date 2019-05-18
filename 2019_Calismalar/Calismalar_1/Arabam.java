
//DEFAULT CONSTRUCTURE KULLANIMI
package Calismalar_1;

public class Arabam {
	private String plaka;
	private String Sase;
	
	
	public Arabam() {}
	
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
		opel= new Arabam();
		opel.setPlaka("34 kl 9956");  	 // eger bos bir tane constucter tanimlarsam deger atamayida boyle yapmaliyim.
		opel.setSase("9895415422");		 // setter metodu deger atamak icin vardýr zaten
		
		Arabam Mersedes;
		Mersedes = new Arabam();
		Mersedes.setPlaka("25 AL 9878"); // Set Plaka Ile verdim. Cunku default constuctur ile tanimladim.
		Mersedes.setSase("45413454543");
		
		opel.kendiniTanit();
		Mersedes.kendiniTanit();
		
	}

}

